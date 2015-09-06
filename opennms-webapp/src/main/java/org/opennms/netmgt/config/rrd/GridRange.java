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
 * Class GridRange.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="gridRange")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class GridRange implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _lower.
     */
    private double _lower;

    /**
     * keeps track of state for field: _lower
     */
    private boolean _has_lower;

    /**
     * Field _upper.
     */
    private double _upper;

    /**
     * keeps track of state for field: _upper
     */
    private boolean _has_upper;

    /**
     * Field _rigid.
     */
    private boolean _rigid;

    /**
     * keeps track of state for field: _rigid
     */
    private boolean _has_rigid;


      //----------------/
     //- Constructors -/
    //----------------/

    public GridRange() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteLower(
    ) {
        this._has_lower= false;
    }

    /**
     */
    public void deleteRigid(
    ) {
        this._has_rigid= false;
    }

    /**
     */
    public void deleteUpper(
    ) {
        this._has_upper= false;
    }

    /**
     * Returns the value of field 'lower'.
     *
     * @return the value of field 'Lower'.
     */
    public double getLower(
    ) {
        return this._lower;
    }

    /**
     * Returns the value of field 'rigid'.
     *
     * @return the value of field 'Rigid'.
     */
    public boolean getRigid(
    ) {
        return this._rigid;
    }

    /**
     * Returns the value of field 'upper'.
     *
     * @return the value of field 'Upper'.
     */
    public double getUpper(
    ) {
        return this._upper;
    }

    /**
     * Method hasLower.
     *
     * @return true if at least one Lower has been added
     */
    public boolean hasLower(
    ) {
        return this._has_lower;
    }

    /**
     * Method hasRigid.
     *
     * @return true if at least one Rigid has been added
     */
    public boolean hasRigid(
    ) {
        return this._has_rigid;
    }

    /**
     * Method hasUpper.
     *
     * @return true if at least one Upper has been added
     */
    public boolean hasUpper(
    ) {
        return this._has_upper;
    }

    /**
     * Returns the value of field 'rigid'.
     *
     * @return the value of field 'Rigid'.
     */
    public boolean isRigid(
    ) {
        return this._rigid;
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
     * Sets the value of field 'lower'.
     *
     * @param lower the value of field 'lower'.
     */
    public void setLower(
            final double lower) {
        this._lower = lower;
        this._has_lower = true;
    }

    /**
     * Sets the value of field 'rigid'.
     *
     * @param rigid the value of field 'rigid'.
     */
    public void setRigid(
            final boolean rigid) {
        this._rigid = rigid;
        this._has_rigid = true;
    }

    /**
     * Sets the value of field 'upper'.
     *
     * @param upper the value of field 'upper'.
     */
    public void setUpper(
            final double upper) {
        this._upper = upper;
        this._has_upper = true;
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
     * org.opennms.netmgt.config.rrd.GridRange
     */
    public static org.opennms.netmgt.config.rrd.GridRange unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.GridRange) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.GridRange.class, reader);
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
