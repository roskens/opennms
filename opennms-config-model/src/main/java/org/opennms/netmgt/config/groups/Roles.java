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
package org.opennms.netmgt.config.groups;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Roles.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="roles")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("groups.xsd")
@SuppressWarnings("all") public class Roles implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _roleList.
     */
    private java.util.List<org.opennms.netmgt.config.groups.Role> _roleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Roles() {
        super();
        this._roleList = new java.util.ArrayList<org.opennms.netmgt.config.groups.Role>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRole(
            final org.opennms.netmgt.config.groups.Role vRole)
    throws java.lang.IndexOutOfBoundsException {
        this._roleList.add(vRole);
    }

    /**
     *
     *
     * @param index
     * @param vRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRole(
            final int index,
            final org.opennms.netmgt.config.groups.Role vRole)
    throws java.lang.IndexOutOfBoundsException {
        this._roleList.add(index, vRole);
    }

    /**
     * Method enumerateRole.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.groups.Role> enumerateRole(
    ) {
        return java.util.Collections.enumeration(this._roleList);
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

        if (obj instanceof Roles) {

            Roles temp = (Roles)obj;
            if (this._roleList != null) {
                if (temp._roleList == null) return false;
                else if (!(this._roleList.equals(temp._roleList)))
                    return false;
            }
            else if (temp._roleList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getRole.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.groups.Role at the given index
     */
    public org.opennms.netmgt.config.groups.Role getRole(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._roleList.size()) {
            throw new IndexOutOfBoundsException("getRole: Index value '" + index + "' not in range [0.." + (this._roleList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.groups.Role) _roleList.get(index);
    }

    /**
     * Method getRole.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.groups.Role[] getRole(
    ) {
        org.opennms.netmgt.config.groups.Role[] array = new org.opennms.netmgt.config.groups.Role[0];
        return (org.opennms.netmgt.config.groups.Role[]) this._roleList.toArray(array);
    }

    /**
     * Method getRoleCollection.Returns a reference to '_roleList'.
     * No type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.groups.Role> getRoleCollection(
    ) {
        return this._roleList;
    }

    /**
     * Method getRoleCount.
     *
     * @return the size of this collection
     */
    public int getRoleCount(
    ) {
        return this._roleList.size();
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
        if (_roleList != null) {
           result = 37 * result + _roleList.hashCode();
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
     * Method iterateRole.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.groups.Role> iterateRole(
    ) {
        return this._roleList.iterator();
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
    public void removeAllRole(
    ) {
        this._roleList.clear();
    }

    /**
     * Method removeRole.
     *
     * @param vRole
     * @return true if the object was removed from the collection.
     */
    public boolean removeRole(
            final org.opennms.netmgt.config.groups.Role vRole) {
        boolean removed = _roleList.remove(vRole);
        return removed;
    }

    /**
     * Method removeRoleAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.groups.Role removeRoleAt(
            final int index) {
        java.lang.Object obj = this._roleList.remove(index);
        return (org.opennms.netmgt.config.groups.Role) obj;
    }

    /**
     *
     *
     * @param index
     * @param vRole
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRole(
            final int index,
            final org.opennms.netmgt.config.groups.Role vRole)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._roleList.size()) {
            throw new IndexOutOfBoundsException("setRole: Index value '" + index + "' not in range [0.." + (this._roleList.size() - 1) + "]");
        }

        this._roleList.set(index, vRole);
    }

    /**
     *
     *
     * @param vRoleArray
     */
    public void setRole(
            final org.opennms.netmgt.config.groups.Role[] vRoleArray) {
        //-- copy array
        _roleList.clear();

        for (int i = 0; i < vRoleArray.length; i++) {
                this._roleList.add(vRoleArray[i]);
        }
    }

    /**
     * Sets the value of '_roleList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vRoleList the Vector to copy.
     */
    public void setRole(
            final java.util.List<org.opennms.netmgt.config.groups.Role> vRoleList) {
        // copy vector
        this._roleList.clear();

        this._roleList.addAll(vRoleList);
    }

    /**
     * Sets the value of '_roleList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param roleList the Vector to set.
     */
    public void setRoleCollection(
            final java.util.List<org.opennms.netmgt.config.groups.Role> roleList) {
        this._roleList = roleList;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.groups.Role
     */
    public static org.opennms.netmgt.config.groups.Roles unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.groups.Roles) Unmarshaller.unmarshal(org.opennms.netmgt.config.groups.Roles.class, reader);
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
