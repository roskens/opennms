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
 * Class Attrib.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="attrib")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("http-datacollection-config.xsd")
@SuppressWarnings("all") public class Attrib implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _alias.
     */
    @XmlAttribute(name="alias", required = true)
    private java.lang.String _alias;

    /**
     * Field _matchGroup.
     */
    @XmlAttribute(name="match-group", required = true)
    private Integer _matchGroup;

    /**
     * Field _type.
     */
    @XmlAttribute(name="type", required = true)
    private java.lang.String _type;


      //----------------/
     //- Constructors -/
    //----------------/

    public Attrib() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMatchGroup(
    ) {
        this._matchGroup= null;
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

        if (obj instanceof Attrib) {

            Attrib temp = (Attrib)obj;
            if (this._alias != null) {
                if (temp._alias == null) return false;
                else if (!(this._alias.equals(temp._alias)))
                    return false;
            }
            else if (temp._alias != null)
                return false;
            if (this._matchGroup != null) {
                if (temp._matchGroup == null) return false;
                else if (!(this._matchGroup.equals(temp._matchGroup)))
                    return false;
            }
            else if (temp._matchGroup != null)
                return false;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type)))
                    return false;
            }
            else if (temp._type != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'alias'.
     *
     * @return the value of field 'Alias'.
     */
    public java.lang.String getAlias(
    ) {
        return this._alias;
    }

    /**
     * Returns the value of field 'matchGroup'.
     *
     * @return the value of field 'MatchGroup'.
     */
    public Integer getMatchGroup(
    ) {
        return this._matchGroup;
    }

    /**
     * Returns the value of field 'type'.
     *
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Method hasMatchGroup.
     *
     * @return true if at least one MatchGroup has been added
     */
    public boolean hasMatchGroup(
    ) {
        return this._matchGroup != null;
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
        if (_alias != null) {
           result = 37 * result + _alias.hashCode();
        }
        if (_matchGroup != null) {
           result = 37 * result + _matchGroup.hashCode();
        }
        if (_type != null) {
           result = 37 * result + _type.hashCode();
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
     * Sets the value of field 'alias'.
     *
     * @param alias the value of field 'alias'.
     */
    public void setAlias(
            final java.lang.String alias) {
        this._alias = alias;
    }

    /**
     * Sets the value of field 'matchGroup'.
     *
     * @param matchGroup the value of field 'matchGroup'.
     */
    public void setMatchGroup(
            final Integer matchGroup) {
        this._matchGroup = matchGroup;
    }

    /**
     * Sets the value of field 'type'.
     *
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
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
     * org.opennms.netmgt.config.httpdatacollection.Attrib
     */
    public static org.opennms.netmgt.config.httpdatacollection.Attrib unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Attrib) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Attrib.class, reader);
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
