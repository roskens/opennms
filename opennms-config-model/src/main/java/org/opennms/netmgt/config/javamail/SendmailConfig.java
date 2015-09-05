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
package org.opennms.netmgt.config.javamail;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This entity defines the test for sending mail. Attributes are
 * used to
 *  derive values of java mail properties, or, they can be
 * specified directly
 *  as key value pairs. Attributes will are easier to read but
 * there isn't
 *  an attribute for every javamail property possible (some are
 * fairly obscure).
 *
 *
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="sendmail-config")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("javamail-configuration.xsd")
@SuppressWarnings("all") public class SendmailConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _debug.
     */
    @XmlAttribute(name="debug")
    private Boolean _debug = true;

    /**
     * Field _useAuthentication.
     */
    @XmlAttribute(name="use-authentication")
    private Boolean _useAuthentication = false;

    /**
     * Field _useJmta.
     */
    @XmlAttribute(name="use-jmta")
    private Boolean _useJmta = true;

    /**
     * Field _attemptInterval.
     */
    @XmlAttribute(name="attempt-interval")
    private Integer _attemptInterval;

    /**
     * Field _name.
     */
    @XmlAttribute(name="name", required = true)
    private java.lang.String _name;

    /**
     * Use these name value pairs to configure free-form properties
     * from the JavaMail class.
     *
     *
     */
    @XmlElement(name="javamail-property")
    private java.util.List<org.opennms.netmgt.config.javamail.JavamailProperty> _javamailPropertyList;

    /**
     * Configuration for a sendmail host
     *
     *
     */
    @XmlElement(name="sendmail-host")
    private org.opennms.netmgt.config.javamail.SendmailHost _sendmailHost;

    /**
     * Basically attributes that help setup the javamailer's
     * confusion set of properties.
     *
     *
     */
    @XmlElement(name="sendmail-protocol")
    private org.opennms.netmgt.config.javamail.SendmailProtocol _sendmailProtocol;

    /**
     * Define the To, From, Subject, and body of a message. If not
     * defined, one will be defined
     *  for your benefit (or confusion ;-)
     *
     *
     */
    @XmlElement(name="sendmail-message")
    private org.opennms.netmgt.config.javamail.SendmailMessage _sendmailMessage;

    /**
     * Configure user based authentication.
     *
     *
     */
    @XmlElement(name="user-auth")
    private org.opennms.netmgt.config.javamail.UserAuth _userAuth;


      //----------------/
     //- Constructors -/
    //----------------/

    public SendmailConfig() {
        super();
        this._javamailPropertyList = new java.util.ArrayList<org.opennms.netmgt.config.javamail.JavamailProperty>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     *
     *
     * @param vJavamailProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJavamailProperty(
            final org.opennms.netmgt.config.javamail.JavamailProperty vJavamailProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._javamailPropertyList.add(vJavamailProperty);
    }

    /**
     *
     *
     * @param index
     * @param vJavamailProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJavamailProperty(
            final int index,
            final org.opennms.netmgt.config.javamail.JavamailProperty vJavamailProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._javamailPropertyList.add(index, vJavamailProperty);
    }

    /**
     */
    public void deleteAttemptInterval(
    ) {
        this._attemptInterval = null;
    }

    /**
     */
    public void deleteDebug(
    ) {
        this._debug = null;
    }

    /**
     */
    public void deleteUseAuthentication(
    ) {
        this._useAuthentication = null;
    }

    /**
     */
    public void deleteUseJmta(
    ) {
        this._useJmta = null;
    }

    /**
     * Method enumerateJavamailProperty.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.javamail.JavamailProperty> enumerateJavamailProperty(
    ) {
        return java.util.Collections.enumeration(this._javamailPropertyList);
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

        if (obj instanceof SendmailConfig) {

            SendmailConfig temp = (SendmailConfig)obj;
            if (this._debug != null) {
                if (temp._debug == null) return false;
                else if (!(this._debug.equals(temp._debug)))
                    return false;
            }
            else if (temp._debug != null)
                return false;
            if (this._useAuthentication != null) {
                if (temp._useAuthentication == null) return false;
                else if (!(this._useAuthentication.equals(temp._useAuthentication)))
                    return false;
            }
            else if (temp._useAuthentication != null)
                return false;
            if (this._useJmta != null) {
                if (temp._useJmta == null) return false;
                else if (!(this._useJmta.equals(temp._useJmta)))
                    return false;
            }
            else if (temp._useJmta != null)
                return false;
            if (this._attemptInterval != null) {
                if (temp._attemptInterval == null) return false;
                else if (!(this._attemptInterval.equals(temp._attemptInterval)))
                    return false;
            }
            else if (temp._attemptInterval != null)
                return false;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._javamailPropertyList != null) {
                if (temp._javamailPropertyList == null) return false;
                else if (!(this._javamailPropertyList.equals(temp._javamailPropertyList)))
                    return false;
            }
            else if (temp._javamailPropertyList != null)
                return false;
            if (this._sendmailHost != null) {
                if (temp._sendmailHost == null) return false;
                else if (!(this._sendmailHost.equals(temp._sendmailHost)))
                    return false;
            }
            else if (temp._sendmailHost != null)
                return false;
            if (this._sendmailProtocol != null) {
                if (temp._sendmailProtocol == null) return false;
                else if (!(this._sendmailProtocol.equals(temp._sendmailProtocol)))
                    return false;
            }
            else if (temp._sendmailProtocol != null)
                return false;
            if (this._sendmailMessage != null) {
                if (temp._sendmailMessage == null) return false;
                else if (!(this._sendmailMessage.equals(temp._sendmailMessage)))
                    return false;
            }
            else if (temp._sendmailMessage != null)
                return false;
            if (this._userAuth != null) {
                if (temp._userAuth == null) return false;
                else if (!(this._userAuth.equals(temp._userAuth)))
                    return false;
            }
            else if (temp._userAuth != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'attemptInterval'.
     *
     * @return the value of field 'AttemptInterval'.
     */
    public Integer getAttemptInterval(
    ) {
        return this._attemptInterval == null ? 3000 : this._attemptInterval;
    }

    /**
     * Returns the value of field 'debug'.
     *
     * @return the value of field 'Debug'.
     */
    public Boolean getDebug(
    ) {
        return this._debug == null ? true : this._debug;
    }

    /**
     * Method getJavamailProperty.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.javamail.JavamailProperty at the
     * given index
     */
    public org.opennms.netmgt.config.javamail.JavamailProperty getJavamailProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._javamailPropertyList.size()) {
            throw new IndexOutOfBoundsException("getJavamailProperty: Index value '" + index + "' not in range [0.." + (this._javamailPropertyList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.javamail.JavamailProperty) _javamailPropertyList.get(index);
    }

    /**
     * Method getJavamailProperty.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.javamail.JavamailProperty[] getJavamailProperty(
    ) {
        org.opennms.netmgt.config.javamail.JavamailProperty[] array = new org.opennms.netmgt.config.javamail.JavamailProperty[0];
        return (org.opennms.netmgt.config.javamail.JavamailProperty[]) this._javamailPropertyList.toArray(array);
    }

    /**
     * Method getJavamailPropertyCollection.Returns a reference to
     * '_javamailPropertyList'. No type checking is performed on
     * any modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.javamail.JavamailProperty> getJavamailPropertyCollection(
    ) {
        return this._javamailPropertyList;
    }

    /**
     * Method getJavamailPropertyCount.
     *
     * @return the size of this collection
     */
    public Integer getJavamailPropertyCount(
    ) {
        return this._javamailPropertyList.size();
    }

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'sendmailHost'. The field
     * 'sendmailHost' has the following description: Configuration
     * for a sendmail host
     *
     *
     *
     * @return the value of field 'SendmailHost'.
     */
    public org.opennms.netmgt.config.javamail.SendmailHost getSendmailHost(
    ) {
        return this._sendmailHost;
    }

    /**
     * Returns the value of field 'sendmailMessage'. The field
     * 'sendmailMessage' has the following description: Define the
     * To, From, Subject, and body of a message. If not defined,
     * one will be defined
     *  for your benefit (or confusion ;-)
     *
     *
     *
     * @return the value of field 'SendmailMessage'.
     */
    public org.opennms.netmgt.config.javamail.SendmailMessage getSendmailMessage(
    ) {
        return this._sendmailMessage;
    }

    /**
     * Returns the value of field 'sendmailProtocol'. The field
     * 'sendmailProtocol' has the following description: Basically
     * attributes that help setup the javamailer's confusion set of
     * properties.
     *
     *
     *
     * @return the value of field 'SendmailProtocol'.
     */
    public org.opennms.netmgt.config.javamail.SendmailProtocol getSendmailProtocol(
    ) {
        return this._sendmailProtocol;
    }

    /**
     * Returns the value of field 'useAuthentication'.
     *
     * @return the value of field 'UseAuthentication'.
     */
    public Boolean getUseAuthentication(
    ) {
        return this._useAuthentication == null ? false : this._useAuthentication;
    }

    /**
     * Returns the value of field 'useJmta'.
     *
     * @return the value of field 'UseJmta'.
     */
    public Boolean getUseJmta(
    ) {
        return this._useJmta == null ? true : this._useJmta;
    }

    /**
     * Returns the value of field 'userAuth'. The field 'userAuth'
     * has the following description: Configure user based
     * authentication.
     *
     *
     *
     * @return the value of field 'UserAuth'.
     */
    public org.opennms.netmgt.config.javamail.UserAuth getUserAuth(
    ) {
        return this._userAuth;
    }

    /**
     * Method hasAttemptInterval.
     *
     * @return true if at least one AttemptInterval has been added
     */
    public boolean hasAttemptInterval(
    ) {
        return this._attemptInterval != null;
    }

    /**
     * Method hasDebug.
     *
     * @return true if at least one Debug has been added
     */
    public boolean hasDebug(
    ) {
        return this._debug != null;
    }

    /**
     * Method hasUseAuthentication.
     *
     * @return true if at least one UseAuthentication has been added
     */
    public boolean hasUseAuthentication(
    ) {
        return this._useAuthentication != null;
    }

    /**
     * Method hasUseJmta.
     *
     * @return true if at least one UseJmta has been added
     */
    public boolean hasUseJmta(
    ) {
        return this._useJmta != null;
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
        if (_debug != null) {
           result = 37 * result + _debug.hashCode();
        }
        if (_useAuthentication != null) {
           result = 37 * result + _useAuthentication.hashCode();
        }
        if (_useJmta != null) {
           result = 37 * result + _useJmta.hashCode();
        }
        if (_attemptInterval != null) {
           result = 37 * result + _attemptInterval.hashCode();
        }
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_javamailPropertyList != null) {
           result = 37 * result + _javamailPropertyList.hashCode();
        }
        if (_sendmailHost != null) {
           result = 37 * result + _sendmailHost.hashCode();
        }
        if (_sendmailProtocol != null) {
           result = 37 * result + _sendmailProtocol.hashCode();
        }
        if (_sendmailMessage != null) {
           result = 37 * result + _sendmailMessage.hashCode();
        }
        if (_userAuth != null) {
           result = 37 * result + _userAuth.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'debug'.
     *
     * @return the value of field 'Debug'.
     */
    public boolean isDebug(
    ) {
        return this._debug;
    }

    /**
     * Returns the value of field 'useAuthentication'.
     *
     * @return the value of field 'UseAuthentication'.
     */
    public boolean isUseAuthentication(
    ) {
        return this._useAuthentication;
    }

    /**
     * Returns the value of field 'useJmta'.
     *
     * @return the value of field 'UseJmta'.
     */
    public boolean isUseJmta(
    ) {
        return this._useJmta;
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
     * Method iterateJavamailProperty.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.javamail.JavamailProperty> iterateJavamailProperty(
    ) {
        return this._javamailPropertyList.iterator();
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
    public void removeAllJavamailProperty(
    ) {
        this._javamailPropertyList.clear();
    }

    /**
     * Method removeJavamailProperty.
     *
     * @param vJavamailProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeJavamailProperty(
            final org.opennms.netmgt.config.javamail.JavamailProperty vJavamailProperty) {
        boolean removed = _javamailPropertyList.remove(vJavamailProperty);
        return removed;
    }

    /**
     * Method removeJavamailPropertyAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.javamail.JavamailProperty removeJavamailPropertyAt(
            final int index) {
        java.lang.Object obj = this._javamailPropertyList.remove(index);
        return (org.opennms.netmgt.config.javamail.JavamailProperty) obj;
    }

    /**
     * Sets the value of field 'attemptInterval'.
     *
     * @param attemptInterval the value of field 'attemptInterval'.
     */
    public void setAttemptInterval(
            final Integer attemptInterval) {
        this._attemptInterval = attemptInterval;
    }

    /**
     * Sets the value of field 'debug'.
     *
     * @param debug the value of field 'debug'.
     */
    public void setDebug(
            final Boolean debug) {
        this._debug = debug;
    }

    /**
     *
     *
     * @param index
     * @param vJavamailProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJavamailProperty(
            final int index,
            final org.opennms.netmgt.config.javamail.JavamailProperty vJavamailProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._javamailPropertyList.size()) {
            throw new IndexOutOfBoundsException("setJavamailProperty: Index value '" + index + "' not in range [0.." + (this._javamailPropertyList.size() - 1) + "]");
        }

        this._javamailPropertyList.set(index, vJavamailProperty);
    }

    /**
     *
     *
     * @param vJavamailPropertyArray
     */
    public void setJavamailProperty(
            final org.opennms.netmgt.config.javamail.JavamailProperty[] vJavamailPropertyArray) {
        //-- copy array
        _javamailPropertyList.clear();

        for (int i = 0; i < vJavamailPropertyArray.length; i++) {
                this._javamailPropertyList.add(vJavamailPropertyArray[i]);
        }
    }

    /**
     * Sets the value of '_javamailPropertyList' by copying the
     * given Vector. All elements will be checked for type safety.
     *
     * @param vJavamailPropertyList the Vector to copy.
     */
    public void setJavamailProperty(
            final java.util.List<org.opennms.netmgt.config.javamail.JavamailProperty> vJavamailPropertyList) {
        // copy vector
        this._javamailPropertyList.clear();

        this._javamailPropertyList.addAll(vJavamailPropertyList);
    }

    /**
     * Sets the value of '_javamailPropertyList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     *
     * @param javamailPropertyList the Vector to set.
     */
    public void setJavamailPropertyCollection(
            final java.util.List<org.opennms.netmgt.config.javamail.JavamailProperty> javamailPropertyList) {
        this._javamailPropertyList = javamailPropertyList;
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
     * Sets the value of field 'sendmailHost'. The field
     * 'sendmailHost' has the following description: Configuration
     * for a sendmail host
     *
     *
     *
     * @param sendmailHost the value of field 'sendmailHost'.
     */
    public void setSendmailHost(
            final org.opennms.netmgt.config.javamail.SendmailHost sendmailHost) {
        this._sendmailHost = sendmailHost;
    }

    /**
     * Sets the value of field 'sendmailMessage'. The field
     * 'sendmailMessage' has the following description: Define the
     * To, From, Subject, and body of a message. If not defined,
     * one will be defined
     *  for your benefit (or confusion ;-)
     *
     *
     *
     * @param sendmailMessage the value of field 'sendmailMessage'.
     */
    public void setSendmailMessage(
            final org.opennms.netmgt.config.javamail.SendmailMessage sendmailMessage) {
        this._sendmailMessage = sendmailMessage;
    }

    /**
     * Sets the value of field 'sendmailProtocol'. The field
     * 'sendmailProtocol' has the following description: Basically
     * attributes that help setup the javamailer's confusion set of
     * properties.
     *
     *
     *
     * @param sendmailProtocol the value of field 'sendmailProtocol'
     */
    public void setSendmailProtocol(
            final org.opennms.netmgt.config.javamail.SendmailProtocol sendmailProtocol) {
        this._sendmailProtocol = sendmailProtocol;
    }

    /**
     * Sets the value of field 'useAuthentication'.
     *
     * @param useAuthentication the value of field
     * 'useAuthentication'.
     */
    public void setUseAuthentication(
            final Boolean useAuthentication) {
        this._useAuthentication = useAuthentication;
    }

    /**
     * Sets the value of field 'useJmta'.
     *
     * @param useJmta the value of field 'useJmta'.
     */
    public void setUseJmta(
            final Boolean useJmta) {
        this._useJmta = useJmta;
    }

    /**
     * Sets the value of field 'userAuth'. The field 'userAuth' has
     * the following description: Configure user based
     * authentication.
     *
     *
     *
     * @param userAuth the value of field 'userAuth'.
     */
    public void setUserAuth(
            final org.opennms.netmgt.config.javamail.UserAuth userAuth) {
        this._userAuth = userAuth;
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
     * org.opennms.netmgt.config.javamail.SendmailConfig
     */
    public static org.opennms.netmgt.config.javamail.SendmailConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.SendmailConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.SendmailConfig.class, reader);
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
