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
 * <p>Java class for AutoInvestigationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoInvestigationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DeliveryDestinationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RentalStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RentalStatusDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ShippedConditionDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EventInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="ImpoundAgencyRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="ImpoundFacilityRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="PortOriginRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoInvestigationInfo_Type", propOrder = {
    "deliveryDestinationDesc",
    "rentalStatusCd",
    "rentalStatusDt",
    "shippedConditionDesc",
    "eventInfo"
})
public class AutoInvestigationInfoType {

    @XmlElement(name = "DeliveryDestinationDesc")
    protected C255 deliveryDestinationDesc;
    @XmlElement(name = "RentalStatusCd")
    protected OpenEnum rentalStatusCd;
    @XmlElement(name = "RentalStatusDt")
    protected Date rentalStatusDt;
    @XmlElement(name = "ShippedConditionDesc")
    protected C255 shippedConditionDesc;
    @XmlElement(name = "EventInfo")
    protected List<EventInfoType> eventInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "ImpoundAgencyRef")
    @XmlIDREF
    protected Object impoundAgencyRef;
    @XmlAttribute(name = "ImpoundFacilityRef")
    @XmlIDREF
    protected Object impoundFacilityRef;
    @XmlAttribute(name = "PortOriginRef")
    @XmlIDREF
    protected Object portOriginRef;

    /**
     * Gets the value of the deliveryDestinationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getDeliveryDestinationDesc() {
        return deliveryDestinationDesc;
    }

    /**
     * Sets the value of the deliveryDestinationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setDeliveryDestinationDesc(C255 value) {
        this.deliveryDestinationDesc = value;
    }

    /**
     * Gets the value of the rentalStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRentalStatusCd() {
        return rentalStatusCd;
    }

    /**
     * Sets the value of the rentalStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRentalStatusCd(OpenEnum value) {
        this.rentalStatusCd = value;
    }

    /**
     * Gets the value of the rentalStatusDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRentalStatusDt() {
        return rentalStatusDt;
    }

    /**
     * Sets the value of the rentalStatusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRentalStatusDt(Date value) {
        this.rentalStatusDt = value;
    }

    /**
     * Gets the value of the shippedConditionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getShippedConditionDesc() {
        return shippedConditionDesc;
    }

    /**
     * Sets the value of the shippedConditionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setShippedConditionDesc(C255 value) {
        this.shippedConditionDesc = value;
    }

    /**
     * Gets the value of the eventInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventInfoType }
     * 
     * 
     */
    public List<EventInfoType> getEventInfo() {
        if (eventInfo == null) {
            eventInfo = new ArrayList<EventInfoType>();
        }
        return this.eventInfo;
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
     * Gets the value of the impoundAgencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImpoundAgencyRef() {
        return impoundAgencyRef;
    }

    /**
     * Sets the value of the impoundAgencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImpoundAgencyRef(Object value) {
        this.impoundAgencyRef = value;
    }

    /**
     * Gets the value of the impoundFacilityRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImpoundFacilityRef() {
        return impoundFacilityRef;
    }

    /**
     * Sets the value of the impoundFacilityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImpoundFacilityRef(Object value) {
        this.impoundFacilityRef = value;
    }

    /**
     * Gets the value of the portOriginRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPortOriginRef() {
        return portOriginRef;
    }

    /**
     * Sets the value of the portOriginRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPortOriginRef(Object value) {
        this.portOriginRef = value;
    }

}