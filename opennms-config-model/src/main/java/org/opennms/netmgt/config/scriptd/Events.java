/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.scriptd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import javax.xml.bind.annotation.XmlElement;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Events.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Events implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ueiList.
     */
    @XmlElement(name="uei")
    private java.util.List<java.lang.String> _ueiList;

    /**
     * Field _eventScriptNameList.
     */
    @XmlElement(name="event-script-name")
    private java.util.List<java.lang.String> _eventScriptNameList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Events() {
        super();
        this._ueiList = new java.util.ArrayList<java.lang.String>();
        this._eventScriptNameList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEventScriptName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventScriptName(
            final java.lang.String vEventScriptName)
    throws java.lang.IndexOutOfBoundsException {
        this._eventScriptNameList.add(vEventScriptName);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventScriptName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventScriptName(
            final int index,
            final java.lang.String vEventScriptName)
    throws java.lang.IndexOutOfBoundsException {
        this._eventScriptNameList.add(index, vEventScriptName);
    }

    /**
     * 
     * 
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUei(
            final java.lang.String vUei)
    throws java.lang.IndexOutOfBoundsException {
        this._ueiList.add(vUei);
    }

    /**
     * 
     * 
     * @param index
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUei(
            final int index,
            final java.lang.String vUei)
    throws java.lang.IndexOutOfBoundsException {
        this._ueiList.add(index, vUei);
    }

    /**
     * Method enumerateEventScriptName.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateEventScriptName(
    ) {
        return java.util.Collections.enumeration(this._eventScriptNameList);
    }

    /**
     * Method enumerateUei.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateUei(
    ) {
        return java.util.Collections.enumeration(this._ueiList);
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
        
        if (obj instanceof Events) {
        
            Events temp = (Events)obj;
            if (this._ueiList != null) {
                if (temp._ueiList == null) return false;
                else if (!(this._ueiList.equals(temp._ueiList))) 
                    return false;
            }
            else if (temp._ueiList != null)
                return false;
            if (this._eventScriptNameList != null) {
                if (temp._eventScriptNameList == null) return false;
                else if (!(this._eventScriptNameList.equals(temp._eventScriptNameList))) 
                    return false;
            }
            else if (temp._eventScriptNameList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getEventScriptName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getEventScriptName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventScriptNameList.size()) {
            throw new IndexOutOfBoundsException("getEventScriptName: Index value '" + index + "' not in range [0.." + (this._eventScriptNameList.size() - 1) + "]");
        }
        
        return (java.lang.String) _eventScriptNameList.get(index);
    }

    /**
     * Method getEventScriptName.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getEventScriptName(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._eventScriptNameList.toArray(array);
    }

    /**
     * Method getEventScriptNameCollection.Returns a reference to
     * '_eventScriptNameList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getEventScriptNameCollection(
    ) {
        return this._eventScriptNameList;
    }

    /**
     * Method getEventScriptNameCount.
     * 
     * @return the size of this collection
     */
    public int getEventScriptNameCount(
    ) {
        return this._eventScriptNameList.size();
    }

    /**
     * Method getUei.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getUei(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiList.size()) {
            throw new IndexOutOfBoundsException("getUei: Index value '" + index + "' not in range [0.." + (this._ueiList.size() - 1) + "]");
        }
        
        return (java.lang.String) _ueiList.get(index);
    }

    /**
     * Method getUei.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getUei(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._ueiList.toArray(array);
    }

    /**
     * Method getUeiCollection.Returns a reference to '_ueiList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getUeiCollection(
    ) {
        return this._ueiList;
    }

    /**
     * Method getUeiCount.
     * 
     * @return the size of this collection
     */
    public int getUeiCount(
    ) {
        return this._ueiList.size();
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = 17;
        
        long tmp;
        if (_ueiList != null) {
           result = 37 * result + _ueiList.hashCode();
        }
        if (_eventScriptNameList != null) {
           result = 37 * result + _eventScriptNameList.hashCode();
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
     * Method iterateEventScriptName.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateEventScriptName(
    ) {
        return this._eventScriptNameList.iterator();
    }

    /**
     * Method iterateUei.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateUei(
    ) {
        return this._ueiList.iterator();
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
    public void removeAllEventScriptName(
    ) {
        this._eventScriptNameList.clear();
    }

    /**
     */
    public void removeAllUei(
    ) {
        this._ueiList.clear();
    }

    /**
     * Method removeEventScriptName.
     * 
     * @param vEventScriptName
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventScriptName(
            final java.lang.String vEventScriptName) {
        boolean removed = _eventScriptNameList.remove(vEventScriptName);
        return removed;
    }

    /**
     * Method removeEventScriptNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeEventScriptNameAt(
            final int index) {
        java.lang.Object obj = this._eventScriptNameList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeUei.
     * 
     * @param vUei
     * @return true if the object was removed from the collection.
     */
    public boolean removeUei(
            final java.lang.String vUei) {
        boolean removed = _ueiList.remove(vUei);
        return removed;
    }

    /**
     * Method removeUeiAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeUeiAt(
            final int index) {
        java.lang.Object obj = this._ueiList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEventScriptName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventScriptName(
            final int index,
            final java.lang.String vEventScriptName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventScriptNameList.size()) {
            throw new IndexOutOfBoundsException("setEventScriptName: Index value '" + index + "' not in range [0.." + (this._eventScriptNameList.size() - 1) + "]");
        }
        
        this._eventScriptNameList.set(index, vEventScriptName);
    }

    /**
     * 
     * 
     * @param vEventScriptNameArray
     */
    public void setEventScriptName(
            final java.lang.String[] vEventScriptNameArray) {
        //-- copy array
        _eventScriptNameList.clear();
        
        for (int i = 0; i < vEventScriptNameArray.length; i++) {
                this._eventScriptNameList.add(vEventScriptNameArray[i]);
        }
    }

    /**
     * Sets the value of '_eventScriptNameList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vEventScriptNameList the Vector to copy.
     */
    public void setEventScriptName(
            final java.util.List<java.lang.String> vEventScriptNameList) {
        // copy vector
        this._eventScriptNameList.clear();
        
        this._eventScriptNameList.addAll(vEventScriptNameList);
    }

    /**
     * Sets the value of '_eventScriptNameList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param eventScriptNameList the Vector to set.
     */
    public void setEventScriptNameCollection(
            final java.util.List<java.lang.String> eventScriptNameList) {
        this._eventScriptNameList = eventScriptNameList;
    }

    /**
     * 
     * 
     * @param index
     * @param vUei
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUei(
            final int index,
            final java.lang.String vUei)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ueiList.size()) {
            throw new IndexOutOfBoundsException("setUei: Index value '" + index + "' not in range [0.." + (this._ueiList.size() - 1) + "]");
        }
        
        this._ueiList.set(index, vUei);
    }

    /**
     * 
     * 
     * @param vUeiArray
     */
    public void setUei(
            final java.lang.String[] vUeiArray) {
        //-- copy array
        _ueiList.clear();
        
        for (int i = 0; i < vUeiArray.length; i++) {
                this._ueiList.add(vUeiArray[i]);
        }
    }

    /**
     * Sets the value of '_ueiList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vUeiList the Vector to copy.
     */
    public void setUei(
            final java.util.List<java.lang.String> vUeiList) {
        // copy vector
        this._ueiList.clear();
        
        this._ueiList.addAll(vUeiList);
    }

    /**
     * Sets the value of '_ueiList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ueiList the Vector to set.
     */
    public void setUeiCollection(
            final java.util.List<java.lang.String> ueiList) {
        this._ueiList = ueiList;
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
     * org.opennms.netmgt.config.scriptd.Events
     */
    public static org.opennms.netmgt.config.scriptd.Events unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.scriptd.Events) Unmarshaller.unmarshal(org.opennms.netmgt.config.scriptd.Events.class, reader);
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
