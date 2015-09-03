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
package org.opennms.netmgt.config.charts;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class SeriesDef.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="series-def")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("chart-configuration.xsd")
@SuppressWarnings("all") public class SeriesDef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _number.
     */
    private int _number;

    /**
     * keeps track of state for field: _number
     */
    private boolean _has_number;

    /**
     * Field _seriesName.
     */
    private java.lang.String _seriesName;

    /**
     * Field _useLabels.
     */
    private boolean _useLabels = true;

    /**
     * keeps track of state for field: _useLabels
     */
    private boolean _has_useLabels;

    /**
     * Field _jdbcDataSet.
     */
    private org.opennms.netmgt.config.charts.JdbcDataSet _jdbcDataSet;

    /**
     * Field _rgb.
     */
    private org.opennms.netmgt.config.charts.Rgb _rgb;


      //----------------/
     //- Constructors -/
    //----------------/

    public SeriesDef() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteNumber(
    ) {
        this._has_number= false;
    }

    /**
     */
    public void deleteUseLabels(
    ) {
        this._has_useLabels= false;
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

        if (obj instanceof SeriesDef) {

            SeriesDef temp = (SeriesDef)obj;
            if (this._number != temp._number)
                return false;
            if (this._has_number != temp._has_number)
                return false;
            if (this._seriesName != null) {
                if (temp._seriesName == null) return false;
                else if (!(this._seriesName.equals(temp._seriesName)))
                    return false;
            }
            else if (temp._seriesName != null)
                return false;
            if (this._useLabels != temp._useLabels)
                return false;
            if (this._has_useLabels != temp._has_useLabels)
                return false;
            if (this._jdbcDataSet != null) {
                if (temp._jdbcDataSet == null) return false;
                else if (!(this._jdbcDataSet.equals(temp._jdbcDataSet)))
                    return false;
            }
            else if (temp._jdbcDataSet != null)
                return false;
            if (this._rgb != null) {
                if (temp._rgb == null) return false;
                else if (!(this._rgb.equals(temp._rgb)))
                    return false;
            }
            else if (temp._rgb != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'jdbcDataSet'.
     *
     * @return the value of field 'JdbcDataSet'.
     */
    public org.opennms.netmgt.config.charts.JdbcDataSet getJdbcDataSet(
    ) {
        return this._jdbcDataSet;
    }

    /**
     * Returns the value of field 'number'.
     *
     * @return the value of field 'Number'.
     */
    public int getNumber(
    ) {
        return this._number;
    }

    /**
     * Returns the value of field 'rgb'.
     *
     * @return the value of field 'Rgb'.
     */
    public org.opennms.netmgt.config.charts.Rgb getRgb(
    ) {
        return this._rgb;
    }

    /**
     * Returns the value of field 'seriesName'.
     *
     * @return the value of field 'SeriesName'.
     */
    public java.lang.String getSeriesName(
    ) {
        return this._seriesName;
    }

    /**
     * Returns the value of field 'useLabels'.
     *
     * @return the value of field 'UseLabels'.
     */
    public boolean getUseLabels(
    ) {
        return this._useLabels;
    }

    /**
     * Method hasNumber.
     *
     * @return true if at least one Number has been added
     */
    public boolean hasNumber(
    ) {
        return this._has_number;
    }

    /**
     * Method hasUseLabels.
     *
     * @return true if at least one UseLabels has been added
     */
    public boolean hasUseLabels(
    ) {
        return this._has_useLabels;
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
        result = 37 * result + _number;
        if (_seriesName != null) {
           result = 37 * result + _seriesName.hashCode();
        }
        result = 37 * result + (_useLabels?0:1);
        if (_jdbcDataSet != null) {
           result = 37 * result + _jdbcDataSet.hashCode();
        }
        if (_rgb != null) {
           result = 37 * result + _rgb.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'useLabels'.
     *
     * @return the value of field 'UseLabels'.
     */
    public boolean isUseLabels(
    ) {
        return this._useLabels;
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
     * Sets the value of field 'jdbcDataSet'.
     *
     * @param jdbcDataSet the value of field 'jdbcDataSet'.
     */
    public void setJdbcDataSet(
            final org.opennms.netmgt.config.charts.JdbcDataSet jdbcDataSet) {
        this._jdbcDataSet = jdbcDataSet;
    }

    /**
     * Sets the value of field 'number'.
     *
     * @param number the value of field 'number'.
     */
    public void setNumber(
            final int number) {
        this._number = number;
        this._has_number = true;
    }

    /**
     * Sets the value of field 'rgb'.
     *
     * @param rgb the value of field 'rgb'.
     */
    public void setRgb(
            final org.opennms.netmgt.config.charts.Rgb rgb) {
        this._rgb = rgb;
    }

    /**
     * Sets the value of field 'seriesName'.
     *
     * @param seriesName the value of field 'seriesName'.
     */
    public void setSeriesName(
            final java.lang.String seriesName) {
        this._seriesName = seriesName;
    }

    /**
     * Sets the value of field 'useLabels'.
     *
     * @param useLabels the value of field 'useLabels'.
     */
    public void setUseLabels(
            final boolean useLabels) {
        this._useLabels = useLabels;
        this._has_useLabels = true;
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
     * org.opennms.netmgt.config.charts.SeriesDef
     */
    public static org.opennms.netmgt.config.charts.SeriesDef unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.SeriesDef) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.SeriesDef.class, reader);
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
