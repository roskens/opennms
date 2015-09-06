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
package org.opennms.reporting.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Section.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="section")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class Section implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sectionName.
     */
    private java.lang.String _sectionName;

    /**
     * Field _sectionTitle.
     */
    private java.lang.String _sectionTitle;

    /**
     * Field _sectionDescr.
     */
    private java.lang.String _sectionDescr;

    /**
     * Field _period.
     */
    private java.lang.String _period;

    /**
     * Field _classicTable.
     */
    private org.opennms.reporting.availability.ClassicTable _classicTable;

    /**
     * Field _calendarTable.
     */
    private org.opennms.reporting.availability.CalendarTable _calendarTable;

    /**
     * Field _sectionIndex.
     */
    private int _sectionIndex;

    /**
     * keeps track of state for field: _sectionIndex
     */
    private boolean _has_sectionIndex;


      //----------------/
     //- Constructors -/
    //----------------/

    public Section() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteSectionIndex(
    ) {
        this._has_sectionIndex= false;
    }

    /**
     * Returns the value of field 'calendarTable'.
     *
     * @return the value of field 'CalendarTable'.
     */
    public org.opennms.reporting.availability.CalendarTable getCalendarTable(
    ) {
        return this._calendarTable;
    }

    /**
     * Returns the value of field 'classicTable'.
     *
     * @return the value of field 'ClassicTable'.
     */
    public org.opennms.reporting.availability.ClassicTable getClassicTable(
    ) {
        return this._classicTable;
    }

    /**
     * Returns the value of field 'period'.
     *
     * @return the value of field 'Period'.
     */
    public java.lang.String getPeriod(
    ) {
        return this._period;
    }

    /**
     * Returns the value of field 'sectionDescr'.
     *
     * @return the value of field 'SectionDescr'.
     */
    public java.lang.String getSectionDescr(
    ) {
        return this._sectionDescr;
    }

    /**
     * Returns the value of field 'sectionIndex'.
     *
     * @return the value of field 'SectionIndex'.
     */
    public int getSectionIndex(
    ) {
        return this._sectionIndex;
    }

    /**
     * Returns the value of field 'sectionName'.
     *
     * @return the value of field 'SectionName'.
     */
    public java.lang.String getSectionName(
    ) {
        return this._sectionName;
    }

    /**
     * Returns the value of field 'sectionTitle'.
     *
     * @return the value of field 'SectionTitle'.
     */
    public java.lang.String getSectionTitle(
    ) {
        return this._sectionTitle;
    }

    /**
     * Method hasSectionIndex.
     *
     * @return true if at least one SectionIndex has been added
     */
    public boolean hasSectionIndex(
    ) {
        return this._has_sectionIndex;
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
     * Sets the value of field 'calendarTable'.
     *
     * @param calendarTable the value of field 'calendarTable'.
     */
    public void setCalendarTable(
            final org.opennms.reporting.availability.CalendarTable calendarTable) {
        this._calendarTable = calendarTable;
    }

    /**
     * Sets the value of field 'classicTable'.
     *
     * @param classicTable the value of field 'classicTable'.
     */
    public void setClassicTable(
            final org.opennms.reporting.availability.ClassicTable classicTable) {
        this._classicTable = classicTable;
    }

    /**
     * Sets the value of field 'period'.
     *
     * @param period the value of field 'period'.
     */
    public void setPeriod(
            final java.lang.String period) {
        this._period = period;
    }

    /**
     * Sets the value of field 'sectionDescr'.
     *
     * @param sectionDescr the value of field 'sectionDescr'.
     */
    public void setSectionDescr(
            final java.lang.String sectionDescr) {
        this._sectionDescr = sectionDescr;
    }

    /**
     * Sets the value of field 'sectionIndex'.
     *
     * @param sectionIndex the value of field 'sectionIndex'.
     */
    public void setSectionIndex(
            final int sectionIndex) {
        this._sectionIndex = sectionIndex;
        this._has_sectionIndex = true;
    }

    /**
     * Sets the value of field 'sectionName'.
     *
     * @param sectionName the value of field 'sectionName'.
     */
    public void setSectionName(
            final java.lang.String sectionName) {
        this._sectionName = sectionName;
    }

    /**
     * Sets the value of field 'sectionTitle'.
     *
     * @param sectionTitle the value of field 'sectionTitle'.
     */
    public void setSectionTitle(
            final java.lang.String sectionTitle) {
        this._sectionTitle = sectionTitle;
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
     * org.opennms.reporting.availability.Section
     */
    public static org.opennms.reporting.availability.Section unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.reporting.availability.Section) Unmarshaller.unmarshal(org.opennms.reporting.availability.Section.class, reader);
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
