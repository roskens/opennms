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
package org.opennms.netmgt.config.microblog;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This entity defines the parameters for a microblog service.
 *
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="microblog-profile")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("microblog-configuration.xsd")
@SuppressWarnings("all") public class MicroblogProfile implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _serviceUrl.
     */
    private java.lang.String _serviceUrl;

    /**
     * Field _authenUsername.
     */
    private java.lang.String _authenUsername;

    /**
     * Field _authenPassword.
     */
    private java.lang.String _authenPassword;

    /**
     * Field _oauthConsumerKey.
     */
    private java.lang.String _oauthConsumerKey;

    /**
     * Field _oauthConsumerSecret.
     */
    private java.lang.String _oauthConsumerSecret;

    /**
     * Field _oauthAccessToken.
     */
    private java.lang.String _oauthAccessToken;

    /**
     * Field _oauthAccessTokenSecret.
     */
    private java.lang.String _oauthAccessTokenSecret;


      //----------------/
     //- Constructors -/
    //----------------/

    public MicroblogProfile() {
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

        if (obj instanceof MicroblogProfile) {

            MicroblogProfile temp = (MicroblogProfile)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name)))
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._serviceUrl != null) {
                if (temp._serviceUrl == null) return false;
                else if (!(this._serviceUrl.equals(temp._serviceUrl)))
                    return false;
            }
            else if (temp._serviceUrl != null)
                return false;
            if (this._authenUsername != null) {
                if (temp._authenUsername == null) return false;
                else if (!(this._authenUsername.equals(temp._authenUsername)))
                    return false;
            }
            else if (temp._authenUsername != null)
                return false;
            if (this._authenPassword != null) {
                if (temp._authenPassword == null) return false;
                else if (!(this._authenPassword.equals(temp._authenPassword)))
                    return false;
            }
            else if (temp._authenPassword != null)
                return false;
            if (this._oauthConsumerKey != null) {
                if (temp._oauthConsumerKey == null) return false;
                else if (!(this._oauthConsumerKey.equals(temp._oauthConsumerKey)))
                    return false;
            }
            else if (temp._oauthConsumerKey != null)
                return false;
            if (this._oauthConsumerSecret != null) {
                if (temp._oauthConsumerSecret == null) return false;
                else if (!(this._oauthConsumerSecret.equals(temp._oauthConsumerSecret)))
                    return false;
            }
            else if (temp._oauthConsumerSecret != null)
                return false;
            if (this._oauthAccessToken != null) {
                if (temp._oauthAccessToken == null) return false;
                else if (!(this._oauthAccessToken.equals(temp._oauthAccessToken)))
                    return false;
            }
            else if (temp._oauthAccessToken != null)
                return false;
            if (this._oauthAccessTokenSecret != null) {
                if (temp._oauthAccessTokenSecret == null) return false;
                else if (!(this._oauthAccessTokenSecret.equals(temp._oauthAccessTokenSecret)))
                    return false;
            }
            else if (temp._oauthAccessTokenSecret != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'authenPassword'.
     *
     * @return the value of field 'AuthenPassword'.
     */
    public java.lang.String getAuthenPassword(
    ) {
        return this._authenPassword;
    }

    /**
     * Returns the value of field 'authenUsername'.
     *
     * @return the value of field 'AuthenUsername'.
     */
    public java.lang.String getAuthenUsername(
    ) {
        return this._authenUsername;
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
     * Returns the value of field 'oauthAccessToken'.
     *
     * @return the value of field 'OauthAccessToken'.
     */
    public java.lang.String getOauthAccessToken(
    ) {
        return this._oauthAccessToken;
    }

    /**
     * Returns the value of field 'oauthAccessTokenSecret'.
     *
     * @return the value of field 'OauthAccessTokenSecret'.
     */
    public java.lang.String getOauthAccessTokenSecret(
    ) {
        return this._oauthAccessTokenSecret;
    }

    /**
     * Returns the value of field 'oauthConsumerKey'.
     *
     * @return the value of field 'OauthConsumerKey'.
     */
    public java.lang.String getOauthConsumerKey(
    ) {
        return this._oauthConsumerKey;
    }

    /**
     * Returns the value of field 'oauthConsumerSecret'.
     *
     * @return the value of field 'OauthConsumerSecret'.
     */
    public java.lang.String getOauthConsumerSecret(
    ) {
        return this._oauthConsumerSecret;
    }

    /**
     * Returns the value of field 'serviceUrl'.
     *
     * @return the value of field 'ServiceUrl'.
     */
    public java.lang.String getServiceUrl(
    ) {
        return this._serviceUrl;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_serviceUrl != null) {
           result = 37 * result + _serviceUrl.hashCode();
        }
        if (_authenUsername != null) {
           result = 37 * result + _authenUsername.hashCode();
        }
        if (_authenPassword != null) {
           result = 37 * result + _authenPassword.hashCode();
        }
        if (_oauthConsumerKey != null) {
           result = 37 * result + _oauthConsumerKey.hashCode();
        }
        if (_oauthConsumerSecret != null) {
           result = 37 * result + _oauthConsumerSecret.hashCode();
        }
        if (_oauthAccessToken != null) {
           result = 37 * result + _oauthAccessToken.hashCode();
        }
        if (_oauthAccessTokenSecret != null) {
           result = 37 * result + _oauthAccessTokenSecret.hashCode();
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
     * Sets the value of field 'authenPassword'.
     *
     * @param authenPassword the value of field 'authenPassword'.
     */
    public void setAuthenPassword(
            final java.lang.String authenPassword) {
        this._authenPassword = authenPassword;
    }

    /**
     * Sets the value of field 'authenUsername'.
     *
     * @param authenUsername the value of field 'authenUsername'.
     */
    public void setAuthenUsername(
            final java.lang.String authenUsername) {
        this._authenUsername = authenUsername;
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
     * Sets the value of field 'oauthAccessToken'.
     *
     * @param oauthAccessToken the value of field 'oauthAccessToken'
     */
    public void setOauthAccessToken(
            final java.lang.String oauthAccessToken) {
        this._oauthAccessToken = oauthAccessToken;
    }

    /**
     * Sets the value of field 'oauthAccessTokenSecret'.
     *
     * @param oauthAccessTokenSecret the value of field
     * 'oauthAccessTokenSecret'.
     */
    public void setOauthAccessTokenSecret(
            final java.lang.String oauthAccessTokenSecret) {
        this._oauthAccessTokenSecret = oauthAccessTokenSecret;
    }

    /**
     * Sets the value of field 'oauthConsumerKey'.
     *
     * @param oauthConsumerKey the value of field 'oauthConsumerKey'
     */
    public void setOauthConsumerKey(
            final java.lang.String oauthConsumerKey) {
        this._oauthConsumerKey = oauthConsumerKey;
    }

    /**
     * Sets the value of field 'oauthConsumerSecret'.
     *
     * @param oauthConsumerSecret the value of field
     * 'oauthConsumerSecret'.
     */
    public void setOauthConsumerSecret(
            final java.lang.String oauthConsumerSecret) {
        this._oauthConsumerSecret = oauthConsumerSecret;
    }

    /**
     * Sets the value of field 'serviceUrl'.
     *
     * @param serviceUrl the value of field 'serviceUrl'.
     */
    public void setServiceUrl(
            final java.lang.String serviceUrl) {
        this._serviceUrl = serviceUrl;
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
     * org.opennms.netmgt.config.microblog.MicroblogProfile
     */
    public static org.opennms.netmgt.config.microblog.MicroblogProfile unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.microblog.MicroblogProfile) Unmarshaller.unmarshal(org.opennms.netmgt.config.microblog.MicroblogProfile.class, reader);
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
