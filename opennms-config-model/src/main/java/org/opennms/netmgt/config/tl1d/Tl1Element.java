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
package org.opennms.netmgt.config.tl1d;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Tl1Element.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "tl1-element")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("tl1d-configuration.xsd")
@SuppressWarnings("all")
public class Tl1Element implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _host.
     */
    @XmlAttribute(name = "host", required = true)
    private java.lang.String _host;

    /**
     * Field _port.
     */
    @XmlAttribute(name = "port")
    private Integer _port;
    private static final Integer DEFAULT_PORT = 502;

    /**
     * Field _userid.
     */
    @XmlAttribute(name = "userid")
    private java.lang.String _userid;
    private static final String DEFAULT_USERID = "opennms";

    /**
     * Field _password.
     */
    @XmlAttribute(name = "password")
    private java.lang.String _password;
    private static final String DEFAULT_PASSWORD = "opennms";

    /**
     * Field _tl1ClientApi.
     */
    @XmlAttribute(name = "tl1-client-api")
    private java.lang.String _tl1ClientApi;
    private static final String DEFAULT_TL1CLIENTAPI = "org.opennms.netmgt.tl1d.Tl1ClientImpl";

    /**
     * Field _tl1MessageParser.
     */
    @XmlAttribute(name = "tl1-message-parser")
    private java.lang.String _tl1MessageParser;
    private static final String DEFAULT_TL1MESSAGEPARSER = "org.opennms.netmgt.tl1d.Tl1AutonomousMessageProcessor";

    /**
     * Field _reconnectDelay.
     */
    @XmlAttribute(name = "reconnect-delay")
    private Long _reconnectDelay;
    private static final Long DEFAULT_RECONNECT_DELAY = 30000L;

      //----------------/
    //- Constructors -/
    //----------------/
    public Tl1Element() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     */
    public void deletePort() {
        this._port = null;
    }

    /**
     */
    public void deleteReconnectDelay() {
        this._reconnectDelay = null;
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

        if (obj instanceof Tl1Element) {

            Tl1Element temp = (Tl1Element) obj;
            if (this._host != null) {
                if (temp._host == null) {
                    return false;
                } else if (!(this._host.equals(temp._host))) {
                    return false;
                }
            } else if (temp._host != null) {
                return false;
            }
            if (this._port != null) {
                if (temp._port == null) {
                    return false;
                } else if (!(this._port.equals(temp._port))) {
                    return false;
                }
            } else if (temp._port != null) {
                return false;
            }
            if (this._userid != null) {
                if (temp._userid == null) {
                    return false;
                } else if (!(this._userid.equals(temp._userid))) {
                    return false;
                }
            } else if (temp._userid != null) {
                return false;
            }
            if (this._password != null) {
                if (temp._password == null) {
                    return false;
                } else if (!(this._password.equals(temp._password))) {
                    return false;
                }
            } else if (temp._password != null) {
                return false;
            }
            if (this._tl1ClientApi != null) {
                if (temp._tl1ClientApi == null) {
                    return false;
                } else if (!(this._tl1ClientApi.equals(temp._tl1ClientApi))) {
                    return false;
                }
            } else if (temp._tl1ClientApi != null) {
                return false;
            }
            if (this._tl1MessageParser != null) {
                if (temp._tl1MessageParser == null) {
                    return false;
                } else if (!(this._tl1MessageParser.equals(temp._tl1MessageParser))) {
                    return false;
                }
            } else if (temp._tl1MessageParser != null) {
                return false;
            }
            if (this._reconnectDelay != null) {
                if (temp._reconnectDelay == null) {
                    return false;
                } else if (!(this._reconnectDelay.equals(temp._reconnectDelay))) {
                    return false;
                }
            } else if (temp._reconnectDelay != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'host'.
     *
     * @return the value of field 'Host'.
     */
    public java.lang.String getHost() {
        return this._host;
    }

    /**
     * Returns the value of field 'password'.
     *
     * @return the value of field 'Password'.
     */
    public java.lang.String getPassword() {
        return this._password == null ? DEFAULT_PASSWORD : this._password;
    }

    /**
     * Returns the value of field 'port'.
     *
     * @return the value of field 'Port'.
     */
    public Integer getPort() {
        return this._port == null ? DEFAULT_PORT : this._port;
    }

    /**
     * Returns the value of field 'reconnectDelay'.
     *
     * @return the value of field 'ReconnectDelay'.
     */
    public Long getReconnectDelay() {
        return this._reconnectDelay == null ? DEFAULT_RECONNECT_DELAY : this._reconnectDelay;
    }

    /**
     * Returns the value of field 'tl1ClientApi'.
     *
     * @return the value of field 'Tl1ClientApi'.
     */
    public java.lang.String getTl1ClientApi() {
        return this._tl1ClientApi == null ? DEFAULT_TL1CLIENTAPI : this._tl1ClientApi;
    }

    /**
     * Returns the value of field 'tl1MessageParser'.
     *
     * @return the value of field 'Tl1MessageParser'.
     */
    public java.lang.String getTl1MessageParser() {
        return this._tl1MessageParser == null ? DEFAULT_TL1MESSAGEPARSER : this._tl1MessageParser;
    }

    /**
     * Returns the value of field 'userid'.
     *
     * @return the value of field 'Userid'.
     */
    public java.lang.String getUserid() {
        return this._userid == null ? DEFAULT_USERID : this._userid;
    }

    /**
     * Method hasPort.
     *
     * @return true if at least one Port has been added
     */
    public boolean hasPort() {
        return this._port != null;
    }

    /**
     * Method hasReconnectDelay.
     *
     * @return true if at least one ReconnectDelay has been added
     */
    public boolean hasReconnectDelay() {
        return this._reconnectDelay != null;
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
        if (_host != null) {
            result = 37 * result + _host.hashCode();
        }
        if (_port != null) {
            result = 37 * result + _port.hashCode();
        }
        if (_userid != null) {
            result = 37 * result + _userid.hashCode();
        }
        if (_password != null) {
            result = 37 * result + _password.hashCode();
        }
        if (_tl1ClientApi != null) {
            result = 37 * result + _tl1ClientApi.hashCode();
        }
        if (_tl1MessageParser != null) {
            result = 37 * result + _tl1MessageParser.hashCode();
        }
        if (_reconnectDelay != null) {
            result = 37 * result + _reconnectDelay.hashCode();
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
     * Sets the value of field 'host'.
     *
     * @param host the value of field 'host'.
     */
    public void setHost(
            final java.lang.String host) {
        this._host = host;
    }

    /**
     * Sets the value of field 'password'.
     *
     * @param password the value of field 'password'.
     */
    public void setPassword(
            final java.lang.String password) {
        this._password = password;
    }

    /**
     * Sets the value of field 'port'.
     *
     * @param port the value of field 'port'.
     */
    public void setPort(
            final Integer port) {
        this._port = port;
    }

    /**
     * Sets the value of field 'reconnectDelay'.
     *
     * @param reconnectDelay the value of field 'reconnectDelay'.
     */
    public void setReconnectDelay(
            final Long reconnectDelay) {
        this._reconnectDelay = reconnectDelay;
    }

    /**
     * Sets the value of field 'tl1ClientApi'.
     *
     * @param tl1ClientApi the value of field 'tl1ClientApi'.
     */
    public void setTl1ClientApi(
            final java.lang.String tl1ClientApi) {
        this._tl1ClientApi = tl1ClientApi;
    }

    /**
     * Sets the value of field 'tl1MessageParser'.
     *
     * @param tl1MessageParser the value of field 'tl1MessageParser'
     */
    public void setTl1MessageParser(
            final java.lang.String tl1MessageParser) {
        this._tl1MessageParser = tl1MessageParser;
    }

    /**
     * Sets the value of field 'userid'.
     *
     * @param userid the value of field 'userid'.
     */
    public void setUserid(
            final java.lang.String userid) {
        this._userid = userid;
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
     * org.opennms.netmgt.config.tl1d.Tl1Element
     */
    public static org.opennms.netmgt.config.tl1d.Tl1Element unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.tl1d.Tl1Element) Unmarshaller.unmarshal(org.opennms.netmgt.config.tl1d.Tl1Element.class, reader);
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
