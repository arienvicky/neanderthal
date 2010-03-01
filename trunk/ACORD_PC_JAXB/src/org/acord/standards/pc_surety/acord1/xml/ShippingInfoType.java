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
 * <p>Java class for ShippingInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ConveyanceCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OriginDestinationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ValuesShippedInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="CarrierRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingInfo_Type", propOrder = {
    "conveyanceCd",
    "originDestinationInfo",
    "valuesShippedInfo"
})
public class ShippingInfoType {

    @XmlElement(name = "ConveyanceCd")
    protected Conveyance conveyanceCd;
    @XmlElement(name = "OriginDestinationInfo")
    protected List<OriginDestinationInfoType> originDestinationInfo;
    @XmlElement(name = "ValuesShippedInfo")
    protected List<ValuesShippedInfoType> valuesShippedInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "CarrierRef")
    @XmlIDREF
    protected Object carrierRef;

    /**
     * Gets the value of the conveyanceCd property.
     * 
     * @return
     *     possible object is
     *     {@link Conveyance }
     *     
     */
    public Conveyance getConveyanceCd() {
        return conveyanceCd;
    }

    /**
     * Sets the value of the conveyanceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conveyance }
     *     
     */
    public void setConveyanceCd(Conveyance value) {
        this.conveyanceCd = value;
    }

    /**
     * Gets the value of the originDestinationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestinationInfoType }
     * 
     * 
     */
    public List<OriginDestinationInfoType> getOriginDestinationInfo() {
        if (originDestinationInfo == null) {
            originDestinationInfo = new ArrayList<OriginDestinationInfoType>();
        }
        return this.originDestinationInfo;
    }

    /**
     * Gets the value of the valuesShippedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuesShippedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuesShippedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuesShippedInfoType }
     * 
     * 
     */
    public List<ValuesShippedInfoType> getValuesShippedInfo() {
        if (valuesShippedInfo == null) {
            valuesShippedInfo = new ArrayList<ValuesShippedInfoType>();
        }
        return this.valuesShippedInfo;
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
     * Gets the value of the carrierRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCarrierRef() {
        return carrierRef;
    }

    /**
     * Sets the value of the carrierRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCarrierRef(Object value) {
        this.carrierRef = value;
    }

}
