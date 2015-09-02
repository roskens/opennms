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
package org.opennms.netmgt.config.surveillanceViews;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class View.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="view")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("surveillance-views.xsd")
@SuppressWarnings("all") public class View implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _refreshSeconds.
     */
    private java.lang.String _refreshSeconds = "300";

    /**
     * Field _rows.
     */
    private org.opennms.netmgt.config.surveillanceViews.Rows _rows;

    /**
     * Field _columns.
     */
    private org.opennms.netmgt.config.surveillanceViews.Columns _columns;


      //----------------/
     //- Constructors -/
    //----------------/

    public View() {
        super();
        setRefreshSeconds("300");
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

        if (obj instanceof View) {

            View temp = (View)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._refreshSeconds != null) {
                if (temp._refreshSeconds == null) return false;
                else if (!(this._refreshSeconds.equals(temp._refreshSeconds)))
                    return false;
            }
            else if (temp._refreshSeconds != null)
                return false;
            if (this._rows != null) {
                if (temp._rows == null) return false;
                else if (!(this._rows.equals(temp._rows)))
                    return false;
            }
            else if (temp._rows != null)
                return false;
            if (this._columns != null) {
                if (temp._columns == null) return false;
                else if (!(this._columns.equals(temp._columns)))
                    return false;
            }
            else if (temp._columns != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'columns'.
     *
     * @return the value of field 'Columns'.
     */
    public org.opennms.netmgt.config.surveillanceViews.Columns getColumns(
    ) {
        return this._columns;
    }

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'refreshSeconds'.
     *
     * @return the value of field 'RefreshSeconds'.
     */
    public java.lang.String getRefreshSeconds(
    ) {
        return this._refreshSeconds;
    }

    /**
     * Returns the value of field 'rows'.
     *
     * @return the value of field 'Rows'.
     */
    public org.opennms.netmgt.config.surveillanceViews.Rows getRows(
    ) {
        return this._rows;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_refreshSeconds != null) {
           result = 37 * result + _refreshSeconds.hashCode();
        }
        if (_rows != null) {
           result = 37 * result + _rows.hashCode();
        }
        if (_columns != null) {
           result = 37 * result + _columns.hashCode();
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
     * Sets the value of field 'columns'.
     *
     * @param columns the value of field 'columns'.
     */
    public void setColumns(
            final org.opennms.netmgt.config.surveillanceViews.Columns columns) {
        this._columns = columns;
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
     * Sets the value of field 'refreshSeconds'.
     *
     * @param refreshSeconds the value of field 'refreshSeconds'.
     */
    public void setRefreshSeconds(
            final java.lang.String refreshSeconds) {
        this._refreshSeconds = refreshSeconds;
    }

    /**
     * Sets the value of field 'rows'.
     *
     * @param rows the value of field 'rows'.
     */
    public void setRows(
            final org.opennms.netmgt.config.surveillanceViews.Rows rows) {
        this._rows = rows;
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
     * org.opennms.netmgt.config.surveillanceViews.View
     */
    public static org.opennms.netmgt.config.surveillanceViews.View unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.surveillanceViews.View) Unmarshaller.unmarshal(org.opennms.netmgt.config.surveillanceViews.View.class, reader);
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
