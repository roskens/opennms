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
package org.opennms.netmgt.config.destinationPaths;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Target.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "target")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("destinationPaths.xsd")
@SuppressWarnings("all")
public class Target implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _interval.
     */
    @XmlAttribute(name = "interval")
    private java.lang.String _interval;

    /**
     * Field _name.
     */
    @XmlElement(name = "name", required = true)
    private java.lang.String _name;

    /**
     * Field _autoNotify.
     */
    @XmlElement(name = "autoNotify")
    private java.lang.String _autoNotify;

    /**
     * Field _commandList.
     */
    @XmlElement(name = "command", required = true)
    private java.util.List<java.lang.String> _commandList;

      //----------------/
    //- Constructors -/
    //----------------/
    public Target() {
        super();
        this._commandList = new java.util.ArrayList<java.lang.String>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vCommand
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCommand(
            final java.lang.String vCommand)
            throws java.lang.IndexOutOfBoundsException {
        this._commandList.add(vCommand);
    }

    /**
     *
     *
     * @param index
     * @param vCommand
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCommand(
            final int index,
            final java.lang.String vCommand)
            throws java.lang.IndexOutOfBoundsException {
        this._commandList.add(index, vCommand);
    }

    /**
     * Method enumerateCommand.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateCommand() {
        return java.util.Collections.enumeration(this._commandList);
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
        if (this == obj) {
            return true;
        }

        if (obj instanceof Target) {

            Target temp = (Target) obj;
            if (this._interval != null) {
                if (temp._interval == null) {
                    return false;
                } else if (!(this._interval.equals(temp._interval))) {
                    return false;
                }
            } else if (temp._interval != null) {
                return false;
            }
            if (this._name != null) {
                if (temp._name == null) {
                    return false;
                } else if (!(this._name.equals(temp._name))) {
                    return false;
                }
            } else if (temp._name != null) {
                return false;
            }
            if (this._autoNotify != null) {
                if (temp._autoNotify == null) {
                    return false;
                } else if (!(this._autoNotify.equals(temp._autoNotify))) {
                    return false;
                }
            } else if (temp._autoNotify != null) {
                return false;
            }
            if (this._commandList != null) {
                if (temp._commandList == null) {
                    return false;
                } else if (!(this._commandList.equals(temp._commandList))) {
                    return false;
                }
            } else if (temp._commandList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'autoNotify'.
     *
     * @return the value of field 'AutoNotify'.
     */
    public java.lang.String getAutoNotify() {
        return this._autoNotify;
    }

    /**
     * Method getCommand.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getCommand(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._commandList.size()) {
            throw new IndexOutOfBoundsException("getCommand: Index value '" + index + "' not in range [0.." + (this._commandList.size() - 1) + "]");
        }

        return (java.lang.String) _commandList.get(index);
    }

    /**
     * Method getCommand.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getCommand() {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._commandList.toArray(array);
    }

    /**
     * Method getCommandCollection.Returns a reference to
     * '_commandList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getCommandCollection() {
        return this._commandList;
    }

    /**
     * Method getCommandCount.
     *
     * @return the size of this collection
     */
    public int getCommandCount() {
        return this._commandList.size();
    }

    /**
     * Returns the value of field 'interval'.
     *
     * @return the value of field 'Interval'.
     */
    public java.lang.String getInterval() {
        return this._interval == null ? "0s" : this._interval;
    }

    /**
     * Returns the value of field 'name'.
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
        if (_interval != null) {
            result = 37 * result + _interval.hashCode();
        }
        if (_name != null) {
            result = 37 * result + _name.hashCode();
        }
        if (_autoNotify != null) {
            result = 37 * result + _autoNotify.hashCode();
        }
        if (_commandList != null) {
            result = 37 * result + _commandList.hashCode();
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
     * Method iterateCommand.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateCommand() {
        return this._commandList.iterator();
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
    public void removeAllCommand() {
        this._commandList.clear();
    }

    /**
     * Method removeCommand.
     *
     * @param vCommand
     * @return true if the object was removed from the collection.
     */
    public boolean removeCommand(
            final java.lang.String vCommand) {
        boolean removed = _commandList.remove(vCommand);
        return removed;
    }

    /**
     * Method removeCommandAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeCommandAt(
            final int index) {
        java.lang.Object obj = this._commandList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'autoNotify'.
     *
     * @param autoNotify the value of field 'autoNotify'.
     */
    public void setAutoNotify(
            final java.lang.String autoNotify) {
        this._autoNotify = autoNotify;
    }

    /**
     *
     *
     * @param index
     * @param vCommand
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCommand(
            final int index,
            final java.lang.String vCommand)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._commandList.size()) {
            throw new IndexOutOfBoundsException("setCommand: Index value '" + index + "' not in range [0.." + (this._commandList.size() - 1) + "]");
        }

        this._commandList.set(index, vCommand);
    }

    /**
     *
     *
     * @param vCommandArray
     */
    public void setCommand(
            final java.lang.String[] vCommandArray) {
        //-- copy array
        _commandList.clear();

        for (int i = 0; i < vCommandArray.length; i++) {
            this._commandList.add(vCommandArray[i]);
        }
    }

    /**
     * Sets the value of '_commandList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vCommandList the Vector to copy.
     */
    public void setCommand(
            final java.util.List<java.lang.String> vCommandList) {
        // copy vector
        this._commandList.clear();

        this._commandList.addAll(vCommandList);
    }

    /**
     * Sets the value of '_commandList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param commandList the Vector to set.
     */
    public void setCommandCollection(
            final java.util.List<java.lang.String> commandList) {
        this._commandList = commandList;
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
     * Sets the value of field 'name'.
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
     * org.opennms.netmgt.config.destinationPaths.Target
     */
    public static org.opennms.netmgt.config.destinationPaths.Target unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.destinationPaths.Target) Unmarshaller.unmarshal(org.opennms.netmgt.config.destinationPaths.Target.class, reader);
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
