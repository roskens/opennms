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
package org.opennms.netmgt.config.rrd.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class DayOfWeek.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="dayOfWeek")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class DayOfWeek implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The MONDAY type
     */
    public static final int MONDAY_TYPE = 0;

    /**
     * The instance of the MONDAY type
     */
    public static final DayOfWeek MONDAY = new DayOfWeek(MONDAY_TYPE, "MONDAY");

    /**
     * The TUESDAY type
     */
    public static final int TUESDAY_TYPE = 1;

    /**
     * The instance of the TUESDAY type
     */
    public static final DayOfWeek TUESDAY = new DayOfWeek(TUESDAY_TYPE, "TUESDAY");

    /**
     * The WEDNESDAY type
     */
    public static final int WEDNESDAY_TYPE = 2;

    /**
     * The instance of the WEDNESDAY type
     */
    public static final DayOfWeek WEDNESDAY = new DayOfWeek(WEDNESDAY_TYPE, "WEDNESDAY");

    /**
     * The THURSDAY type
     */
    public static final int THURSDAY_TYPE = 3;

    /**
     * The instance of the THURSDAY type
     */
    public static final DayOfWeek THURSDAY = new DayOfWeek(THURSDAY_TYPE, "THURSDAY");

    /**
     * The FRIDAY type
     */
    public static final int FRIDAY_TYPE = 4;

    /**
     * The instance of the FRIDAY type
     */
    public static final DayOfWeek FRIDAY = new DayOfWeek(FRIDAY_TYPE, "FRIDAY");

    /**
     * The SATURDAY type
     */
    public static final int SATURDAY_TYPE = 5;

    /**
     * The instance of the SATURDAY type
     */
    public static final DayOfWeek SATURDAY = new DayOfWeek(SATURDAY_TYPE, "SATURDAY");

    /**
     * The SUNDAY type
     */
    public static final int SUNDAY_TYPE = 6;

    /**
     * The instance of the SUNDAY type
     */
    public static final DayOfWeek SUNDAY = new DayOfWeek(SUNDAY_TYPE, "SUNDAY");

    /**
     * Field _memberTable.
     */
    private static java.util.Hashtable<Object,Object> _memberTable = init();

    /**
     * Field type.
     */
    private final int type;

    /**
     * Field stringValue.
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private DayOfWeek(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of DayOfWeek
     *
     * @return an Enumeration over all possible instances of
     * DayOfWeek
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this DayOfWeek
     *
     * @return the type of this DayOfWeek
     */
    public int getType(
    ) {
        return this.type;
    }

    /**
     * Method init.
     *
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable<Object,Object> init(
    ) {
        Hashtable<Object, Object> members = new Hashtable<Object, Object>();
        members.put("MONDAY", MONDAY);
        members.put("TUESDAY", TUESDAY);
        members.put("WEDNESDAY", WEDNESDAY);
        members.put("THURSDAY", THURSDAY);
        members.put("FRIDAY", FRIDAY);
        members.put("SATURDAY", SATURDAY);
        members.put("SUNDAY", SUNDAY);
        return members;
    }

    /**
     * Method readResolve. will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance.
     *
     * @return this deserialized object
     */
    private java.lang.Object readResolve(
    ) {
        return valueOf(this.stringValue);
    }

    /**
     * Method toString.Returns the String representation of this
     * DayOfWeek
     *
     * @return the String representation of this DayOfWeek
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new DayOfWeek based on the given
     * String value.
     *
     * @param string
     * @return the DayOfWeek value of parameter 'string'
     */
    public static org.opennms.netmgt.config.rrd.types.DayOfWeek valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid DayOfWeek";
            throw new IllegalArgumentException(err);
        }
        return (DayOfWeek) obj;
    }

}
