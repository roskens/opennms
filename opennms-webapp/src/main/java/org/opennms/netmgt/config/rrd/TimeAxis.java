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
package org.opennms.netmgt.config.rrd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class TimeAxis.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="timeAxis")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class TimeAxis implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _min_grid_time_unit.
     */
    @XmlElement(name="min_grid_time_unit")
    private org.opennms.netmgt.config.rrd.types.GridTimeUnit _min_grid_time_unit;

    /**
     * Field _min_grid_unit_steps.
     */
    @XmlElement(name="min_grid_unit_steps")
    private Integer _min_grid_unit_steps;

    /**
     * Field _maj_grid_time_unit.
     */
    @XmlElement(name="maj_grid_time_unit")
    private org.opennms.netmgt.config.rrd.types.GridTimeUnit _maj_grid_time_unit;

    /**
     * Field _maj_grid_unit_steps.
     */
    @XmlElement(name="maj_grid_unit_steps")
    private Integer _maj_grid_unit_steps;

    /**
     * XXX: the type should probably be a simpleType that we
     *  define with a pattern of allowable formats.
     */
    @XmlElement(name="date_format")
    private java.lang.String _date_format;

    /**
     * Field _center_labels.
     */
    @XmlElement(name="center_labels")
    private Boolean _center_labels;

    /**
     * Field _first_day_of_week.
     */
    @XmlElement(name="first_day_of_week")
    private org.opennms.netmgt.config.rrd.types.DayOfWeek _first_day_of_week;


      //----------------/
     //- Constructors -/
    //----------------/

    public TimeAxis() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteCenter_labels(
    ) {
        this._center_labels = null;
    }

    /**
     */
    public void deleteMaj_grid_unit_steps(
    ) {
        this._maj_grid_unit_steps = null;
    }

    /**
     */
    public void deleteMin_grid_unit_steps(
    ) {
        this._min_grid_unit_steps = null;
    }

    /**
     * Returns the value of field 'center_labels'.
     *
     * @return the value of field 'Center_labels'.
     */
    public Boolean getCenter_labels(
    ) {
        return this._center_labels;
    }

    /**
     * Returns the value of field 'date_format'. The field
     * 'date_format' has the following description: XXX: the type
     * should probably be a simpleType that we
     *  define with a pattern of allowable formats.
     *
     * @return the value of field 'Date_format'.
     */
    public java.lang.String getDate_format(
    ) {
        return this._date_format;
    }

    /**
     * Returns the value of field 'first_day_of_week'.
     *
     * @return the value of field 'First_day_of_week'.
     */
    public org.opennms.netmgt.config.rrd.types.DayOfWeek getFirst_day_of_week(
    ) {
        return this._first_day_of_week;
    }

    /**
     * Returns the value of field 'maj_grid_time_unit'.
     *
     * @return the value of field 'Maj_grid_time_unit'.
     */
    public org.opennms.netmgt.config.rrd.types.GridTimeUnit getMaj_grid_time_unit(
    ) {
        return this._maj_grid_time_unit;
    }

    /**
     * Returns the value of field 'maj_grid_unit_steps'.
     *
     * @return the value of field 'Maj_grid_unit_steps'.
     */
    public Integer getMaj_grid_unit_steps(
    ) {
        return this._maj_grid_unit_steps;
    }

    /**
     * Returns the value of field 'min_grid_time_unit'.
     *
     * @return the value of field 'Min_grid_time_unit'.
     */
    public org.opennms.netmgt.config.rrd.types.GridTimeUnit getMin_grid_time_unit(
    ) {
        return this._min_grid_time_unit;
    }

    /**
     * Returns the value of field 'min_grid_unit_steps'.
     *
     * @return the value of field 'Min_grid_unit_steps'.
     */
    public Integer getMin_grid_unit_steps(
    ) {
        return this._min_grid_unit_steps;
    }

    /**
     * Method hasCenter_labels.
     *
     * @return true if at least one Center_labels has been added
     */
    public boolean hasCenter_labels(
    ) {
        return this._center_labels != null;
    }

    /**
     * Method hasMaj_grid_unit_steps.
     *
     * @return true if at least one Maj_grid_unit_steps has been
     * added
     */
    public boolean hasMaj_grid_unit_steps(
    ) {
        return this._maj_grid_unit_steps != null;
    }

    /**
     * Method hasMin_grid_unit_steps.
     *
     * @return true if at least one Min_grid_unit_steps has been
     * added
     */
    public boolean hasMin_grid_unit_steps(
    ) {
        return this._min_grid_unit_steps != null;
    }

    /**
     * Returns the value of field 'center_labels'.
     *
     * @return the value of field 'Center_labels'.
     */
    public boolean isCenter_labels(
    ) {
        return this._center_labels;
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
     * Sets the value of field 'center_labels'.
     *
     * @param center_labels the value of field 'center_labels'.
     */
    public void setCenter_labels(
            final Boolean center_labels) {
        this._center_labels = center_labels;
    }

    /**
     * Sets the value of field 'date_format'. The field
     * 'date_format' has the following description: XXX: the type
     * should probably be a simpleType that we
     *  define with a pattern of allowable formats.
     *
     * @param date_format the value of field 'date_format'.
     */
    public void setDate_format(
            final java.lang.String date_format) {
        this._date_format = date_format;
    }

    /**
     * Sets the value of field 'first_day_of_week'.
     *
     * @param first_day_of_week the value of field
     * 'first_day_of_week'.
     */
    public void setFirst_day_of_week(
            final org.opennms.netmgt.config.rrd.types.DayOfWeek first_day_of_week) {
        this._first_day_of_week = first_day_of_week;
    }

    /**
     * Sets the value of field 'maj_grid_time_unit'.
     *
     * @param maj_grid_time_unit the value of field
     * 'maj_grid_time_unit'.
     */
    public void setMaj_grid_time_unit(
            final org.opennms.netmgt.config.rrd.types.GridTimeUnit maj_grid_time_unit) {
        this._maj_grid_time_unit = maj_grid_time_unit;
    }

    /**
     * Sets the value of field 'maj_grid_unit_steps'.
     *
     * @param maj_grid_unit_steps the value of field
     * 'maj_grid_unit_steps'.
     */
    public void setMaj_grid_unit_steps(
            final Integer maj_grid_unit_steps) {
        this._maj_grid_unit_steps = maj_grid_unit_steps;
    }

    /**
     * Sets the value of field 'min_grid_time_unit'.
     *
     * @param min_grid_time_unit the value of field
     * 'min_grid_time_unit'.
     */
    public void setMin_grid_time_unit(
            final org.opennms.netmgt.config.rrd.types.GridTimeUnit min_grid_time_unit) {
        this._min_grid_time_unit = min_grid_time_unit;
    }

    /**
     * Sets the value of field 'min_grid_unit_steps'.
     *
     * @param min_grid_unit_steps the value of field
     * 'min_grid_unit_steps'.
     */
    public void setMin_grid_unit_steps(
            final Integer min_grid_unit_steps) {
        this._min_grid_unit_steps = min_grid_unit_steps;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.rrd.TimeAxi
     */
    public static org.opennms.netmgt.config.rrd.TimeAxis unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.TimeAxis) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.TimeAxis.class, reader);
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
