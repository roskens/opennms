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
 * Class Rows.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "rows")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("site-status-views.xsd")
@SuppressWarnings("all")
public class Rows implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _rowDefList.
     */
    @XmlElement(name = "row-def")
    private java.util.List<org.opennms.netmgt.config.siteStatusViews.RowDef> _rowDefList;

      //----------------/
    //- Constructors -/
    //----------------/
    public Rows() {
        super();
        this._rowDefList = new java.util.ArrayList<org.opennms.netmgt.config.siteStatusViews.RowDef>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vRowDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRowDef(
            final org.opennms.netmgt.config.siteStatusViews.RowDef vRowDef)
            throws java.lang.IndexOutOfBoundsException {
        this._rowDefList.add(vRowDef);
    }

    /**
     *
     *
     * @param index
     * @param vRowDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRowDef(
            final int index,
            final org.opennms.netmgt.config.siteStatusViews.RowDef vRowDef)
            throws java.lang.IndexOutOfBoundsException {
        this._rowDefList.add(index, vRowDef);
    }

    /**
     * Method enumerateRowDef.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.siteStatusViews.RowDef> enumerateRowDef() {
        return java.util.Collections.enumeration(this._rowDefList);
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
        if (this == obj) {
            return true;
        }

        if (obj instanceof Rows) {

            Rows temp = (Rows) obj;
            if (this._rowDefList != null) {
                if (temp._rowDefList == null) {
                    return false;
                } else if (!(this._rowDefList.equals(temp._rowDefList))) {
                    return false;
                }
            } else if (temp._rowDefList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Method getRowDef.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.siteStatusViews.RowDef at the
     * given index
     */
    public org.opennms.netmgt.config.siteStatusViews.RowDef getRowDef(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rowDefList.size()) {
            throw new IndexOutOfBoundsException("getRowDef: Index value '" + index + "' not in range [0.." + (this._rowDefList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.siteStatusViews.RowDef) _rowDefList.get(index);
    }

    /**
     * Method getRowDef.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.siteStatusViews.RowDef[] getRowDef() {
        org.opennms.netmgt.config.siteStatusViews.RowDef[] array = new org.opennms.netmgt.config.siteStatusViews.RowDef[0];
        return (org.opennms.netmgt.config.siteStatusViews.RowDef[]) this._rowDefList.toArray(array);
    }

    /**
     * Method getRowDefCollection.Returns a reference to
     * '_rowDefList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.siteStatusViews.RowDef> getRowDefCollection() {
        return this._rowDefList;
    }

    /**
     * Method getRowDefCount.
     *
     * @return the size of this collection
     */
    public int getRowDefCount() {
        return this._rowDefList.size();
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
        if (_rowDefList != null) {
            result = 37 * result + _rowDefList.hashCode();
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
     * Method iterateRowDef.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.siteStatusViews.RowDef> iterateRowDef() {
        return this._rowDefList.iterator();
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
    public void removeAllRowDef() {
        this._rowDefList.clear();
    }

    /**
     * Method removeRowDef.
     *
     * @param vRowDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeRowDef(
            final org.opennms.netmgt.config.siteStatusViews.RowDef vRowDef) {
        boolean removed = _rowDefList.remove(vRowDef);
        return removed;
    }

    /**
     * Method removeRowDefAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.siteStatusViews.RowDef removeRowDefAt(
            final int index) {
        java.lang.Object obj = this._rowDefList.remove(index);
        return (org.opennms.netmgt.config.siteStatusViews.RowDef) obj;
    }

    /**
     *
     *
     * @param index
     * @param vRowDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRowDef(
            final int index,
            final org.opennms.netmgt.config.siteStatusViews.RowDef vRowDef)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rowDefList.size()) {
            throw new IndexOutOfBoundsException("setRowDef: Index value '" + index + "' not in range [0.." + (this._rowDefList.size() - 1) + "]");
        }

        this._rowDefList.set(index, vRowDef);
    }

    /**
     *
     *
     * @param vRowDefArray
     */
    public void setRowDef(
            final org.opennms.netmgt.config.siteStatusViews.RowDef[] vRowDefArray) {
        //-- copy array
        _rowDefList.clear();

        for (int i = 0; i < vRowDefArray.length; i++) {
            this._rowDefList.add(vRowDefArray[i]);
        }
    }

    /**
     * Sets the value of '_rowDefList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vRowDefList the Vector to copy.
     */
    public void setRowDef(
            final java.util.List<org.opennms.netmgt.config.siteStatusViews.RowDef> vRowDefList) {
        // copy vector
        this._rowDefList.clear();

        this._rowDefList.addAll(vRowDefList);
    }

    /**
     * Sets the value of '_rowDefList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param rowDefList the Vector to set.
     */
    public void setRowDefCollection(
            final java.util.List<org.opennms.netmgt.config.siteStatusViews.RowDef> rowDefList) {
        this._rowDefList = rowDefList;
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
     * org.opennms.netmgt.config.siteStatusViews.Rows
     */
    public static org.opennms.netmgt.config.siteStatusViews.Rows unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.siteStatusViews.Rows) Unmarshaller.unmarshal(org.opennms.netmgt.config.siteStatusViews.Rows.class, reader);
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
