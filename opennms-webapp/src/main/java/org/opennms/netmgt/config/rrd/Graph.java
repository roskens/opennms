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
package org.opennms.netmgt.config.rrd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Graph.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="graph")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class Graph implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _graph_elementList.
     */
    @XmlElement(name="graph_element")
    private java.util.List<org.opennms.netmgt.config.rrd.Graph_element> _graph_elementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Graph() {
        super();
        this._graph_elementList = new java.util.ArrayList<org.opennms.netmgt.config.rrd.Graph_element>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vGraph_element
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGraph_element(
            final org.opennms.netmgt.config.rrd.Graph_element vGraph_element)
    throws java.lang.IndexOutOfBoundsException {
        this._graph_elementList.add(vGraph_element);
    }

    /**
     *
     *
     * @param index
     * @param vGraph_element
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGraph_element(
            final int index,
            final org.opennms.netmgt.config.rrd.Graph_element vGraph_element)
    throws java.lang.IndexOutOfBoundsException {
        this._graph_elementList.add(index, vGraph_element);
    }

    /**
     * Method enumerateGraph_element.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.rrd.Graph_element> enumerateGraph_element(
    ) {
        return java.util.Collections.enumeration(this._graph_elementList);
    }

    /**
     * Method getGraph_element.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.rrd.Graph_element at the given inde
     */
    public org.opennms.netmgt.config.rrd.Graph_element getGraph_element(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._graph_elementList.size()) {
            throw new IndexOutOfBoundsException("getGraph_element: Index value '" + index + "' not in range [0.." + (this._graph_elementList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.rrd.Graph_element) _graph_elementList.get(index);
    }

    /**
     * Method getGraph_element.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.rrd.Graph_element[] getGraph_element(
    ) {
        org.opennms.netmgt.config.rrd.Graph_element[] array = new org.opennms.netmgt.config.rrd.Graph_element[0];
        return (org.opennms.netmgt.config.rrd.Graph_element[]) this._graph_elementList.toArray(array);
    }

    /**
     * Method getGraph_elementCollection.Returns a reference to
     * '_graph_elementList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.rrd.Graph_element> getGraph_elementCollection(
    ) {
        return this._graph_elementList;
    }

    /**
     * Method getGraph_elementCount.
     *
     * @return the size of this collection
     */
    public int getGraph_elementCount(
    ) {
        return this._graph_elementList.size();
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
     * Method iterateGraph_element.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.rrd.Graph_element> iterateGraph_element(
    ) {
        return this._graph_elementList.iterator();
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
    public void removeAllGraph_element(
    ) {
        this._graph_elementList.clear();
    }

    /**
     * Method removeGraph_element.
     *
     * @param vGraph_element
     * @return true if the object was removed from the collection.
     */
    public boolean removeGraph_element(
            final org.opennms.netmgt.config.rrd.Graph_element vGraph_element) {
        boolean removed = _graph_elementList.remove(vGraph_element);
        return removed;
    }

    /**
     * Method removeGraph_elementAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.rrd.Graph_element removeGraph_elementAt(
            final int index) {
        java.lang.Object obj = this._graph_elementList.remove(index);
        return (org.opennms.netmgt.config.rrd.Graph_element) obj;
    }

    /**
     *
     *
     * @param index
     * @param vGraph_element
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGraph_element(
            final int index,
            final org.opennms.netmgt.config.rrd.Graph_element vGraph_element)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._graph_elementList.size()) {
            throw new IndexOutOfBoundsException("setGraph_element: Index value '" + index + "' not in range [0.." + (this._graph_elementList.size() - 1) + "]");
        }

        this._graph_elementList.set(index, vGraph_element);
    }

    /**
     *
     *
     * @param vGraph_elementArray
     */
    public void setGraph_element(
            final org.opennms.netmgt.config.rrd.Graph_element[] vGraph_elementArray) {
        //-- copy array
        _graph_elementList.clear();

        for (int i = 0; i < vGraph_elementArray.length; i++) {
                this._graph_elementList.add(vGraph_elementArray[i]);
        }
    }

    /**
     * Sets the value of '_graph_elementList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vGraph_elementList the Vector to copy.
     */
    public void setGraph_element(
            final java.util.List<org.opennms.netmgt.config.rrd.Graph_element> vGraph_elementList) {
        // copy vector
        this._graph_elementList.clear();

        this._graph_elementList.addAll(vGraph_elementList);
    }

    /**
     * Sets the value of '_graph_elementList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param graph_elementList the Vector to set.
     */
    public void setGraph_elementCollection(
            final java.util.List<org.opennms.netmgt.config.rrd.Graph_element> graph_elementList) {
        this._graph_elementList = graph_elementList;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.rrd.Graph
     */
    public static org.opennms.netmgt.config.rrd.Graph unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.Graph) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.Graph.class, reader);
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
