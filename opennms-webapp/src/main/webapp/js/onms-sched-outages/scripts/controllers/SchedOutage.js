/*global SchedOutage:true, bootbox:true */

/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

(function() {

  'use strict';

  angular.module('onms-sched-outages')

  /**
  * @ngdoc controller
  * @name SchedOutageController
  * @module onms-sched-outages
  *
  * @description The controller to manage a single scheduled outage (add/edit)
  *
  * @requires $scope Angular local scope
  * @requires $filter Angular filter
  * @requires $cookies Angular cookies
  * @requires $window Document window
  * @requires $routeParams Angular route parameters
  * @required Configuration The configuration object
  * @requires SchedOutagesService The scheduled outages service
  * @requires SynchronizeService The synchronize service
  * @requires growl The growl plugin for instant notifications
  */
  .controller('SchedOutageController', ['$scope', '$filter', '$cookies', '$window', '$routeParams', 'Configuration', 'SchedOutagesService', 'SynchronizeService', 'growl', function($scope, $filter, $cookies, $window, $routeParams, Configuration, SchedOutagesService, SynchronizeService, growl) {

    /**
    * @description The timing status.
    *
    * @ngdoc property
    * @name SchedOutageController#timingStatus
    * @propertyOf SchedOutageController
    * @returns {object} The timing status object
    */
    $scope.timingStatus = SchedOutagesService.getTiming();

    /**
    * @description The scheduled outage object
    *
    * @ngdoc property
    * @name SchedOutageController#schedOutage
    * @propertyOf SchedOutageController
    * @returns {object} The schedOutage object
    */
    $scope.schedOutage = new SchedOutage({});

    /**
    * @description The list of nodes
    *
    * @ngdoc property
    * @name SchedOutageController#nodes
    * @propertyOf SchedOutageController
    * @returns {array} An array of nodes
    */
    $scope.nodes = [];

    /**
    * @description The list of interfaces
    *
    * @ngdoc property
    * @name SchedOutageController#interfaces
    * @propertyOf SchedOutageController
    * @returns {array} An array of interfaces
    */
    $scope.interfaces = [];

    /**
    * @description The type of interfaces
    *
    * @ngdoc property
    * @name SchedOutageController#interfaces
    * @propertyOf SchedOutageController
    * @returns {array} An array of interfaces
    */
    $scope.type = [];

    /**
    * @description The amount of items per page for pagination (defaults to 10)
    *
    * @ngdoc property
    * @name SchedOutageController#pageSize
    * @propertyOf SchedOutageController
    * @returns {integer} The page size
    */
    $scope.pageSize = 10;

    /**
    * @description The maximum size of pages for pagination (defaults to 5)
    *
    * @ngdoc property
    * @name SchedOutageController#maxSize
    * @propertyOf SchedOutageController
    * @returns {integer} The maximum size
    */
    $scope.maxSize = 5;

    /**
    * @description The total amount of items for pagination (defaults to 0)
    *
    * @ngdoc property
    * @name SchedOutageController#totalItems
    * @propertyOf SchedOutageController
    * @returns {integer} The total items
    */
    $scope.totalItems = 0;

    /**
    * @description Goes back to requisitions list (navigation)
    *
    * @name SchedOutageController:goBack
    * @ngdoc method
    * @methodOf SchedOutageController
    */
    // FIXME Should be called getTop to be consistent with the rest of the controllers
    $scope.goBack = function() {
      $window.location.href = Configuration.baseHref + '#/requisitions';
    };

    /**
    * @description Goes to the edition page for the foreign source definition of the requisition (navigation)
    *
    * @name SchedOutageController:editForeignSource
    * @ngdoc method
    * @methodOf SchedOutageController
    */
    $scope.editForeignSource = function() {
      $window.location.href = Configuration.baseHref + '#/requisitions/' + encodeURIComponent($scope.foreignSource) + '/foreignSource';
    };

    /**
    * @description Shows an error to the user
    *
    * @name SchedOutageController:errorHandler
    * @ngdoc method
    * @methodOf SchedOutageController
    * @param {string} message The error message
    */
    $scope.errorHandler = function(message) {
      growl.error(message, {ttl: 10000});
    };

    /**
    * @description Requests the synchronization/import of a requisition on the server
    *
    * A dialog box is displayed to request to the user if the scan phase should be triggered or not.
    *
    * @name SchedOutageController:synchronize
    * @ngdoc method
    * @methodOf SchedOutageController
    */
    $scope.synchronize = function() {
      SynchronizeService.synchronize($scope.schedOutage, $scope.errorHandler);
    };

    /**
    * @description Returns the vertical layout suffix for nodes if enabled
    *
    * @name SchedOutageController:getVerticalLayout
    * @ngdoc method
    * @methodOf SchedOutageController
    * @returns {string} URL suffix for vertical layout if enabled.
    */
    $scope.getVerticalLayout = function() {
      var isVertical = $cookies.get('use_requisitions_node_vertical_layout');
      return isVertical == 'true' ? '/vertical' : '';
    };

    /**
    * @description Goes to the page for adding a new node to the requisition (navigation)
    *
    * @name SchedOutageController:addNode
    * @ngdoc method
    * @methodOf SchedOutageController
    */
    $scope.addNode = function() {
      $window.location.href = Configuration.baseHref + '#/requisitions/' + encodeURIComponent($scope.foreignSource) + '/nodes/__new__' + $scope.getVerticalLayout();
    };

    /**
    * @description Goes to the page for editing an existing node of the requisition (navigation)
    * @description
    *
    * @name SchedOutageController:editNode
    * @ngdoc method
    * @methodOf SchedOutageController
    * @param {object} The node's object to edit
    */
    $scope.editNode = function(node) {
      $window.location.href = Configuration.baseHref + '#/requisitions/' + encodeURIComponent($scope.foreignSource) + '/nodes/' + encodeURIComponent(node.foreignId) + $scope.getVerticalLayout();
    };

    /**
    * @description Deletes a node from the requisition on the server and refresh the local nodes list
    *
    * @name SchedOutageController:deleteNode
    * @ngdoc method
    * @methodOf SchedOutageController
    * @param {object} The node's object to delete
    */
    $scope.deleteNode = function(node) {
      bootbox.confirm('Are you sure you want to remove the node ' + node.nodeLabel + '?', function(ok) {
        if (ok) {
          SchedOutagesService.startTiming();
          SchedOutagesService.deleteNode(node).then(
            function() { // success
              var index = -1;
              for(var i = 0; i < $scope.filteredNodes.length; i++) {
                if ($scope.filteredNodes[i].foreignId === node.foreignId) {
                  index = i;
                }
              }
              if (index > -1) {
                $scope.filteredNodes.splice(index,1);
              }
              growl.success('The node ' + node.nodeLabel + ' has been deleted.');
            },
            $scope.errorHandler
          );
        }
      });
    };

   /**
    * @description Updates the pagination variables for the nodes.
    *
    * @name SchedOutageController:updateFilteredNodes
    * @ngdoc method
    * @methodOf SchedOutageController
    */
    $scope.updateFilteredNodes = function() {
      $scope.currentPage = 1;
      $scope.totalItems = $scope.filteredNodes.length;
      $scope.numPages = Math.ceil($scope.totalItems / $scope.pageSize);
    };

    /**
    * @description Refreshes the deployed statistics for the requisition from the server
    *
    * @name SchedOutageController:refreshDeployedStats
    * @ngdoc method
    * @methodOf SchedOutageController
    */
    $scope.refreshDeployedStats = function() {
      SchedOutagesService.startTiming();
      SchedOutagesService.updateDeployedStatsForRequisition($scope.schedOutage).then(
        function() { // success
          growl.success('The deployed statistics has been updated.');
        },
        $scope.errorHandler
      );
    };

    /**
    * @description Refreshes the currently loaded requisition from the server
    *
    * @name SchedOutageController:refreshRequisition
    * @ngdoc method
    * @methodOf SchedOutageController
    */
    $scope.refreshRequisition = function() {
      bootbox.confirm('Are you sure you want to reload the requisition?<br/>All current changes will be lost.', function(ok) {
        if (ok) {
          SchedOutagesService.startTiming();
          $scope.schedOutage = new Requisition({});
          SchedOutagesService.removeRequisitionFromCache();
          $scope.initialize(function() {
            $scope.refreshDeployedStats();
          });
        }
      });
    };

    /**
    * @description Initializes the local requisition from the server
    *
    * @name SchedOutageController:initialize
    * @ngdoc method
    * @methodOf SchedOutageController
    * @param {function} customHandler An optional method to be called after the initialization is done.
    */
    $scope.initialize = function(customHandler) {
      growl.success('Retrieving requisition ' + $scope.foreignSource + '...');
      SchedOutagesService.getRequisition($scope.foreignSource).then(
        function(requisition) { // success
          $scope.schedOutage = requisition;
          $scope.filteredNodes = requisition.nodes;
          $scope.updateFilteredNodes();
          if (customHandler != null) {
            customHandler();
          }
        },
        $scope.errorHandler
      );
    };

    /**
    * @description Watch for filter changes in order to update the nodes list and updates the pagination control
    *
    * @name SchedOutageController:soFilter
    * @ngdoc event
    * @methodOf SchedOutageController
    */
    $scope.$watch('soFilter', function() {
      $scope.filteredNodes = $filter('filter')($scope.schedOutage.nodes, $scope.soFilter);
      $scope.updateFilteredNodes();
    });

    // Initialization

    if ($scope.foreignSource) {
      $scope.initialize();
    }

  }]);

}());
