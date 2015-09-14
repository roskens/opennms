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
package org.opennms.netmgt.config.syslogd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * String against which to match the message body; interpreted
 *  as a substring or a regular expression according to the
 *  value of the "type" attribute
 *
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="match")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("syslogd-configuration.xsd")
@SuppressWarnings("all") public class Match implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Whether to interpret this match string as a simple
     *  substring or as a regular expression
     *
     */
    @XmlAttribute(name="type")
    private String _type;

    /**
     * The match expression
     */
    @XmlAttribute(name="expression")
    private String _expression;

    /**
     * Whether to do the default mappings of matching-groups to
     *  event parameters (group 1 -> group1, etc.) if this is a
     *  regex match.
     *
     */
    @XmlAttribute(name="default-parameter-mapping")
    private Boolean _defaultParameterMapping;
    private static final Boolean DEFAULT_PARAMETER_MAPPING = true;


      //----------------/
     //- Constructors -/
    //----------------/

    public Match() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDefaultParameterMapping(
    ) {
        this._defaultParameterMapping = null;
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

        if (obj instanceof Match) {
            Match temp = (Match)obj;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type)))
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._expression != null) {
                if (temp._expression == null) return false;
                else if (!(this._expression.equals(temp._expression)))
                    return false;
            }
            else if (temp._expression != null)
                return false;
            if (this._defaultParameterMapping != null) {
                if (temp._defaultParameterMapping == null) return false;
                else if (!(this._defaultParameterMapping.equals(temp._defaultParameterMapping)))
                    return false;
            }
            else if (temp._defaultParameterMapping != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultParameterMapping'. The
     * field 'defaultParameterMapping' has the following
     * description: Whether to do the default mappings of
     * matching-groups to
     *  event parameters (group 1 -> group1, etc.) if this is a
     *  regex match.
     *
     *
     * @return the value of field 'DefaultParameterMapping'.
     */
    public Boolean getDefaultParameterMapping(
    ) {
        return this._defaultParameterMapping == null ? DEFAULT_PARAMETER_MAPPING : this._defaultParameterMapping;
    }

    /**
     * Returns the value of field 'expression'. The field
     * 'expression' has the following description: The match
     * expression
     *
     * @return the value of field 'Expression'.
     */
    public java.lang.String getExpression(
    ) {
        return this._expression;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Whether to interpret this match
     * string as a simple
     *  substring or as a regular expression
     *
     *
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Method hasDefaultParameterMapping.
     *
     * @return true if at least one DefaultParameterMapping has
     * been added
     */
    public boolean hasDefaultParameterMapping(
    ) {
        return this._defaultParameterMapping != null;
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
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_expression != null) {
           result = 37 * result + _expression.hashCode();
        }
        if (_defaultParameterMapping != null) {
           result = 37 * result + _defaultParameterMapping.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'defaultParameterMapping'. The
     * field 'defaultParameterMapping' has the following
     * description: Whether to do the default mappings of
     * matching-groups to
     *  event parameters (group 1 -> group1, etc.) if this is a
     *  regex match.
     *
     *
     * @return the value of field 'DefaultParameterMapping'.
     */
    public boolean isDefaultParameterMapping(
    ) {
        return this._defaultParameterMapping == null ? DEFAULT_PARAMETER_MAPPING : this._defaultParameterMapping;
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
     * Sets the value of field 'defaultParameterMapping'. The field
     * 'defaultParameterMapping' has the following description:
     * Whether to do the default mappings of matching-groups to
     *  event parameters (group 1 -> group1, etc.) if this is a
     *  regex match.
     *
     *
     * @param defaultParameterMapping the value of field
     * 'defaultParameterMapping'.
     */
    public void setDefaultParameterMapping(
            final Boolean defaultParameterMapping) {
        this._defaultParameterMapping = defaultParameterMapping;
    }

    /**
     * Sets the value of field 'expression'. The field 'expression'
     * has the following description: The match expression
     *
     * @param expression the value of field 'expression'.
     */
    public void setExpression(
            final java.lang.String expression) {
        this._expression = expression;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Whether to interpret this match
     * string as a simple
     *  substring or as a regular expression
     *
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
     * org.opennms.netmgt.config.syslogd.Match
     */
    public static org.opennms.netmgt.config.syslogd.Match unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.Match) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.Match.class, reader);
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
