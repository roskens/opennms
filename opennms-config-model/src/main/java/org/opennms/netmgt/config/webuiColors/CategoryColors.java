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
package org.opennms.netmgt.config.webuiColors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element of the webui-colors.xml configuration
 *  file. The colors used in the categories box of the
 *  WebUI.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="category-colors")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("webui-colors.xsd")
@SuppressWarnings("all") public class CategoryColors implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The color used for a normal status
     */
    @XmlElement(name="green")
    private java.lang.String _green;

    /**
     * The color used for a warning status
     */
    @XmlElement(name="yellow")
    private java.lang.String _yellow;

    /**
     * The color used for an abnormal
     *  status
     */
    @XmlElement(name="red")
    private java.lang.String _red;


      //----------------/
     //- Constructors -/
    //----------------/

    public CategoryColors() {
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
        if ( this == obj )
            return true;

        if (obj instanceof CategoryColors) {

            CategoryColors temp = (CategoryColors)obj;
            if (this._green != null) {
                if (temp._green == null) return false;
                else if (!(this._green.equals(temp._green)))
                    return false;
            }
            else if (temp._green != null)
                return false;
            if (this._yellow != null) {
                if (temp._yellow == null) return false;
                else if (!(this._yellow.equals(temp._yellow)))
                    return false;
            }
            else if (temp._yellow != null)
                return false;
            if (this._red != null) {
                if (temp._red == null) return false;
                else if (!(this._red.equals(temp._red)))
                    return false;
            }
            else if (temp._red != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'green'. The field 'green' has
     * the following description: The color used for a normal
     * status
     *
     * @return the value of field 'Green'.
     */
    public java.lang.String getGreen(
    ) {
        return this._green;
    }

    /**
     * Returns the value of field 'red'. The field 'red' has the
     * following description: The color used for an abnormal
     *  status
     *
     * @return the value of field 'Red'.
     */
    public java.lang.String getRed(
    ) {
        return this._red;
    }

    /**
     * Returns the value of field 'yellow'. The field 'yellow' has
     * the following description: The color used for a warning
     * status
     *
     * @return the value of field 'Yellow'.
     */
    public java.lang.String getYellow(
    ) {
        return this._yellow;
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
        if (_green != null) {
           result = 37 * result + _green.hashCode();
        }
        if (_yellow != null) {
           result = 37 * result + _yellow.hashCode();
        }
        if (_red != null) {
           result = 37 * result + _red.hashCode();
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
     * Sets the value of field 'green'. The field 'green' has the
     * following description: The color used for a normal status
     *
     * @param green the value of field 'green'.
     */
    public void setGreen(
            final java.lang.String green) {
        this._green = green;
    }

    /**
     * Sets the value of field 'red'. The field 'red' has the
     * following description: The color used for an abnormal
     *  status
     *
     * @param red the value of field 'red'.
     */
    public void setRed(
            final java.lang.String red) {
        this._red = red;
    }

    /**
     * Sets the value of field 'yellow'. The field 'yellow' has the
     * following description: The color used for a warning status
     *
     * @param yellow the value of field 'yellow'.
     */
    public void setYellow(
            final java.lang.String yellow) {
        this._yellow = yellow;
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
     * org.opennms.netmgt.config.webuiColors.CategoryColors
     */
    public static org.opennms.netmgt.config.webuiColors.CategoryColors unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.webuiColors.CategoryColors) Unmarshaller.unmarshal(org.opennms.netmgt.config.webuiColors.CategoryColors.class, reader);
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
