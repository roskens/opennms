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
package org.opennms.netmgt.jasper.rrdtool;

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
@ValidateUsing("rrdtool-xport.xsd")
@SuppressWarnings("all") public class Row implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _t.
     */
    @XmlElement(name="t")
    private org.opennms.netmgt.jasper.rrdtool.T _t;

    /**
     * Field _vList.
     */
    @XmlElement(name="v")
    private java.util.List<org.opennms.netmgt.jasper.rrdtool.V> _vList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Row() {
        super();
        this._vList = new java.util.ArrayList<org.opennms.netmgt.jasper.rrdtool.V>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vV
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addV(
            final org.opennms.netmgt.jasper.rrdtool.V vV)
    throws java.lang.IndexOutOfBoundsException {
        this._vList.add(vV);
    }

    /**
     *
     *
     * @param index
     * @param vV
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addV(
            final int index,
            final org.opennms.netmgt.jasper.rrdtool.V vV)
    throws java.lang.IndexOutOfBoundsException {
        this._vList.add(index, vV);
    }

    /**
     * Method enumerateV.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.jasper.rrdtool.V> enumerateV(
    ) {
        return java.util.Collections.enumeration(this._vList);
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

        if (obj instanceof Row) {

            Row temp = (Row)obj;
            if (this._t != null) {
                if (temp._t == null) return false;
                else if (!(this._t.equals(temp._t)))
                    return false;
            }
            else if (temp._t != null)
                return false;
            if (this._vList != null) {
                if (temp._vList == null) return false;
                else if (!(this._vList.equals(temp._vList)))
                    return false;
            }
            else if (temp._vList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 't'.
     *
     * @return the value of field 'T'.
     */
    public org.opennms.netmgt.jasper.rrdtool.T getT(
    ) {
        return this._t;
    }

    /**
     * Method getV.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.opennms.netmgt.jasper.rrdtool.V
     * at the given index
     */
    public org.opennms.netmgt.jasper.rrdtool.V getV(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._vList.size()) {
            throw new IndexOutOfBoundsException("getV: Index value '" + index + "' not in range [0.." + (this._vList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.jasper.rrdtool.V) _vList.get(index);
    }

    /**
     * Method getV.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.jasper.rrdtool.V[] getV(
    ) {
        org.opennms.netmgt.jasper.rrdtool.V[] array = new org.opennms.netmgt.jasper.rrdtool.V[0];
        return (org.opennms.netmgt.jasper.rrdtool.V[]) this._vList.toArray(array);
    }

    /**
     * Method getVCollection.Returns a reference to '_vList'. No
     * type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.jasper.rrdtool.V> getVCollection(
    ) {
        return this._vList;
    }

    /**
     * Method getVCount.
     *
     * @return the size of this collection
     */
    public int getVCount(
    ) {
        return this._vList.size();
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
        if (_t != null) {
           result = 37 * result + _t.hashCode();
        }
        if (_vList != null) {
           result = 37 * result + _vList.hashCode();
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
     * Method iterateV.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.jasper.rrdtool.V> iterateV(
    ) {
        return this._vList.iterator();
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
    public void removeAllV(
    ) {
        this._vList.clear();
    }

    /**
     * Method removeV.
     *
     * @param vV
     * @return true if the object was removed from the collection.
     */
    public boolean removeV(
            final org.opennms.netmgt.jasper.rrdtool.V vV) {
        boolean removed = _vList.remove(vV);
        return removed;
    }

    /**
     * Method removeVAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.jasper.rrdtool.V removeVAt(
            final int index) {
        java.lang.Object obj = this._vList.remove(index);
        return (org.opennms.netmgt.jasper.rrdtool.V) obj;
    }

    /**
     * Sets the value of field 't'.
     *
     * @param t the value of field 't'.
     */
    public void setT(
            final org.opennms.netmgt.jasper.rrdtool.T t) {
        this._t = t;
    }

    /**
     *
     *
     * @param index
     * @param vV
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setV(
            final int index,
            final org.opennms.netmgt.jasper.rrdtool.V vV)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._vList.size()) {
            throw new IndexOutOfBoundsException("setV: Index value '" + index + "' not in range [0.." + (this._vList.size() - 1) + "]");
        }

        this._vList.set(index, vV);
    }

    /**
     *
     *
     * @param vVArray
     */
    public void setV(
            final org.opennms.netmgt.jasper.rrdtool.V[] vVArray) {
        //-- copy array
        _vList.clear();

        for (int i = 0; i < vVArray.length; i++) {
                this._vList.add(vVArray[i]);
        }
    }

    /**
     * Sets the value of '_vList' by copying the given Vector. All
     * elements will be checked for type safety.
     *
     * @param vVList the Vector to copy.
     */
    public void setV(
            final java.util.List<org.opennms.netmgt.jasper.rrdtool.V> vVList) {
        // copy vector
        this._vList.clear();

        this._vList.addAll(vVList);
    }

    /**
     * Sets the value of '_vList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param vList the Vector to set.
     */
    public void setVCollection(
            final java.util.List<org.opennms.netmgt.jasper.rrdtool.V> vList) {
        this._vList = vList;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.jasper.rrdtool.Row
     */
    public static org.opennms.netmgt.jasper.rrdtool.Row unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.jasper.rrdtool.Row) Unmarshaller.unmarshal(org.opennms.netmgt.jasper.rrdtool.Row.class, reader);
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
