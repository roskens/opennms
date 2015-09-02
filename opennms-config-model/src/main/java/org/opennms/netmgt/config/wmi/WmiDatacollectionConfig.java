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
package org.opennms.netmgt.config.wmi;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class WmiDatacollectionConfig.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="wmi-datacollection-config")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("wmi-datacollection.xsd")
@SuppressWarnings("all") public class WmiDatacollectionConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _rrdRepository.
     */
    private java.lang.String _rrdRepository;

    /**
     * A grouping of WMI related RRD parms and WMI object groups
     */
    private java.util.List<org.opennms.netmgt.config.wmi.WmiCollection> _wmiCollectionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WmiDatacollectionConfig() {
        super();
        this._wmiCollectionList = new java.util.ArrayList<org.opennms.netmgt.config.wmi.WmiCollection>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vWmiCollection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addWmiCollection(
            final org.opennms.netmgt.config.wmi.WmiCollection vWmiCollection)
    throws java.lang.IndexOutOfBoundsException {
        this._wmiCollectionList.add(vWmiCollection);
    }

    /**
     *
     *
     * @param index
     * @param vWmiCollection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addWmiCollection(
            final int index,
            final org.opennms.netmgt.config.wmi.WmiCollection vWmiCollection)
    throws java.lang.IndexOutOfBoundsException {
        this._wmiCollectionList.add(index, vWmiCollection);
    }

    /**
     * Method enumerateWmiCollection.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.wmi.WmiCollection> enumerateWmiCollection(
    ) {
        return java.util.Collections.enumeration(this._wmiCollectionList);
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

        if (obj instanceof WmiDatacollectionConfig) {

            WmiDatacollectionConfig temp = (WmiDatacollectionConfig)obj;
            if (this._rrdRepository != null) {
                if (temp._rrdRepository == null) return false;
                else if (!(this._rrdRepository.equals(temp._rrdRepository)))
                    return false;
            }
            else if (temp._rrdRepository != null)
                return false;
            if (this._wmiCollectionList != null) {
                if (temp._wmiCollectionList == null) return false;
                else if (!(this._wmiCollectionList.equals(temp._wmiCollectionList)))
                    return false;
            }
            else if (temp._wmiCollectionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'rrdRepository'.
     *
     * @return the value of field 'RrdRepository'.
     */
    public java.lang.String getRrdRepository(
    ) {
        return this._rrdRepository;
    }

    /**
     * Method getWmiCollection.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.wmi.WmiCollection at the given inde
     */
    public org.opennms.netmgt.config.wmi.WmiCollection getWmiCollection(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._wmiCollectionList.size()) {
            throw new IndexOutOfBoundsException("getWmiCollection: Index value '" + index + "' not in range [0.." + (this._wmiCollectionList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.wmi.WmiCollection) _wmiCollectionList.get(index);
    }

    /**
     * Method getWmiCollection.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.wmi.WmiCollection[] getWmiCollection(
    ) {
        org.opennms.netmgt.config.wmi.WmiCollection[] array = new org.opennms.netmgt.config.wmi.WmiCollection[0];
        return (org.opennms.netmgt.config.wmi.WmiCollection[]) this._wmiCollectionList.toArray(array);
    }

    /**
     * Method getWmiCollectionCollection.Returns a reference to
     * '_wmiCollectionList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.wmi.WmiCollection> getWmiCollectionCollection(
    ) {
        return this._wmiCollectionList;
    }

    /**
     * Method getWmiCollectionCount.
     *
     * @return the size of this collection
     */
    public int getWmiCollectionCount(
    ) {
        return this._wmiCollectionList.size();
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
        if (_rrdRepository != null) {
           result = 37 * result + _rrdRepository.hashCode();
        }
        if (_wmiCollectionList != null) {
           result = 37 * result + _wmiCollectionList.hashCode();
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
     * Method iterateWmiCollection.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.wmi.WmiCollection> iterateWmiCollection(
    ) {
        return this._wmiCollectionList.iterator();
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
    public void removeAllWmiCollection(
    ) {
        this._wmiCollectionList.clear();
    }

    /**
     * Method removeWmiCollection.
     *
     * @param vWmiCollection
     * @return true if the object was removed from the collection.
     */
    public boolean removeWmiCollection(
            final org.opennms.netmgt.config.wmi.WmiCollection vWmiCollection) {
        boolean removed = _wmiCollectionList.remove(vWmiCollection);
        return removed;
    }

    /**
     * Method removeWmiCollectionAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.wmi.WmiCollection removeWmiCollectionAt(
            final int index) {
        java.lang.Object obj = this._wmiCollectionList.remove(index);
        return (org.opennms.netmgt.config.wmi.WmiCollection) obj;
    }

    /**
     * Sets the value of field 'rrdRepository'.
     *
     * @param rrdRepository the value of field 'rrdRepository'.
     */
    public void setRrdRepository(
            final java.lang.String rrdRepository) {
        this._rrdRepository = rrdRepository;
    }

    /**
     *
     *
     * @param index
     * @param vWmiCollection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setWmiCollection(
            final int index,
            final org.opennms.netmgt.config.wmi.WmiCollection vWmiCollection)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._wmiCollectionList.size()) {
            throw new IndexOutOfBoundsException("setWmiCollection: Index value '" + index + "' not in range [0.." + (this._wmiCollectionList.size() - 1) + "]");
        }

        this._wmiCollectionList.set(index, vWmiCollection);
    }

    /**
     *
     *
     * @param vWmiCollectionArray
     */
    public void setWmiCollection(
            final org.opennms.netmgt.config.wmi.WmiCollection[] vWmiCollectionArray) {
        //-- copy array
        _wmiCollectionList.clear();

        for (int i = 0; i < vWmiCollectionArray.length; i++) {
                this._wmiCollectionList.add(vWmiCollectionArray[i]);
        }
    }

    /**
     * Sets the value of '_wmiCollectionList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vWmiCollectionList the Vector to copy.
     */
    public void setWmiCollection(
            final java.util.List<org.opennms.netmgt.config.wmi.WmiCollection> vWmiCollectionList) {
        // copy vector
        this._wmiCollectionList.clear();

        this._wmiCollectionList.addAll(vWmiCollectionList);
    }

    /**
     * Sets the value of '_wmiCollectionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param wmiCollectionList the Vector to set.
     */
    public void setWmiCollectionCollection(
            final java.util.List<org.opennms.netmgt.config.wmi.WmiCollection> wmiCollectionList) {
        this._wmiCollectionList = wmiCollectionList;
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
     * org.opennms.netmgt.config.wmi.WmiDatacollectionConfig
     */
    public static org.opennms.netmgt.config.wmi.WmiDatacollectionConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.wmi.WmiDatacollectionConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.wmi.WmiDatacollectionConfig.class, reader);
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
