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
 * Top-level element for the threshd-configuration.xml
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

@XmlRootElement(name="threshd-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("threshd-configuration.xsd")
@SuppressWarnings("all") public class ThreshdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Maximum number of threads used for
     *  thresholding.
     */
    @XmlAttribute(name="threads", required = true)
    private Integer _threads;

    /**
     * Package encapsulating addresses eligible for
     *  thresholding.
     */
    @XmlElement(name="package")
    private java.util.List<org.opennms.netmgt.config.threshd.Package> _packageList;

    /**
     * Service thresholders
     */
    @XmlElement(name="thresholders")
    private java.util.List<org.opennms.netmgt.config.threshd.Thresholder> _thresholderList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ThreshdConfiguration() {
        super();
        this._packageList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.Package>();
        this._thresholderList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.Thresholder>();
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
            final org.opennms.netmgt.config.threshd.Package vPackage)
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
            final org.opennms.netmgt.config.threshd.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(index, vPackage);
    }

    /**
     *
     *
     * @param vThresholder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addThresholder(
            final org.opennms.netmgt.config.threshd.Thresholder vThresholder)
    throws java.lang.IndexOutOfBoundsException {
        this._thresholderList.add(vThresholder);
    }

    /**
     *
     *
     * @param index
     * @param vThresholder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addThresholder(
            final int index,
            final org.opennms.netmgt.config.threshd.Thresholder vThresholder)
    throws java.lang.IndexOutOfBoundsException {
        this._thresholderList.add(index, vThresholder);
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
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.Package> enumeratePackage(
    ) {
        return java.util.Collections.enumeration(this._packageList);
    }

    /**
     * Method enumerateThresholder.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.Thresholder> enumerateThresholder(
    ) {
        return java.util.Collections.enumeration(this._thresholderList);
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

        if (obj instanceof ThreshdConfiguration) {

            ThreshdConfiguration temp = (ThreshdConfiguration)obj;
            if (this._threads != null) {
                if (temp._threads == null) return false;
                else if (!(this._threads.equals(temp._threads)))
                    return false;
            }
            else if (temp._threads != null)
                return false;
            if (this._packageList != null) {
                if (temp._packageList == null) return false;
                else if (!(this._packageList.equals(temp._packageList)))
                    return false;
            }
            else if (temp._packageList != null)
                return false;
            if (this._thresholderList != null) {
                if (temp._thresholderList == null) return false;
                else if (!(this._thresholderList.equals(temp._thresholderList)))
                    return false;
            }
            else if (temp._thresholderList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getPackage.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.Package at the given index
     */
    public org.opennms.netmgt.config.threshd.Package getPackage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("getPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.threshd.Package) _packageList.get(index);
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
    public org.opennms.netmgt.config.threshd.Package[] getPackage(
    ) {
        org.opennms.netmgt.config.threshd.Package[] array = new org.opennms.netmgt.config.threshd.Package[0];
        return (org.opennms.netmgt.config.threshd.Package[]) this._packageList.toArray(array);
    }

    /**
     * Method getPackageCollection.Returns a reference to
     * '_packageList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.Package> getPackageCollection(
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
     * Returns the value of field 'threads'. The field 'threads'
     * has the following description: Maximum number of threads
     * used for
     *  thresholding.
     *
     * @return the value of field 'Threads'.
     */
    public Integer getThreads(
    ) {
        return this._threads;
    }

    /**
     * Method getThresholder.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.Thresholder at the given
     * index
     */
    public org.opennms.netmgt.config.threshd.Thresholder getThresholder(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._thresholderList.size()) {
            throw new IndexOutOfBoundsException("getThresholder: Index value '" + index + "' not in range [0.." + (this._thresholderList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.threshd.Thresholder) _thresholderList.get(index);
    }

    /**
     * Method getThresholder.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.threshd.Thresholder[] getThresholder(
    ) {
        org.opennms.netmgt.config.threshd.Thresholder[] array = new org.opennms.netmgt.config.threshd.Thresholder[0];
        return (org.opennms.netmgt.config.threshd.Thresholder[]) this._thresholderList.toArray(array);
    }

    /**
     * Method getThresholderCollection.Returns a reference to
     * '_thresholderList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.Thresholder> getThresholderCollection(
    ) {
        return this._thresholderList;
    }

    /**
     * Method getThresholderCount.
     *
     * @return the size of this collection
     */
    public int getThresholderCount(
    ) {
        return this._thresholderList.size();
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
        if (_threads != null) {
           result = 37 * result + _threads.hashCode();
        }
        if (_packageList != null) {
           result = 37 * result + _packageList.hashCode();
        }
        if (_thresholderList != null) {
           result = 37 * result + _thresholderList.hashCode();
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
    public java.util.Iterator<org.opennms.netmgt.config.threshd.Package> iteratePackage(
    ) {
        return this._packageList.iterator();
    }

    /**
     * Method iterateThresholder.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.threshd.Thresholder> iterateThresholder(
    ) {
        return this._thresholderList.iterator();
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
     */
    public void removeAllThresholder(
    ) {
        this._thresholderList.clear();
    }

    /**
     * Method removePackage.
     *
     * @param vPackage
     * @return true if the object was removed from the collection.
     */
    public boolean removePackage(
            final org.opennms.netmgt.config.threshd.Package vPackage) {
        boolean removed = _packageList.remove(vPackage);
        return removed;
    }

    /**
     * Method removePackageAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.Package removePackageAt(
            final int index) {
        java.lang.Object obj = this._packageList.remove(index);
        return (org.opennms.netmgt.config.threshd.Package) obj;
    }

    /**
     * Method removeThresholder.
     *
     * @param vThresholder
     * @return true if the object was removed from the collection.
     */
    public boolean removeThresholder(
            final org.opennms.netmgt.config.threshd.Thresholder vThresholder) {
        boolean removed = _thresholderList.remove(vThresholder);
        return removed;
    }

    /**
     * Method removeThresholderAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.Thresholder removeThresholderAt(
            final int index) {
        java.lang.Object obj = this._thresholderList.remove(index);
        return (org.opennms.netmgt.config.threshd.Thresholder) obj;
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
            final org.opennms.netmgt.config.threshd.Package vPackage)
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
            final org.opennms.netmgt.config.threshd.Package[] vPackageArray) {
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
            final java.util.List<org.opennms.netmgt.config.threshd.Package> vPackageList) {
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
            final java.util.List<org.opennms.netmgt.config.threshd.Package> _packageList) {
        this._packageList = _packageList;
    }

    /**
     * Sets the value of field 'threads'. The field 'threads' has
     * the following description: Maximum number of threads used
     * for
     *  thresholding.
     *
     * @param threads the value of field 'threads'.
     */
    public void setThreads(
            final Integer threads) {
        this._threads = threads;
    }

    /**
     *
     *
     * @param index
     * @param vThresholder
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setThresholder(
            final int index,
            final org.opennms.netmgt.config.threshd.Thresholder vThresholder)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._thresholderList.size()) {
            throw new IndexOutOfBoundsException("setThresholder: Index value '" + index + "' not in range [0.." + (this._thresholderList.size() - 1) + "]");
        }

        this._thresholderList.set(index, vThresholder);
    }

    /**
     *
     *
     * @param vThresholderArray
     */
    public void setThresholder(
            final org.opennms.netmgt.config.threshd.Thresholder[] vThresholderArray) {
        //-- copy array
        _thresholderList.clear();

        for (int i = 0; i < vThresholderArray.length; i++) {
                this._thresholderList.add(vThresholderArray[i]);
        }
    }

    /**
     * Sets the value of '_thresholderList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vThresholderList the Vector to copy.
     */
    public void setThresholder(
            final java.util.List<org.opennms.netmgt.config.threshd.Thresholder> vThresholderList) {
        // copy vector
        this._thresholderList.clear();

        this._thresholderList.addAll(vThresholderList);
    }

    /**
     * Sets the value of '_thresholderList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param thresholderList the Vector to set.
     */
    public void setThresholderCollection(
            final java.util.List<org.opennms.netmgt.config.threshd.Thresholder> thresholderList) {
        this._thresholderList = thresholderList;
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
     * org.opennms.netmgt.config.threshd.ThreshdConfiguration
     */
    public static org.opennms.netmgt.config.threshd.ThreshdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.threshd.ThreshdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.threshd.ThreshdConfiguration.class, reader);
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
