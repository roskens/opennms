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
 * Class Uri.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "uri")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("http-datacollection-config.xsd")
@SuppressWarnings("all")
public class Uri implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _name.
     */
    @XmlAttribute(name = "name", required = true)
    private java.lang.String _name;

    /**
     * Field _url.
     */
    @XmlElement(name = "url")
    private org.opennms.netmgt.config.httpdatacollection.Url _url;

    /**
     * Field _attributes.
     */
    @XmlElement(name = "attributes")
    private org.opennms.netmgt.config.httpdatacollection.Attributes _attributes;

      //----------------/
    //- Constructors -/
    //----------------/
    public Uri() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
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

        if (obj instanceof Uri) {

            Uri temp = (Uri) obj;
            if (this._name != null) {
                if (temp._name == null) {
                    return false;
                } else if (!(this._name.equals(temp._name))) {
                    return false;
                }
            } else if (temp._name != null) {
                return false;
            }
            if (this._url != null) {
                if (temp._url == null) {
                    return false;
                } else if (!(this._url.equals(temp._url))) {
                    return false;
                }
            } else if (temp._url != null) {
                return false;
            }
            if (this._attributes != null) {
                if (temp._attributes == null) {
                    return false;
                } else if (!(this._attributes.equals(temp._attributes))) {
                    return false;
                }
            } else if (temp._attributes != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'attributes'.
     *
     * @return the value of field 'Attributes'.
     */
    public org.opennms.netmgt.config.httpdatacollection.Attributes getAttributes() {
        return this._attributes;
    }

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName() {
        return this._name;
    }

    /**
     * Returns the value of field 'url'.
     *
     * @return the value of field 'Url'.
     */
    public org.opennms.netmgt.config.httpdatacollection.Url getUrl() {
        return this._url;
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
        if (_url != null) {
            result = 37 * result + _url.hashCode();
        }
        if (_attributes != null) {
            result = 37 * result + _attributes.hashCode();
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
     * Sets the value of field 'attributes'.
     *
     * @param attributes the value of field 'attributes'.
     */
    public void setAttributes(
            final org.opennms.netmgt.config.httpdatacollection.Attributes attributes) {
        this._attributes = attributes;
    }

    /**
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'url'.
     *
     * @param url the value of field 'url'.
     */
    public void setUrl(
            final org.opennms.netmgt.config.httpdatacollection.Url url) {
        this._url = url;
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
     * org.opennms.netmgt.config.httpdatacollection.Uri
     */
    public static org.opennms.netmgt.config.httpdatacollection.Uri unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Uri) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Uri.class, reader);
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
