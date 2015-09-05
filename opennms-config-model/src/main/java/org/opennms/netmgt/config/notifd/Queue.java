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
package org.opennms.netmgt.config.notifd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Queue.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="queue")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("notifd-configuration.xsd")
@SuppressWarnings("all") public class Queue implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _queueId.
     */
    @XmlElement(name="queue-id")
    private java.lang.String _queueId;

    /**
     * Field _interval.
     */
    @XmlElement(name="interval")
    private java.lang.String _interval;

    /**
     * Field _handlerClass.
     */
    @XmlElement(name="handler-class")
    private org.opennms.netmgt.config.notifd.HandlerClass _handlerClass;


      //----------------/
     //- Constructors -/
    //----------------/

    public Queue() {
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

        if (obj instanceof Queue) {

            Queue temp = (Queue)obj;
            if (this._queueId != null) {
                if (temp._queueId == null) return false;
                else if (!(this._queueId.equals(temp._queueId)))
                    return false;
            }
            else if (temp._queueId != null)
                return false;
            if (this._interval != null) {
                if (temp._interval == null) return false;
                else if (!(this._interval.equals(temp._interval)))
                    return false;
            }
            else if (temp._interval != null)
                return false;
            if (this._handlerClass != null) {
                if (temp._handlerClass == null) return false;
                else if (!(this._handlerClass.equals(temp._handlerClass)))
                    return false;
            }
            else if (temp._handlerClass != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'handlerClass'.
     *
     * @return the value of field 'HandlerClass'.
     */
    public org.opennms.netmgt.config.notifd.HandlerClass getHandlerClass(
    ) {
        return this._handlerClass;
    }

    /**
     * Returns the value of field 'interval'.
     *
     * @return the value of field 'Interval'.
     */
    public java.lang.String getInterval(
    ) {
        return this._interval;
    }

    /**
     * Returns the value of field 'queueId'.
     *
     * @return the value of field 'QueueId'.
     */
    public java.lang.String getQueueId(
    ) {
        return this._queueId;
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
        if (_queueId != null) {
           result = 37 * result + _queueId.hashCode();
        }
        if (_interval != null) {
           result = 37 * result + _interval.hashCode();
        }
        if (_handlerClass != null) {
           result = 37 * result + _handlerClass.hashCode();
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
     * Sets the value of field 'handlerClass'.
     *
     * @param handlerClass the value of field 'handlerClass'.
     */
    public void setHandlerClass(
            final org.opennms.netmgt.config.notifd.HandlerClass handlerClass) {
        this._handlerClass = handlerClass;
    }

    /**
     * Sets the value of field 'interval'.
     *
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final java.lang.String interval) {
        this._interval = interval;
    }

    /**
     * Sets the value of field 'queueId'.
     *
     * @param queueId the value of field 'queueId'.
     */
    public void setQueueId(
            final java.lang.String queueId) {
        this._queueId = queueId;
    }

    /**
     * Method unmarshal.
     *
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.notifd.Queu
     */
    public static org.opennms.netmgt.config.notifd.Queue unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifd.Queue) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifd.Queue.class, reader);
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
