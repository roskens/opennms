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
 * Class GridTimeUnit.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="gridTimeUnit")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class GridTimeUnit implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The SECOND type
     */
    public static final int SECOND_TYPE = 0;

    /**
     * The instance of the SECOND type
     */
    public static final GridTimeUnit SECOND = new GridTimeUnit(SECOND_TYPE, "SECOND");

    /**
     * The MINUTE type
     */
    public static final int MINUTE_TYPE = 1;

    /**
     * The instance of the MINUTE type
     */
    public static final GridTimeUnit MINUTE = new GridTimeUnit(MINUTE_TYPE, "MINUTE");

    /**
     * The HOUR type
     */
    public static final int HOUR_TYPE = 2;

    /**
     * The instance of the HOUR type
     */
    public static final GridTimeUnit HOUR = new GridTimeUnit(HOUR_TYPE, "HOUR");

    /**
     * The DAY type
     */
    public static final int DAY_TYPE = 3;

    /**
     * The instance of the DAY type
     */
    public static final GridTimeUnit DAY = new GridTimeUnit(DAY_TYPE, "DAY");

    /**
     * The WEEK type
     */
    public static final int WEEK_TYPE = 4;

    /**
     * The instance of the WEEK type
     */
    public static final GridTimeUnit WEEK = new GridTimeUnit(WEEK_TYPE, "WEEK");

    /**
     * The MONTH type
     */
    public static final int MONTH_TYPE = 5;

    /**
     * The instance of the MONTH type
     */
    public static final GridTimeUnit MONTH = new GridTimeUnit(MONTH_TYPE, "MONTH");

    /**
     * The YEAR type
     */
    public static final int YEAR_TYPE = 6;

    /**
     * The instance of the YEAR type
     */
    public static final GridTimeUnit YEAR = new GridTimeUnit(YEAR_TYPE, "YEAR");

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

    private GridTimeUnit(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of GridTimeUnit
     *
     * @return an Enumeration over all possible instances of
     * GridTimeUnit
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this GridTimeUnit
     *
     * @return the type of this GridTimeUnit
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
        members.put("SECOND", SECOND);
        members.put("MINUTE", MINUTE);
        members.put("HOUR", HOUR);
        members.put("DAY", DAY);
        members.put("WEEK", WEEK);
        members.put("MONTH", MONTH);
        members.put("YEAR", YEAR);
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
     * GridTimeUnit
     *
     * @return the String representation of this GridTimeUnit
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new GridTimeUnit based on the given
     * String value.
     *
     * @param string
     * @return the GridTimeUnit value of parameter 'string'
     */
    public static org.opennms.netmgt.config.rrd.types.GridTimeUnit valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid GridTimeUnit";
            throw new IllegalArgumentException(err);
        }
        return (GridTimeUnit) obj;
    }

}
