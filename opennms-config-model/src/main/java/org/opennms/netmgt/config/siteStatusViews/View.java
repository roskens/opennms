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
package org.opennms.netmgt.config.siteStatusViews;

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="view")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("site-status-views.xsd")
@SuppressWarnings("all") public class View implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    @XmlAttribute(name="name", required = true)
    private java.lang.String _name;

    /**
     * Field _tableName.
     */
    @XmlAttribute(name="table-name")
    private java.lang.String _tableName;
    private static final String DEFAULT_TABLE_NAME = "assets";

    /**
     * Field _columnName.
     */
    @XmlAttribute(name="column-name")
    private java.lang.String _columnName;
    private static final String DEFAULT_COLUMN_NAME = "building";

    /**
     * Field _columnType.
     */
    @XmlAttribute(name="column-type")
    private java.lang.String _columnType;
    private static final String DEFAULT_COLUMN_TYPE = "varchar";

    /**
     * Field _columnValue.
     */
    @XmlAttribute(name="column-value")
    private java.lang.String _columnValue;

    /**
     * Field _rows.
     */
    @XmlElement(name="rows")
    private org.opennms.netmgt.config.siteStatusViews.Rows _rows;


      //----------------/
     //- Constructors -/
    //----------------/

    public View() {
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

        if (obj instanceof View) {

            View temp = (View)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._tableName != null) {
                if (temp._tableName == null) return false;
                else if (!(this._tableName.equals(temp._tableName)))
                    return false;
            }
            else if (temp._tableName != null)
                return false;
            if (this._columnName != null) {
                if (temp._columnName == null) return false;
                else if (!(this._columnName.equals(temp._columnName)))
                    return false;
            }
            else if (temp._columnName != null)
                return false;
            if (this._columnType != null) {
                if (temp._columnType == null) return false;
                else if (!(this._columnType.equals(temp._columnType)))
                    return false;
            }
            else if (temp._columnType != null)
                return false;
            if (this._columnValue != null) {
                if (temp._columnValue == null) return false;
                else if (!(this._columnValue.equals(temp._columnValue)))
                    return false;
            }
            else if (temp._columnValue != null)
                return false;
            if (this._rows != null) {
                if (temp._rows == null) return false;
                else if (!(this._rows.equals(temp._rows)))
                    return false;
            }
            else if (temp._rows != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'columnName'.
     *
     * @return the value of field 'ColumnName'.
     */
    public java.lang.String getColumnName(
    ) {
        return this._columnName == null ? DEFAULT_COLUMN_NAME : this._columnName;
    }

    /**
     * Returns the value of field 'columnType'.
     *
     * @return the value of field 'ColumnType'.
     */
    public java.lang.String getColumnType(
    ) {
        return this._columnType == null ? DEFAULT_COLUMN_TYPE : this._columnType;
    }

    /**
     * Returns the value of field 'columnValue'.
     *
     * @return the value of field 'ColumnValue'.
     */
    public java.lang.String getColumnValue(
    ) {
        return this._columnValue;
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
     * Returns the value of field 'rows'.
     *
     * @return the value of field 'Rows'.
     */
    public org.opennms.netmgt.config.siteStatusViews.Rows getRows(
    ) {
        return this._rows;
    }

    /**
     * Returns the value of field 'tableName'.
     *
     * @return the value of field 'TableName'.
     */
    public java.lang.String getTableName(
    ) {
        return this._tableName == null ? DEFAULT_TABLE_NAME : this._tableName;
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
        if (_tableName != null) {
           result = 37 * result + _tableName.hashCode();
        }
        if (_columnName != null) {
           result = 37 * result + _columnName.hashCode();
        }
        if (_columnType != null) {
           result = 37 * result + _columnType.hashCode();
        }
        if (_columnValue != null) {
           result = 37 * result + _columnValue.hashCode();
        }
        if (_rows != null) {
           result = 37 * result + _rows.hashCode();
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
     * Sets the value of field 'columnName'.
     *
     * @param columnName the value of field 'columnName'.
     */
    public void setColumnName(
            final java.lang.String columnName) {
        this._columnName = columnName;
    }

    /**
     * Sets the value of field 'columnType'.
     *
     * @param columnType the value of field 'columnType'.
     */
    public void setColumnType(
            final java.lang.String columnType) {
        this._columnType = columnType;
    }

    /**
     * Sets the value of field 'columnValue'.
     *
     * @param columnValue the value of field 'columnValue'.
     */
    public void setColumnValue(
            final java.lang.String columnValue) {
        this._columnValue = columnValue;
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
     * Sets the value of field 'rows'.
     *
     * @param rows the value of field 'rows'.
     */
    public void setRows(
            final org.opennms.netmgt.config.siteStatusViews.Rows rows) {
        this._rows = rows;
    }

    /**
     * Sets the value of field 'tableName'.
     *
     * @param tableName the value of field 'tableName'.
     */
    public void setTableName(
            final java.lang.String tableName) {
        this._tableName = tableName;
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
     * org.opennms.netmgt.config.siteStatusViews.View
     */
    public static org.opennms.netmgt.config.siteStatusViews.View unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.siteStatusViews.View) Unmarshaller.unmarshal(org.opennms.netmgt.config.siteStatusViews.View.class, reader);
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
