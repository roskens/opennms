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
 * Class GraphChoice.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="graphChoice")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class GraphChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _area.
     */
    private org.opennms.netmgt.config.rrd.Area _area;

    /**
     * Field _stack.
     */
    private org.opennms.netmgt.config.rrd.Stack _stack;

    /**
     * Field _line.
     */
    private org.opennms.netmgt.config.rrd.Line _line;

    /**
     * Field _gprint.
     */
    private org.opennms.netmgt.config.rrd.Gprint _gprint;

    /**
     * Field _hrule.
     */
    private org.opennms.netmgt.config.rrd.Hrule _hrule;

    /**
     * Field _vrule.
     */
    private org.opennms.netmgt.config.rrd.Vrule _vrule;

    /**
     * Field _time.
     */
    private org.opennms.netmgt.config.rrd.Time _time;

    /**
     * Field _comment.
     */
    private java.lang.String _comment;


      //----------------/
     //- Constructors -/
    //----------------/

    public GraphChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'area'.
     *
     * @return the value of field 'Area'.
     */
    public org.opennms.netmgt.config.rrd.Area getArea(
    ) {
        return this._area;
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     *
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'comment'.
     *
     * @return the value of field 'Comment'.
     */
    public java.lang.String getComment(
    ) {
        return this._comment;
    }

    /**
     * Returns the value of field 'gprint'.
     *
     * @return the value of field 'Gprint'.
     */
    public org.opennms.netmgt.config.rrd.Gprint getGprint(
    ) {
        return this._gprint;
    }

    /**
     * Returns the value of field 'hrule'.
     *
     * @return the value of field 'Hrule'.
     */
    public org.opennms.netmgt.config.rrd.Hrule getHrule(
    ) {
        return this._hrule;
    }

    /**
     * Returns the value of field 'line'.
     *
     * @return the value of field 'Line'.
     */
    public org.opennms.netmgt.config.rrd.Line getLine(
    ) {
        return this._line;
    }

    /**
     * Returns the value of field 'stack'.
     *
     * @return the value of field 'Stack'.
     */
    public org.opennms.netmgt.config.rrd.Stack getStack(
    ) {
        return this._stack;
    }

    /**
     * Returns the value of field 'time'.
     *
     * @return the value of field 'Time'.
     */
    public org.opennms.netmgt.config.rrd.Time getTime(
    ) {
        return this._time;
    }

    /**
     * Returns the value of field 'vrule'.
     *
     * @return the value of field 'Vrule'.
     */
    public org.opennms.netmgt.config.rrd.Vrule getVrule(
    ) {
        return this._vrule;
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
     * Sets the value of field 'area'.
     *
     * @param area the value of field 'area'.
     */
    public void setArea(
            final org.opennms.netmgt.config.rrd.Area area) {
        this._area = area;
        this._choiceValue = area;
    }

    /**
     * Sets the value of field 'comment'.
     *
     * @param comment the value of field 'comment'.
     */
    public void setComment(
            final java.lang.String comment) {
        this._comment = comment;
        this._choiceValue = comment;
    }

    /**
     * Sets the value of field 'gprint'.
     *
     * @param gprint the value of field 'gprint'.
     */
    public void setGprint(
            final org.opennms.netmgt.config.rrd.Gprint gprint) {
        this._gprint = gprint;
        this._choiceValue = gprint;
    }

    /**
     * Sets the value of field 'hrule'.
     *
     * @param hrule the value of field 'hrule'.
     */
    public void setHrule(
            final org.opennms.netmgt.config.rrd.Hrule hrule) {
        this._hrule = hrule;
        this._choiceValue = hrule;
    }

    /**
     * Sets the value of field 'line'.
     *
     * @param line the value of field 'line'.
     */
    public void setLine(
            final org.opennms.netmgt.config.rrd.Line line) {
        this._line = line;
        this._choiceValue = line;
    }

    /**
     * Sets the value of field 'stack'.
     *
     * @param stack the value of field 'stack'.
     */
    public void setStack(
            final org.opennms.netmgt.config.rrd.Stack stack) {
        this._stack = stack;
        this._choiceValue = stack;
    }

    /**
     * Sets the value of field 'time'.
     *
     * @param time the value of field 'time'.
     */
    public void setTime(
            final org.opennms.netmgt.config.rrd.Time time) {
        this._time = time;
        this._choiceValue = time;
    }

    /**
     * Sets the value of field 'vrule'.
     *
     * @param vrule the value of field 'vrule'.
     */
    public void setVrule(
            final org.opennms.netmgt.config.rrd.Vrule vrule) {
        this._vrule = vrule;
        this._choiceValue = vrule;
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
     * org.opennms.netmgt.config.rrd.GraphChoice
     */
    public static org.opennms.netmgt.config.rrd.GraphChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.GraphChoice) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.GraphChoice.class, reader);
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
