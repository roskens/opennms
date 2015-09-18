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
package org.opennms.netmgt.config.rancid.adapter;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This represents a policy to manage a provisioned node
 *  if matched a node will be added updated or deleted using
 *  the element attribute definitions .
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "policy-manage")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("rancid-adapter-configuration.xsd")
@SuppressWarnings("all")
public class PolicyManage implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * The name of the policy
     *
     */
    @XmlAttribute(name = "name", required = true)
    private java.lang.String _name;

    /**
     * The time in sec to wait before trying
     *  to set the download flag to up in router.db.
     *  If schedule is there then it is verified if you are able
     *  to write to router.db in rancid.
     *  Otherwise you wait until schedule let you write on rancid.
     *
     */
    @XmlAttribute(name = "delay")
    private Long _delay;

    /**
     * The maximum number of retry before
     *  sending a failure.
     */
    @XmlAttribute(name = "retries")
    private Integer _retries;

    /**
     * If you want to use opennms categories
     *  to match rancid device type.
     */
    @XmlAttribute(name = "useCategories")
    private Boolean _useCategories;

    /**
     * The Default Rancid type, it is used when no device type
     *  for provisioned node is found.
     *
     */
    @XmlAttribute(name = "default-type")
    private java.lang.String _defaultType;

    /**
     * Package encapsulating addresses, services to be polled
     *  for these addresses, etc..
     */
    @XmlElement(name = "package")
    private org.opennms.netmgt.config.rancid.adapter.Package _package;

    /**
     * This is a time when you can schedule set up/down
     *  to rancid
     */
    @XmlElement(name = "schedule")
    private java.util.List<org.opennms.netmgt.config.rancid.adapter.Schedule> _scheduleList;

      //----------------/
    //- Constructors -/
    //----------------/
    public PolicyManage() {
        super();
        this._scheduleList = new java.util.ArrayList<org.opennms.netmgt.config.rancid.adapter.Schedule>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vSchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSchedule(
            final org.opennms.netmgt.config.rancid.adapter.Schedule vSchedule)
            throws java.lang.IndexOutOfBoundsException {
        this._scheduleList.add(vSchedule);
    }

    /**
     *
     *
     * @param index
     * @param vSchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSchedule(
            final int index,
            final org.opennms.netmgt.config.rancid.adapter.Schedule vSchedule)
            throws java.lang.IndexOutOfBoundsException {
        this._scheduleList.add(index, vSchedule);
    }

    /**
     */
    public void deleteDelay() {
        this._delay = null;
    }

    /**
     */
    public void deleteRetries() {
        this._retries = null;
    }

    /**
     */
    public void deleteUseCategories() {
        this._useCategories = null;
    }

    /**
     * Method enumerateSchedule.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.rancid.adapter.Schedule> enumerateSchedule() {
        return java.util.Collections.enumeration(this._scheduleList);
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
        if (this == obj) {
            return true;
        }

        if (obj instanceof PolicyManage) {

            PolicyManage temp = (PolicyManage) obj;
            if (this._name != null) {
                if (temp._name == null) {
                    return false;
                } else if (!(this._name.equals(temp._name))) {
                    return false;
                }
            } else if (temp._name != null) {
                return false;
            }
            if (this._delay != null) {
                if (temp._delay == null) {
                    return false;
                } else if (!(this._delay.equals(temp._delay))) {
                    return false;
                }
            } else if (temp._delay != null) {
                return false;
            }
            if (this._retries != null) {
                if (temp._retries == null) {
                    return false;
                } else if (!(this._retries.equals(temp._retries))) {
                    return false;
                }
            } else if (temp._retries != null) {
                return false;
            }
            if (this._useCategories != null) {
                if (temp._useCategories == null) {
                    return false;
                } else if (!(this._useCategories.equals(temp._useCategories))) {
                    return false;
                }
            } else if (temp._useCategories != null) {
                return false;
            }
            if (this._defaultType != null) {
                if (temp._defaultType == null) {
                    return false;
                } else if (!(this._defaultType.equals(temp._defaultType))) {
                    return false;
                }
            } else if (temp._defaultType != null) {
                return false;
            }
            if (this._package != null) {
                if (temp._package == null) {
                    return false;
                } else if (!(this._package.equals(temp._package))) {
                    return false;
                }
            } else if (temp._package != null) {
                return false;
            }
            if (this._scheduleList != null) {
                if (temp._scheduleList == null) {
                    return false;
                } else if (!(this._scheduleList.equals(temp._scheduleList))) {
                    return false;
                }
            } else if (temp._scheduleList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultType'. The field
     * 'defaultType' has the following description: The Default
     * Rancid type, it is used when no device type
     *  for provisioned node is found.
     *
     *
     * @return the value of field 'DefaultType'.
     */
    public java.lang.String getDefaultType() {
        return this._defaultType;
    }

    /**
     * Returns the value of field 'delay'. The field 'delay' has
     * the following description: The time in sec to wait before
     * trying
     *  to set the download flag to up in router.db.
     *  If schedule is there then it is verified if you are able
     *  to write to router.db in rancid.
     *  Otherwise you wait until schedule let you write on rancid.
     *
     *
     * @return the value of field 'Delay'.
     */
    public Long getDelay() {
        return this._delay == null ? 0L : this._delay;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The name of the policy
     *
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName() {
        return this._name;
    }

    /**
     * Returns the value of field 'package'. The field 'package'
     * has the following description: Package encapsulating
     * addresses, services to be polled
     *  for these addresses, etc..
     *
     * @return the value of field 'Package'.
     */
    public org.opennms.netmgt.config.rancid.adapter.Package getPackage() {
        return this._package;
    }

    /**
     * Returns the value of field 'retries'. The field 'retries'
     * has the following description: The maximum number of retry
     * before
     *  sending a failure.
     *
     * @return the value of field 'Retries'.
     */
    public Integer getRetries() {
        return this._retries == null ? 0 : this._retries;
    }

    /**
     * Method getSchedule.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.rancid.adapter.Schedule at the
     * given index
     */
    public org.opennms.netmgt.config.rancid.adapter.Schedule getSchedule(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scheduleList.size()) {
            throw new IndexOutOfBoundsException("getSchedule: Index value '" + index + "' not in range [0.." + (this._scheduleList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.rancid.adapter.Schedule) _scheduleList.get(index);
    }

    /**
     * Method getSchedule.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.rancid.adapter.Schedule[] getSchedule() {
        org.opennms.netmgt.config.rancid.adapter.Schedule[] array = new org.opennms.netmgt.config.rancid.adapter.Schedule[0];
        return (org.opennms.netmgt.config.rancid.adapter.Schedule[]) this._scheduleList.toArray(array);
    }

    /**
     * Method getScheduleCollection.Returns a reference to
     * '_scheduleList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.rancid.adapter.Schedule> getScheduleCollection() {
        return this._scheduleList;
    }

    /**
     * Method getScheduleCount.
     *
     * @return the size of this collection
     */
    public int getScheduleCount() {
        return this._scheduleList.size();
    }

    /**
     * Returns the value of field 'useCategories'. The field
     * 'useCategories' has the following description: If you want
     * to use opennms categories
     *  to match rancid device type.
     *
     * @return the value of field 'UseCategories'.
     */
    public Boolean getUseCategories() {
        return this._useCategories == null ? false : this._useCategories;
    }

    /**
     * Method hasDelay.
     *
     * @return true if at least one Delay has been added
     */
    public boolean hasDelay() {
        return this._delay != null;
    }

    /**
     * Method hasRetries.
     *
     * @return true if at least one Retries has been added
     */
    public boolean hasRetries() {
        return this._retries != null;
    }

    /**
     * Method hasUseCategories.
     *
     * @return true if at least one UseCategories has been added
     */
    public boolean hasUseCategories() {
        return this._useCategories != null;
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
    public int hashCode() {
        int result = 17;

        long tmp;
        if (_name != null) {
            result = 37 * result + _name.hashCode();
        }
        if (_delay != null) {
            result = 37 * result + _delay.hashCode();
        }
        if (_retries != null) {
            result = 37 * result + _retries.hashCode();
        }
        if (_useCategories != null) {
            result = 37 * result + _useCategories.hashCode();
        }
        if (_defaultType != null) {
            result = 37 * result + _defaultType.hashCode();
        }
        if (_package != null) {
            result = 37 * result + _package.hashCode();
        }
        if (_scheduleList != null) {
            result = 37 * result + _scheduleList.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'useCategories'. The field
     * 'useCategories' has the following description: If you want
     * to use opennms categories
     *  to match rancid device type.
     *
     * @return the value of field 'UseCategories'.
     */
    public boolean isUseCategories() {
        return this._useCategories;
    }

    /**
     * Method isValid.
     *
     * @return true if this object is valid according to the schema
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateSchedule.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.rancid.adapter.Schedule> iterateSchedule() {
        return this._scheduleList.iterator();
    }

    /**
     *
     *
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     *
     *
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
            throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllSchedule() {
        this._scheduleList.clear();
    }

    /**
     * Method removeSchedule.
     *
     * @param vSchedule
     * @return true if the object was removed from the collection.
     */
    public boolean removeSchedule(
            final org.opennms.netmgt.config.rancid.adapter.Schedule vSchedule) {
        boolean removed = _scheduleList.remove(vSchedule);
        return removed;
    }

    /**
     * Method removeScheduleAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.rancid.adapter.Schedule removeScheduleAt(
            final int index) {
        java.lang.Object obj = this._scheduleList.remove(index);
        return (org.opennms.netmgt.config.rancid.adapter.Schedule) obj;
    }

    /**
     * Sets the value of field 'defaultType'. The field
     * 'defaultType' has the following description: The Default
     * Rancid type, it is used when no device type
     *  for provisioned node is found.
     *
     *
     * @param defaultType the value of field 'defaultType'.
     */
    public void setDefaultType(
            final java.lang.String defaultType) {
        this._defaultType = defaultType;
    }

    /**
     * Sets the value of field 'delay'. The field 'delay' has the
     * following description: The time in sec to wait before trying
     *  to set the download flag to up in router.db.
     *  If schedule is there then it is verified if you are able
     *  to write to router.db in rancid.
     *  Otherwise you wait until schedule let you write on rancid.
     *
     *
     * @param delay the value of field 'delay'.
     */
    public void setDelay(
            final Long delay) {
        this._delay = delay;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The name of the policy
     *
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'package'. The field 'package' has
     * the following description: Package encapsulating addresses,
     * services to be polled
     *  for these addresses, etc..
     *
     * @param _package
     * @param package the value of field 'package'.
     */
    public void setPackage(
            final org.opennms.netmgt.config.rancid.adapter.Package _package) {
        this._package = _package;
    }

    /**
     * Sets the value of field 'retries'. The field 'retries' has
     * the following description: The maximum number of retry
     * before
     *  sending a failure.
     *
     * @param retries the value of field 'retries'.
     */
    public void setRetries(
            final Integer retries) {
        this._retries = retries;
    }

    /**
     *
     *
     * @param index
     * @param vSchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSchedule(
            final int index,
            final org.opennms.netmgt.config.rancid.adapter.Schedule vSchedule)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scheduleList.size()) {
            throw new IndexOutOfBoundsException("setSchedule: Index value '" + index + "' not in range [0.." + (this._scheduleList.size() - 1) + "]");
        }

        this._scheduleList.set(index, vSchedule);
    }

    /**
     *
     *
     * @param vScheduleArray
     */
    public void setSchedule(
            final org.opennms.netmgt.config.rancid.adapter.Schedule[] vScheduleArray) {
        //-- copy array
        _scheduleList.clear();

        for (int i = 0; i < vScheduleArray.length; i++) {
            this._scheduleList.add(vScheduleArray[i]);
        }
    }

    /**
     * Sets the value of '_scheduleList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vScheduleList the Vector to copy.
     */
    public void setSchedule(
            final java.util.List<org.opennms.netmgt.config.rancid.adapter.Schedule> vScheduleList) {
        // copy vector
        this._scheduleList.clear();

        this._scheduleList.addAll(vScheduleList);
    }

    /**
     * Sets the value of '_scheduleList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param scheduleList the Vector to set.
     */
    public void setScheduleCollection(
            final java.util.List<org.opennms.netmgt.config.rancid.adapter.Schedule> scheduleList) {
        this._scheduleList = scheduleList;
    }

    /**
     * Sets the value of field 'useCategories'. The field
     * 'useCategories' has the following description: If you want
     * to use opennms categories
     *  to match rancid device type.
     *
     * @param useCategories the value of field 'useCategories'.
     */
    public void setUseCategories(
            final Boolean useCategories) {
        this._useCategories = useCategories;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.opennms.netmgt.config.rancid.adapter.PolicyManage
     */
    public static org.opennms.netmgt.config.rancid.adapter.PolicyManage unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rancid.adapter.PolicyManage) Unmarshaller.unmarshal(org.opennms.netmgt.config.rancid.adapter.PolicyManage.class, reader);
    }

    /**
     *
     *
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
