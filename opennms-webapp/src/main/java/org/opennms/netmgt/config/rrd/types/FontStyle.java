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
 * Class FontStyle.
 *
 * @version $Revision$ $Date$
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="fontStyle")
@XmlAccessorType(XmlAccessType.FIELD)
@ValidateUsing("jrobin.xsd")
@SuppressWarnings("all") public class FontStyle implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PLAIN type
     */
    public static final int PLAIN_TYPE = 0;

    /**
     * The instance of the PLAIN type
     */
    public static final FontStyle PLAIN = new FontStyle(PLAIN_TYPE, "PLAIN");

    /**
     * The BOLD type
     */
    public static final int BOLD_TYPE = 1;

    /**
     * The instance of the BOLD type
     */
    public static final FontStyle BOLD = new FontStyle(BOLD_TYPE, "BOLD");

    /**
     * The ITALIC type
     */
    public static final int ITALIC_TYPE = 2;

    /**
     * The instance of the ITALIC type
     */
    public static final FontStyle ITALIC = new FontStyle(ITALIC_TYPE, "ITALIC");

    /**
     * The BOLD ITALIC type
     */
    public static final int BOLD_ITALIC_TYPE = 3;

    /**
     * The instance of the BOLD ITALIC type
     */
    public static final FontStyle BOLD_ITALIC = new FontStyle(BOLD_ITALIC_TYPE, "BOLD ITALIC");

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

    private FontStyle(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of FontStyle
     *
     * @return an Enumeration over all possible instances of
     * FontStyle
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this FontStyle
     *
     * @return the type of this FontStyle
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
        members.put("PLAIN", PLAIN);
        members.put("BOLD", BOLD);
        members.put("ITALIC", ITALIC);
        members.put("BOLD ITALIC", BOLD_ITALIC);
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
     * FontStyle
     *
     * @return the String representation of this FontStyle
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new FontStyle based on the given
     * String value.
     *
     * @param string
     * @return the FontStyle value of parameter 'string'
     */
    public static org.opennms.netmgt.config.rrd.types.FontStyle valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid FontStyle";
            throw new IllegalArgumentException(err);
        }
        return (FontStyle) obj;
    }

}
