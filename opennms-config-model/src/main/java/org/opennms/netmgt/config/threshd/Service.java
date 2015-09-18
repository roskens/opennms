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
package org.opennms.netmgt.config.threshd;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Service for which thresholding is to be performed for
 *  addresses in this package
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "service")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("threshd-configuration.xsd")
@SuppressWarnings("all")
public class Service implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Service name
     */
    @XmlAttribute(name = "name", required = true)
    private java.lang.String _name;

    /**
     * Interval at which the service is to be threshold
     *  checked
     */
    @XmlAttribute(name = "interval", required = true)
    private Long _interval;

    /**
     * Specifies if this is a user-defined service. Used
     *  specifically for UI purposes.
     */
    @XmlAttribute(name = "user-defined")
    private java.lang.String _userDefined;

    /**
     * Thresholding status for this service. Service is
     *  checked against thresholds only if set to 'on'.
     */
    @XmlAttribute(name = "status")
    private java.lang.String _status;

    /**
     * Parameters to be used for threshold checking this
     *  service. Parameters are specific to the service
     *  thresholder.
     */
    @XmlElement(name = "parameter")
    private java.util.List<org.opennms.netmgt.config.threshd.Parameter> _parameterList;

      //----------------/
    //- Constructors -/
    //----------------/
    public Service() {
        super();
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.Parameter>();
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
            final org.opennms.netmgt.config.threshd.Parameter vParameter)
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
            final org.opennms.netmgt.config.threshd.Parameter vParameter)
            throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     */
    public void deleteInterval() {
        this._interval = null;
    }

    /**
     * Method enumerateParameter.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.Parameter> enumerateParameter() {
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

        if (obj instanceof Service) {

            Service temp = (Service) obj;
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
     * Returns the value of field 'interval'. The field 'interval'
     * has the following description: Interval at which the service
     * is to be threshold
     *  checked
     *
     * @return the value of field 'Interval'.
     */
    public Long getInterval() {
        return this._interval;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Service name
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName() {
        return this._name;
    }

    /**
     * Method getParameter.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.Parameter at the given inde
     */
    public org.opennms.netmgt.config.threshd.Parameter getParameter(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.threshd.Parameter) _parameterList.get(index);
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
    public org.opennms.netmgt.config.threshd.Parameter[] getParameter() {
        org.opennms.netmgt.config.threshd.Parameter[] array = new org.opennms.netmgt.config.threshd.Parameter[0];
        return (org.opennms.netmgt.config.threshd.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.Parameter> getParameterCollection() {
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
     * Returns the value of field 'status'. The field 'status' has
     * the following description: Thresholding status for this
     * service. Service is
     *  checked against thresholds only if set to 'on'.
     *
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus() {
        return this._status;
    }

    /**
     * Returns the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * this is a user-defined service. Used
     *  specifically for UI purposes.
     *
     * @return the value of field 'UserDefined'.
     */
    public java.lang.String getUserDefined() {
        return this._userDefined;
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
        if (_name != null) {
            result = 37 * result + _name.hashCode();
        }
        result = 37 * result + (int) (_interval ^ (_interval >>> 32));
        if (_userDefined != null) {
            result = 37 * result + _userDefined.hashCode();
        }
        if (_status != null) {
            result = 37 * result + _status.hashCode();
        }
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
    public java.util.Iterator<org.opennms.netmgt.config.threshd.Parameter> iterateParameter() {
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
            final org.opennms.netmgt.config.threshd.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.threshd.Parameter) obj;
    }

    /**
     * Sets the value of field 'interval'. The field 'interval' has
     * the following description: Interval at which the service is
     * to be threshold
     *  checked
     *
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final Long interval) {
        this._interval = interval;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Service name
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
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
            final org.opennms.netmgt.config.threshd.Parameter vParameter)
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
            final org.opennms.netmgt.config.threshd.Parameter[] vParameterArray) {
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
            final java.util.List<org.opennms.netmgt.config.threshd.Parameter> vParameterList) {
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
            final java.util.List<org.opennms.netmgt.config.threshd.Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: Thresholding status for this service.
     * Service is
     *  checked against thresholds only if set to 'on'.
     *
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * this is a user-defined service. Used
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
     * org.opennms.netmgt.config.threshd.Service
     */
    public static org.opennms.netmgt.config.threshd.Service unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.threshd.Service) Unmarshaller.unmarshal(org.opennms.netmgt.config.threshd.Service.class, reader);
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
