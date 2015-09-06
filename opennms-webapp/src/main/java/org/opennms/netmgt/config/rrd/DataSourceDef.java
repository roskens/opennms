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
 * Class DataSourceDef.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="dataSourceDef")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class DataSourceDef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _rrd.
     */
    private java.lang.String _rrd;

    /**
     * Field _source.
     */
    private java.lang.String _source;

    /**
     * Field _cf.
     */
    private org.opennms.netmgt.config.rrd.types.Cf _cf;

    /**
     * Field _backend.
     */
    private org.opennms.netmgt.config.rrd.types.Backend _backend;

    /**
     * Field _rpn.
     */
    private java.lang.String _rpn;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataSourceDef() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'backend'.
     *
     * @return the value of field 'Backend'.
     */
    public org.opennms.netmgt.config.rrd.types.Backend getBackend(
    ) {
        return this._backend;
    }

    /**
     * Returns the value of field 'cf'.
     *
     * @return the value of field 'Cf'.
     */
    public org.opennms.netmgt.config.rrd.types.Cf getCf(
    ) {
        return this._cf;
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
     * Returns the value of field 'rpn'.
     *
     * @return the value of field 'Rpn'.
     */
    public java.lang.String getRpn(
    ) {
        return this._rpn;
    }

    /**
     * Returns the value of field 'rrd'.
     *
     * @return the value of field 'Rrd'.
     */
    public java.lang.String getRrd(
    ) {
        return this._rrd;
    }

    /**
     * Returns the value of field 'source'.
     *
     * @return the value of field 'Source'.
     */
    public java.lang.String getSource(
    ) {
        return this._source;
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
     * Sets the value of field 'backend'.
     *
     * @param backend the value of field 'backend'.
     */
    public void setBackend(
            final org.opennms.netmgt.config.rrd.types.Backend backend) {
        this._backend = backend;
    }

    /**
     * Sets the value of field 'cf'.
     *
     * @param cf the value of field 'cf'.
     */
    public void setCf(
            final org.opennms.netmgt.config.rrd.types.Cf cf) {
        this._cf = cf;
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
     * Sets the value of field 'rpn'.
     *
     * @param rpn the value of field 'rpn'.
     */
    public void setRpn(
            final java.lang.String rpn) {
        this._rpn = rpn;
    }

    /**
     * Sets the value of field 'rrd'.
     *
     * @param rrd the value of field 'rrd'.
     */
    public void setRrd(
            final java.lang.String rrd) {
        this._rrd = rrd;
    }

    /**
     * Sets the value of field 'source'.
     *
     * @param source the value of field 'source'.
     */
    public void setSource(
            final java.lang.String source) {
        this._source = source;
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
     * org.opennms.netmgt.config.rrd.DataSourceDef
     */
    public static org.opennms.netmgt.config.rrd.DataSourceDef unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.DataSourceDef) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.DataSourceDef.class, reader);
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
