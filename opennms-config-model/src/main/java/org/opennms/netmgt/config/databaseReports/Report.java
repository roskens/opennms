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
package org.opennms.netmgt.config.databaseReports;

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
@ValidateUsing("database-reports.xsd")
@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name of this report as defined in engine
     *  configuration
     */
    @XmlAttribute(name="id")
    private java.lang.String _id;

    /**
     * the name of this report as displayed in the webui
     *
     */
    @XmlAttribute(name="display-name")
    private java.lang.String _displayName;

    /**
     * the name of the engine to use to process and
     *  render this report
     */
    @XmlAttribute(name="report-service")
    private java.lang.String _reportService;

    /**
     * report description
     */
    @XmlAttribute(name="description")
    private java.lang.String _description;

    /**
     * determines if the report may be executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     */
    @XmlAttribute(name="online")
    private Boolean _online;


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
     */
    public void deleteOnline(
    ) {
        this._online= null;
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

        if (obj instanceof Report) {

            Report temp = (Report)obj;
            if (this._id != null) {
                if (temp._id == null) return false;
                else if (!(this._id.equals(temp._id)))
                    return false;
            }
            else if (temp._id != null)
                return false;
            if (this._displayName != null) {
                if (temp._displayName == null) return false;
                else if (!(this._displayName.equals(temp._displayName)))
                    return false;
            }
            else if (temp._displayName != null)
                return false;
            if (this._reportService != null) {
                if (temp._reportService == null) return false;
                else if (!(this._reportService.equals(temp._reportService)))
                    return false;
            }
            else if (temp._reportService != null)
                return false;
            if (this._description != null) {
                if (temp._description == null) return false;
                else if (!(this._description.equals(temp._description)))
                    return false;
            }
            else if (temp._description != null)
                return false;
            if (this._online != null) {
                if (temp._online == null) return false;
                else if (!(this._online.equals(temp._online)))
                    return false;
            }
            else if (temp._online != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: report
     * description
     *
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this report as displayed in the webui
     *
     *
     * @return the value of field 'DisplayName'.
     */
    public java.lang.String getDisplayName(
    ) {
        return this._displayName;
    }

    /**
     * Returns the value of field 'id'. The field 'id' has the
     * following description: the name of this report as defined in
     * engine
     *  configuration
     *
     * @return the value of field 'Id'.
     */
    public java.lang.String getId(
    ) {
        return this._id;
    }

    /**
     * Returns the value of field 'online'. The field 'online' has
     * the following description: determines if the report may be
     * executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     *
     * @return the value of field 'Online'.
     */
    public Boolean getOnline(
    ) {
        return this._online == null ? false : this._online;
    }

    /**
     * Returns the value of field 'reportService'. The field
     * 'reportService' has the following description: the name of
     * the engine to use to process and
     *  render this report
     *
     * @return the value of field 'ReportService'.
     */
    public java.lang.String getReportService(
    ) {
        return this._reportService;
    }

    /**
     * Method hasOnline.
     *
     * @return true if at least one Online has been added
     */
    public boolean hasOnline(
    ) {
        return this._online != null;
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

        if (_id != null) {
           result = 37 * result + _id.hashCode();
        }
        if (_displayName != null) {
           result = 37 * result + _displayName.hashCode();
        }
        if (_reportService != null) {
           result = 37 * result + _reportService.hashCode();
        }
        if (_description != null) {
           result = 37 * result + _description.hashCode();
        }
        if (_online != null) {
           result = 37 * result + _online.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'online'. The field 'online' has
     * the following description: determines if the report may be
     * executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     *
     * @return the value of field 'Online'.
     */
    public Boolean isOnline(
    ) {
        return this._online == null ? false : this._online;
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
     * Sets the value of field 'description'. The field
     * 'description' has the following description: report
     * description
     *
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this report as displayed in the webui
     *
     *
     * @param displayName the value of field 'displayName'.
     */
    public void setDisplayName(
            final java.lang.String displayName) {
        this._displayName = displayName;
    }

    /**
     * Sets the value of field 'id'. The field 'id' has the
     * following description: the name of this report as defined in
     * engine
     *  configuration
     *
     * @param id the value of field 'id'.
     */
    public void setId(
            final java.lang.String id) {
        this._id = id;
    }

    /**
     * Sets the value of field 'online'. The field 'online' has the
     * following description: determines if the report may be
     * executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     *
     * @param online the value of field 'online'.
     */
    public void setOnline(
            final Boolean online) {
        this._online = online;
    }

    /**
     * Sets the value of field 'reportService'. The field
     * 'reportService' has the following description: the name of
     * the engine to use to process and
     *  render this report
     *
     * @param reportService the value of field 'reportService'.
     */
    public void setReportService(
            final java.lang.String reportService) {
        this._reportService = reportService;
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
     * org.opennms.netmgt.config.databaseReports.Report
     */
    public static org.opennms.netmgt.config.databaseReports.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.databaseReports.Report) Unmarshaller.unmarshal(org.opennms.netmgt.config.databaseReports.Report.class, reader);
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
