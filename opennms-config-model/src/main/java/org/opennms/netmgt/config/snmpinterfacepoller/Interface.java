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
package org.opennms.netmgt.config.snmpinterfacepoller;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Interfaces to be polled for addresses in this
 *  package.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "interface")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("snmp-interface-poller-configuration.xsd")
@SuppressWarnings("all")
public class Interface implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * This represents the SQL criteria that is performed to select
     * interfaces to be polled
     *  example: (snmpifname like '%eth%' and snmpiftype=6)
     */
    @XmlAttribute(name = "criteria")
    private java.lang.String _criteria;

    /**
     * Interfaces group name
     */
    @XmlAttribute(name = "name", required = true)
    private java.lang.String _name;

    /**
     * Interval at which the interfaces are to be
     *  polled
     */
    @XmlAttribute(name = "interval", required = true)
    private Long _interval;

    /**
     * Specifies if the service is user defined. Used
     *  specifically for UI purposes.
     */
    @XmlAttribute(name = "user-defined")
    private java.lang.String _userDefined;
    private static final String DEFAULT_USER_DEFINED = "false";

    /**
     * Status of the interfaces. The interfaces are polled only if
     *  this is set to 'on'.
     */
    @XmlAttribute(name = "status")
    private java.lang.String _status;
    private static final String DEFAULT_STATUS = "on";

    /**
     * If set, overrides UDP port 161 as the port where SNMP
     *  GET/GETNEXT/GETBULK requests are sent.
     */
    @XmlAttribute(name = "port")
    private Integer _port;

    /**
     * Default number of retries
     */
    @XmlAttribute(name = "retry")
    private Integer _retry;

    /**
     * Default timeout (in milliseconds)
     */
    private Integer _timeout;

    /**
     * Number of variables to send per SNMP request.
     *
     */
    private Integer _maxVarsPerPdu;
    private static final Integer DEFAULT_MAXVARSPERPDU = 10;

    /**
     * Max Number of Interface per runnable. This is deprecated and
     * will be ignored in the code!
     *
     */
    private Integer _maxInterfacePerPdu;
    private static final Integer DEFAULT_MAXINTERFACEPERPDU = 0;

      //----------------/
    //- Constructors -/
    //----------------/
    public Interface() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     */
    public void deleteInterval() {
        this._interval = null;
    }

    /**
     */
    public void deleteMaxInterfacePerPdu() {
        this._maxInterfacePerPdu = null;
    }

    /**
     */
    public void deleteMaxVarsPerPdu() {
        this._maxVarsPerPdu = null;
    }

    /**
     */
    public void deletePort() {
        this._port = null;
    }

    /**
     */
    public void deleteRetry() {
        this._retry = null;
    }

    /**
     */
    public void deleteTimeout() {
        this._timeout = null;
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

        if (obj instanceof Interface) {

            Interface temp = (Interface) obj;
            if (this._criteria != null) {
                if (temp._criteria == null) {
                    return false;
                } else if (!(this._criteria.equals(temp._criteria))) {
                    return false;
                }
            } else if (temp._criteria != null) {
                return false;
            }
            if (this._name != null) {
                if (temp._name == null) {
                    return false;
                } else if (!(this._name.equals(temp._name))) {
                    return false;
                }
            } else if (temp._name != null) {
                return false;
            }
            if (this._interval != null) {
                if (temp._interval == null) {
                    return false;
                } else if (!(this._interval.equals(temp._interval))) {
                    return false;
                }
            } else if (temp._interval != null) {
                return false;
            }
            if (this._userDefined != null) {
                if (temp._userDefined == null) {
                    return false;
                } else if (!(this._userDefined.equals(temp._userDefined))) {
                    return false;
                }
            } else if (temp._userDefined != null) {
                return false;
            }
            if (this._status != null) {
                if (temp._status == null) {
                    return false;
                } else if (!(this._status.equals(temp._status))) {
                    return false;
                }
            } else if (temp._status != null) {
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
            if (this._retry != null) {
                if (temp._retry == null) {
                    return false;
                } else if (!(this._retry.equals(temp._retry))) {
                    return false;
                }
            } else if (temp._retry != null) {
                return false;
            }
            if (this._timeout != null) {
                if (temp._timeout == null) {
                    return false;
                } else if (!(this._timeout.equals(temp._timeout))) {
                    return false;
                }
            } else if (temp._timeout != null) {
                return false;
            }
            if (this._maxVarsPerPdu != null) {
                if (temp._maxVarsPerPdu == null) {
                    return false;
                } else if (!(this._maxVarsPerPdu.equals(temp._maxVarsPerPdu))) {
                    return false;
                }
            } else if (temp._maxVarsPerPdu != null) {
                return false;
            }
            if (this._maxInterfacePerPdu != null) {
                if (temp._maxInterfacePerPdu == null) {
                    return false;
                } else if (!(this._maxInterfacePerPdu.equals(temp._maxInterfacePerPdu))) {
                    return false;
                }
            } else if (temp._maxInterfacePerPdu != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'criteria'. The field 'criteria'
     * has the following description: This represents the SQL
     * criteria that is performed to select interfaces to be polled
     *  example: (snmpifname like '%eth%' and snmpiftype=6)
     *
     * @return the value of field 'Criteria'.
     */
    public java.lang.String getCriteria() {
        return this._criteria;
    }

    /**
     * Returns the value of field 'interval'. The field 'interval'
     * has the following description: Interval at which the
     * interfaces are to be
     *  polled
     *
     * @return the value of field 'Interval'.
     */
    public Long getInterval() {
        return this._interval;
    }

    /**
     * Returns the value of field 'maxInterfacePerPdu'. The field
     * 'maxInterfacePerPdu' has the following description: Max
     * Number of Interface per runnable. This is deprecated and
     * will be ignored in the code!
     *
     *
     * @return the value of field 'MaxInterfacePerPdu'.
     */
    public Integer getMaxInterfacePerPdu() {
        return this._maxInterfacePerPdu == null ? DEFAULT_MAXINTERFACEPERPDU : this._maxInterfacePerPdu;
    }

    /**
     * Returns the value of field 'maxVarsPerPdu'. The field
     * 'maxVarsPerPdu' has the following description: Number of
     * variables to send per SNMP request.
     *
     *
     * @return the value of field 'MaxVarsPerPdu'.
     */
    public Integer getMaxVarsPerPdu() {
        return this._maxVarsPerPdu == null ? DEFAULT_MAXVARSPERPDU : this._maxVarsPerPdu;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Interfaces group name
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName() {
        return this._name;
    }

    /**
     * Returns the value of field 'port'. The field 'port' has the
     * following description: If set, overrides UDP port 161 as the
     * port where SNMP
     *  GET/GETNEXT/GETBULK requests are sent.
     *
     * @return the value of field 'Port'.
     */
    public Integer getPort() {
        return this._port;
    }

    /**
     * Returns the value of field 'retry'. The field 'retry' has
     * the following description: Default number of retries
     *
     * @return the value of field 'Retry'.
     */
    public Integer getRetry() {
        return this._retry;
    }

    /**
     * Returns the value of field 'status'. The field 'status' has
     * the following description: Status of the interfaces. The
     * interfaces are polled only if
     *  this is set to 'on'.
     *
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus() {
        return this._status == null ? DEFAULT_STATUS : this._status;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: Default timeout (in
     * milliseconds)
     *
     * @return the value of field 'Timeout'.
     */
    public int getTimeout() {
        return this._timeout;
    }

    /**
     * Returns the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * the service is user defined. Used
     *  specifically for UI purposes.
     *
     * @return the value of field 'UserDefined'.
     */
    public java.lang.String getUserDefined() {
        return this._userDefined == null ? DEFAULT_USER_DEFINED : this._userDefined;
    }

    /**
     * Method hasInterval.
     *
     * @return true if at least one Interval has been added
     */
    public boolean hasInterval() {
        return this._interval != null;
    }

    /**
     * Method hasMaxInterfacePerPdu.
     *
     * @return true if at least one MaxInterfacePerPdu has been adde
     */
    public boolean hasMaxInterfacePerPdu() {
        return this._maxInterfacePerPdu != null;
    }

    /**
     * Method hasMaxVarsPerPdu.
     *
     * @return true if at least one MaxVarsPerPdu has been added
     */
    public boolean hasMaxVarsPerPdu() {
        return this._maxVarsPerPdu != null;
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
     * Method hasRetry.
     *
     * @return true if at least one Retry has been added
     */
    public boolean hasRetry() {
        return this._retry != null;
    }

    /**
     * Method hasTimeout.
     *
     * @return true if at least one Timeout has been added
     */
    public boolean hasTimeout() {
        return this._timeout != null;
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
        if (_criteria != null) {
            result = 37 * result + _criteria.hashCode();
        }
        if (_name != null) {
            result = 37 * result + _name.hashCode();
        }
        if (_interval != null) {
            result = 37 * result + _interval.hashCode();
        }
        if (_userDefined != null) {
            result = 37 * result + _userDefined.hashCode();
        }
        if (_status != null) {
            result = 37 * result + _status.hashCode();
        }
        if (_port != null) {
            result = 37 * result + _port.hashCode();
        }
        if (_retry != null) {
            result = 37 * result + _retry.hashCode();
        }
        if (_timeout != null) {
            result = 37 * result + _timeout.hashCode();
        }
        if (_maxVarsPerPdu != null) {
            result = 37 * result + _maxVarsPerPdu.hashCode();
        }
        if (_maxInterfacePerPdu != null) {
            result = 37 * result + _maxInterfacePerPdu.hashCode();
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
     * Sets the value of field 'criteria'. The field 'criteria' has
     * the following description: This represents the SQL criteria
     * that is performed to select interfaces to be polled
     *  example: (snmpifname like '%eth%' and snmpiftype=6)
     *
     * @param criteria the value of field 'criteria'.
     */
    public void setCriteria(
            final java.lang.String criteria) {
        this._criteria = criteria;
    }

    /**
     * Sets the value of field 'interval'. The field 'interval' has
     * the following description: Interval at which the interfaces
     * are to be
     *  polled
     *
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final Long interval) {
        this._interval = interval;
    }

    /**
     * Sets the value of field 'maxInterfacePerPdu'. The field
     * 'maxInterfacePerPdu' has the following description: Max
     * Number of Interface per runnable. This is deprecated and
     * will be ignored in the code!
     *
     *
     * @param maxInterfacePerPdu the value of field
     * 'maxInterfacePerPdu'.
     */
    public void setMaxInterfacePerPdu(
            final Integer maxInterfacePerPdu) {
        this._maxInterfacePerPdu = maxInterfacePerPdu;
    }

    /**
     * Sets the value of field 'maxVarsPerPdu'. The field
     * 'maxVarsPerPdu' has the following description: Number of
     * variables to send per SNMP request.
     *
     *
     * @param maxVarsPerPdu the value of field 'maxVarsPerPdu'.
     */
    public void setMaxVarsPerPdu(
            final Integer maxVarsPerPdu) {
        this._maxVarsPerPdu = maxVarsPerPdu;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Interfaces group name
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'port'. The field 'port' has the
     * following description: If set, overrides UDP port 161 as the
     * port where SNMP
     *  GET/GETNEXT/GETBULK requests are sent.
     *
     * @param port the value of field 'port'.
     */
    public void setPort(
            final Integer port) {
        this._port = port;
    }

    /**
     * Sets the value of field 'retry'. The field 'retry' has the
     * following description: Default number of retries
     *
     * @param retry the value of field 'retry'.
     */
    public void setRetry(
            final Integer retry) {
        this._retry = retry;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: Status of the interfaces. The
     * interfaces are polled only if
     *  this is set to 'on'.
     *
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'timeout'. The field 'timeout' has
     * the following description: Default timeout (in milliseconds)
     *
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final Integer timeout) {
        this._timeout = timeout;
    }

    /**
     * Sets the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * the service is user defined. Used
     *  specifically for UI purposes.
     *
     * @param userDefined the value of field 'userDefined'.
     */
    public void setUserDefined(
            final java.lang.String userDefined) {
        this._userDefined = userDefined;
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
     * org.opennms.netmgt.config.snmpinterfacepoller.Interface
     */
    public static org.opennms.netmgt.config.snmpinterfacepoller.Interface unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpinterfacepoller.Interface) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpinterfacepoller.Interface.class, reader);
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
