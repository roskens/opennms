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
 * Class Table.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="table")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("database-schema.xsd")
@SuppressWarnings("all") public class Table implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _visible.
     */
    private java.lang.String _visible = "true";

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _key.
     */
    private java.lang.String _key = "secondary";

    /**
     * Field _joinList.
     */
    private java.util.List<org.opennms.netmgt.config.filter.Join> _joinList;

    /**
     * Field _columnList.
     */
    private java.util.List<org.opennms.netmgt.config.filter.Column> _columnList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Table() {
        super();
        setVisible("true");
        setKey("secondary");
        this._joinList = new java.util.ArrayList<org.opennms.netmgt.config.filter.Join>();
        this._columnList = new java.util.ArrayList<org.opennms.netmgt.config.filter.Column>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColumn(
            final org.opennms.netmgt.config.filter.Column vColumn)
    throws java.lang.IndexOutOfBoundsException {
        this._columnList.add(vColumn);
    }

    /**
     *
     *
     * @param index
     * @param vColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColumn(
            final int index,
            final org.opennms.netmgt.config.filter.Column vColumn)
    throws java.lang.IndexOutOfBoundsException {
        this._columnList.add(index, vColumn);
    }

    /**
     *
     *
     * @param vJoin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJoin(
            final org.opennms.netmgt.config.filter.Join vJoin)
    throws java.lang.IndexOutOfBoundsException {
        this._joinList.add(vJoin);
    }

    /**
     *
     *
     * @param index
     * @param vJoin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJoin(
            final int index,
            final org.opennms.netmgt.config.filter.Join vJoin)
    throws java.lang.IndexOutOfBoundsException {
        this._joinList.add(index, vJoin);
    }

    /**
     * Method enumerateColumn.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.filter.Column> enumerateColumn(
    ) {
        return java.util.Collections.enumeration(this._columnList);
    }

    /**
     * Method enumerateJoin.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.filter.Join> enumerateJoin(
    ) {
        return java.util.Collections.enumeration(this._joinList);
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

        if (obj instanceof Table) {

            Table temp = (Table)obj;
            if (this._visible != null) {
                if (temp._visible == null) return false;
                else if (!(this._visible.equals(temp._visible)))
                    return false;
            }
            else if (temp._visible != null)
                return false;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._key != null) {
                if (temp._key == null) return false;
                else if (!(this._key.equals(temp._key)))
                    return false;
            }
            else if (temp._key != null)
                return false;
            if (this._joinList != null) {
                if (temp._joinList == null) return false;
                else if (!(this._joinList.equals(temp._joinList)))
                    return false;
            }
            else if (temp._joinList != null)
                return false;
            if (this._columnList != null) {
                if (temp._columnList == null) return false;
                else if (!(this._columnList.equals(temp._columnList)))
                    return false;
            }
            else if (temp._columnList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getColumn.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.filter.Column at the given index
     */
    public org.opennms.netmgt.config.filter.Column getColumn(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._columnList.size()) {
            throw new IndexOutOfBoundsException("getColumn: Index value '" + index + "' not in range [0.." + (this._columnList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.filter.Column) _columnList.get(index);
    }

    /**
     * Method getColumn.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.filter.Column[] getColumn(
    ) {
        org.opennms.netmgt.config.filter.Column[] array = new org.opennms.netmgt.config.filter.Column[0];
        return (org.opennms.netmgt.config.filter.Column[]) this._columnList.toArray(array);
    }

    /**
     * Method getColumnCollection.Returns a reference to
     * '_columnList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.filter.Column> getColumnCollection(
    ) {
        return this._columnList;
    }

    /**
     * Method getColumnCount.
     *
     * @return the size of this collection
     */
    public int getColumnCount(
    ) {
        return this._columnList.size();
    }

    /**
     * Method getJoin.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.filter.Join at the given index
     */
    public org.opennms.netmgt.config.filter.Join getJoin(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._joinList.size()) {
            throw new IndexOutOfBoundsException("getJoin: Index value '" + index + "' not in range [0.." + (this._joinList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.filter.Join) _joinList.get(index);
    }

    /**
     * Method getJoin.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.filter.Join[] getJoin(
    ) {
        org.opennms.netmgt.config.filter.Join[] array = new org.opennms.netmgt.config.filter.Join[0];
        return (org.opennms.netmgt.config.filter.Join[]) this._joinList.toArray(array);
    }

    /**
     * Method getJoinCollection.Returns a reference to '_joinList'.
     * No type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.filter.Join> getJoinCollection(
    ) {
        return this._joinList;
    }

    /**
     * Method getJoinCount.
     *
     * @return the size of this collection
     */
    public int getJoinCount(
    ) {
        return this._joinList.size();
    }

    /**
     * Returns the value of field 'key'.
     *
     * @return the value of field 'Key'.
     */
    public java.lang.String getKey(
    ) {
        return this._key;
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
     * Returns the value of field 'visible'.
     *
     * @return the value of field 'Visible'.
     */
    public java.lang.String getVisible(
    ) {
        return this._visible;
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
        if (_visible != null) {
           result = 37 * result + _visible.hashCode();
        }
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_key != null) {
           result = 37 * result + _key.hashCode();
        }
        if (_joinList != null) {
           result = 37 * result + _joinList.hashCode();
        }
        if (_columnList != null) {
           result = 37 * result + _columnList.hashCode();
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
     * Method iterateColumn.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.filter.Column> iterateColumn(
    ) {
        return this._columnList.iterator();
    }

    /**
     * Method iterateJoin.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.filter.Join> iterateJoin(
    ) {
        return this._joinList.iterator();
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
    public void removeAllColumn(
    ) {
        this._columnList.clear();
    }

    /**
     */
    public void removeAllJoin(
    ) {
        this._joinList.clear();
    }

    /**
     * Method removeColumn.
     *
     * @param vColumn
     * @return true if the object was removed from the collection.
     */
    public boolean removeColumn(
            final org.opennms.netmgt.config.filter.Column vColumn) {
        boolean removed = _columnList.remove(vColumn);
        return removed;
    }

    /**
     * Method removeColumnAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.filter.Column removeColumnAt(
            final int index) {
        java.lang.Object obj = this._columnList.remove(index);
        return (org.opennms.netmgt.config.filter.Column) obj;
    }

    /**
     * Method removeJoin.
     *
     * @param vJoin
     * @return true if the object was removed from the collection.
     */
    public boolean removeJoin(
            final org.opennms.netmgt.config.filter.Join vJoin) {
        boolean removed = _joinList.remove(vJoin);
        return removed;
    }

    /**
     * Method removeJoinAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.filter.Join removeJoinAt(
            final int index) {
        java.lang.Object obj = this._joinList.remove(index);
        return (org.opennms.netmgt.config.filter.Join) obj;
    }

    /**
     *
     *
     * @param index
     * @param vColumn
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setColumn(
            final int index,
            final org.opennms.netmgt.config.filter.Column vColumn)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._columnList.size()) {
            throw new IndexOutOfBoundsException("setColumn: Index value '" + index + "' not in range [0.." + (this._columnList.size() - 1) + "]");
        }

        this._columnList.set(index, vColumn);
    }

    /**
     *
     *
     * @param vColumnArray
     */
    public void setColumn(
            final org.opennms.netmgt.config.filter.Column[] vColumnArray) {
        //-- copy array
        _columnList.clear();

        for (int i = 0; i < vColumnArray.length; i++) {
                this._columnList.add(vColumnArray[i]);
        }
    }

    /**
     * Sets the value of '_columnList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vColumnList the Vector to copy.
     */
    public void setColumn(
            final java.util.List<org.opennms.netmgt.config.filter.Column> vColumnList) {
        // copy vector
        this._columnList.clear();

        this._columnList.addAll(vColumnList);
    }

    /**
     * Sets the value of '_columnList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param columnList the Vector to set.
     */
    public void setColumnCollection(
            final java.util.List<org.opennms.netmgt.config.filter.Column> columnList) {
        this._columnList = columnList;
    }

    /**
     *
     *
     * @param index
     * @param vJoin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJoin(
            final int index,
            final org.opennms.netmgt.config.filter.Join vJoin)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._joinList.size()) {
            throw new IndexOutOfBoundsException("setJoin: Index value '" + index + "' not in range [0.." + (this._joinList.size() - 1) + "]");
        }

        this._joinList.set(index, vJoin);
    }

    /**
     *
     *
     * @param vJoinArray
     */
    public void setJoin(
            final org.opennms.netmgt.config.filter.Join[] vJoinArray) {
        //-- copy array
        _joinList.clear();

        for (int i = 0; i < vJoinArray.length; i++) {
                this._joinList.add(vJoinArray[i]);
        }
    }

    /**
     * Sets the value of '_joinList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vJoinList the Vector to copy.
     */
    public void setJoin(
            final java.util.List<org.opennms.netmgt.config.filter.Join> vJoinList) {
        // copy vector
        this._joinList.clear();

        this._joinList.addAll(vJoinList);
    }

    /**
     * Sets the value of '_joinList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param joinList the Vector to set.
     */
    public void setJoinCollection(
            final java.util.List<org.opennms.netmgt.config.filter.Join> joinList) {
        this._joinList = joinList;
    }

    /**
     * Sets the value of field 'key'.
     *
     * @param key the value of field 'key'.
     */
    public void setKey(
            final java.lang.String key) {
        this._key = key;
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
     * Sets the value of field 'visible'.
     *
     * @param visible the value of field 'visible'.
     */
    public void setVisible(
            final java.lang.String visible) {
        this._visible = visible;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.filter.Tabl
     */
    public static org.opennms.netmgt.config.filter.Table unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.filter.Table) Unmarshaller.unmarshal(org.opennms.netmgt.config.filter.Table.class, reader);
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
