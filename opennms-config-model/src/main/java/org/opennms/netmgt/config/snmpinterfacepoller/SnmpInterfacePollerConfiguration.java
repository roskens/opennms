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
package org.opennms.netmgt.config.snmpinterfacepoller;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the
 * snmp-interface-poller-configuration.xml
 *  configuration file.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="snmp-interface-poller-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("snmp-interface-poller-configuration.xsd")
@SuppressWarnings("all") public class SnmpInterfacePollerConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Default Interval at which the interfaces are to be
     *  polled
     */
    @XmlAttribute(name="interval")
    private Long _interval;
    private static final Long DEFAULT_INTERVAL = 300000L;

    /**
     * The maximum number of threads used for
     *  snmp polling.
     */
    @XmlAttribute(name="threads", required = true)
    private Integer _threads;

    /**
     * The SNMP service string usually 'SNMP'.
     */
    @XmlAttribute(name="service", required = true)
    private java.lang.String _service;

    /**
     * Flag which indicates to suppress Admin Status events at all.
     *  This is deprecated and will be ignored in the code!
     *
     */
    @XmlAttribute(name="suppressAdminDownEvent")
    private java.lang.String _suppressAdminDownEvent;
    private static final String DEFAULT_SUPPRESSADMINDOWNEVENT = "true";

    /**
     * Flag which indicates if the filters defined on packages and
     * interface
     *  criterias must be used to select the SNMP interfaces to be
     * tracked by the poller
     *  instead of do this selection through requisition policies.
     *
     */
    @XmlAttribute(name="useCriteriaFilters")
    private java.lang.String _useCriteriaFilters;
    private static final String DEFAULT_USECRITERIAFILTERS = "false";

    /**
     * Configuration of node-outage
     *  functionality
     */
    @XmlElement(name="node-outage")
    private org.opennms.netmgt.config.snmpinterfacepoller.NodeOutage _nodeOutage;

    /**
     * Package encapsulating addresses, services to be
     *  polled for these addresses, etc..
     */
    @XmlElement(name="package")
    private java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Package> _packageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SnmpInterfacePollerConfiguration() {
        super();
        this._packageList = new java.util.ArrayList<org.opennms.netmgt.config.snmpinterfacepoller.Package>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(
            final org.opennms.netmgt.config.snmpinterfacepoller.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(vPackage);
    }

    /**
     *
     *
     * @param index
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(
            final int index,
            final org.opennms.netmgt.config.snmpinterfacepoller.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(index, vPackage);
    }

    /**
     */
    public void deleteInterval(
    ) {
        this._interval = null;
    }

    /**
     */
    public void deleteThreads(
    ) {
        this._threads = null;
    }

    /**
     * Method enumeratePackage.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.snmpinterfacepoller.Package> enumeratePackage(
    ) {
        return java.util.Collections.enumeration(this._packageList);
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

        if (obj instanceof SnmpInterfacePollerConfiguration) {

            SnmpInterfacePollerConfiguration temp = (SnmpInterfacePollerConfiguration)obj;
            if (this._interval != null) {
                if (temp._interval == null) return false;
                else if (!(this._interval.equals(temp._interval)))
                    return false;
            }
            else if (temp._interval != null)
                return false;
            if (this._threads != null) {
                if (temp._threads == null) return false;
                else if (!(this._threads.equals(temp._threads)))
                    return false;
            }
            else if (temp._threads != null)
                return false;
            if (this._service != null) {
                if (temp._service == null) return false;
                else if (!(this._service.equals(temp._service)))
                    return false;
            }
            else if (temp._service != null)
                return false;
            if (this._suppressAdminDownEvent != null) {
                if (temp._suppressAdminDownEvent == null) return false;
                else if (!(this._suppressAdminDownEvent.equals(temp._suppressAdminDownEvent)))
                    return false;
            }
            else if (temp._suppressAdminDownEvent != null)
                return false;
            if (this._useCriteriaFilters != null) {
                if (temp._useCriteriaFilters == null) return false;
                else if (!(this._useCriteriaFilters.equals(temp._useCriteriaFilters)))
                    return false;
            }
            else if (temp._useCriteriaFilters != null)
                return false;
            if (this._nodeOutage != null) {
                if (temp._nodeOutage == null) return false;
                else if (!(this._nodeOutage.equals(temp._nodeOutage)))
                    return false;
            }
            else if (temp._nodeOutage != null)
                return false;
            if (this._packageList != null) {
                if (temp._packageList == null) return false;
                else if (!(this._packageList.equals(temp._packageList)))
                    return false;
            }
            else if (temp._packageList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'interval'. The field 'interval'
     * has the following description: Default Interval at which the
     * interfaces are to be
     *  polled
     *
     * @return the value of field 'Interval'.
     */
    public Long getInterval(
    ) {
        return this._interval == null ? DEFAULT_INTERVAL : this._interval;
    }

    /**
     * Returns the value of field 'nodeOutage'. The field
     * 'nodeOutage' has the following description: Configuration of
     * node-outage
     *  functionality
     *
     * @return the value of field 'NodeOutage'.
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.NodeOutage getNodeOutage(
    ) {
        return this._nodeOutage;
    }

    /**
     * Method getPackage.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.snmpinterfacepoller.Package at the
     * given index
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.Package getPackage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("getPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.snmpinterfacepoller.Package) _packageList.get(index);
    }

    /**
     * Method getPackage.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.Package[] getPackage(
    ) {
        org.opennms.netmgt.config.snmpinterfacepoller.Package[] array = new org.opennms.netmgt.config.snmpinterfacepoller.Package[0];
        return (org.opennms.netmgt.config.snmpinterfacepoller.Package[]) this._packageList.toArray(array);
    }

    /**
     * Method getPackageCollection.Returns a reference to
     * '_packageList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Package> getPackageCollection(
    ) {
        return this._packageList;
    }

    /**
     * Method getPackageCount.
     *
     * @return the size of this collection
     */
    public int getPackageCount(
    ) {
        return this._packageList.size();
    }

    /**
     * Returns the value of field 'service'. The field 'service'
     * has the following description: The SNMP service string
     * usually 'SNMP'.
     *
     * @return the value of field 'Service'.
     */
    public java.lang.String getService(
    ) {
        return this._service;
    }

    /**
     * Returns the value of field 'suppressAdminDownEvent'. The
     * field 'suppressAdminDownEvent' has the following
     * description: Flag which indicates to suppress Admin Status
     * events at all.
     *  This is deprecated and will be ignored in the code!
     *
     *
     * @return the value of field 'SuppressAdminDownEvent'.
     */
    public java.lang.String getSuppressAdminDownEvent(
    ) {
        return this._suppressAdminDownEvent == null ? DEFAULT_SUPPRESSADMINDOWNEVENT : this._suppressAdminDownEvent;
    }

    /**
     * Returns the value of field 'threads'. The field 'threads'
     * has the following description: The maximum number of threads
     * used for
     *  snmp polling.
     *
     * @return the value of field 'Threads'.
     */
    public Integer getThreads(
    ) {
        return this._threads;
    }

    /**
     * Returns the value of field 'useCriteriaFilters'. The field
     * 'useCriteriaFilters' has the following description: Flag
     * which indicates if the filters defined on packages and
     * interface
     *  criterias must be used to select the SNMP interfaces to be
     * tracked by the poller
     *  instead of do this selection through requisition policies.
     *
     *
     * @return the value of field 'UseCriteriaFilters'.
     */
    public java.lang.String getUseCriteriaFilters(
    ) {
        return this._useCriteriaFilters == null ? DEFAULT_USECRITERIAFILTERS : this._useCriteriaFilters;
    }

    /**
     * Method hasInterval.
     *
     * @return true if at least one Interval has been added
     */
    public boolean hasInterval(
    ) {
        return this._interval != null;
    }

    /**
     * Method hasThreads.
     *
     * @return true if at least one Threads has been added
     */
    public boolean hasThreads(
    ) {
        return this._threads != null;
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
        if (_interval != null) {
           result = 37 * result + _interval.hashCode();
        }
        if (_threads != null) {
           result = 37 * result + _threads.hashCode();
        }
        if (_service != null) {
           result = 37 * result + _service.hashCode();
        }
        if (_suppressAdminDownEvent != null) {
           result = 37 * result + _suppressAdminDownEvent.hashCode();
        }
        if (_useCriteriaFilters != null) {
           result = 37 * result + _useCriteriaFilters.hashCode();
        }
        if (_nodeOutage != null) {
           result = 37 * result + _nodeOutage.hashCode();
        }
        if (_packageList != null) {
           result = 37 * result + _packageList.hashCode();
        }

        return result;
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
     * Method iteratePackage.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.snmpinterfacepoller.Package> iteratePackage(
    ) {
        return this._packageList.iterator();
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
    public void removeAllPackage(
    ) {
        this._packageList.clear();
    }

    /**
     * Method removePackage.
     *
     * @param vPackage
     * @return true if the object was removed from the collection.
     */
    public boolean removePackage(
            final org.opennms.netmgt.config.snmpinterfacepoller.Package vPackage) {
        boolean removed = _packageList.remove(vPackage);
        return removed;
    }

    /**
     * Method removePackageAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.Package removePackageAt(
            final int index) {
        java.lang.Object obj = this._packageList.remove(index);
        return (org.opennms.netmgt.config.snmpinterfacepoller.Package) obj;
    }

    /**
     * Sets the value of field 'interval'. The field 'interval' has
     * the following description: Default Interval at which the
     * interfaces are to be
     *  polled
     *
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final Long interval) {
        this._interval = interval;
    }

    /**
     * Sets the value of field 'nodeOutage'. The field 'nodeOutage'
     * has the following description: Configuration of node-outage
     *  functionality
     *
     * @param nodeOutage the value of field 'nodeOutage'.
     */
    public void setNodeOutage(
            final org.opennms.netmgt.config.snmpinterfacepoller.NodeOutage nodeOutage) {
        this._nodeOutage = nodeOutage;
    }

    /**
     *
     *
     * @param index
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPackage(
            final int index,
            final org.opennms.netmgt.config.snmpinterfacepoller.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("setPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }

        this._packageList.set(index, vPackage);
    }

    /**
     *
     *
     * @param vPackageArray
     */
    public void setPackage(
            final org.opennms.netmgt.config.snmpinterfacepoller.Package[] vPackageArray) {
        //-- copy array
        _packageList.clear();

        for (int i = 0; i < vPackageArray.length; i++) {
                this._packageList.add(vPackageArray[i]);
        }
    }

    /**
     * Sets the value of '_packageList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vPackageList the Vector to copy.
     */
    public void setPackage(
            final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Package> vPackageList) {
        // copy vector
        this._packageList.clear();

        this._packageList.addAll(vPackageList);
    }

    /**
     * Sets the value of '_packageList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param _packageList the Vector to set.
     */
    public void setPackageCollection(
            final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Package> _packageList) {
        this._packageList = _packageList;
    }

    /**
     * Sets the value of field 'service'. The field 'service' has
     * the following description: The SNMP service string usually
     * 'SNMP'.
     *
     * @param service the value of field 'service'.
     */
    public void setService(
            final java.lang.String service) {
        this._service = service;
    }

    /**
     * Sets the value of field 'suppressAdminDownEvent'. The field
     * 'suppressAdminDownEvent' has the following description: Flag
     * which indicates to suppress Admin Status events at all.
     *  This is deprecated and will be ignored in the code!
     *
     *
     * @param suppressAdminDownEvent the value of field
     * 'suppressAdminDownEvent'.
     */
    public void setSuppressAdminDownEvent(
            final java.lang.String suppressAdminDownEvent) {
        this._suppressAdminDownEvent = suppressAdminDownEvent;
    }

    /**
     * Sets the value of field 'threads'. The field 'threads' has
     * the following description: The maximum number of threads
     * used for
     *  snmp polling.
     *
     * @param threads the value of field 'threads'.
     */
    public void setThreads(
            final Integer threads) {
        this._threads = threads;
    }

    /**
     * Sets the value of field 'useCriteriaFilters'. The field
     * 'useCriteriaFilters' has the following description: Flag
     * which indicates if the filters defined on packages and
     * interface
     *  criterias must be used to select the SNMP interfaces to be
     * tracked by the poller
     *  instead of do this selection through requisition policies.
     *
     *
     * @param useCriteriaFilters the value of field
     * 'useCriteriaFilters'.
     */
    public void setUseCriteriaFilters(
            final java.lang.String useCriteriaFilters) {
        this._useCriteriaFilters = useCriteriaFilters;
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
     * org.opennms.netmgt.config.snmpinterfacepoller.SnmpInterfacePollerConfiguration
     */
    public static org.opennms.netmgt.config.snmpinterfacepoller.SnmpInterfacePollerConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpinterfacepoller.SnmpInterfacePollerConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpinterfacepoller.SnmpInterfacePollerConfiguration.class, reader);
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
