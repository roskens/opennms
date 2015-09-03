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
 * A category.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="category")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("categories.xsd")
@SuppressWarnings("all") public class Category implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The category label. NOTE: category labels will need
     *  to be unique across category groups.
     */
    @XmlElement(name="label")
    private java.lang.String _label;

    /**
     * A comment describing the category.
     */
    @XmlElement(name="comment")
    private java.lang.String _comment;

    /**
     * The normal threshold value for the category in
     *  percent. The UI displays the category in green if the
     * overall
     *  availability for the category is equal to or greater than
     * this
     *  value.
     */
    @XmlElement(name="normal")
    private Double _normal;

    /**
     * The warning threshold value for the category in
     *  percent. The UI displays the category in yellow if the
     * overall
     *  availability for the category is equal to or greater than
     * this
     *  value but less than the normal threashold. If availability
     * is less
     *  than this value, category is displayed in red.
     */
    @XmlElement(name="warning")
    private Double _warning;

    /**
     * A service relevant to this category. For a
     *  nodeid/ip/service tuple to be added to a category, it will
     * need to
     *  pass the rule(categorygroup rule & category rule) and the
     *  service will need to be in the category service list. If
     * there are
     *  no services defined, all tuples that pass the rule are
     * added to
     *  the category.
     */
    @XmlElement(name="service")
    private java.util.List<java.lang.String> _serviceList;

    /**
     * The category rule.
     */
    @XmlElement(name="rule")
    private java.lang.String _rule;


      //----------------/
     //- Constructors -/
    //----------------/

    public Category() {
        super();
        this._serviceList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final java.lang.String vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(vService);
    }

    /**
     *
     *
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final int index,
            final java.lang.String vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(index, vService);
    }

    /**
     */
    public void deleteNormal(
    ) {
        this._normal= null;
    }

    /**
     */
    public void deleteWarning(
    ) {
        this._warning= null;
    }

    /**
     * Method enumerateService.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateService(
    ) {
        return java.util.Collections.enumeration(this._serviceList);
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

        if (obj instanceof Category) {

            Category temp = (Category)obj;
            if (this._label != null) {
                if (temp._label == null) return false;
                else if (!(this._label.equals(temp._label)))
                    return false;
            }
            else if (temp._label != null)
                return false;
            if (this._comment != null) {
                if (temp._comment == null) return false;
                else if (!(this._comment.equals(temp._comment)))
                    return false;
            }
            else if (temp._comment != null)
                return false;
            if (this._normal != null) {
                if (temp._normal == null) return false;
                else if (!(this._normal.equals(temp._normal)))
                    return false;
            }
            else if (temp._normal != null)
                return false;
            if (this._warning != null) {
                if (temp._warning == null) return false;
                else if (!(this._warning.equals(temp._warning)))
                    return false;
            }
            else if (temp._warning != null)
                return false;
            if (this._serviceList != null) {
                if (temp._serviceList == null) return false;
                else if (!(this._serviceList.equals(temp._serviceList)))
                    return false;
            }
            else if (temp._serviceList != null)
                return false;
            if (this._rule != null) {
                if (temp._rule == null) return false;
                else if (!(this._rule.equals(temp._rule)))
                    return false;
            }
            else if (temp._rule != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'comment'. The field 'comment'
     * has the following description: A comment describing the
     * category.
     *
     * @return the value of field 'Comment'.
     */
    public java.lang.String getComment(
    ) {
        return this._comment;
    }

    /**
     * Returns the value of field 'label'. The field 'label' has
     * the following description: The category label. NOTE:
     * category labels will need
     *  to be unique across category groups.
     *
     * @return the value of field 'Label'.
     */
    public java.lang.String getLabel(
    ) {
        return this._label;
    }

    /**
     * Returns the value of field 'normal'. The field 'normal' has
     * the following description: The normal threshold value for
     * the category in
     *  percent. The UI displays the category in green if the
     * overall
     *  availability for the category is equal to or greater than
     * this
     *  value.
     *
     * @return the value of field 'Normal'.
     */
    public double getNormal(
    ) {
        return this._normal;
    }

    /**
     * Returns the value of field 'rule'. The field 'rule' has the
     * following description: The category rule.
     *
     * @return the value of field 'Rule'.
     */
    public java.lang.String getRule(
    ) {
        return this._rule;
    }

    /**
     * Method getService.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getService(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("getService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }

        return (java.lang.String) _serviceList.get(index);
    }

    /**
     * Method getService.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getService(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._serviceList.toArray(array);
    }

    /**
     * Method getServiceCollection.Returns a reference to
     * '_serviceList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getServiceCollection(
    ) {
        return this._serviceList;
    }

    /**
     * Method getServiceCount.
     *
     * @return the size of this collection
     */
    public int getServiceCount(
    ) {
        return this._serviceList.size();
    }

    /**
     * Returns the value of field 'warning'. The field 'warning'
     * has the following description: The warning threshold value
     * for the category in
     *  percent. The UI displays the category in yellow if the
     * overall
     *  availability for the category is equal to or greater than
     * this
     *  value but less than the normal threashold. If availability
     * is less
     *  than this value, category is displayed in red.
     *
     * @return the value of field 'Warning'.
     */
    public double getWarning(
    ) {
        return this._warning;
    }

    /**
     * Method hasNormal.
     *
     * @return true if at least one Normal has been added
     */
    public boolean hasNormal(
    ) {
        return this._normal != null;
    }

    /**
     * Method hasWarning.
     *
     * @return true if at least one Warning has been added
     */
    public boolean hasWarning(
    ) {
        return this._warning != null;
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
        if (_label != null) {
           result = 37 * result + _label.hashCode();
        }
        if (_comment != null) {
           result = 37 * result + _comment.hashCode();
        }
        tmp = java.lang.Double.doubleToLongBits(_normal);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        tmp = java.lang.Double.doubleToLongBits(_warning);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        if (_serviceList != null) {
           result = 37 * result + _serviceList.hashCode();
        }
        if (_rule != null) {
           result = 37 * result + _rule.hashCode();
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
     * Method iterateService.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateService(
    ) {
        return this._serviceList.iterator();
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
    public void removeAllService(
    ) {
        this._serviceList.clear();
    }

    /**
     * Method removeService.
     *
     * @param vService
     * @return true if the object was removed from the collection.
     */
    public boolean removeService(
            final java.lang.String vService) {
        boolean removed = _serviceList.remove(vService);
        return removed;
    }

    /**
     * Method removeServiceAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeServiceAt(
            final int index) {
        java.lang.Object obj = this._serviceList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'comment'. The field 'comment' has
     * the following description: A comment describing the
     * category.
     *
     * @param comment the value of field 'comment'.
     */
    public void setComment(
            final java.lang.String comment) {
        this._comment = comment;
    }

    /**
     * Sets the value of field 'label'. The field 'label' has the
     * following description: The category label. NOTE: category
     * labels will need
     *  to be unique across category groups.
     *
     * @param label the value of field 'label'.
     */
    public void setLabel(
            final java.lang.String label) {
        this._label = label;
    }

    /**
     * Sets the value of field 'normal'. The field 'normal' has the
     * following description: The normal threshold value for the
     * category in
     *  percent. The UI displays the category in green if the
     * overall
     *  availability for the category is equal to or greater than
     * this
     *  value.
     *
     * @param normal the value of field 'normal'.
     */
    public void setNormal(
            final Double normal) {
        this._normal = normal;
    }

    /**
     * Sets the value of field 'rule'. The field 'rule' has the
     * following description: The category rule.
     *
     * @param rule the value of field 'rule'.
     */
    public void setRule(
            final java.lang.String rule) {
        this._rule = rule;
    }

    /**
     *
     *
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setService(
            final int index,
            final java.lang.String vService)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("setService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }

        this._serviceList.set(index, vService);
    }

    /**
     *
     *
     * @param vServiceArray
     */
    public void setService(
            final java.lang.String[] vServiceArray) {
        //-- copy array
        _serviceList.clear();

        for (int i = 0; i < vServiceArray.length; i++) {
                this._serviceList.add(vServiceArray[i]);
        }
    }

    /**
     * Sets the value of '_serviceList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vServiceList the Vector to copy.
     */
    public void setService(
            final java.util.List<java.lang.String> vServiceList) {
        // copy vector
        this._serviceList.clear();

        this._serviceList.addAll(vServiceList);
    }

    /**
     * Sets the value of '_serviceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param serviceList the Vector to set.
     */
    public void setServiceCollection(
            final java.util.List<java.lang.String> serviceList) {
        this._serviceList = serviceList;
    }

    /**
     * Sets the value of field 'warning'. The field 'warning' has
     * the following description: The warning threshold value for
     * the category in
     *  percent. The UI displays the category in yellow if the
     * overall
     *  availability for the category is equal to or greater than
     * this
     *  value but less than the normal threashold. If availability
     * is less
     *  than this value, category is displayed in red.
     *
     * @param warning the value of field 'warning'.
     */
    public void setWarning(
            final Double warning) {
        this._warning = warning;
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
     * org.opennms.netmgt.config.categories.Category
     */
    public static org.opennms.netmgt.config.categories.Category unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.categories.Category) Unmarshaller.unmarshal(org.opennms.netmgt.config.categories.Category.class, reader);
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
