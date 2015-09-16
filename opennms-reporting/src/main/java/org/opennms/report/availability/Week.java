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
 * Class Week.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="week")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class Week implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dayList.
     */
    @XmlElement(name="day")
    private java.util.List<org.opennms.report.availability.Day> _dayList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Week() {
        super();
        this._dayList = new java.util.ArrayList<org.opennms.report.availability.Day>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vDay
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDay(
            final org.opennms.report.availability.Day vDay)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._dayList.size() >= 7) {
            throw new IndexOutOfBoundsException("addDay has a maximum of 7");
        }

        this._dayList.add(vDay);
    }

    /**
     *
     *
     * @param index
     * @param vDay
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDay(
            final int index,
            final org.opennms.report.availability.Day vDay)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._dayList.size() >= 7) {
            throw new IndexOutOfBoundsException("addDay has a maximum of 7");
        }

        this._dayList.add(index, vDay);
    }

    /**
     * Method enumerateDay.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.availability.Day> enumerateDay(
    ) {
        return java.util.Collections.enumeration(this._dayList);
    }

    /**
     * Method getDay.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.opennms.report.availability.Day
     * at the given index
     */
    public org.opennms.report.availability.Day getDay(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dayList.size()) {
            throw new IndexOutOfBoundsException("getDay: Index value '" + index + "' not in range [0.." + (this._dayList.size() - 1) + "]");
        }

        return (org.opennms.report.availability.Day) _dayList.get(index);
    }

    /**
     * Method getDay.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.report.availability.Day[] getDay(
    ) {
        org.opennms.report.availability.Day[] array = new org.opennms.report.availability.Day[0];
        return (org.opennms.report.availability.Day[]) this._dayList.toArray(array);
    }

    /**
     * Method getDayCollection.Returns a reference to '_dayList'.
     * No type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.availability.Day> getDayCollection(
    ) {
        return this._dayList;
    }

    /**
     * Method getDayCount.
     *
     * @return the size of this collection
     */
    public int getDayCount(
    ) {
        return this._dayList.size();
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
     * Method iterateDay.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.availability.Day> iterateDay(
    ) {
        return this._dayList.iterator();
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
    public void removeAllDay(
    ) {
        this._dayList.clear();
    }

    /**
     * Method removeDay.
     *
     * @param vDay
     * @return true if the object was removed from the collection.
     */
    public boolean removeDay(
            final org.opennms.report.availability.Day vDay) {
        boolean removed = _dayList.remove(vDay);
        return removed;
    }

    /**
     * Method removeDayAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.availability.Day removeDayAt(
            final int index) {
        java.lang.Object obj = this._dayList.remove(index);
        return (org.opennms.report.availability.Day) obj;
    }

    /**
     *
     *
     * @param index
     * @param vDay
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDay(
            final int index,
            final org.opennms.report.availability.Day vDay)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dayList.size()) {
            throw new IndexOutOfBoundsException("setDay: Index value '" + index + "' not in range [0.." + (this._dayList.size() - 1) + "]");
        }

        this._dayList.set(index, vDay);
    }

    /**
     *
     *
     * @param vDayArray
     */
    public void setDay(
            final org.opennms.report.availability.Day[] vDayArray) {
        //-- copy array
        _dayList.clear();

        for (int i = 0; i < vDayArray.length; i++) {
                this._dayList.add(vDayArray[i]);
        }
    }

    /**
     * Sets the value of '_dayList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vDayList the Vector to copy.
     */
    public void setDay(
            final java.util.List<org.opennms.report.availability.Day> vDayList) {
        // copy vector
        this._dayList.clear();

        this._dayList.addAll(vDayList);
    }

    /**
     * Sets the value of '_dayList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param dayList the Vector to set.
     */
    public void setDayCollection(
            final java.util.List<org.opennms.report.availability.Day> dayList) {
        this._dayList = dayList;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.availability.Week
     */
    public static org.opennms.report.availability.Week unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Week) Unmarshaller.unmarshal(org.opennms.report.availability.Week.class, reader);
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
