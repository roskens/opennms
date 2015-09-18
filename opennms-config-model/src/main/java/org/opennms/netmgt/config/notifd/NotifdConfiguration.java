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
 * Top-level element for the notifd-configuration.xml
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

@XmlRootElement(name = "notifd-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("notifd-configuration.xsd")
@SuppressWarnings("all")
public class NotifdConfiguration implements java.io.Serializable {

    private static final String DEFAULT_PAGES_SENT = "SELECT * FROM notifications";
    private static final String DEFAULT_NEXT_NOTIF_ID = "SELECT nextval('notifynxtid')";
    private static final String DEFAULT_NEXT_USER_NOTIF_ID = "SELECT nextval('userNotifNxtId')";
    private static final String DEFAULT_NEXT_GROUP_ID = "SELECT nextval('notifygrpid')";
    private static final String DEFAULT_SERVICE_ID_SQL = "SELECT serviceID from service where serviceName = ?";
    private static final String DEFAULT_OUTSTANDING_NOTICES_SQL = "SELECT notifyid FROM notifications where notifyId = ? AND respondTime is not null";
    private static final String DEFAULT_ACKNOWLEDGE_ID_SQL = "SELECT notifyid FROM notifications WHERE eventuei=? AND nodeid=? AND interfaceid=? AND serviceid=?";
    private static final String DEFAULT_ACKNOWLEDGE_UPDATE_SQL = "UPDATE notifications SET answeredby=?, respondtime=? WHERE notifyId=?";
    private static final String DEFAULT_EMAIL_ADDRESS_COMMAND = "javaEmail";

      //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/
    /**
     * Field _status.
     */
    @XmlAttribute(name = "status", required = true)
    private java.lang.String _status;

    /**
     * Field _pagesSent.
     */
    @XmlAttribute(name = "pages-sent")
    private java.lang.String _pagesSent;

    /**
     * Field _nextNotifId.
     */
    @XmlAttribute(name = "next-notif-id")
    private java.lang.String _nextNotifId;

    /**
     * Field _nextUserNotifId.
     */
    @XmlAttribute(name = "next-user-notif-id")
    private java.lang.String _nextUserNotifId;

    /**
     * Field _nextGroupId.
     */
    @XmlAttribute(name = "next-group-id")
    private java.lang.String _nextGroupId;

    /**
     * Field _serviceIdSql.
     */
    @XmlAttribute(name = "service-id-sql")
    private java.lang.String _serviceIdSql;

    /**
     * Field _outstandingNoticesSql.
     */
    @XmlAttribute(name = "outstanding-notices-sql")
    private java.lang.String _outstandingNoticesSql;

    /**
     * Field _acknowledgeIdSql.
     */
    @XmlAttribute(name = "acknowledge-id-sql")
    private java.lang.String _acknowledgeIdSql;

    /**
     * Field _acknowledgeUpdateSql.
     */
    @XmlAttribute(name = "acknowledge-update-sql")
    private java.lang.String _acknowledgeUpdateSql;

    /**
     * Field _matchAll.
     */
    @XmlAttribute(name = "match-all", required = true)
    private Boolean _matchAll;

    /**
     * Field _emailAddressCommand.
     */
    @XmlAttribute(name = "email-address-command")
    private java.lang.String _emailAddressCommand;

    /**
     * Field _numericSkipResolutionPrefix.
     */
    @XmlAttribute(name = "numeric-skip-resolution-prefix")
    private Boolean _numericSkipResolutionPrefix;

    /**
     * Field _autoAcknowledgeAlarm.
     */
    @XmlElement(name = "auto-acknowledge-alarm")
    private org.opennms.netmgt.config.notifd.AutoAcknowledgeAlarm _autoAcknowledgeAlarm;

    /**
     * Field _autoAcknowledgeList.
     */
    @XmlElement(name = "auto-acknowledge")
    private java.util.List<org.opennms.netmgt.config.notifd.AutoAcknowledge> _autoAcknowledgeList;

    /**
     * Field _queueList.
     */
    @XmlElement(name = "queue")
    private java.util.List<org.opennms.netmgt.config.notifd.Queue> _queueList;

    /**
     * Field _outageCalendarList.
     */
    @XmlElement(name = "outage-calendar")
    private java.util.List<java.lang.String> _outageCalendarList;

      //----------------/
    //- Constructors -/
    //----------------/
    public NotifdConfiguration() {
        super();
        this._autoAcknowledgeList = new java.util.ArrayList<org.opennms.netmgt.config.notifd.AutoAcknowledge>();
        this._queueList = new java.util.ArrayList<org.opennms.netmgt.config.notifd.Queue>();
        this._outageCalendarList = new java.util.ArrayList<java.lang.String>();
    }

      //-----------/
    //- Methods -/
    //-----------/
    /**
     *
     *
     * @param vAutoAcknowledge
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAutoAcknowledge(
            final org.opennms.netmgt.config.notifd.AutoAcknowledge vAutoAcknowledge)
            throws java.lang.IndexOutOfBoundsException {
        this._autoAcknowledgeList.add(vAutoAcknowledge);
    }

    /**
     *
     *
     * @param index
     * @param vAutoAcknowledge
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAutoAcknowledge(
            final int index,
            final org.opennms.netmgt.config.notifd.AutoAcknowledge vAutoAcknowledge)
            throws java.lang.IndexOutOfBoundsException {
        this._autoAcknowledgeList.add(index, vAutoAcknowledge);
    }

    /**
     *
     *
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOutageCalendar(
            final java.lang.String vOutageCalendar)
            throws java.lang.IndexOutOfBoundsException {
        this._outageCalendarList.add(vOutageCalendar);
    }

    /**
     *
     *
     * @param index
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOutageCalendar(
            final int index,
            final java.lang.String vOutageCalendar)
            throws java.lang.IndexOutOfBoundsException {
        this._outageCalendarList.add(index, vOutageCalendar);
    }

    /**
     *
     *
     * @param vQueue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQueue(
            final org.opennms.netmgt.config.notifd.Queue vQueue)
            throws java.lang.IndexOutOfBoundsException {
        this._queueList.add(vQueue);
    }

    /**
     *
     *
     * @param index
     * @param vQueue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQueue(
            final int index,
            final org.opennms.netmgt.config.notifd.Queue vQueue)
            throws java.lang.IndexOutOfBoundsException {
        this._queueList.add(index, vQueue);
    }

    /**
     */
    public void deleteMatchAll() {
        this._matchAll = null;
    }

    /**
     */
    public void deleteNumericSkipResolutionPrefix() {
        this._numericSkipResolutionPrefix = null;
    }

    /**
     * Method enumerateAutoAcknowledge.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.notifd.AutoAcknowledge> enumerateAutoAcknowledge() {
        return java.util.Collections.enumeration(this._autoAcknowledgeList);
    }

    /**
     * Method enumerateOutageCalendar.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateOutageCalendar() {
        return java.util.Collections.enumeration(this._outageCalendarList);
    }

    /**
     * Method enumerateQueue.
     *
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.notifd.Queue> enumerateQueue() {
        return java.util.Collections.enumeration(this._queueList);
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

        if (obj instanceof NotifdConfiguration) {

            NotifdConfiguration temp = (NotifdConfiguration) obj;
            if (this._status != null) {
                if (temp._status == null) {
                    return false;
                } else if (!(this._status.equals(temp._status))) {
                    return false;
                }
            } else if (temp._status != null) {
                return false;
            }
            if (this._pagesSent != null) {
                if (temp._pagesSent == null) {
                    return false;
                } else if (!(this._pagesSent.equals(temp._pagesSent))) {
                    return false;
                }
            } else if (temp._pagesSent != null) {
                return false;
            }
            if (this._nextNotifId != null) {
                if (temp._nextNotifId == null) {
                    return false;
                } else if (!(this._nextNotifId.equals(temp._nextNotifId))) {
                    return false;
                }
            } else if (temp._nextNotifId != null) {
                return false;
            }
            if (this._nextUserNotifId != null) {
                if (temp._nextUserNotifId == null) {
                    return false;
                } else if (!(this._nextUserNotifId.equals(temp._nextUserNotifId))) {
                    return false;
                }
            } else if (temp._nextUserNotifId != null) {
                return false;
            }
            if (this._nextGroupId != null) {
                if (temp._nextGroupId == null) {
                    return false;
                } else if (!(this._nextGroupId.equals(temp._nextGroupId))) {
                    return false;
                }
            } else if (temp._nextGroupId != null) {
                return false;
            }
            if (this._serviceIdSql != null) {
                if (temp._serviceIdSql == null) {
                    return false;
                } else if (!(this._serviceIdSql.equals(temp._serviceIdSql))) {
                    return false;
                }
            } else if (temp._serviceIdSql != null) {
                return false;
            }
            if (this._outstandingNoticesSql != null) {
                if (temp._outstandingNoticesSql == null) {
                    return false;
                } else if (!(this._outstandingNoticesSql.equals(temp._outstandingNoticesSql))) {
                    return false;
                }
            } else if (temp._outstandingNoticesSql != null) {
                return false;
            }
            if (this._acknowledgeIdSql != null) {
                if (temp._acknowledgeIdSql == null) {
                    return false;
                } else if (!(this._acknowledgeIdSql.equals(temp._acknowledgeIdSql))) {
                    return false;
                }
            } else if (temp._acknowledgeIdSql != null) {
                return false;
            }
            if (this._acknowledgeUpdateSql != null) {
                if (temp._acknowledgeUpdateSql == null) {
                    return false;
                } else if (!(this._acknowledgeUpdateSql.equals(temp._acknowledgeUpdateSql))) {
                    return false;
                }
            } else if (temp._acknowledgeUpdateSql != null) {
                return false;
            }
            if (this._matchAll != null) {
                if (temp._matchAll == null) {
                    return false;
                } else if (!(this._matchAll.equals(temp._matchAll))) {
                    return false;
                }
            } else if (temp._matchAll != null) {
                return false;
            }
            if (this._emailAddressCommand != null) {
                if (temp._emailAddressCommand == null) {
                    return false;
                } else if (!(this._emailAddressCommand.equals(temp._emailAddressCommand))) {
                    return false;
                }
            } else if (temp._emailAddressCommand != null) {
                return false;
            }
            if (this._numericSkipResolutionPrefix != null) {
                if (temp._numericSkipResolutionPrefix == null) {
                    return false;
                } else if (!(this._numericSkipResolutionPrefix.equals(temp._numericSkipResolutionPrefix))) {
                    return false;
                }
            } else if (temp._numericSkipResolutionPrefix != null) {
                return false;
            }
            if (this._autoAcknowledgeAlarm != null) {
                if (temp._autoAcknowledgeAlarm == null) {
                    return false;
                } else if (!(this._autoAcknowledgeAlarm.equals(temp._autoAcknowledgeAlarm))) {
                    return false;
                }
            } else if (temp._autoAcknowledgeAlarm != null) {
                return false;
            }
            if (this._autoAcknowledgeList != null) {
                if (temp._autoAcknowledgeList == null) {
                    return false;
                } else if (!(this._autoAcknowledgeList.equals(temp._autoAcknowledgeList))) {
                    return false;
                }
            } else if (temp._autoAcknowledgeList != null) {
                return false;
            }
            if (this._queueList != null) {
                if (temp._queueList == null) {
                    return false;
                } else if (!(this._queueList.equals(temp._queueList))) {
                    return false;
                }
            } else if (temp._queueList != null) {
                return false;
            }
            if (this._outageCalendarList != null) {
                if (temp._outageCalendarList == null) {
                    return false;
                } else if (!(this._outageCalendarList.equals(temp._outageCalendarList))) {
                    return false;
                }
            } else if (temp._outageCalendarList != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'acknowledgeIdSql'.
     *
     * @return the value of field 'AcknowledgeIdSql'.
     */
    public java.lang.String getAcknowledgeIdSql() {
        return this._acknowledgeIdSql == null ? DEFAULT_ACKNOWLEDGE_ID_SQL : this._acknowledgeIdSql;
    }

    /**
     * Returns the value of field 'acknowledgeUpdateSql'.
     *
     * @return the value of field 'AcknowledgeUpdateSql'.
     */
    public java.lang.String getAcknowledgeUpdateSql() {
        return this._acknowledgeUpdateSql == null ? DEFAULT_ACKNOWLEDGE_UPDATE_SQL : this._acknowledgeUpdateSql;
    }

    /**
     * Method getAutoAcknowledge.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.notifd.AutoAcknowledge at the
     * given index
     */
    public org.opennms.netmgt.config.notifd.AutoAcknowledge getAutoAcknowledge(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._autoAcknowledgeList.size()) {
            throw new IndexOutOfBoundsException("getAutoAcknowledge: Index value '" + index + "' not in range [0.." + (this._autoAcknowledgeList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.notifd.AutoAcknowledge) _autoAcknowledgeList.get(index);
    }

    /**
     * Method getAutoAcknowledge.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.notifd.AutoAcknowledge[] getAutoAcknowledge() {
        org.opennms.netmgt.config.notifd.AutoAcknowledge[] array = new org.opennms.netmgt.config.notifd.AutoAcknowledge[0];
        return (org.opennms.netmgt.config.notifd.AutoAcknowledge[]) this._autoAcknowledgeList.toArray(array);
    }

    /**
     * Returns the value of field 'autoAcknowledgeAlarm'.
     *
     * @return the value of field 'AutoAcknowledgeAlarm'.
     */
    public org.opennms.netmgt.config.notifd.AutoAcknowledgeAlarm getAutoAcknowledgeAlarm() {
        return this._autoAcknowledgeAlarm;
    }

    /**
     * Method getAutoAcknowledgeCollection.Returns a reference to
     * '_autoAcknowledgeList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.notifd.AutoAcknowledge> getAutoAcknowledgeCollection() {
        return this._autoAcknowledgeList;
    }

    /**
     * Method getAutoAcknowledgeCount.
     *
     * @return the size of this collection
     */
    public int getAutoAcknowledgeCount() {
        return this._autoAcknowledgeList.size();
    }

    /**
     * Returns the value of field 'emailAddressCommand'.
     *
     * @return the value of field 'EmailAddressCommand'.
     */
    public java.lang.String getEmailAddressCommand() {
        return this._emailAddressCommand == null ? DEFAULT_EMAIL_ADDRESS_COMMAND : this._emailAddressCommand;
    }

    /**
     * Returns the value of field 'matchAll'.
     *
     * @return the value of field 'MatchAll'.
     */
    public Boolean getMatchAll() {
        return this._matchAll;
    }

    /**
     * Returns the value of field 'nextGroupId'.
     *
     * @return the value of field 'NextGroupId'.
     */
    public java.lang.String getNextGroupId() {
        return this._nextGroupId == null ? DEFAULT_NEXT_GROUP_ID : this._nextGroupId;
    }

    /**
     * Returns the value of field 'nextNotifId'.
     *
     * @return the value of field 'NextNotifId'.
     */
    public java.lang.String getNextNotifId() {
        return this._nextNotifId == null ? DEFAULT_NEXT_NOTIF_ID : this._nextNotifId;
    }

    /**
     * Returns the value of field 'nextUserNotifId'.
     *
     * @return the value of field 'NextUserNotifId'.
     */
    public java.lang.String getNextUserNotifId() {
        return this._nextUserNotifId == null ? DEFAULT_NEXT_USER_NOTIF_ID : this._nextUserNotifId;
    }

    /**
     * Returns the value of field 'numericSkipResolutionPrefix'.
     *
     * @return the value of field 'NumericSkipResolutionPrefix'.
     */
    public Boolean getNumericSkipResolutionPrefix() {
        return this._numericSkipResolutionPrefix == null ? Boolean.FALSE : this._numericSkipResolutionPrefix;
    }

    /**
     * Method getOutageCalendar.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getOutageCalendar(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._outageCalendarList.size()) {
            throw new IndexOutOfBoundsException("getOutageCalendar: Index value '" + index + "' not in range [0.." + (this._outageCalendarList.size() - 1) + "]");
        }

        return (java.lang.String) _outageCalendarList.get(index);
    }

    /**
     * Method getOutageCalendar.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call.
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     *
     * @return this collection as an Array
     */
    public java.lang.String[] getOutageCalendar() {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._outageCalendarList.toArray(array);
    }

    /**
     * Method getOutageCalendarCollection.Returns a reference to
     * '_outageCalendarList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getOutageCalendarCollection() {
        return this._outageCalendarList;
    }

    /**
     * Method getOutageCalendarCount.
     *
     * @return the size of this collection
     */
    public int getOutageCalendarCount() {
        return this._outageCalendarList.size();
    }

    /**
     * Returns the value of field 'outstandingNoticesSql'.
     *
     * @return the value of field 'OutstandingNoticesSql'.
     */
    public java.lang.String getOutstandingNoticesSql() {
        return this._outstandingNoticesSql == null ? DEFAULT_OUTSTANDING_NOTICES_SQL : this._outstandingNoticesSql;
    }

    /**
     * Returns the value of field 'pagesSent'.
     *
     * @return the value of field 'PagesSent'.
     */
    public java.lang.String getPagesSent() {
        return this._pagesSent == null ? DEFAULT_PAGES_SENT : this._pagesSent;
    }

    /**
     * Method getQueue.
     *
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.notifd.Queue at the given index
     */
    public org.opennms.netmgt.config.notifd.Queue getQueue(
            final int index)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._queueList.size()) {
            throw new IndexOutOfBoundsException("getQueue: Index value '" + index + "' not in range [0.." + (this._queueList.size() - 1) + "]");
        }

        return (org.opennms.netmgt.config.notifd.Queue) _queueList.get(index);
    }

    /**
     * Method getQueue.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     *
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.notifd.Queue[] getQueue() {
        org.opennms.netmgt.config.notifd.Queue[] array = new org.opennms.netmgt.config.notifd.Queue[0];
        return (org.opennms.netmgt.config.notifd.Queue[]) this._queueList.toArray(array);
    }

    /**
     * Method getQueueCollection.Returns a reference to
     * '_queueList'. No type checking is performed on any
     * modifications to the Vector.
     *
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.notifd.Queue> getQueueCollection() {
        return this._queueList;
    }

    /**
     * Method getQueueCount.
     *
     * @return the size of this collection
     */
    public int getQueueCount() {
        return this._queueList.size();
    }

    /**
     * Returns the value of field 'serviceIdSql'.
     *
     * @return the value of field 'ServiceIdSql'.
     */
    public java.lang.String getServiceIdSql() {
        return this._serviceIdSql == null ? DEFAULT_SERVICE_ID_SQL : this._serviceIdSql;
    }

    /**
     * Returns the value of field 'status'.
     *
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus() {
        return this._status;
    }

    /**
     * Method hasMatchAll.
     *
     * @return true if at least one MatchAll has been added
     */
    public boolean hasMatchAll() {
        return this._matchAll != null;
    }

    /**
     * Method hasNumericSkipResolutionPrefix.
     *
     * @return true if at least one NumericSkipResolutionPrefix has
     * been added
     */
    public boolean hasNumericSkipResolutionPrefix() {
        return this._numericSkipResolutionPrefix != null;
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
        if (_status != null) {
            result = 37 * result + _status.hashCode();
        }
        if (_pagesSent != null) {
            result = 37 * result + _pagesSent.hashCode();
        }
        if (_nextNotifId != null) {
            result = 37 * result + _nextNotifId.hashCode();
        }
        if (_nextUserNotifId != null) {
            result = 37 * result + _nextUserNotifId.hashCode();
        }
        if (_nextGroupId != null) {
            result = 37 * result + _nextGroupId.hashCode();
        }
        if (_serviceIdSql != null) {
            result = 37 * result + _serviceIdSql.hashCode();
        }
        if (_outstandingNoticesSql != null) {
            result = 37 * result + _outstandingNoticesSql.hashCode();
        }
        if (_acknowledgeIdSql != null) {
            result = 37 * result + _acknowledgeIdSql.hashCode();
        }
        if (_acknowledgeUpdateSql != null) {
            result = 37 * result + _acknowledgeUpdateSql.hashCode();
        }
        if (_matchAll != null) {
            result = 37 * result + _matchAll.hashCode();
        }
        if (_emailAddressCommand != null) {
            result = 37 * result + _emailAddressCommand.hashCode();
        }
        if (_numericSkipResolutionPrefix != null) {
            result = 37 * result + _numericSkipResolutionPrefix.hashCode();
        }
        if (_autoAcknowledgeAlarm != null) {
            result = 37 * result + _autoAcknowledgeAlarm.hashCode();
        }
        if (_autoAcknowledgeList != null) {
            result = 37 * result + _autoAcknowledgeList.hashCode();
        }
        if (_queueList != null) {
            result = 37 * result + _queueList.hashCode();
        }
        if (_outageCalendarList != null) {
            result = 37 * result + _outageCalendarList.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'matchAll'.
     *
     * @return the value of field 'MatchAll'.
     */
    public boolean isMatchAll() {
        return this._matchAll;
    }

    /**
     * Returns the value of field 'numericSkipResolutionPrefix'.
     *
     * @return the value of field 'NumericSkipResolutionPrefix'.
     */
    public boolean isNumericSkipResolutionPrefix() {
        return this._numericSkipResolutionPrefix;
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
     * Method iterateAutoAcknowledge.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.notifd.AutoAcknowledge> iterateAutoAcknowledge() {
        return this._autoAcknowledgeList.iterator();
    }

    /**
     * Method iterateOutageCalendar.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateOutageCalendar() {
        return this._outageCalendarList.iterator();
    }

    /**
     * Method iterateQueue.
     *
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.notifd.Queue> iterateQueue() {
        return this._queueList.iterator();
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
    public void removeAllAutoAcknowledge() {
        this._autoAcknowledgeList.clear();
    }

    /**
     */
    public void removeAllOutageCalendar() {
        this._outageCalendarList.clear();
    }

    /**
     */
    public void removeAllQueue() {
        this._queueList.clear();
    }

    /**
     * Method removeAutoAcknowledge.
     *
     * @param vAutoAcknowledge
     * @return true if the object was removed from the collection.
     */
    public boolean removeAutoAcknowledge(
            final org.opennms.netmgt.config.notifd.AutoAcknowledge vAutoAcknowledge) {
        boolean removed = _autoAcknowledgeList.remove(vAutoAcknowledge);
        return removed;
    }

    /**
     * Method removeAutoAcknowledgeAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.notifd.AutoAcknowledge removeAutoAcknowledgeAt(
            final int index) {
        java.lang.Object obj = this._autoAcknowledgeList.remove(index);
        return (org.opennms.netmgt.config.notifd.AutoAcknowledge) obj;
    }

    /**
     * Method removeOutageCalendar.
     *
     * @param vOutageCalendar
     * @return true if the object was removed from the collection.
     */
    public boolean removeOutageCalendar(
            final java.lang.String vOutageCalendar) {
        boolean removed = _outageCalendarList.remove(vOutageCalendar);
        return removed;
    }

    /**
     * Method removeOutageCalendarAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeOutageCalendarAt(
            final int index) {
        java.lang.Object obj = this._outageCalendarList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeQueue.
     *
     * @param vQueue
     * @return true if the object was removed from the collection.
     */
    public boolean removeQueue(
            final org.opennms.netmgt.config.notifd.Queue vQueue) {
        boolean removed = _queueList.remove(vQueue);
        return removed;
    }

    /**
     * Method removeQueueAt.
     *
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.notifd.Queue removeQueueAt(
            final int index) {
        java.lang.Object obj = this._queueList.remove(index);
        return (org.opennms.netmgt.config.notifd.Queue) obj;
    }

    /**
     * Sets the value of field 'acknowledgeIdSql'.
     *
     * @param acknowledgeIdSql the value of field 'acknowledgeIdSql'
     */
    public void setAcknowledgeIdSql(
            final java.lang.String acknowledgeIdSql) {
        this._acknowledgeIdSql = acknowledgeIdSql;
    }

    /**
     * Sets the value of field 'acknowledgeUpdateSql'.
     *
     * @param acknowledgeUpdateSql the value of field
     * 'acknowledgeUpdateSql'.
     */
    public void setAcknowledgeUpdateSql(
            final java.lang.String acknowledgeUpdateSql) {
        this._acknowledgeUpdateSql = acknowledgeUpdateSql;
    }

    /**
     *
     *
     * @param index
     * @param vAutoAcknowledge
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAutoAcknowledge(
            final int index,
            final org.opennms.netmgt.config.notifd.AutoAcknowledge vAutoAcknowledge)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._autoAcknowledgeList.size()) {
            throw new IndexOutOfBoundsException("setAutoAcknowledge: Index value '" + index + "' not in range [0.." + (this._autoAcknowledgeList.size() - 1) + "]");
        }

        this._autoAcknowledgeList.set(index, vAutoAcknowledge);
    }

    /**
     *
     *
     * @param vAutoAcknowledgeArray
     */
    public void setAutoAcknowledge(
            final org.opennms.netmgt.config.notifd.AutoAcknowledge[] vAutoAcknowledgeArray) {
        //-- copy array
        _autoAcknowledgeList.clear();

        for (int i = 0; i < vAutoAcknowledgeArray.length; i++) {
            this._autoAcknowledgeList.add(vAutoAcknowledgeArray[i]);
        }
    }

    /**
     * Sets the value of '_autoAcknowledgeList' by copying the
     * given Vector. All elements will be checked for type safety.
     *
     * @param vAutoAcknowledgeList the Vector to copy.
     */
    public void setAutoAcknowledge(
            final java.util.List<org.opennms.netmgt.config.notifd.AutoAcknowledge> vAutoAcknowledgeList) {
        // copy vector
        this._autoAcknowledgeList.clear();

        this._autoAcknowledgeList.addAll(vAutoAcknowledgeList);
    }

    /**
     * Sets the value of field 'autoAcknowledgeAlarm'.
     *
     * @param autoAcknowledgeAlarm the value of field
     * 'autoAcknowledgeAlarm'.
     */
    public void setAutoAcknowledgeAlarm(
            final org.opennms.netmgt.config.notifd.AutoAcknowledgeAlarm autoAcknowledgeAlarm) {
        this._autoAcknowledgeAlarm = autoAcknowledgeAlarm;
    }

    /**
     * Sets the value of '_autoAcknowledgeList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     *
     * @param autoAcknowledgeList the Vector to set.
     */
    public void setAutoAcknowledgeCollection(
            final java.util.List<org.opennms.netmgt.config.notifd.AutoAcknowledge> autoAcknowledgeList) {
        this._autoAcknowledgeList = autoAcknowledgeList;
    }

    /**
     * Sets the value of field 'emailAddressCommand'.
     *
     * @param emailAddressCommand the value of field
     * 'emailAddressCommand'.
     */
    public void setEmailAddressCommand(
            final java.lang.String emailAddressCommand) {
        this._emailAddressCommand = emailAddressCommand;
    }

    /**
     * Sets the value of field 'matchAll'.
     *
     * @param matchAll the value of field 'matchAll'.
     */
    public void setMatchAll(
            final Boolean matchAll) {
        this._matchAll = matchAll;
    }

    /**
     * Sets the value of field 'nextGroupId'.
     *
     * @param nextGroupId the value of field 'nextGroupId'.
     */
    public void setNextGroupId(
            final java.lang.String nextGroupId) {
        this._nextGroupId = nextGroupId;
    }

    /**
     * Sets the value of field 'nextNotifId'.
     *
     * @param nextNotifId the value of field 'nextNotifId'.
     */
    public void setNextNotifId(
            final java.lang.String nextNotifId) {
        this._nextNotifId = nextNotifId;
    }

    /**
     * Sets the value of field 'nextUserNotifId'.
     *
     * @param nextUserNotifId the value of field 'nextUserNotifId'.
     */
    public void setNextUserNotifId(
            final java.lang.String nextUserNotifId) {
        this._nextUserNotifId = nextUserNotifId;
    }

    /**
     * Sets the value of field 'numericSkipResolutionPrefix'.
     *
     * @param numericSkipResolutionPrefix the value of field
     * 'numericSkipResolutionPrefix'.
     */
    public void setNumericSkipResolutionPrefix(
            final Boolean numericSkipResolutionPrefix) {
        this._numericSkipResolutionPrefix = numericSkipResolutionPrefix;
    }

    /**
     *
     *
     * @param index
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOutageCalendar(
            final int index,
            final java.lang.String vOutageCalendar)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._outageCalendarList.size()) {
            throw new IndexOutOfBoundsException("setOutageCalendar: Index value '" + index + "' not in range [0.." + (this._outageCalendarList.size() - 1) + "]");
        }

        this._outageCalendarList.set(index, vOutageCalendar);
    }

    /**
     *
     *
     * @param vOutageCalendarArray
     */
    public void setOutageCalendar(
            final java.lang.String[] vOutageCalendarArray) {
        //-- copy array
        _outageCalendarList.clear();

        for (int i = 0; i < vOutageCalendarArray.length; i++) {
            this._outageCalendarList.add(vOutageCalendarArray[i]);
        }
    }

    /**
     * Sets the value of '_outageCalendarList' by copying the given
     * Vector. All elements will be checked for type safety.
     *
     * @param vOutageCalendarList the Vector to copy.
     */
    public void setOutageCalendar(
            final java.util.List<java.lang.String> vOutageCalendarList) {
        // copy vector
        this._outageCalendarList.clear();

        this._outageCalendarList.addAll(vOutageCalendarList);
    }

    /**
     * Sets the value of '_outageCalendarList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     *
     * @param outageCalendarList the Vector to set.
     */
    public void setOutageCalendarCollection(
            final java.util.List<java.lang.String> outageCalendarList) {
        this._outageCalendarList = outageCalendarList;
    }

    /**
     * Sets the value of field 'outstandingNoticesSql'.
     *
     * @param outstandingNoticesSql the value of field
     * 'outstandingNoticesSql'.
     */
    public void setOutstandingNoticesSql(
            final java.lang.String outstandingNoticesSql) {
        this._outstandingNoticesSql = outstandingNoticesSql;
    }

    /**
     * Sets the value of field 'pagesSent'.
     *
     * @param pagesSent the value of field 'pagesSent'.
     */
    public void setPagesSent(
            final java.lang.String pagesSent) {
        this._pagesSent = pagesSent;
    }

    /**
     *
     *
     * @param index
     * @param vQueue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setQueue(
            final int index,
            final org.opennms.netmgt.config.notifd.Queue vQueue)
            throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._queueList.size()) {
            throw new IndexOutOfBoundsException("setQueue: Index value '" + index + "' not in range [0.." + (this._queueList.size() - 1) + "]");
        }

        this._queueList.set(index, vQueue);
    }

    /**
     *
     *
     * @param vQueueArray
     */
    public void setQueue(
            final org.opennms.netmgt.config.notifd.Queue[] vQueueArray) {
        //-- copy array
        _queueList.clear();

        for (int i = 0; i < vQueueArray.length; i++) {
            this._queueList.add(vQueueArray[i]);
        }
    }

    /**
     * Sets the value of '_queueList' by copying the given Vector.
     * All elements will be checked for type safety.
     *
     * @param vQueueList the Vector to copy.
     */
    public void setQueue(
            final java.util.List<org.opennms.netmgt.config.notifd.Queue> vQueueList) {
        // copy vector
        this._queueList.clear();

        this._queueList.addAll(vQueueList);
    }

    /**
     * Sets the value of '_queueList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     *
     * @param queueList the Vector to set.
     */
    public void setQueueCollection(
            final java.util.List<org.opennms.netmgt.config.notifd.Queue> queueList) {
        this._queueList = queueList;
    }

    /**
     * Sets the value of field 'serviceIdSql'.
     *
     * @param serviceIdSql the value of field 'serviceIdSql'.
     */
    public void setServiceIdSql(
            final java.lang.String serviceIdSql) {
        this._serviceIdSql = serviceIdSql;
    }

    /**
     * Sets the value of field 'status'.
     *
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
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
     * org.opennms.netmgt.config.notifd.NotifdConfiguration
     */
    public static org.opennms.netmgt.config.notifd.NotifdConfiguration unmarshal(
            final java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifd.NotifdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifd.NotifdConfiguration.class, reader);
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
