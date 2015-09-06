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
package org.opennms.netmgt.config.attrsummary;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Resource.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="resource")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("attr-summary.xsd")
@SuppressWarnings("all") public class Resource implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _attributeList.
     */
    private java.util.List<org.opennms.netmgt.config.attrsummary.Attribute> _attributeList;

    /**
     * Field _resourceList.
     */
    private java.util.List<org.opennms.netmgt.config.attrsummary.Resource> _resourceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Resource() {
        super();
        this._attributeList = new java.util.ArrayList<org.opennms.netmgt.config.attrsummary.Attribute>();
        this._resourceList = new java.util.ArrayList<org.opennms.netmgt.config.attrsummary.Resource>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttribute(
            final org.opennms.netmgt.config.attrsummary.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        this._attributeList.add(vAttribute);
    }

    /**
     *
     *
     * @param index
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttribute(
            final int index,
            final org.opennms.netmgt.config.attrsummary.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        this._attributeList.add(index, vAttribute);
    }

    /**
     *
     *
     * @param vResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResource(
            final org.opennms.netmgt.config.attrsummary.Resource vResource)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceList.add(vResource);
    }

    /**
     *
     *
     * @param index
     * @param vResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResource(
            final int index,
            final org.opennms.netmgt.config.attrsummary.Resource vResource)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceList.add(index, vResource);
    }

    /**
     * Method enumerateAttribute.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.attrsummary.Attribute> enumerateAttribute(
    ) {
        return java.util.Collections.enumeration(this._attributeList);
    }

    /**
     * Method enumerateResource.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.attrsummary.Resource> enumerateResource(
    ) {
        return java.util.Collections.enumeration(this._resourceList);
    }

    /**
     * Method getAttribute.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.attrsummary.Attribute at the given
     * index
     */
    public org.opennms.netmgt.config.attrsummary.Attribute getAttribute(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributeList.size()) {
            throw new IndexOutOfBoundsException("getAttribute: Index value '" + index + "' not in range [0.." + (this._attributeList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.attrsummary.Attribute) _attributeList.get(index);
    }

    /**
     * Method getAttribute.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.attrsummary.Attribute[] getAttribute(
    ) {
        org.opennms.netmgt.config.attrsummary.Attribute[] array = new org.opennms.netmgt.config.attrsummary.Attribute[0];
        return (org.opennms.netmgt.config.attrsummary.Attribute[]) this._attributeList.toArray(array);
    }

    /**
     * Method getAttributeCollection.Returns a reference to
     * '_attributeList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.attrsummary.Attribute> getAttributeCollection(
    ) {
        return this._attributeList;
    }

    /**
     * Method getAttributeCount.
     *
     * @return the size of this collection
     */
    public int getAttributeCount(
    ) {
        return this._attributeList.size();
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
     * Method getResource.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.attrsummary.Resource at the given
     * index
     */
    public org.opennms.netmgt.config.attrsummary.Resource getResource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceList.size()) {
            throw new IndexOutOfBoundsException("getResource: Index value '" + index + "' not in range [0.." + (this._resourceList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.attrsummary.Resource) _resourceList.get(index);
    }

    /**
     * Method getResource.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.attrsummary.Resource[] getResource(
    ) {
        org.opennms.netmgt.config.attrsummary.Resource[] array = new org.opennms.netmgt.config.attrsummary.Resource[0];
        return (org.opennms.netmgt.config.attrsummary.Resource[]) this._resourceList.toArray(array);
    }

    /**
     * Method getResourceCollection.Returns a reference to
     * '_resourceList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.attrsummary.Resource> getResourceCollection(
    ) {
        return this._resourceList;
    }

    /**
     * Method getResourceCount.
     *
     * @return the size of this collection
     */
    public int getResourceCount(
    ) {
        return this._resourceList.size();
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
     * Method iterateAttribute.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.attrsummary.Attribute> iterateAttribute(
    ) {
        return this._attributeList.iterator();
    }

    /**
     * Method iterateResource.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.attrsummary.Resource> iterateResource(
    ) {
        return this._resourceList.iterator();
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
    public void removeAllAttribute(
    ) {
        this._attributeList.clear();
    }

    /**
     */
    public void removeAllResource(
    ) {
        this._resourceList.clear();
    }

    /**
     * Method removeAttribute.
     *
     * @param vAttribute
     * @return true if the object was removed from the collection.
     */
    public boolean removeAttribute(
            final org.opennms.netmgt.config.attrsummary.Attribute vAttribute) {
        boolean removed = _attributeList.remove(vAttribute);
        return removed;
    }

    /**
     * Method removeAttributeAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.attrsummary.Attribute removeAttributeAt(
            final int index) {
        java.lang.Object obj = this._attributeList.remove(index);
        return (org.opennms.netmgt.config.attrsummary.Attribute) obj;
    }

    /**
     * Method removeResource.
     *
     * @param vResource
     * @return true if the object was removed from the collection.
     */
    public boolean removeResource(
            final org.opennms.netmgt.config.attrsummary.Resource vResource) {
        boolean removed = _resourceList.remove(vResource);
        return removed;
    }

    /**
     * Method removeResourceAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.attrsummary.Resource removeResourceAt(
            final int index) {
        java.lang.Object obj = this._resourceList.remove(index);
        return (org.opennms.netmgt.config.attrsummary.Resource) obj;
    }

    /**
     *
     *
     * @param index
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttribute(
            final int index,
            final org.opennms.netmgt.config.attrsummary.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributeList.size()) {
            throw new IndexOutOfBoundsException("setAttribute: Index value '" + index + "' not in range [0.." + (this._attributeList.size() - 1) + "]");
        }

        this._attributeList.set(index, vAttribute);
    }

    /**
     *
     *
     * @param vAttributeArray
     */
    public void setAttribute(
            final org.opennms.netmgt.config.attrsummary.Attribute[] vAttributeArray) {
        //-- copy array
        _attributeList.clear();

        for (int i = 0; i < vAttributeArray.length; i++) {
                this._attributeList.add(vAttributeArray[i]);
        }
    }

    /**
     * Sets the value of '_attributeList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vAttributeList the Vector to copy.
     */
    public void setAttribute(
            final java.util.List<org.opennms.netmgt.config.attrsummary.Attribute> vAttributeList) {
        // copy vector
        this._attributeList.clear();

        this._attributeList.addAll(vAttributeList);
    }

    /**
     * Sets the value of '_attributeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param attributeList the Vector to set.
     */
    public void setAttributeCollection(
            final java.util.List<org.opennms.netmgt.config.attrsummary.Attribute> attributeList) {
        this._attributeList = attributeList;
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
     * @param vResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResource(
            final int index,
            final org.opennms.netmgt.config.attrsummary.Resource vResource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceList.size()) {
            throw new IndexOutOfBoundsException("setResource: Index value '" + index + "' not in range [0.." + (this._resourceList.size() - 1) + "]");
        }

        this._resourceList.set(index, vResource);
    }

    /**
     *
     *
     * @param vResourceArray
     */
    public void setResource(
            final org.opennms.netmgt.config.attrsummary.Resource[] vResourceArray) {
        //-- copy array
        _resourceList.clear();

        for (int i = 0; i < vResourceArray.length; i++) {
                this._resourceList.add(vResourceArray[i]);
        }
    }

    /**
     * Sets the value of '_resourceList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vResourceList the Vector to copy.
     */
    public void setResource(
            final java.util.List<org.opennms.netmgt.config.attrsummary.Resource> vResourceList) {
        // copy vector
        this._resourceList.clear();

        this._resourceList.addAll(vResourceList);
    }

    /**
     * Sets the value of '_resourceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param resourceList the Vector to set.
     */
    public void setResourceCollection(
            final java.util.List<org.opennms.netmgt.config.attrsummary.Resource> resourceList) {
        this._resourceList = resourceList;
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
     * org.opennms.netmgt.config.attrsummary.Resource
     */
    public static org.opennms.netmgt.config.attrsummary.Resource unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.attrsummary.Resource) Unmarshaller.unmarshal(org.opennms.netmgt.config.attrsummary.Resource.class, reader);
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
