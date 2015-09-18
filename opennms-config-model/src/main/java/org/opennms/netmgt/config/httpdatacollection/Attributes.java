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
 * Class Attributes.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "attributes")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("http-datacollection-config.xsd")
@SuppressWarnings("all")
public class Attributes implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _attribList.
     */
    @XmlElement(name = "attrib")
    private java.util.List<org.opennms.netmgt.config.httpdatacollection.Attrib> _attribList;

      //----------------/
    //- Constructors -/
    //----------------/
    public Attributes() {
        super();
        this._attribList = new java.util.ArrayList<org.opennms.netmgt.config.httpdatacollection.Attrib>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vAttrib
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttrib(
            final org.opennms.netmgt.config.httpdatacollection.Attrib vAttrib)
            throws java.lang.IndexOutOfBoundsException {
        this._attribList.add(vAttrib);
    }

    /**
     *
     *
     * @param index
     * @param vAttrib
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttrib(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.Attrib vAttrib)
            throws java.lang.IndexOutOfBoundsException {
        this._attribList.add(index, vAttrib);
    }

    /**
     * Method enumerateAttrib.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.httpdatacollection.Attrib> enumerateAttrib() {
        return java.util.Collections.enumeration(this._attribList);
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

        if (obj instanceof Attributes) {

            Attributes temp = (Attributes) obj;
            if (this._attribList != null) {
                if (temp._attribList == null) {
                    return false;
                } else if (!(this._attribList.equals(temp._attribList))) {
                    return false;
                }
            } else if (temp._attribList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Method getAttrib.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.httpdatacollection.Attrib at the
     * given index
     */
    public org.opennms.netmgt.config.httpdatacollection.Attrib getAttrib(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attribList.size()) {
            throw new IndexOutOfBoundsException("getAttrib: Index value '" + index + "' not in range [0.." + (this._attribList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.httpdatacollection.Attrib) _attribList.get(index);
    }

    /**
     * Method getAttrib.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.httpdatacollection.Attrib[] getAttrib() {
        org.opennms.netmgt.config.httpdatacollection.Attrib[] array = new org.opennms.netmgt.config.httpdatacollection.Attrib[0];
        return (org.opennms.netmgt.config.httpdatacollection.Attrib[]) this._attribList.toArray(array);
    }

    /**
     * Method getAttribCollection.Returns a reference to
     * '_attribList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.httpdatacollection.Attrib> getAttribCollection() {
        return this._attribList;
    }

    /**
     * Method getAttribCount.
     *
     * @return the size of this collection
     */
    public int getAttribCount() {
        return this._attribList.size();
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
        if (_attribList != null) {
            result = 37 * result + _attribList.hashCode();
        }

        return result;
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
     * Method iterateAttrib.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.httpdatacollection.Attrib> iterateAttrib() {
        return this._attribList.iterator();
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
    public void removeAllAttrib() {
        this._attribList.clear();
    }

    /**
     * Method removeAttrib.
     *
     * @param vAttrib
     * @return true if the object was removed from the collection.
     */
    public boolean removeAttrib(
            final org.opennms.netmgt.config.httpdatacollection.Attrib vAttrib) {
        boolean removed = _attribList.remove(vAttrib);
        return removed;
    }

    /**
     * Method removeAttribAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.httpdatacollection.Attrib removeAttribAt(
            final int index) {
        java.lang.Object obj = this._attribList.remove(index);
        return (org.opennms.netmgt.config.httpdatacollection.Attrib) obj;
    }

    /**
     *
     *
     * @param index
     * @param vAttrib
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttrib(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.Attrib vAttrib)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attribList.size()) {
            throw new IndexOutOfBoundsException("setAttrib: Index value '" + index + "' not in range [0.." + (this._attribList.size() - 1) + "]");
        }

        this._attribList.set(index, vAttrib);
    }

    /**
     *
     *
     * @param vAttribArray
     */
    public void setAttrib(
            final org.opennms.netmgt.config.httpdatacollection.Attrib[] vAttribArray) {
        //-- copy array
        _attribList.clear();

        for (int i = 0; i < vAttribArray.length; i++) {
            this._attribList.add(vAttribArray[i]);
        }
    }

    /**
     * Sets the value of '_attribList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vAttribList the Vector to copy.
     */
    public void setAttrib(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.Attrib> vAttribList) {
        // copy vector
        this._attribList.clear();

        this._attribList.addAll(vAttribList);
    }

    /**
     * Sets the value of '_attribList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param attribList the Vector to set.
     */
    public void setAttribCollection(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.Attrib> attribList) {
        this._attribList = attribList;
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
     * org.opennms.netmgt.config.httpdatacollection.Attributes
     */
    public static org.opennms.netmgt.config.httpdatacollection.Attributes unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Attributes) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Attributes.class, reader);
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
