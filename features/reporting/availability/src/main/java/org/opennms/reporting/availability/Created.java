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
package org.opennms.reporting.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Created.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="created")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class Created implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.math.BigDecimal _content;

    /**
     * Field _year.
     */
    @XmlAttribute(name="year", required = true)
    private Integer _year;

    /**
     * Field _month.
     */
    @XmlAttribute(name="month", required = true)
    private java.lang.String _month;

    /**
     * Field _day.
     */
    @XmlAttribute(name="day", required = true)
    private Integer _day;

    /**
     * Field _hour.
     */
    @XmlAttribute(name="hour", required = true)
    private Integer _hour;

    /**
     * Field _min.
     */
    @XmlAttribute(name="min", required = true)
    private Integer _min;

    /**
     * Field _sec.
     */
    @XmlAttribute(name="sec", required = true)
    private Integer _sec;

    /**
     * Field _period.
     */
    @XmlAttribute(name="period", required = true)
    private java.lang.String _period;


      //----------------/
     //- Constructors -/
    //----------------/

    public Created() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDay(
    ) {
        this._day = null;
    }

    /**
     */
    public void deleteHour(
    ) {
        this._hour = null;
    }

    /**
     */
    public void deleteMin(
    ) {
        this._min = null;
    }

    /**
     */
    public void deleteSec(
    ) {
        this._sec = null;
    }

    /**
     */
    public void deleteYear(
    ) {
        this._year = null;
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     *
     * @return the value of field 'Content'.
     */
    public java.math.BigDecimal getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'day'.
     *
     * @return the value of field 'Day'.
     */
    public Integer getDay(
    ) {
        return this._day;
    }

    /**
     * Returns the value of field 'hour'.
     *
     * @return the value of field 'Hour'.
     */
    public Integer getHour(
    ) {
        return this._hour;
    }

    /**
     * Returns the value of field 'min'.
     *
     * @return the value of field 'Min'.
     */
    public Integer getMin(
    ) {
        return this._min;
    }

    /**
     * Returns the value of field 'month'.
     *
     * @return the value of field 'Month'.
     */
    public java.lang.String getMonth(
    ) {
        return this._month;
    }

    /**
     * Returns the value of field 'period'.
     *
     * @return the value of field 'Period'.
     */
    public java.lang.String getPeriod(
    ) {
        return this._period;
    }

    /**
     * Returns the value of field 'sec'.
     *
     * @return the value of field 'Sec'.
     */
    public Integer getSec(
    ) {
        return this._sec;
    }

    /**
     * Returns the value of field 'year'.
     *
     * @return the value of field 'Year'.
     */
    public Integer getYear(
    ) {
        return this._year;
    }

    /**
     * Method hasDay.
     *
     * @return true if at least one Day has been added
     */
    public boolean hasDay(
    ) {
        return this._day != null;
    }

    /**
     * Method hasHour.
     *
     * @return true if at least one Hour has been added
     */
    public boolean hasHour(
    ) {
        return this._hour != null;
    }

    /**
     * Method hasMin.
     *
     * @return true if at least one Min has been added
     */
    public boolean hasMin(
    ) {
        return this._min != null;
    }

    /**
     * Method hasSec.
     *
     * @return true if at least one Sec has been added
     */
    public boolean hasSec(
    ) {
        return this._sec != null;
    }

    /**
     * Method hasYear.
     *
     * @return true if at least one Year has been added
     */
    public boolean hasYear(
    ) {
        return this._year != null;
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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     *
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.math.BigDecimal content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'day'.
     *
     * @param day the value of field 'day'.
     */
    public void setDay(
            final Integer day) {
        this._day = day;
    }

    /**
     * Sets the value of field 'hour'.
     *
     * @param hour the value of field 'hour'.
     */
    public void setHour(
            final Integer hour) {
        this._hour = hour;
    }

    /**
     * Sets the value of field 'min'.
     *
     * @param min the value of field 'min'.
     */
    public void setMin(
            final Integer min) {
        this._min = min;
    }

    /**
     * Sets the value of field 'month'.
     *
     * @param month the value of field 'month'.
     */
    public void setMonth(
            final java.lang.String month) {
        this._month = month;
    }

    /**
     * Sets the value of field 'period'.
     *
     * @param period the value of field 'period'.
     */
    public void setPeriod(
            final java.lang.String period) {
        this._period = period;
    }

    /**
     * Sets the value of field 'sec'.
     *
     * @param sec the value of field 'sec'.
     */
    public void setSec(
            final Integer sec) {
        this._sec = sec;
    }

    /**
     * Sets the value of field 'year'.
     *
     * @param year the value of field 'year'.
     */
    public void setYear(
            final Integer year) {
        this._year = year;
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
     * org.opennms.reporting.availability.Created
     */
    public static org.opennms.reporting.availability.Created unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.reporting.availability.Created) Unmarshaller.unmarshal(org.opennms.reporting.availability.Created.class, reader);
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
