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
package org.opennms.netmgt.config.rtc;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the rtc-configuration.xml
 *  configuration file.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "RTCConfiguration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("rtc-configuration.xsd")
@SuppressWarnings("all")
public class RTCConfiguration implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Maximum number of threads reading the events and
     *  updating the RTC data.
     */
    @XmlAttribute(name = "updaters", required = true)
    private Integer _updaters;

    /**
     * Maximum number of threads sending data to the
     *  UI.
     */
    @XmlAttribute(name = "senders", required = true)
    private Integer _senders;

    /**
     * The rolling window over which availability is
     *  calculated. It can be specified as a combination of
     *  hours/minutes/seconds. E.g.: 10h20m5s
     */
    @XmlAttribute(name = "rollingWindow", required = true)
    private java.lang.String _rollingWindow;

    /**
     * The number of received events that prompts an
     *  immediate send of RTC data to the UI. This causes data to
     * be sent
     *  immediately instead of waiting for a timer to go
     *  off.
     */
    @XmlAttribute(name = "maxEventsBeforeResend", required = true)
    private Integer _maxEventsBeforeResend;

    /**
     * Low threshold timer interval.
     */
    @XmlAttribute(name = "lowThresholdInterval", required = true)
    private java.lang.String _lowThresholdInterval;

    /**
     * High threshold timer interval.
     */
    @XmlAttribute(name = "highThresholdInterval", required = true)
    private java.lang.String _highThresholdInterval;

    /**
     * User threshold timer interval. Used to send RTC data
     *  to the UI when no events are coming in.
     */
    @XmlAttribute(name = "userRefreshInterval", required = true)
    private java.lang.String _userRefreshInterval;

    /**
     * Number of times a URL post is tried with errors
     *  before automatically unsubscribing the URL. A negative
     * value means
     *  the URL is not unsubscribed until an 'unsubscribe' event is
     *  received.
     */
    @XmlAttribute(name = "errorsBeforeUrlUnsubscribe", required = true)
    private Integer _errorsBeforeUrlUnsubscribe;

      //----------------/
    //- Constructors -/
    //----------------/
    public RTCConfiguration() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     */
    public void deleteErrorsBeforeUrlUnsubscribe() {
        this._errorsBeforeUrlUnsubscribe = null;
    }

    /**
     */
    public void deleteMaxEventsBeforeResend() {
        this._maxEventsBeforeResend = null;
    }

    /**
     */
    public void deleteSenders() {
        this._senders = null;
    }

    /**
     */
    public void deleteUpdaters() {
        this._updaters = null;
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

        if (obj instanceof RTCConfiguration) {

            RTCConfiguration temp = (RTCConfiguration) obj;
            if (this._updaters != null) {
                if (temp._updaters == null) {
                    return false;
                } else if (!(this._updaters.equals(temp._updaters))) {
                    return false;
                }
            } else if (temp._updaters != null) {
                return false;
            }
            if (this._senders != null) {
                if (temp._senders == null) {
                    return false;
                } else if (!(this._senders.equals(temp._senders))) {
                    return false;
                }
            } else if (temp._senders != null) {
                return false;
            }
            if (this._rollingWindow != null) {
                if (temp._rollingWindow == null) {
                    return false;
                } else if (!(this._rollingWindow.equals(temp._rollingWindow))) {
                    return false;
                }
            } else if (temp._rollingWindow != null) {
                return false;
            }
            if (this._maxEventsBeforeResend != null) {
                if (temp._maxEventsBeforeResend == null) {
                    return false;
                } else if (!(this._maxEventsBeforeResend.equals(temp._maxEventsBeforeResend))) {
                    return false;
                }
            } else if (temp._maxEventsBeforeResend != null) {
                return false;
            }
            if (this._lowThresholdInterval != null) {
                if (temp._lowThresholdInterval == null) {
                    return false;
                } else if (!(this._lowThresholdInterval.equals(temp._lowThresholdInterval))) {
                    return false;
                }
            } else if (temp._lowThresholdInterval != null) {
                return false;
            }
            if (this._highThresholdInterval != null) {
                if (temp._highThresholdInterval == null) {
                    return false;
                } else if (!(this._highThresholdInterval.equals(temp._highThresholdInterval))) {
                    return false;
                }
            } else if (temp._highThresholdInterval != null) {
                return false;
            }
            if (this._userRefreshInterval != null) {
                if (temp._userRefreshInterval == null) {
                    return false;
                } else if (!(this._userRefreshInterval.equals(temp._userRefreshInterval))) {
                    return false;
                }
            } else if (temp._userRefreshInterval != null) {
                return false;
            }
            if (this._errorsBeforeUrlUnsubscribe != null) {
                if (temp._errorsBeforeUrlUnsubscribe == null) {
                    return false;
                } else if (!(this._errorsBeforeUrlUnsubscribe.equals(temp._errorsBeforeUrlUnsubscribe))) {
                    return false;
                }
            } else if (temp._errorsBeforeUrlUnsubscribe != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'errorsBeforeUrlUnsubscribe'. The
     * field 'errorsBeforeUrlUnsubscribe' has the following
     * description: Number of times a URL post is tried with errors
     *  before automatically unsubscribing the URL. A negative
     * value means
     *  the URL is not unsubscribed until an 'unsubscribe' event is
     *  received.
     *
     * @return the value of field 'ErrorsBeforeUrlUnsubscribe'.
     */
    public Integer getErrorsBeforeUrlUnsubscribe() {
        return this._errorsBeforeUrlUnsubscribe == null ? 0 : this._errorsBeforeUrlUnsubscribe;
    }

    /**
     * Returns the value of field 'highThresholdInterval'. The
     * field 'highThresholdInterval' has the following description:
     * High threshold timer interval.
     *
     * @return the value of field 'HighThresholdInterval'.
     */
    public java.lang.String getHighThresholdInterval() {
        return this._highThresholdInterval;
    }

    /**
     * Returns the value of field 'lowThresholdInterval'. The field
     * 'lowThresholdInterval' has the following description: Low
     * threshold timer interval.
     *
     * @return the value of field 'LowThresholdInterval'.
     */
    public java.lang.String getLowThresholdInterval() {
        return this._lowThresholdInterval;
    }

    /**
     * Returns the value of field 'maxEventsBeforeResend'. The
     * field 'maxEventsBeforeResend' has the following description:
     * The number of received events that prompts an
     *  immediate send of RTC data to the UI. This causes data to
     * be sent
     *  immediately instead of waiting for a timer to go
     *  off.
     *
     * @return the value of field 'MaxEventsBeforeResend'.
     */
    public Integer getMaxEventsBeforeResend() {
        return this._maxEventsBeforeResend == null ? 0 : this._maxEventsBeforeResend;
    }

    /**
     * Returns the value of field 'rollingWindow'. The field
     * 'rollingWindow' has the following description: The rolling
     * window over which availability is
     *  calculated. It can be specified as a combination of
     *  hours/minutes/seconds. E.g.: 10h20m5s
     *
     * @return the value of field 'RollingWindow'.
     */
    public java.lang.String getRollingWindow() {
        return this._rollingWindow;
    }

    /**
     * Returns the value of field 'senders'. The field 'senders'
     * has the following description: Maximum number of threads
     * sending data to the
     *  UI.
     *
     * @return the value of field 'Senders'.
     */
    public Integer getSenders() {
        return this._senders == null ? 0 : this._senders;
    }

    /**
     * Returns the value of field 'updaters'. The field 'updaters'
     * has the following description: Maximum number of threads
     * reading the events and
     *  updating the RTC data.
     *
     * @return the value of field 'Updaters'.
     */
    public Integer getUpdaters() {
        return this._updaters == null ? 0 : this._updaters;
    }

    /**
     * Returns the value of field 'userRefreshInterval'. The field
     * 'userRefreshInterval' has the following description: User
     * threshold timer interval. Used to send RTC data
     *  to the UI when no events are coming in.
     *
     * @return the value of field 'UserRefreshInterval'.
     */
    public java.lang.String getUserRefreshInterval() {
        return this._userRefreshInterval;
    }

    /**
     * Method hasErrorsBeforeUrlUnsubscribe.
     *
     * @return true if at least one ErrorsBeforeUrlUnsubscribe has
     * been added
     */
    public boolean hasErrorsBeforeUrlUnsubscribe() {
        return this._errorsBeforeUrlUnsubscribe != null;
    }

    /**
     * Method hasMaxEventsBeforeResend.
     *
     * @return true if at least one MaxEventsBeforeResend has been
     * added
     */
    public boolean hasMaxEventsBeforeResend() {
        return this._maxEventsBeforeResend != null;
    }

    /**
     * Method hasSenders.
     *
     * @return true if at least one Senders has been added
     */
    public boolean hasSenders() {
        return this._senders != null;
    }

    /**
     * Method hasUpdaters.
     *
     * @return true if at least one Updaters has been added
     */
    public boolean hasUpdaters() {
        return this._updaters != null;
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
        if (_updaters != null) {
            result = 37 * result + _updaters.hashCode();
        }
        if (_senders != null) {
            result = 37 * result + _senders.hashCode();
        }
        if (_maxEventsBeforeResend != null) {
            result = 37 * result + _maxEventsBeforeResend.hashCode();
        }
        if (_rollingWindow != null) {
            result = 37 * result + _rollingWindow.hashCode();
        }
        if (_lowThresholdInterval != null) {
            result = 37 * result + _lowThresholdInterval.hashCode();
        }
        if (_highThresholdInterval != null) {
            result = 37 * result + _highThresholdInterval.hashCode();
        }
        if (_userRefreshInterval != null) {
            result = 37 * result + _userRefreshInterval.hashCode();
        }
        if (_errorsBeforeUrlUnsubscribe != null) {
            result = 37 * result + _errorsBeforeUrlUnsubscribe.hashCode();
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
     * Sets the value of field 'errorsBeforeUrlUnsubscribe'. The
     * field 'errorsBeforeUrlUnsubscribe' has the following
     * description: Number of times a URL post is tried with errors
     *  before automatically unsubscribing the URL. A negative
     * value means
     *  the URL is not unsubscribed until an 'unsubscribe' event is
     *  received.
     *
     * @param errorsBeforeUrlUnsubscribe the value of field
     * 'errorsBeforeUrlUnsubscribe'.
     */
    public void setErrorsBeforeUrlUnsubscribe(
            final Integer errorsBeforeUrlUnsubscribe) {
        this._errorsBeforeUrlUnsubscribe = errorsBeforeUrlUnsubscribe;
    }

    /**
     * Sets the value of field 'highThresholdInterval'. The field
     * 'highThresholdInterval' has the following description: High
     * threshold timer interval.
     *
     * @param highThresholdInterval the value of field
     * 'highThresholdInterval'.
     */
    public void setHighThresholdInterval(
            final java.lang.String highThresholdInterval) {
        this._highThresholdInterval = highThresholdInterval;
    }

    /**
     * Sets the value of field 'lowThresholdInterval'. The field
     * 'lowThresholdInterval' has the following description: Low
     * threshold timer interval.
     *
     * @param lowThresholdInterval the value of field
     * 'lowThresholdInterval'.
     */
    public void setLowThresholdInterval(
            final java.lang.String lowThresholdInterval) {
        this._lowThresholdInterval = lowThresholdInterval;
    }

    /**
     * Sets the value of field 'maxEventsBeforeResend'. The field
     * 'maxEventsBeforeResend' has the following description: The
     * number of received events that prompts an
     *  immediate send of RTC data to the UI. This causes data to
     * be sent
     *  immediately instead of waiting for a timer to go
     *  off.
     *
     * @param maxEventsBeforeResend the value of field
     * 'maxEventsBeforeResend'.
     */
    public void setMaxEventsBeforeResend(
            final Integer maxEventsBeforeResend) {
        this._maxEventsBeforeResend = maxEventsBeforeResend;
    }

    /**
     * Sets the value of field 'rollingWindow'. The field
     * 'rollingWindow' has the following description: The rolling
     * window over which availability is
     *  calculated. It can be specified as a combination of
     *  hours/minutes/seconds. E.g.: 10h20m5s
     *
     * @param rollingWindow the value of field 'rollingWindow'.
     */
    public void setRollingWindow(
            final java.lang.String rollingWindow) {
        this._rollingWindow = rollingWindow;
    }

    /**
     * Sets the value of field 'senders'. The field 'senders' has
     * the following description: Maximum number of threads sending
     * data to the
     *  UI.
     *
     * @param senders the value of field 'senders'.
     */
    public void setSenders(
            final Integer senders) {
        this._senders = senders;
    }

    /**
     * Sets the value of field 'updaters'. The field 'updaters' has
     * the following description: Maximum number of threads reading
     * the events and
     *  updating the RTC data.
     *
     * @param updaters the value of field 'updaters'.
     */
    public void setUpdaters(
            final Integer updaters) {
        this._updaters = updaters;
    }

    /**
     * Sets the value of field 'userRefreshInterval'. The field
     * 'userRefreshInterval' has the following description: User
     * threshold timer interval. Used to send RTC data
     *  to the UI when no events are coming in.
     *
     * @param userRefreshInterval the value of field
     * 'userRefreshInterval'.
     */
    public void setUserRefreshInterval(
            final java.lang.String userRefreshInterval) {
        this._userRefreshInterval = userRefreshInterval;
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
     * org.opennms.netmgt.config.rtc.RTCConfiguration
     */
    public static org.opennms.netmgt.config.rtc.RTCConfiguration unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rtc.RTCConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.rtc.RTCConfiguration.class, reader);
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
