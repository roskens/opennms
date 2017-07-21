/*global bootbox:true */

/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

(function() {

  'use strict';

  angular.module('onms-sched-outages')

  /**
  * @ngdoc controller
  * @name SchedOutagesController
  * @module onms-sched-outages
  *
  * @description The controller to manage all the scheduled outages (create/remove/update/delete/list)
  *
  * @requires $scope Angular local scope
  * @requires $filter Angular filter
  * @requires $window Document window
  * @requires $uibModal Angular UI modal
  * @required Configuration The configuration object
  * @requires SchedOutagesService The scheduled outages service
  * @requires SynchronizeService The synchronize service
  * @requires growl The growl plugin for instant notifications
  */
  .controller('SchedOutagesController', ['$scope', '$filter', '$window', '$uibModal', '$log', 'Configuration', 'SchedOutagesService', 'SynchronizeService', 'growl', function($scope, $filter, $window, $uibModal, $log, Configuration, SchedOutagesService, SynchronizeService, growl) {

    /**
    * @description The timing status.
    *
    * @ngdoc property
    * @name SchedOutagesController#timingStatus
    * @propertyOf SchedOutagesController
    * @returns {object} The timing status object
    */
    $scope.timingStatus = SchedOutagesService.getTiming();

    /**
    * @description The load flag.
    *
    * @ngdoc property
    * @name SchedOutagesController#loaded
    * @propertyOf SchedOutagesController
    * @returns {boolean} True, if the scheduled outages have been loaded.
    */
    $scope.loaded = false;

    /**
    * @description The scheduled outages data
    *
    * @ngdoc property
    * @name SchedOutagesController#scheduleData
    * @propertyOf SchedOutagesController
    * @returns {object} The scheduled outages data
    */
    $scope.scheduleData = { schedules: [] };

    /**
    * @description The filtered version of the scheduled outages list
    *
    * @ngdoc property
    * @name SchedOutagesController#filteredSchedules
    * @propertyOf SchedOutagesController
    * @returns {array} The filtered array
    */
    $scope.filteredSchedules = [];

    /**
    * @description The amount of items per page for pagination (defaults to 10)
    *
    * @ngdoc property
    * @name SchedOutagesController#pageSize
    * @propertyOf SchedOutagesController
    * @returns {integer} The page size
    */
    $scope.pageSize = 10;

    /**
    * @description The maximum size of pages for pagination (defaults to 5)
    *
    * @ngdoc property
    * @name SchedOutagesControllers#maxSize
    * @propertyOf SchedOutagesController
    * @returns {integer} The maximum size
    */
    $scope.maxSize = 5;

    /**
    * @description The total amount of items for pagination (defaults to 0)
    *
    * @ngdoc property
    * @name SchedOutagesControllers#maxSize
    * @propertyOf SchedOutagesController
    * @returns {integer} The total items
    */
    $scope.totalItems = 0;

    /**
    * @description Shows an error to the user
    *
    * @name SchedOutagesController:errorHandler
    * @ngdoc method
    * @methodOf SchedOutagesController
    * @param {string} message The error message
    */
    $scope.errorHandler = function(message) {
      growl.error(message, {ttl: 10000});
    };

    /**
    * @description Adds a new scheduled outage on the server.
    *
    * A dialog box will be displayed to request the name of the scheduled outage from the user.
    *
    * @name SchedOutagesController:add
    * @ngdoc method
    * @methodOf SchedOutagesController
    */
    $scope.add = function() {
      bootbox.prompt('Please enter the name for the new scheduled outages', function(outageName) {
        if (outageName) {
          // Validate Requisition
          if (outageName.match(/[\/\\?:&*'"]/)) {
            bootbox.alert('Cannot add the scheduled outage ' + outageName + ' because the following characters are invalid:<br/>:, /, \\, ?, &, *, \', "');
            return;
          }
          var r = $scope.scheduleData.getSchedOutage(outageName);
          if (r !== null) {
            bootbox.alert('Cannot add the scheduled outage ' + outageName+ ' because there is already a scheduled with that name');
            return;
          }
          // Create Scheduled Outage
          SchedOutagesService.addSchedOutage(outageName).then(
            function(r) { // success
              growl.success('The scheduled outage ' + r.outageName + ' has been created.');
            },
            $scope.errorHandler
          );
        }
      });
    };

    /**
    * @description Goes to the edit page of an existing scheduled outage (navigation)
    *
    * @name SchedOutagesController:edit
    * @ngdoc method
    * @methodOf SchedOutagesController
    * @param {string} outageName The name of the requisition
    */
    $scope.edit = function(outageName) {
      $window.location.href = Configuration.baseHref + '#/schedules/' + encodeURIComponent(outageName);
    };

    /**
    * @description Removes a scheduled outage on the server
    *
    * @name SchedOutagesController:delete
    * @ngdoc method
    * @methodOf SchedOutagesController
    * @param {string} outageName The name of the scheduled outage
    */
    $scope.delete = function(outageName) {
      bootbox.confirm('Are you sure you want to remove the scheduled outage ' + outageName + '?', function(ok) {
        if (ok) {
          SchedOutagesService.startTiming();
          SchedOutagesService.deleteSchedOutage(outageName).then(
            function() { // success
              growl.success('The scheduled outage ' + outageName + ' has been deleted.');
            },
            $scope.errorHandler
          );
        }
      });
    };

    /**
    * @description Refreshes the scheduled outages from the server
    *
    * There are two main actions:
    * - Retrieve all the scheduled outages from the server ignoring the current state.
    * - Retrieve only the deployed statistics, and update the current scheduled outages.
    *
    * @name SchedOutagesController:refreshData
    * @ngdoc method
    * @methodOf SchedOutagesController
    */
    $scope.refreshData = function() {
      bootbox.dialog({
        message: 'Are you sure you want to refresh the content of the page ?<br/><hr/>' +
                 'Choose <b>Reload Everything</b> to retrieve all the scheduled outages from the server (any existing unsaved change will be lost).<br/>' +
                 'Choose <b>Reload Deployed Data</b> to retrieve the deployed statistics and update the UI.<br/>' +
                 'Choose <b>Cancel</b> to abort the request.',
        title: 'Refresh',
        buttons: {
          reloadAll: {
            label: 'Reload Everything',
            className: 'btn-primary',
            callback: function() {
              $scope.refreshSchedules();
            }
          },
          reloadDeployed: {
            label: 'Reload Deployed Data',
            className: 'btn-default',
            callback: function() {
              $scope.refreshDeployedStats();
            }
          },
          main: {
            label: 'Cancel',
            className: 'btn-default'
          }
        }
      });
    };

    /**
    * @description Refreshes the deployed statistics for all the scheduled outages from the server
    *
    * @name SchedOutagesController:refreshDeployedStats
    * @ngdoc method
    * @methodOf SchedOutagesController
    */
    $scope.refreshDeployedStats = function() {
      SchedOutagesService.startTiming();
      growl.success('Refreshing deployed statistics...');
      SchedOutagesService.updateDeployedStats($scope.scheduleData).then(
        function() { // success
          growl.success('The deployed statistics has been updated.');
        },
        $scope.errorHandler
      );
    };

    /**
    * @description Refreshes all the scheduled outages from the server
    *
    * @name SchedOutagesController:refreshRequisitions
    * @ngdoc method
    * @methodOf SchedOutagesController
    */
    $scope.refreshSchedules = function() {
      bootbox.confirm('Are you sure you want to reload all the scheduled outages?<br/>All current changes will be lost.', function(ok) {
        if (ok) {
          SchedOutagesService.startTiming();
          growl.success('Refreshing requisitions...');
          SchedOutagesService.clearCache();
          $scope.scheduleData = { schedules : [] };
          $scope.initialize();
        }
      });
    };

   /**
    * @description Updates the pagination variables for the scheduled outages.
    *
    * @name SchedOutagesController:updateFilteredSchedules
    * @ngdoc method
    * @methodOf SchedOutagesController
    */
    $scope.updateFilteredSchedules = function() {
      $scope.currentPage = 1;
      $scope.totalItems = $scope.filteredSchedules.length;
      $scope.numPages = Math.ceil($scope.totalItems / $scope.pageSize);
    };

    /**
    * @description Initializes the local requisitions list from the server
    *
    * @name SchedOutagesController:initialize
    * @ngdoc method
    * @methodOf SchedOutagesController
    */
    $scope.initialize = function() {
      $scope.loaded = false;
      $log.debug('initialize(): Calling SchedOutagesService.getSchedules()');
      SchedOutagesService.getSchedules().then(
        function(data) { // success
          $log.debug('initialize(): data:', data);
          $scope.scheduleData = data;
          $scope.filteredSchedules = $scope.scheduleData.schedules;
          $scope.updateFilteredSchedules();
          $scope.loaded = true;
          growl.success('Loaded ' + $scope.scheduleData.schedules.length + ' schedules...');
        },
        $scope.errorHandler
      );
    };

    /**
    * @description Watch for filter changes in order to update the requisitions list and updates the pagination control
    *
    * @name SchedOutagesController:soFilter
    * @ngdoc event
    * @methodOf SchedOutagesController
    */
    $scope.$watch('soFilter', function() {
      $log.debug('schedules:', $scope.scheduleData);
      $scope.filteredSchedules = $filter('filter')($scope.scheduleData.schedules, $scope.soFilter);
      $scope.updateFilteredSchedules();
    });

    // Initialization

    if ($scope.filteredSchedules.length === 0) {
      $scope.initialize();
    }

  }]);

}());
