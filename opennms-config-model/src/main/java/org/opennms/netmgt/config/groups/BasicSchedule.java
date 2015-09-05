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
package org.opennms.netmgt.config.groups;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class BasicSchedule.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="basicSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("groups.xsd")
@SuppressWarnings("all") public class BasicSchedule implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * outage name
     */
    @XmlAttribute(name="name")
    private java.lang.String _name;

    /**
     * outage type
     */
    @XmlAttribute(name="type")
    private java.lang.String _type;

    /**
     * defines start/end time for the outage
     */
    @XmlElement(name="time")
    private java.util.List<org.opennms.netmgt.config.groups.Time> _timeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BasicSchedule() {
        super();
        this._timeList = new java.util.ArrayList<org.opennms.netmgt.config.groups.Time>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vTime
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTime(
            final org.opennms.netmgt.config.groups.Time vTime)
    throws java.lang.IndexOutOfBoundsException {
        this._timeList.add(vTime);
    }

    /**
     *
     *
     * @param index
     * @param vTime
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTime(
            final int index,
            final org.opennms.netmgt.config.groups.Time vTime)
    throws java.lang.IndexOutOfBoundsException {
        this._timeList.add(index, vTime);
    }

    /**
     * Method enumerateTime.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.groups.Time> enumerateTime(
    ) {
        return java.util.Collections.enumeration(this._timeList);
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

        if (obj instanceof BasicSchedule) {

            BasicSchedule temp = (BasicSchedule)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type)))
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._timeList != null) {
                if (temp._timeList == null) return false;
                else if (!(this._timeList.equals(temp._timeList)))
                    return false;
            }
            else if (temp._timeList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: outage name
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getTime.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.groups.Time at the given index
     */
    public org.opennms.netmgt.config.groups.Time getTime(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._timeList.size()) {
            throw new IndexOutOfBoundsException("getTime: Index value '" + index + "' not in range [0.." + (this._timeList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.groups.Time) _timeList.get(index);
    }

    /**
     * Method getTime.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.groups.Time[] getTime(
    ) {
        org.opennms.netmgt.config.groups.Time[] array = new org.opennms.netmgt.config.groups.Time[0];
        return (org.opennms.netmgt.config.groups.Time[]) this._timeList.toArray(array);
    }

    /**
     * Method getTimeCollection.Returns a reference to '_timeList'.
     * No type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.groups.Time> getTimeCollection(
    ) {
        return this._timeList;
    }

    /**
     * Method getTimeCount.
     *
     * @return the size of this collection
     */
    public int getTimeCount(
    ) {
        return this._timeList.size();
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: outage type
     *
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_timeList != null) {
           result = 37 * result + _timeList.hashCode();
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
     * Method iterateTime.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.groups.Time> iterateTime(
    ) {
        return this._timeList.iterator();
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
    public void removeAllTime(
    ) {
        this._timeList.clear();
    }

    /**
     * Method removeTime.
     *
     * @param vTime
     * @return true if the object was removed from the collection.
     */
    public boolean removeTime(
            final org.opennms.netmgt.config.groups.Time vTime) {
        boolean removed = _timeList.remove(vTime);
        return removed;
    }

    /**
     * Method removeTimeAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.groups.Time removeTimeAt(
            final int index) {
        java.lang.Object obj = this._timeList.remove(index);
        return (org.opennms.netmgt.config.groups.Time) obj;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: outage name
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
     * @param vTime
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTime(
            final int index,
            final org.opennms.netmgt.config.groups.Time vTime)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._timeList.size()) {
            throw new IndexOutOfBoundsException("setTime: Index value '" + index + "' not in range [0.." + (this._timeList.size() - 1) + "]");
        }

        this._timeList.set(index, vTime);
    }

    /**
     *
     *
     * @param vTimeArray
     */
    public void setTime(
            final org.opennms.netmgt.config.groups.Time[] vTimeArray) {
        //-- copy array
        _timeList.clear();

        for (int i = 0; i < vTimeArray.length; i++) {
                this._timeList.add(vTimeArray[i]);
        }
    }

    /**
     * Sets the value of '_timeList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vTimeList the Vector to copy.
     */
    public void setTime(
            final java.util.List<org.opennms.netmgt.config.groups.Time> vTimeList) {
        // copy vector
        this._timeList.clear();

        this._timeList.addAll(vTimeList);
    }

    /**
     * Sets the value of '_timeList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param timeList the Vector to set.
     */
    public void setTimeCollection(
            final java.util.List<org.opennms.netmgt.config.groups.Time> timeList) {
        this._timeList = timeList;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: outage type
     *
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
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
     * org.opennms.netmgt.config.groups.BasicSchedule
     */
    public static org.opennms.netmgt.config.groups.BasicSchedule unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.groups.BasicSchedule) Unmarshaller.unmarshal(org.opennms.netmgt.config.groups.BasicSchedule.class, reader);
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
