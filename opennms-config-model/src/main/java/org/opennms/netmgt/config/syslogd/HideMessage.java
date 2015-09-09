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
package org.opennms.netmgt.config.syslogd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class HideMessage.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="hideMessage")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("syslogd-configuration.xsd")
@SuppressWarnings("all") public class HideMessage implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * List of substrings or regexes that, when matched, signal
     *  that the message has sensitive contents and should
     *  therefore be hidden
     *
     */
    @XmlElement(name="hideMatch")
    private java.util.List<org.opennms.netmgt.config.syslogd.HideMatch> _hideMatchList;


      //----------------/
     //- Constructors -/
    //----------------/

    public HideMessage() {
        super();
        this._hideMatchList = new java.util.ArrayList<org.opennms.netmgt.config.syslogd.HideMatch>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vHideMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addHideMatch(
            final org.opennms.netmgt.config.syslogd.HideMatch vHideMatch)
    throws java.lang.IndexOutOfBoundsException {
        this._hideMatchList.add(vHideMatch);
    }

    /**
     *
     *
     * @param index
     * @param vHideMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addHideMatch(
            final int index,
            final org.opennms.netmgt.config.syslogd.HideMatch vHideMatch)
    throws java.lang.IndexOutOfBoundsException {
        this._hideMatchList.add(index, vHideMatch);
    }

    /**
     * Method enumerateHideMatch.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.syslogd.HideMatch> enumerateHideMatch(
    ) {
        return java.util.Collections.enumeration(this._hideMatchList);
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

        if (obj instanceof HideMessage) {

            HideMessage temp = (HideMessage)obj;
            if (this._hideMatchList != null) {
                if (temp._hideMatchList == null) return false;
                else if (!(this._hideMatchList.equals(temp._hideMatchList)))
                    return false;
            }
            else if (temp._hideMatchList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getHideMatch.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.syslogd.HideMatch at the given inde
     */
    public org.opennms.netmgt.config.syslogd.HideMatch getHideMatch(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._hideMatchList.size()) {
            throw new IndexOutOfBoundsException("getHideMatch: Index value '" + index + "' not in range [0.." + (this._hideMatchList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.syslogd.HideMatch) _hideMatchList.get(index);
    }

    /**
     * Method getHideMatch.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.syslogd.HideMatch[] getHideMatch(
    ) {
        org.opennms.netmgt.config.syslogd.HideMatch[] array = new org.opennms.netmgt.config.syslogd.HideMatch[0];
        return (org.opennms.netmgt.config.syslogd.HideMatch[]) this._hideMatchList.toArray(array);
    }

    /**
     * Method getHideMatchCollection.Returns a reference to
     * '_hideMatchList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.syslogd.HideMatch> getHideMatchCollection(
    ) {
        return this._hideMatchList;
    }

    /**
     * Method getHideMatchCount.
     *
     * @return the size of this collection
     */
    public int getHideMatchCount(
    ) {
        return this._hideMatchList.size();
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
        if (_hideMatchList != null) {
           result = 37 * result + _hideMatchList.hashCode();
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
     * Method iterateHideMatch.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.syslogd.HideMatch> iterateHideMatch(
    ) {
        return this._hideMatchList.iterator();
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
    public void removeAllHideMatch(
    ) {
        this._hideMatchList.clear();
    }

    /**
     * Method removeHideMatch.
     *
     * @param vHideMatch
     * @return true if the object was removed from the collection.
     */
    public boolean removeHideMatch(
            final org.opennms.netmgt.config.syslogd.HideMatch vHideMatch) {
        boolean removed = _hideMatchList.remove(vHideMatch);
        return removed;
    }

    /**
     * Method removeHideMatchAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.syslogd.HideMatch removeHideMatchAt(
            final int index) {
        java.lang.Object obj = this._hideMatchList.remove(index);
        return (org.opennms.netmgt.config.syslogd.HideMatch) obj;
    }

    /**
     *
     *
     * @param index
     * @param vHideMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setHideMatch(
            final int index,
            final org.opennms.netmgt.config.syslogd.HideMatch vHideMatch)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._hideMatchList.size()) {
            throw new IndexOutOfBoundsException("setHideMatch: Index value '" + index + "' not in range [0.." + (this._hideMatchList.size() - 1) + "]");
        }

        this._hideMatchList.set(index, vHideMatch);
    }

    /**
     *
     *
     * @param vHideMatchArray
     */
    public void setHideMatch(
            final org.opennms.netmgt.config.syslogd.HideMatch[] vHideMatchArray) {
        //-- copy array
        _hideMatchList.clear();

        for (int i = 0; i < vHideMatchArray.length; i++) {
                this._hideMatchList.add(vHideMatchArray[i]);
        }
    }

    /**
     * Sets the value of '_hideMatchList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vHideMatchList the Vector to copy.
     */
    public void setHideMatch(
            final java.util.List<org.opennms.netmgt.config.syslogd.HideMatch> vHideMatchList) {
        // copy vector
        this._hideMatchList.clear();

        this._hideMatchList.addAll(vHideMatchList);
    }

    /**
     * Sets the value of '_hideMatchList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param hideMatchList the Vector to set.
     */
    public void setHideMatchCollection(
            final java.util.List<org.opennms.netmgt.config.syslogd.HideMatch> hideMatchList) {
        this._hideMatchList = hideMatchList;
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
     * org.opennms.netmgt.config.syslogd.HideMessage
     */
    public static org.opennms.netmgt.config.syslogd.HideMessage unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.HideMessage) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.HideMessage.class, reader);
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
