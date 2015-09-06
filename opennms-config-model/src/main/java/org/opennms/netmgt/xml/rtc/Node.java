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
package org.opennms.netmgt.xml.rtc;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A node
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="node")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("rtceui.xsd")
@SuppressWarnings("all") public class Node implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The node id
     */
    @XmlElement(name="nodeid")
    private Integer _nodeid;

    /**
     * The node availability value
     */
    @XmlElement(name="nodevalue")
    private Double _nodevalue;

    /**
     * The number of active services on the
     *  node
     */
    @XmlElement(name="nodesvccount")
    private Integer _nodesvccount;

    /**
     * The number of active services currently down on the
     *  node
     */
    @XmlElement(name="nodesvcdowncount")
    private Integer _nodesvcdowncount;


      //----------------/
     //- Constructors -/
    //----------------/

    public Node() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteNodeid(
    ) {
        this._nodeid = null;
    }

    /**
     */
    public void deleteNodesvccount(
    ) {
        this._nodesvccount = null;
    }

    /**
     */
    public void deleteNodesvcdowncount(
    ) {
        this._nodesvcdowncount = null;
    }

    /**
     */
    public void deleteNodevalue(
    ) {
        this._nodevalue = null;
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

        if (obj instanceof Node) {

            Node temp = (Node)obj;
            if (this._nodeid != null) {
                if (temp._nodeid == null) return false;
                else if (!(this._nodeid.equals(temp._nodeid)))
                    return false;
            }
            else if (temp._nodeid != null)
                return false;
            if (this._nodevalue != null) {
                if (temp._nodevalue == null) return false;
                else if (!(this._nodevalue.equals(temp._nodevalue)))
                    return false;
            }
            else if (temp._nodevalue != null)
                return false;
            if (this._nodesvccount != null) {
                if (temp._nodesvccount == null) return false;
                else if (!(this._nodesvccount.equals(temp._nodesvccount)))
                    return false;
            }
            else if (temp._nodesvccount != null)
                return false;
            if (this._nodesvcdowncount != null) {
                if (temp._nodesvcdowncount == null) return false;
                else if (!(this._nodesvcdowncount.equals(temp._nodesvcdowncount)))
                    return false;
            }
            else if (temp._nodesvcdowncount != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'nodeid'. The field 'nodeid' has
     * the following description: The node id
     *
     * @return the value of field 'Nodeid'.
     */
    public Integer getNodeid(
    ) {
        return this._nodeid;
    }

    /**
     * Returns the value of field 'nodesvccount'. The field
     * 'nodesvccount' has the following description: The number of
     * active services on the
     *  node
     *
     * @return the value of field 'Nodesvccount'.
     */
    public Integer getNodesvccount(
    ) {
        return this._nodesvccount;
    }

    /**
     * Returns the value of field 'nodesvcdowncount'. The field
     * 'nodesvcdowncount' has the following description: The number
     * of active services currently down on the
     *  node
     *
     * @return the value of field 'Nodesvcdowncount'.
     */
    public Integer getNodesvcdowncount(
    ) {
        return this._nodesvcdowncount;
    }

    /**
     * Returns the value of field 'nodevalue'. The field
     * 'nodevalue' has the following description: The node
     * availability value
     *
     * @return the value of field 'Nodevalue'.
     */
    public Double getNodevalue(
    ) {
        return this._nodevalue;
    }

    /**
     * Method hasNodeid.
     *
     * @return true if at least one Nodeid has been added
     */
    public boolean hasNodeid(
    ) {
        return this._nodeid != null;
    }

    /**
     * Method hasNodesvccount.
     *
     * @return true if at least one Nodesvccount has been added
     */
    public boolean hasNodesvccount(
    ) {
        return this._nodesvccount != null;
    }

    /**
     * Method hasNodesvcdowncount.
     *
     * @return true if at least one Nodesvcdowncount has been added
     */
    public boolean hasNodesvcdowncount(
    ) {
        return this._nodesvcdowncount != null;
    }

    /**
     * Method hasNodevalue.
     *
     * @return true if at least one Nodevalue has been added
     */
    public boolean hasNodevalue(
    ) {
        return this._nodevalue != null;
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
        if (_nodeid != null) {
           result = 37 * result + _nodeid.hashCode();
        }
        if (_nodevalue != null) {
           result = 37 * result + _nodevalue.hashCode();
        }
        if (_nodesvccount != null) {
           result = 37 * result + _nodesvccount.hashCode();
        }
        if (_nodesvcdowncount != null) {
           result = 37 * result + _nodesvcdowncount.hashCode();
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
     * Sets the value of field 'nodeid'. The field 'nodeid' has the
     * following description: The node id
     *
     * @param nodeid the value of field 'nodeid'.
     */
    public void setNodeid(
            final Integer nodeid) {
        this._nodeid = nodeid;
    }

    /**
     * Sets the value of field 'nodesvccount'. The field
     * 'nodesvccount' has the following description: The number of
     * active services on the
     *  node
     *
     * @param nodesvccount the value of field 'nodesvccount'.
     */
    public void setNodesvccount(
            final Integer nodesvccount) {
        this._nodesvccount = nodesvccount;
    }

    /**
     * Sets the value of field 'nodesvcdowncount'. The field
     * 'nodesvcdowncount' has the following description: The number
     * of active services currently down on the
     *  node
     *
     * @param nodesvcdowncount the value of field 'nodesvcdowncount'
     */
    public void setNodesvcdowncount(
            final Integer nodesvcdowncount) {
        this._nodesvcdowncount = nodesvcdowncount;
    }

    /**
     * Sets the value of field 'nodevalue'. The field 'nodevalue'
     * has the following description: The node availability value
     *
     * @param nodevalue the value of field 'nodevalue'.
     */
    public void setNodevalue(
            final Double nodevalue) {
        this._nodevalue = nodevalue;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.xml.rtc.Node
     */
    public static org.opennms.netmgt.xml.rtc.Node unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.xml.rtc.Node) Unmarshaller.unmarshal(org.opennms.netmgt.xml.rtc.Node.class, reader);
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
