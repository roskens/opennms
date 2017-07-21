/*global SchedulesData:true, SchedOutage:true, SchedOutageNode:true */

/**
* @author Alejandro Galue <agalue@opennms.org>
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

// http://jsfiddle.net/zMjVp/

(function() {

  'use strict';

  angular.module('onms-sched-outages')

  /**
  * @ngdoc service
  * @name SchedOutagesService
  * @module onms-sched-outages
  *
  * @requires $q Angular promise/deferred implementation
  * @requires $cacheFactory Angular cache management
  * @requires $window Document window
  * @requires $http Angular service that facilitates communication with the remote HTTP servers
  * @requires $timeout Angular service that facilitates timeout functions
  * @requires $log Angular log facility
  *
  * @description The SchedOutagesService provides all the required methods to access ReST API for the OpenNMS scheduled outages.
  *
  * It uses Angular's Cache service to store localy all the scheduled outages after retrieving them from the server the first time.
  * This helps in terms of performance and responsiveness of the UI. Only changes are pushed back to the server.
  *
  * Conflicts may accour if someone else is changing the scheduled outages at the same time.
  *
  * If the cache is not going to be used, the controllers are responsible for maintaining the state of the data.
  */
  .factory('PollerdService', ['$q', '$cacheFactory', '$window', '$http', '$timeout', '$log', function($q, $cacheFactory, $window, $http, $timeout, $log) {

    $log.debug('Initializing PollerdService');

    var pollerdService = {};
    pollerdService.internal = {};
    // Cache Configuration

    pollerdService.internal.cacheEnabled = true;
    pollerdService.internal.cache = $cacheFactory('SchedOutagesService');

    // URLs

    pollerdService.internal.schedOutagesUrl = 'rest/sched-outages';
    pollerdService.internal.nodeInOutageUrl = 'rest/sched-outages/nodeInOutage';
    pollerdService.internal.interfaceInOutageUrl = 'rest/sched-outages/interfaceInOutage';
    pollerdService.internal.errorHelp = ' Check the OpenNMS logs for more details, or try again later.';

    // Timeouts

    pollerdService.internal.defaultTimeout = 3; // Time to wait in seconds
    pollerdService.internal.timingStatus = { isRunning: false };
    
    /**
    * @description (Internal) Gets the data from the internal cache
    *
    * @private
    * @name SchedOutagesService:internal.getCatchedConfigData
    * @ngdoc method
    * @methodOf SchedOutagesService
    * @param {string} configName The name of the config object
    * @returns {object} the internal cache content
    */
    pollerdService.internal.getCatchedConfigData = function(configName) {
      return pollerdService.internal.cache.get(configName);
    };

    /**
    * @description (Internal) Saves the data into internal cache
    *
    * @private
    * @name SchedOutagesService:internal.setCatchedConfigData
    * @ngdoc method
    * @methodOf SchedOutagesService
    * @param {string} configName The name of the config object
    * @param {object} configObject The config object
    */
    pollerdService.internal.setCatchedConfigData = function(configName, configObject) {
      if (pollerdService.internal.cacheEnabled) {
        pollerdService.internal.cache.put(configName, configObject);
      }
    };

    /**
    * @description (Internal) Gets the packages data from the internal cache
    *
    * @private
    * @name SchedOutagesService:internal.getCachedPackagesData
    * @ngdoc method
    * @methodOf SchedOutagesService
    * @returns {object} the internal cache content
    */
    pollerdService.internal.getCachedPackagesData = function() {
      return pollerdService.internal.getCatchedConfigData('packagesData');
    };

    /**
    * @description (Internal) Saves the packages data into internal cache
    *
    * @private
    * @name SchedOutagesService:internal.setCachedPackagesData
    * @ngdoc method
    * @methodOf SchedOutagesService
    * @param {object} schedulesData The requisitions data
    */
    pollerdService.internal.setCachedPackagesData = function(packagesData) {
      return pollerdService.internal.setCatchedConfigData('packagesData', packagesData);
    };

    /**
    * @description Clears all the internal cache.
    *
    * This forces the service to retrieve the data from the server on next request.
    *
    * @name SchedOutagesService:internal.clearCache
    * @ngdoc method
    * @methodOf SchedOutagesService
    */
    pollerdService.clearCache = function() {
      $log.debug('clearCache: removing everything from the internal cache');
      pollerdService.internal.cache.removeAll();
    };

    /**
    * @description Gets the timing status object
    * The reason for using this is because of NMS-7872.
    *
    * @name SchedOutagesService:startTiming
    * @ngdoc method
    * @methodOf SchedOutagesService
    * @param {integer} ts The timeout in seconds (optional)
    * @returns {object} the timing status object
    */
    pollerdService.startTiming = function(ts) {
      if (ts === null || ts === undefined) {
        ts = pollerdService.internal.defaultTimeout;
      }
      $log.debug('startTiming: starting timeout of ' + ts + ' seconds.');
      pollerdService.internal.timingStatus.isRunning = true;
      $timeout(function() {
        pollerdService.internal.timingStatus.isRunning = false;
      }, ts * 1000);
    };

    /**
    * @description Gets the timing status object
    *
    * @name SchedOutagesService:getTiming
    * @ngdoc method
    * @methodOf SchedOutagesService
    * @returns {object} the timing status object
    */
    pollerdService.getTiming = function() {
      return pollerdService.internal.timingStatus;
    };

    /**
    * @description Requests all the scheduled outages (pending and deployed) from OpenNMS.
    *
    * If the data exists on the cache, that will be used instead of retrieving the data
    * from the OpenNMS server.
    *
    * After retrieving the scheduled outages, the deployed statistics will be retrieved, and the
    * statistics of the scheduled outages will be updated. Then, the data will be saved on the
    * internal cache.
    *
    * @name SchedOutagesService:getSchedules
    * @ngdoc method
    * @methodOf SchedOutagesService
    * @returns {object} a promise. On success, it provides a SchedulesData object.
    */
    pollerdService.getPollerdPackages = function() {
      var deferred = $q.defer();
      $log.debug('getPollerdPackages: start');

      var packagesData = pollerdService.internal.getCachedPackagesData();
      if (packagesData != null) {
        $log.debug('getPollerdPackages: returning a cached copy of the packages data');
        deferred.resolve(packagesData);
        return deferred.promise;
      }

      var url = pollerdService.internal.pollerdUrl;
      $log.debug('getPollerdPackages: retrieving packages from: ' + url);
      $http.get(url)
      .success(function(data) {
        $log.debug('getSchedules: data:', data);
        var schedulesData = new SchedulesData();
        angular.forEach(data['outage'], function(onmsSchedOutage) {
          var schedOutage = new SchedOutage(onmsSchedOutage, false);
          $log.debug('getSchedules: adding scheduled outage ' + schedOutage.name + '.');
          schedulesData.schedules.push(schedOutage);
        });
        schedOutagesService.internal.setCachedSchedulesData(schedulesData);
        deferred.resolve(schedulesData);
      })
      .error(function(error, status) {
        $log.error('getSchedules: GET ' + url + ' failed:', error, status);
        deferred.reject('Cannot retrieve the requisitions.' + schedOutagesService.internal.errorHelp);
      });

      return deferred.promise;
    };

  }]);
}());
