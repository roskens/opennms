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
package org.opennms.netmgt.config.attrsummary;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Attribute.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="attribute")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("attr-summary.xsd")
@SuppressWarnings("all") public class Attribute implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    @XmlElement(name="name")
    private java.lang.String _name;

    /**
     * Field _min.
     */
    @XmlElement(name="min")
    private Double _min;

    /**
     * Field _average.
     */
    @XmlElement(name="average")
    private Double _average;

    /**
     * Field _max.
     */
    @XmlElement(name="max")
    private Double _max;

      //----------------/
     //- Constructors -/
    //----------------/

    public Attribute() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteAverage(
    ) {
        this._average = null;
    }

    /**
     */
    public void deleteMax(
    ) {
        this._max = null;
    }

    /**
     */
    public void deleteMin(
    ) {
        this._min = null;
    }

    /**
     * Returns the value of field 'average'.
     *
     * @return the value of field 'Average'.
     */
    public Double getAverage(
    ) {
        return this._average;
    }

    /**
     * Returns the value of field 'max'.
     *
     * @return the value of field 'Max'.
     */
    public Double getMax(
    ) {
        return this._max;
    }

    /**
     * Returns the value of field 'min'.
     *
     * @return the value of field 'Min'.
     */
    public Double getMin(
    ) {
        return this._min;
    }

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method hasAverage.
     *
     * @return true if at least one Average has been added
     */
    public boolean hasAverage(
    ) {
        return this._average != null;
    }

    /**
     * Method hasMax.
     *
     * @return true if at least one Max has been added
     */
    public boolean hasMax(
    ) {
        return this._max != null;
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
     * Sets the value of field 'average'.
     *
     * @param average the value of field 'average'.
     */
    public void setAverage(
            final Double average) {
        this._average = average;
    }

    /**
     * Sets the value of field 'max'.
     *
     * @param max the value of field 'max'.
     */
    public void setMax(
            final Double max) {
        this._max = max;
    }

    /**
     * Sets the value of field 'min'.
     *
     * @param min the value of field 'min'.
     */
    public void setMin(
            final Double min) {
        this._min = min;
    }

    /**
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
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
     * org.opennms.netmgt.config.attrsummary.Attribute
     */
    public static org.opennms.netmgt.config.attrsummary.Attribute unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.attrsummary.Attribute) Unmarshaller.unmarshal(org.opennms.netmgt.config.attrsummary.Attribute.class, reader);
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
