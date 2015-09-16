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
 * element name="viewInfo"
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="viewInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("availability_report.xsd")
@SuppressWarnings("all") public class ViewInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _viewName.
     */
    @XmlElement(name="viewName")
    private java.lang.String _viewName;

    /**
     * Field _viewTitle.
     */
    @XmlElement(name="viewTitle")
    private java.lang.String _viewTitle;

    /**
     * Field _viewComments.
     */
    @XmlElement(name="viewComments")
    private java.lang.String _viewComments;


      //----------------/
     //- Constructors -/
    //----------------/

    public ViewInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'viewComments'.
     *
     * @return the value of field 'ViewComments'.
     */
    public java.lang.String getViewComments(
    ) {
        return this._viewComments;
    }

    /**
     * Returns the value of field 'viewName'.
     *
     * @return the value of field 'ViewName'.
     */
    public java.lang.String getViewName(
    ) {
        return this._viewName;
    }

    /**
     * Returns the value of field 'viewTitle'.
     *
     * @return the value of field 'ViewTitle'.
     */
    public java.lang.String getViewTitle(
    ) {
        return this._viewTitle;
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
     * Sets the value of field 'viewComments'.
     *
     * @param viewComments the value of field 'viewComments'.
     */
    public void setViewComments(
            final java.lang.String viewComments) {
        this._viewComments = viewComments;
    }

    /**
     * Sets the value of field 'viewName'.
     *
     * @param viewName the value of field 'viewName'.
     */
    public void setViewName(
            final java.lang.String viewName) {
        this._viewName = viewName;
    }

    /**
     * Sets the value of field 'viewTitle'.
     *
     * @param viewTitle the value of field 'viewTitle'.
     */
    public void setViewTitle(
            final java.lang.String viewTitle) {
        this._viewTitle = viewTitle;
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
     * org.opennms.report.availability.ViewInfo
     */
    public static org.opennms.report.availability.ViewInfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.ViewInfo) Unmarshaller.unmarshal(org.opennms.report.availability.ViewInfo.class, reader);
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
