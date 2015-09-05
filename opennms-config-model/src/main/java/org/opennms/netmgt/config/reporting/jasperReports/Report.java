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
package org.opennms.netmgt.config.reporting.jasperReports;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Report.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="report")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jasper-reports.xsd")
@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name of this report
     */
    @XmlAttribute(name="id", required = true)
    private java.lang.String _id;

    /**
     * jxrml report template
     */
    @XmlAttribute(name="template", required = true)
    private java.lang.String _template;

    /**
     * Field _engine.
     */
    @XmlAttribute(name="engine", required = true)
    private java.lang.String _engine;


      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
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

        if (obj instanceof Report) {

            Report temp = (Report)obj;
            if (this._id != null) {
                if (temp._id == null) return false;
                else if (!(this._id.equals(temp._id)))
                    return false;
            }
            else if (temp._id != null)
                return false;
            if (this._template != null) {
                if (temp._template == null) return false;
                else if (!(this._template.equals(temp._template)))
                    return false;
            }
            else if (temp._template != null)
                return false;
            if (this._engine != null) {
                if (temp._engine == null) return false;
                else if (!(this._engine.equals(temp._engine)))
                    return false;
            }
            else if (temp._engine != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'engine'.
     *
     * @return the value of field 'Engine'.
     */
    public java.lang.String getEngine(
    ) {
        return this._engine;
    }

    /**
     * Returns the value of field 'id'. The field 'id' has the
     * following description: the name of this report
     *
     * @return the value of field 'Id'.
     */
    public java.lang.String getId(
    ) {
        return this._id;
    }

    /**
     * Returns the value of field 'template'. The field 'template'
     * has the following description: jxrml report template
     *
     * @return the value of field 'Template'.
     */
    public java.lang.String getTemplate(
    ) {
        return this._template;
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
        if (_template != null) {
           result = 37 * result + _template.hashCode();
        }
        if (_engine != null) {
           result = 37 * result + _engine.hashCode();
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
     * Sets the value of field 'engine'.
     *
     * @param engine the value of field 'engine'.
     */
    public void setEngine(
            final java.lang.String engine) {
        this._engine = engine;
    }

    /**
     * Sets the value of field 'id'. The field 'id' has the
     * following description: the name of this report
     *
     * @param id the value of field 'id'.
     */
    public void setId(
            final java.lang.String id) {
        this._id = id;
    }

    /**
     * Sets the value of field 'template'. The field 'template' has
     * the following description: jxrml report template
     *
     * @param template the value of field 'template'.
     */
    public void setTemplate(
            final java.lang.String template) {
        this._template = template;
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
     * org.opennms.netmgt.config.reporting.jasperReports.Report
     */
    public static org.opennms.netmgt.config.reporting.jasperReports.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.jasperReports.Report) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.jasperReports.Report.class, reader);
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
