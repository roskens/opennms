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
 * The top-level element for availability
 *  reports.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="report")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _logo.
     */
    @XmlElement(name="logo")
    private java.lang.String _logo;

    /**
     * Field _created.
     */
    @XmlElement(name="created")
    private org.opennms.report.availability.Created _created;

    /**
     * Field _author.
     */
    @XmlElement(name="author")
    private java.lang.String _author;

    /**
     * element name="viewInfo"
     */
    @XmlElement(name="viewInfo")
    private org.opennms.report.availability.ViewInfo _viewInfo;

    /**
     * Field _categories.
     */
    @XmlElement(name="categories")
    private org.opennms.report.availability.Categories _categories;

    /**
     * Field _catCount.
     */
    @XmlElement(name="catCount")
    private Integer _catCount;

    /**
     * Field _sectionCount.
     */
    @XmlElement(name="sectionCount")
    private Integer _sectionCount;

      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteCatCount(
    ) {
        this._catCount = null;
    }

    /**
     */
    public void deleteSectionCount(
    ) {
        this._sectionCount = null;
    }

    /**
     * Returns the value of field 'author'.
     *
     * @return the value of field 'Author'.
     */
    public java.lang.String getAuthor(
    ) {
        return this._author;
    }

    /**
     * Returns the value of field 'catCount'.
     *
     * @return the value of field 'CatCount'.
     */
    public Integer getCatCount(
    ) {
        return this._catCount;
    }

    /**
     * Returns the value of field 'categories'.
     *
     * @return the value of field 'Categories'.
     */
    public org.opennms.report.availability.Categories getCategories(
    ) {
        return this._categories;
    }

    /**
     * Returns the value of field 'created'.
     *
     * @return the value of field 'Created'.
     */
    public org.opennms.report.availability.Created getCreated(
    ) {
        return this._created;
    }

    /**
     * Returns the value of field 'logo'.
     *
     * @return the value of field 'Logo'.
     */
    public java.lang.String getLogo(
    ) {
        return this._logo;
    }

    /**
     * Returns the value of field 'sectionCount'.
     *
     * @return the value of field 'SectionCount'.
     */
    public Integer getSectionCount(
    ) {
        return this._sectionCount;
    }

    /**
     * Returns the value of field 'viewInfo'. The field 'viewInfo'
     * has the following description: element name="viewInfo"
     *
     * @return the value of field 'ViewInfo'.
     */
    public org.opennms.report.availability.ViewInfo getViewInfo(
    ) {
        return this._viewInfo;
    }

    /**
     * Method hasCatCount.
     *
     * @return true if at least one CatCount has been added
     */
    public boolean hasCatCount(
    ) {
        return this._catCount != null;
    }

    /**
     * Method hasSectionCount.
     *
     * @return true if at least one SectionCount has been added
     */
    public boolean hasSectionCount(
    ) {
        return this._sectionCount != null;
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
     * Sets the value of field 'author'.
     *
     * @param author the value of field 'author'.
     */
    public void setAuthor(
            final java.lang.String author) {
        this._author = author;
    }

    /**
     * Sets the value of field 'catCount'.
     *
     * @param catCount the value of field 'catCount'.
     */
    public void setCatCount(
            final Integer catCount) {
        this._catCount = catCount;
    }

    /**
     * Sets the value of field 'categories'.
     *
     * @param categories the value of field 'categories'.
     */
    public void setCategories(
            final org.opennms.report.availability.Categories categories) {
        this._categories = categories;
    }

    /**
     * Sets the value of field 'created'.
     *
     * @param created the value of field 'created'.
     */
    public void setCreated(
            final org.opennms.report.availability.Created created) {
        this._created = created;
    }

    /**
     * Sets the value of field 'logo'.
     *
     * @param logo the value of field 'logo'.
     */
    public void setLogo(
            final java.lang.String logo) {
        this._logo = logo;
    }

    /**
     * Sets the value of field 'sectionCount'.
     *
     * @param sectionCount the value of field 'sectionCount'.
     */
    public void setSectionCount(
            final Integer sectionCount) {
        this._sectionCount = sectionCount;
    }

    /**
     * Sets the value of field 'viewInfo'. The field 'viewInfo' has
     * the following description: element name="viewInfo"
     *
     * @param viewInfo the value of field 'viewInfo'.
     */
    public void setViewInfo(
            final org.opennms.report.availability.ViewInfo viewInfo) {
        this._viewInfo = viewInfo;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.availability.Repor
     */
    public static org.opennms.report.availability.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Report) Unmarshaller.unmarshal(org.opennms.report.availability.Report.class, reader);
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
