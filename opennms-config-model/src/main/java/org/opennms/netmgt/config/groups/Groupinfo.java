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
package org.opennms.netmgt.config.groups;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the groups.xml configuration
 *  file.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "groupinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("groups.xsd")
@SuppressWarnings("all")
public class Groupinfo implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Header containing information about this configuration
     *  file.
     */
    @XmlElement(name = "header")
    private org.opennms.netmgt.config.groups.Header _header;

    /**
     * Field _groups.
     */
    @XmlElement(name = "groups")
    private org.opennms.netmgt.config.groups.Groups _groups;

    /**
     * Field _roles.
     */
    @XmlElement(name = "roles")
    private org.opennms.netmgt.config.groups.Roles _roles;

      //----------------/
    //- Constructors -/
    //----------------/
    public Groupinfo() {
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

        if (obj instanceof Groupinfo) {

            Groupinfo temp = (Groupinfo) obj;
            if (this._header != null) {
                if (temp._header == null) {
                    return false;
                } else if (!(this._header.equals(temp._header))) {
                    return false;
                }
            } else if (temp._header != null) {
                return false;
            }
            if (this._groups != null) {
                if (temp._groups == null) {
                    return false;
                } else if (!(this._groups.equals(temp._groups))) {
                    return false;
                }
            } else if (temp._groups != null) {
                return false;
            }
            if (this._roles != null) {
                if (temp._roles == null) {
                    return false;
                } else if (!(this._roles.equals(temp._roles))) {
                    return false;
                }
            } else if (temp._roles != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'groups'.
     *
     * @return the value of field 'Groups'.
     */
    public org.opennms.netmgt.config.groups.Groups getGroups() {
        return this._groups;
    }

    /**
     * Returns the value of field 'header'. The field 'header' has
     * the following description: Header containing information
     * about this configuration
     *  file.
     *
     * @return the value of field 'Header'.
     */
    public org.opennms.netmgt.config.groups.Header getHeader() {
        return this._header;
    }

    /**
     * Returns the value of field 'roles'.
     *
     * @return the value of field 'Roles'.
     */
    public org.opennms.netmgt.config.groups.Roles getRoles() {
        return this._roles;
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
        if (_header != null) {
            result = 37 * result + _header.hashCode();
        }
        if (_groups != null) {
            result = 37 * result + _groups.hashCode();
        }
        if (_roles != null) {
            result = 37 * result + _roles.hashCode();
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
     * Sets the value of field 'groups'.
     *
     * @param groups the value of field 'groups'.
     */
    public void setGroups(
            final org.opennms.netmgt.config.groups.Groups groups) {
        this._groups = groups;
    }

    /**
     * Sets the value of field 'header'. The field 'header' has the
     * following description: Header containing information about
     * this configuration
     *  file.
     *
     * @param header the value of field 'header'.
     */
    public void setHeader(
            final org.opennms.netmgt.config.groups.Header header) {
        this._header = header;
    }

    /**
     * Sets the value of field 'roles'.
     *
     * @param roles the value of field 'roles'.
     */
    public void setRoles(
            final org.opennms.netmgt.config.groups.Roles roles) {
        this._roles = roles;
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
     * org.opennms.netmgt.config.groups.Groupinfo
     */
    public static org.opennms.netmgt.config.groups.Groupinfo unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.groups.Groupinfo) Unmarshaller.unmarshal(org.opennms.netmgt.config.groups.Groupinfo.class, reader);
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
