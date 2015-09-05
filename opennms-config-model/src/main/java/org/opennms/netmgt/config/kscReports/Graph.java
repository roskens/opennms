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
package org.opennms.netmgt.config.kscReports;

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
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="graph")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("ksc-performance-reports.xsd")
@SuppressWarnings("all") public class Graph implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _title.
     */
    @XmlAttribute(name="title", required = true)
    private java.lang.String _title;

    /**
     * Field _resourceId.
     */
    @XmlAttribute(name="resourceId")
    private java.lang.String _resourceId;

    /**
     * Field _nodeId.
     */
    @XmlAttribute(name="nodeId")
    private java.lang.String _nodeId;

    /**
     * Field _nodeSource.
     */
    @XmlAttribute(name="nodeSource")
    private java.lang.String _nodeSource;

    /**
     * Field _domain.
     */
    @XmlAttribute(name="domain")
    private java.lang.String _domain;

    /**
     * Field _interfaceId.
     */
    @XmlAttribute(name="interfaceId")
    private java.lang.String _interfaceId;

    /**
     * Field _timespan.
     */
    @XmlAttribute(name="timespan", required = true)
    private java.lang.String _timespan;

    /**
     * Field _graphtype.
     */
    @XmlAttribute(name="graphttype", required = true)
    private java.lang.String _graphtype;

    /**
     * Field _extlink.
     */
    @XmlAttribute(name="extlink")
    private java.lang.String _extlink;


      //----------------/
     //- Constructors -/
    //----------------/

    public Graph() {
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
        if ( this == obj )
            return true;

        if (obj instanceof Graph) {

            Graph temp = (Graph)obj;
            if (this._title != null) {
                if (temp._title == null) return false;
                else if (!(this._title.equals(temp._title)))
                    return false;
            }
            else if (temp._title != null)
                return false;
            if (this._resourceId != null) {
                if (temp._resourceId == null) return false;
                else if (!(this._resourceId.equals(temp._resourceId)))
                    return false;
            }
            else if (temp._resourceId != null)
                return false;
            if (this._nodeId != null) {
                if (temp._nodeId == null) return false;
                else if (!(this._nodeId.equals(temp._nodeId)))
                    return false;
            }
            else if (temp._nodeId != null)
                return false;
            if (this._nodeSource != null) {
                if (temp._nodeSource == null) return false;
                else if (!(this._nodeSource.equals(temp._nodeSource)))
                    return false;
            }
            else if (temp._nodeSource != null)
                return false;
            if (this._domain != null) {
                if (temp._domain == null) return false;
                else if (!(this._domain.equals(temp._domain)))
                    return false;
            }
            else if (temp._domain != null)
                return false;
            if (this._interfaceId != null) {
                if (temp._interfaceId == null) return false;
                else if (!(this._interfaceId.equals(temp._interfaceId)))
                    return false;
            }
            else if (temp._interfaceId != null)
                return false;
            if (this._timespan != null) {
                if (temp._timespan == null) return false;
                else if (!(this._timespan.equals(temp._timespan)))
                    return false;
            }
            else if (temp._timespan != null)
                return false;
            if (this._graphtype != null) {
                if (temp._graphtype == null) return false;
                else if (!(this._graphtype.equals(temp._graphtype)))
                    return false;
            }
            else if (temp._graphtype != null)
                return false;
            if (this._extlink != null) {
                if (temp._extlink == null) return false;
                else if (!(this._extlink.equals(temp._extlink)))
                    return false;
            }
            else if (temp._extlink != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'domain'.
     *
     * @return the value of field 'Domain'.
     */
    public java.lang.String getDomain(
    ) {
        return this._domain;
    }

    /**
     * Returns the value of field 'extlink'.
     *
     * @return the value of field 'Extlink'.
     */
    public java.lang.String getExtlink(
    ) {
        return this._extlink;
    }

    /**
     * Returns the value of field 'graphtype'.
     *
     * @return the value of field 'Graphtype'.
     */
    public java.lang.String getGraphtype(
    ) {
        return this._graphtype;
    }

    /**
     * Returns the value of field 'interfaceId'.
     *
     * @return the value of field 'InterfaceId'.
     */
    public java.lang.String getInterfaceId(
    ) {
        return this._interfaceId;
    }

    /**
     * Returns the value of field 'nodeId'.
     *
     * @return the value of field 'NodeId'.
     */
    public java.lang.String getNodeId(
    ) {
        return this._nodeId;
    }

    /**
     * Returns the value of field 'nodeSource'.
     *
     * @return the value of field 'NodeSource'.
     */
    public java.lang.String getNodeSource(
    ) {
        return this._nodeSource;
    }

    /**
     * Returns the value of field 'resourceId'.
     *
     * @return the value of field 'ResourceId'.
     */
    public java.lang.String getResourceId(
    ) {
        return this._resourceId;
    }

    /**
     * Returns the value of field 'timespan'.
     *
     * @return the value of field 'Timespan'.
     */
    public java.lang.String getTimespan(
    ) {
        return this._timespan;
    }

    /**
     * Returns the value of field 'title'.
     *
     * @return the value of field 'Title'.
     */
    public java.lang.String getTitle(
    ) {
        return this._title;
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
        if (_title != null) {
           result = 37 * result + _title.hashCode();
        }
        if (_resourceId != null) {
           result = 37 * result + _resourceId.hashCode();
        }
        if (_nodeId != null) {
           result = 37 * result + _nodeId.hashCode();
        }
        if (_nodeSource != null) {
           result = 37 * result + _nodeSource.hashCode();
        }
        if (_domain != null) {
           result = 37 * result + _domain.hashCode();
        }
        if (_interfaceId != null) {
           result = 37 * result + _interfaceId.hashCode();
        }
        if (_timespan != null) {
           result = 37 * result + _timespan.hashCode();
        }
        if (_graphtype != null) {
           result = 37 * result + _graphtype.hashCode();
        }
        if (_extlink != null) {
           result = 37 * result + _extlink.hashCode();
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
     * Sets the value of field 'domain'.
     *
     * @param domain the value of field 'domain'.
     */
    public void setDomain(
            final java.lang.String domain) {
        this._domain = domain;
    }

    /**
     * Sets the value of field 'extlink'.
     *
     * @param extlink the value of field 'extlink'.
     */
    public void setExtlink(
            final java.lang.String extlink) {
        this._extlink = extlink;
    }

    /**
     * Sets the value of field 'graphtype'.
     *
     * @param graphtype the value of field 'graphtype'.
     */
    public void setGraphtype(
            final java.lang.String graphtype) {
        this._graphtype = graphtype;
    }

    /**
     * Sets the value of field 'interfaceId'.
     *
     * @param interfaceId the value of field 'interfaceId'.
     */
    public void setInterfaceId(
            final java.lang.String interfaceId) {
        this._interfaceId = interfaceId;
    }

    /**
     * Sets the value of field 'nodeId'.
     *
     * @param nodeId the value of field 'nodeId'.
     */
    public void setNodeId(
            final java.lang.String nodeId) {
        this._nodeId = nodeId;
    }

    /**
     * Sets the value of field 'nodeSource'.
     *
     * @param nodeSource the value of field 'nodeSource'.
     */
    public void setNodeSource(
            final java.lang.String nodeSource) {
        this._nodeSource = nodeSource;
    }

    /**
     * Sets the value of field 'resourceId'.
     *
     * @param resourceId the value of field 'resourceId'.
     */
    public void setResourceId(
            final java.lang.String resourceId) {
        this._resourceId = resourceId;
    }

    /**
     * Sets the value of field 'timespan'.
     *
     * @param timespan the value of field 'timespan'.
     */
    public void setTimespan(
            final java.lang.String timespan) {
        this._timespan = timespan;
    }

    /**
     * Sets the value of field 'title'.
     *
     * @param title the value of field 'title'.
     */
    public void setTitle(
            final java.lang.String title) {
        this._title = title;
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
     * org.opennms.netmgt.config.kscReports.Graph
     */
    public static org.opennms.netmgt.config.kscReports.Graph unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.kscReports.Graph) Unmarshaller.unmarshal(org.opennms.netmgt.config.kscReports.Graph.class, reader);
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
