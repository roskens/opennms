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
package org.opennms.netmgt.config.eventd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the eventd-configuration.xml
 *  configuration file.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="EventdConfiguration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("eventd-configuration.xsd")
@SuppressWarnings("all") public class EventdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The IP address on which eventd listens for TCP connections.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     */
    @XmlAttribute(name="TCPAddress")
    private java.lang.String _TCPAddress;

    /**
     * The port on which eventd listens for TCP connections.
     *  The default port is 5817.
     */
    @XmlAttribute(name="TCPPort", required = true)
    private Integer _TCPPort;

    /**
     * The IP address on which eventd listens for UDP packets.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     */
    @XmlAttribute(name="UDPAddress")
    private java.lang.String _UDPAddress;

    /**
     * The port on which eventd listens for UDP packets. The
     *  default port is 5817.
     */
    @XmlAttribute(name="UDPPort", required = true)
    private Integer _UDPPort;

    /**
     * The maximum number of threads used for reading and
     *  processing of incoming events.
     */
    @XmlAttribute(name="receivers", required = true)
    private Integer _receivers;

    /**
     * The maximum number of incoming events that can be
     *  queued inside eventd for processing.
     */
    @XmlAttribute(name="queue-length")
    private Integer _queueLength;

    /**
     * SQL query to get next value of the 'nodeNxtId'
     *  database sequence. This is used to make the access database
     *  independent.
     */
    @XmlAttribute(name="getNextEventID")
    private java.lang.String _getNextEventID;

    /**
     * Set the socket timeout value. In Linux, the close()
     *  system call is not preemptive. Setting this attribute to to
     * 'yes'
     *  causes the socketSoTimeoutPeriod attribute to be set on
     * sockets to
     *  mimic non-blocking socket I/O.
     */
    @XmlAttribute(name="socketSoTimeoutRequired", required = true)
    private java.lang.String _socketSoTimeoutRequired;

    /**
     * Socket timeout, in milliseconds. This is only set on
     *  eventd's sockets if socketSoTimeoutRequired is set to
     *  'yes'.
     */
    @XmlAttribute(name="socketSoTimeoutPeriod")
    private Integer _socketSoTimeoutPeriod;

    /**
     * Whether or not to log a simple event summary. By default,
     * OpenNMS
     *  logs detailed event information at DEBUG level. If this
     * option is enabled,
     *  it will additionally log a simple summary of events
     * received at INFO.
     */
    @XmlAttribute(name="logEventSummaries")
    private Boolean _logEventSummaries;

      //----------------/
     //- Constructors -/
    //----------------/

    public EventdConfiguration() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteLogEventSummaries(
    ) {
        this._logEventSummaries = null;
    }

    /**
     */
    public void deleteQueueLength(
    ) {
        this._queueLength = null;
    }

    /**
     */
    public void deleteReceivers(
    ) {
        this._receivers = null;
    }

    /**
     */
    public void deleteSocketSoTimeoutPeriod(
    ) {
        this._socketSoTimeoutPeriod = null;
    }

    /**
     */
    public void deleteTCPPort(
    ) {
        this._TCPPort = null;
    }

    /**
     */
    public void deleteUDPPort(
    ) {
        this._UDPPort = null;
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

        if (obj instanceof EventdConfiguration) {

            EventdConfiguration temp = (EventdConfiguration)obj;
            if (this._TCPAddress != null) {
                if (temp._TCPAddress == null) return false;
                else if (!(this._TCPAddress.equals(temp._TCPAddress)))
                    return false;
            }
            else if (temp._TCPAddress != null)
                return false;
            if (this._TCPPort != null) {
                if (temp._TCPPort == null) return false;
                else if (!(this._TCPPort.equals(temp._TCPPort)))
                    return false;
            }
            else if (temp._TCPPort != null)
                return false;
            if (this._UDPAddress != null) {
                if (temp._UDPAddress == null) return false;
                else if (!(this._UDPAddress.equals(temp._UDPAddress)))
                    return false;
            }
            else if (temp._UDPAddress != null)
                return false;
            if (this._UDPPort != null) {
                if (temp._UDPPort == null) return false;
                else if (!(this._UDPPort.equals(temp._UDPPort)))
                    return false;
            }
            else if (temp._UDPPort != null)
                return false;
            if (this._receivers != null) {
                if (temp._receivers == null) return false;
                else if (!(this._receivers.equals(temp._receivers)))
                    return false;
            }
            else if (temp._receivers != null)
                return false;
            if (this._queueLength != null) {
                if (temp._queueLength == null) return false;
                else if (!(this._queueLength.equals(temp._queueLength)))
                    return false;
            }
            else if (temp._queueLength != null)
                return false;
            if (this._getNextEventID != null) {
                if (temp._getNextEventID == null) return false;
                else if (!(this._getNextEventID.equals(temp._getNextEventID)))
                    return false;
            }
            else if (temp._getNextEventID != null)
                return false;
            if (this._socketSoTimeoutRequired != null) {
                if (temp._socketSoTimeoutRequired == null) return false;
                else if (!(this._socketSoTimeoutRequired.equals(temp._socketSoTimeoutRequired)))
                    return false;
            }
            else if (temp._socketSoTimeoutRequired != null)
                return false;
            if (this._socketSoTimeoutPeriod != null) {
                if (temp._socketSoTimeoutPeriod == null) return false;
                else if (!(this._socketSoTimeoutPeriod.equals(temp._socketSoTimeoutPeriod)))
                    return false;
            }
            else if (temp._socketSoTimeoutPeriod != null)
                return false;
            if (this._logEventSummaries != null) {
                if (temp._logEventSummaries == null) return false;
                else if (!(this._logEventSummaries.equals(temp._logEventSummaries)))
                    return false;
            }
            else if (temp._logEventSummaries != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'getNextEventID'. The field
     * 'getNextEventID' has the following description: SQL query to
     * get next value of the 'nodeNxtId'
     *  database sequence. This is used to make the access database
     *  independent.
     *
     * @return the value of field 'GetNextEventID'.
     */
    public java.lang.String getGetNextEventID(
    ) {
        return this._getNextEventID;
    }

    /**
     * Returns the value of field 'logEventSummaries'. The field
     * 'logEventSummaries' has the following description: Whether
     * or not to log a simple event summary. By default, OpenNMS
     *  logs detailed event information at DEBUG level. If this
     * option is enabled,
     *  it will additionally log a simple summary of events
     * received at INFO.
     *
     * @return the value of field 'LogEventSummaries'.
     */
    public Boolean getLogEventSummaries(
    ) {
        return this._logEventSummaries;
    }

    /**
     * Returns the value of field 'queueLength'. The field
     * 'queueLength' has the following description: The maximum
     * number of incoming events that can be
     *  queued inside eventd for processing.
     *
     * @return the value of field 'QueueLength'.
     */
    public Integer getQueueLength(
    ) {
        return this._queueLength;
    }

    /**
     * Returns the value of field 'receivers'. The field
     * 'receivers' has the following description: The maximum
     * number of threads used for reading and
     *  processing of incoming events.
     *
     * @return the value of field 'Receivers'.
     */
    public Integer getReceivers(
    ) {
        return this._receivers;
    }

    /**
     * Returns the value of field 'socketSoTimeoutPeriod'. The
     * field 'socketSoTimeoutPeriod' has the following description:
     * Socket timeout, in milliseconds. This is only set on
     *  eventd's sockets if socketSoTimeoutRequired is set to
     *  'yes'.
     *
     * @return the value of field 'SocketSoTimeoutPeriod'.
     */
    public Integer getSocketSoTimeoutPeriod(
    ) {
        return this._socketSoTimeoutPeriod;
    }

    /**
     * Returns the value of field 'socketSoTimeoutRequired'. The
     * field 'socketSoTimeoutRequired' has the following
     * description: Set the socket timeout value. In Linux, the
     * close()
     *  system call is not preemptive. Setting this attribute to to
     * 'yes'
     *  causes the socketSoTimeoutPeriod attribute to be set on
     * sockets to
     *  mimic non-blocking socket I/O.
     *
     * @return the value of field 'SocketSoTimeoutRequired'.
     */
    public java.lang.String getSocketSoTimeoutRequired(
    ) {
        return this._socketSoTimeoutRequired;
    }

    /**
     * Returns the value of field 'TCPAddress'. The field
     * 'TCPAddress' has the following description: The IP address
     * on which eventd listens for TCP connections.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     *
     * @return the value of field 'TCPAddress'.
     */
    public java.lang.String getTCPAddress(
    ) {
        return this._TCPAddress == null ? "127.0.0.1" : this._TCPAddress;
    }

    /**
     * Returns the value of field 'TCPPort'. The field 'TCPPort'
     * has the following description: The port on which eventd
     * listens for TCP connections.
     *  The default port is 5817.
     *
     * @return the value of field 'TCPPort'.
     */
    public Integer getTCPPort(
    ) {
        return this._TCPPort == null ? 5817 : this._TCPPort;
    }

    /**
     * Returns the value of field 'UDPAddress'. The field
     * 'UDPAddress' has the following description: The IP address
     * on which eventd listens for UDP packets.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     *
     * @return the value of field 'UDPAddress'.
     */
    public java.lang.String getUDPAddress(
    ) {
        return this._UDPAddress == null ? "127.0.0.1" : this._UDPAddress;
    }

    /**
     * Returns the value of field 'UDPPort'. The field 'UDPPort'
     * has the following description: The port on which eventd
     * listens for UDP packets. The
     *  default port is 5817.
     *
     * @return the value of field 'UDPPort'.
     */
    public Integer getUDPPort(
    ) {
        return this._UDPPort == null ? 5817 : this._UDPPort;
    }

    /**
     * Method hasLogEventSummaries.
     *
     * @return true if at least one LogEventSummaries has been added
     */
    public boolean hasLogEventSummaries(
    ) {
        return this._logEventSummaries != null;
    }

    /**
     * Method hasQueueLength.
     *
     * @return true if at least one QueueLength has been added
     */
    public boolean hasQueueLength(
    ) {
        return this._queueLength != null;
    }

    /**
     * Method hasReceivers.
     *
     * @return true if at least one Receivers has been added
     */
    public boolean hasReceivers(
    ) {
        return this._receivers != null;
    }

    /**
     * Method hasSocketSoTimeoutPeriod.
     *
     * @return true if at least one SocketSoTimeoutPeriod has been
     * added
     */
    public boolean hasSocketSoTimeoutPeriod(
    ) {
        return this._socketSoTimeoutPeriod != null;
    }

    /**
     * Method hasTCPPort.
     *
     * @return true if at least one TCPPort has been added
     */
    public boolean hasTCPPort(
    ) {
        return this._TCPPort != null;
    }

    /**
     * Method hasUDPPort.
     *
     * @return true if at least one UDPPort has been added
     */
    public boolean hasUDPPort(
    ) {
        return this._UDPPort != null;
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
        if (_TCPAddress != null) {
           result = 37 * result + _TCPAddress.hashCode();
        }
        if (_TCPPort != null) {
           result = 37 * result + _TCPPort.hashCode();
        }
        if (_UDPAddress != null) {
           result = 37 * result + _UDPAddress.hashCode();
        }
        if (_UDPPort != null) {
           result = 37 * result + _UDPPort.hashCode();
        }
        if (_receivers != null) {
           result = 37 * result + _receivers.hashCode();
        }
        if (_queueLength != null) {
           result = 37 * result + _queueLength.hashCode();
        }
        if (_getNextEventID != null) {
           result = 37 * result + _getNextEventID.hashCode();
        }
        if (_socketSoTimeoutRequired != null) {
           result = 37 * result + _socketSoTimeoutRequired.hashCode();
        }
        if (_socketSoTimeoutPeriod != null) {
           result = 37 * result + _socketSoTimeoutPeriod.hashCode();
        }
        if (_logEventSummaries != null) {
           result = 37 * result + _logEventSummaries.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'logEventSummaries'. The field
     * 'logEventSummaries' has the following description: Whether
     * or not to log a simple event summary. By default, OpenNMS
     *  logs detailed event information at DEBUG level. If this
     * option is enabled,
     *  it will additionally log a simple summary of events
     * received at INFO.
     *
     * @return the value of field 'LogEventSummaries'.
     */
    public boolean isLogEventSummaries(
    ) {
        return this._logEventSummaries;
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
     * Sets the value of field 'getNextEventID'. The field
     * 'getNextEventID' has the following description: SQL query to
     * get next value of the 'nodeNxtId'
     *  database sequence. This is used to make the access database
     *  independent.
     *
     * @param getNextEventID the value of field 'getNextEventID'.
     */
    public void setGetNextEventID(
            final java.lang.String getNextEventID) {
        this._getNextEventID = getNextEventID;
    }

    /**
     * Sets the value of field 'logEventSummaries'. The field
     * 'logEventSummaries' has the following description: Whether
     * or not to log a simple event summary. By default, OpenNMS
     *  logs detailed event information at DEBUG level. If this
     * option is enabled,
     *  it will additionally log a simple summary of events
     * received at INFO.
     *
     * @param logEventSummaries the value of field
     * 'logEventSummaries'.
     */
    public void setLogEventSummaries(
            final Boolean logEventSummaries) {
        this._logEventSummaries = logEventSummaries;
    }

    /**
     * Sets the value of field 'queueLength'. The field
     * 'queueLength' has the following description: The maximum
     * number of incoming events that can be
     *  queued inside eventd for processing.
     *
     * @param queueLength the value of field 'queueLength'.
     */
    public void setQueueLength(
            final Integer queueLength) {
        this._queueLength = queueLength;
    }

    /**
     * Sets the value of field 'receivers'. The field 'receivers'
     * has the following description: The maximum number of threads
     * used for reading and
     *  processing of incoming events.
     *
     * @param receivers the value of field 'receivers'.
     */
    public void setReceivers(
            final Integer receivers) {
        this._receivers = receivers;
    }

    /**
     * Sets the value of field 'socketSoTimeoutPeriod'. The field
     * 'socketSoTimeoutPeriod' has the following description:
     * Socket timeout, in milliseconds. This is only set on
     *  eventd's sockets if socketSoTimeoutRequired is set to
     *  'yes'.
     *
     * @param socketSoTimeoutPeriod the value of field
     * 'socketSoTimeoutPeriod'.
     */
    public void setSocketSoTimeoutPeriod(
            final Integer socketSoTimeoutPeriod) {
        this._socketSoTimeoutPeriod = socketSoTimeoutPeriod;
    }

    /**
     * Sets the value of field 'socketSoTimeoutRequired'. The field
     * 'socketSoTimeoutRequired' has the following description: Set
     * the socket timeout value. In Linux, the close()
     *  system call is not preemptive. Setting this attribute to to
     * 'yes'
     *  causes the socketSoTimeoutPeriod attribute to be set on
     * sockets to
     *  mimic non-blocking socket I/O.
     *
     * @param socketSoTimeoutRequired the value of field
     * 'socketSoTimeoutRequired'.
     */
    public void setSocketSoTimeoutRequired(
            final java.lang.String socketSoTimeoutRequired) {
        this._socketSoTimeoutRequired = socketSoTimeoutRequired;
    }

    /**
     * Sets the value of field 'TCPAddress'. The field 'TCPAddress'
     * has the following description: The IP address on which
     * eventd listens for TCP connections.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     *
     * @param TCPAddress the value of field 'TCPAddress'.
     */
    public void setTCPAddress(
            final java.lang.String TCPAddress) {
        this._TCPAddress = TCPAddress;
    }

    /**
     * Sets the value of field 'TCPPort'. The field 'TCPPort' has
     * the following description: The port on which eventd listens
     * for TCP connections.
     *  The default port is 5817.
     *
     * @param TCPPort the value of field 'TCPPort'.
     */
    public void setTCPPort(
            final Integer TCPPort) {
        this._TCPPort = TCPPort;
    }

    /**
     * Sets the value of field 'UDPAddress'. The field 'UDPAddress'
     * has the following description: The IP address on which
     * eventd listens for UDP packets.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     *
     * @param UDPAddress the value of field 'UDPAddress'.
     */
    public void setUDPAddress(
            final java.lang.String UDPAddress) {
        this._UDPAddress = UDPAddress;
    }

    /**
     * Sets the value of field 'UDPPort'. The field 'UDPPort' has
     * the following description: The port on which eventd listens
     * for UDP packets. The
     *  default port is 5817.
     *
     * @param UDPPort the value of field 'UDPPort'.
     */
    public void setUDPPort(
            final Integer UDPPort) {
        this._UDPPort = UDPPort;
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
     * org.opennms.netmgt.config.eventd.EventdConfiguration
     */
    public static org.opennms.netmgt.config.eventd.EventdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.eventd.EventdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.eventd.EventdConfiguration.class, reader);
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
