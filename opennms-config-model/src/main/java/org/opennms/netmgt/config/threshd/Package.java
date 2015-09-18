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
package org.opennms.netmgt.config.threshd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Package encapsulating addresses eligible for
 *  thresholding.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="package")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("threshd-configuration.xsd")
@SuppressWarnings("all") public class Package implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Name or identifier for this package
     */
    @XmlAttribute(name="name", required = true)
    private java.lang.String _name;

    /**
     * A rule which adresses belonging to this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter
     */
    @XmlElement(name="filter", required = true)
    private org.opennms.netmgt.config.threshd.Filter _filter;

    /**
     * Adresses in this package
     */
    @XmlElement(name="specific")
    private java.util.List<java.lang.String> _specificList;

    /**
     * Range of addresses in this package
     */
    @XmlElement(name="include-range")
    private java.util.List<org.opennms.netmgt.config.threshd.IncludeRange> _includeRangeList;

    /**
     * Range of addresses to be excluded from this
     *  package
     */
    @XmlElement(name="exclude-range")
    private java.util.List<org.opennms.netmgt.config.threshd.ExcludeRange> _excludeRangeList;

    /**
     * A file URL holding specific addresses to be polled.
     *  Each line in the URL file can be one of:
     *  <IP><space>#<comments>, or <IP>, or
     *  #<comments>. Lines starting with a '#' are ignored and so
     *  are characters after a '<space>#' in a line.
     */
    @XmlElement(name="include-url")
    private java.util.List<java.lang.String> _includeUrlList;

    /**
     * Services for which thresholding is to occur in this
     *  package
     */
    @XmlElement(name="service")
    private java.util.List<org.opennms.netmgt.config.threshd.Service> _serviceList;

    /**
     * Scheduled outages. Thresholding is not performed
     *  during scheduled outages.
     */
    @XmlElement(name="outage-calendar")
    private java.util.List<java.lang.String> _outageCalendarList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Package() {
        super();
        this._specificList = new java.util.ArrayList<java.lang.String>();
        this._includeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.IncludeRange>();
        this._excludeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.ExcludeRange>();
        this._includeUrlList = new java.util.ArrayList<java.lang.String>();
        this._serviceList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.Service>();
        this._outageCalendarList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final org.opennms.netmgt.config.threshd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(vExcludeRange);
    }

    /**
     *
     *
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final int index,
            final org.opennms.netmgt.config.threshd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(index, vExcludeRange);
    }

    /**
     *
     *
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final org.opennms.netmgt.config.threshd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(vIncludeRange);
    }

    /**
     *
     *
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final int index,
            final org.opennms.netmgt.config.threshd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(index, vIncludeRange);
    }

    /**
     *
     *
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(vIncludeUrl);
    }

    /**
     *
     *
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final int index,
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(index, vIncludeUrl);
    }

    /**
     *
     *
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOutageCalendar(
            final java.lang.String vOutageCalendar)
    throws java.lang.IndexOutOfBoundsException {
        this._outageCalendarList.add(vOutageCalendar);
    }

    /**
     *
     *
     * @param index
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOutageCalendar(
            final int index,
            final java.lang.String vOutageCalendar)
    throws java.lang.IndexOutOfBoundsException {
        this._outageCalendarList.add(index, vOutageCalendar);
    }

    /**
     *
     *
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final org.opennms.netmgt.config.threshd.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(vService);
    }

    /**
     *
     *
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final int index,
            final org.opennms.netmgt.config.threshd.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(index, vService);
    }

    /**
     *
     *
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(vSpecific);
    }

    /**
     *
     *
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final int index,
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(index, vSpecific);
    }

    /**
     * Method enumerateExcludeRange.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.ExcludeRange> enumerateExcludeRange(
    ) {
        return java.util.Collections.enumeration(this._excludeRangeList);
    }

    /**
     * Method enumerateIncludeRange.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.IncludeRange> enumerateIncludeRange(
    ) {
        return java.util.Collections.enumeration(this._includeRangeList);
    }

    /**
     * Method enumerateIncludeUrl.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateIncludeUrl(
    ) {
        return java.util.Collections.enumeration(this._includeUrlList);
    }

    /**
     * Method enumerateOutageCalendar.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateOutageCalendar(
    ) {
        return java.util.Collections.enumeration(this._outageCalendarList);
    }

    /**
     * Method enumerateService.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.Service> enumerateService(
    ) {
        return java.util.Collections.enumeration(this._serviceList);
    }

    /**
     * Method enumerateSpecific.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateSpecific(
    ) {
        return java.util.Collections.enumeration(this._specificList);
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

        if (obj instanceof Package) {

            Package temp = (Package)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._filter != null) {
                if (temp._filter == null) return false;
                else if (!(this._filter.equals(temp._filter)))
                    return false;
            }
            else if (temp._filter != null)
                return false;
            if (this._specificList != null) {
                if (temp._specificList == null) return false;
                else if (!(this._specificList.equals(temp._specificList)))
                    return false;
            }
            else if (temp._specificList != null)
                return false;
            if (this._includeRangeList != null) {
                if (temp._includeRangeList == null) return false;
                else if (!(this._includeRangeList.equals(temp._includeRangeList)))
                    return false;
            }
            else if (temp._includeRangeList != null)
                return false;
            if (this._excludeRangeList != null) {
                if (temp._excludeRangeList == null) return false;
                else if (!(this._excludeRangeList.equals(temp._excludeRangeList)))
                    return false;
            }
            else if (temp._excludeRangeList != null)
                return false;
            if (this._includeUrlList != null) {
                if (temp._includeUrlList == null) return false;
                else if (!(this._includeUrlList.equals(temp._includeUrlList)))
                    return false;
            }
            else if (temp._includeUrlList != null)
                return false;
            if (this._serviceList != null) {
                if (temp._serviceList == null) return false;
                else if (!(this._serviceList.equals(temp._serviceList)))
                    return false;
            }
            else if (temp._serviceList != null)
                return false;
            if (this._outageCalendarList != null) {
                if (temp._outageCalendarList == null) return false;
                else if (!(this._outageCalendarList.equals(temp._outageCalendarList)))
                    return false;
            }
            else if (temp._outageCalendarList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getExcludeRange.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.ExcludeRange at the given
     * index
     */
    public org.opennms.netmgt.config.threshd.ExcludeRange getExcludeRange(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("getExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.threshd.ExcludeRange) _excludeRangeList.get(index);
    }

    /**
     * Method getExcludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.threshd.ExcludeRange[] getExcludeRange(
    ) {
        org.opennms.netmgt.config.threshd.ExcludeRange[] array = new org.opennms.netmgt.config.threshd.ExcludeRange[0];
        return (org.opennms.netmgt.config.threshd.ExcludeRange[]) this._excludeRangeList.toArray(array);
    }

    /**
     * Method getExcludeRangeCollection.Returns a reference to
     * '_excludeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.ExcludeRange> getExcludeRangeCollection(
    ) {
        return this._excludeRangeList;
    }

    /**
     * Method getExcludeRangeCount.
     *
     * @return the size of this collection
     */
    public int getExcludeRangeCount(
    ) {
        return this._excludeRangeList.size();
    }

    /**
     * Returns the value of field 'filter'. The field 'filter' has
     * the following description: A rule which adresses belonging
     * to this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter
     *
     * @return the value of field 'Filter'.
     */
    public org.opennms.netmgt.config.threshd.Filter getFilter(
    ) {
        return this._filter;
    }

    /**
     * Method getIncludeRange.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.IncludeRange at the given
     * index
     */
    public org.opennms.netmgt.config.threshd.IncludeRange getIncludeRange(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.threshd.IncludeRange) _includeRangeList.get(index);
    }

    /**
     * Method getIncludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.threshd.IncludeRange[] getIncludeRange(
    ) {
        org.opennms.netmgt.config.threshd.IncludeRange[] array = new org.opennms.netmgt.config.threshd.IncludeRange[0];
        return (org.opennms.netmgt.config.threshd.IncludeRange[]) this._includeRangeList.toArray(array);
    }

    /**
     * Method getIncludeRangeCollection.Returns a reference to
     * '_includeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.IncludeRange> getIncludeRangeCollection(
    ) {
        return this._includeRangeList;
    }

    /**
     * Method getIncludeRangeCount.
     *
     * @return the size of this collection
     */
    public int getIncludeRangeCount(
    ) {
        return this._includeRangeList.size();
    }

    /**
     * Method getIncludeUrl.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getIncludeUrl(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("getIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }

        return (java.lang.String) _includeUrlList.get(index);
    }

    /**
     * Method getIncludeUrl.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getIncludeUrl(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._includeUrlList.toArray(array);
    }

    /**
     * Method getIncludeUrlCollection.Returns a reference to
     * '_includeUrlList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getIncludeUrlCollection(
    ) {
        return this._includeUrlList;
    }

    /**
     * Method getIncludeUrlCount.
     *
     * @return the size of this collection
     */
    public int getIncludeUrlCount(
    ) {
        return this._includeUrlList.size();
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Name or identifier for this package
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getOutageCalendar.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getOutageCalendar(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._outageCalendarList.size()) {
            throw new IndexOutOfBoundsException("getOutageCalendar: Index value '" + index + "' not in range [0.." + (this._outageCalendarList.size() - 1) + "]");
        }

        return (java.lang.String) _outageCalendarList.get(index);
    }

    /**
     * Method getOutageCalendar.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getOutageCalendar(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._outageCalendarList.toArray(array);
    }

    /**
     * Method getOutageCalendarCollection.Returns a reference to
     * '_outageCalendarList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getOutageCalendarCollection(
    ) {
        return this._outageCalendarList;
    }

    /**
     * Method getOutageCalendarCount.
     *
     * @return the size of this collection
     */
    public int getOutageCalendarCount(
    ) {
        return this._outageCalendarList.size();
    }

    /**
     * Method getService.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.Service at the given index
     */
    public org.opennms.netmgt.config.threshd.Service getService(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("getService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.threshd.Service) _serviceList.get(index);
    }

    /**
     * Method getService.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.threshd.Service[] getService(
    ) {
        org.opennms.netmgt.config.threshd.Service[] array = new org.opennms.netmgt.config.threshd.Service[0];
        return (org.opennms.netmgt.config.threshd.Service[]) this._serviceList.toArray(array);
    }

    /**
     * Method getServiceCollection.Returns a reference to
     * '_serviceList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.Service> getServiceCollection(
    ) {
        return this._serviceList;
    }

    /**
     * Method getServiceCount.
     *
     * @return the size of this collection
     */
    public int getServiceCount(
    ) {
        return this._serviceList.size();
    }

    /**
     * Method getSpecific.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getSpecific(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("getSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }

        return (java.lang.String) _specificList.get(index);
    }

    /**
     * Method getSpecific.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getSpecific(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._specificList.toArray(array);
    }

    /**
     * Method getSpecificCollection.Returns a reference to
     * '_specificList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getSpecificCollection(
    ) {
        return this._specificList;
    }

    /**
     * Method getSpecificCount.
     *
     * @return the size of this collection
     */
    public int getSpecificCount(
    ) {
        return this._specificList.size();
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_filter != null) {
           result = 37 * result + _filter.hashCode();
        }
        if (_specificList != null) {
           result = 37 * result + _specificList.hashCode();
        }
        if (_includeRangeList != null) {
           result = 37 * result + _includeRangeList.hashCode();
        }
        if (_excludeRangeList != null) {
           result = 37 * result + _excludeRangeList.hashCode();
        }
        if (_includeUrlList != null) {
           result = 37 * result + _includeUrlList.hashCode();
        }
        if (_serviceList != null) {
           result = 37 * result + _serviceList.hashCode();
        }
        if (_outageCalendarList != null) {
           result = 37 * result + _outageCalendarList.hashCode();
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
     * Method iterateExcludeRange.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.threshd.ExcludeRange> iterateExcludeRange(
    ) {
        return this._excludeRangeList.iterator();
    }

    /**
     * Method iterateIncludeRange.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.threshd.IncludeRange> iterateIncludeRange(
    ) {
        return this._includeRangeList.iterator();
    }

    /**
     * Method iterateIncludeUrl.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateIncludeUrl(
    ) {
        return this._includeUrlList.iterator();
    }

    /**
     * Method iterateOutageCalendar.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateOutageCalendar(
    ) {
        return this._outageCalendarList.iterator();
    }

    /**
     * Method iterateService.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.threshd.Service> iterateService(
    ) {
        return this._serviceList.iterator();
    }

    /**
     * Method iterateSpecific.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateSpecific(
    ) {
        return this._specificList.iterator();
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
    public void removeAllExcludeRange(
    ) {
        this._excludeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeRange(
    ) {
        this._includeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeUrl(
    ) {
        this._includeUrlList.clear();
    }

    /**
     */
    public void removeAllOutageCalendar(
    ) {
        this._outageCalendarList.clear();
    }

    /**
     */
    public void removeAllService(
    ) {
        this._serviceList.clear();
    }

    /**
     */
    public void removeAllSpecific(
    ) {
        this._specificList.clear();
    }

    /**
     * Method removeExcludeRange.
     *
     * @param vExcludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeExcludeRange(
            final org.opennms.netmgt.config.threshd.ExcludeRange vExcludeRange) {
        boolean removed = _excludeRangeList.remove(vExcludeRange);
        return removed;
    }

    /**
     * Method removeExcludeRangeAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.ExcludeRange removeExcludeRangeAt(
            final int index) {
        java.lang.Object obj = this._excludeRangeList.remove(index);
        return (org.opennms.netmgt.config.threshd.ExcludeRange) obj;
    }

    /**
     * Method removeIncludeRange.
     *
     * @param vIncludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRange(
            final org.opennms.netmgt.config.threshd.IncludeRange vIncludeRange) {
        boolean removed = _includeRangeList.remove(vIncludeRange);
        return removed;
    }

    /**
     * Method removeIncludeRangeAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.IncludeRange removeIncludeRangeAt(
            final int index) {
        java.lang.Object obj = this._includeRangeList.remove(index);
        return (org.opennms.netmgt.config.threshd.IncludeRange) obj;
    }

    /**
     * Method removeIncludeUrl.
     *
     * @param vIncludeUrl
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeUrl(
            final java.lang.String vIncludeUrl) {
        boolean removed = _includeUrlList.remove(vIncludeUrl);
        return removed;
    }

    /**
     * Method removeIncludeUrlAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeIncludeUrlAt(
            final int index) {
        java.lang.Object obj = this._includeUrlList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeOutageCalendar.
     *
     * @param vOutageCalendar
     * @return true if the object was removed from the collection.
     */
    public boolean removeOutageCalendar(
            final java.lang.String vOutageCalendar) {
        boolean removed = _outageCalendarList.remove(vOutageCalendar);
        return removed;
    }

    /**
     * Method removeOutageCalendarAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeOutageCalendarAt(
            final int index) {
        java.lang.Object obj = this._outageCalendarList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeService.
     *
     * @param vService
     * @return true if the object was removed from the collection.
     */
    public boolean removeService(
            final org.opennms.netmgt.config.threshd.Service vService) {
        boolean removed = _serviceList.remove(vService);
        return removed;
    }

    /**
     * Method removeServiceAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.Service removeServiceAt(
            final int index) {
        java.lang.Object obj = this._serviceList.remove(index);
        return (org.opennms.netmgt.config.threshd.Service) obj;
    }

    /**
     * Method removeSpecific.
     *
     * @param vSpecific
     * @return true if the object was removed from the collection.
     */
    public boolean removeSpecific(
            final java.lang.String vSpecific) {
        boolean removed = _specificList.remove(vSpecific);
        return removed;
    }

    /**
     * Method removeSpecificAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeSpecificAt(
            final int index) {
        java.lang.Object obj = this._specificList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     *
     *
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExcludeRange(
            final int index,
            final org.opennms.netmgt.config.threshd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("setExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }

        this._excludeRangeList.set(index, vExcludeRange);
    }

    /**
     *
     *
     * @param vExcludeRangeArray
     */
    public void setExcludeRange(
            final org.opennms.netmgt.config.threshd.ExcludeRange[] vExcludeRangeArray) {
        //-- copy array
        _excludeRangeList.clear();

        for (int i = 0; i < vExcludeRangeArray.length; i++) {
                this._excludeRangeList.add(vExcludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_excludeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vExcludeRangeList the Vector to copy.
     */
    public void setExcludeRange(
            final java.util.List<org.opennms.netmgt.config.threshd.ExcludeRange> vExcludeRangeList) {
        // copy vector
        this._excludeRangeList.clear();

        this._excludeRangeList.addAll(vExcludeRangeList);
    }

    /**
     * Sets the value of '_excludeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param excludeRangeList the Vector to set.
     */
    public void setExcludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.threshd.ExcludeRange> excludeRangeList) {
        this._excludeRangeList = excludeRangeList;
    }

    /**
     * Sets the value of field 'filter'. The field 'filter' has the
     * following description: A rule which adresses belonging to
     * this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter
     *
     * @param filter the value of field 'filter'.
     */
    public void setFilter(
            final org.opennms.netmgt.config.threshd.Filter filter) {
        this._filter = filter;
    }

    /**
     *
     *
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRange(
            final int index,
            final org.opennms.netmgt.config.threshd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }

        this._includeRangeList.set(index, vIncludeRange);
    }

    /**
     *
     *
     * @param vIncludeRangeArray
     */
    public void setIncludeRange(
            final org.opennms.netmgt.config.threshd.IncludeRange[] vIncludeRangeArray) {
        //-- copy array
        _includeRangeList.clear();

        for (int i = 0; i < vIncludeRangeArray.length; i++) {
                this._includeRangeList.add(vIncludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_includeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vIncludeRangeList the Vector to copy.
     */
    public void setIncludeRange(
            final java.util.List<org.opennms.netmgt.config.threshd.IncludeRange> vIncludeRangeList) {
        // copy vector
        this._includeRangeList.clear();

        this._includeRangeList.addAll(vIncludeRangeList);
    }

    /**
     * Sets the value of '_includeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param includeRangeList the Vector to set.
     */
    public void setIncludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.threshd.IncludeRange> includeRangeList) {
        this._includeRangeList = includeRangeList;
    }

    /**
     *
     *
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeUrl(
            final int index,
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("setIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }

        this._includeUrlList.set(index, vIncludeUrl);
    }

    /**
     *
     *
     * @param vIncludeUrlArray
     */
    public void setIncludeUrl(
            final java.lang.String[] vIncludeUrlArray) {
        //-- copy array
        _includeUrlList.clear();

        for (int i = 0; i < vIncludeUrlArray.length; i++) {
                this._includeUrlList.add(vIncludeUrlArray[i]);
        }
    }

    /**
     * Sets the value of '_includeUrlList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vIncludeUrlList the Vector to copy.
     */
    public void setIncludeUrl(
            final java.util.List<java.lang.String> vIncludeUrlList) {
        // copy vector
        this._includeUrlList.clear();

        this._includeUrlList.addAll(vIncludeUrlList);
    }

    /**
     * Sets the value of '_includeUrlList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param includeUrlList the Vector to set.
     */
    public void setIncludeUrlCollection(
            final java.util.List<java.lang.String> includeUrlList) {
        this._includeUrlList = includeUrlList;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Name or identifier for this package
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     *
     *
     * @param index
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOutageCalendar(
            final int index,
            final java.lang.String vOutageCalendar)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._outageCalendarList.size()) {
            throw new IndexOutOfBoundsException("setOutageCalendar: Index value '" + index + "' not in range [0.." + (this._outageCalendarList.size() - 1) + "]");
        }

        this._outageCalendarList.set(index, vOutageCalendar);
    }

    /**
     *
     *
     * @param vOutageCalendarArray
     */
    public void setOutageCalendar(
            final java.lang.String[] vOutageCalendarArray) {
        //-- copy array
        _outageCalendarList.clear();

        for (int i = 0; i < vOutageCalendarArray.length; i++) {
                this._outageCalendarList.add(vOutageCalendarArray[i]);
        }
    }

    /**
     * Sets the value of '_outageCalendarList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vOutageCalendarList the Vector to copy.
     */
    public void setOutageCalendar(
            final java.util.List<java.lang.String> vOutageCalendarList) {
        // copy vector
        this._outageCalendarList.clear();

        this._outageCalendarList.addAll(vOutageCalendarList);
    }

    /**
     * Sets the value of '_outageCalendarList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param outageCalendarList the Vector to set.
     */
    public void setOutageCalendarCollection(
            final java.util.List<java.lang.String> outageCalendarList) {
        this._outageCalendarList = outageCalendarList;
    }

    /**
     *
     *
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setService(
            final int index,
            final org.opennms.netmgt.config.threshd.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("setService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }

        this._serviceList.set(index, vService);
    }

    /**
     *
     *
     * @param vServiceArray
     */
    public void setService(
            final org.opennms.netmgt.config.threshd.Service[] vServiceArray) {
        //-- copy array
        _serviceList.clear();

        for (int i = 0; i < vServiceArray.length; i++) {
                this._serviceList.add(vServiceArray[i]);
        }
    }

    /**
     * Sets the value of '_serviceList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vServiceList the Vector to copy.
     */
    public void setService(
            final java.util.List<org.opennms.netmgt.config.threshd.Service> vServiceList) {
        // copy vector
        this._serviceList.clear();

        this._serviceList.addAll(vServiceList);
    }

    /**
     * Sets the value of '_serviceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param serviceList the Vector to set.
     */
    public void setServiceCollection(
            final java.util.List<org.opennms.netmgt.config.threshd.Service> serviceList) {
        this._serviceList = serviceList;
    }

    /**
     *
     *
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSpecific(
            final int index,
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("setSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }

        this._specificList.set(index, vSpecific);
    }

    /**
     *
     *
     * @param vSpecificArray
     */
    public void setSpecific(
            final java.lang.String[] vSpecificArray) {
        //-- copy array
        _specificList.clear();

        for (int i = 0; i < vSpecificArray.length; i++) {
                this._specificList.add(vSpecificArray[i]);
        }
    }

    /**
     * Sets the value of '_specificList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vSpecificList the Vector to copy.
     */
    public void setSpecific(
            final java.util.List<java.lang.String> vSpecificList) {
        // copy vector
        this._specificList.clear();

        this._specificList.addAll(vSpecificList);
    }

    /**
     * Sets the value of '_specificList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param specificList the Vector to set.
     */
    public void setSpecificCollection(
            final java.util.List<java.lang.String> specificList) {
        this._specificList = specificList;
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
     * org.opennms.netmgt.config.threshd.Package
     */
    public static org.opennms.netmgt.config.threshd.Package unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.threshd.Package) Unmarshaller.unmarshal(org.opennms.netmgt.config.threshd.Package.class, reader);
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
