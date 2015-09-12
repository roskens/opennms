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
package org.opennms.netmgt.config.reporting.opennms;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * 24 hour clock time
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="time")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("opennms-reports.xsd")
@SuppressWarnings("all") public class Time implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * hours
     */
    @XmlElement(name="hours")
    private Integer _hours;

    /**
     * minutes
     */
    @XmlElement(name="minutes")
    private Integer _minutes;


      //----------------/
     //- Constructors -/
    //----------------/

    public Time() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteHours(
    ) {
        this._hours = null;
    }

    /**
     */
    public void deleteMinutes(
    ) {
        this._minutes = null;
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

        if (obj instanceof Time) {

            Time temp = (Time)obj;
            if (this._hours != null) {
                if (temp._hours == null) return false;
                else if (!(this._hours.equals(temp._hours)))
                    return false;
            }
            else if (temp._hours != null)
                return false;
            if (this._minutes != null) {
                if (temp._minutes == null) return false;
                else if (!(this._minutes.equals(temp._minutes)))
                    return false;
            }
            else if (temp._minutes != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'hours'. The field 'hours' has
     * the following description: hours
     *
     * @return the value of field 'Hours'.
     */
    public Integer getHours(
    ) {
        return this._hours;
    }

    /**
     * Returns the value of field 'minutes'. The field 'minutes'
     * has the following description: minutes
     *
     * @return the value of field 'Minutes'.
     */
    public Integer getMinutes(
    ) {
        return this._minutes;
    }

    /**
     * Method hasHours.
     *
     * @return true if at least one Hours has been added
     */
    public boolean hasHours(
    ) {
        return this._hours != null;
    }

    /**
     * Method hasMinutes.
     *
     * @return true if at least one Minutes has been added
     */
    public boolean hasMinutes(
    ) {
        return this._minutes != null;
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
        if (_hours != null) {
           result = 37 * result + _hours.hashCode();
        }
        if (_minutes != null) {
           result = 37 * result + _minutes.hashCode();
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
     * Sets the value of field 'hours'. The field 'hours' has the
     * following description: hours
     *
     * @param hours the value of field 'hours'.
     */
    public void setHours(final Integer hours) {
        this._hours = hours;
    }

    /**
     * Sets the value of field 'minutes'. The field 'minutes' has
     * the following description: minutes
     *
     * @param minutes the value of field 'minutes'.
     */
    public void setMinutes(final Integer minutes) {
        this._minutes = minutes;
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
     * org.opennms.netmgt.config.reporting.opennms.Time
     */
    public static org.opennms.netmgt.config.reporting.opennms.Time unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.opennms.Time) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.opennms.Time.class, reader);
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
