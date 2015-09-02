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
package org.opennms.netmgt.config.notifd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AutoAcknowledgeAlarm.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="auto-acknowledge-alarm")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("notifd-configuration.xsd")
@SuppressWarnings("all") public class AutoAcknowledgeAlarm implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resolutionPrefix.
     */
    private java.lang.String _resolutionPrefix = "RESOLVED: ";

    /**
     * Field _notify.
     */
    private boolean _notify = true;

    /**
     * keeps track of state for field: _notify
     */
    private boolean _has_notify;

    /**
     * Field _ueiList.
     */
    private java.util.List<java.lang.String> _ueiList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AutoAcknowledgeAlarm() {
        super();
        setResolutionPrefix("RESOLVED: ");
        this._ueiList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUei(
            final java.lang.String vUei)
    throws java.lang.IndexOutOfBoundsException {
        this._ueiList.add(vUei);
    }

    /**
     *
     *
     * @param index
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUei(
            final int index,
            final java.lang.String vUei)
    throws java.lang.IndexOutOfBoundsException {
        this._ueiList.add(index, vUei);
    }

    /**
     */
    public void deleteNotify(
    ) {
        this._has_notify= false;
    }

    /**
     * Method enumerateUei.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateUei(
    ) {
        return java.util.Collections.enumeration(this._ueiList);
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

        if (obj instanceof AutoAcknowledgeAlarm) {

            AutoAcknowledgeAlarm temp = (AutoAcknowledgeAlarm)obj;
            if (this._resolutionPrefix != null) {
                if (temp._resolutionPrefix == null) return false;
                else if (!(this._resolutionPrefix.equals(temp._resolutionPrefix)))
                    return false;
            }
            else if (temp._resolutionPrefix != null)
                return false;
            if (this._notify != temp._notify)
                return false;
            if (this._has_notify != temp._has_notify)
                return false;
            if (this._ueiList != null) {
                if (temp._ueiList == null) return false;
                else if (!(this._ueiList.equals(temp._ueiList)))
                    return false;
            }
            else if (temp._ueiList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'notify'.
     *
     * @return the value of field 'Notify'.
     */
    public boolean getNotify(
    ) {
        return this._notify;
    }

    /**
     * Returns the value of field 'resolutionPrefix'.
     *
     * @return the value of field 'ResolutionPrefix'.
     */
    public java.lang.String getResolutionPrefix(
    ) {
        return this._resolutionPrefix;
    }

    /**
     * Method getUei.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getUei(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiList.size()) {
            throw new IndexOutOfBoundsException("getUei: Index value '" + index + "' not in range [0.." + (this._ueiList.size() - 1) + "]");
        }

        return (java.lang.String) _ueiList.get(index);
    }

    /**
     * Method getUei.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getUei(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._ueiList.toArray(array);
    }

    /**
     * Method getUeiCollection.Returns a reference to '_ueiList'.
     * No type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getUeiCollection(
    ) {
        return this._ueiList;
    }

    /**
     * Method getUeiCount.
     *
     * @return the size of this collection
     */
    public int getUeiCount(
    ) {
        return this._ueiList.size();
    }

    /**
     * Method hasNotify.
     *
     * @return true if at least one Notify has been added
     */
    public boolean hasNotify(
    ) {
        return this._has_notify;
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
        if (_resolutionPrefix != null) {
           result = 37 * result + _resolutionPrefix.hashCode();
        }
        result = 37 * result + (_notify?0:1);
        if (_ueiList != null) {
           result = 37 * result + _ueiList.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'notify'.
     *
     * @return the value of field 'Notify'.
     */
    public boolean isNotify(
    ) {
        return this._notify;
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
     * Method iterateUei.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateUei(
    ) {
        return this._ueiList.iterator();
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
    public void removeAllUei(
    ) {
        this._ueiList.clear();
    }

    /**
     * Method removeUei.
     *
     * @param vUei
     * @return true if the object was removed from the collection.
     */
    public boolean removeUei(
            final java.lang.String vUei) {
        boolean removed = _ueiList.remove(vUei);
        return removed;
    }

    /**
     * Method removeUeiAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeUeiAt(
            final int index) {
        java.lang.Object obj = this._ueiList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'notify'.
     *
     * @param notify the value of field 'notify'.
     */
    public void setNotify(
            final boolean notify) {
        this._notify = notify;
        this._has_notify = true;
    }

    /**
     * Sets the value of field 'resolutionPrefix'.
     *
     * @param resolutionPrefix the value of field 'resolutionPrefix'
     */
    public void setResolutionPrefix(
            final java.lang.String resolutionPrefix) {
        this._resolutionPrefix = resolutionPrefix;
    }

    /**
     *
     *
     * @param index
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUei(
            final int index,
            final java.lang.String vUei)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiList.size()) {
            throw new IndexOutOfBoundsException("setUei: Index value '" + index + "' not in range [0.." + (this._ueiList.size() - 1) + "]");
        }

        this._ueiList.set(index, vUei);
    }

    /**
     *
     *
     * @param vUeiArray
     */
    public void setUei(
            final java.lang.String[] vUeiArray) {
        //-- copy array
        _ueiList.clear();

        for (int i = 0; i < vUeiArray.length; i++) {
                this._ueiList.add(vUeiArray[i]);
        }
    }

    /**
     * Sets the value of '_ueiList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vUeiList the Vector to copy.
     */
    public void setUei(
            final java.util.List<java.lang.String> vUeiList) {
        // copy vector
        this._ueiList.clear();

        this._ueiList.addAll(vUeiList);
    }

    /**
     * Sets the value of '_ueiList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param ueiList the Vector to set.
     */
    public void setUeiCollection(
            final java.util.List<java.lang.String> ueiList) {
        this._ueiList = ueiList;
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
     * org.opennms.netmgt.config.notifd.AutoAcknowledgeAlarm
     */
    public static org.opennms.netmgt.config.notifd.AutoAcknowledgeAlarm unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifd.AutoAcknowledgeAlarm) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifd.AutoAcknowledgeAlarm.class, reader);
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
