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
package org.opennms.netmgt.config.discovery;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A specific addresses to be polled
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "specific")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("discovery-configuration.xsd")
@SuppressWarnings("all")
public class Specific implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * internal content storage
     */
    @XmlValue
    private java.lang.String _content;

    /**
     * The number of times a ping is retried for this
     *  specific address. If there is no response after the first
     * ping
     *  to an address, it is tried again for the specified number
     * of
     *  retries. This retry count overrides the default.
     */
    @XmlAttribute(name = "retries")
    private Integer _retries;

    /**
     * The timeout on each poll for this specific
     *  address. This timeout overrides the default.
     */
    @XmlAttribute(name = "timeout")
    private Long _timeout;

    /**
     * Field _foreignSource.
     */
    @XmlAttribute(name = "foreign-source")
    private java.lang.String _foreignSource;

      //----------------/
    //- Constructors -/
    //----------------/
    public Specific() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     */
    public void deleteRetries() {
        this._retries = null;
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

        if (obj instanceof Specific) {

            Specific temp = (Specific) obj;
            if (this._content != null) {
                if (temp._content == null) {
                    return false;
                } else if (!(this._content.equals(temp._content))) {
                    return false;
                }
            } else if (temp._content != null) {
                return false;
            }
            if (this._retries != null) {
                if (temp._retries == null) {
                    return false;
                } else if (!(this._retries.equals(temp._retries))) {
                    return false;
                }
            } else if (temp._retries != null) {
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
            if (this._foreignSource != null) {
                if (temp._foreignSource == null) {
                    return false;
                } else if (!(this._foreignSource.equals(temp._foreignSource))) {
                    return false;
                }
            } else if (temp._foreignSource != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     *
     * @return the value of field 'Content'.
     */
    public java.lang.String getContent() {
        return this._content;
    }

    /**
     * Returns the value of field 'foreignSource'.
     *
     * @return the value of field 'ForeignSource'.
     */
    public java.lang.String getForeignSource() {
        return this._foreignSource;
    }

    /**
     * Returns the value of field 'retries'. The field 'retries'
     * has the following description: The number of times a ping is
     * retried for this
     *  specific address. If there is no response after the first
     * ping
     *  to an address, it is tried again for the specified number
     * of
     *  retries. This retry count overrides the default.
     *
     * @return the value of field 'Retries'.
     */
    public Integer getRetries() {
        return this._retries == null ? 0 : this._retries;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: The timeout on each poll for
     * this specific
     *  address. This timeout overrides the default.
     *
     * @return the value of field 'Timeout'.
     */
    public Long getTimeout() {
        return this._timeout == null ? 0L : this._timeout;
    }

    /**
     * Method hasRetries.
     *
     * @return true if at least one Retries has been added
     */
    public boolean hasRetries() {
        return this._retries != null;
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
        if (_content != null) {
            result = 37 * result + _content.hashCode();
        }
        result = 37 * result + _retries;
        result = 37 * result + (int) (_timeout ^ (_timeout >>> 32));
        if (_foreignSource != null) {
            result = 37 * result + _foreignSource.hashCode();
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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     *
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.lang.String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'foreignSource'.
     *
     * @param foreignSource the value of field 'foreignSource'.
     */
    public void setForeignSource(
            final java.lang.String foreignSource) {
        this._foreignSource = foreignSource;
    }

    /**
     * Sets the value of field 'retries'. The field 'retries' has
     * the following description: The number of times a ping is
     * retried for this
     *  specific address. If there is no response after the first
     * ping
     *  to an address, it is tried again for the specified number
     * of
     *  retries. This retry count overrides the default.
     *
     * @param retries the value of field 'retries'.
     */
    public void setRetries(
            final Integer retries) {
        this._retries = retries;
    }

    /**
     * Sets the value of field 'timeout'. The field 'timeout' has
     * the following description: The timeout on each poll for this
     * specific
     *  address. This timeout overrides the default.
     *
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final Long timeout) {
        this._timeout = timeout;
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
     * org.opennms.netmgt.config.discovery.Specific
     */
    public static org.opennms.netmgt.config.discovery.Specific unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.discovery.Specific) Unmarshaller.unmarshal(org.opennms.netmgt.config.discovery.Specific.class, reader);
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
