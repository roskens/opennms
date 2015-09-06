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
package org.opennms.netmgt.config.opennmsDataSources;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Database connection pool configuration.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="connection-pool")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("opennms-datasources.xsd")
@SuppressWarnings("all") public class ConnectionPool implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The connection pool implementation to use.
     */
    private java.lang.String _factory = "org.opennms.core.db.C3P0ConnectionFactory";

    /**
     * How long, in seconds, an idle connection is kept in the pool
     * before it is removed.
     */
    private int _idleTimeout = 600;

    /**
     * keeps track of state for field: _idleTimeout
     */
    private boolean _has_idleTimeout;

    /**
     * How long, in seconds, to attempt to make a connection to the
     * database.
     */
    private int _loginTimeout = 3;

    /**
     * keeps track of state for field: _loginTimeout
     */
    private boolean _has_loginTimeout;

    /**
     * The minimum number of pooled connections to retain.
     */
    private int _minPool = 10;

    /**
     * keeps track of state for field: _minPool
     */
    private boolean _has_minPool;

    /**
     * The maximum number of pooled connections to retain.
     */
    private int _maxPool = 50;

    /**
     * keeps track of state for field: _maxPool
     */
    private boolean _has_maxPool;

    /**
     * The maximum number of connections that can be created.
     */
    private int _maxSize = 500;

    /**
     * keeps track of state for field: _maxSize
     */
    private boolean _has_maxSize;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConnectionPool() {
        super();
        setFactory("org.opennms.core.db.C3P0ConnectionFactory");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteIdleTimeout(
    ) {
        this._has_idleTimeout= false;
    }

    /**
     */
    public void deleteLoginTimeout(
    ) {
        this._has_loginTimeout= false;
    }

    /**
     */
    public void deleteMaxPool(
    ) {
        this._has_maxPool= false;
    }

    /**
     */
    public void deleteMaxSize(
    ) {
        this._has_maxSize= false;
    }

    /**
     */
    public void deleteMinPool(
    ) {
        this._has_minPool= false;
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

        if (obj instanceof ConnectionPool) {

            ConnectionPool temp = (ConnectionPool)obj;
            if (this._factory != null) {
                if (temp._factory == null) return false;
                else if (!(this._factory.equals(temp._factory)))
                    return false;
            }
            else if (temp._factory != null)
                return false;
            if (this._idleTimeout != temp._idleTimeout)
                return false;
            if (this._has_idleTimeout != temp._has_idleTimeout)
                return false;
            if (this._loginTimeout != temp._loginTimeout)
                return false;
            if (this._has_loginTimeout != temp._has_loginTimeout)
                return false;
            if (this._minPool != temp._minPool)
                return false;
            if (this._has_minPool != temp._has_minPool)
                return false;
            if (this._maxPool != temp._maxPool)
                return false;
            if (this._has_maxPool != temp._has_maxPool)
                return false;
            if (this._maxSize != temp._maxSize)
                return false;
            if (this._has_maxSize != temp._has_maxSize)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'factory'. The field 'factory'
     * has the following description: The connection pool
     * implementation to use.
     *
     * @return the value of field 'Factory'.
     */
    public java.lang.String getFactory(
    ) {
        return this._factory;
    }

    /**
     * Returns the value of field 'idleTimeout'. The field
     * 'idleTimeout' has the following description: How long, in
     * seconds, an idle connection is kept in the pool before it is
     * removed.
     *
     * @return the value of field 'IdleTimeout'.
     */
    public int getIdleTimeout(
    ) {
        return this._idleTimeout;
    }

    /**
     * Returns the value of field 'loginTimeout'. The field
     * 'loginTimeout' has the following description: How long, in
     * seconds, to attempt to make a connection to the database.
     *
     * @return the value of field 'LoginTimeout'.
     */
    public int getLoginTimeout(
    ) {
        return this._loginTimeout;
    }

    /**
     * Returns the value of field 'maxPool'. The field 'maxPool'
     * has the following description: The maximum number of pooled
     * connections to retain.
     *
     * @return the value of field 'MaxPool'.
     */
    public int getMaxPool(
    ) {
        return this._maxPool;
    }

    /**
     * Returns the value of field 'maxSize'. The field 'maxSize'
     * has the following description: The maximum number of
     * connections that can be created.
     *
     * @return the value of field 'MaxSize'.
     */
    public int getMaxSize(
    ) {
        return this._maxSize;
    }

    /**
     * Returns the value of field 'minPool'. The field 'minPool'
     * has the following description: The minimum number of pooled
     * connections to retain.
     *
     * @return the value of field 'MinPool'.
     */
    public int getMinPool(
    ) {
        return this._minPool;
    }

    /**
     * Method hasIdleTimeout.
     *
     * @return true if at least one IdleTimeout has been added
     */
    public boolean hasIdleTimeout(
    ) {
        return this._has_idleTimeout;
    }

    /**
     * Method hasLoginTimeout.
     *
     * @return true if at least one LoginTimeout has been added
     */
    public boolean hasLoginTimeout(
    ) {
        return this._has_loginTimeout;
    }

    /**
     * Method hasMaxPool.
     *
     * @return true if at least one MaxPool has been added
     */
    public boolean hasMaxPool(
    ) {
        return this._has_maxPool;
    }

    /**
     * Method hasMaxSize.
     *
     * @return true if at least one MaxSize has been added
     */
    public boolean hasMaxSize(
    ) {
        return this._has_maxSize;
    }

    /**
     * Method hasMinPool.
     *
     * @return true if at least one MinPool has been added
     */
    public boolean hasMinPool(
    ) {
        return this._has_minPool;
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
        if (_factory != null) {
           result = 37 * result + _factory.hashCode();
        }
        result = 37 * result + _idleTimeout;
        result = 37 * result + _loginTimeout;
        result = 37 * result + _minPool;
        result = 37 * result + _maxPool;
        result = 37 * result + _maxSize;

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
     * Sets the value of field 'factory'. The field 'factory' has
     * the following description: The connection pool
     * implementation to use.
     *
     * @param factory the value of field 'factory'.
     */
    public void setFactory(
            final java.lang.String factory) {
        this._factory = factory;
    }

    /**
     * Sets the value of field 'idleTimeout'. The field
     * 'idleTimeout' has the following description: How long, in
     * seconds, an idle connection is kept in the pool before it is
     * removed.
     *
     * @param idleTimeout the value of field 'idleTimeout'.
     */
    public void setIdleTimeout(
            final int idleTimeout) {
        this._idleTimeout = idleTimeout;
        this._has_idleTimeout = true;
    }

    /**
     * Sets the value of field 'loginTimeout'. The field
     * 'loginTimeout' has the following description: How long, in
     * seconds, to attempt to make a connection to the database.
     *
     * @param loginTimeout the value of field 'loginTimeout'.
     */
    public void setLoginTimeout(
            final int loginTimeout) {
        this._loginTimeout = loginTimeout;
        this._has_loginTimeout = true;
    }

    /**
     * Sets the value of field 'maxPool'. The field 'maxPool' has
     * the following description: The maximum number of pooled
     * connections to retain.
     *
     * @param maxPool the value of field 'maxPool'.
     */
    public void setMaxPool(
            final int maxPool) {
        this._maxPool = maxPool;
        this._has_maxPool = true;
    }

    /**
     * Sets the value of field 'maxSize'. The field 'maxSize' has
     * the following description: The maximum number of connections
     * that can be created.
     *
     * @param maxSize the value of field 'maxSize'.
     */
    public void setMaxSize(
            final int maxSize) {
        this._maxSize = maxSize;
        this._has_maxSize = true;
    }

    /**
     * Sets the value of field 'minPool'. The field 'minPool' has
     * the following description: The minimum number of pooled
     * connections to retain.
     *
     * @param minPool the value of field 'minPool'.
     */
    public void setMinPool(
            final int minPool) {
        this._minPool = minPool;
        this._has_minPool = true;
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
     * org.opennms.netmgt.config.opennmsDataSources.ConnectionPool
     */
    public static org.opennms.netmgt.config.opennmsDataSources.ConnectionPool unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.opennmsDataSources.ConnectionPool) Unmarshaller.unmarshal(org.opennms.netmgt.config.opennmsDataSources.ConnectionPool.class, reader);
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
