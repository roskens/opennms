/*global RequisitionNode:true */
/*jshint unused: false */

/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2014 The OpenNMS Group, Inc.
*/

/**
* @ngdoc object
* @name SchedOutage
* @module onms-sched-outages
* @param {object} schedOutage an OpenNMS requisition JSON object
* @param {boolean} isDeployed true if the requisition has been deployed
* @constructor
*/
function SchedOutage(schedOutage, isDeployed) {

  'use strict';

  var self = this;

  /**
   * @description The deployed flag
   * @ngdoc property
   * @name Requisition#deployed
   * @propertyOf Requisition
   * @returns {boolean} true, if the requisition has been deployed
   */
  self.deployed = isDeployed;

  /**
   * @description The modified flag
   * @ngdoc property
   * @name Requisition#modified
   * @propertyOf Requisition
   * @returns {boolean} true, if the requisition has been modified
   */
  self.modified = false;

  /**
   * @description The name of the requisition (the foreign source)
   * @ngdoc property
   * @name Requisition#foreignSource
   * @propertyOf Requisition
   * @returns {string} the foreign source
   */
  self.name = schedOutage['name'];

  /**
   * @description The last modication date of the requisition
   * @ngdoc property
   * @name Requisition#dateStamp
   * @propertyOf Requisition
   * @returns {string} the last modification date
   */
  self.type = schedOutage['type'];

  /**
   * @description The configured nodes array
   * @ngdoc property
   * @name Requisition#nodes
   * @propertyOf Requisition
   * @returns {array} The nodes array
   */
  self.times = [];

  angular.forEach(schedOutage.time, function(sTime) {
    var scheduledTime = new ScheduledTime(self.name, sTime, isDeployed);
    self.times.push(scheduledTime);
  });

  /**
   * @description The configured nodes array
   * @ngdoc property
   * @name Requisition#nodes
   * @propertyOf Requisition
   * @returns {array} The nodes array
   */
  self.nodes = [];

  angular.forEach(schedOutage.node, function(node) {
    var scheduledNode = new ScheduledNode(self.name, node, isDeployed);
    self.nodes.push(scheduledNode);
  });

  /**
   * @description The configured nodes array
   * @ngdoc property
   * @name Requisition#nodes
   * @propertyOf Requisition
   * @returns {array} The nodes array
   */
  self.interfaces = [];

  angular.forEach(schedOutage.interface, function(intf) {
    var scheduledInterface = new ScheduledInterface(self.name, intf, isDeployed);
    self.interfaces.push(scheduledInterface);
  });

  /**
  * @description Checks if the requisition has been changed
  *
  * @name Requisition:isModified
  * @ngdoc method
  * @methodOf Requisition
  * @returns {boolean} true if the requisition has been changed or modified.
  */
  self.isModified = function() {
    if (self.modified) {
      return true;
    }
    return ! self.deployed;
  };

  /**
  * @description Gets the array possition for a particular node
  *
  * @name Requisition:indexOf
  * @ngdoc method
  * @param {string} foreignId The foreign ID of the node
  * @methodOf Requisition
  * @returns {integer} the index (-1 if the foreign ID doesn't exist)
  */
  self.indexOf = function(foreignId) {
    for(var i = 0; i < self.nodes.length; i++) {
      if (self.nodes[i].foreignId === foreignId) {
        return i;
      }
    }
    return -1;
  };

  /**
  * @description Gets a specific node object.
  *
  * @name Requisition:getNode
  * @ngdoc method
  * @param {string} foreignId The foreign ID of the node
  * @methodOf Requisition
  * @returns {object} the node object.
  */
  self.getNode = function(foreignId) {
    var idx = self.indexOf(foreignId);
    return idx < 0 ? null : self.nodes[idx];
  };

  /**
  * @description Adds or replaces a node object.
  *
  * @name Requisition:setNode
  * @ngdoc method
  * @param {object} node The RequisitionNode object
  * @methodOf Requisition
  */
  self.setNode = function(node) {
    var idx = self.indexOf(node.foreignId);
    if (idx < 0) {
      self.nodes.push(node);
      self.nodesDefined++;
    } else {
      self.nodes[idx] = node;
    }
    self.modified = true;
    self.type = Date.now();
  };

  /**
  * @description Marks the requisition as deployed
  *
  * @name Requisition:setDeployed
  * @ngdoc method
  * @param {boolean} deployed true, if the requisition has been deployed
  * @methodOf Requisition
  */
  self.setDeployed = function(deployed) {
    self.deployed = deployed;
    self.modified = false;
    angular.forEach(self.times, function(sTime) {
      sTime.deployed = deployed;
      sTime.modified = false;
    });
    angular.forEach(self.nodes, function(node) {
      node.deployed = deployed;
      node.modified = false;
    });
    angular.forEach(self.intefaces, function(iface) {
      iface.deployed = deployed;
      iface.modified = false;
    });
  };

  /**
  * @description Resets the content of the requisition
  *
  * @name Requisition:reset
  * @ngdoc method
  * @methodOf Requisition
  */
  self.reset = function() {
    self.times = [];
    self.nodes = [];
    self.interfaces = [];
    self.modified = true;
    self.type = undefined;
  };

  self.className = 'SchedOutage';

  return self;
}
