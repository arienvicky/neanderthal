//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductManufacturing_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductManufacturing_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FirmDesc" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PRODUCTS_CHOICE" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductManufacturing_Type", propOrder = {
    "firmDesc",
    "mfgAssembledDesc",
    "otherSpecsDesc",
    "otherProdSoldDesc"
})
public class ProductManufacturingType {

    @XmlElement(name = "FirmDesc")
    protected C255 firmDesc;
    @XmlElement(name = "MfgAssembledDesc")
    protected C255 mfgAssembledDesc;
    @XmlElement(name = "OtherSpecsDesc")
    protected C255 otherSpecsDesc;
    @XmlElement(name = "OtherProdSoldDesc")
    protected C255 otherProdSoldDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the firmDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getFirmDesc() {
        return firmDesc;
    }

    /**
     * Sets the value of the firmDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setFirmDesc(C255 value) {
        this.firmDesc = value;
    }

    /**
     * Gets the value of the mfgAssembledDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getMfgAssembledDesc() {
        return mfgAssembledDesc;
    }

    /**
     * Sets the value of the mfgAssembledDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setMfgAssembledDesc(C255 value) {
        this.mfgAssembledDesc = value;
    }

    /**
     * Gets the value of the otherSpecsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOtherSpecsDesc() {
        return otherSpecsDesc;
    }

    /**
     * Sets the value of the otherSpecsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOtherSpecsDesc(C255 value) {
        this.otherSpecsDesc = value;
    }

    /**
     * Gets the value of the otherProdSoldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOtherProdSoldDesc() {
        return otherProdSoldDesc;
    }

    /**
     * Sets the value of the otherProdSoldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOtherProdSoldDesc(C255 value) {
        this.otherProdSoldDesc = value;
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

}
