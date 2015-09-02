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
package org.opennms.netmgt.config.users;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Users.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="users")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("users.xsd")
@SuppressWarnings("all") public class Users implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _userList.
     */
    private java.util.List<org.opennms.netmgt.config.users.User> _userList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Users() {
        super();
        this._userList = new java.util.ArrayList<org.opennms.netmgt.config.users.User>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vUser
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUser(
            final org.opennms.netmgt.config.users.User vUser)
    throws java.lang.IndexOutOfBoundsException {
        this._userList.add(vUser);
    }

    /**
     *
     *
     * @param index
     * @param vUser
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUser(
            final int index,
            final org.opennms.netmgt.config.users.User vUser)
    throws java.lang.IndexOutOfBoundsException {
        this._userList.add(index, vUser);
    }

    /**
     * Method enumerateUser.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.users.User> enumerateUser(
    ) {
        return java.util.Collections.enumeration(this._userList);
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

        if (obj instanceof Users) {

            Users temp = (Users)obj;
            if (this._userList != null) {
                if (temp._userList == null) return false;
                else if (!(this._userList.equals(temp._userList)))
                    return false;
            }
            else if (temp._userList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getUser.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.users.User at the given index
     */
    public org.opennms.netmgt.config.users.User getUser(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._userList.size()) {
            throw new IndexOutOfBoundsException("getUser: Index value '" + index + "' not in range [0.." + (this._userList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.users.User) _userList.get(index);
    }

    /**
     * Method getUser.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.users.User[] getUser(
    ) {
        org.opennms.netmgt.config.users.User[] array = new org.opennms.netmgt.config.users.User[0];
        return (org.opennms.netmgt.config.users.User[]) this._userList.toArray(array);
    }

    /**
     * Method getUserCollection.Returns a reference to '_userList'.
     * No type checking is performed on any modifications to the
     * Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.users.User> getUserCollection(
    ) {
        return this._userList;
    }

    /**
     * Method getUserCount.
     *
     * @return the size of this collection
     */
    public int getUserCount(
    ) {
        return this._userList.size();
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
        if (_userList != null) {
           result = 37 * result + _userList.hashCode();
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
     * Method iterateUser.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.users.User> iterateUser(
    ) {
        return this._userList.iterator();
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
    public void removeAllUser(
    ) {
        this._userList.clear();
    }

    /**
     * Method removeUser.
     *
     * @param vUser
     * @return true if the object was removed from the collection.
     */
    public boolean removeUser(
            final org.opennms.netmgt.config.users.User vUser) {
        boolean removed = _userList.remove(vUser);
        return removed;
    }

    /**
     * Method removeUserAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.users.User removeUserAt(
            final int index) {
        java.lang.Object obj = this._userList.remove(index);
        return (org.opennms.netmgt.config.users.User) obj;
    }

    /**
     *
     *
     * @param index
     * @param vUser
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUser(
            final int index,
            final org.opennms.netmgt.config.users.User vUser)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._userList.size()) {
            throw new IndexOutOfBoundsException("setUser: Index value '" + index + "' not in range [0.." + (this._userList.size() - 1) + "]");
        }

        this._userList.set(index, vUser);
    }

    /**
     *
     *
     * @param vUserArray
     */
    public void setUser(
            final org.opennms.netmgt.config.users.User[] vUserArray) {
        //-- copy array
        _userList.clear();

        for (int i = 0; i < vUserArray.length; i++) {
                this._userList.add(vUserArray[i]);
        }
    }

    /**
     * Sets the value of '_userList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vUserList the Vector to copy.
     */
    public void setUser(
            final java.util.List<org.opennms.netmgt.config.users.User> vUserList) {
        // copy vector
        this._userList.clear();

        this._userList.addAll(vUserList);
    }

    /**
     * Sets the value of '_userList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param userList the Vector to set.
     */
    public void setUserCollection(
            final java.util.List<org.opennms.netmgt.config.users.User> userList) {
        this._userList = userList;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.users.Users
     */
    public static org.opennms.netmgt.config.users.Users unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.users.Users) Unmarshaller.unmarshal(org.opennms.netmgt.config.users.Users.class, reader);
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
