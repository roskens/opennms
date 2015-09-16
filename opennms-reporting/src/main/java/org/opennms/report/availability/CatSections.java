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
package org.opennms.report.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class CatSections.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="catSections")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class CatSections implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sectionList.
     */
    @XmlElement(name="section")
    private java.util.List<org.opennms.report.availability.Section> _sectionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CatSections() {
        super();
        this._sectionList = new java.util.ArrayList<org.opennms.report.availability.Section>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vSection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSection(
            final org.opennms.report.availability.Section vSection)
    throws java.lang.IndexOutOfBoundsException {
        this._sectionList.add(vSection);
    }

    /**
     *
     *
     * @param index
     * @param vSection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSection(
            final int index,
            final org.opennms.report.availability.Section vSection)
    throws java.lang.IndexOutOfBoundsException {
        this._sectionList.add(index, vSection);
    }

    /**
     * Method enumerateSection.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.availability.Section> enumerateSection(
    ) {
        return java.util.Collections.enumeration(this._sectionList);
    }

    /**
     * Method getSection.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.availability.Section at the given index
     */
    public org.opennms.report.availability.Section getSection(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sectionList.size()) {
            throw new IndexOutOfBoundsException("getSection: Index value '" + index + "' not in range [0.." + (this._sectionList.size() - 1) + "]");
        }

        return (org.opennms.report.availability.Section) _sectionList.get(index);
    }

    /**
     * Method getSection.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.report.availability.Section[] getSection(
    ) {
        org.opennms.report.availability.Section[] array = new org.opennms.report.availability.Section[0];
        return (org.opennms.report.availability.Section[]) this._sectionList.toArray(array);
    }

    /**
     * Method getSectionCollection.Returns a reference to
     * '_sectionList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.availability.Section> getSectionCollection(
    ) {
        return this._sectionList;
    }

    /**
     * Method getSectionCount.
     *
     * @return the size of this collection
     */
    public int getSectionCount(
    ) {
        return this._sectionList.size();
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
     * Method iterateSection.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.availability.Section> iterateSection(
    ) {
        return this._sectionList.iterator();
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
    public void removeAllSection(
    ) {
        this._sectionList.clear();
    }

    /**
     * Method removeSection.
     *
     * @param vSection
     * @return true if the object was removed from the collection.
     */
    public boolean removeSection(
            final org.opennms.report.availability.Section vSection) {
        boolean removed = _sectionList.remove(vSection);
        return removed;
    }

    /**
     * Method removeSectionAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.availability.Section removeSectionAt(
            final int index) {
        java.lang.Object obj = this._sectionList.remove(index);
        return (org.opennms.report.availability.Section) obj;
    }

    /**
     *
     *
     * @param index
     * @param vSection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSection(
            final int index,
            final org.opennms.report.availability.Section vSection)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sectionList.size()) {
            throw new IndexOutOfBoundsException("setSection: Index value '" + index + "' not in range [0.." + (this._sectionList.size() - 1) + "]");
        }

        this._sectionList.set(index, vSection);
    }

    /**
     *
     *
     * @param vSectionArray
     */
    public void setSection(
            final org.opennms.report.availability.Section[] vSectionArray) {
        //-- copy array
        _sectionList.clear();

        for (int i = 0; i < vSectionArray.length; i++) {
                this._sectionList.add(vSectionArray[i]);
        }
    }

    /**
     * Sets the value of '_sectionList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vSectionList the Vector to copy.
     */
    public void setSection(
            final java.util.List<org.opennms.report.availability.Section> vSectionList) {
        // copy vector
        this._sectionList.clear();

        this._sectionList.addAll(vSectionList);
    }

    /**
     * Sets the value of '_sectionList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param sectionList the Vector to set.
     */
    public void setSectionCollection(
            final java.util.List<org.opennms.report.availability.Section> sectionList) {
        this._sectionList = sectionList;
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
     * org.opennms.report.availability.CatSections
     */
    public static org.opennms.report.availability.CatSections unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.CatSections) Unmarshaller.unmarshal(org.opennms.report.availability.CatSections.class, reader);
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
