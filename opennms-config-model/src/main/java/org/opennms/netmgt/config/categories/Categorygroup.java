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
package org.opennms.netmgt.config.categories;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A category group containing categories. The only parts of
 *  the category group that seem to be used are the common element
 * and the
 *  list of categories.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "categorygroup")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("categories.xsd")
@SuppressWarnings("all")
public class Categorygroup implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * The name of the category group. This is seemingly
     *  unused.
     */
    @XmlElement(name = "name")
    private java.lang.String _name;

    /**
     * A comment describing the category group. This is
     *  seemingly unused.
     */
    @XmlElement(name = "comment")
    private java.lang.String _comment;

    /**
     * Common attributes that apply to all categories in
     *  the group.
     */
    @XmlElement(name = "common")
    private org.opennms.netmgt.config.categories.Common _common;

    /**
     * The categories belonging to this category
     *  group.
     */
    @XmlElement(name = "categories")
    private org.opennms.netmgt.config.categories.Categories _categories;

      //----------------/
    //- Constructors -/
    //----------------/
    public Categorygroup() {
        super();
    }

      //-----------/
    //- Methods -/
    //-----------/
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

        if (obj instanceof Categorygroup) {

            Categorygroup temp = (Categorygroup) obj;
            if (this._name != null) {
                if (temp._name == null) {
                    return false;
                } else if (!(this._name.equals(temp._name))) {
                    return false;
                }
            } else if (temp._name != null) {
                return false;
            }
            if (this._comment != null) {
                if (temp._comment == null) {
                    return false;
                } else if (!(this._comment.equals(temp._comment))) {
                    return false;
                }
            } else if (temp._comment != null) {
                return false;
            }
            if (this._common != null) {
                if (temp._common == null) {
                    return false;
                } else if (!(this._common.equals(temp._common))) {
                    return false;
                }
            } else if (temp._common != null) {
                return false;
            }
            if (this._categories != null) {
                if (temp._categories == null) {
                    return false;
                } else if (!(this._categories.equals(temp._categories))) {
                    return false;
                }
            } else if (temp._categories != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'categories'. The field
     * 'categories' has the following description: The categories
     * belonging to this category
     *  group.
     *
     * @return the value of field 'Categories'.
     */
    public org.opennms.netmgt.config.categories.Categories getCategories() {
        return this._categories;
    }

    /**
     * Returns the value of field 'comment'. The field 'comment'
     * has the following description: A comment describing the
     * category group. This is
     *  seemingly unused.
     *
     * @return the value of field 'Comment'.
     */
    public java.lang.String getComment() {
        return this._comment;
    }

    /**
     * Returns the value of field 'common'. The field 'common' has
     * the following description: Common attributes that apply to
     * all categories in
     *  the group.
     *
     * @return the value of field 'Common'.
     */
    public org.opennms.netmgt.config.categories.Common getCommon() {
        return this._common;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The name of the category group. This
     * is seemingly
     *  unused.
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName() {
        return this._name;
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
        if (_name != null) {
            result = 37 * result + _name.hashCode();
        }
        if (_comment != null) {
            result = 37 * result + _comment.hashCode();
        }
        if (_common != null) {
            result = 37 * result + _common.hashCode();
        }
        if (_categories != null) {
            result = 37 * result + _categories.hashCode();
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
     * Sets the value of field 'categories'. The field 'categories'
     * has the following description: The categories belonging to
     * this category
     *  group.
     *
     * @param categories the value of field 'categories'.
     */
    public void setCategories(
            final org.opennms.netmgt.config.categories.Categories categories) {
        this._categories = categories;
    }

    /**
     * Sets the value of field 'comment'. The field 'comment' has
     * the following description: A comment describing the category
     * group. This is
     *  seemingly unused.
     *
     * @param comment the value of field 'comment'.
     */
    public void setComment(
            final java.lang.String comment) {
        this._comment = comment;
    }

    /**
     * Sets the value of field 'common'. The field 'common' has the
     * following description: Common attributes that apply to all
     * categories in
     *  the group.
     *
     * @param common the value of field 'common'.
     */
    public void setCommon(
            final org.opennms.netmgt.config.categories.Common common) {
        this._common = common;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The name of the category group. This
     * is seemingly
     *  unused.
     *
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
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
     * org.opennms.netmgt.config.categories.Categorygroup
     */
    public static org.opennms.netmgt.config.categories.Categorygroup unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.categories.Categorygroup) Unmarshaller.unmarshal(org.opennms.netmgt.config.categories.Categorygroup.class, reader);
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
