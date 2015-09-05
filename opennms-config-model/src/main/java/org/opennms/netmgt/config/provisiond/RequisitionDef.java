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
package org.opennms.netmgt.config.provisiond;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Defines an import job with a cron expression
 *
 *  http://quartz.sourceforge.net/javadoc/org/quartz/CronTrigger.html
 *  Field Name Allowed Values Allowed Special Characters
 *  Seconds 0-59 , - /
 *  Minutes 0-59 , - /
 *  Hours 0-23 , - /
 *  Day-of-month 1-31 , - ? / L W C
 *  Month 1-12 or JAN-DEC , - /
 *  Day-of-Week 1-7 or SUN-SAT , - ? / L C #
 *  Year (Opt) empty, 1970-2099 , - /
 *
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="requisition-def")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("provisiond-configuration.xsd")
@SuppressWarnings("all") public class RequisitionDef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _importUrlResource.
     */
    @XmlAttribute(name="import-url-resource", required = true)
    private java.lang.String _importUrlResource;

    /**
     * Field _importName.
     */
    @XmlAttribute(name="import-name", required = true)
    private java.lang.String _importName;

    /**
     * Field _rescanExisting.
     */
    @XmlAttribute(name="rescan-existing")
    private java.lang.String _rescanExisting;
    private static final String DEFAULT_RESCAN_EXISTING = "true";

    /**
     * Field _cronSchedule.
     */
    @XmlElement(name="cron-schedule")
    private java.lang.String _cronSchedule;


      //----------------/
     //- Constructors -/
    //----------------/

    public RequisitionDef() {
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

        if (obj instanceof RequisitionDef) {

            RequisitionDef temp = (RequisitionDef)obj;
            if (this._importUrlResource != null) {
                if (temp._importUrlResource == null) return false;
                else if (!(this._importUrlResource.equals(temp._importUrlResource)))
                    return false;
            }
            else if (temp._importUrlResource != null)
                return false;
            if (this._importName != null) {
                if (temp._importName == null) return false;
                else if (!(this._importName.equals(temp._importName)))
                    return false;
            }
            else if (temp._importName != null)
                return false;
            if (this._rescanExisting != null) {
                if (temp._rescanExisting == null) return false;
                else if (!(this._rescanExisting.equals(temp._rescanExisting)))
                    return false;
            }
            else if (temp._rescanExisting != null)
                return false;
            if (this._cronSchedule != null) {
                if (temp._cronSchedule == null) return false;
                else if (!(this._cronSchedule.equals(temp._cronSchedule)))
                    return false;
            }
            else if (temp._cronSchedule != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'cronSchedule'.
     *
     * @return the value of field 'CronSchedule'.
     */
    public java.lang.String getCronSchedule(
    ) {
        return this._cronSchedule;
    }

    /**
     * Returns the value of field 'importName'.
     *
     * @return the value of field 'ImportName'.
     */
    public java.lang.String getImportName(
    ) {
        return this._importName;
    }

    /**
     * Returns the value of field 'importUrlResource'.
     *
     * @return the value of field 'ImportUrlResource'.
     */
    public java.lang.String getImportUrlResource(
    ) {
        return this._importUrlResource;
    }

    /**
     * Returns the value of field 'rescanExisting'.
     *
     * @return the value of field 'RescanExisting'.
     */
    public java.lang.String getRescanExisting(
    ) {
        return this._rescanExisting == null ? DEFAULT_RESCAN_EXISTING : this._rescanExisting;
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
        if (_importUrlResource != null) {
           result = 37 * result + _importUrlResource.hashCode();
        }
        if (_importName != null) {
           result = 37 * result + _importName.hashCode();
        }
        if (_rescanExisting != null) {
           result = 37 * result + _rescanExisting.hashCode();
        }
        if (_cronSchedule != null) {
           result = 37 * result + _cronSchedule.hashCode();
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
     * Sets the value of field 'cronSchedule'.
     *
     * @param cronSchedule the value of field 'cronSchedule'.
     */
    public void setCronSchedule(
            final java.lang.String cronSchedule) {
        this._cronSchedule = cronSchedule;
    }

    /**
     * Sets the value of field 'importName'.
     *
     * @param importName the value of field 'importName'.
     */
    public void setImportName(
            final java.lang.String importName) {
        this._importName = importName;
    }

    /**
     * Sets the value of field 'importUrlResource'.
     *
     * @param importUrlResource the value of field
     * 'importUrlResource'.
     */
    public void setImportUrlResource(
            final java.lang.String importUrlResource) {
        this._importUrlResource = importUrlResource;
    }

    /**
     * Sets the value of field 'rescanExisting'.
     *
     * @param rescanExisting the value of field 'rescanExisting'.
     */
    public void setRescanExisting(
            final java.lang.String rescanExisting) {
        this._rescanExisting = rescanExisting;
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
     * org.opennms.netmgt.config.provisiond.RequisitionDef
     */
    public static org.opennms.netmgt.config.provisiond.RequisitionDef unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.provisiond.RequisitionDef) Unmarshaller.unmarshal(org.opennms.netmgt.config.provisiond.RequisitionDef.class, reader);
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
