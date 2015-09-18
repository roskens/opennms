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
package org.opennms.netmgt.config.snmpAsset.adapter;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class MibObjs.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "mibObjs")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("snmp-asset-adapter-configuration.xsd")
@SuppressWarnings("all")
public class MibObjs implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * a MIB object
     */
    @XmlElement(name = "mibObj")
    private java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.MibObj> _mibObjList;

      //----------------/
    //- Constructors -/
    //----------------/
    public MibObjs() {
        super();
        this._mibObjList = new java.util.ArrayList<org.opennms.netmgt.config.snmpAsset.adapter.MibObj>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vMibObj
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMibObj(
            final org.opennms.netmgt.config.snmpAsset.adapter.MibObj vMibObj)
            throws java.lang.IndexOutOfBoundsException {
        this._mibObjList.add(vMibObj);
    }

    /**
     *
     *
     * @param index
     * @param vMibObj
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMibObj(
            final int index,
            final org.opennms.netmgt.config.snmpAsset.adapter.MibObj vMibObj)
            throws java.lang.IndexOutOfBoundsException {
        this._mibObjList.add(index, vMibObj);
    }

    /**
     * Method enumerateMibObj.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.snmpAsset.adapter.MibObj> enumerateMibObj() {
        return java.util.Collections.enumeration(this._mibObjList);
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

        if (obj instanceof MibObjs) {

            MibObjs temp = (MibObjs) obj;
            if (this._mibObjList != null) {
                if (temp._mibObjList == null) {
                    return false;
                } else if (!(this._mibObjList.equals(temp._mibObjList))) {
                    return false;
                }
            } else if (temp._mibObjList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Method getMibObj.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.snmpAsset.adapter.MibObj at the
     * given index
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.MibObj getMibObj(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mibObjList.size()) {
            throw new IndexOutOfBoundsException("getMibObj: Index value '" + index + "' not in range [0.." + (this._mibObjList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.snmpAsset.adapter.MibObj) _mibObjList.get(index);
    }

    /**
     * Method getMibObj.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.MibObj[] getMibObj() {
        org.opennms.netmgt.config.snmpAsset.adapter.MibObj[] array = new org.opennms.netmgt.config.snmpAsset.adapter.MibObj[0];
        return (org.opennms.netmgt.config.snmpAsset.adapter.MibObj[]) this._mibObjList.toArray(array);
    }

    /**
     * Method getMibObjCollection.Returns a reference to
     * '_mibObjList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.MibObj> getMibObjCollection() {
        return this._mibObjList;
    }

    /**
     * Method getMibObjCount.
     *
     * @return the size of this collection
     */
    public int getMibObjCount() {
        return this._mibObjList.size();
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
        if (_mibObjList != null) {
            result = 37 * result + _mibObjList.hashCode();
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
     * Method iterateMibObj.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.snmpAsset.adapter.MibObj> iterateMibObj() {
        return this._mibObjList.iterator();
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
    public void removeAllMibObj() {
        this._mibObjList.clear();
    }

    /**
     * Method removeMibObj.
     *
     * @param vMibObj
     * @return true if the object was removed from the collection.
     */
    public boolean removeMibObj(
            final org.opennms.netmgt.config.snmpAsset.adapter.MibObj vMibObj) {
        boolean removed = _mibObjList.remove(vMibObj);
        return removed;
    }

    /**
     * Method removeMibObjAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.MibObj removeMibObjAt(
            final int index) {
        java.lang.Object obj = this._mibObjList.remove(index);
        return (org.opennms.netmgt.config.snmpAsset.adapter.MibObj) obj;
    }

    /**
     *
     *
     * @param index
     * @param vMibObj
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMibObj(
            final int index,
            final org.opennms.netmgt.config.snmpAsset.adapter.MibObj vMibObj)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mibObjList.size()) {
            throw new IndexOutOfBoundsException("setMibObj: Index value '" + index + "' not in range [0.." + (this._mibObjList.size() - 1) + "]");
        }

        this._mibObjList.set(index, vMibObj);
    }

    /**
     *
     *
     * @param vMibObjArray
     */
    public void setMibObj(
            final org.opennms.netmgt.config.snmpAsset.adapter.MibObj[] vMibObjArray) {
        //-- copy array
        _mibObjList.clear();

        for (int i = 0; i < vMibObjArray.length; i++) {
            this._mibObjList.add(vMibObjArray[i]);
        }
    }

    /**
     * Sets the value of '_mibObjList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vMibObjList the Vector to copy.
     */
    public void setMibObj(
            final java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.MibObj> vMibObjList) {
        // copy vector
        this._mibObjList.clear();

        this._mibObjList.addAll(vMibObjList);
    }

    /**
     * Sets the value of '_mibObjList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param mibObjList the Vector to set.
     */
    public void setMibObjCollection(
            final java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.MibObj> mibObjList) {
        this._mibObjList = mibObjList;
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
     * org.opennms.netmgt.config.snmpAsset.adapter.MibObjs
     */
    public static org.opennms.netmgt.config.snmpAsset.adapter.MibObjs unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpAsset.adapter.MibObjs) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpAsset.adapter.MibObjs.class, reader);
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
