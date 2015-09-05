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
package org.opennms.netmgt.config.httpdatacollection;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Url.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="url")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("http-datacollection-config.xsd")
@SuppressWarnings("all") public class Url implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _method.
     */
    @XmlAttribute(name="method")
    private java.lang.String _method;

    /**
     * Field _httpVersion.
     */
    @XmlAttribute(name="http-version")
    private java.lang.String _httpVersion;

    /**
     * Field _userAgent.
     */
    @XmlAttribute(name="user-agent")
    private java.lang.String _userAgent;

    /**
     * Field _virtualHost.
     */
    @XmlAttribute(name="virtual-host")
    private java.lang.String _virtualHost;

    /**
     * Field _scheme.
     */
    @XmlAttribute(name="scheme")
    private java.lang.String _scheme;

    /**
     * Field _userInfo.
     */
    @XmlAttribute(name="user-info")
    private java.lang.String _userInfo;

    /**
     * Field _host.
     */
    @XmlAttribute(name="host")
    private java.lang.String _host;

    /**
     * Field _port.
     */
    @XmlAttribute(name="port")
    private Integer _port;

    /**
     * Field _path.
     */
    @XmlAttribute(name="path", required = true)
    private java.lang.String _path;

    /**
     * Field _query.
     */
    @XmlAttribute(name="query")
    private java.lang.String _query;

    /**
     * Field _fragment.
     */
    @XmlAttribute(name="fragment")
    private java.lang.String _fragment;

    /**
     * Field _matches.
     */
    @XmlAttribute(name="matches")
    private java.lang.String _matches;

    /**
     * Field _responseRange.
     */
    @XmlAttribute(name="response-range")
    private java.lang.String _responseRange;

    /**
     * Field _canonicalEquivalence.
     */
    @XmlAttribute(name="canonical-equivalence")
    private Boolean _canonicalEquivalence;

    /**
     * Field _caseInsensitive.
     */
    @XmlAttribute(name="case-insensitive")
    private Boolean _caseInsensitive;

    /**
     * Field _comments.
     */
    @XmlAttribute(name="case-insensitive")
    private Boolean _comments;

    /**
     * Field _dotall.
     */
    @XmlAttribute(name="dotall")
    private Boolean _dotall;

    /**
     * Field _literal.
     */
    @XmlAttribute(name="literal")
    private Boolean _literal;

    /**
     * Field _multiline.
     */
    @XmlAttribute(name="multiline")
    private Boolean _multiline;

    /**
     * Field _unicodeCase.
     */
    @XmlAttribute(name="unicode-case")
    private Boolean _unicodeCase;

    /**
     * Field _unixLines.
     */
    @XmlAttribute(name="unix-lines")
    private Boolean _unixLines;

    /**
     * Field _parameters.
     */
    @XmlElement(name="parameters")
    private org.opennms.netmgt.config.httpdatacollection.Parameters _parameters;


      //----------------/
     //- Constructors -/
    //----------------/

    public Url() {
        super();
        setMethod("GET");
        setHttpVersion("1.1");
        setScheme("http");
        setHost("${ipaddr}");
        setMatches("(.*)");
        setResponseRange("100-399");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteCanonicalEquivalence(
    ) {
        this._canonicalEquivalence = null;
    }

    /**
     */
    public void deleteCaseInsensitive(
    ) {
        this._caseInsensitive = null;
    }

    /**
     */
    public void deleteComments(
    ) {
        this._comments = null;
    }

    /**
     */
    public void deleteDotall(
    ) {
        this._dotall = null;
    }

    /**
     */
    public void deleteLiteral(
    ) {
        this._literal = null;
    }

    /**
     */
    public void deleteMultiline(
    ) {
        this._multiline = null;
    }

    /**
     */
    public void deletePort(
    ) {
        this._port = null;
    }

    /**
     */
    public void deleteUnicodeCase(
    ) {
        this._unicodeCase = null;
    }

    /**
     */
    public void deleteUnixLines(
    ) {
        this._unixLines = null;
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

        if (obj instanceof Url) {

            Url temp = (Url)obj;
            if (this._method != null) {
                if (temp._method == null) return false;
                else if (!(this._method.equals(temp._method)))
                    return false;
            }
            else if (temp._method != null)
                return false;
            if (this._httpVersion != null) {
                if (temp._httpVersion == null) return false;
                else if (!(this._httpVersion.equals(temp._httpVersion)))
                    return false;
            }
            else if (temp._httpVersion != null)
                return false;
            if (this._userAgent != null) {
                if (temp._userAgent == null) return false;
                else if (!(this._userAgent.equals(temp._userAgent)))
                    return false;
            }
            else if (temp._userAgent != null)
                return false;
            if (this._virtualHost != null) {
                if (temp._virtualHost == null) return false;
                else if (!(this._virtualHost.equals(temp._virtualHost)))
                    return false;
            }
            else if (temp._virtualHost != null)
                return false;
            if (this._scheme != null) {
                if (temp._scheme == null) return false;
                else if (!(this._scheme.equals(temp._scheme)))
                    return false;
            }
            else if (temp._scheme != null)
                return false;
            if (this._userInfo != null) {
                if (temp._userInfo == null) return false;
                else if (!(this._userInfo.equals(temp._userInfo)))
                    return false;
            }
            else if (temp._userInfo != null)
                return false;
            if (this._host != null) {
                if (temp._host == null) return false;
                else if (!(this._host.equals(temp._host)))
                    return false;
            }
            else if (temp._host != null)
                return false;
            if (this._port != null) {
                if (temp._port == null) return false;
                else if (!(this._port.equals(temp._port)))
                    return false;
            }
            else if (temp._port != null)
                return false;
            if (this._path != null) {
                if (temp._path == null) return false;
                else if (!(this._path.equals(temp._path)))
                    return false;
            }
            else if (temp._path != null)
                return false;
            if (this._query != null) {
                if (temp._query == null) return false;
                else if (!(this._query.equals(temp._query)))
                    return false;
            }
            else if (temp._query != null)
                return false;
            if (this._fragment != null) {
                if (temp._fragment == null) return false;
                else if (!(this._fragment.equals(temp._fragment)))
                    return false;
            }
            else if (temp._fragment != null)
                return false;
            if (this._matches != null) {
                if (temp._matches == null) return false;
                else if (!(this._matches.equals(temp._matches)))
                    return false;
            }
            else if (temp._matches != null)
                return false;
            if (this._responseRange != null) {
                if (temp._responseRange == null) return false;
                else if (!(this._responseRange.equals(temp._responseRange)))
                    return false;
            }
            else if (temp._responseRange != null)
                return false;
            if (this._canonicalEquivalence != null) {
                if (temp._canonicalEquivalence == null) return false;
                else if (!(this._canonicalEquivalence.equals(temp._canonicalEquivalence)))
                    return false;
            }
            else if (temp._canonicalEquivalence != null)
                return false;
            if (this._caseInsensitive != null) {
                if (temp._caseInsensitive == null) return false;
                else if (!(this._caseInsensitive.equals(temp._caseInsensitive)))
                    return false;
            }
            else if (temp._caseInsensitive != null)
                return false;
            if (this._comments != null) {
                if (temp._comments == null) return false;
                else if (!(this._comments.equals(temp._comments)))
                    return false;
            }
            else if (temp._comments != null)
                return false;
            if (this._dotall != null) {
                if (temp._dotall == null) return false;
                else if (!(this._dotall.equals(temp._dotall)))
                    return false;
            }
            else if (temp._dotall != null)
                return false;
            if (this._literal != null) {
                if (temp._literal == null) return false;
                else if (!(this._literal.equals(temp._literal)))
                    return false;
            }
            else if (temp._literal != null)
                return false;
            if (this._multiline != null) {
                if (temp._multiline == null) return false;
                else if (!(this._multiline.equals(temp._multiline)))
                    return false;
            }
            else if (temp._multiline != null)
                return false;
            if (this._unicodeCase != null) {
                if (temp._unicodeCase == null) return false;
                else if (!(this._unicodeCase.equals(temp._unicodeCase)))
                    return false;
            }
            else if (temp._unicodeCase != null)
                return false;
            if (this._unixLines != null) {
                if (temp._unixLines == null) return false;
                else if (!(this._unixLines.equals(temp._unixLines)))
                    return false;
            }
            else if (temp._unixLines != null)
                return false;
            if (this._parameters != null) {
                if (temp._parameters == null) return false;
                else if (!(this._parameters.equals(temp._parameters)))
                    return false;
            }
            else if (temp._parameters != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'canonicalEquivalence'.
     *
     * @return the value of field 'CanonicalEquivalence'.
     */
    public Boolean getCanonicalEquivalence(
    ) {
        return this._canonicalEquivalence == null ? false : this._canonicalEquivalence;
    }

    /**
     * Returns the value of field 'caseInsensitive'.
     *
     * @return the value of field 'CaseInsensitive'.
     */
    public Boolean getCaseInsensitive(
    ) {
        return this._caseInsensitive == null ? false : this._caseInsensitive;
    }

    /**
     * Returns the value of field 'comments'.
     *
     * @return the value of field 'Comments'.
     */
    public Boolean getComments(
    ) {
        return this._comments == null ? false : this._comments;
    }

    /**
     * Returns the value of field 'dotall'.
     *
     * @return the value of field 'Dotall'.
     */
    public Boolean getDotall(
    ) {
        return this._dotall == null ? false : this._dotall;
    }

    /**
     * Returns the value of field 'fragment'.
     *
     * @return the value of field 'Fragment'.
     */
    public java.lang.String getFragment(
    ) {
        return this._fragment;
    }

    /**
     * Returns the value of field 'host'.
     *
     * @return the value of field 'Host'.
     */
    public java.lang.String getHost(
    ) {
        return this._host == null ? "${ipaddr}" : this._host;
    }

    /**
     * Returns the value of field 'httpVersion'.
     *
     * @return the value of field 'HttpVersion'.
     */
    public java.lang.String getHttpVersion(
    ) {
        return this._httpVersion == null ? "1.1" : this._httpVersion;
    }

    /**
     * Returns the value of field 'literal'.
     *
     * @return the value of field 'Literal'.
     */
    public Boolean getLiteral(
    ) {
        return this._literal == null ? false : this._literal;
    }

    /**
     * Returns the value of field 'matches'.
     *
     * @return the value of field 'Matches'.
     */
    public java.lang.String getMatches(
    ) {
        return this._matches == null ? "(.*)" : this._matches;
    }

    /**
     * Returns the value of field 'method'.
     *
     * @return the value of field 'Method'.
     */
    public java.lang.String getMethod(
    ) {
        return this._method == null ? "GET" : this._method;
    }

    /**
     * Returns the value of field 'multiline'.
     *
     * @return the value of field 'Multiline'.
     */
    public Boolean getMultiline(
    ) {
        return this._multiline == null ? false : this._multiline;
    }

    /**
     * Returns the value of field 'parameters'.
     *
     * @return the value of field 'Parameters'.
     */
    public org.opennms.netmgt.config.httpdatacollection.Parameters getParameters(
    ) {
        return this._parameters;
    }

    /**
     * Returns the value of field 'path'.
     *
     * @return the value of field 'Path'.
     */
    public java.lang.String getPath(
    ) {
        return this._path;
    }

    /**
     * Returns the value of field 'port'.
     *
     * @return the value of field 'Port'.
     */
    public Integer getPort(
    ) {
        return this._port == null ? 80 : this._port;
    }

    /**
     * Returns the value of field 'query'.
     *
     * @return the value of field 'Query'.
     */
    public java.lang.String getQuery(
    ) {
        return this._query;
    }

    /**
     * Returns the value of field 'responseRange'.
     *
     * @return the value of field 'ResponseRange'.
     */
    public java.lang.String getResponseRange(
    ) {
        return this._responseRange == null ? "100-399" : this._responseRange;
    }

    /**
     * Returns the value of field 'scheme'.
     *
     * @return the value of field 'Scheme'.
     */
    public java.lang.String getScheme(
    ) {
        return this._scheme == null ? "http" : this._scheme;
    }

    /**
     * Returns the value of field 'unicodeCase'.
     *
     * @return the value of field 'UnicodeCase'.
     */
    public Boolean getUnicodeCase(
    ) {
        return this._unicodeCase == null ? false : this._unicodeCase;
    }

    /**
     * Returns the value of field 'unixLines'.
     *
     * @return the value of field 'UnixLines'.
     */
    public Boolean getUnixLines(
    ) {
        return this._unixLines == null ? false : this._unixLines;
    }

    /**
     * Returns the value of field 'userAgent'.
     *
     * @return the value of field 'UserAgent'.
     */
    public java.lang.String getUserAgent(
    ) {
        return this._userAgent;
    }

    /**
     * Returns the value of field 'userInfo'.
     *
     * @return the value of field 'UserInfo'.
     */
    public java.lang.String getUserInfo(
    ) {
        return this._userInfo;
    }

    /**
     * Returns the value of field 'virtualHost'.
     *
     * @return the value of field 'VirtualHost'.
     */
    public java.lang.String getVirtualHost(
    ) {
        return this._virtualHost;
    }

    /**
     * Method hasCanonicalEquivalence.
     *
     * @return true if at least one CanonicalEquivalence has been
     * added
     */
    public boolean hasCanonicalEquivalence(
    ) {
        return this._canonicalEquivalence != null;
    }

    /**
     * Method hasCaseInsensitive.
     *
     * @return true if at least one CaseInsensitive has been added
     */
    public boolean hasCaseInsensitive(
    ) {
        return this._caseInsensitive != null;
    }

    /**
     * Method hasComments.
     *
     * @return true if at least one Comments has been added
     */
    public boolean hasComments(
    ) {
        return this._comments != null;
    }

    /**
     * Method hasDotall.
     *
     * @return true if at least one Dotall has been added
     */
    public boolean hasDotall(
    ) {
        return this._dotall != null;
    }

    /**
     * Method hasLiteral.
     *
     * @return true if at least one Literal has been added
     */
    public boolean hasLiteral(
    ) {
        return this._literal != null;
    }

    /**
     * Method hasMultiline.
     *
     * @return true if at least one Multiline has been added
     */
    public boolean hasMultiline(
    ) {
        return this._multiline != null;
    }

    /**
     * Method hasPort.
     *
     * @return true if at least one Port has been added
     */
    public boolean hasPort(
    ) {
        return this._port != null;
    }

    /**
     * Method hasUnicodeCase.
     *
     * @return true if at least one UnicodeCase has been added
     */
    public boolean hasUnicodeCase(
    ) {
        return this._unicodeCase != null;
    }

    /**
     * Method hasUnixLines.
     *
     * @return true if at least one UnixLines has been added
     */
    public boolean hasUnixLines(
    ) {
        return this._unixLines != null;
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
        if (_method != null) {
           result = 37 * result + _method.hashCode();
        }
        if (_httpVersion != null) {
           result = 37 * result + _httpVersion.hashCode();
        }
        if (_userAgent != null) {
           result = 37 * result + _userAgent.hashCode();
        }
        if (_virtualHost != null) {
           result = 37 * result + _virtualHost.hashCode();
        }
        if (_scheme != null) {
           result = 37 * result + _scheme.hashCode();
        }
        if (_userInfo != null) {
           result = 37 * result + _userInfo.hashCode();
        }
        if (_host != null) {
           result = 37 * result + _host.hashCode();
        }
        if (_port != null) {
           result = 37 * result + _port.hashCode();
        }
        if (_path != null) {
           result = 37 * result + _path.hashCode();
        }
        if (_query != null) {
           result = 37 * result + _query.hashCode();
        }
        if (_fragment != null) {
           result = 37 * result + _fragment.hashCode();
        }
        if (_matches != null) {
           result = 37 * result + _matches.hashCode();
        }
        if (_responseRange != null) {
           result = 37 * result + _responseRange.hashCode();
        }
        if (_canonicalEquivalence != null) {
           result = 37 * result + _canonicalEquivalence.hashCode();
        }
        if (_caseInsensitive != null) {
           result = 37 * result + _caseInsensitive.hashCode();
        }
        if (_comments != null) {
           result = 37 * result + _comments.hashCode();
        }
        if (_dotall != null) {
           result = 37 * result + _dotall.hashCode();
        }
        if (_literal != null) {
           result = 37 * result + _literal.hashCode();
        }
        if (_multiline != null) {
           result = 37 * result + _multiline.hashCode();
        }
        if (_unicodeCase != null) {
           result = 37 * result + _unicodeCase.hashCode();
        }
        if (_unixLines != null) {
           result = 37 * result + _unixLines.hashCode();
        }
        if (_parameters != null) {
           result = 37 * result + _parameters.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'canonicalEquivalence'.
     *
     * @return the value of field 'CanonicalEquivalence'.
     */
    public boolean isCanonicalEquivalence(
    ) {
        return this._canonicalEquivalence;
    }

    /**
     * Returns the value of field 'caseInsensitive'.
     *
     * @return the value of field 'CaseInsensitive'.
     */
    public boolean isCaseInsensitive(
    ) {
        return this._caseInsensitive;
    }

    /**
     * Returns the value of field 'comments'.
     *
     * @return the value of field 'Comments'.
     */
    public boolean isComments(
    ) {
        return this._comments;
    }

    /**
     * Returns the value of field 'dotall'.
     *
     * @return the value of field 'Dotall'.
     */
    public boolean isDotall(
    ) {
        return this._dotall;
    }

    /**
     * Returns the value of field 'literal'.
     *
     * @return the value of field 'Literal'.
     */
    public boolean isLiteral(
    ) {
        return this._literal;
    }

    /**
     * Returns the value of field 'multiline'.
     *
     * @return the value of field 'Multiline'.
     */
    public boolean isMultiline(
    ) {
        return this._multiline;
    }

    /**
     * Returns the value of field 'unicodeCase'.
     *
     * @return the value of field 'UnicodeCase'.
     */
    public boolean isUnicodeCase(
    ) {
        return this._unicodeCase;
    }

    /**
     * Returns the value of field 'unixLines'.
     *
     * @return the value of field 'UnixLines'.
     */
    public boolean isUnixLines(
    ) {
        return this._unixLines;
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
     * Sets the value of field 'canonicalEquivalence'.
     *
     * @param canonicalEquivalence the value of field
     * 'canonicalEquivalence'.
     */
    public void setCanonicalEquivalence(
            final Boolean canonicalEquivalence) {
        this._canonicalEquivalence = canonicalEquivalence;
    }

    /**
     * Sets the value of field 'caseInsensitive'.
     *
     * @param caseInsensitive the value of field 'caseInsensitive'.
     */
    public void setCaseInsensitive(
            final Boolean caseInsensitive) {
        this._caseInsensitive = caseInsensitive;
    }

    /**
     * Sets the value of field 'comments'.
     *
     * @param comments the value of field 'comments'.
     */
    public void setComments(
            final Boolean comments) {
        this._comments = comments;
    }

    /**
     * Sets the value of field 'dotall'.
     *
     * @param dotall the value of field 'dotall'.
     */
    public void setDotall(
            final Boolean dotall) {
        this._dotall = dotall;
    }

    /**
     * Sets the value of field 'fragment'.
     *
     * @param fragment the value of field 'fragment'.
     */
    public void setFragment(
            final java.lang.String fragment) {
        this._fragment = fragment;
    }

    /**
     * Sets the value of field 'host'.
     *
     * @param host the value of field 'host'.
     */
    public void setHost(
            final java.lang.String host) {
        this._host = host;
    }

    /**
     * Sets the value of field 'httpVersion'.
     *
     * @param httpVersion the value of field 'httpVersion'.
     */
    public void setHttpVersion(
            final java.lang.String httpVersion) {
        this._httpVersion = httpVersion;
    }

    /**
     * Sets the value of field 'literal'.
     *
     * @param literal the value of field 'literal'.
     */
    public void setLiteral(
            final Boolean literal) {
        this._literal = literal;
    }

    /**
     * Sets the value of field 'matches'.
     *
     * @param matches the value of field 'matches'.
     */
    public void setMatches(
            final java.lang.String matches) {
        this._matches = matches;
    }

    /**
     * Sets the value of field 'method'.
     *
     * @param method the value of field 'method'.
     */
    public void setMethod(
            final java.lang.String method) {
        this._method = method;
    }

    /**
     * Sets the value of field 'multiline'.
     *
     * @param multiline the value of field 'multiline'.
     */
    public void setMultiline(
            final Boolean multiline) {
        this._multiline = multiline;
    }

    /**
     * Sets the value of field 'parameters'.
     *
     * @param parameters the value of field 'parameters'.
     */
    public void setParameters(
            final org.opennms.netmgt.config.httpdatacollection.Parameters parameters) {
        this._parameters = parameters;
    }

    /**
     * Sets the value of field 'path'.
     *
     * @param path the value of field 'path'.
     */
    public void setPath(
            final java.lang.String path) {
        this._path = path;
    }

    /**
     * Sets the value of field 'port'.
     *
     * @param port the value of field 'port'.
     */
    public void setPort(
            final Integer port) {
        this._port = port;
    }

    /**
     * Sets the value of field 'query'.
     *
     * @param query the value of field 'query'.
     */
    public void setQuery(
            final java.lang.String query) {
        this._query = query;
    }

    /**
     * Sets the value of field 'responseRange'.
     *
     * @param responseRange the value of field 'responseRange'.
     */
    public void setResponseRange(
            final java.lang.String responseRange) {
        this._responseRange = responseRange;
    }

    /**
     * Sets the value of field 'scheme'.
     *
     * @param scheme the value of field 'scheme'.
     */
    public void setScheme(
            final java.lang.String scheme) {
        this._scheme = scheme;
    }

    /**
     * Sets the value of field 'unicodeCase'.
     *
     * @param unicodeCase the value of field 'unicodeCase'.
     */
    public void setUnicodeCase(
            final Boolean unicodeCase) {
        this._unicodeCase = unicodeCase;
    }

    /**
     * Sets the value of field 'unixLines'.
     *
     * @param unixLines the value of field 'unixLines'.
     */
    public void setUnixLines(
            final Boolean unixLines) {
        this._unixLines = unixLines;
    }

    /**
     * Sets the value of field 'userAgent'.
     *
     * @param userAgent the value of field 'userAgent'.
     */
    public void setUserAgent(
            final java.lang.String userAgent) {
        this._userAgent = userAgent;
    }

    /**
     * Sets the value of field 'userInfo'.
     *
     * @param userInfo the value of field 'userInfo'.
     */
    public void setUserInfo(
            final java.lang.String userInfo) {
        this._userInfo = userInfo;
    }

    /**
     * Sets the value of field 'virtualHost'.
     *
     * @param virtualHost the value of field 'virtualHost'.
     */
    public void setVirtualHost(
            final java.lang.String virtualHost) {
        this._virtualHost = virtualHost;
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
     * org.opennms.netmgt.config.httpdatacollection.Url
     */
    public static org.opennms.netmgt.config.httpdatacollection.Url unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Url) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Url.class, reader);
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
