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
package org.opennms.netmgt.config.charts;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ChartConfiguration.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="chart-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("chart-configuration.xsd")
@SuppressWarnings("all") public class ChartConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _barChartList.
     */
    @XmlElement(name="bar-chart")
    private java.util.List<org.opennms.netmgt.config.charts.BarChart> _barChartList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChartConfiguration() {
        super();
        this._barChartList = new java.util.ArrayList<org.opennms.netmgt.config.charts.BarChart>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vBarChart
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBarChart(
            final org.opennms.netmgt.config.charts.BarChart vBarChart)
    throws java.lang.IndexOutOfBoundsException {
        this._barChartList.add(vBarChart);
    }

    /**
     *
     *
     * @param index
     * @param vBarChart
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBarChart(
            final int index,
            final org.opennms.netmgt.config.charts.BarChart vBarChart)
    throws java.lang.IndexOutOfBoundsException {
        this._barChartList.add(index, vBarChart);
    }

    /**
     * Method enumerateBarChart.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.charts.BarChart> enumerateBarChart(
    ) {
        return java.util.Collections.enumeration(this._barChartList);
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

        if (obj instanceof ChartConfiguration) {

            ChartConfiguration temp = (ChartConfiguration)obj;
            if (this._barChartList != null) {
                if (temp._barChartList == null) return false;
                else if (!(this._barChartList.equals(temp._barChartList)))
                    return false;
            }
            else if (temp._barChartList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getBarChart.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.charts.BarChart at the given index
     */
    public org.opennms.netmgt.config.charts.BarChart getBarChart(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._barChartList.size()) {
            throw new IndexOutOfBoundsException("getBarChart: Index value '" + index + "' not in range [0.." + (this._barChartList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.charts.BarChart) _barChartList.get(index);
    }

    /**
     * Method getBarChart.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.charts.BarChart[] getBarChart(
    ) {
        org.opennms.netmgt.config.charts.BarChart[] array = new org.opennms.netmgt.config.charts.BarChart[0];
        return (org.opennms.netmgt.config.charts.BarChart[]) this._barChartList.toArray(array);
    }

    /**
     * Method getBarChartCollection.Returns a reference to
     * '_barChartList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.charts.BarChart> getBarChartCollection(
    ) {
        return this._barChartList;
    }

    /**
     * Method getBarChartCount.
     *
     * @return the size of this collection
     */
    public int getBarChartCount(
    ) {
        return this._barChartList.size();
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
        if (_barChartList != null) {
           result = 37 * result + _barChartList.hashCode();
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
     * Method iterateBarChart.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.charts.BarChart> iterateBarChart(
    ) {
        return this._barChartList.iterator();
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
    public void removeAllBarChart(
    ) {
        this._barChartList.clear();
    }

    /**
     * Method removeBarChart.
     *
     * @param vBarChart
     * @return true if the object was removed from the collection.
     */
    public boolean removeBarChart(
            final org.opennms.netmgt.config.charts.BarChart vBarChart) {
        boolean removed = _barChartList.remove(vBarChart);
        return removed;
    }

    /**
     * Method removeBarChartAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.charts.BarChart removeBarChartAt(
            final int index) {
        java.lang.Object obj = this._barChartList.remove(index);
        return (org.opennms.netmgt.config.charts.BarChart) obj;
    }

    /**
     *
     *
     * @param index
     * @param vBarChart
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBarChart(
            final int index,
            final org.opennms.netmgt.config.charts.BarChart vBarChart)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._barChartList.size()) {
            throw new IndexOutOfBoundsException("setBarChart: Index value '" + index + "' not in range [0.." + (this._barChartList.size() - 1) + "]");
        }

        this._barChartList.set(index, vBarChart);
    }

    /**
     *
     *
     * @param vBarChartArray
     */
    public void setBarChart(
            final org.opennms.netmgt.config.charts.BarChart[] vBarChartArray) {
        //-- copy array
        _barChartList.clear();

        for (int i = 0; i < vBarChartArray.length; i++) {
                this._barChartList.add(vBarChartArray[i]);
        }
    }

    /**
     * Sets the value of '_barChartList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vBarChartList the Vector to copy.
     */
    public void setBarChart(
            final java.util.List<org.opennms.netmgt.config.charts.BarChart> vBarChartList) {
        // copy vector
        this._barChartList.clear();

        this._barChartList.addAll(vBarChartList);
    }

    /**
     * Sets the value of '_barChartList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param barChartList the Vector to set.
     */
    public void setBarChartCollection(
            final java.util.List<org.opennms.netmgt.config.charts.BarChart> barChartList) {
        this._barChartList = barChartList;
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
     * org.opennms.netmgt.config.charts.ChartConfiguration
     */
    public static org.opennms.netmgt.config.charts.ChartConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.ChartConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.ChartConfiguration.class, reader);
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
