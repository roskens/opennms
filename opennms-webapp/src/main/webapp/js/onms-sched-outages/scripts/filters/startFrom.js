/**
* @author Alejandro Galue <agalue@opennms.org>
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2014 The OpenNMS Group, Inc.
*/

(function() {

  'use strict';

  angular.module('onms-sched-outages')

  /**
  * @ngdoc filter
  * @name startFrom
  * @module onms-sched-outages
  *
  * @description A filter for paginated content
  *
  * @param {array} input The source array to filter
  * @param {integer} start The position index to start from
  *
  * @returns {array} the filtered array
  */
  .filter('startFrom', function() {
    return function(input, start) {
      start = +start; // convert it to integer
      if (input) {
        return input.length < start ? input : input.slice(start);
      }
      return [];
    };
  });

}());
