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
package org.opennms.netmgt.config.javamail;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Read and Send configuration list
 *
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "end2end-mail-config")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("javamail-configuration.xsd")
@SuppressWarnings("all")
public class End2endMailConfig implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _name.
     */
    @XmlAttribute(name = "name", required = true)
    private java.lang.String _name;

    /**
     * Field _sendmailConfigName.
     */
    @XmlAttribute(name = "sendmail-config-name")
    private java.lang.String _sendmailConfigName;

    /**
     * Field _readmailConfigName.
     */
    @XmlAttribute(name = "readmail-config-name")
    private java.lang.String _readmailConfigName;

      //----------------/
    //- Constructors -/
    //----------------/
    public End2endMailConfig() {
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
        if (this == obj) {
            return true;
        }

        if (obj instanceof End2endMailConfig) {

            End2endMailConfig temp = (End2endMailConfig) obj;
            if (this._name != null) {
                if (temp._name == null) {
                    return false;
                } else if (!(this._name.equals(temp._name))) {
                    return false;
                }
            } else if (temp._name != null) {
                return false;
            }
            if (this._sendmailConfigName != null) {
                if (temp._sendmailConfigName == null) {
                    return false;
                } else if (!(this._sendmailConfigName.equals(temp._sendmailConfigName))) {
                    return false;
                }
            } else if (temp._sendmailConfigName != null) {
                return false;
            }
            if (this._readmailConfigName != null) {
                if (temp._readmailConfigName == null) {
                    return false;
                } else if (!(this._readmailConfigName.equals(temp._readmailConfigName))) {
                    return false;
                }
            } else if (temp._readmailConfigName != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName() {
        return this._name;
    }

    /**
     * Returns the value of field 'readmailConfigName'.
     *
     * @return the value of field 'ReadmailConfigName'.
     */
    public java.lang.String getReadmailConfigName() {
        return this._readmailConfigName;
    }

    /**
     * Returns the value of field 'sendmailConfigName'.
     *
     * @return the value of field 'SendmailConfigName'.
     */
    public java.lang.String getSendmailConfigName() {
        return this._sendmailConfigName;
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
    public int hashCode() {
        int result = 17;

        long tmp;
        if (_name != null) {
            result = 37 * result + _name.hashCode();
        }
        if (_sendmailConfigName != null) {
            result = 37 * result + _sendmailConfigName.hashCode();
        }
        if (_readmailConfigName != null) {
            result = 37 * result + _readmailConfigName.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     *
     * @return true if this object is valid according to the schema
     */
    public boolean isValid() {
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
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'readmailConfigName'.
     *
     * @param readmailConfigName the value of field
     * 'readmailConfigName'.
     */
    public void setReadmailConfigName(
            final java.lang.String readmailConfigName) {
        this._readmailConfigName = readmailConfigName;
    }

    /**
     * Sets the value of field 'sendmailConfigName'.
     *
     * @param sendmailConfigName the value of field
     * 'sendmailConfigName'.
     */
    public void setSendmailConfigName(
            final java.lang.String sendmailConfigName) {
        this._sendmailConfigName = sendmailConfigName;
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
     * org.opennms.netmgt.config.javamail.End2endMailConfig
     */
    public static org.opennms.netmgt.config.javamail.End2endMailConfig unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.End2endMailConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.End2endMailConfig.class, reader);
    }

    /**
     *
     *
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
