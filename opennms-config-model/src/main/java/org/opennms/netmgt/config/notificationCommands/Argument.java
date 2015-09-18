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
package org.opennms.netmgt.config.notificationCommands;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Argument.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "argument")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("notificationCommands.xsd")
@SuppressWarnings("all")
public class Argument implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _streamed.
     */
    @XmlAttribute(name = "streamed", required = true)
    private java.lang.String _streamed;

    /**
     * Field _substitution.
     */
    @XmlElement(name = "substitution")
    private java.lang.String _substitution;

    /**
     * Field _switch.
     */
    @XmlElement(name = "switch")
    private java.lang.String _switch;

      //----------------/
    //- Constructors -/
    //----------------/
    public Argument() {
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

        if (obj instanceof Argument) {

            Argument temp = (Argument) obj;
            if (this._streamed != null) {
                if (temp._streamed == null) {
                    return false;
                } else if (!(this._streamed.equals(temp._streamed))) {
                    return false;
                }
            } else if (temp._streamed != null) {
                return false;
            }
            if (this._substitution != null) {
                if (temp._substitution == null) {
                    return false;
                } else if (!(this._substitution.equals(temp._substitution))) {
                    return false;
                }
            } else if (temp._substitution != null) {
                return false;
            }
            if (this._switch != null) {
                if (temp._switch == null) {
                    return false;
                } else if (!(this._switch.equals(temp._switch))) {
                    return false;
                }
            } else if (temp._switch != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'streamed'.
     *
     * @return the value of field 'Streamed'.
     */
    public java.lang.String getStreamed() {
        return this._streamed;
    }

    /**
     * Returns the value of field 'substitution'.
     *
     * @return the value of field 'Substitution'.
     */
    public java.lang.String getSubstitution() {
        return this._substitution;
    }

    /**
     * Returns the value of field 'switch'.
     *
     * @return the value of field 'Switch'.
     */
    public java.lang.String getSwitch() {
        return this._switch;
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
        if (_streamed != null) {
            result = 37 * result + _streamed.hashCode();
        }
        if (_substitution != null) {
            result = 37 * result + _substitution.hashCode();
        }
        if (_switch != null) {
            result = 37 * result + _switch.hashCode();
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
     * Sets the value of field 'streamed'.
     *
     * @param streamed the value of field 'streamed'.
     */
    public void setStreamed(
            final java.lang.String streamed) {
        this._streamed = streamed;
    }

    /**
     * Sets the value of field 'substitution'.
     *
     * @param substitution the value of field 'substitution'.
     */
    public void setSubstitution(
            final java.lang.String substitution) {
        this._substitution = substitution;
    }

    /**
     * Sets the value of field 'switch'.
     *
     * @param _switch
     * @param switch the value of field 'switch'.
     */
    public void setSwitch(
            final java.lang.String _switch) {
        this._switch = _switch;
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
     * org.opennms.netmgt.config.notificationCommands.Argument
     */
    public static org.opennms.netmgt.config.notificationCommands.Argument unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notificationCommands.Argument) Unmarshaller.unmarshal(org.opennms.netmgt.config.notificationCommands.Argument.class, reader);
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
