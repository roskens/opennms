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
 * Class AutoAcknowledge.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "auto-acknowledge")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("notifd-configuration.xsd")
@SuppressWarnings("all")
public class AutoAcknowledge implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _resolutionPrefix.
     */
    @XmlAttribute(name = "resolution-prefix")
    private java.lang.String _resolutionPrefix;
    private static final String DEFAULT_RESOLUTION_PREFIX = "RESOLVED: ";

    /**
     * Field _uei.
     */
    @XmlAttribute(name = "uei", required = true)
    private java.lang.String _uei;

    /**
     * Field _acknowledge.
     */
    @XmlAttribute(name = "acknowledge", required = true)
    private java.lang.String _acknowledge;

    /**
     * Field _notify.
     */
    @XmlAttribute(name = "notify")
    private Boolean _notify;

    /**
     * Field _matchList.
     */
    @XmlElement(name = "match")
    private java.util.List<java.lang.String> _matchList;

      //----------------/
    //- Constructors -/
    //----------------/
    public AutoAcknowledge() {
        super();
        this._matchList = new java.util.ArrayList<java.lang.String>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMatch(
            final java.lang.String vMatch)
            throws java.lang.IndexOutOfBoundsException {
        this._matchList.add(vMatch);
    }

    /**
     *
     *
     * @param index
     * @param vMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMatch(
            final int index,
            final java.lang.String vMatch)
            throws java.lang.IndexOutOfBoundsException {
        this._matchList.add(index, vMatch);
    }

    /**
     */
    public void deleteNotify() {
        this._notify = null;
    }

    /**
     * Method enumerateMatch.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateMatch() {
        return java.util.Collections.enumeration(this._matchList);
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

        if (obj instanceof AutoAcknowledge) {

            AutoAcknowledge temp = (AutoAcknowledge) obj;
            if (this._resolutionPrefix != null) {
                if (temp._resolutionPrefix == null) {
                    return false;
                } else if (!(this._resolutionPrefix.equals(temp._resolutionPrefix))) {
                    return false;
                }
            } else if (temp._resolutionPrefix != null) {
                return false;
            }
            if (this._uei != null) {
                if (temp._uei == null) {
                    return false;
                } else if (!(this._uei.equals(temp._uei))) {
                    return false;
                }
            } else if (temp._uei != null) {
                return false;
            }
            if (this._acknowledge != null) {
                if (temp._acknowledge == null) {
                    return false;
                } else if (!(this._acknowledge.equals(temp._acknowledge))) {
                    return false;
                }
            } else if (temp._acknowledge != null) {
                return false;
            }
            if (this._notify != null) {
                if (temp._notify == null) {
                    return false;
                } else if (!(this._notify.equals(temp._notify))) {
                    return false;
                }
            } else if (temp._notify != null) {
                return false;
            }
            if (this._matchList != null) {
                if (temp._matchList == null) {
                    return false;
                } else if (!(this._matchList.equals(temp._matchList))) {
                    return false;
                }
            } else if (temp._matchList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'acknowledge'.
     *
     * @return the value of field 'Acknowledge'.
     */
    public java.lang.String getAcknowledge() {
        return this._acknowledge;
    }

    /**
     * Method getMatch.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getMatch(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._matchList.size()) {
            throw new IndexOutOfBoundsException("getMatch: Index value '" + index + "' not in range [0.." + (this._matchList.size() - 1) + "]");
        }

        return (java.lang.String) _matchList.get(index);
    }

    /**
     * Method getMatch.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getMatch() {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._matchList.toArray(array);
    }

    /**
     * Method getMatchCollection.Returns a reference to
     * '_matchList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getMatchCollection() {
        return this._matchList;
    }

    /**
     * Method getMatchCount.
     *
     * @return the size of this collection
     */
    public int getMatchCount() {
        return this._matchList.size();
    }

    /**
     * Returns the value of field 'notify'.
     *
     * @return the value of field 'Notify'.
     */
    public Boolean getNotify() {
        return this._notify == null ? true : this._notify;
    }

    /**
     * Returns the value of field 'resolutionPrefix'.
     *
     * @return the value of field 'ResolutionPrefix'.
     */
    public java.lang.String getResolutionPrefix() {
        return this._resolutionPrefix == null ? DEFAULT_RESOLUTION_PREFIX : this._resolutionPrefix;
    }

    /**
     * Returns the value of field 'uei'.
     *
     * @return the value of field 'Uei'.
     */
    public java.lang.String getUei() {
        return this._uei;
    }

    /**
     * Method hasNotify.
     *
     * @return true if at least one Notify has been added
     */
    public boolean hasNotify() {
        return this._notify != null;
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
        if (_resolutionPrefix != null) {
            result = 37 * result + _resolutionPrefix.hashCode();
        }
        if (_uei != null) {
            result = 37 * result + _uei.hashCode();
        }
        if (_acknowledge != null) {
            result = 37 * result + _acknowledge.hashCode();
        }
        if (_notify != null) {
            result = 37 * result + _notify.hashCode();
        }
        if (_matchList != null) {
            result = 37 * result + _matchList.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'notify'.
     *
     * @return the value of field 'Notify'.
     */
    public boolean isNotify() {
        return this._notify;
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
     * Method iterateMatch.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateMatch() {
        return this._matchList.iterator();
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
    public void removeAllMatch() {
        this._matchList.clear();
    }

    /**
     * Method removeMatch.
     *
     * @param vMatch
     * @return true if the object was removed from the collection.
     */
    public boolean removeMatch(
            final java.lang.String vMatch) {
        boolean removed = _matchList.remove(vMatch);
        return removed;
    }

    /**
     * Method removeMatchAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeMatchAt(
            final int index) {
        java.lang.Object obj = this._matchList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'acknowledge'.
     *
     * @param acknowledge the value of field 'acknowledge'.
     */
    public void setAcknowledge(
            final java.lang.String acknowledge) {
        this._acknowledge = acknowledge;
    }

    /**
     *
     *
     * @param index
     * @param vMatch
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMatch(
            final int index,
            final java.lang.String vMatch)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._matchList.size()) {
            throw new IndexOutOfBoundsException("setMatch: Index value '" + index + "' not in range [0.." + (this._matchList.size() - 1) + "]");
        }

        this._matchList.set(index, vMatch);
    }

    /**
     *
     *
     * @param vMatchArray
     */
    public void setMatch(
            final java.lang.String[] vMatchArray) {
        //-- copy array
        _matchList.clear();

        for (int i = 0; i < vMatchArray.length; i++) {
            this._matchList.add(vMatchArray[i]);
        }
    }

    /**
     * Sets the value of '_matchList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vMatchList the Vector to copy.
     */
    public void setMatch(
            final java.util.List<java.lang.String> vMatchList) {
        // copy vector
        this._matchList.clear();

        this._matchList.addAll(vMatchList);
    }

    /**
     * Sets the value of '_matchList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param matchList the Vector to set.
     */
    public void setMatchCollection(
            final java.util.List<java.lang.String> matchList) {
        this._matchList = matchList;
    }

    /**
     * Sets the value of field 'notify'.
     *
     * @param notify the value of field 'notify'.
     */
    public void setNotify(
            final Boolean notify) {
        this._notify = notify;
    }

    /**
     * Sets the value of field 'resolutionPrefix'.
     *
     * @param resolutionPrefix the value of field 'resolutionPrefix'
     */
    public void setResolutionPrefix(
            final java.lang.String resolutionPrefix) {
        this._resolutionPrefix = resolutionPrefix;
    }

    /**
     * Sets the value of field 'uei'.
     *
     * @param uei the value of field 'uei'.
     */
    public void setUei(
            final java.lang.String uei) {
        this._uei = uei;
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
     * org.opennms.netmgt.config.notifd.AutoAcknowledge
     */
    public static org.opennms.netmgt.config.notifd.AutoAcknowledge unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifd.AutoAcknowledge) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifd.AutoAcknowledge.class, reader);
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
