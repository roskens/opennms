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
package org.opennms.netmgt.config.httpdatacollection;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Uris.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="uris")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("http-datacollection-config.xsd")
@SuppressWarnings("all") public class Uris implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _uriList.
     */
    private java.util.List<org.opennms.netmgt.config.httpdatacollection.Uri> _uriList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Uris() {
        super();
        this._uriList = new java.util.ArrayList<org.opennms.netmgt.config.httpdatacollection.Uri>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vUri
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUri(
            final org.opennms.netmgt.config.httpdatacollection.Uri vUri)
    throws java.lang.IndexOutOfBoundsException {
        this._uriList.add(vUri);
    }

    /**
     *
     *
     * @param index
     * @param vUri
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUri(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.Uri vUri)
    throws java.lang.IndexOutOfBoundsException {
        this._uriList.add(index, vUri);
    }

    /**
     * Method enumerateUri.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.httpdatacollection.Uri> enumerateUri(
    ) {
        return java.util.Collections.enumeration(this._uriList);
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

        if (obj instanceof Uris) {

            Uris temp = (Uris)obj;
            if (this._uriList != null) {
                if (temp._uriList == null) return false;
                else if (!(this._uriList.equals(temp._uriList)))
                    return false;
            }
            else if (temp._uriList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getUri.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.httpdatacollection.Uri at the
     * given index
     */
    public org.opennms.netmgt.config.httpdatacollection.Uri getUri(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._uriList.size()) {
            throw new IndexOutOfBoundsException("getUri: Index value '" + index + "' not in range [0.." + (this._uriList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.httpdatacollection.Uri) _uriList.get(index);
    }

    /**
     * Method getUri.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.httpdatacollection.Uri[] getUri(
    ) {
        org.opennms.netmgt.config.httpdatacollection.Uri[] array = new org.opennms.netmgt.config.httpdatacollection.Uri[0];
        return (org.opennms.netmgt.config.httpdatacollection.Uri[]) this._uriList.toArray(array);
    }

    /**
     * Method getUriCollection.Returns a reference to '_uriList'.
     * No type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.httpdatacollection.Uri> getUriCollection(
    ) {
        return this._uriList;
    }

    /**
     * Method getUriCount.
     *
     * @return the size of this collection
     */
    public int getUriCount(
    ) {
        return this._uriList.size();
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
        if (_uriList != null) {
           result = 37 * result + _uriList.hashCode();
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
     * Method iterateUri.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.httpdatacollection.Uri> iterateUri(
    ) {
        return this._uriList.iterator();
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
    public void removeAllUri(
    ) {
        this._uriList.clear();
    }

    /**
     * Method removeUri.
     *
     * @param vUri
     * @return true if the object was removed from the collection.
     */
    public boolean removeUri(
            final org.opennms.netmgt.config.httpdatacollection.Uri vUri) {
        boolean removed = _uriList.remove(vUri);
        return removed;
    }

    /**
     * Method removeUriAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.httpdatacollection.Uri removeUriAt(
            final int index) {
        java.lang.Object obj = this._uriList.remove(index);
        return (org.opennms.netmgt.config.httpdatacollection.Uri) obj;
    }

    /**
     *
     *
     * @param index
     * @param vUri
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUri(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.Uri vUri)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._uriList.size()) {
            throw new IndexOutOfBoundsException("setUri: Index value '" + index + "' not in range [0.." + (this._uriList.size() - 1) + "]");
        }

        this._uriList.set(index, vUri);
    }

    /**
     *
     *
     * @param vUriArray
     */
    public void setUri(
            final org.opennms.netmgt.config.httpdatacollection.Uri[] vUriArray) {
        //-- copy array
        _uriList.clear();

        for (int i = 0; i < vUriArray.length; i++) {
                this._uriList.add(vUriArray[i]);
        }
    }

    /**
     * Sets the value of '_uriList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vUriList the Vector to copy.
     */
    public void setUri(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.Uri> vUriList) {
        // copy vector
        this._uriList.clear();

        this._uriList.addAll(vUriList);
    }

    /**
     * Sets the value of '_uriList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param uriList the Vector to set.
     */
    public void setUriCollection(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.Uri> uriList) {
        this._uriList = uriList;
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
     * org.opennms.netmgt.config.httpdatacollection.Uris
     */
    public static org.opennms.netmgt.config.httpdatacollection.Uris unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Uris) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Uris.class, reader);
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
