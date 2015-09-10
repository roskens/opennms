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
package org.opennms.netmgt.config.reporting.opennms;

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
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="report")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("opennms-reports.xsd")
@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name of this report
     */
    @XmlAttribute(name="id")
    private String _id;

    /**
     * type of this report (calendar/classic)
     */
    @XmlAttribute(name="type")
    private String _type;

    /**
     * Field _parameters.
     */
    @XmlElement(name="parameters")
    private org.opennms.netmgt.config.reporting.opennms.Parameters _parameters;

    /**
     * template to convert to display the report in PDF format
     */
    @XmlElement(name="pdf-template")
    private String _pdfTemplate;

    /**
     * template to convert to display the report in PDF format with
     * embedded SVG
     */
    @XmlElement(name="svg-template")
    private String _svgTemplate;

    /**
     * template to convert to display the report in HTML format
     */
    @XmlElement(name="html-template")
    private String _htmlTemplate;

    /**
     * path to the logo file
     */
    @XmlElement(name="logo")
    private String _logo;


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
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type)))
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._parameters != null) {
                if (temp._parameters == null) return false;
                else if (!(this._parameters.equals(temp._parameters)))
                    return false;
            }
            else if (temp._parameters != null)
                return false;
            if (this._pdfTemplate != null) {
                if (temp._pdfTemplate == null) return false;
                else if (!(this._pdfTemplate.equals(temp._pdfTemplate)))
                    return false;
            }
            else if (temp._pdfTemplate != null)
                return false;
            if (this._svgTemplate != null) {
                if (temp._svgTemplate == null) return false;
                else if (!(this._svgTemplate.equals(temp._svgTemplate)))
                    return false;
            }
            else if (temp._svgTemplate != null)
                return false;
            if (this._htmlTemplate != null) {
                if (temp._htmlTemplate == null) return false;
                else if (!(this._htmlTemplate.equals(temp._htmlTemplate)))
                    return false;
            }
            else if (temp._htmlTemplate != null)
                return false;
            if (this._logo != null) {
                if (temp._logo == null) return false;
                else if (!(this._logo.equals(temp._logo)))
                    return false;
            }
            else if (temp._logo != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'htmlTemplate'. The field
     * 'htmlTemplate' has the following description: template to
     * convert to display the report in HTML format
     *
     * @return the value of field 'HtmlTemplate'.
     */
    public java.lang.String getHtmlTemplate(
    ) {
        return this._htmlTemplate;
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
     * Returns the value of field 'logo'. The field 'logo' has the
     * following description: path to the logo file
     *
     * @return the value of field 'Logo'.
     */
    public java.lang.String getLogo(
    ) {
        return this._logo;
    }

    /**
     * Returns the value of field 'parameters'.
     *
     * @return the value of field 'Parameters'.
     */
    public org.opennms.netmgt.config.reporting.opennms.Parameters getParameters(
    ) {
        return this._parameters;
    }

    /**
     * Returns the value of field 'pdfTemplate'. The field
     * 'pdfTemplate' has the following description: template to
     * convert to display the report in PDF format
     *
     * @return the value of field 'PdfTemplate'.
     */
    public java.lang.String getPdfTemplate(
    ) {
        return this._pdfTemplate;
    }

    /**
     * Returns the value of field 'svgTemplate'. The field
     * 'svgTemplate' has the following description: template to
     * convert to display the report in PDF format with embedded
     * SVG
     *
     * @return the value of field 'SvgTemplate'.
     */
    public java.lang.String getSvgTemplate(
    ) {
        return this._svgTemplate;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: type of this report
     * (calendar/classic)
     *
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_parameters != null) {
           result = 37 * result + _parameters.hashCode();
        }
        if (_pdfTemplate != null) {
           result = 37 * result + _pdfTemplate.hashCode();
        }
        if (_svgTemplate != null) {
           result = 37 * result + _svgTemplate.hashCode();
        }
        if (_htmlTemplate != null) {
           result = 37 * result + _htmlTemplate.hashCode();
        }
        if (_logo != null) {
           result = 37 * result + _logo.hashCode();
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
     * Sets the value of field 'htmlTemplate'. The field
     * 'htmlTemplate' has the following description: template to
     * convert to display the report in HTML format
     *
     * @param htmlTemplate the value of field 'htmlTemplate'.
     */
    public void setHtmlTemplate(
            final java.lang.String htmlTemplate) {
        this._htmlTemplate = htmlTemplate;
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
     * Sets the value of field 'logo'. The field 'logo' has the
     * following description: path to the logo file
     *
     * @param logo the value of field 'logo'.
     */
    public void setLogo(
            final java.lang.String logo) {
        this._logo = logo;
    }

    /**
     * Sets the value of field 'parameters'.
     *
     * @param parameters the value of field 'parameters'.
     */
    public void setParameters(
            final org.opennms.netmgt.config.reporting.opennms.Parameters parameters) {
        this._parameters = parameters;
    }

    /**
     * Sets the value of field 'pdfTemplate'. The field
     * 'pdfTemplate' has the following description: template to
     * convert to display the report in PDF format
     *
     * @param pdfTemplate the value of field 'pdfTemplate'.
     */
    public void setPdfTemplate(
            final java.lang.String pdfTemplate) {
        this._pdfTemplate = pdfTemplate;
    }

    /**
     * Sets the value of field 'svgTemplate'. The field
     * 'svgTemplate' has the following description: template to
     * convert to display the report in PDF format with embedded
     * SVG
     *
     * @param svgTemplate the value of field 'svgTemplate'.
     */
    public void setSvgTemplate(
            final java.lang.String svgTemplate) {
        this._svgTemplate = svgTemplate;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: type of this report
     * (calendar/classic)
     *
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
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
     * org.opennms.netmgt.config.reporting.opennms.Report
     */
    public static org.opennms.netmgt.config.reporting.opennms.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.opennms.Report) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.opennms.Report.class, reader);
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
