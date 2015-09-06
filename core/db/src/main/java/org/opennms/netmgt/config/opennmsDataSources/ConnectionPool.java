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
    @XmlAttribute(name="factory")
    private java.lang.String _factory;
    private static final String DEFAULT_FACTORY = "org.opennms.core.db.C3P0ConnectionFactory";

    /**
     * How long, in seconds, an idle connection is kept in the pool
     * before it is removed.
     */
    @XmlAttribute(name="idleTimeout")
    private Integer _idleTimeout;
    private static final Integer DEFAULT_IDLETIMEOUT = 600;

    /**
     * How long, in seconds, to attempt to make a connection to the
     * database.
     */
    @XmlAttribute(name="loginTimeout")
    private Integer _loginTimeout;
    private static final Integer DEFAULT_LOGINTIMEOUT = 3;

    /**
     * The minimum number of pooled connections to retain.
     */
    @XmlAttribute(name="minPool")
    private Integer _minPool;
    private static final Integer DEFAULT_MINPOOL = 10;

    /**
     * The maximum number of pooled connections to retain.
     */
    @XmlAttribute(name="maxPool")
    private Integer _maxPool;
    private static final Integer DEFAULT_MAXPOOL = 50;

    /**
     * The maximum number of connections that can be created.
     */
    @XmlAttribute(name="maxSize")
    private Integer _maxSize;
    private static final Integer DEFAULT_MAXSIZE = 500;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConnectionPool() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteIdleTimeout(
    ) {
        this._idleTimeout = null;
    }

    /**
     */
    public void deleteLoginTimeout(
    ) {
        this._loginTimeout = null;
    }

    /**
     */
    public void deleteMaxPool(
    ) {
        this._maxPool = null;
    }

    /**
     */
    public void deleteMaxSize(
    ) {
        this._maxSize = null;
    }

    /**
     */
    public void deleteMinPool(
    ) {
        this._minPool = null;
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
            if (this._idleTimeout != null) {
                if (temp._idleTimeout == null) return false;
                else if (!(this._idleTimeout.equals(temp._idleTimeout)))
                    return false;
            }
            else if (temp._idleTimeout != null)
                return false;
            if (this._loginTimeout != null) {
                if (temp._loginTimeout == null) return false;
                else if (!(this._loginTimeout.equals(temp._loginTimeout)))
                    return false;
            }
            else if (temp._loginTimeout != null)
                return false;
            if (this._minPool != null) {
                if (temp._minPool == null) return false;
                else if (!(this._minPool.equals(temp._minPool)))
                    return false;
            }
            else if (temp._minPool != null)
                return false;
            if (this._maxPool != null) {
                if (temp._maxPool == null) return false;
                else if (!(this._maxPool.equals(temp._maxPool)))
                    return false;
            }
            else if (temp._maxPool != null)
                return false;
            if (this._maxSize != null) {
                if (temp._maxSize == null) return false;
                else if (!(this._maxSize.equals(temp._maxSize)))
                    return false;
            }
            else if (temp._maxSize != null)
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
        return this._factory == null ? DEFAULT_FACTORY : this._factory;
    }

    /**
     * Returns the value of field 'idleTimeout'. The field
     * 'idleTimeout' has the following description: How long, in
     * seconds, an idle connection is kept in the pool before it is
     * removed.
     *
     * @return the value of field 'IdleTimeout'.
     */
    public Integer getIdleTimeout(
    ) {
        return this._idleTimeout == null ? DEFAULT_IDLETIMEOUT : this._idleTimeout;
    }

    /**
     * Returns the value of field 'loginTimeout'. The field
     * 'loginTimeout' has the following description: How long, in
     * seconds, to attempt to make a connection to the database.
     *
     * @return the value of field 'LoginTimeout'.
     */
    public Integer getLoginTimeout(
    ) {
        return this._loginTimeout == null ? DEFAULT_LOGINTIMEOUT : this._loginTimeout;
    }

    /**
     * Returns the value of field 'maxPool'. The field 'maxPool'
     * has the following description: The maximum number of pooled
     * connections to retain.
     *
     * @return the value of field 'MaxPool'.
     */
    public Integer getMaxPool(
    ) {
        return this._maxPool == null ? DEFAULT_MAXPOOL : this._maxPool;
    }

    /**
     * Returns the value of field 'maxSize'. The field 'maxSize'
     * has the following description: The maximum number of
     * connections that can be created.
     *
     * @return the value of field 'MaxSize'.
     */
    public Integer getMaxSize(
    ) {
        return this._maxSize == null ? DEFAULT_MAXSIZE : this._maxSize;
    }

    /**
     * Returns the value of field 'minPool'. The field 'minPool'
     * has the following description: The minimum number of pooled
     * connections to retain.
     *
     * @return the value of field 'MinPool'.
     */
    public Integer getMinPool(
    ) {
        return this._minPool == null ? DEFAULT_MINPOOL : this._minPool;
    }

    /**
     * Method hasIdleTimeout.
     *
     * @return true if at least one IdleTimeout has been added
     */
    public boolean hasIdleTimeout(
    ) {
        return this._idleTimeout != null;
    }

    /**
     * Method hasLoginTimeout.
     *
     * @return true if at least one LoginTimeout has been added
     */
    public boolean hasLoginTimeout(
    ) {
        return this._loginTimeout != null;
    }

    /**
     * Method hasMaxPool.
     *
     * @return true if at least one MaxPool has been added
     */
    public boolean hasMaxPool(
    ) {
        return this._maxPool != null;
    }

    /**
     * Method hasMaxSize.
     *
     * @return true if at least one MaxSize has been added
     */
    public boolean hasMaxSize(
    ) {
        return this._maxSize != null;
    }

    /**
     * Method hasMinPool.
     *
     * @return true if at least one MinPool has been added
     */
    public boolean hasMinPool(
    ) {
        return this._minPool != null;
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
        if (_idleTimeout != null) {
           result = 37 * result + _idleTimeout.hashCode();
        }
        if (_loginTimeout != null) {
           result = 37 * result + _loginTimeout.hashCode();
        }
        if (_minPool != null) {
           result = 37 * result + _minPool.hashCode();
        }
        if (_maxPool != null) {
           result = 37 * result + _maxPool.hashCode();
        }
        if (_maxSize != null) {
           result = 37 * result + _maxSize.hashCode();
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
            final Integer idleTimeout) {
        this._idleTimeout = idleTimeout;
    }

    /**
     * Sets the value of field 'loginTimeout'. The field
     * 'loginTimeout' has the following description: How long, in
     * seconds, to attempt to make a connection to the database.
     *
     * @param loginTimeout the value of field 'loginTimeout'.
     */
    public void setLoginTimeout(
            final Integer loginTimeout) {
        this._loginTimeout = loginTimeout;
    }

    /**
     * Sets the value of field 'maxPool'. The field 'maxPool' has
     * the following description: The maximum number of pooled
     * connections to retain.
     *
     * @param maxPool the value of field 'maxPool'.
     */
    public void setMaxPool(
            final Integer maxPool) {
        this._maxPool = maxPool;
    }

    /**
     * Sets the value of field 'maxSize'. The field 'maxSize' has
     * the following description: The maximum number of connections
     * that can be created.
     *
     * @param maxSize the value of field 'maxSize'.
     */
    public void setMaxSize(
            final Integer maxSize) {
        this._maxSize = maxSize;
    }

    /**
     * Sets the value of field 'minPool'. The field 'minPool' has
     * the following description: The minimum number of pooled
     * connections to retain.
     *
     * @param minPool the value of field 'minPool'.
     */
    public void setMinPool(
            final Integer minPool) {
        this._minPool = minPool;
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
