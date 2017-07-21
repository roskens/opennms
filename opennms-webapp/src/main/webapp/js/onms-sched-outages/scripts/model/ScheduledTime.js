/*jshint unused:false, sub:true */

/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

/**
* @ngdoc object
* @name ScheduledTime
* @module onms-sched-outages
* @param {string} scheduleName the name of the scheduled outage.
* @param {Object} node an OpenNMS node JSON object
* @param {boolean} isDeployed true if the node has been deployed
* @constructor
*/
function ScheduledTime(scheduleName, node, isDeployed) {

  'use strict';

  var self = this;

  // Internal function for initialization purposes
  var isEmpty = function(str) {
    return (str === null || str === undefined || 0 === str.length);
  };

  /**
   * @description the foreign source
   * @ngdoc property
   * @name ScheduledTime#foreignSource
   * @propertyOf ScheduledTime
   * @returns {string} the foreign source
   */
  self.scheduleName = scheduleName;

  /**
   * @description The deployed flag
   * @ngdoc property
   * @name ScheduledTime#deployed
   * @propertyOf ScheduledTime
   * @returns {boolean} true, if the node has been deployed
   */
  self.deployed = isDeployed;

  /**
   * @description The modified flag
   * @ngdoc property
   * @name ScheduledTime#modified
   * @propertyOf ScheduledTime
   * @returns {boolean} true, if the node has been modified
   */
  self.modified = false;

  /**
   * @description The time the schedule begins
   * @ngdoc property
   * @name ScheduledTime#begins
   * @propertyOf ScheduledTime
   * @returns {string} The time the schedule begins
   */
  self.begins = node['begins'];

  /**
   * @description The time the schedule ends
   * @ngdoc property
   * @name ScheduledTime#ends
   * @propertyOf ScheduledTime
   * @returns {string} the time the schedule ends
   */
  self.ends = node['ends'];

  /**
   * @description The day of the week this scheduled time repeats on.
   * @ngdoc property
   * @name ScheduledTime#day
   * @propertyOf ScheduledTime
   * @returns {string} The day
   */
  self.day = node['day'];

  /**
  * @description Check if the node has been changed
  *
  * @name ScheduledTime:isModified
  * @ngdoc method
  * @methodOf ScheduledTime
  * @returns {boolean} true if the node has been changed or modified.
  */
  self.isModified = function() {
    if (self.modified) {
      return true;
    }
    return ! self.deployed;
  };

  /**
  * @description Gets the OpenNMS representation of the requisitioned node
  *
  * @name ScheduledTime:getOnmsScheduledTime
  * @ngdoc method
  * @methodOf ScheduledTime
  * @returns {object} the requisition Object
  */
  self.getOnmsScheduledTime = function() {
    var timeObject = {
      'begins': self.begins,
      'ends': self.ends,
      'day': self.day
    };

    return timeObject;
  };

  self.className = 'ScheduledTime';

  return self;
}
