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
package org.opennms.netmgt.config.discovery;

  //---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the discovery-configuration.xml
 *  configuration file.
 *
 * @version $Revision$ $Date$
 */
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name = "discovery-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("discovery-configuration.xsd")
@SuppressWarnings("all")
public class DiscoveryConfiguration implements java.io.Serializable {

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * the number of threads to be used for
     *  discovery
     */
    @XmlAttribute(name = "threads", required = true)
    private Integer _threads;

    /**
     * the total number of ping packets sent per second from
     *  OpenNMS for discovery
     */
    @XmlAttribute(name = "packets-per-second", required = true)
    private Integer _packetsPerSecond;

    /**
     * The initial pause (in milliseconds) after discovery
     *  starts up before discovery is started.
     */
    @XmlAttribute(name = "initial-sleep-time", required = true)
    private Long _initialSleepTime;

    /**
     * The pause (in milliseconds) between discovery passes.
     *  Once the discovery process completes a sweep of all the
     * specified
     *  addresses, it sleeps for this duration before starting
     * another
     *  sweep.
     */
    @XmlAttribute(name = "restart-sleep-time", required = true)
    private Long _restartSleepTime;

    /**
     * The default number of times a ping is retried for an
     *  address. If there is no response after the first ping to an
     * address,
     *  it is tried again for the specified number of retries. This
     * retry
     *  count is a default and can be overridden for specific
     * addresses or
     *  sets of addresses that are configured in this file.
     */
    @XmlAttribute(name = "retries")
    private Integer _retries;

    /**
     * The default timeout on each poll. This timeout is a
     *  default and can be overridden for specific addresses or
     * sets of
     *  addresses that are configured in this file.
     */
    @XmlAttribute(name = "timeout")
    private Long _timeout;

    /**
     * Field _foreignSource.
     */
    @XmlAttribute(name = "foreign-source")
    private java.lang.String _foreignSource;

    /**
     * the specific addresses to be polled
     */
    @XmlElement(name = "specific")
    private java.util.List<org.opennms.netmgt.config.discovery.Specific> _specificList;

    /**
     * the range of addresses to be polled
     */
    @XmlElement(name = "include-range")
    private java.util.List<org.opennms.netmgt.config.discovery.IncludeRange> _includeRangeList;

    /**
     * the range of addresses to be excluded from the
     *  polling
     */
    @XmlElement(name = "exclude-range")
    private java.util.List<org.opennms.netmgt.config.discovery.ExcludeRange> _excludeRangeList;

    /**
     * a file URL holding specific addresses to be
     *  polled
     */
    @XmlElement(name = "include-url")
    private java.util.List<org.opennms.netmgt.config.discovery.IncludeUrl> _includeUrlList;

