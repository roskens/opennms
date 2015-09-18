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
 * Basically any attributes that help setup the javamailer's
 * confusing set of properties.
 *
 *
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "readmail-protocol")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("javamail-configuration.xsd")
@SuppressWarnings("all")
public class ReadmailProtocol implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _transport.
     */
    @XmlAttribute(name = "transport")
    private java.lang.String _transport;

    /**
     * Field _sslEnable.
     */
    @XmlAttribute(name = "ssl-enable")
    private Boolean _sslEnable;

    /**
     * Field _startTls.
     */
    @XmlAttribute(name = "start-tls")
    private Boolean _startTls;

      //----------------/
    //- Constructors -/
    //----------------/
    public ReadmailProtocol() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     */
    public void deleteSslEnable() {
        this._sslEnable = null;
    }

    /**
     */
    public void deleteStartTls() {
        this._startTls = null;
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
        if (this == obj) {
            return true;
        }

        if (obj instanceof ReadmailProtocol) {

            ReadmailProtocol temp = (ReadmailProtocol) obj;
            if (this._transport != null) {
                if (temp._transport == null) {
                    return false;
                } else if (!(this._transport.equals(temp._transport))) {
                    return false;
                }
            } else if (temp._transport != null) {
                return false;
            }
            if (this._sslEnable != null) {
                if (temp._sslEnable == null) {
                    return false;
                } else if (!(this._sslEnable.equals(temp._sslEnable))) {
                    return false;
                }
            } else if (temp._sslEnable != null) {
                return false;
            }
            if (this._startTls != null) {
                if (temp._startTls == null) {
                    return false;
                } else if (!(this._startTls.equals(temp._startTls))) {
                    return false;
                }
            } else if (temp._startTls != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'sslEnable'.
     *
     * @return the value of field 'SslEnable'.
     */
    public boolean getSslEnable() {
        return this._sslEnable;
    }

    /**
     * Returns the value of field 'startTls'.
     *
     * @return the value of field 'StartTls'.
     */
    public boolean getStartTls() {
        return this._startTls;
    }

    /**
     * Returns the value of field 'transport'.
     *
     * @return the value of field 'Transport'.
     */
    public java.lang.String getTransport() {
        return this._transport;
    }

    /**
     * Method hasSslEnable.
     *
     * @return true if at least one SslEnable has been added
     */
    public boolean hasSslEnable() {
        return this._sslEnable != null;
    }

    /**
     * Method hasStartTls.
     *
     * @return true if at least one StartTls has been added
     */
    public boolean hasStartTls() {
        return this._startTls != null;
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
        if (_transport != null) {
            result = 37 * result + _transport.hashCode();
        }
        if (_sslEnable != null) {
            result = 37 * result + _sslEnable.hashCode();
        }
        if (_startTls != null) {
            result = 37 * result + _startTls.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'sslEnable'.
     *
     * @return the value of field 'SslEnable'.
     */
    public Boolean isSslEnable() {
        return this._sslEnable == null ? Boolean.FALSE : this._sslEnable;
    }

    /**
     * Returns the value of field 'startTls'.
     *
     * @return the value of field 'StartTls'.
     */
    public Boolean isStartTls() {
        return this._startTls == null ? Boolean.FALSE : this._startTls;
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
     * Sets the value of field 'sslEnable'.
     *
     * @param sslEnable the value of field 'sslEnable'.
     */
    public void setSslEnable(
            final Boolean sslEnable) {
        this._sslEnable = sslEnable;
    }

    /**
     * Sets the value of field 'startTls'.
     *
     * @param startTls the value of field 'startTls'.
     */
    public void setStartTls(
            final Boolean startTls) {
        this._startTls = startTls;
    }

    /**
     * Sets the value of field 'transport'.
     *
     * @param transport the value of field 'transport'.
     */
    public void setTransport(
            final java.lang.String transport) {
        this._transport = transport;
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
     * org.opennms.netmgt.config.javamail.ReadmailProtocol
     */
    public static org.opennms.netmgt.config.javamail.ReadmailProtocol unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.ReadmailProtocol) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.ReadmailProtocol.class, reader);
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
