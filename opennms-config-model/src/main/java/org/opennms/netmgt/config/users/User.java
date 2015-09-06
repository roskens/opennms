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
 * Class User.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("users.xsd")
@SuppressWarnings("all") public class User implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _readOnly.
     */
    @XmlAttribute(name="read-only")
    private Boolean _readOnly;
    private static final Boolean DEFAULT_READ_ONLY = false;

    /**
     * Field _userId.
     */
    @XmlElement(name="user-id")
    private java.lang.String _userId;

    /**
     * Field _fullName.
     */
    @XmlElement(name="full-name")
    private java.lang.String _fullName;

    /**
     * Field _userComments.
     */
    @XmlElement(name="user-comments")
    private java.lang.String _userComments;

    /**
     * Field _password.
     */
    @XmlElement(name="password")
    private org.opennms.netmgt.config.users.Password _password;

    /**
     * Field _contactList.
     */
    @XmlElement(name="contact")
    private java.util.List<org.opennms.netmgt.config.users.Contact> _contactList;

    /**
     * Field _dutyScheduleList.
     */
    @XmlElement(name="duty-schedule")
    private java.util.List<java.lang.String> _dutyScheduleList;

    /**
     * Field _tuiPin.
     */
    @XmlElement(name="tui-pin")
    private java.lang.String _tuiPin;


      //----------------/
     //- Constructors -/
    //----------------/

    public User() {
        super();
        this._contactList = new java.util.ArrayList<org.opennms.netmgt.config.users.Contact>();
        this._dutyScheduleList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vContact
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContact(
            final org.opennms.netmgt.config.users.Contact vContact)
    throws java.lang.IndexOutOfBoundsException {
        this._contactList.add(vContact);
    }

    /**
     *
     *
     * @param index
     * @param vContact
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContact(
            final int index,
            final org.opennms.netmgt.config.users.Contact vContact)
    throws java.lang.IndexOutOfBoundsException {
        this._contactList.add(index, vContact);
    }

    /**
     *
     *
     * @param vDutySchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDutySchedule(
            final java.lang.String vDutySchedule)
    throws java.lang.IndexOutOfBoundsException {
        this._dutyScheduleList.add(vDutySchedule);
    }

    /**
     *
     *
     * @param index
     * @param vDutySchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDutySchedule(
            final int index,
            final java.lang.String vDutySchedule)
    throws java.lang.IndexOutOfBoundsException {
        this._dutyScheduleList.add(index, vDutySchedule);
    }

    /**
     */
    public void deleteReadOnly(
    ) {
        this._readOnly = null;
    }

    /**
     * Method enumerateContact.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.users.Contact> enumerateContact(
    ) {
        return java.util.Collections.enumeration(this._contactList);
    }

    /**
     * Method enumerateDutySchedule.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateDutySchedule(
    ) {
        return java.util.Collections.enumeration(this._dutyScheduleList);
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

        if (obj instanceof User) {

            User temp = (User)obj;
            if (this._readOnly != null) {
                if (temp._readOnly == null) return false;
                else if (!(this._readOnly.equals(temp._readOnly)))
                    return false;
            }
            else if (temp._readOnly != null)
                return false;
            if (this._userId != null) {
                if (temp._userId == null) return false;
                else if (!(this._userId.equals(temp._userId)))
                    return false;
            }
            else if (temp._userId != null)
                return false;
            if (this._fullName != null) {
                if (temp._fullName == null) return false;
                else if (!(this._fullName.equals(temp._fullName)))
                    return false;
            }
            else if (temp._fullName != null)
                return false;
            if (this._userComments != null) {
                if (temp._userComments == null) return false;
                else if (!(this._userComments.equals(temp._userComments)))
                    return false;
            }
            else if (temp._userComments != null)
                return false;
            if (this._password != null) {
                if (temp._password == null) return false;
                else if (!(this._password.equals(temp._password)))
                    return false;
            }
            else if (temp._password != null)
                return false;
            if (this._contactList != null) {
                if (temp._contactList == null) return false;
                else if (!(this._contactList.equals(temp._contactList)))
                    return false;
            }
            else if (temp._contactList != null)
                return false;
            if (this._dutyScheduleList != null) {
                if (temp._dutyScheduleList == null) return false;
                else if (!(this._dutyScheduleList.equals(temp._dutyScheduleList)))
                    return false;
            }
            else if (temp._dutyScheduleList != null)
                return false;
            if (this._tuiPin != null) {
                if (temp._tuiPin == null) return false;
                else if (!(this._tuiPin.equals(temp._tuiPin)))
                    return false;
            }
            else if (temp._tuiPin != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getContact.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.users.Contact at the given index
     */
    public org.opennms.netmgt.config.users.Contact getContact(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contactList.size()) {
            throw new IndexOutOfBoundsException("getContact: Index value '" + index + "' not in range [0.." + (this._contactList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.users.Contact) _contactList.get(index);
    }

    /**
     * Method getContact.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.users.Contact[] getContact(
    ) {
        org.opennms.netmgt.config.users.Contact[] array = new org.opennms.netmgt.config.users.Contact[0];
        return (org.opennms.netmgt.config.users.Contact[]) this._contactList.toArray(array);
    }

    /**
     * Method getContactCollection.Returns a reference to
     * '_contactList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.users.Contact> getContactCollection(
    ) {
        return this._contactList;
    }

    /**
     * Method getContactCount.
     *
     * @return the size of this collection
     */
    public int getContactCount(
    ) {
        return this._contactList.size();
    }

    /**
     * Method getDutySchedule.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getDutySchedule(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dutyScheduleList.size()) {
            throw new IndexOutOfBoundsException("getDutySchedule: Index value '" + index + "' not in range [0.." + (this._dutyScheduleList.size() - 1) + "]");
        }

        return (java.lang.String) _dutyScheduleList.get(index);
    }

    /**
     * Method getDutySchedule.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getDutySchedule(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._dutyScheduleList.toArray(array);
    }

    /**
     * Method getDutyScheduleCollection.Returns a reference to
     * '_dutyScheduleList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getDutyScheduleCollection(
    ) {
        return this._dutyScheduleList;
    }

    /**
     * Method getDutyScheduleCount.
     *
     * @return the size of this collection
     */
    public int getDutyScheduleCount(
    ) {
        return this._dutyScheduleList.size();
    }

    /**
     * Returns the value of field 'fullName'.
     *
     * @return the value of field 'FullName'.
     */
    public java.lang.String getFullName(
    ) {
        return this._fullName;
    }

    /**
     * Returns the value of field 'password'.
     *
     * @return the value of field 'Password'.
     */
    public org.opennms.netmgt.config.users.Password getPassword(
    ) {
        return this._password;
    }

    /**
     * Returns the value of field 'readOnly'.
     *
     * @return the value of field 'ReadOnly'.
     */
    public Boolean getReadOnly(
    ) {
        return this._readOnly == null ? DEFAULT_READ_ONLY : this._readOnly;
    }

    /**
     * Returns the value of field 'tuiPin'.
     *
     * @return the value of field 'TuiPin'.
     */
    public java.lang.String getTuiPin(
    ) {
        return this._tuiPin;
    }

    /**
     * Returns the value of field 'userComments'.
     *
     * @return the value of field 'UserComments'.
     */
    public java.lang.String getUserComments(
    ) {
        return this._userComments;
    }

    /**
     * Returns the value of field 'userId'.
     *
     * @return the value of field 'UserId'.
     */
    public java.lang.String getUserId(
    ) {
        return this._userId;
    }

    /**
     * Method hasReadOnly.
     *
     * @return true if at least one ReadOnly has been added
     */
    public boolean hasReadOnly(
    ) {
        return this._readOnly != null;
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
        result = 37 * result + (_readOnly?0:1);
        if (_userId != null) {
           result = 37 * result + _userId.hashCode();
        }
        if (_fullName != null) {
           result = 37 * result + _fullName.hashCode();
        }
        if (_userComments != null) {
           result = 37 * result + _userComments.hashCode();
        }
        if (_password != null) {
           result = 37 * result + _password.hashCode();
        }
        if (_contactList != null) {
           result = 37 * result + _contactList.hashCode();
        }
        if (_dutyScheduleList != null) {
           result = 37 * result + _dutyScheduleList.hashCode();
        }
        if (_tuiPin != null) {
           result = 37 * result + _tuiPin.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'readOnly'.
     *
     * @return the value of field 'ReadOnly'.
     */
    public boolean isReadOnly(
    ) {
        return this._readOnly;
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
     * Method iterateContact.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.users.Contact> iterateContact(
    ) {
        return this._contactList.iterator();
    }

    /**
     * Method iterateDutySchedule.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateDutySchedule(
    ) {
        return this._dutyScheduleList.iterator();
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
    public void removeAllContact(
    ) {
        this._contactList.clear();
    }

    /**
     */
    public void removeAllDutySchedule(
    ) {
        this._dutyScheduleList.clear();
    }

    /**
     * Method removeContact.
     *
     * @param vContact
     * @return true if the object was removed from the collection.
     */
    public boolean removeContact(
            final org.opennms.netmgt.config.users.Contact vContact) {
        boolean removed = _contactList.remove(vContact);
        return removed;
    }

    /**
     * Method removeContactAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.users.Contact removeContactAt(
            final int index) {
        java.lang.Object obj = this._contactList.remove(index);
        return (org.opennms.netmgt.config.users.Contact) obj;
    }

    /**
     * Method removeDutySchedule.
     *
     * @param vDutySchedule
     * @return true if the object was removed from the collection.
     */
    public boolean removeDutySchedule(
            final java.lang.String vDutySchedule) {
        boolean removed = _dutyScheduleList.remove(vDutySchedule);
        return removed;
    }

    /**
     * Method removeDutyScheduleAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeDutyScheduleAt(
            final int index) {
        java.lang.Object obj = this._dutyScheduleList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     *
     *
     * @param index
     * @param vContact
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setContact(
            final int index,
            final org.opennms.netmgt.config.users.Contact vContact)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contactList.size()) {
            throw new IndexOutOfBoundsException("setContact: Index value '" + index + "' not in range [0.." + (this._contactList.size() - 1) + "]");
        }

        this._contactList.set(index, vContact);
    }

    /**
     *
     *
     * @param vContactArray
     */
    public void setContact(
            final org.opennms.netmgt.config.users.Contact[] vContactArray) {
        //-- copy array
        _contactList.clear();

        for (int i = 0; i < vContactArray.length; i++) {
                this._contactList.add(vContactArray[i]);
        }
    }

    /**
     * Sets the value of '_contactList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vContactList the Vector to copy.
     */
    public void setContact(
            final java.util.List<org.opennms.netmgt.config.users.Contact> vContactList) {
        // copy vector
        this._contactList.clear();

        this._contactList.addAll(vContactList);
    }

    /**
     * Sets the value of '_contactList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param contactList the Vector to set.
     */
    public void setContactCollection(
            final java.util.List<org.opennms.netmgt.config.users.Contact> contactList) {
        this._contactList = contactList;
    }

    /**
     *
     *
     * @param index
     * @param vDutySchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDutySchedule(
            final int index,
            final java.lang.String vDutySchedule)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dutyScheduleList.size()) {
            throw new IndexOutOfBoundsException("setDutySchedule: Index value '" + index + "' not in range [0.." + (this._dutyScheduleList.size() - 1) + "]");
        }

        this._dutyScheduleList.set(index, vDutySchedule);
    }

    /**
     *
     *
     * @param vDutyScheduleArray
     */
    public void setDutySchedule(
            final java.lang.String[] vDutyScheduleArray) {
        //-- copy array
        _dutyScheduleList.clear();

        for (int i = 0; i < vDutyScheduleArray.length; i++) {
                this._dutyScheduleList.add(vDutyScheduleArray[i]);
        }
    }

    /**
     * Sets the value of '_dutyScheduleList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vDutyScheduleList the Vector to copy.
     */
    public void setDutySchedule(
            final java.util.List<java.lang.String> vDutyScheduleList) {
        // copy vector
        this._dutyScheduleList.clear();

        this._dutyScheduleList.addAll(vDutyScheduleList);
    }

    /**
     * Sets the value of '_dutyScheduleList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param dutyScheduleList the Vector to set.
     */
    public void setDutyScheduleCollection(
            final java.util.List<java.lang.String> dutyScheduleList) {
        this._dutyScheduleList = dutyScheduleList;
    }

    /**
     * Sets the value of field 'fullName'.
     *
     * @param fullName the value of field 'fullName'.
     */
    public void setFullName(
            final java.lang.String fullName) {
        this._fullName = fullName;
    }

    /**
     * Sets the value of field 'password'.
     *
     * @param password the value of field 'password'.
     */
    public void setPassword(
            final org.opennms.netmgt.config.users.Password password) {
        this._password = password;
    }

    /**
     * Sets the value of field 'readOnly'.
     *
     * @param readOnly the value of field 'readOnly'.
     */
    public void setReadOnly(
            final Boolean readOnly) {
        this._readOnly = readOnly;
    }

    /**
     * Sets the value of field 'tuiPin'.
     *
     * @param tuiPin the value of field 'tuiPin'.
     */
    public void setTuiPin(
            final java.lang.String tuiPin) {
        this._tuiPin = tuiPin;
    }

    /**
     * Sets the value of field 'userComments'.
     *
     * @param userComments the value of field 'userComments'.
     */
    public void setUserComments(
            final java.lang.String userComments) {
        this._userComments = userComments;
    }

    /**
     * Sets the value of field 'userId'.
     *
     * @param userId the value of field 'userId'.
     */
    public void setUserId(
            final java.lang.String userId) {
        this._userId = userId;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.users.User
     */
    public static org.opennms.netmgt.config.users.User unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.users.User) Unmarshaller.unmarshal(org.opennms.netmgt.config.users.User.class, reader);
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
