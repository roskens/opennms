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
package org.opennms.netmgt.config.filter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the database-schema.xml
 *  configuration file.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="database-schema")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("database-schema.xsd")
@SuppressWarnings("all") public class DatabaseSchema implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tableList.
     */
    @XmlElement(name="table")
    private java.util.List<org.opennms.netmgt.config.filter.Table> _tableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DatabaseSchema() {
        super();
        this._tableList = new java.util.ArrayList<org.opennms.netmgt.config.filter.Table>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vTable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTable(
            final org.opennms.netmgt.config.filter.Table vTable)
    throws java.lang.IndexOutOfBoundsException {
        this._tableList.add(vTable);
    }

    /**
     *
     *
     * @param index
     * @param vTable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTable(
            final int index,
            final org.opennms.netmgt.config.filter.Table vTable)
    throws java.lang.IndexOutOfBoundsException {
        this._tableList.add(index, vTable);
    }

    /**
     * Method enumerateTable.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.filter.Table> enumerateTable(
    ) {
        return java.util.Collections.enumeration(this._tableList);
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

        if (obj instanceof DatabaseSchema) {

            DatabaseSchema temp = (DatabaseSchema)obj;
            if (this._tableList != null) {
                if (temp._tableList == null) return false;
                else if (!(this._tableList.equals(temp._tableList)))
                    return false;
            }
            else if (temp._tableList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getTable.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.filter.Table at the given index
     */
    public org.opennms.netmgt.config.filter.Table getTable(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tableList.size()) {
            throw new IndexOutOfBoundsException("getTable: Index value '" + index + "' not in range [0.." + (this._tableList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.filter.Table) _tableList.get(index);
    }

    /**
     * Method getTable.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.filter.Table[] getTable(
    ) {
        org.opennms.netmgt.config.filter.Table[] array = new org.opennms.netmgt.config.filter.Table[0];
        return (org.opennms.netmgt.config.filter.Table[]) this._tableList.toArray(array);
    }

    /**
     * Method getTableCollection.Returns a reference to
     * '_tableList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.filter.Table> getTableCollection(
    ) {
        return this._tableList;
    }

    /**
     * Method getTableCount.
     *
     * @return the size of this collection
     */
    public int getTableCount(
    ) {
        return this._tableList.size();
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
        if (_tableList != null) {
           result = 37 * result + _tableList.hashCode();
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
     * Method iterateTable.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.filter.Table> iterateTable(
    ) {
        return this._tableList.iterator();
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
    public void removeAllTable(
    ) {
        this._tableList.clear();
    }

    /**
     * Method removeTable.
     *
     * @param vTable
     * @return true if the object was removed from the collection.
     */
    public boolean removeTable(
            final org.opennms.netmgt.config.filter.Table vTable) {
        boolean removed = _tableList.remove(vTable);
        return removed;
    }

    /**
     * Method removeTableAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.filter.Table removeTableAt(
            final int index) {
        java.lang.Object obj = this._tableList.remove(index);
        return (org.opennms.netmgt.config.filter.Table) obj;
    }

    /**
     *
     *
     * @param index
     * @param vTable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTable(
            final int index,
            final org.opennms.netmgt.config.filter.Table vTable)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tableList.size()) {
            throw new IndexOutOfBoundsException("setTable: Index value '" + index + "' not in range [0.." + (this._tableList.size() - 1) + "]");
        }

        this._tableList.set(index, vTable);
    }

    /**
     *
     *
     * @param vTableArray
     */
    public void setTable(
            final org.opennms.netmgt.config.filter.Table[] vTableArray) {
        //-- copy array
        _tableList.clear();

        for (int i = 0; i < vTableArray.length; i++) {
                this._tableList.add(vTableArray[i]);
        }
    }

    /**
     * Sets the value of '_tableList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vTableList the Vector to copy.
     */
    public void setTable(
            final java.util.List<org.opennms.netmgt.config.filter.Table> vTableList) {
        // copy vector
        this._tableList.clear();

        this._tableList.addAll(vTableList);
    }

    /**
     * Sets the value of '_tableList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param tableList the Vector to set.
     */
    public void setTableCollection(
            final java.util.List<org.opennms.netmgt.config.filter.Table> tableList) {
        this._tableList = tableList;
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
     * org.opennms.netmgt.config.filter.DatabaseSchema
     */
    public static org.opennms.netmgt.config.filter.DatabaseSchema unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.filter.DatabaseSchema) Unmarshaller.unmarshal(org.opennms.netmgt.config.filter.DatabaseSchema.class, reader);
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
