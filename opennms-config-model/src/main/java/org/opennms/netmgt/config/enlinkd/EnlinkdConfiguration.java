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
package org.opennms.netmgt.config.enlinkd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the enlinkd-configuration.xml
 *  configuration file.
 *
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="enlinkd-configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("enlinkd-configuration.xsd")
@SuppressWarnings("all") public class EnlinkdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The max number of threads used for polling snmp
     *  devices and discovery links.
     *
     */
    private Integer _threads;

    /**
     * The initial sleep time in mill seconds before starting
     *  node Link Discovery.
     *
     */
    private Long _initial_sleep_time;

    /**
     * Node Link Discovery Rescan Time interval in mill seconds.
     *
     */
    private Long _rescan_interval;

    /**
     * Whether links discovery process should use
     *  cisco discovery protocol cache table.
     *
     */
    private Boolean _useCdpDiscovery;

    /**
     * Whether links discovery process should use
     *  Bridge mib data.
     *
     */
    private Boolean _useBridgeDiscovery;

    /**
     * Whether links discovery process should use
     *  lldp mib data.
     *
     */
    private Boolean _useLldpDiscovery;

    /**
     * Whether links discovery process should use
     *  ospf mib data.
     *
     */
    private Boolean _useOspfDiscovery;

    /**
     * Whether links discovery process should use
     *  isis mib data.
     *
     */
    private Boolean _useIsisDiscovery;

      //----------------/
     //- Constructors -/
    //----------------/

    public EnlinkdConfiguration() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteInitial_sleep_time(
    ) {
        this._initial_sleep_time= null;
    }

    /**
     */
    public void deleteRescan_interval(
    ) {
        this._rescan_interval= null;
    }

    /**
     */
    public void deleteThreads(
    ) {
        this._threads= null;
    }

    /**
     */
    public void deleteUseBridgeDiscovery(
    ) {
        this._useBridgeDiscovery= null;
    }

    /**
     */
    public void deleteUseCdpDiscovery(
    ) {
        this._useCdpDiscovery= null;
    }

    /**
     */
    public void deleteUseIsisDiscovery(
    ) {
        this._useIsisDiscovery= null;
    }

    /**
     */
    public void deleteUseLldpDiscovery(
    ) {
        this._useLldpDiscovery= null;
    }

    /**
     */
    public void deleteUseOspfDiscovery(
    ) {
        this._useOspfDiscovery= null;
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

        if (obj instanceof EnlinkdConfiguration) {

            EnlinkdConfiguration temp = (EnlinkdConfiguration)obj;
            if (this._threads != null) {
                if (temp._threads == null) return false;
                else if (!(this._threads.equals(temp._threads)))
                    return false;
            }
            else if (temp._threads != null)
                return false;
            if (this._initial_sleep_time != null) {
                if (temp._initial_sleep_time == null) return false;
                else if (!(this._initial_sleep_time.equals(temp._initial_sleep_time)))
                    return false;
            }
            else if (temp._initial_sleep_time != null)
                return false;
            if (this._rescan_interval != null) {
                if (temp._rescan_interval == null) return false;
                else if (!(this._rescan_interval.equals(temp._rescan_interval)))
                    return false;
            }
            else if (temp._rescan_interval != null)
                return false;
            if (this._useCdpDiscovery != null) {
                if (temp._useCdpDiscovery == null) return false;
                else if (!(this._useCdpDiscovery.equals(temp._useCdpDiscovery)))
                    return false;
            }
            else if (temp._useCdpDiscovery != null)
                return false;
            if (this._useBridgeDiscovery != null) {
                if (temp._useBridgeDiscovery == null) return false;
                else if (!(this._useBridgeDiscovery.equals(temp._useBridgeDiscovery)))
                    return false;
            }
            else if (temp._useBridgeDiscovery != null)
                return false;
            if (this._useLldpDiscovery != null) {
                if (temp._useLldpDiscovery == null) return false;
                else if (!(this._useLldpDiscovery.equals(temp._useLldpDiscovery)))
                    return false;
            }
            else if (temp._useLldpDiscovery != null)
                return false;
            if (this._useOspfDiscovery != null) {
                if (temp._useOspfDiscovery == null) return false;
                else if (!(this._useOspfDiscovery.equals(temp._useOspfDiscovery)))
                    return false;
            }
            else if (temp._useOspfDiscovery != null)
                return false;
            if (this._useIsisDiscovery != null) {
                if (temp._useIsisDiscovery == null) return false;
                else if (!(this._useIsisDiscovery.equals(temp._useIsisDiscovery)))
                    return false;
            }
            else if (temp._useIsisDiscovery != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'initial_sleep_time'. The field
     * 'initial_sleep_time' has the following description: The
     * initial sleep time in mill seconds before starting
     *  node Link Discovery.
     *
     *
     * @return the value of field 'Initial_sleep_time'.
     */
    public Long getInitial_sleep_time(
    ) {
        return this._initial_sleep_time;
    }

    /**
     * Returns the value of field 'rescan_interval'. The field
     * 'rescan_interval' has the following description: Node Link
     * Discovery Rescan Time interval in mill seconds.
     *
     *
     * @return the value of field 'Rescan_interval'.
     */
    public Long getRescan_interval(
    ) {
        return this._rescan_interval;
    }

    /**
     * Returns the value of field 'threads'. The field 'threads'
     * has the following description: The max number of threads
     * used for polling snmp
     *  devices and discovery links.
     *
     *
     * @return the value of field 'Threads'.
     */
    public Integer getThreads(
    ) {
        return this._threads;
    }

    /**
     * Returns the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description: Whether
     * links discovery process should use
     *  Bridge mib data.
     *
     *
     * @return the value of field 'UseBridgeDiscovery'.
     */
    public Boolean getUseBridgeDiscovery(
    ) {
        return this._useBridgeDiscovery == null ? true : this._useBridgeDiscovery;
    }

    /**
     * Returns the value of field 'useCdpDiscovery'. The field
     * 'useCdpDiscovery' has the following description: Whether
     * links discovery process should use
     *  cisco discovery protocol cache table.
     *
     *
     * @return the value of field 'UseCdpDiscovery'.
     */
    public Boolean getUseCdpDiscovery(
    ) {
        return this._useCdpDiscovery == null ? true : this._useCdpDiscovery;
    }

    /**
     * Returns the value of field 'useIsisDiscovery'. The field
     * 'useIsisDiscovery' has the following description: Whether
     * links discovery process should use
     *  isis mib data.
     *
     *
     * @return the value of field 'UseIsisDiscovery'.
     */
    public Boolean getUseIsisDiscovery(
    ) {
        return this._useIsisDiscovery == null ? true : this._useIsisDiscovery;
    }

    /**
     * Returns the value of field 'useLldpDiscovery'. The field
     * 'useLldpDiscovery' has the following description: Whether
     * links discovery process should use
     *  lldp mib data.
     *
     *
     * @return the value of field 'UseLldpDiscovery'.
     */
    public Boolean getUseLldpDiscovery(
    ) {
        return this._useLldpDiscovery == null ? true : this._useLldpDiscovery;
    }

    /**
     * Returns the value of field 'useOspfDiscovery'. The field
     * 'useOspfDiscovery' has the following description: Whether
     * links discovery process should use
     *  ospf mib data.
     *
     *
     * @return the value of field 'UseOspfDiscovery'.
     */
    public Boolean getUseOspfDiscovery(
    ) {
        return this._useOspfDiscovery == null ? true : this._useOspfDiscovery;
    }

    /**
     * Method hasInitial_sleep_time.
     *
     * @return true if at least one Initial_sleep_time has been adde
     */
    public boolean hasInitial_sleep_time(
    ) {
        return this._initial_sleep_time != null;
    }

    /**
     * Method hasRescan_interval.
     *
     * @return true if at least one Rescan_interval has been added
     */
    public boolean hasRescan_interval(
    ) {
        return this._rescan_interval != null;
    }

    /**
     * Method hasThreads.
     *
     * @return true if at least one Threads has been added
     */
    public boolean hasThreads(
    ) {
        return this._threads != null;
    }

    /**
     * Method hasUseBridgeDiscovery.
     *
     * @return true if at least one UseBridgeDiscovery has been adde
     */
    public boolean hasUseBridgeDiscovery(
    ) {
        return this._useBridgeDiscovery != null;
    }

    /**
     * Method hasUseCdpDiscovery.
     *
     * @return true if at least one UseCdpDiscovery has been added
     */
    public boolean hasUseCdpDiscovery(
    ) {
        return this._useCdpDiscovery != null;
    }

    /**
     * Method hasUseIsisDiscovery.
     *
     * @return true if at least one UseIsisDiscovery has been added
     */
    public boolean hasUseIsisDiscovery(
    ) {
        return this._useIsisDiscovery != null;
    }

    /**
     * Method hasUseLldpDiscovery.
     *
     * @return true if at least one UseLldpDiscovery has been added
     */
    public boolean hasUseLldpDiscovery(
    ) {
        return this._useLldpDiscovery != null;
    }

    /**
     * Method hasUseOspfDiscovery.
     *
     * @return true if at least one UseOspfDiscovery has been added
     */
    public boolean hasUseOspfDiscovery(
    ) {
        return this._useOspfDiscovery != null;
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
        if (_threads != null) {
            result = 37 * result + _threads.hashCode();
        }
        if (_initial_sleep_time != null) {
            result = 37 * result + _initial_sleep_time.hashCode();
        }
        if (_rescan_interval != null) {
            result = 37 * result + _rescan_interval.hashCode();
        }
        if (_useCdpDiscovery != null) {
            result = 37 * result + _useCdpDiscovery.hashCode();
        }
        if (_useBridgeDiscovery != null) {
            result = 37 * result + _useBridgeDiscovery.hashCode();
        }
        if (_useLldpDiscovery != null) {
            result = 37 * result + _useLldpDiscovery.hashCode();
        }
        if (_useOspfDiscovery != null) {
            result = 37 * result + _useOspfDiscovery.hashCode();
        }
        if (_useIsisDiscovery != null) {
            result = 37 * result + _useIsisDiscovery.hashCode();
        }

        return result;
    }

    /**
     * Returns the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description: Whether
     * links discovery process should use
     *  Bridge mib data.
     *
     *
     * @return the value of field 'UseBridgeDiscovery'.
     */
    public boolean isUseBridgeDiscovery(
    ) {
        return this._useBridgeDiscovery;
    }

    /**
     * Returns the value of field 'useCdpDiscovery'. The field
     * 'useCdpDiscovery' has the following description: Whether
     * links discovery process should use
     *  cisco discovery protocol cache table.
     *
     *
     * @return the value of field 'UseCdpDiscovery'.
     */
    public boolean isUseCdpDiscovery(
    ) {
        return this._useCdpDiscovery;
    }

    /**
     * Returns the value of field 'useIsisDiscovery'. The field
     * 'useIsisDiscovery' has the following description: Whether
     * links discovery process should use
     *  isis mib data.
     *
     *
     * @return the value of field 'UseIsisDiscovery'.
     */
    public boolean isUseIsisDiscovery(
    ) {
        return this._useIsisDiscovery;
    }

    /**
     * Returns the value of field 'useLldpDiscovery'. The field
     * 'useLldpDiscovery' has the following description: Whether
     * links discovery process should use
     *  lldp mib data.
     *
     *
     * @return the value of field 'UseLldpDiscovery'.
     */
    public boolean isUseLldpDiscovery(
    ) {
        return this._useLldpDiscovery;
    }

    /**
     * Returns the value of field 'useOspfDiscovery'. The field
     * 'useOspfDiscovery' has the following description: Whether
     * links discovery process should use
     *  ospf mib data.
     *
     *
     * @return the value of field 'UseOspfDiscovery'.
     */
    public boolean isUseOspfDiscovery(
    ) {
        return this._useOspfDiscovery;
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
     * Sets the value of field 'initial_sleep_time'. The field
     * 'initial_sleep_time' has the following description: The
     * initial sleep time in mill seconds before starting
     *  node Link Discovery.
     *
     *
     * @param initial_sleep_time the value of field
     * 'initial_sleep_time'.
     */
    public void setInitial_sleep_time(
            final Long initial_sleep_time) {
        this._initial_sleep_time = initial_sleep_time;
    }

    /**
     * Sets the value of field 'rescan_interval'. The field
     * 'rescan_interval' has the following description: Node Link
     * Discovery Rescan Time interval in mill seconds.
     *
     *
     * @param rescan_interval the value of field 'rescan_interval'.
     */
    public void setRescan_interval(
            final Long rescan_interval) {
        this._rescan_interval = rescan_interval;
    }

    /**
     * Sets the value of field 'threads'. The field 'threads' has
     * the following description: The max number of threads used
     * for polling snmp
     *  devices and discovery links.
     *
     *
     * @param threads the value of field 'threads'.
     */
    public void setThreads(
            final Integer threads) {
        this._threads = threads;
    }

    /**
     * Sets the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description: Whether
     * links discovery process should use
     *  Bridge mib data.
     *
     *
     * @param useBridgeDiscovery the value of field
     * 'useBridgeDiscovery'.
     */
    public void setUseBridgeDiscovery(
            final Boolean useBridgeDiscovery) {
        this._useBridgeDiscovery = useBridgeDiscovery;
    }

    /**
     * Sets the value of field 'useCdpDiscovery'. The field
     * 'useCdpDiscovery' has the following description: Whether
     * links discovery process should use
     *  cisco discovery protocol cache table.
     *
     *
     * @param useCdpDiscovery the value of field 'useCdpDiscovery'.
     */
    public void setUseCdpDiscovery(
            final Boolean useCdpDiscovery) {
        this._useCdpDiscovery = useCdpDiscovery;
    }

    /**
     * Sets the value of field 'useIsisDiscovery'. The field
     * 'useIsisDiscovery' has the following description: Whether
     * links discovery process should use
     *  isis mib data.
     *
     *
     * @param useIsisDiscovery the value of field 'useIsisDiscovery'
     */
    public void setUseIsisDiscovery(
            final Boolean useIsisDiscovery) {
        this._useIsisDiscovery = useIsisDiscovery;
    }

    /**
     * Sets the value of field 'useLldpDiscovery'. The field
     * 'useLldpDiscovery' has the following description: Whether
     * links discovery process should use
     *  lldp mib data.
     *
     *
     * @param useLldpDiscovery the value of field 'useLldpDiscovery'
     */
    public void setUseLldpDiscovery(
            final Boolean useLldpDiscovery) {
        this._useLldpDiscovery = useLldpDiscovery;
    }

    /**
     * Sets the value of field 'useOspfDiscovery'. The field
     * 'useOspfDiscovery' has the following description: Whether
     * links discovery process should use
     *  ospf mib data.
     *
     *
     * @param useOspfDiscovery the value of field 'useOspfDiscovery'
     */
    public void setUseOspfDiscovery(
            final Boolean useOspfDiscovery) {
        this._useOspfDiscovery = useOspfDiscovery;
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
     * org.opennms.netmgt.config.enlinkd.EnlinkdConfiguration
     */
    public static org.opennms.netmgt.config.enlinkd.EnlinkdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.enlinkd.EnlinkdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.enlinkd.EnlinkdConfiguration.class, reader);
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
