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
 * <p>Java class for ExteriorWallMaterialInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExteriorWallMaterialInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ConstructionQualityCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExteriorWallMaterialCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExteriorWallMaterialPct" minOccurs="0"/>
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
@XmlType(name = "ExteriorWallMaterialInfo_Type", propOrder = {
    "constructionQualityCd",
    "exteriorWallMaterialCd",
    "exteriorWallMaterialPct"
})
public class ExteriorWallMaterialInfoType {

    @XmlElement(name = "ConstructionQualityCd")
    protected ConstructionClass constructionQualityCd;
    @XmlElement(name = "ExteriorWallMaterialCd")
    protected ConstructionType exteriorWallMaterialCd;
    @XmlElement(name = "ExteriorWallMaterialPct")
    protected PercentLong exteriorWallMaterialPct;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the constructionQualityCd property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionClass }
     *     
     */
    public ConstructionClass getConstructionQualityCd() {
        return constructionQualityCd;
    }

    /**
     * Sets the value of the constructionQualityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionClass }
     *     
     */
    public void setConstructionQualityCd(ConstructionClass value) {
        this.constructionQualityCd = value;
    }

    /**
     * Gets the value of the exteriorWallMaterialCd property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionType }
     *     
     */
    public ConstructionType getExteriorWallMaterialCd() {
        return exteriorWallMaterialCd;
    }

    /**
     * Sets the value of the exteriorWallMaterialCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionType }
     *     
     */
    public void setExteriorWallMaterialCd(ConstructionType value) {
        this.exteriorWallMaterialCd = value;
    }

    /**
     * Gets the value of the exteriorWallMaterialPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getExteriorWallMaterialPct() {
        return exteriorWallMaterialPct;
    }

    /**
     * Sets the value of the exteriorWallMaterialPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setExteriorWallMaterialPct(PercentLong value) {
        this.exteriorWallMaterialPct = value;
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