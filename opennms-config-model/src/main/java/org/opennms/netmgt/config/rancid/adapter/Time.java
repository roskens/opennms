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
package org.opennms.netmgt.config.rancid.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * defines start/end time for the outage
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="time")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("rancid-adapter-configuration.xsd")
@SuppressWarnings("all") public class Time implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an identifier for this event used for reference in the web
     * gui. If this
     *  identifer is not assigned it will be assigned an identifer
     * by web gui.
     *
     */
    @XmlAttribute(name="id")
    private java.lang.String _id;

    /**
     * Field _day.
     */
    @XmlAttribute(name="day")
    private java.lang.String _day;

    /**
     * when the outage starts
     */
    @XmlAttribute(name="begins")
    private java.lang.String _begins;

    /**
     * when the outage ends
     */
    @XmlAttribute(name="ends")
    private java.lang.String _ends;


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
            if (this._id != null) {
                if (temp._id == null) return false;
                else if (!(this._id.equals(temp._id)))
                    return false;
            }
            else if (temp._id != null)
                return false;
            if (this._day != null) {
                if (temp._day == null) return false;
                else if (!(this._day.equals(temp._day)))
                    return false;
            }
            else if (temp._day != null)
                return false;
            if (this._begins != null) {
                if (temp._begins == null) return false;
                else if (!(this._begins.equals(temp._begins)))
                    return false;
            }
            else if (temp._begins != null)
                return false;
            if (this._ends != null) {
                if (temp._ends == null) return false;
                else if (!(this._ends.equals(temp._ends)))
                    return false;
            }
            else if (temp._ends != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'begins'. The field 'begins' has
     * the following description: when the outage starts
     *
     * @return the value of field 'Begins'.
     */
    public java.lang.String getBegins(
    ) {
        return this._begins;
    }

    /**
     * Returns the value of field 'day'.
     *
     * @return the value of field 'Day'.
     */
    public java.lang.String getDay(
    ) {
        return this._day;
    }

    /**
     * Returns the value of field 'ends'. The field 'ends' has the
     * following description: when the outage ends
     *
     * @return the value of field 'Ends'.
     */
    public java.lang.String getEnds(
    ) {
        return this._ends;
    }

    /**
     * Returns the value of field 'id'. The field 'id' has the
     * following description: an identifier for this event used for
     * reference in the web gui. If this
     *  identifer is not assigned it will be assigned an identifer
     * by web gui.
     *
     *
     * @return the value of field 'Id'.
     */
    public java.lang.String getId(
    ) {
        return this._id;
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
        if (_id != null) {
           result = 37 * result + _id.hashCode();
        }
        if (_day != null) {
           result = 37 * result + _day.hashCode();
        }
        if (_begins != null) {
           result = 37 * result + _begins.hashCode();
        }
        if (_ends != null) {
           result = 37 * result + _ends.hashCode();
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
     * Sets the value of field 'begins'. The field 'begins' has the
     * following description: when the outage starts
     *
     * @param begins the value of field 'begins'.
     */
    public void setBegins(
            final java.lang.String begins) {
        this._begins = begins;
    }

    /**
     * Sets the value of field 'day'.
     *
     * @param day the value of field 'day'.
     */
    public void setDay(
            final java.lang.String day) {
        this._day = day;
    }

    /**
     * Sets the value of field 'ends'. The field 'ends' has the
     * following description: when the outage ends
     *
     * @param ends the value of field 'ends'.
     */
    public void setEnds(
            final java.lang.String ends) {
        this._ends = ends;
    }

    /**
     * Sets the value of field 'id'. The field 'id' has the
     * following description: an identifier for this event used for
     * reference in the web gui. If this
     *  identifer is not assigned it will be assigned an identifer
     * by web gui.
     *
     *
     * @param id the value of field 'id'.
     */
    public void setId(
            final java.lang.String id) {
        this._id = id;
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
     * org.opennms.netmgt.config.rancid.adapter.Time
     */
    public static org.opennms.netmgt.config.rancid.adapter.Time unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rancid.adapter.Time) Unmarshaller.unmarshal(org.opennms.netmgt.config.rancid.adapter.Time.class, reader);
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
