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
package org.opennms.netmgt.config.reporting;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * An offset period used as a base to determine a real
 *  date when running the report
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

@XmlRootElement(name="date-parm")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("report-parms.xsd")
@SuppressWarnings("all") public class DateParm implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name of this parameter as passed to the report
     *  engine
     */
    @XmlAttribute(name="name", required = true)
    private String _name;

    /**
     * the name of this parameter as displayed in the
     *  webui
     */
    @XmlAttribute(name="display-name", required = true)
    private String _displayName;

    /**
     * flag to use absolute date if possible
     */
    @XmlAttribute(name="use-absolute-date")
    private Boolean _useAbsoluteDate;

    /**
     * Field _defaultInterval.
     */
    @XmlElement(name="default-interval")
    private String _defaultInterval;

    /**
     * Field _defaultCount.
     */
    @XmlElement(name="default-count")
    private Integer _defaultCount;

    /**
     * Field _defaultTime.
     */
    @XmlElement(name="default-time")
    private org.opennms.netmgt.config.reporting.DefaultTime _defaultTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public DateParm() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDefaultCount(
    ) {
        this._defaultCount = null;
    }

    /**
     */
    public void deleteUseAbsoluteDate(
    ) {
        this._useAbsoluteDate = null;
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

        if (obj instanceof DateParm) {
            DateParm temp = (DateParm)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._displayName != null) {
                if (temp._displayName == null) return false;
                else if (!(this._displayName.equals(temp._displayName)))
                    return false;
            }
            else if (temp._displayName != null)
                return false;
            if (this._useAbsoluteDate != null) {
                if (temp._useAbsoluteDate == null) return false;
                else if (!(this._useAbsoluteDate.equals(temp._useAbsoluteDate)))
                    return false;
            }
            else if (temp._useAbsoluteDate != null)
                return false;
            if (this._defaultInterval != null) {
                if (temp._defaultInterval == null) return false;
                else if (!(this._defaultInterval.equals(temp._defaultInterval)))
                    return false;
            }
            else if (temp._defaultInterval != null)
                return false;
            if (this._defaultCount != null) {
                if (temp._defaultCount == null) return false;
                else if (!(this._defaultCount.equals(temp._defaultCount)))
                    return false;
            }
            else if (temp._defaultCount != null)
                return false;
            if (this._defaultTime != null) {
                if (temp._defaultTime == null) return false;
                else if (!(this._defaultTime.equals(temp._defaultTime)))
                    return false;
            }
            else if (temp._defaultTime != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultCount'.
     *
     * @return the value of field 'DefaultCount'.
     */
    public Integer getDefaultCount(
    ) {
        return this._defaultCount;
    }

    /**
     * Returns the value of field 'defaultInterval'.
     *
     * @return the value of field 'DefaultInterval'.
     */
    public java.lang.String getDefaultInterval(
    ) {
        return this._defaultInterval;
    }

    /**
     * Returns the value of field 'defaultTime'.
     *
     * @return the value of field 'DefaultTime'.
     */
    public org.opennms.netmgt.config.reporting.DefaultTime getDefaultTime(
    ) {
        return this._defaultTime;
    }

    /**
     * Returns the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this parameter as displayed in the
     *  webui
     *
     * @return the value of field 'DisplayName'.
     */
    public java.lang.String getDisplayName(
    ) {
        return this._displayName;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: the name of this parameter as passed
     * to the report
     *  engine
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'useAbsoluteDate'. The field
     * 'useAbsoluteDate' has the following description: flag to use
     * absolute date if possible
     *
     * @return the value of field 'UseAbsoluteDate'.
     */
    public Boolean getUseAbsoluteDate(
    ) {
        return this._useAbsoluteDate;
    }

    /**
     * Method hasDefaultCount.
     *
     * @return true if at least one DefaultCount has been added
     */
    public boolean hasDefaultCount(
    ) {
        return this._defaultCount != null;
    }

    /**
     * Method hasUseAbsoluteDate.
     *
     * @return true if at least one UseAbsoluteDate has been added
     */
    public boolean hasUseAbsoluteDate(
    ) {
        return this._useAbsoluteDate != null;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_displayName != null) {
           result = 37 * result + _displayName.hashCode();
        }
        if (_useAbsoluteDate != null) {
           result = 37 * result + _useAbsoluteDate.hashCode();
        }
        if (_defaultInterval != null) {
           result = 37 * result + _defaultInterval.hashCode();
        }
        if (_defaultCount != null) {
           result = 37 * result + _defaultCount.hashCode();
        }
        if (_defaultTime != null) {
           result = 37 * result + _defaultTime.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'useAbsoluteDate'. The field
     * 'useAbsoluteDate' has the following description: flag to use
     * absolute date if possible
     *
     * @return the value of field 'UseAbsoluteDate'.
     */
    public boolean isUseAbsoluteDate(
    ) {
        return this._useAbsoluteDate;
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
     * Sets the value of field 'defaultCount'.
     *
     * @param defaultCount the value of field 'defaultCount'.
     */
    public void setDefaultCount(final Integer defaultCount) {
        this._defaultCount = defaultCount;
    }

    /**
     * Sets the value of field 'defaultInterval'.
     *
     * @param defaultInterval the value of field 'defaultInterval'.
     */
    public void setDefaultInterval(
            final java.lang.String defaultInterval) {
        this._defaultInterval = defaultInterval;
    }

    /**
     * Sets the value of field 'defaultTime'.
     *
     * @param defaultTime the value of field 'defaultTime'.
     */
    public void setDefaultTime(
            final org.opennms.netmgt.config.reporting.DefaultTime defaultTime) {
        this._defaultTime = defaultTime;
    }

    /**
     * Sets the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this parameter as displayed in the
     *  webui
     *
     * @param displayName the value of field 'displayName'.
     */
    public void setDisplayName(
            final java.lang.String displayName) {
        this._displayName = displayName;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: the name of this parameter as passed
     * to the report
     *  engine
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'useAbsoluteDate'. The field
     * 'useAbsoluteDate' has the following description: flag to use
     * absolute date if possible
     *
     * @param useAbsoluteDate the value of field 'useAbsoluteDate'.
     */
    public void setUseAbsoluteDate(final Boolean useAbsoluteDate) {
        this._useAbsoluteDate = useAbsoluteDate;
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
     * org.opennms.netmgt.config.reporting.DateParm
     */
    public static org.opennms.netmgt.config.reporting.DateParm unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.DateParm) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.DateParm.class, reader);
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
