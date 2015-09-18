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
 * Basically attributes that help setup the javamailer's confusion
 * set of properties.
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

@XmlRootElement(name = "sendmail-protocol")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("javamail-configuration.xsd")
@SuppressWarnings("all")
public class SendmailProtocol implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _charSet.
     */
    @XmlAttribute(name = "char-set")
    private java.lang.String _charSet;
    private static final String DEFAULT_CHARSET = "us-ascii";

    /**
     * Field _mailer.
     */
    @XmlAttribute(name = "mailer")
    private java.lang.String _mailer;
    private static final String DEFAULT_MAILER = "smtpsend";

    /**
     * Field _messageContentType.
     */
    @XmlAttribute(name = "message-content-type")
    private java.lang.String _messageContentType;
    private static final String DEFAULT_MESSAGE_CONTENT_TYPE = "text/plain";

    /**
     * Field _messageEncoding.
     */
    @XmlAttribute(name = "message-encoding")
    private java.lang.String _messageEncoding;
    private static final String DEFAULT_MESSAGE_ENCODING = "7-bit";

    /**
     * Field _quitWait.
     */
    @XmlAttribute(name = "quit-wait")
    private Boolean _quitWait;
    private static final Boolean DEFAULT_QUIT_WAIT = true;

    /**
     * Field _transport.
     */
    @XmlAttribute(name = "transport")
    private java.lang.String _transport;
    private static final String DEFAULT_TRANSPORT = "smtp";

    /**
     * Field _sslEnable.
     */
    @XmlAttribute(name = "ssl-enable")
    private Boolean _sslEnable;
    private static final Boolean DEFAULT_SSL_ENABLE = false;

    /**
     * Field _startTls.
     */
    @XmlAttribute(name = "start-tls")
    private Boolean _startTls;
    private static final Boolean DEFAULT_START_TLS = false;

      //----------------/
    //- Constructors -/
    //----------------/
    public SendmailProtocol() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     */
    public void deleteQuitWait() {
        this._quitWait = null;
    }

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

        if (obj instanceof SendmailProtocol) {

            SendmailProtocol temp = (SendmailProtocol) obj;
            if (this._charSet != null) {
                if (temp._charSet == null) {
                    return false;
                } else if (!(this._charSet.equals(temp._charSet))) {
                    return false;
                }
            } else if (temp._charSet != null) {
                return false;
            }
            if (this._mailer != null) {
                if (temp._mailer == null) {
                    return false;
                } else if (!(this._mailer.equals(temp._mailer))) {
                    return false;
                }
            } else if (temp._mailer != null) {
                return false;
            }
            if (this._messageContentType != null) {
                if (temp._messageContentType == null) {
                    return false;
                } else if (!(this._messageContentType.equals(temp._messageContentType))) {
                    return false;
                }
            } else if (temp._messageContentType != null) {
                return false;
            }
            if (this._messageEncoding != null) {
                if (temp._messageEncoding == null) {
                    return false;
                } else if (!(this._messageEncoding.equals(temp._messageEncoding))) {
                    return false;
                }
            } else if (temp._messageEncoding != null) {
                return false;
            }
            if (this._quitWait != null) {
                if (temp._quitWait == null) {
                    return false;
                } else if (!(this._quitWait.equals(temp._quitWait))) {
                    return false;
                }
            } else if (temp._quitWait != null) {
                return false;
            }
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
     * Returns the value of field 'charSet'.
     *
     * @return the value of field 'CharSet'.
     */
    public java.lang.String getCharSet() {
        return this._charSet == null ? DEFAULT_CHARSET : this._charSet;
    }

    /**
     * Returns the value of field 'mailer'.
     *
     * @return the value of field 'Mailer'.
     */
    public java.lang.String getMailer() {
        return this._mailer == null ? DEFAULT_MAILER : this._mailer;
    }

    /**
     * Returns the value of field 'messageContentType'.
     *
     * @return the value of field 'MessageContentType'.
     */
    public java.lang.String getMessageContentType() {
        return this._messageContentType == null ? DEFAULT_MESSAGE_CONTENT_TYPE : this._messageContentType;
    }

    /**
     * Returns the value of field 'messageEncoding'.
     *
     * @return the value of field 'MessageEncoding'.
     */
    public java.lang.String getMessageEncoding() {
        return this._messageEncoding == null ? DEFAULT_MESSAGE_ENCODING : this._messageEncoding;
    }

    /**
     * Returns the value of field 'quitWait'.
     *
     * @return the value of field 'QuitWait'.
     */
    public Boolean getQuitWait() {
        return this._quitWait == null ? DEFAULT_QUIT_WAIT : this._quitWait;
    }

    /**
     * Returns the value of field 'sslEnable'.
     *
     * @return the value of field 'SslEnable'.
     */
    public Boolean getSslEnable() {
        return this._sslEnable == null ? DEFAULT_SSL_ENABLE : this._sslEnable;
    }

    /**
     * Returns the value of field 'startTls'.
     *
     * @return the value of field 'StartTls'.
     */
    public Boolean getStartTls() {
        return this._startTls == null ? DEFAULT_START_TLS : this._startTls;
    }

    /**
     * Returns the value of field 'transport'.
     *
     * @return the value of field 'Transport'.
     */
    public java.lang.String getTransport() {
        return this._transport == null ? DEFAULT_TRANSPORT : this._transport;
    }

    /**
     * Method hasQuitWait.
     *
     * @return true if at least one QuitWait has been added
     */
    public boolean hasQuitWait() {
        return this._quitWait != null;
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
        if (_charSet != null) {
            result = 37 * result + _charSet.hashCode();
        }
        if (_mailer != null) {
            result = 37 * result + _mailer.hashCode();
        }
        if (_messageContentType != null) {
            result = 37 * result + _messageContentType.hashCode();
        }
        if (_messageEncoding != null) {
            result = 37 * result + _messageEncoding.hashCode();
        }
        if (_quitWait != null) {
            result = 37 * result + _quitWait.hashCode();
        }
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
     * Returns the value of field 'quitWait'.
     *
     * @return the value of field 'QuitWait'.
     */
    public boolean isQuitWait() {
        return this._quitWait;
    }

    /**
     * Returns the value of field 'sslEnable'.
     *
     * @return the value of field 'SslEnable'.
     */
    public boolean isSslEnable() {
        return this._sslEnable;
    }

    /**
     * Returns the value of field 'startTls'.
     *
     * @return the value of field 'StartTls'.
     */
    public boolean isStartTls() {
        return this._startTls;
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
     * Sets the value of field 'charSet'.
     *
     * @param charSet the value of field 'charSet'.
     */
    public void setCharSet(
            final java.lang.String charSet) {
        this._charSet = charSet;
    }

    /**
     * Sets the value of field 'mailer'.
     *
     * @param mailer the value of field 'mailer'.
     */
    public void setMailer(
            final java.lang.String mailer) {
        this._mailer = mailer;
    }

    /**
     * Sets the value of field 'messageContentType'.
     *
     * @param messageContentType the value of field
     * 'messageContentType'.
     */
    public void setMessageContentType(
            final java.lang.String messageContentType) {
        this._messageContentType = messageContentType;
    }

    /**
     * Sets the value of field 'messageEncoding'.
     *
     * @param messageEncoding the value of field 'messageEncoding'.
     */
    public void setMessageEncoding(
            final java.lang.String messageEncoding) {
        this._messageEncoding = messageEncoding;
    }

    /**
     * Sets the value of field 'quitWait'.
     *
     * @param quitWait the value of field 'quitWait'.
     */
    public void setQuitWait(
            final Boolean quitWait) {
        this._quitWait = quitWait;
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
     * org.opennms.netmgt.config.javamail.SendmailProtocol
     */
    public static org.opennms.netmgt.config.javamail.SendmailProtocol unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.SendmailProtocol) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.SendmailProtocol.class, reader);
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
