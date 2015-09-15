/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2011-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.nsclient;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.opennms.core.xml.ValidateUsing;

/**
 * Top-level element for the nsclient-config.xml configuration
 *  file.
 * 
 * @version $Revision$ $Date$
 */

@XmlRootElement(name="nsclient-config")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("nsclient-config.xsd")
@SuppressWarnings("all") public class NsclientConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * If set, overrides TCP port 1248 as the port where NSClient
     *  requests are sent.
     */
    @XmlAttribute(name="port")
    private Integer _port;

    /**
     * Default number of retries
     */
    @XmlAttribute(name="retry")
    private Integer _retry;

    /**
     * Default timeout (in milliseconds)
     */
    @XmlAttribute(name="timeout")
    private Integer _timeout;

    /**
     * Default password
     */
    @XmlAttribute(name="password")
    private java.lang.String _password;

    /**
     * Maps IP addresses to specific NSClient parmeters
     *  (retries, timeouts...)
     */
    @XmlElement(name="definition")
    private java.util.List<org.opennms.netmgt.config.nsclient.Definition> _definitionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NsclientConfig() {
        super();
        this._definitionList = new java.util.ArrayList<org.opennms.netmgt.config.nsclient.Definition>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final org.opennms.netmgt.config.nsclient.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionList.add(vDefinition);
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final int index,
            final org.opennms.netmgt.config.nsclient.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionList.add(index, vDefinition);
    }

    /**
     */
    public void deletePort(
    ) {
        this._port = null;
    }

    /**
     */
    public void deleteRetry(
    ) {
        this._retry = null;
    }

    /**
     */
    public void deleteTimeout(
    ) {
        this._timeout = null;
    }

    /**
     * Method enumerateDefinition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.nsclient.Definition> enumerateDefinition(
    ) {
        return java.util.Collections.enumeration(this._definitionList);
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
        
        if (obj instanceof NsclientConfig) {
        
            NsclientConfig temp = (NsclientConfig)obj;
            if (this._port != null) {
                if (temp._port == null) return false;
                else if (!(this._port.equals(temp._port))) 
                    return false;
            }
            else if (temp._port != null)
                return false;
            if (this._retry != null) {
                if (temp._retry == null) return false;
                else if (!(this._retry.equals(temp._retry))) 
                    return false;
            }
            else if (temp._retry != null)
                return false;
            if (this._timeout != null) {
                if (temp._timeout == null) return false;
                else if (!(this._timeout.equals(temp._timeout))) 
                    return false;
            }
            else if (temp._timeout != null)
                return false;
            if (this._password != null) {
                if (temp._password == null) return false;
                else if (!(this._password.equals(temp._password))) 
                    return false;
            }
            else if (temp._password != null)
                return false;
            if (this._definitionList != null) {
                if (temp._definitionList == null) return false;
                else if (!(this._definitionList.equals(temp._definitionList))) 
                    return false;
            }
            else if (temp._definitionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getDefinition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.nsclient.Definition at the given
     * index
     */
    public org.opennms.netmgt.config.nsclient.Definition getDefinition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("getDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.nsclient.Definition) _definitionList.get(index);
    }

    /**
     * Method getDefinition.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.nsclient.Definition[] getDefinition(
    ) {
        org.opennms.netmgt.config.nsclient.Definition[] array = new org.opennms.netmgt.config.nsclient.Definition[0];
        return (org.opennms.netmgt.config.nsclient.Definition[]) this._definitionList.toArray(array);
    }

    /**
     * Method getDefinitionCollection.Returns a reference to
     * '_definitionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.nsclient.Definition> getDefinitionCollection(
    ) {
        return this._definitionList;
    }

    /**
     * Method getDefinitionCount.
     * 
     * @return the size of this collection
     */
    public int getDefinitionCount(
    ) {
        return this._definitionList.size();
    }

    /**
     * Returns the value of field 'password'. The field 'password'
     * has the following description: Default password
     * 
     * @return the value of field 'Password'.
     */
    public java.lang.String getPassword(
    ) {
        return this._password;
    }

    /**
     * Returns the value of field 'port'. The field 'port' has the
     * following description: If set, overrides TCP port 1248 as
     * the port where NSClient
     *  requests are sent.
     * 
     * @return the value of field 'Port'.
     */
    public Integer getPort(
    ) {
        return this._port;
    }

    /**
     * Returns the value of field 'retry'. The field 'retry' has
     * the following description: Default number of retries
     * 
     * @return the value of field 'Retry'.
     */
    public Integer getRetry(
    ) {
        return this._retry;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: Default timeout (in
     * milliseconds)
     * 
     * @return the value of field 'Timeout'.
     */
    public Integer getTimeout(
    ) {
        return this._timeout;
    }

    /**
     * Method hasPort.
     * 
     * @return true if at least one Port has been added
     */
    public boolean hasPort(
    ) {
        return this._port != null;
    }

    /**
     * Method hasRetry.
     * 
     * @return true if at least one Retry has been added
     */
    public boolean hasRetry(
    ) {
        return this._retry != null;
    }

    /**
     * Method hasTimeout.
     * 
     * @return true if at least one Timeout has been added
     */
    public boolean hasTimeout(
    ) {
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
    public int hashCode(
    ) {
        int result = 17;
        
        long tmp;
        if (_port != null) {
           result = 37 * result + _port.hashCode();
        }
        if (_retry != null) {
           result = 37 * result + _retry.hashCode();
        }
        if (_timeout != null) {
           result = 37 * result + _timeout.hashCode();
        }
        if (_password != null) {
           result = 37 * result + _password.hashCode();
        }
        if (_definitionList != null) {
           result = 37 * result + _definitionList.hashCode();
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
     * Method iterateDefinition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.nsclient.Definition> iterateDefinition(
    ) {
        return this._definitionList.iterator();
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
     */
    public void removeAllDefinition(
    ) {
        this._definitionList.clear();
    }

    /**
     * Method removeDefinition.
     * 
     * @param vDefinition
     * @return true if the object was removed from the collection.
     */
    public boolean removeDefinition(
            final org.opennms.netmgt.config.nsclient.Definition vDefinition) {
        boolean removed = _definitionList.remove(vDefinition);
        return removed;
    }

    /**
     * Method removeDefinitionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.nsclient.Definition removeDefinitionAt(
            final int index) {
        java.lang.Object obj = this._definitionList.remove(index);
        return (org.opennms.netmgt.config.nsclient.Definition) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDefinition(
            final int index,
            final org.opennms.netmgt.config.nsclient.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("setDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }
        
        this._definitionList.set(index, vDefinition);
    }

    /**
     * 
     * 
     * @param vDefinitionArray
     */
    public void setDefinition(
            final org.opennms.netmgt.config.nsclient.Definition[] vDefinitionArray) {
        //-- copy array
        _definitionList.clear();
        
        for (int i = 0; i < vDefinitionArray.length; i++) {
                this._definitionList.add(vDefinitionArray[i]);
        }
    }

    /**
     * Sets the value of '_definitionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDefinitionList the Vector to copy.
     */
    public void setDefinition(
            final java.util.List<org.opennms.netmgt.config.nsclient.Definition> vDefinitionList) {
        // copy vector
        this._definitionList.clear();
        
        this._definitionList.addAll(vDefinitionList);
    }

    /**
     * Sets the value of '_definitionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param definitionList the Vector to set.
     */
    public void setDefinitionCollection(
            final java.util.List<org.opennms.netmgt.config.nsclient.Definition> definitionList) {
        this._definitionList = definitionList;
    }

    /**
     * Sets the value of field 'password'. The field 'password' has
     * the following description: Default password
     * 
     * @param password the value of field 'password'.
     */
    public void setPassword(
            final java.lang.String password) {
        this._password = password;
    }

    /**
     * Sets the value of field 'port'. The field 'port' has the
     * following description: If set, overrides TCP port 1248 as
     * the port where NSClient
     *  requests are sent.
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.opennms.netmgt.config.nsclient.NsclientConfig
     */
    public static org.opennms.netmgt.config.nsclient.NsclientConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.nsclient.NsclientConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.nsclient.NsclientConfig.class, reader);
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
