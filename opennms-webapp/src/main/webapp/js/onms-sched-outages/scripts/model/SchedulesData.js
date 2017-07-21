/*jshint unused: false */

/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

/**
* @ngdoc object
* @name SchedulesData
* @module onms-sched-outages
* @constructor
*/
function SchedulesData() {

  'use strict';

  var self = this;

  /**
   * @description The configured scheduled outages.
   * @ngdoc property
   * @name SchedulesData#schedules
   * @propertyOf SchedulesData
   * @returns {array} The schedules array
   */
  self.schedules = [];

  /**
  * @description Gets the array possition for a particular node
  *
  * @name SchedulesData:indexOf
  * @ngdoc method
  * @param {string} scheduleName The name of the scheduled outage
  * @methodOf SchedulesData
  * @returns {integer} the index (-1 if the scheduled outage doesn't exist)
  */
  self.indexOf = function(scheduleName) {
    for(var i = 0; i < self.schedules.length; i++) {
      if (self.schedules[i].scheduleName === scheduleName) {
        return i;
      }
    }
    return -1;
  };

  /**
  * @description Gets the schedule object for a given scheduled outage name.
  *
  * @name SchedulesData:getSchedOutage
  * @ngdoc method
  * @param {string} scheduleName The name of the scheduled outage
  * @methodOf SchedulesData
  * @returns {object} the scheduled outage object.
  */
  self.getSchedOutage = function(scheduleName) {
    var idx = self.indexOf(scheduleName);
    return idx < 0 ? null : self.schedules[idx];
  };

  /**
  * @description Adds or replaces a requisition object.
  *
  * @name SchedulesData:setRequisition
  * @ngdoc method
  * @param {object} schedOutage The Requisition object
  * @methodOf SchedulesData
  */
  self.setSchedOutage = function(schedOutage) {
    var idx = self.indexOf(schedOutage.outageName);
    if (idx < 0) {
      self.schedules.push(schedOutage);
    } else {
      self.schedules[idx] = schedOutage;
    }
  };

  self.className = 'SchedulesData';

  return self;
}
