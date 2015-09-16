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
package org.opennms.report.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Row.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="row")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class Row implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _valueList.
     */
    @XmlElement(name="value")
    private java.util.List<org.opennms.report.availability.Value> _valueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Row() {
        super();
        this._valueList = new java.util.ArrayList<org.opennms.report.availability.Value>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValue(
            final org.opennms.report.availability.Value vValue)
    throws java.lang.IndexOutOfBoundsException {
        this._valueList.add(vValue);
    }

    /**
     *
     *
     * @param index
     * @param vValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValue(
            final int index,
            final org.opennms.report.availability.Value vValue)
    throws java.lang.IndexOutOfBoundsException {
        this._valueList.add(index, vValue);
    }

    /**
     * Method enumerateValue.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.availability.Value> enumerateValue(
    ) {
        return java.util.Collections.enumeration(this._valueList);
    }

    /**
     * Method getValue.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.availability.Value at the given index
     */
    public org.opennms.report.availability.Value getValue(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueList.size()) {
            throw new IndexOutOfBoundsException("getValue: Index value '" + index + "' not in range [0.." + (this._valueList.size() - 1) + "]");
        }

        return (org.opennms.report.availability.Value) _valueList.get(index);
    }

    /**
     * Method getValue.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.report.availability.Value[] getValue(
    ) {
        org.opennms.report.availability.Value[] array = new org.opennms.report.availability.Value[0];
        return (org.opennms.report.availability.Value[]) this._valueList.toArray(array);
    }

    /**
     * Method getValueCollection.Returns a reference to
     * '_valueList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.availability.Value> getValueCollection(
    ) {
        return this._valueList;
    }

    /**
     * Method getValueCount.
     *
     * @return the size of this collection
     */
    public int getValueCount(
    ) {
        return this._valueList.size();
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
     * Method iterateValue.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.availability.Value> iterateValue(
    ) {
        return this._valueList.iterator();
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
    public void removeAllValue(
    ) {
        this._valueList.clear();
    }

    /**
     * Method removeValue.
     *
     * @param vValue
     * @return true if the object was removed from the collection.
     */
    public boolean removeValue(
            final org.opennms.report.availability.Value vValue) {
        boolean removed = _valueList.remove(vValue);
        return removed;
    }

    /**
     * Method removeValueAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.availability.Value removeValueAt(
            final int index) {
        java.lang.Object obj = this._valueList.remove(index);
        return (org.opennms.report.availability.Value) obj;
    }

    /**
     *
     *
     * @param index
     * @param vValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setValue(
            final int index,
            final org.opennms.report.availability.Value vValue)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueList.size()) {
            throw new IndexOutOfBoundsException("setValue: Index value '" + index + "' not in range [0.." + (this._valueList.size() - 1) + "]");
        }

        this._valueList.set(index, vValue);
    }

    /**
     *
     *
     * @param vValueArray
     */
    public void setValue(
            final org.opennms.report.availability.Value[] vValueArray) {
        //-- copy array
        _valueList.clear();

        for (int i = 0; i < vValueArray.length; i++) {
                this._valueList.add(vValueArray[i]);
        }
    }

    /**
     * Sets the value of '_valueList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vValueList the Vector to copy.
     */
    public void setValue(
            final java.util.List<org.opennms.report.availability.Value> vValueList) {
        // copy vector
        this._valueList.clear();

        this._valueList.addAll(vValueList);
    }

    /**
     * Sets the value of '_valueList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param valueList the Vector to set.
     */
    public void setValueCollection(
            final java.util.List<org.opennms.report.availability.Value> valueList) {
        this._valueList = valueList;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.availability.Row
     */
    public static org.opennms.report.availability.Row unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Row) Unmarshaller.unmarshal(org.opennms.report.availability.Row.class, reader);
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
