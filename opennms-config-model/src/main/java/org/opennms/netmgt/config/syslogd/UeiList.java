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
 * Class UeiList.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "ueiList")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("syslogd-configuration.xsd")
@SuppressWarnings("all")
public class UeiList implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * List of Strings to UEI matches
     */
    @XmlElement(name = "ueiMatch")
    private java.util.List<org.opennms.netmgt.config.syslogd.UeiMatch> _ueiMatchList;

      //----------------/
    //- Constructors -/
    //----------------/
    public UeiList() {
        super();
        this._ueiMatchList = new java.util.ArrayList<org.opennms.netmgt.config.syslogd.UeiMatch>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vUeiMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUeiMatch(
            final org.opennms.netmgt.config.syslogd.UeiMatch vUeiMatch)
            throws java.lang.IndexOutOfBoundsException {
        this._ueiMatchList.add(vUeiMatch);
    }

    /**
     *
     *
     * @param index
     * @param vUeiMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUeiMatch(
            final int index,
            final org.opennms.netmgt.config.syslogd.UeiMatch vUeiMatch)
            throws java.lang.IndexOutOfBoundsException {
        this._ueiMatchList.add(index, vUeiMatch);
    }

    /**
     * Method enumerateUeiMatch.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.syslogd.UeiMatch> enumerateUeiMatch() {
        return java.util.Collections.enumeration(this._ueiMatchList);
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

        if (obj instanceof UeiList) {

            UeiList temp = (UeiList) obj;
            if (this._ueiMatchList != null) {
                if (temp._ueiMatchList == null) {
                    return false;
                } else if (!(this._ueiMatchList.equals(temp._ueiMatchList))) {
                    return false;
                }
            } else if (temp._ueiMatchList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Method getUeiMatch.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.syslogd.UeiMatch at the given index
     */
    public org.opennms.netmgt.config.syslogd.UeiMatch getUeiMatch(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiMatchList.size()) {
            throw new IndexOutOfBoundsException("getUeiMatch: Index value '" + index + "' not in range [0.." + (this._ueiMatchList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.syslogd.UeiMatch) _ueiMatchList.get(index);
    }

    /**
     * Method getUeiMatch.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.syslogd.UeiMatch[] getUeiMatch() {
        org.opennms.netmgt.config.syslogd.UeiMatch[] array = new org.opennms.netmgt.config.syslogd.UeiMatch[0];
        return (org.opennms.netmgt.config.syslogd.UeiMatch[]) this._ueiMatchList.toArray(array);
    }

    /**
     * Method getUeiMatchCollection.Returns a reference to
     * '_ueiMatchList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.syslogd.UeiMatch> getUeiMatchCollection() {
        return this._ueiMatchList;
    }

    /**
     * Method getUeiMatchCount.
     *
     * @return the size of this collection
     */
    public int getUeiMatchCount() {
        return this._ueiMatchList.size();
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
        if (_ueiMatchList != null) {
            result = 37 * result + _ueiMatchList.hashCode();
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
     * Method iterateUeiMatch.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.syslogd.UeiMatch> iterateUeiMatch() {
        return this._ueiMatchList.iterator();
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
    public void removeAllUeiMatch() {
        this._ueiMatchList.clear();
    }

    /**
     * Method removeUeiMatch.
     *
     * @param vUeiMatch
     * @return true if the object was removed from the collection.
     */
    public boolean removeUeiMatch(
            final org.opennms.netmgt.config.syslogd.UeiMatch vUeiMatch) {
        boolean removed = _ueiMatchList.remove(vUeiMatch);
        return removed;
    }

    /**
     * Method removeUeiMatchAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.syslogd.UeiMatch removeUeiMatchAt(
            final int index) {
        java.lang.Object obj = this._ueiMatchList.remove(index);
        return (org.opennms.netmgt.config.syslogd.UeiMatch) obj;
    }

    /**
     *
     *
     * @param index
     * @param vUeiMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUeiMatch(
            final int index,
            final org.opennms.netmgt.config.syslogd.UeiMatch vUeiMatch)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiMatchList.size()) {
            throw new IndexOutOfBoundsException("setUeiMatch: Index value '" + index + "' not in range [0.." + (this._ueiMatchList.size() - 1) + "]");
        }

        this._ueiMatchList.set(index, vUeiMatch);
    }

    /**
     *
     *
     * @param vUeiMatchArray
     */
    public void setUeiMatch(
            final org.opennms.netmgt.config.syslogd.UeiMatch[] vUeiMatchArray) {
        //-- copy array
        _ueiMatchList.clear();

        for (int i = 0; i < vUeiMatchArray.length; i++) {
            this._ueiMatchList.add(vUeiMatchArray[i]);
        }
    }

    /**
     * Sets the value of '_ueiMatchList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vUeiMatchList the Vector to copy.
     */
    public void setUeiMatch(
            final java.util.List<org.opennms.netmgt.config.syslogd.UeiMatch> vUeiMatchList) {
        // copy vector
        this._ueiMatchList.clear();

        this._ueiMatchList.addAll(vUeiMatchList);
    }

    /**
     * Sets the value of '_ueiMatchList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param ueiMatchList the Vector to set.
     */
    public void setUeiMatchCollection(
            final java.util.List<org.opennms.netmgt.config.syslogd.UeiMatch> ueiMatchList) {
        this._ueiMatchList = ueiMatchList;
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
     * org.opennms.netmgt.config.syslogd.UeiList
     */
    public static org.opennms.netmgt.config.syslogd.UeiList unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.UeiList) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.UeiList.class, reader);
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
