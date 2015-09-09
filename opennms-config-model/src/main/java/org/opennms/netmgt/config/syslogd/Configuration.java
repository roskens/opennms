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
 * Top-level element for the syslogd-configuration.xml
 *  configuration file.
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

@XmlRootElement(name="configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("syslogd-configuration.xsd")
@SuppressWarnings("all") public class Configuration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The address on which Syslogd listens for SYSLOG Messages.
     * The
     *  default is to listen on all addresses.
     *
     */
    @XmlAttribute(name="listenAddress")
    private String _listenAddress;

    /**
     * The port on which Syslogd listens for SYSLOG Messages. The
     *  standard port is 514.
     *
     */
    @XmlAttribute(name="syslogPort")
    private Integer _syslogPort;

    /**
     * keeps track of state for field: _syslogPort
     */
    private boolean _has_syslogPort;

    /**
     * Whether messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *
     */
    private boolean _newSuspectOnMessage = false;

    /**
     * keeps track of state for field: _newSuspectOnMessage
     */
    private boolean _has_newSuspectOnMessage;

    /**
     * The regular expression used to separate message and host.
     *
     */
    @XmlAttribute(name="forwardingRegexp")
    private String _forwardingRegexp;

    /**
     * The matching group for the host
     */
    @XmlAttribute(name="matchingGroupHost")
    private Integer _matchingGroupHost;

    /**
     * keeps track of state for field: _matchingGroupHost
     */
    private boolean _has_matchingGroupHost;

    /**
     * The matching group for the message
     */
    @XmlAttribute(name="matchingGroupMessage")
    private Integer _matchingGroupMessage;

    /**
     * keeps track of state for field: _matchingGroupMessage
     */
    private boolean _has_matchingGroupMessage;

    /**
     * A string which defines the class to use when parsing syslog
     * messages.
     *  The default is the "CustomSyslogParser", which honors the
     * forwarding-regexp,
     *  matching-group-host, and matching-group-message attributes,
     * and can parse
     *  most BSD-style Syslog messages, including Syslog-NG's
     * default format.
     *  Other options include
     * "org.opennms.netmgt.syslogd.SyslogNGParser" which is a
     *  slightly more strict version of the CustomSyslogParser, and
     *  "org.opennms.netmgt.syslogd.Rfc5424SyslogParser" which can
     * handle the recent
     *  (2009) RFC for syslog messages.
     *
     */
    private java.lang.String _parser = "org.opennms.netmgt.syslogd.CustomSyslogParser";

    /**
     * A string which, when used as the value of a "uei"
     *  element inside a "ueiMatch" element, results in all
     *  matching messages to be discarded without an event
     *  ever being created
     *
     */
    private java.lang.String _discardUei = "DISCARD-MATCHING-MESSAGES";


      //----------------/
     //- Constructors -/
    //----------------/

    public Configuration() {
        super();
        setParser("org.opennms.netmgt.syslogd.CustomSyslogParser");
        setDiscardUei("DISCARD-MATCHING-MESSAGES");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMatchingGroupHost(
    ) {
        this._matchingGroupHost = null;
    }

    /**
     */
    public void deleteMatchingGroupMessage(
    ) {
        this._matchingGroupMessage = null;
    }

    /**
     */
    public void deleteNewSuspectOnMessage(
    ) {
        this._newSuspectOnMessage = null;
    }

    /**
     */
    public void deleteSyslogPort(
    ) {
        this._syslogPort = null;
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

        if (obj instanceof Configuration) {

            Configuration temp = (Configuration)obj;
            if (this._listenAddress != null) {
                if (temp._listenAddress == null) return false;
                else if (!(this._listenAddress.equals(temp._listenAddress)))
                    return false;
            }
            else if (temp._listenAddress != null)
                return false;
            if (this._syslogPort != null) {
                if (temp._syslogPort == null) return false;
                else if (!(this._syslogPort.equals(temp._syslogPort)))
                    return false;
            }
            else if (temp._syslogPort != null)
                return false;
            if (this._newSuspectOnMessage != null) {
                if (temp._newSuspectOnMessage == null) return false;
                else if (!(this._newSuspectOnMessage.equals(temp._newSuspectOnMessage)))
                    return false;
            }
            else if (temp._newSuspectOnMessage != null)
                return false;
            if (this._forwardingRegexp != null) {
                if (temp._forwardingRegexp == null) return false;
                else if (!(this._forwardingRegexp.equals(temp._forwardingRegexp)))
                    return false;
            }
            else if (temp._forwardingRegexp != null)
                return false;
            if (this._matchingGroupHost != null) {
                if (temp._matchingGroupHost == null) return false;
                else if (!(this._matchingGroupHost.equals(temp._matchingGroupHost)))
                    return false;
            }
            else if (temp._matchingGroupHost != null)
                return false;
            if (this._matchingGroupMessage != null) {
                if (temp._matchingGroupMessage == null) return false;
                else if (!(this._matchingGroupMessage.equals(temp._matchingGroupMessage)))
                    return false;
            }
            else if (temp._matchingGroupMessage != null)
                return false;
            if (this._parser != null) {
                if (temp._parser == null) return false;
                else if (!(this._parser.equals(temp._parser)))
                    return false;
            }
            else if (temp._parser != null)
                return false;
            if (this._discardUei != null) {
                if (temp._discardUei == null) return false;
                else if (!(this._discardUei.equals(temp._discardUei)))
                    return false;
            }
            else if (temp._discardUei != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'discardUei'. The field
     * 'discardUei' has the following description: A string which,
     * when used as the value of a "uei"
     *  element inside a "ueiMatch" element, results in all
     *  matching messages to be discarded without an event
     *  ever being created
     *
     *
     * @return the value of field 'DiscardUei'.
     */
    public java.lang.String getDiscardUei(
    ) {
        return this._discardUei;
    }

    /**
     * Returns the value of field 'forwardingRegexp'. The field
     * 'forwardingRegexp' has the following description: The
     * regular expression used to separate message and host.
     *
     *
     * @return the value of field 'ForwardingRegexp'.
     */
    public java.lang.String getForwardingRegexp(
    ) {
        return this._forwardingRegexp;
    }

    /**
     * Returns the value of field 'listenAddress'. The field
     * 'listenAddress' has the following description: The address
     * on which Syslogd listens for SYSLOG Messages. The
     *  default is to listen on all addresses.
     *
     *
     * @return the value of field 'ListenAddress'.
     */
    public java.lang.String getListenAddress(
    ) {
        return this._listenAddress;
    }

    /**
     * Returns the value of field 'matchingGroupHost'. The field
     * 'matchingGroupHost' has the following description: The
     * matching group for the host
     *
     * @return the value of field 'MatchingGroupHost'.
     */
    public Integer getMatchingGroupHost(
    ) {
        return this._matchingGroupHost;
    }

    /**
     * Returns the value of field 'matchingGroupMessage'. The field
     * 'matchingGroupMessage' has the following description: The
     * matching group for the message
     *
     * @return the value of field 'MatchingGroupMessage'.
     */
    public Integer getMatchingGroupMessage(
    ) {
        return this._matchingGroupMessage;
    }

    /**
     * Returns the value of field 'newSuspectOnMessage'. The field
     * 'newSuspectOnMessage' has the following description: Whether
     * messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *
     *
     * @return the value of field 'NewSuspectOnMessage'.
     */
    public boolean getNewSuspectOnMessage(
    ) {
        return this._newSuspectOnMessage;
    }

    /**
     * Returns the value of field 'parser'. The field 'parser' has
     * the following description: A string which defines the class
     * to use when parsing syslog messages.
     *  The default is the "CustomSyslogParser", which honors the
     * forwarding-regexp,
     *  matching-group-host, and matching-group-message attributes,
     * and can parse
     *  most BSD-style Syslog messages, including Syslog-NG's
     * default format.
     *  Other options include
     * "org.opennms.netmgt.syslogd.SyslogNGParser" which is a
     *  slightly more strict version of the CustomSyslogParser, and
     *  "org.opennms.netmgt.syslogd.Rfc5424SyslogParser" which can
     * handle the recent
     *  (2009) RFC for syslog messages.
     *
     *
     * @return the value of field 'Parser'.
     */
    public java.lang.String getParser(
    ) {
        return this._parser;
    }

    /**
     * Returns the value of field 'syslogPort'. The field
     * 'syslogPort' has the following description: The port on
     * which Syslogd listens for SYSLOG Messages. The
     *  standard port is 514.
     *
     *
     * @return the value of field 'SyslogPort'.
     */
    public Integer getSyslogPort(
    ) {
        return this._syslogPort;
    }

    /**
     * Method hasMatchingGroupHost.
     *
     * @return true if at least one MatchingGroupHost has been added
     */
    public boolean hasMatchingGroupHost(
    ) {
        return this._matchingGroupHost != null;
    }

    /**
     * Method hasMatchingGroupMessage.
     *
     * @return true if at least one MatchingGroupMessage has been
     * added
     */
    public boolean hasMatchingGroupMessage(
    ) {
        return this._matchingGroupMessage != null;
    }

    /**
     * Method hasNewSuspectOnMessage.
     *
     * @return true if at least one NewSuspectOnMessage has been
     * added
     */
    public boolean hasNewSuspectOnMessage(
    ) {
        return this._newSuspectOnMessage != null;
    }

    /**
     * Method hasSyslogPort.
     *
     * @return true if at least one SyslogPort has been added
     */
    public boolean hasSyslogPort(
    ) {
        return this._syslogPort != null;
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
        if (_listenAddress != null) {
           result = 37 * result + _listenAddress.hashCode();
        }
        result = 37 * result + _syslogPort;
        result = 37 * result + (_newSuspectOnMessage?0:1);
        if (_forwardingRegexp != null) {
           result = 37 * result + _forwardingRegexp.hashCode();
        }
        result = 37 * result + _matchingGroupHost;
        result = 37 * result + _matchingGroupMessage;
        if (_parser != null) {
           result = 37 * result + _parser.hashCode();
        }
        if (_discardUei != null) {
           result = 37 * result + _discardUei.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'newSuspectOnMessage'. The field
     * 'newSuspectOnMessage' has the following description: Whether
     * messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *
     *
     * @return the value of field 'NewSuspectOnMessage'.
     */
    public boolean isNewSuspectOnMessage(
    ) {
        return this._newSuspectOnMessage;
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
     * Sets the value of field 'discardUei'. The field 'discardUei'
     * has the following description: A string which, when used as
     * the value of a "uei"
     *  element inside a "ueiMatch" element, results in all
     *  matching messages to be discarded without an event
     *  ever being created
     *
     *
     * @param discardUei the value of field 'discardUei'.
     */
    public void setDiscardUei(
            final java.lang.String discardUei) {
        this._discardUei = discardUei;
    }

    /**
     * Sets the value of field 'forwardingRegexp'. The field
     * 'forwardingRegexp' has the following description: The
     * regular expression used to separate message and host.
     *
     *
     * @param forwardingRegexp the value of field 'forwardingRegexp'
     */
    public void setForwardingRegexp(
            final java.lang.String forwardingRegexp) {
        this._forwardingRegexp = forwardingRegexp;
    }

    /**
     * Sets the value of field 'listenAddress'. The field
     * 'listenAddress' has the following description: The address
     * on which Syslogd listens for SYSLOG Messages. The
     *  default is to listen on all addresses.
     *
     *
     * @param listenAddress the value of field 'listenAddress'.
     */
    public void setListenAddress(
            final java.lang.String listenAddress) {
        this._listenAddress = listenAddress;
    }

    /**
     * Sets the value of field 'matchingGroupHost'. The field
     * 'matchingGroupHost' has the following description: The
     * matching group for the host
     *
     * @param matchingGroupHost the value of field
     * 'matchingGroupHost'.
     */
    public void setMatchingGroupHost(final Integer matchingGroupHost) {
        this._matchingGroupHost = matchingGroupHost;
        this._has_matchingGroupHost = true;
    }

    /**
     * Sets the value of field 'matchingGroupMessage'. The field
     * 'matchingGroupMessage' has the following description: The
     * matching group for the message
     *
     * @param matchingGroupMessage the value of field
     * 'matchingGroupMessage'.
     */
    public void setMatchingGroupMessage(final Integer matchingGroupMessage) {
        this._matchingGroupMessage = matchingGroupMessage;
        this._has_matchingGroupMessage = true;
    }

    /**
     * Sets the value of field 'newSuspectOnMessage'. The field
     * 'newSuspectOnMessage' has the following description: Whether
     * messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *
     *
     * @param newSuspectOnMessage the value of field
     * 'newSuspectOnMessage'.
     */
    public void setNewSuspectOnMessage(
            final boolean newSuspectOnMessage) {
        this._newSuspectOnMessage = newSuspectOnMessage;
        this._has_newSuspectOnMessage = true;
    }

    /**
     * Sets the value of field 'parser'. The field 'parser' has the
     * following description: A string which defines the class to
     * use when parsing syslog messages.
     *  The default is the "CustomSyslogParser", which honors the
     * forwarding-regexp,
     *  matching-group-host, and matching-group-message attributes,
     * and can parse
     *  most BSD-style Syslog messages, including Syslog-NG's
     * default format.
     *  Other options include
     * "org.opennms.netmgt.syslogd.SyslogNGParser" which is a
     *  slightly more strict version of the CustomSyslogParser, and
     *  "org.opennms.netmgt.syslogd.Rfc5424SyslogParser" which can
     * handle the recent
     *  (2009) RFC for syslog messages.
     *
     *
     * @param parser the value of field 'parser'.
     */
    public void setParser(
            final java.lang.String parser) {
        this._parser = parser;
    }

    /**
     * Sets the value of field 'syslogPort'. The field 'syslogPort'
     * has the following description: The port on which Syslogd
     * listens for SYSLOG Messages. The
     *  standard port is 514.
     *
     *
     * @param syslogPort the value of field 'syslogPort'.
     */
    public void setSyslogPort(final Integer syslogPort) {
        this._syslogPort = syslogPort;
        this._has_syslogPort = true;
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
     * org.opennms.netmgt.config.syslogd.Configuration
     */
    public static org.opennms.netmgt.config.syslogd.Configuration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.Configuration) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.Configuration.class, reader);
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
