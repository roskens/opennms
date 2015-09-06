/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2015 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2015 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

/**
 * This class was original generated with Castor, but is no longer.
 */
package org.opennms.netmgt.config.thresholding;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Class Basethresholddef.
 *
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public abstract class Basethresholddef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An optional flag to tell the threshold processor to evaluate
     * the expression even if there are unknown values.
     *  This can be useful when processing expressions with
     * conditionals. Default: false
     *
     */
    @XmlAttribute(name="relaxed")
    private Boolean _relaxed;
    private static final Boolean DEFAULT_RELAXED = false;

    /**
     * An optional description for the threshold, to help identify
     * what is their purpose.
     *
     */
    @XmlAttribute(name="description")
    private java.lang.String _description;

    /**
     * Threshold type. "high" to trigger if the value exceeds the
     * threshold,
     *  "low" to trigger if the value drops below the threshold,
     *  "relativeChange" to trigger if the value changes more than
     * the proportion represented by the threshold, or
     *  "absoluteChange" to trigger if the value changes by more
     * than the threshold value
     *
     */
    @XmlAttribute(name="type", required = true)
    private java.lang.String _type;

    /**
     * RRD datasource type. "node" indicates a node level
     * datasource.
     *  "if" indicates an interface level datasource.
     *
     */
    @XmlAttribute(name="ds-type", required = true)
    private java.lang.String _dsType;

    /**
     * Threshold value. If the datasource value rises above this
     *  value, in the case of a "high" threshold, or drops below
     * this
     *  value, in the case of a "low" threshold the threshold is
     *  considered to have been exceeded and the exceeded count
     * will
     *  be incremented. Any time that the datasource value drops
     * below
     *  this value, in the case of a "high" threshold, or rises
     * above
     *  this value, in the case of a "low" threshold the exceeded
     *  count is reset back to zero. Whenever the exceeded count
     *  reaches the trigger value then a threshold event is
     * generated.
     *
     */
    @XmlAttribute(name="value", required = true)
    private Double _value;

    /**
     * Rearm value. Identifies the value that the datasource must
     *  fall below, in the case of a "high" threshold or rise
     * above,
     *  in the case of a "low" threshold, before the threshold will
     *  rearm, and once again be eligible to generate an event.
     *
     */
    @XmlAttribute(name="rearm", required = true)
    private Double _rearm;

    /**
     * Trigger value. Identifies the number of consecutive polls
     * that
     *  the datasource value must exceed the defined threshold
     * value
     *  before a threshold event is generated.
     *
     */
    @XmlAttribute(name="trigger", required = true)
    private Integer _trigger;

    /**
     * Value to retrieve from strings.properties to label this
     *  datasource.
     *
     */
    @XmlAttribute(name="ds-label")
    private java.lang.String _dsLabel;

    /**
     * The UEI to send when this threshold is triggered. If not
     *  specified, defaults to standard threshold UEIs
     *
     */
    @XmlAttribute(name="triggeredUEI")
    private java.lang.String _triggeredUEI;

    /**
     * The UEI to send when this threshold is re-armed. If not
     *  specified, defaults to standard threshold UEIs
     *
     */
    @XmlAttribute(name="rearmedUEI")
    private java.lang.String _rearmedUEI;

    /**
     * The operator to be used when applying filters. The
     *  default is "or". If you want to match all filters,
     *  you should specify "and";
     *
     */
    @XmlAttribute(name="filterOperator")
    private java.lang.String _filterOperator;
    private static final String DEFAULT_FILTEROPERATOR = "or";

    /**
     * The filter used to select the ds by a string
     */
    @XmlElement(name="resource-filter")
    private java.util.List<org.opennms.netmgt.config.thresholding.ResourceFilter> _resourceFilterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Basethresholddef() {
        super();
        this._resourceFilterList = new java.util.ArrayList<org.opennms.netmgt.config.thresholding.ResourceFilter>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vResourceFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceFilter(
            final org.opennms.netmgt.config.thresholding.ResourceFilter vResourceFilter)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceFilterList.add(vResourceFilter);
    }

    /**
     *
     *
     * @param index
     * @param vResourceFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceFilter(
            final int index,
            final org.opennms.netmgt.config.thresholding.ResourceFilter vResourceFilter)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceFilterList.add(index, vResourceFilter);
    }

    /**
     */
    public void deleteRearm(
    ) {
        this._rearm = null;
    }

    /**
     */
    public void deleteRelaxed(
    ) {
        this._relaxed = null;
    }

    /**
     */
    public void deleteTrigger(
    ) {
        this._trigger = null;
    }

    /**
     */
    public void deleteValue(
    ) {
        this._value = null;
    }

    /**
     * Method enumerateResourceFilter.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.thresholding.ResourceFilter> enumerateResourceFilter(
    ) {
        return java.util.Collections.enumeration(this._resourceFilterList);
    }

    /**
     * Overrides the java.lang.Object.equals method.
     *
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final java.lang.Object obj) {
        if ( this == obj )
            return true;

        if (obj instanceof Basethresholddef) {

            Basethresholddef temp = (Basethresholddef)obj;
            if (this._relaxed != null) {
                if (temp._relaxed == null) return false;
                else if (!(this._relaxed.equals(temp._relaxed)))
                    return false;
            }
            else if (temp._relaxed != null)
                return false;
            if (this._description != null) {
                if (temp._description == null) return false;
                else if (!(this._description.equals(temp._description)))
                    return false;
            }
            else if (temp._description != null)
                return false;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type)))
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._dsType != null) {
                if (temp._dsType == null) return false;
                else if (!(this._dsType.equals(temp._dsType)))
                    return false;
            }
            else if (temp._dsType != null)
                return false;
            if (this._value != null) {
                if (temp._value == null) return false;
                else if (!(this._value.equals(temp._value)))
                    return false;
            }
            else if (temp._value != null)
                return false;
            if (this._rearm != null) {
                if (temp._rearm == null) return false;
                else if (!(this._rearm.equals(temp._rearm)))
                    return false;
            }
            else if (temp._rearm != null)
                return false;
            if (this._trigger != null) {
                if (temp._trigger == null) return false;
                else if (!(this._trigger.equals(temp._trigger)))
                    return false;
            }
            else if (temp._trigger != null)
                return false;
            if (this._dsLabel != null) {
                if (temp._dsLabel == null) return false;
                else if (!(this._dsLabel.equals(temp._dsLabel)))
                    return false;
            }
            else if (temp._dsLabel != null)
                return false;
            if (this._triggeredUEI != null) {
                if (temp._triggeredUEI == null) return false;
                else if (!(this._triggeredUEI.equals(temp._triggeredUEI)))
                    return false;
            }
            else if (temp._triggeredUEI != null)
                return false;
            if (this._rearmedUEI != null) {
                if (temp._rearmedUEI == null) return false;
                else if (!(this._rearmedUEI.equals(temp._rearmedUEI)))
                    return false;
            }
            else if (temp._rearmedUEI != null)
                return false;
            if (this._filterOperator != null) {
                if (temp._filterOperator == null) return false;
                else if (!(this._filterOperator.equals(temp._filterOperator)))
                    return false;
            }
            else if (temp._filterOperator != null)
                return false;
            if (this._resourceFilterList != null) {
                if (temp._resourceFilterList == null) return false;
                else if (!(this._resourceFilterList.equals(temp._resourceFilterList)))
                    return false;
            }
            else if (temp._resourceFilterList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: An optional
     * description for the threshold, to help identify what is
     * their purpose.
     *
     *
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'dsLabel'. The field 'dsLabel'
     * has the following description: Value to retrieve from
     * strings.properties to label this
     *  datasource.
     *
     *
     * @return the value of field 'DsLabel'.
     */
    public java.lang.String getDsLabel(
    ) {
        return this._dsLabel;
    }

    /**
     * Returns the value of field 'dsType'. The field 'dsType' has
     * the following description: RRD datasource type. "node"
     * indicates a node level datasource.
     *  "if" indicates an interface level datasource.
     *
     *
     * @return the value of field 'DsType'.
     */
    public java.lang.String getDsType(
    ) {
        return this._dsType;
    }

    /**
     * Returns the value of field 'filterOperator'. The field
     * 'filterOperator' has the following description: The operator
     * to be used when applying filters. The
     *  default is "or". If you want to match all filters,
     *  you should specify "and";
     *
     *
     * @return the value of field 'FilterOperator'.
     */
    public java.lang.String getFilterOperator(
    ) {
        return this._filterOperator == null ? DEFAULT_FILTEROPERATOR : this._filterOperator;
    }

    /**
     * Returns the value of field 'rearm'. The field 'rearm' has
     * the following description: Rearm value. Identifies the value
     * that the datasource must
     *  fall below, in the case of a "high" threshold or rise
     * above,
     *  in the case of a "low" threshold, before the threshold will
     *  rearm, and once again be eligible to generate an event.
     *
     *
     * @return the value of field 'Rearm'.
     */
    public Double getRearm(
    ) {
        return this._rearm;
    }

    /**
     * Returns the value of field 'rearmedUEI'. The field
     * 'rearmedUEI' has the following description: The UEI to send
     * when this threshold is re-armed. If not
     *  specified, defaults to standard threshold UEIs
     *
     *
     * @return the value of field 'RearmedUEI'.
     */
    public java.lang.String getRearmedUEI(
    ) {
        return this._rearmedUEI;
    }

    /**
     * Returns the value of field 'relaxed'. The field 'relaxed'
     * has the following description: An optional flag to tell the
     * threshold processor to evaluate the expression even if there
     * are unknown values.
     *  This can be useful when processing expressions with
     * conditionals. Default: false
     *
     *
     * @return the value of field 'Relaxed'.
     */
    public Boolean getRelaxed(
    ) {
        return this._relaxed == null ? DEFAULT_RELAXED : this._relaxed;
    }

    /**
     * Method getResourceFilter.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.thresholding.ResourceFilter at the
     * given index
     */
    public org.opennms.netmgt.config.thresholding.ResourceFilter getResourceFilter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceFilterList.size()) {
            throw new IndexOutOfBoundsException("getResourceFilter: Index value '" + index + "' not in range [0.." + (this._resourceFilterList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.thresholding.ResourceFilter) _resourceFilterList.get(index);
    }

    /**
     * Method getResourceFilter.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.thresholding.ResourceFilter[] getResourceFilter(
    ) {
        org.opennms.netmgt.config.thresholding.ResourceFilter[] array = new org.opennms.netmgt.config.thresholding.ResourceFilter[0];
        return (org.opennms.netmgt.config.thresholding.ResourceFilter[]) this._resourceFilterList.toArray(array);
    }

    /**
     * Method getResourceFilterCollection.Returns a reference to
     * '_resourceFilterList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.thresholding.ResourceFilter> getResourceFilterCollection(
    ) {
        return this._resourceFilterList;
    }

    /**
     * Method getResourceFilterCount.
     *
     * @return the size of this collection
     */
    public Integer getResourceFilterCount(
    ) {
        return this._resourceFilterList.size();
    }

    /**
     * Returns the value of field 'trigger'. The field 'trigger'
     * has the following description: Trigger value. Identifies the
     * number of consecutive polls that
     *  the datasource value must exceed the defined threshold
     * value
     *  before a threshold event is generated.
     *
     *
     * @return the value of field 'Trigger'.
     */
    public Integer getTrigger(
    ) {
        return this._trigger;
    }

    /**
     * Returns the value of field 'triggeredUEI'. The field
     * 'triggeredUEI' has the following description: The UEI to
     * send when this threshold is triggered. If not
     *  specified, defaults to standard threshold UEIs
     *
     *
     * @return the value of field 'TriggeredUEI'.
     */
    public java.lang.String getTriggeredUEI(
    ) {
        return this._triggeredUEI;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Threshold type. "high" to trigger if
     * the value exceeds the threshold,
     *  "low" to trigger if the value drops below the threshold,
     *  "relativeChange" to trigger if the value changes more than
     * the proportion represented by the threshold, or
     *  "absoluteChange" to trigger if the value changes by more
     * than the threshold value
     *
     *
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Returns the value of field 'value'. The field 'value' has
     * the following description: Threshold value. If the
     * datasource value rises above this
     *  value, in the case of a "high" threshold, or drops below
     * this
     *  value, in the case of a "low" threshold the threshold is
     *  considered to have been exceeded and the exceeded count
     * will
     *  be incremented. Any time that the datasource value drops
     * below
     *  this value, in the case of a "high" threshold, or rises
     * above
     *  this value, in the case of a "low" threshold the exceeded
     *  count is reset back to zero. Whenever the exceeded count
     *  reaches the trigger value then a threshold event is
     * generated.
     *
     *
     * @return the value of field 'Value'.
     */
    public Double getValue(
    ) {
        return this._value;
    }

    /**
     * Method hasRearm.
     *
     * @return true if at least one Rearm has been added
     */
    public boolean hasRearm(
    ) {
        return this._rearm != null;
    }

    /**
     * Method hasRelaxed.
     *
     * @return true if at least one Relaxed has been added
     */
    public boolean hasRelaxed(
    ) {
        return this._relaxed != null;
    }

    /**
     * Method hasTrigger.
     *
     * @return true if at least one Trigger has been added
     */
    public boolean hasTrigger(
    ) {
        return this._trigger != null;
    }

    /**
     * Method hasValue.
     *
     * @return true if at least one Value has been added
     */
    public boolean hasValue(
    ) {
        return this._value != null;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     *
     * @return a hash code value for the object.
     */
    @Override
    public int hashCode(
    ) {
        int result = 17;

        long tmp;
        if (_relaxed != null) {
           result = 37 * result + _relaxed.hashCode();
        }
        if (_description != null) {
           result = 37 * result + _description.hashCode();
        }
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_dsType != null) {
           result = 37 * result + _dsType.hashCode();
        }
        if (_value != null) {
           result = 37 * result + _value.hashCode();
        }
        if (_rearm != null) {
           result = 37 * result + _rearm.hashCode();
        }
        if (_trigger != null) {
           result = 37 * result + _trigger.hashCode();
        }
        if (_dsLabel != null) {
           result = 37 * result + _dsLabel.hashCode();
        }
        if (_triggeredUEI != null) {
           result = 37 * result + _triggeredUEI.hashCode();
        }
        if (_rearmedUEI != null) {
           result = 37 * result + _rearmedUEI.hashCode();
        }
        if (_filterOperator != null) {
           result = 37 * result + _filterOperator.hashCode();
        }
        if (_resourceFilterList != null) {
           result = 37 * result + _resourceFilterList.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'relaxed'. The field 'relaxed'
     * has the following description: An optional flag to tell the
     * threshold processor to evaluate the expression even if there
     * are unknown values.
     *  This can be useful when processing expressions with
     * conditionals. Default: false
     *
     *
     * @return the value of field 'Relaxed'.
     */
    public boolean isRelaxed(
    ) {
        return this._relaxed;
    }

    /**
     * Method isValid.
     *
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateResourceFilter.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.thresholding.ResourceFilter> iterateResourceFilter(
    ) {
        return this._resourceFilterList.iterator();
    }

    /**
     */
    public void removeAllResourceFilter(
    ) {
        this._resourceFilterList.clear();
    }

    /**
     * Method removeResourceFilter.
     *
     * @param vResourceFilter
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceFilter(
            final org.opennms.netmgt.config.thresholding.ResourceFilter vResourceFilter) {
        boolean removed = _resourceFilterList.remove(vResourceFilter);
        return removed;
    }

    /**
     * Method removeResourceFilterAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.thresholding.ResourceFilter removeResourceFilterAt(
            final int index) {
        java.lang.Object obj = this._resourceFilterList.remove(index);
        return (org.opennms.netmgt.config.thresholding.ResourceFilter) obj;
    }

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: An optional
     * description for the threshold, to help identify what is
     * their purpose.
     *
     *
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'dsLabel'. The field 'dsLabel' has
     * the following description: Value to retrieve from
     * strings.properties to label this
     *  datasource.
     *
     *
     * @param dsLabel the value of field 'dsLabel'.
     */
    public void setDsLabel(
            final java.lang.String dsLabel) {
        this._dsLabel = dsLabel;
    }

    /**
     * Sets the value of field 'dsType'. The field 'dsType' has the
     * following description: RRD datasource type. "node" indicates
     * a node level datasource.
     *  "if" indicates an interface level datasource.
     *
     *
     * @param dsType the value of field 'dsType'.
     */
    public void setDsType(
            final java.lang.String dsType) {
        this._dsType = dsType;
    }

    /**
     * Sets the value of field 'filterOperator'. The field
     * 'filterOperator' has the following description: The operator
     * to be used when applying filters. The
     *  default is "or". If you want to match all filters,
     *  you should specify "and";
     *
     *
     * @param filterOperator the value of field 'filterOperator'.
     */
    public void setFilterOperator(
            final java.lang.String filterOperator) {
        this._filterOperator = filterOperator;
    }

    /**
     * Sets the value of field 'rearm'. The field 'rearm' has the
     * following description: Rearm value. Identifies the value
     * that the datasource must
     *  fall below, in the case of a "high" threshold or rise
     * above,
     *  in the case of a "low" threshold, before the threshold will
     *  rearm, and once again be eligible to generate an event.
     *
     *
     * @param rearm the value of field 'rearm'.
     */
    public void setRearm(
            final Double rearm) {
        this._rearm = rearm;
    }

    /**
     * Sets the value of field 'rearmedUEI'. The field 'rearmedUEI'
     * has the following description: The UEI to send when this
     * threshold is re-armed. If not
     *  specified, defaults to standard threshold UEIs
     *
     *
     * @param rearmedUEI the value of field 'rearmedUEI'.
     */
    public void setRearmedUEI(
            final java.lang.String rearmedUEI) {
        this._rearmedUEI = rearmedUEI;
    }

    /**
     * Sets the value of field 'relaxed'. The field 'relaxed' has
     * the following description: An optional flag to tell the
     * threshold processor to evaluate the expression even if there
     * are unknown values.
     *  This can be useful when processing expressions with
     * conditionals. Default: false
     *
     *
     * @param relaxed the value of field 'relaxed'.
     */
    public void setRelaxed(
            final Boolean relaxed) {
        this._relaxed = relaxed;
    }

    /**
     *
     *
     * @param index
     * @param vResourceFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceFilter(
            final int index,
            final org.opennms.netmgt.config.thresholding.ResourceFilter vResourceFilter)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceFilterList.size()) {
            throw new IndexOutOfBoundsException("setResourceFilter: Index value '" + index + "' not in range [0.." + (this._resourceFilterList.size() - 1) + "]");
        }

        this._resourceFilterList.set(index, vResourceFilter);
    }

    /**
     *
     *
     * @param vResourceFilterArray
     */
    public void setResourceFilter(
            final org.opennms.netmgt.config.thresholding.ResourceFilter[] vResourceFilterArray) {
        //-- copy array
        _resourceFilterList.clear();

        for (int i = 0; i < vResourceFilterArray.length; i++) {
                this._resourceFilterList.add(vResourceFilterArray[i]);
        }
    }

    /**
     * Sets the value of '_resourceFilterList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vResourceFilterList the Vector to copy.
     */
    public void setResourceFilter(
            final java.util.List<org.opennms.netmgt.config.thresholding.ResourceFilter> vResourceFilterList) {
        // copy vector
        this._resourceFilterList.clear();

        this._resourceFilterList.addAll(vResourceFilterList);
    }

    /**
     * Sets the value of '_resourceFilterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param resourceFilterList the Vector to set.
     */
    public void setResourceFilterCollection(
            final java.util.List<org.opennms.netmgt.config.thresholding.ResourceFilter> resourceFilterList) {
        this._resourceFilterList = resourceFilterList;
    }

    /**
     * Sets the value of field 'trigger'. The field 'trigger' has
     * the following description: Trigger value. Identifies the
     * number of consecutive polls that
     *  the datasource value must exceed the defined threshold
     * value
     *  before a threshold event is generated.
     *
     *
     * @param trigger the value of field 'trigger'.
     */
    public void setTrigger(
            final Integer trigger) {
        this._trigger = trigger;
    }

    /**
     * Sets the value of field 'triggeredUEI'. The field
     * 'triggeredUEI' has the following description: The UEI to
     * send when this threshold is triggered. If not
     *  specified, defaults to standard threshold UEIs
     *
     *
     * @param triggeredUEI the value of field 'triggeredUEI'.
     */
    public void setTriggeredUEI(
            final java.lang.String triggeredUEI) {
        this._triggeredUEI = triggeredUEI;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Threshold type. "high" to trigger if
     * the value exceeds the threshold,
     *  "low" to trigger if the value drops below the threshold,
     *  "relativeChange" to trigger if the value changes more than
     * the proportion represented by the threshold, or
     *  "absoluteChange" to trigger if the value changes by more
     * than the threshold value
     *
     *
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Sets the value of field 'value'. The field 'value' has the
     * following description: Threshold value. If the datasource
     * value rises above this
     *  value, in the case of a "high" threshold, or drops below
     * this
     *  value, in the case of a "low" threshold the threshold is
     *  considered to have been exceeded and the exceeded count
     * will
     *  be incremented. Any time that the datasource value drops
     * below
     *  this value, in the case of a "high" threshold, or rises
     * above
     *  this value, in the case of a "low" threshold the exceeded
     *  count is reset back to zero. Whenever the exceeded count
     *  reaches the trigger value then a threshold event is
     * generated.
     *
     *
     * @param value the value of field 'value'.
     */
    public void setValue(
            final Double value) {
        this._value = value;
    }

    /**
     *
     *
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
