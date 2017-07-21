/*global RequisitionInterface:true */
/*jshint unused:false, sub:true */

/**
* @author Ronald Roskens <roskens@opennms.org>
* @copyright 2017 The OpenNMS Group, Inc.
*/

/**
* @ngdoc object
* @name RequisitionNode
* @module onms-requisitions
* @param {string} scheduleName the name of the foreign source (a.k.a. provisioning group)
* @param {Object} node an OpenNMS node JSON object
* @param {boolean} isDeployed true if the node has been deployed
* @constructor
*/
function ScheduledNode(scheduleName, node, isDeployed) {

  'use strict';

  var self = this;

  // Internal function for initialization purposes
  var isEmpty = function(str) {
    return (str === null || str === undefined || 0 === str.length);
  };

  /**
   * @description the foreign source
   * @ngdoc property
   * @name RequisitionNode#foreignSource
   * @propertyOf RequisitionNode
   * @returns {string} the foreign source
   */
  self.scheduleName = scheduleName;

  /**
   * @description The deployed flag
   * @ngdoc property
   * @name RequisitionNode#deployed
   * @propertyOf RequisitionNode
   * @returns {boolean} true, if the node has been deployed
   */
  self.deployed = isDeployed;

  /**
   * @description The modified flag
   * @ngdoc property
   * @name RequisitionNode#modified
   * @propertyOf RequisitionNode
   * @returns {boolean} true, if the node has been modified
   */
  self.modified = false;

  /**
   * @description The foreign Id
   * @ngdoc property
   * @name RequisitionNode#foreignId
   * @propertyOf RequisitionNode
   * @returns {string} The foreign Id
   */
  self.nodeId = node['id'];

  /**
  * @description Check if the node has been changed
  *
  * @name RequisitionNode:isModified
  * @ngdoc method
  * @methodOf RequisitionNode
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
  * @name RequisitionNode:getOnmsRequisitionNode
  * @ngdoc method
  * @methodOf RequisitionNode
  * @returns {object} the requisition Object
  */
  self.getOnmsScheduledNode = function() {
    var nodeObject = {
      'id': self.nodeId
    };

    return nodeObject;
  };

  self.className = 'ScheduledNode';

  return self;
}
