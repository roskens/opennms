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
package org.opennms.report.inventory;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class InventoryElement2RP.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="inventoryElement2RP")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("rws-nbinventoryreport.xsd")
@SuppressWarnings("all") public class InventoryElement2RP implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _inventoryMemoryRPList.
     */
    private java.util.List<org.opennms.report.inventory.InventoryMemoryRP> _inventoryMemoryRPList;

    /**
     * Field _inventorySoftwareRPList.
     */
    private java.util.List<org.opennms.report.inventory.InventorySoftwareRP> _inventorySoftwareRPList;

    /**
     * Field _tupleRPList.
     */
    private java.util.List<org.opennms.report.inventory.TupleRP> _tupleRPList;


      //----------------/
     //- Constructors -/
    //----------------/

    public InventoryElement2RP() {
        super();
        this._inventoryMemoryRPList = new java.util.ArrayList<org.opennms.report.inventory.InventoryMemoryRP>();
        this._inventorySoftwareRPList = new java.util.ArrayList<org.opennms.report.inventory.InventorySoftwareRP>();
        this._tupleRPList = new java.util.ArrayList<org.opennms.report.inventory.TupleRP>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vInventoryMemoryRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventoryMemoryRP(
            final org.opennms.report.inventory.InventoryMemoryRP vInventoryMemoryRP)
    throws java.lang.IndexOutOfBoundsException {
        this._inventoryMemoryRPList.add(vInventoryMemoryRP);
    }

    /**
     *
     *
     * @param index
     * @param vInventoryMemoryRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventoryMemoryRP(
            final int index,
            final org.opennms.report.inventory.InventoryMemoryRP vInventoryMemoryRP)
    throws java.lang.IndexOutOfBoundsException {
        this._inventoryMemoryRPList.add(index, vInventoryMemoryRP);
    }

    /**
     *
     *
     * @param vInventorySoftwareRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventorySoftwareRP(
            final org.opennms.report.inventory.InventorySoftwareRP vInventorySoftwareRP)
    throws java.lang.IndexOutOfBoundsException {
        this._inventorySoftwareRPList.add(vInventorySoftwareRP);
    }

    /**
     *
     *
     * @param index
     * @param vInventorySoftwareRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventorySoftwareRP(
            final int index,
            final org.opennms.report.inventory.InventorySoftwareRP vInventorySoftwareRP)
    throws java.lang.IndexOutOfBoundsException {
        this._inventorySoftwareRPList.add(index, vInventorySoftwareRP);
    }

    /**
     *
     *
     * @param vTupleRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTupleRP(
            final org.opennms.report.inventory.TupleRP vTupleRP)
    throws java.lang.IndexOutOfBoundsException {
        this._tupleRPList.add(vTupleRP);
    }

    /**
     *
     *
     * @param index
     * @param vTupleRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTupleRP(
            final int index,
            final org.opennms.report.inventory.TupleRP vTupleRP)
    throws java.lang.IndexOutOfBoundsException {
        this._tupleRPList.add(index, vTupleRP);
    }

    /**
     * Method enumerateInventoryMemoryRP.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.inventory.InventoryMemoryRP> enumerateInventoryMemoryRP(
    ) {
        return java.util.Collections.enumeration(this._inventoryMemoryRPList);
    }

    /**
     * Method enumerateInventorySoftwareRP.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.inventory.InventorySoftwareRP> enumerateInventorySoftwareRP(
    ) {
        return java.util.Collections.enumeration(this._inventorySoftwareRPList);
    }

    /**
     * Method enumerateTupleRP.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.inventory.TupleRP> enumerateTupleRP(
    ) {
        return java.util.Collections.enumeration(this._tupleRPList);
    }

    /**
     * Method getInventoryMemoryRP.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.inventory.InventoryMemoryRP at the given
     * index
     */
    public org.opennms.report.inventory.InventoryMemoryRP getInventoryMemoryRP(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventoryMemoryRPList.size()) {
            throw new IndexOutOfBoundsException("getInventoryMemoryRP: Index value '" + index + "' not in range [0.." + (this._inventoryMemoryRPList.size() - 1) + "]");
        }

        return (org.opennms.report.inventory.InventoryMemoryRP) _inventoryMemoryRPList.get(index);
    }

    /**
     * Method getInventoryMemoryRP.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.report.inventory.InventoryMemoryRP[] getInventoryMemoryRP(
    ) {
        org.opennms.report.inventory.InventoryMemoryRP[] array = new org.opennms.report.inventory.InventoryMemoryRP[0];
        return (org.opennms.report.inventory.InventoryMemoryRP[]) this._inventoryMemoryRPList.toArray(array);
    }

    /**
     * Method getInventoryMemoryRPCollection.Returns a reference to
     * '_inventoryMemoryRPList'. No type checking is performed on
     * any modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.inventory.InventoryMemoryRP> getInventoryMemoryRPCollection(
    ) {
        return this._inventoryMemoryRPList;
    }

    /**
     * Method getInventoryMemoryRPCount.
     *
     * @return the size of this collection
     */
    public int getInventoryMemoryRPCount(
    ) {
        return this._inventoryMemoryRPList.size();
    }

    /**
     * Method getInventorySoftwareRP.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.inventory.InventorySoftwareRP at the
     * given index
     */
    public org.opennms.report.inventory.InventorySoftwareRP getInventorySoftwareRP(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventorySoftwareRPList.size()) {
            throw new IndexOutOfBoundsException("getInventorySoftwareRP: Index value '" + index + "' not in range [0.." + (this._inventorySoftwareRPList.size() - 1) + "]");
        }

        return (org.opennms.report.inventory.InventorySoftwareRP) _inventorySoftwareRPList.get(index);
    }

    /**
     * Method getInventorySoftwareRP.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.report.inventory.InventorySoftwareRP[] getInventorySoftwareRP(
    ) {
        org.opennms.report.inventory.InventorySoftwareRP[] array = new org.opennms.report.inventory.InventorySoftwareRP[0];
        return (org.opennms.report.inventory.InventorySoftwareRP[]) this._inventorySoftwareRPList.toArray(array);
    }

    /**
     * Method getInventorySoftwareRPCollection.Returns a reference
     * to '_inventorySoftwareRPList'. No type checking is performed
     * on any modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.inventory.InventorySoftwareRP> getInventorySoftwareRPCollection(
    ) {
        return this._inventorySoftwareRPList;
    }

    /**
     * Method getInventorySoftwareRPCount.
     *
     * @return the size of this collection
     */
    public int getInventorySoftwareRPCount(
    ) {
        return this._inventorySoftwareRPList.size();
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
     * Method getTupleRP.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.inventory.TupleRP at the given index
     */
    public org.opennms.report.inventory.TupleRP getTupleRP(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tupleRPList.size()) {
            throw new IndexOutOfBoundsException("getTupleRP: Index value '" + index + "' not in range [0.." + (this._tupleRPList.size() - 1) + "]");
        }

        return (org.opennms.report.inventory.TupleRP) _tupleRPList.get(index);
    }

    /**
     * Method getTupleRP.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.report.inventory.TupleRP[] getTupleRP(
    ) {
        org.opennms.report.inventory.TupleRP[] array = new org.opennms.report.inventory.TupleRP[0];
        return (org.opennms.report.inventory.TupleRP[]) this._tupleRPList.toArray(array);
    }

    /**
     * Method getTupleRPCollection.Returns a reference to
     * '_tupleRPList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.inventory.TupleRP> getTupleRPCollection(
    ) {
        return this._tupleRPList;
    }

    /**
     * Method getTupleRPCount.
     *
     * @return the size of this collection
     */
    public int getTupleRPCount(
    ) {
        return this._tupleRPList.size();
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
     * Method iterateInventoryMemoryRP.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.inventory.InventoryMemoryRP> iterateInventoryMemoryRP(
    ) {
        return this._inventoryMemoryRPList.iterator();
    }

    /**
     * Method iterateInventorySoftwareRP.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.inventory.InventorySoftwareRP> iterateInventorySoftwareRP(
    ) {
        return this._inventorySoftwareRPList.iterator();
    }

    /**
     * Method iterateTupleRP.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.inventory.TupleRP> iterateTupleRP(
    ) {
        return this._tupleRPList.iterator();
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
    public void removeAllInventoryMemoryRP(
    ) {
        this._inventoryMemoryRPList.clear();
    }

    /**
     */
    public void removeAllInventorySoftwareRP(
    ) {
        this._inventorySoftwareRPList.clear();
    }

    /**
     */
    public void removeAllTupleRP(
    ) {
        this._tupleRPList.clear();
    }

    /**
     * Method removeInventoryMemoryRP.
     *
     * @param vInventoryMemoryRP
     * @return true if the object was removed from the collection.
     */
    public boolean removeInventoryMemoryRP(
            final org.opennms.report.inventory.InventoryMemoryRP vInventoryMemoryRP) {
        boolean removed = _inventoryMemoryRPList.remove(vInventoryMemoryRP);
        return removed;
    }

    /**
     * Method removeInventoryMemoryRPAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.inventory.InventoryMemoryRP removeInventoryMemoryRPAt(
            final int index) {
        java.lang.Object obj = this._inventoryMemoryRPList.remove(index);
        return (org.opennms.report.inventory.InventoryMemoryRP) obj;
    }

    /**
     * Method removeInventorySoftwareRP.
     *
     * @param vInventorySoftwareRP
     * @return true if the object was removed from the collection.
     */
    public boolean removeInventorySoftwareRP(
            final org.opennms.report.inventory.InventorySoftwareRP vInventorySoftwareRP) {
        boolean removed = _inventorySoftwareRPList.remove(vInventorySoftwareRP);
        return removed;
    }

    /**
     * Method removeInventorySoftwareRPAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.inventory.InventorySoftwareRP removeInventorySoftwareRPAt(
            final int index) {
        java.lang.Object obj = this._inventorySoftwareRPList.remove(index);
        return (org.opennms.report.inventory.InventorySoftwareRP) obj;
    }

    /**
     * Method removeTupleRP.
     *
     * @param vTupleRP
     * @return true if the object was removed from the collection.
     */
    public boolean removeTupleRP(
            final org.opennms.report.inventory.TupleRP vTupleRP) {
        boolean removed = _tupleRPList.remove(vTupleRP);
        return removed;
    }

    /**
     * Method removeTupleRPAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.inventory.TupleRP removeTupleRPAt(
            final int index) {
        java.lang.Object obj = this._tupleRPList.remove(index);
        return (org.opennms.report.inventory.TupleRP) obj;
    }

    /**
     *
     *
     * @param index
     * @param vInventoryMemoryRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInventoryMemoryRP(
            final int index,
            final org.opennms.report.inventory.InventoryMemoryRP vInventoryMemoryRP)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventoryMemoryRPList.size()) {
            throw new IndexOutOfBoundsException("setInventoryMemoryRP: Index value '" + index + "' not in range [0.." + (this._inventoryMemoryRPList.size() - 1) + "]");
        }

        this._inventoryMemoryRPList.set(index, vInventoryMemoryRP);
    }

    /**
     *
     *
     * @param vInventoryMemoryRPArray
     */
    public void setInventoryMemoryRP(
            final org.opennms.report.inventory.InventoryMemoryRP[] vInventoryMemoryRPArray) {
        //-- copy array
        _inventoryMemoryRPList.clear();

        for (int i = 0; i < vInventoryMemoryRPArray.length; i++) {
                this._inventoryMemoryRPList.add(vInventoryMemoryRPArray[i]);
        }
    }

    /**
     * Sets the value of '_inventoryMemoryRPList' by copying the
     * given Vector. All elements will be checked for type safety.
     *
     * @param vInventoryMemoryRPList the Vector to copy.
     */
    public void setInventoryMemoryRP(
            final java.util.List<org.opennms.report.inventory.InventoryMemoryRP> vInventoryMemoryRPList) {
        // copy vector
        this._inventoryMemoryRPList.clear();

        this._inventoryMemoryRPList.addAll(vInventoryMemoryRPList);
    }

    /**
     * Sets the value of '_inventoryMemoryRPList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     *
     * @param inventoryMemoryRPList the Vector to set.
     */
    public void setInventoryMemoryRPCollection(
            final java.util.List<org.opennms.report.inventory.InventoryMemoryRP> inventoryMemoryRPList) {
        this._inventoryMemoryRPList = inventoryMemoryRPList;
    }

    /**
     *
     *
     * @param index
     * @param vInventorySoftwareRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInventorySoftwareRP(
            final int index,
            final org.opennms.report.inventory.InventorySoftwareRP vInventorySoftwareRP)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventorySoftwareRPList.size()) {
            throw new IndexOutOfBoundsException("setInventorySoftwareRP: Index value '" + index + "' not in range [0.." + (this._inventorySoftwareRPList.size() - 1) + "]");
        }

        this._inventorySoftwareRPList.set(index, vInventorySoftwareRP);
    }

    /**
     *
     *
     * @param vInventorySoftwareRPArray
     */
    public void setInventorySoftwareRP(
            final org.opennms.report.inventory.InventorySoftwareRP[] vInventorySoftwareRPArray) {
        //-- copy array
        _inventorySoftwareRPList.clear();

        for (int i = 0; i < vInventorySoftwareRPArray.length; i++) {
                this._inventorySoftwareRPList.add(vInventorySoftwareRPArray[i]);
        }
    }

    /**
     * Sets the value of '_inventorySoftwareRPList' by copying the
     * given Vector. All elements will be checked for type safety.
     *
     * @param vInventorySoftwareRPList the Vector to copy.
     */
    public void setInventorySoftwareRP(
            final java.util.List<org.opennms.report.inventory.InventorySoftwareRP> vInventorySoftwareRPList) {
        // copy vector
        this._inventorySoftwareRPList.clear();

        this._inventorySoftwareRPList.addAll(vInventorySoftwareRPList);
    }

    /**
     * Sets the value of '_inventorySoftwareRPList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     *
     * @param inventorySoftwareRPList the Vector to set.
     */
    public void setInventorySoftwareRPCollection(
            final java.util.List<org.opennms.report.inventory.InventorySoftwareRP> inventorySoftwareRPList) {
        this._inventorySoftwareRPList = inventorySoftwareRPList;
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
     *
     *
     * @param index
     * @param vTupleRP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTupleRP(
            final int index,
            final org.opennms.report.inventory.TupleRP vTupleRP)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tupleRPList.size()) {
            throw new IndexOutOfBoundsException("setTupleRP: Index value '" + index + "' not in range [0.." + (this._tupleRPList.size() - 1) + "]");
        }

        this._tupleRPList.set(index, vTupleRP);
    }

    /**
     *
     *
     * @param vTupleRPArray
     */
    public void setTupleRP(
            final org.opennms.report.inventory.TupleRP[] vTupleRPArray) {
        //-- copy array
        _tupleRPList.clear();

        for (int i = 0; i < vTupleRPArray.length; i++) {
                this._tupleRPList.add(vTupleRPArray[i]);
        }
    }

    /**
     * Sets the value of '_tupleRPList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vTupleRPList the Vector to copy.
     */
    public void setTupleRP(
            final java.util.List<org.opennms.report.inventory.TupleRP> vTupleRPList) {
        // copy vector
        this._tupleRPList.clear();

        this._tupleRPList.addAll(vTupleRPList);
    }

    /**
     * Sets the value of '_tupleRPList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param tupleRPList the Vector to set.
     */
    public void setTupleRPCollection(
            final java.util.List<org.opennms.report.inventory.TupleRP> tupleRPList) {
        this._tupleRPList = tupleRPList;
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
     * org.opennms.report.inventory.InventoryElement2RP
     */
    public static org.opennms.report.inventory.InventoryElement2RP unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.inventory.InventoryElement2RP) Unmarshaller.unmarshal(org.opennms.report.inventory.InventoryElement2RP.class, reader);
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
