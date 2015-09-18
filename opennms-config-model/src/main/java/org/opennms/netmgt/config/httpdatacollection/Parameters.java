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
package org.opennms.netmgt.config.httpdatacollection;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Parameters.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "parameters")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("http-datacollection-config.xsd")
@SuppressWarnings("all")
public class Parameters implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Parameters to be used for configuration this strategy.
     */
    @XmlElement(name = "parameter")
    private java.util.List<org.opennms.netmgt.config.httpdatacollection.Parameter> _parameterList;

      //----------------/
    //- Constructors -/
    //----------------/
    public Parameters() {
        super();
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.httpdatacollection.Parameter>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final org.opennms.netmgt.config.httpdatacollection.Parameter vParameter)
            throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(vParameter);
    }

    /**
     *
     *
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.Parameter vParameter)
            throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     * Method enumerateParameter.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.httpdatacollection.Parameter> enumerateParameter() {
        return java.util.Collections.enumeration(this._parameterList);
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

        if (obj instanceof Parameters) {

            Parameters temp = (Parameters) obj;
            if (this._parameterList != null) {
                if (temp._parameterList == null) {
                    return false;
                } else if (!(this._parameterList.equals(temp._parameterList))) {
                    return false;
                }
            } else if (temp._parameterList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Method getParameter.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.httpdatacollection.Parameter at
     * the given index
     */
    public org.opennms.netmgt.config.httpdatacollection.Parameter getParameter(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.httpdatacollection.Parameter) _parameterList.get(index);
    }

    /**
     * Method getParameter.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.httpdatacollection.Parameter[] getParameter() {
        org.opennms.netmgt.config.httpdatacollection.Parameter[] array = new org.opennms.netmgt.config.httpdatacollection.Parameter[0];
        return (org.opennms.netmgt.config.httpdatacollection.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.httpdatacollection.Parameter> getParameterCollection() {
        return this._parameterList;
    }

    /**
     * Method getParameterCount.
     *
     * @return the size of this collection
     */
    public int getParameterCount() {
        return this._parameterList.size();
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
        if (_parameterList != null) {
            result = 37 * result + _parameterList.hashCode();
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
     * Method iterateParameter.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.httpdatacollection.Parameter> iterateParameter() {
        return this._parameterList.iterator();
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
    public void removeAllParameter() {
        this._parameterList.clear();
    }

    /**
     * Method removeParameter.
     *
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final org.opennms.netmgt.config.httpdatacollection.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.httpdatacollection.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.httpdatacollection.Parameter) obj;
    }

    /**
     *
     *
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParameter(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.Parameter vParameter)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("setParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }

        this._parameterList.set(index, vParameter);
    }

    /**
     *
     *
     * @param vParameterArray
     */
    public void setParameter(
            final org.opennms.netmgt.config.httpdatacollection.Parameter[] vParameterArray) {
        //-- copy array
        _parameterList.clear();

        for (int i = 0; i < vParameterArray.length; i++) {
            this._parameterList.add(vParameterArray[i]);
        }
    }

    /**
     * Sets the value of '_parameterList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vParameterList the Vector to copy.
     */
    public void setParameter(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.Parameter> vParameterList) {
        // copy vector
        this._parameterList.clear();

        this._parameterList.addAll(vParameterList);
    }

    /**
     * Sets the value of '_parameterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param parameterList the Vector to set.
     */
    public void setParameterCollection(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.Parameter> parameterList) {
        this._parameterList = parameterList;
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
     * org.opennms.netmgt.config.httpdatacollection.Parameters
     */
    public static org.opennms.netmgt.config.httpdatacollection.Parameters unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Parameters) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Parameters.class, reader);
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
