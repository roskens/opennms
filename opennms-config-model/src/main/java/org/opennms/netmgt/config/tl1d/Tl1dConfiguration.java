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
package org.opennms.netmgt.config.tl1d;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Tl1dConfiguration.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="tl1d-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("tl1d-configuration.xsd")
@SuppressWarnings("all") public class Tl1dConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tl1ElementList.
     */
    @XmlElement(name="tl1-element")
    private java.util.List<org.opennms.netmgt.config.tl1d.Tl1Element> _tl1ElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Tl1dConfiguration() {
        super();
        this._tl1ElementList = new java.util.ArrayList<org.opennms.netmgt.config.tl1d.Tl1Element>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vTl1Element
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTl1Element(
            final org.opennms.netmgt.config.tl1d.Tl1Element vTl1Element)
    throws java.lang.IndexOutOfBoundsException {
        this._tl1ElementList.add(vTl1Element);
    }

    /**
     *
     *
     * @param index
     * @param vTl1Element
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTl1Element(
            final int index,
            final org.opennms.netmgt.config.tl1d.Tl1Element vTl1Element)
    throws java.lang.IndexOutOfBoundsException {
        this._tl1ElementList.add(index, vTl1Element);
    }

    /**
     * Method enumerateTl1Element.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.tl1d.Tl1Element> enumerateTl1Element(
    ) {
        return java.util.Collections.enumeration(this._tl1ElementList);
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

        if (obj instanceof Tl1dConfiguration) {

            Tl1dConfiguration temp = (Tl1dConfiguration)obj;
            if (this._tl1ElementList != null) {
                if (temp._tl1ElementList == null) return false;
                else if (!(this._tl1ElementList.equals(temp._tl1ElementList)))
                    return false;
            }
            else if (temp._tl1ElementList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getTl1Element.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.tl1d.Tl1Element at the given index
     */
    public org.opennms.netmgt.config.tl1d.Tl1Element getTl1Element(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tl1ElementList.size()) {
            throw new IndexOutOfBoundsException("getTl1Element: Index value '" + index + "' not in range [0.." + (this._tl1ElementList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.tl1d.Tl1Element) _tl1ElementList.get(index);
    }

    /**
     * Method getTl1Element.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.tl1d.Tl1Element[] getTl1Element(
    ) {
        org.opennms.netmgt.config.tl1d.Tl1Element[] array = new org.opennms.netmgt.config.tl1d.Tl1Element[0];
        return (org.opennms.netmgt.config.tl1d.Tl1Element[]) this._tl1ElementList.toArray(array);
    }

    /**
     * Method getTl1ElementCollection.Returns a reference to
     * '_tl1ElementList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.tl1d.Tl1Element> getTl1ElementCollection(
    ) {
        return this._tl1ElementList;
    }

    /**
     * Method getTl1ElementCount.
     *
     * @return the size of this collection
     */
    public int getTl1ElementCount(
    ) {
        return this._tl1ElementList.size();
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
        if (_tl1ElementList != null) {
           result = 37 * result + _tl1ElementList.hashCode();
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
     * Method iterateTl1Element.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.tl1d.Tl1Element> iterateTl1Element(
    ) {
        return this._tl1ElementList.iterator();
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
    public void removeAllTl1Element(
    ) {
        this._tl1ElementList.clear();
    }

    /**
     * Method removeTl1Element.
     *
     * @param vTl1Element
     * @return true if the object was removed from the collection.
     */
    public boolean removeTl1Element(
            final org.opennms.netmgt.config.tl1d.Tl1Element vTl1Element) {
        boolean removed = _tl1ElementList.remove(vTl1Element);
        return removed;
    }

    /**
     * Method removeTl1ElementAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.tl1d.Tl1Element removeTl1ElementAt(
            final int index) {
        java.lang.Object obj = this._tl1ElementList.remove(index);
        return (org.opennms.netmgt.config.tl1d.Tl1Element) obj;
    }

    /**
     *
     *
     * @param index
     * @param vTl1Element
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTl1Element(
            final int index,
            final org.opennms.netmgt.config.tl1d.Tl1Element vTl1Element)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tl1ElementList.size()) {
            throw new IndexOutOfBoundsException("setTl1Element: Index value '" + index + "' not in range [0.." + (this._tl1ElementList.size() - 1) + "]");
        }

        this._tl1ElementList.set(index, vTl1Element);
    }

    /**
     *
     *
     * @param vTl1ElementArray
     */
    public void setTl1Element(
            final org.opennms.netmgt.config.tl1d.Tl1Element[] vTl1ElementArray) {
        //-- copy array
        _tl1ElementList.clear();

        for (int i = 0; i < vTl1ElementArray.length; i++) {
                this._tl1ElementList.add(vTl1ElementArray[i]);
        }
    }

    /**
     * Sets the value of '_tl1ElementList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vTl1ElementList the Vector to copy.
     */
    public void setTl1Element(
            final java.util.List<org.opennms.netmgt.config.tl1d.Tl1Element> vTl1ElementList) {
        // copy vector
        this._tl1ElementList.clear();

        this._tl1ElementList.addAll(vTl1ElementList);
    }

    /**
     * Sets the value of '_tl1ElementList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param tl1ElementList the Vector to set.
     */
    public void setTl1ElementCollection(
            final java.util.List<org.opennms.netmgt.config.tl1d.Tl1Element> tl1ElementList) {
        this._tl1ElementList = tl1ElementList;
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
     * org.opennms.netmgt.config.tl1d.Tl1dConfiguration
     */
    public static org.opennms.netmgt.config.tl1d.Tl1dConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.tl1d.Tl1dConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.tl1d.Tl1dConfiguration.class, reader);
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
