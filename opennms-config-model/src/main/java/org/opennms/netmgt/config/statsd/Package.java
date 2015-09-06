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
package org.opennms.netmgt.config.statsd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Package encapsulating nodes eligible to have
 *  this report run on them.
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
@ValidateUsing("statistics-daemon-configuration.xsd")
@SuppressWarnings("all") public class Package implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name or identifier for this
     *  package
     */
    @XmlAttribute(name="name", required = true)
    private java.lang.String _name;

    /**
     * A rule which adresses belonging to this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter.
     */
    @XmlElement(name="filter")
    private org.opennms.netmgt.config.statsd.Filter _filter;

    /**
     * Reports to be run on the nodes in this
     *  package
     */
    @XmlElement(name="packageReport")
    private java.util.List<org.opennms.netmgt.config.statsd.PackageReport> _packageReportList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Package() {
        super();
        this._packageReportList = new java.util.ArrayList<org.opennms.netmgt.config.statsd.PackageReport>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vPackageReport
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackageReport(
            final org.opennms.netmgt.config.statsd.PackageReport vPackageReport)
    throws java.lang.IndexOutOfBoundsException {
        this._packageReportList.add(vPackageReport);
    }

    /**
     *
     *
     * @param index
     * @param vPackageReport
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackageReport(
            final int index,
            final org.opennms.netmgt.config.statsd.PackageReport vPackageReport)
    throws java.lang.IndexOutOfBoundsException {
        this._packageReportList.add(index, vPackageReport);
    }

    /**
     * Method enumeratePackageReport.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.statsd.PackageReport> enumeratePackageReport(
    ) {
        return java.util.Collections.enumeration(this._packageReportList);
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
            if (this._packageReportList != null) {
                if (temp._packageReportList == null) return false;
                else if (!(this._packageReportList.equals(temp._packageReportList)))
                    return false;
            }
            else if (temp._packageReportList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'filter'. The field 'filter' has
     * the following description: A rule which adresses belonging
     * to this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter.
     *
     * @return the value of field 'Filter'.
     */
    public org.opennms.netmgt.config.statsd.Filter getFilter(
    ) {
        return this._filter;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The name or identifier for this
     *  package
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getPackageReport.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.statsd.PackageReport at the given
     * index
     */
    public org.opennms.netmgt.config.statsd.PackageReport getPackageReport(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageReportList.size()) {
            throw new IndexOutOfBoundsException("getPackageReport: Index value '" + index + "' not in range [0.." + (this._packageReportList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.statsd.PackageReport) _packageReportList.get(index);
    }

    /**
     * Method getPackageReport.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.statsd.PackageReport[] getPackageReport(
    ) {
        org.opennms.netmgt.config.statsd.PackageReport[] array = new org.opennms.netmgt.config.statsd.PackageReport[0];
        return (org.opennms.netmgt.config.statsd.PackageReport[]) this._packageReportList.toArray(array);
    }

    /**
     * Method getPackageReportCollection.Returns a reference to
     * '_packageReportList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.statsd.PackageReport> getPackageReportCollection(
    ) {
        return this._packageReportList;
    }

    /**
     * Method getPackageReportCount.
     *
     * @return the size of this collection
     */
    public int getPackageReportCount(
    ) {
        return this._packageReportList.size();
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
        if (_packageReportList != null) {
           result = 37 * result + _packageReportList.hashCode();
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
     * Method iteratePackageReport.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.statsd.PackageReport> iteratePackageReport(
    ) {
        return this._packageReportList.iterator();
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
    public void removeAllPackageReport(
    ) {
        this._packageReportList.clear();
    }

    /**
     * Method removePackageReport.
     *
     * @param vPackageReport
     * @return true if the object was removed from the collection.
     */
    public boolean removePackageReport(
            final org.opennms.netmgt.config.statsd.PackageReport vPackageReport) {
        boolean removed = _packageReportList.remove(vPackageReport);
        return removed;
    }

    /**
     * Method removePackageReportAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.statsd.PackageReport removePackageReportAt(
            final int index) {
        java.lang.Object obj = this._packageReportList.remove(index);
        return (org.opennms.netmgt.config.statsd.PackageReport) obj;
    }

    /**
     * Sets the value of field 'filter'. The field 'filter' has the
     * following description: A rule which adresses belonging to
     * this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter.
     *
     * @param filter the value of field 'filter'.
     */
    public void setFilter(
            final org.opennms.netmgt.config.statsd.Filter filter) {
        this._filter = filter;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The name or identifier for this
     *  package
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
     * @param vPackageReport
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPackageReport(
            final int index,
            final org.opennms.netmgt.config.statsd.PackageReport vPackageReport)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageReportList.size()) {
            throw new IndexOutOfBoundsException("setPackageReport: Index value '" + index + "' not in range [0.." + (this._packageReportList.size() - 1) + "]");
        }

        this._packageReportList.set(index, vPackageReport);
    }

    /**
     *
     *
     * @param vPackageReportArray
     */
    public void setPackageReport(
            final org.opennms.netmgt.config.statsd.PackageReport[] vPackageReportArray) {
        //-- copy array
        _packageReportList.clear();

        for (int i = 0; i < vPackageReportArray.length; i++) {
                this._packageReportList.add(vPackageReportArray[i]);
        }
    }

    /**
     * Sets the value of '_packageReportList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vPackageReportList the Vector to copy.
     */
    public void setPackageReport(
            final java.util.List<org.opennms.netmgt.config.statsd.PackageReport> vPackageReportList) {
        // copy vector
        this._packageReportList.clear();

        this._packageReportList.addAll(vPackageReportList);
    }

    /**
     * Sets the value of '_packageReportList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param packageReportList the Vector to set.
     */
    public void setPackageReportCollection(
            final java.util.List<org.opennms.netmgt.config.statsd.PackageReport> packageReportList) {
        this._packageReportList = packageReportList;
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
     * org.opennms.netmgt.config.statsd.Package
     */
    public static org.opennms.netmgt.config.statsd.Package unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.statsd.Package) Unmarshaller.unmarshal(org.opennms.netmgt.config.statsd.Package.class, reader);
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
