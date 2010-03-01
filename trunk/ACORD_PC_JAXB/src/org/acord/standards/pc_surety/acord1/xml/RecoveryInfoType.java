//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RecoveryInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecoveryInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RecoveryStatusCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RecoveryDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Addr" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RecoveryLocationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Communications" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="ItemRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="RecoveryAgencyRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoveryInfo_Type", propOrder = {
    "recoveryStatusCd",
    "recoveryDt",
    "addr",
    "recoveryLocationDesc",
    "communications"
})
public class RecoveryInfoType {

    @XmlElement(name = "RecoveryStatusCd")
    protected List<OpenEnum> recoveryStatusCd;
    @XmlElement(name = "RecoveryDt")
    protected Date recoveryDt;
    @XmlElement(name = "Addr")
    protected AddrType addr;
    @XmlElement(name = "RecoveryLocationDesc")
    protected C255 recoveryLocationDesc;
    @XmlElement(name = "Communications")
    protected CommunicationsType communications;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "ItemRef")
    @XmlIDREF
    protected Object itemRef;
    @XmlAttribute(name = "RecoveryAgencyRef")
    @XmlIDREF
    protected Object recoveryAgencyRef;

    /**
     * Gets the value of the recoveryStatusCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoveryStatusCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecoveryStatusCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenEnum }
     * 
     * 
     */
    public List<OpenEnum> getRecoveryStatusCd() {
        if (recoveryStatusCd == null) {
            recoveryStatusCd = new ArrayList<OpenEnum>();
        }
        return this.recoveryStatusCd;
    }

    /**
     * Gets the value of the recoveryDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRecoveryDt() {
        return recoveryDt;
    }

    /**
     * Sets the value of the recoveryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRecoveryDt(Date value) {
        this.recoveryDt = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrType }
     *     
     */
    public AddrType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrType }
     *     
     */
    public void setAddr(AddrType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the recoveryLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRecoveryLocationDesc() {
        return recoveryLocationDesc;
    }

    /**
     * Sets the value of the recoveryLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRecoveryLocationDesc(C255 value) {
        this.recoveryLocationDesc = value;
    }

    /**
     * Gets the value of the communications property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsType }
     *     
     */
    public CommunicationsType getCommunications() {
        return communications;
    }

    /**
     * Sets the value of the communications property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsType }
     *     
     */
    public void setCommunications(CommunicationsType value) {
        this.communications = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemRef(Object value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the recoveryAgencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRecoveryAgencyRef() {
        return recoveryAgencyRef;
    }

    /**
     * Sets the value of the recoveryAgencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRecoveryAgencyRef(Object value) {
        this.recoveryAgencyRef = value;
    }

}
