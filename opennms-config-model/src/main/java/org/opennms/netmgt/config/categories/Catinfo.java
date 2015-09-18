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
package org.opennms.netmgt.config.categories;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the categories.xml configuration
 *  file.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "catinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("categories.xsd")
@SuppressWarnings("all")
public class Catinfo implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Header for this file.
     */
    @XmlElement(name = "header")
    private org.opennms.netmgt.config.categories.Header _header;

    /**
     * The category groups.
     */
    @XmlElement(name = "categorygroup")
    private java.util.List<org.opennms.netmgt.config.categories.Categorygroup> _categorygroupList;

      //----------------/
    //- Constructors -/
    //----------------/
    public Catinfo() {
        super();
        this._categorygroupList = new java.util.ArrayList<org.opennms.netmgt.config.categories.Categorygroup>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vCategorygroup
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategorygroup(
            final org.opennms.netmgt.config.categories.Categorygroup vCategorygroup)
            throws java.lang.IndexOutOfBoundsException {
        this._categorygroupList.add(vCategorygroup);
    }

    /**
     *
     *
     * @param index
     * @param vCategorygroup
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategorygroup(
            final int index,
            final org.opennms.netmgt.config.categories.Categorygroup vCategorygroup)
            throws java.lang.IndexOutOfBoundsException {
        this._categorygroupList.add(index, vCategorygroup);
    }

    /**
     * Method enumerateCategorygroup.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.categories.Categorygroup> enumerateCategorygroup() {
        return java.util.Collections.enumeration(this._categorygroupList);
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

        if (obj instanceof Catinfo) {

            Catinfo temp = (Catinfo) obj;
            if (this._header != null) {
                if (temp._header == null) {
                    return false;
                } else if (!(this._header.equals(temp._header))) {
                    return false;
                }
            } else if (temp._header != null) {
                return false;
            }
            if (this._categorygroupList != null) {
                if (temp._categorygroupList == null) {
                    return false;
                } else if (!(this._categorygroupList.equals(temp._categorygroupList))) {
                    return false;
                }
            } else if (temp._categorygroupList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Method getCategorygroup.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.categories.Categorygroup at the
     * given index
     */
    public org.opennms.netmgt.config.categories.Categorygroup getCategorygroup(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categorygroupList.size()) {
            throw new IndexOutOfBoundsException("getCategorygroup: Index value '" + index + "' not in range [0.." + (this._categorygroupList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.categories.Categorygroup) _categorygroupList.get(index);
    }

    /**
     * Method getCategorygroup.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.categories.Categorygroup[] getCategorygroup() {
        org.opennms.netmgt.config.categories.Categorygroup[] array = new org.opennms.netmgt.config.categories.Categorygroup[0];
        return (org.opennms.netmgt.config.categories.Categorygroup[]) this._categorygroupList.toArray(array);
    }

    /**
     * Method getCategorygroupCollection.Returns a reference to
     * '_categorygroupList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.categories.Categorygroup> getCategorygroupCollection() {
        return this._categorygroupList;
    }

    /**
     * Method getCategorygroupCount.
     *
     * @return the size of this collection
     */
    public int getCategorygroupCount() {
        return this._categorygroupList.size();
    }

    /**
     * Returns the value of field 'header'. The field 'header' has
     * the following description: Header for this file.
     *
     * @return the value of field 'Header'.
     */
    public org.opennms.netmgt.config.categories.Header getHeader() {
        return this._header;
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
        if (_categorygroupList != null) {
            result = 37 * result + _categorygroupList.hashCode();
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
     * Method iterateCategorygroup.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.categories.Categorygroup> iterateCategorygroup() {
        return this._categorygroupList.iterator();
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
    public void removeAllCategorygroup() {
        this._categorygroupList.clear();
    }

    /**
     * Method removeCategorygroup.
     *
     * @param vCategorygroup
     * @return true if the object was removed from the collection.
     */
    public boolean removeCategorygroup(
            final org.opennms.netmgt.config.categories.Categorygroup vCategorygroup) {
        boolean removed = _categorygroupList.remove(vCategorygroup);
        return removed;
    }

    /**
     * Method removeCategorygroupAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.categories.Categorygroup removeCategorygroupAt(
            final int index) {
        java.lang.Object obj = this._categorygroupList.remove(index);
        return (org.opennms.netmgt.config.categories.Categorygroup) obj;
    }

    /**
     *
     *
     * @param index
     * @param vCategorygroup
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCategorygroup(
            final int index,
            final org.opennms.netmgt.config.categories.Categorygroup vCategorygroup)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categorygroupList.size()) {
            throw new IndexOutOfBoundsException("setCategorygroup: Index value '" + index + "' not in range [0.." + (this._categorygroupList.size() - 1) + "]");
        }

        this._categorygroupList.set(index, vCategorygroup);
    }

    /**
     *
     *
     * @param vCategorygroupArray
     */
    public void setCategorygroup(
            final org.opennms.netmgt.config.categories.Categorygroup[] vCategorygroupArray) {
        //-- copy array
        _categorygroupList.clear();

        for (int i = 0; i < vCategorygroupArray.length; i++) {
            this._categorygroupList.add(vCategorygroupArray[i]);
        }
    }

    /**
     * Sets the value of '_categorygroupList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vCategorygroupList the Vector to copy.
     */
    public void setCategorygroup(
            final java.util.List<org.opennms.netmgt.config.categories.Categorygroup> vCategorygroupList) {
        // copy vector
        this._categorygroupList.clear();

        this._categorygroupList.addAll(vCategorygroupList);
    }

    /**
     * Sets the value of '_categorygroupList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param categorygroupList the Vector to set.
     */
    public void setCategorygroupCollection(
            final java.util.List<org.opennms.netmgt.config.categories.Categorygroup> categorygroupList) {
        this._categorygroupList = categorygroupList;
    }

    /**
     * Sets the value of field 'header'. The field 'header' has the
     * following description: Header for this file.
     *
     * @param header the value of field 'header'.
     */
    public void setHeader(
            final org.opennms.netmgt.config.categories.Header header) {
        this._header = header;
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
     * org.opennms.netmgt.config.categories.Catinfo
     */
    public static org.opennms.netmgt.config.categories.Catinfo unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.categories.Catinfo) Unmarshaller.unmarshal(org.opennms.netmgt.config.categories.Catinfo.class, reader);
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
