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
package org.opennms.netmgt.config.syslogd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class SyslogdConfigurationGroup.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="syslogd-configuration-group")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("syslogd-configuration.xsd")
@SuppressWarnings("all") public class SyslogdConfigurationGroup implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ueiList.
     */
    @XmlElement(name="ueiList")
    private org.opennms.netmgt.config.syslogd.UeiList _ueiList;

    /**
     * Field _hideMessage.
     */
    @XmlElement(name="hideMessage")
    private org.opennms.netmgt.config.syslogd.HideMessage _hideMessage;


      //----------------/
     //- Constructors -/
    //----------------/

    public SyslogdConfigurationGroup() {
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

        if (obj instanceof SyslogdConfigurationGroup) {

            SyslogdConfigurationGroup temp = (SyslogdConfigurationGroup)obj;
            if (this._ueiList != null) {
                if (temp._ueiList == null) return false;
                else if (!(this._ueiList.equals(temp._ueiList)))
                    return false;
            }
            else if (temp._ueiList != null)
                return false;
            if (this._hideMessage != null) {
                if (temp._hideMessage == null) return false;
                else if (!(this._hideMessage.equals(temp._hideMessage)))
                    return false;
            }
            else if (temp._hideMessage != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'hideMessage'.
     *
     * @return the value of field 'HideMessage'.
     */
    public org.opennms.netmgt.config.syslogd.HideMessage getHideMessage(
    ) {
        return this._hideMessage;
    }

    /**
     * Returns the value of field 'ueiList'.
     *
     * @return the value of field 'UeiList'.
     */
    public org.opennms.netmgt.config.syslogd.UeiList getUeiList(
    ) {
        return this._ueiList;
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
        if (_ueiList != null) {
           result = 37 * result + _ueiList.hashCode();
        }
        if (_hideMessage != null) {
           result = 37 * result + _hideMessage.hashCode();
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
     * Sets the value of field 'hideMessage'.
     *
     * @param hideMessage the value of field 'hideMessage'.
     */
    public void setHideMessage(
            final org.opennms.netmgt.config.syslogd.HideMessage hideMessage) {
        this._hideMessage = hideMessage;
    }

    /**
     * Sets the value of field 'ueiList'.
     *
     * @param ueiList the value of field 'ueiList'.
     */
    public void setUeiList(
            final org.opennms.netmgt.config.syslogd.UeiList ueiList) {
        this._ueiList = ueiList;
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
     * org.opennms.netmgt.config.syslogd.SyslogdConfigurationGroup
     */
    public static org.opennms.netmgt.config.syslogd.SyslogdConfigurationGroup unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.SyslogdConfigurationGroup) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.SyslogdConfigurationGroup.class, reader);
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
