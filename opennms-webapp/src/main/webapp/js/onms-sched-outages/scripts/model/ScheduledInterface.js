/*jshint unused:false, sub:true */

/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

/**
* @ngdoc object
* @name ScheduledInterface
* @module onms-sched-outages
* @param {Object} intf an OpenNMS interface JSON object
* @constructor
*/
function ScheduledInterface(intf) {
  'use strict';

  var self = this;

  /**
   * @description The IP Address of the interface
   * @ngdoc property
   * @name ScheduledInterface#ipAddress
   * @propertyOf ScheduledInterface
   * @returns {string} The IP Address of the interface
   */
  self.ipAddress = intf['address'];

  self.className = 'ScheduledInterface';

  return self;
}