      //----------------/
    //- Constructors -/
    //----------------/
    public DiscoveryConfiguration() {
        super();
        this._specificList = new java.util.ArrayList<org.opennms.netmgt.config.discovery.Specific>();
        this._includeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.discovery.IncludeRange>();
        this._excludeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.discovery.ExcludeRange>();
        this._includeUrlList = new java.util.ArrayList<org.opennms.netmgt.config.discovery.IncludeUrl>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final org.opennms.netmgt.config.discovery.ExcludeRange vExcludeRange)
            throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(vExcludeRange);
    }

    /**
     *
     *
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final int index,
            final org.opennms.netmgt.config.discovery.ExcludeRange vExcludeRange)
            throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(index, vExcludeRange);
    }

    /**
     *
     *
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final org.opennms.netmgt.config.discovery.IncludeRange vIncludeRange)
            throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(vIncludeRange);
    }

    /**
     *
     *
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final int index,
            final org.opennms.netmgt.config.discovery.IncludeRange vIncludeRange)
            throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(index, vIncludeRange);
    }

    /**
     *
     *
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final org.opennms.netmgt.config.discovery.IncludeUrl vIncludeUrl)
            throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(vIncludeUrl);
    }

    /**
     *
     *
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final int index,
            final org.opennms.netmgt.config.discovery.IncludeUrl vIncludeUrl)
            throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(index, vIncludeUrl);
    }

    /**
     *
     *
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final org.opennms.netmgt.config.discovery.Specific vSpecific)
            throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(vSpecific);
    }

    /**
     *
     *
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final int index,
            final org.opennms.netmgt.config.discovery.Specific vSpecific)
            throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(index, vSpecific);
    }

    /**
     */
    public void deleteInitialSleepTime() {
        this._initialSleepTime = null;
    }

    /**
     */
    public void deletePacketsPerSecond() {
        this._packetsPerSecond = null;
    }

    /**
     */
    public void deleteRestartSleepTime() {
        this._restartSleepTime = null;
    }

    /**
     */
    public void deleteRetries() {
        this._retries = null;
    }

    /**
     */
    public void deleteThreads() {
        this._threads = null;
    }

    /**
     */
    public void deleteTimeout() {
        this._timeout = null;
    }

    /**
     * Method enumerateExcludeRange.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.discovery.ExcludeRange> enumerateExcludeRange() {
        return java.util.Collections.enumeration(this._excludeRangeList);
    }

    /**
     * Method enumerateIncludeRange.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.discovery.IncludeRange> enumerateIncludeRange() {
        return java.util.Collections.enumeration(this._includeRangeList);
    }

    /**
     * Method enumerateIncludeUrl.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.discovery.IncludeUrl> enumerateIncludeUrl() {
        return java.util.Collections.enumeration(this._includeUrlList);
    }

    /**
     * Method enumerateSpecific.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.discovery.Specific> enumerateSpecific() {
        return java.util.Collections.enumeration(this._specificList);
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

        if (obj instanceof DiscoveryConfiguration) {

            DiscoveryConfiguration temp = (DiscoveryConfiguration) obj;
            if (this._threads != null) {
                if (temp._threads == null) {
                    return false;
                } else if (!(this._threads.equals(temp._threads))) {
                    return false;
                }
            } else if (temp._threads != null) {
                return false;
            }
            if (this._packetsPerSecond != null) {
                if (temp._packetsPerSecond == null) {
                    return false;
                } else if (!(this._packetsPerSecond.equals(temp._packetsPerSecond))) {
                    return false;
                }
            } else if (temp._packetsPerSecond != null) {
                return false;
            }
            if (this._initialSleepTime != null) {
                if (temp._initialSleepTime == null) {
                    return false;
                } else if (!(this._initialSleepTime.equals(temp._initialSleepTime))) {
                    return false;
                }
            } else if (temp._initialSleepTime != null) {
                return false;
            }
            if (this._restartSleepTime != null) {
                if (temp._restartSleepTime == null) {
                    return false;
                } else if (!(this._restartSleepTime.equals(temp._restartSleepTime))) {
                    return false;
                }
            } else if (temp._restartSleepTime != null) {
                return false;
            }
            if (this._retries != null) {
                if (temp._retries == null) {
                    return false;
                } else if (!(this._retries.equals(temp._retries))) {
                    return false;
                }
            } else if (temp._retries != null) {
                return false;
            }
            if (this._timeout != null) {
                if (temp._timeout == null) {
                    return false;
                } else if (!(this._timeout.equals(temp._timeout))) {
                    return false;
                }
            } else if (temp._timeout != null) {
                return false;
            }
            if (this._foreignSource != null) {
                if (temp._foreignSource == null) {
                    return false;
                } else if (!(this._foreignSource.equals(temp._foreignSource))) {
                    return false;
                }
            } else if (temp._foreignSource != null) {
                return false;
            }
            if (this._specificList != null) {
                if (temp._specificList == null) {
                    return false;
                } else if (!(this._specificList.equals(temp._specificList))) {
                    return false;
                }
            } else if (temp._specificList != null) {
                return false;
            }
            if (this._includeRangeList != null) {
                if (temp._includeRangeList == null) {
                    return false;
                } else if (!(this._includeRangeList.equals(temp._includeRangeList))) {
                    return false;
                }
            } else if (temp._includeRangeList != null) {
                return false;
            }
            if (this._excludeRangeList != null) {
                if (temp._excludeRangeList == null) {
                    return false;
                } else if (!(this._excludeRangeList.equals(temp._excludeRangeList))) {
                    return false;
                }
            } else if (temp._excludeRangeList != null) {
                return false;
            }
            if (this._includeUrlList != null) {
                if (temp._includeUrlList == null) {
                    return false;
                } else if (!(this._includeUrlList.equals(temp._includeUrlList))) {
                    return false;
                }
            } else if (temp._includeUrlList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Method getExcludeRange.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.discovery.ExcludeRange at the
     * given index
     */
    public org.opennms.netmgt.config.discovery.ExcludeRange getExcludeRange(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("getExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.discovery.ExcludeRange) _excludeRangeList.get(index);
    }

    /**
     * Method getExcludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.discovery.ExcludeRange[] getExcludeRange() {
        org.opennms.netmgt.config.discovery.ExcludeRange[] array = new org.opennms.netmgt.config.discovery.ExcludeRange[0];
        return (org.opennms.netmgt.config.discovery.ExcludeRange[]) this._excludeRangeList.toArray(array);
    }

    /**
     * Method getExcludeRangeCollection.Returns a reference to
     * '_excludeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.discovery.ExcludeRange> getExcludeRangeCollection() {
        return this._excludeRangeList;
    }

    /**
     * Method getExcludeRangeCount.
     *
     * @return the size of this collection
     */
    public int getExcludeRangeCount() {
        return this._excludeRangeList.size();
    }

    /**
     * Returns the value of field 'foreignSource'.
     *
     * @return the value of field 'ForeignSource'.
     */
    public java.lang.String getForeignSource() {
        return this._foreignSource;
    }

    /**
     * Method getIncludeRange.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.discovery.IncludeRange at the
     * given index
     */
    public org.opennms.netmgt.config.discovery.IncludeRange getIncludeRange(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.discovery.IncludeRange) _includeRangeList.get(index);
    }

    /**
     * Method getIncludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.discovery.IncludeRange[] getIncludeRange() {
        org.opennms.netmgt.config.discovery.IncludeRange[] array = new org.opennms.netmgt.config.discovery.IncludeRange[0];
        return (org.opennms.netmgt.config.discovery.IncludeRange[]) this._includeRangeList.toArray(array);
    }

    /**
     * Method getIncludeRangeCollection.Returns a reference to
     * '_includeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.discovery.IncludeRange> getIncludeRangeCollection() {
        return this._includeRangeList;
    }

    /**
     * Method getIncludeRangeCount.
     *
     * @return the size of this collection
     */
    public int getIncludeRangeCount() {
        return this._includeRangeList.size();
    }

    /**
     * Method getIncludeUrl.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.discovery.IncludeUrl at the given
     * index
     */
    public org.opennms.netmgt.config.discovery.IncludeUrl getIncludeUrl(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("getIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.discovery.IncludeUrl) _includeUrlList.get(index);
    }

    /**
     * Method getIncludeUrl.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.discovery.IncludeUrl[] getIncludeUrl() {
        org.opennms.netmgt.config.discovery.IncludeUrl[] array = new org.opennms.netmgt.config.discovery.IncludeUrl[0];
        return (org.opennms.netmgt.config.discovery.IncludeUrl[]) this._includeUrlList.toArray(array);
    }

    /**
     * Method getIncludeUrlCollection.Returns a reference to
     * '_includeUrlList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.discovery.IncludeUrl> getIncludeUrlCollection() {
        return this._includeUrlList;
    }

    /**
     * Method getIncludeUrlCount.
     *
     * @return the size of this collection
     */
    public int getIncludeUrlCount() {
        return this._includeUrlList.size();
    }

    /**
     * Returns the value of field 'initialSleepTime'. The field
     * 'initialSleepTime' has the following description: The
     * initial pause (in milliseconds) after discovery
     *  starts up before discovery is started.
     *
     * @return the value of field 'InitialSleepTime'.
     */
    public Long getInitialSleepTime() {
        return this._initialSleepTime;
    }

    /**
     * Returns the value of field 'packetsPerSecond'. The field
     * 'packetsPerSecond' has the following description: the total
     * number of ping packets sent per second from
     *  OpenNMS for discovery
     *
     * @return the value of field 'PacketsPerSecond'.
     */
    public Integer getPacketsPerSecond() {
        return this._packetsPerSecond;
    }

    /**
     * Returns the value of field 'restartSleepTime'. The field
     * 'restartSleepTime' has the following description: The pause
     * (in milliseconds) between discovery passes.
     *  Once the discovery process completes a sweep of all the
     * specified
     *  addresses, it sleeps for this duration before starting
     * another
     *  sweep.
     *
     * @return the value of field 'RestartSleepTime'.
     */
    public Long getRestartSleepTime() {
        return this._restartSleepTime;
    }

    /**
     * Returns the value of field 'retries'. The field 'retries'
     * has the following description: The default number of times a
     * ping is retried for an
     *  address. If there is no response after the first ping to an
     * address,
     *  it is tried again for the specified number of retries. This
     * retry
     *  count is a default and can be overridden for specific
     * addresses or
     *  sets of addresses that are configured in this file.
     *
     * @return the value of field 'Retries'.
     */
    public Integer getRetries() {
        return this._retries;
    }

    /**
     * Method getSpecific.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.discovery.Specific at the given
     * index
     */
    public org.opennms.netmgt.config.discovery.Specific getSpecific(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("getSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.discovery.Specific) _specificList.get(index);
    }

    /**
     * Method getSpecific.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.discovery.Specific[] getSpecific() {
        org.opennms.netmgt.config.discovery.Specific[] array = new org.opennms.netmgt.config.discovery.Specific[0];
        return (org.opennms.netmgt.config.discovery.Specific[]) this._specificList.toArray(array);
    }

    /**
     * Method getSpecificCollection.Returns a reference to
     * '_specificList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.discovery.Specific> getSpecificCollection() {
        return this._specificList;
    }

    /**
     * Method getSpecificCount.
     *
     * @return the size of this collection
     */
    public int getSpecificCount() {
        return this._specificList.size();
    }

    /**
     * Returns the value of field 'threads'. The field 'threads'
     * has the following description: the number of threads to be
     * used for
     *  discovery
     *
     * @return the value of field 'Threads'.
     */
    public Integer getThreads() {
        return this._threads;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: The default timeout on each
     * poll. This timeout is a
     *  default and can be overridden for specific addresses or
     * sets of
     *  addresses that are configured in this file.
     *
     * @return the value of field 'Timeout'.
     */
    public Long getTimeout() {
        return this._timeout;
    }

    /**
     * Method hasInitialSleepTime.
     *
     * @return true if at least one InitialSleepTime has been added
     */
    public boolean hasInitialSleepTime() {
        return this._initialSleepTime != null;
    }

    /**
     * Method hasPacketsPerSecond.
     *
     * @return true if at least one PacketsPerSecond has been added
     */
    public boolean hasPacketsPerSecond() {
        return this._packetsPerSecond != null;
    }

    /**
     * Method hasRestartSleepTime.
     *
     * @return true if at least one RestartSleepTime has been added
     */
    public boolean hasRestartSleepTime() {
        return this._restartSleepTime != null;
    }

    /**
     * Method hasRetries.
     *
     * @return true if at least one Retries has been added
     */
    public boolean hasRetries() {
        return this._retries != null;
    }

    /**
     * Method hasThreads.
     *
     * @return true if at least one Threads has been added
     */
    public boolean hasThreads() {
        return this._threads != null;
    }

    /**
     * Method hasTimeout.
     *
     * @return true if at least one Timeout has been added
     */
    public boolean hasTimeout() {
        return this._timeout != null;
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
        if (_threads != null) {
            result = 37 * result + _threads.hashCode();
        }
        if (_packetsPerSecond != null) {
            result = 37 * result + _packetsPerSecond.hashCode();
        }
        if (_initialSleepTime != null) {
            result = 37 * result + _initialSleepTime.hashCode();
        }
        if (_restartSleepTime != null) {
            result = 37 * result + _restartSleepTime.hashCode();
        }
        if (_retries != null) {
            result = 37 * result + _retries.hashCode();
        }
        if (_timeout != null) {
            result = 37 * result + _timeout.hashCode();
        }
        if (_foreignSource != null) {
            result = 37 * result + _foreignSource.hashCode();
        }
        if (_specificList != null) {
            result = 37 * result + _specificList.hashCode();
        }
        if (_includeRangeList != null) {
            result = 37 * result + _includeRangeList.hashCode();
        }
        if (_excludeRangeList != null) {
            result = 37 * result + _excludeRangeList.hashCode();
        }
        if (_includeUrlList != null) {
            result = 37 * result + _includeUrlList.hashCode();
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
     * Method iterateExcludeRange.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.discovery.ExcludeRange> iterateExcludeRange() {
        return this._excludeRangeList.iterator();
    }

    /**
     * Method iterateIncludeRange.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.discovery.IncludeRange> iterateIncludeRange() {
        return this._includeRangeList.iterator();
    }

    /**
     * Method iterateIncludeUrl.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.discovery.IncludeUrl> iterateIncludeUrl() {
        return this._includeUrlList.iterator();
    }

    /**
     * Method iterateSpecific.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.discovery.Specific> iterateSpecific() {
        return this._specificList.iterator();
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
    public void removeAllExcludeRange() {
        this._excludeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeRange() {
        this._includeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeUrl() {
        this._includeUrlList.clear();
    }

    /**
     */
    public void removeAllSpecific() {
        this._specificList.clear();
    }

    /**
     * Method removeExcludeRange.
     *
     * @param vExcludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeExcludeRange(
            final org.opennms.netmgt.config.discovery.ExcludeRange vExcludeRange) {
        boolean removed = _excludeRangeList.remove(vExcludeRange);
        return removed;
    }

    /**
     * Method removeExcludeRangeAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.discovery.ExcludeRange removeExcludeRangeAt(
            final int index) {
        java.lang.Object obj = this._excludeRangeList.remove(index);
        return (org.opennms.netmgt.config.discovery.ExcludeRange) obj;
    }

    /**
     * Method removeIncludeRange.
     *
     * @param vIncludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRange(
            final org.opennms.netmgt.config.discovery.IncludeRange vIncludeRange) {
        boolean removed = _includeRangeList.remove(vIncludeRange);
        return removed;
    }

    /**
     * Method removeIncludeRangeAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.discovery.IncludeRange removeIncludeRangeAt(
            final int index) {
        java.lang.Object obj = this._includeRangeList.remove(index);
        return (org.opennms.netmgt.config.discovery.IncludeRange) obj;
    }

    /**
     * Method removeIncludeUrl.
     *
     * @param vIncludeUrl
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeUrl(
            final org.opennms.netmgt.config.discovery.IncludeUrl vIncludeUrl) {
        boolean removed = _includeUrlList.remove(vIncludeUrl);
        return removed;
    }

    /**
     * Method removeIncludeUrlAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.discovery.IncludeUrl removeIncludeUrlAt(
            final int index) {
        java.lang.Object obj = this._includeUrlList.remove(index);
        return (org.opennms.netmgt.config.discovery.IncludeUrl) obj;
    }

    /**
     * Method removeSpecific.
     *
     * @param vSpecific
     * @return true if the object was removed from the collection.
     */
    public boolean removeSpecific(
            final org.opennms.netmgt.config.discovery.Specific vSpecific) {
        boolean removed = _specificList.remove(vSpecific);
        return removed;
    }

    /**
     * Method removeSpecificAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.discovery.Specific removeSpecificAt(
            final int index) {
        java.lang.Object obj = this._specificList.remove(index);
        return (org.opennms.netmgt.config.discovery.Specific) obj;
    }

    /**
     *
     *
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExcludeRange(
            final int index,
            final org.opennms.netmgt.config.discovery.ExcludeRange vExcludeRange)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("setExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }

        this._excludeRangeList.set(index, vExcludeRange);
    }

    /**
     *
     *
     * @param vExcludeRangeArray
     */
    public void setExcludeRange(
            final org.opennms.netmgt.config.discovery.ExcludeRange[] vExcludeRangeArray) {
        //-- copy array
        _excludeRangeList.clear();

        for (int i = 0; i < vExcludeRangeArray.length; i++) {
            this._excludeRangeList.add(vExcludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_excludeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vExcludeRangeList the Vector to copy.
     */
    public void setExcludeRange(
            final java.util.List<org.opennms.netmgt.config.discovery.ExcludeRange> vExcludeRangeList) {
        // copy vector
        this._excludeRangeList.clear();

        this._excludeRangeList.addAll(vExcludeRangeList);
    }

    /**
     * Sets the value of '_excludeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param excludeRangeList the Vector to set.
     */
    public void setExcludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.discovery.ExcludeRange> excludeRangeList) {
        this._excludeRangeList = excludeRangeList;
    }

    /**
     * Sets the value of field 'foreignSource'.
     *
     * @param foreignSource the value of field 'foreignSource'.
     */
    public void setForeignSource(
            final java.lang.String foreignSource) {
        this._foreignSource = foreignSource;
    }

    /**
     *
     *
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRange(
            final int index,
            final org.opennms.netmgt.config.discovery.IncludeRange vIncludeRange)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }

        this._includeRangeList.set(index, vIncludeRange);
    }

    /**
     *
     *
     * @param vIncludeRangeArray
     */
    public void setIncludeRange(
            final org.opennms.netmgt.config.discovery.IncludeRange[] vIncludeRangeArray) {
        //-- copy array
        _includeRangeList.clear();

        for (int i = 0; i < vIncludeRangeArray.length; i++) {
            this._includeRangeList.add(vIncludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_includeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vIncludeRangeList the Vector to copy.
     */
    public void setIncludeRange(
            final java.util.List<org.opennms.netmgt.config.discovery.IncludeRange> vIncludeRangeList) {
        // copy vector
        this._includeRangeList.clear();

        this._includeRangeList.addAll(vIncludeRangeList);
    }

    /**
     * Sets the value of '_includeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param includeRangeList the Vector to set.
     */
    public void setIncludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.discovery.IncludeRange> includeRangeList) {
        this._includeRangeList = includeRangeList;
    }

    /**
     *
     *
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeUrl(
            final int index,
            final org.opennms.netmgt.config.discovery.IncludeUrl vIncludeUrl)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("setIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }

        this._includeUrlList.set(index, vIncludeUrl);
    }

    /**
     *
     *
     * @param vIncludeUrlArray
     */
    public void setIncludeUrl(
            final org.opennms.netmgt.config.discovery.IncludeUrl[] vIncludeUrlArray) {
        //-- copy array
        _includeUrlList.clear();

        for (int i = 0; i < vIncludeUrlArray.length; i++) {
            this._includeUrlList.add(vIncludeUrlArray[i]);
        }
    }

    /**
     * Sets the value of '_includeUrlList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vIncludeUrlList the Vector to copy.
     */
    public void setIncludeUrl(
            final java.util.List<org.opennms.netmgt.config.discovery.IncludeUrl> vIncludeUrlList) {
        // copy vector
        this._includeUrlList.clear();

        this._includeUrlList.addAll(vIncludeUrlList);
    }

    /**
     * Sets the value of '_includeUrlList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param includeUrlList the Vector to set.
     */
    public void setIncludeUrlCollection(
            final java.util.List<org.opennms.netmgt.config.discovery.IncludeUrl> includeUrlList) {
        this._includeUrlList = includeUrlList;
    }

    /**
     * Sets the value of field 'initialSleepTime'. The field
     * 'initialSleepTime' has the following description: The
     * initial pause (in milliseconds) after discovery
     *  starts up before discovery is started.
     *
     * @param initialSleepTime the value of field 'initialSleepTime'
     */
    public void setInitialSleepTime(
            final Long initialSleepTime) {
        this._initialSleepTime = initialSleepTime;
    }

    /**
     * Sets the value of field 'packetsPerSecond'. The field
     * 'packetsPerSecond' has the following description: the total
     * number of ping packets sent per second from
     *  OpenNMS for discovery
     *
     * @param packetsPerSecond the value of field 'packetsPerSecond'
     */
    public void setPacketsPerSecond(
            final Integer packetsPerSecond) {
        if (packetsPerSecond < 1) {
            throw new IllegalArgumentException("Invalid number of ping packets to send per second, must be at least 1: " + packetsPerSecond);
        }
        this._packetsPerSecond = packetsPerSecond;
    }

    /**
     * Sets the value of field 'restartSleepTime'. The field
     * 'restartSleepTime' has the following description: The pause
     * (in milliseconds) between discovery passes.
     *  Once the discovery process completes a sweep of all the
     * specified
     *  addresses, it sleeps for this duration before starting
     * another
     *  sweep.
     *
     * @param restartSleepTime the value of field 'restartSleepTime'
     */
    public void setRestartSleepTime(
            final Long restartSleepTime) {
        this._restartSleepTime = restartSleepTime;
    }

    /**
     * Sets the value of field 'retries'. The field 'retries' has
     * the following description: The default number of times a
     * ping is retried for an
     *  address. If there is no response after the first ping to an
     * address,
     *  it is tried again for the specified number of retries. This
     * retry
     *  count is a default and can be overridden for specific
     * addresses or
     *  sets of addresses that are configured in this file.
     *
     * @param retries the value of field 'retries'.
     */
    public void setRetries(
            final Integer retries) {
        this._retries = retries;
    }

    /**
     *
     *
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSpecific(
            final int index,
            final org.opennms.netmgt.config.discovery.Specific vSpecific)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("setSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }

        this._specificList.set(index, vSpecific);
    }

    /**
     *
     *
     * @param vSpecificArray
     */
    public void setSpecific(
            final org.opennms.netmgt.config.discovery.Specific[] vSpecificArray) {
        //-- copy array
        _specificList.clear();

        for (int i = 0; i < vSpecificArray.length; i++) {
            this._specificList.add(vSpecificArray[i]);
        }
    }

    /**
     * Sets the value of '_specificList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vSpecificList the Vector to copy.
     */
    public void setSpecific(
            final java.util.List<org.opennms.netmgt.config.discovery.Specific> vSpecificList) {
        // copy vector
        this._specificList.clear();

        this._specificList.addAll(vSpecificList);
    }

    /**
     * Sets the value of '_specificList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param specificList the Vector to set.
     */
    public void setSpecificCollection(
            final java.util.List<org.opennms.netmgt.config.discovery.Specific> specificList) {
        this._specificList = specificList;
    }

    /**
     * Sets the value of field 'threads'. The field 'threads' has
     * the following description: the number of threads to be used
     * for
     *  discovery
     *
     * @param threads the value of field 'threads'.
     */
    public void setThreads(
            final Integer threads) {
        if (threads < 1) {
            throw new IllegalArgumentException("Invalid number of threads, must be at least 1: " + threads);
        }
        this._threads = threads;
    }

    /**
     * Sets the value of field 'timeout'. The field 'timeout' has
     * the following description: The default timeout on each poll.
     * This timeout is a
     *  default and can be overridden for specific addresses or
     * sets of
     *  addresses that are configured in this file.
     *
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final Long timeout) {
        this._timeout = timeout;
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
     * org.opennms.netmgt.config.discovery.DiscoveryConfiguration
     */
    public static org.opennms.netmgt.config.discovery.DiscoveryConfiguration unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.discovery.DiscoveryConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.discovery.DiscoveryConfiguration.class, reader);
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
