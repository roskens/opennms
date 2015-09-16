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
 * Class Day.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="day")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class Day implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _date.
     */
    @XmlAttribute(name="date")
    private Integer _date;

    /**
     * Field _pctValue.
     */
    @XmlAttribute(name="pctValue")
    private Double _pctValue;

    /**
     * Field _visible.
     */
    @XmlAttribute(name="visible")
    private Boolean _visible;

      //----------------/
     //- Constructors -/
    //----------------/

    public Day() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDate(
    ) {
        this._date = null;
    }

    /**
     */
    public void deletePctValue(
    ) {
        this._pctValue = null;
    }

    /**
     */
    public void deleteVisible(
    ) {
        this._visible = null;
    }

    /**
     * Returns the value of field 'date'.
     *
     * @return the value of field 'Date'.
     */
    public Integer getDate(
    ) {
        return this._date;
    }

    /**
     * Returns the value of field 'pctValue'.
     *
     * @return the value of field 'PctValue'.
     */
    public Double getPctValue(
    ) {
        return this._pctValue;
    }

    /**
     * Returns the value of field 'visible'.
     *
     * @return the value of field 'Visible'.
     */
    public Boolean getVisible(
    ) {
        return this._visible;
    }

    /**
     * Method hasDate.
     *
     * @return true if at least one Date has been added
     */
    public boolean hasDate(
    ) {
        return this._date != null;
    }

    /**
     * Method hasPctValue.
     *
     * @return true if at least one PctValue has been added
     */
    public boolean hasPctValue(
    ) {
        return this._pctValue != null;
    }

    /**
     * Method hasVisible.
     *
     * @return true if at least one Visible has been added
     */
    public boolean hasVisible(
    ) {
        return this._visible != null;
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
     * Returns the value of field 'visible'.
     *
     * @return the value of field 'Visible'.
     */
    public boolean isVisible(
    ) {
        return this._visible;
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
     * Sets the value of field 'date'.
     *
     * @param date the value of field 'date'.
     */
    public void setDate(
            final Integer date) {
        this._date = date;
    }

    /**
     * Sets the value of field 'pctValue'.
     *
     * @param pctValue the value of field 'pctValue'.
     */
    public void setPctValue(
            final Double pctValue) {
        this._pctValue = pctValue;
    }

    /**
     * Sets the value of field 'visible'.
     *
     * @param visible the value of field 'visible'.
     */
    public void setVisible(
            final Boolean visible) {
        this._visible = visible;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.availability.Day
     */
    public static org.opennms.report.availability.Day unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Day) Unmarshaller.unmarshal(org.opennms.report.availability.Day.class, reader);
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
