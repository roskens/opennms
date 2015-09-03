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
package org.opennms.netmgt.config.rws;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Base Url(s) for Rancid Server.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="base-url")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("rws-configuration.xsd")
@SuppressWarnings("all") public class BaseUrl implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _server_url.
     */
    private java.lang.String _server_url;

    /**
     * Field _timeout.
     */
    private int _timeout = 3;

    /**
     * keeps track of state for field: _timeout
     */
    private boolean _has_timeout;

    /**
     * Field _directory.
     */
    private java.lang.String _directory = "/rws";

    /**
     * Field _username.
     */
    private java.lang.String _username;

    /**
     * Field _password.
     */
    private java.lang.String _password;


      //----------------/
     //- Constructors -/
    //----------------/

    public BaseUrl() {
        super();
        setDirectory("/rws");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteTimeout(
    ) {
        this._has_timeout= false;
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

        if (obj instanceof BaseUrl) {

            BaseUrl temp = (BaseUrl)obj;
            if (this._server_url != null) {
                if (temp._server_url == null) return false;
                else if (!(this._server_url.equals(temp._server_url)))
                    return false;
            }
            else if (temp._server_url != null)
                return false;
            if (this._timeout != temp._timeout)
                return false;
            if (this._has_timeout != temp._has_timeout)
                return false;
            if (this._directory != null) {
                if (temp._directory == null) return false;
                else if (!(this._directory.equals(temp._directory)))
                    return false;
            }
            else if (temp._directory != null)
                return false;
            if (this._username != null) {
                if (temp._username == null) return false;
                else if (!(this._username.equals(temp._username)))
                    return false;
            }
            else if (temp._username != null)
                return false;
            if (this._password != null) {
                if (temp._password == null) return false;
                else if (!(this._password.equals(temp._password)))
                    return false;
            }
            else if (temp._password != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'directory'.
     *
     * @return the value of field 'Directory'.
     */
    public java.lang.String getDirectory(
    ) {
        return this._directory;
    }

    /**
     * Returns the value of field 'password'.
     *
     * @return the value of field 'Password'.
     */
    public java.lang.String getPassword(
    ) {
        return this._password;
    }

    /**
     * Returns the value of field 'server_url'.
     *
     * @return the value of field 'Server_url'.
     */
    public java.lang.String getServer_url(
    ) {
        return this._server_url;
    }

    /**
     * Returns the value of field 'timeout'.
     *
     * @return the value of field 'Timeout'.
     */
    public int getTimeout(
    ) {
        return this._timeout;
    }

    /**
     * Returns the value of field 'username'.
     *
     * @return the value of field 'Username'.
     */
    public java.lang.String getUsername(
    ) {
        return this._username;
    }

    /**
     * Method hasTimeout.
     *
     * @return true if at least one Timeout has been added
     */
    public boolean hasTimeout(
    ) {
        return this._has_timeout;
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
        if (_server_url != null) {
           result = 37 * result + _server_url.hashCode();
        }
        result = 37 * result + _timeout;
        if (_directory != null) {
           result = 37 * result + _directory.hashCode();
        }
        if (_username != null) {
           result = 37 * result + _username.hashCode();
        }
        if (_password != null) {
           result = 37 * result + _password.hashCode();
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
     * Sets the value of field 'directory'.
     *
     * @param directory the value of field 'directory'.
     */
    public void setDirectory(
            final java.lang.String directory) {
        this._directory = directory;
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
     * Sets the value of field 'server_url'.
     *
     * @param server_url the value of field 'server_url'.
     */
    public void setServer_url(
            final java.lang.String server_url) {
        this._server_url = server_url;
    }

    /**
     * Sets the value of field 'timeout'.
     *
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final int timeout) {
        this._timeout = timeout;
        this._has_timeout = true;
    }

    /**
     * Sets the value of field 'username'.
     *
     * @param username the value of field 'username'.
     */
    public void setUsername(
            final java.lang.String username) {
        this._username = username;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.rws.BaseUrl
     */
    public static org.opennms.netmgt.config.rws.BaseUrl unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rws.BaseUrl) Unmarshaller.unmarshal(org.opennms.netmgt.config.rws.BaseUrl.class, reader);
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
