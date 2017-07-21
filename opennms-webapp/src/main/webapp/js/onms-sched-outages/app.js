/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

(function() {

  'use strict';

  angular.module('onms-sched-outages', [
    'ngRoute',
    'ngCookies',
    'ngAnimate',
    'ui.bootstrap',
    'angular-growl',
    'angular-loading-bar'
  ])

  .constant("Configuration", {
    'baseHref': 'admin/sched-outages.jsp'
  })

  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
    .when('/schedules', {
      templateUrl: 'js/onms-sched-outages/views/sched-outages.html',
      controller: 'SchedOutagesController'
    })
    .otherwise({
      redirectTo: '/schedules'
    });
  }])

  .config(['growlProvider', function(growlProvider) {
    growlProvider.globalTimeToLive(3000);
    growlProvider.globalPosition('bottom-center');
  }])

  .config(['$uibTooltipProvider', function($uibTooltipProvider) {
    $uibTooltipProvider.setTriggers({
      'mouseenter': 'mouseleave'
    });
    $uibTooltipProvider.options({
      'placement': 'left',
      'trigger': 'mouseenter'
    });
  }]);

}());
