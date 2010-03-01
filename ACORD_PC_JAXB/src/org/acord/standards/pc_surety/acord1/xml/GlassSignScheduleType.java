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
 * <p>Java class for GlassSignSchedule_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlassSignSchedule_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ScheduleTypeCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumMotelRooms" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumPlates" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PlateSizeLength" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PlateSizeWidth" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PlateSizeArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SafetyGlassInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}KindGlassClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GlassPositionAndUseInBldgCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Limit" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UseAndPositionInBldgDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumPlatesLargePlateLossPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InsideOutsideSignCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GlassBldgInteriorInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GlassTenantsExteriorInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Length" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemValueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SignConstructionMaterialCd" minOccurs="0"/>
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
@XmlType(name = "GlassSignSchedule_Type", propOrder = {
    "itemIdInfo",
    "scheduleTypeCd",
    "numMotelRooms",
    "numPlates",
    "plateSizeLength",
    "plateSizeWidth",
    "plateSizeArea",
    "safetyGlassInd",
    "kindGlassClassCd",
    "glassPositionAndUseInBldgCd",
    "limit",
    "itemDesc",
    "useAndPositionInBldgDesc",
    "numPlatesLargePlateLossPayment",
    "insideOutsideSignCd",
    "glassBldgInteriorInd",
    "glassTenantsExteriorInd",
    "length",
    "itemValueAmt",
    "signConstructionMaterialCd"
})
public class GlassSignScheduleType {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "ScheduleTypeCd", required = true)
    protected ScheduleType scheduleTypeCd;
    @XmlElement(name = "NumMotelRooms")
    protected Long numMotelRooms;
    @XmlElement(name = "NumPlates")
    protected Long numPlates;
    @XmlElement(name = "PlateSizeLength")
    protected MEASUREMENT plateSizeLength;
    @XmlElement(name = "PlateSizeWidth")
    protected MEASUREMENT plateSizeWidth;
    @XmlElement(name = "PlateSizeArea")
    protected MEASUREMENT plateSizeArea;
    @XmlElement(name = "SafetyGlassInd")
    protected Boolean safetyGlassInd;
    @XmlElement(name = "KindGlassClassCd")
    protected OpenEnum kindGlassClassCd;
    @XmlElement(name = "GlassPositionAndUseInBldgCd")
    protected OpenEnum glassPositionAndUseInBldgCd;
    @XmlElement(name = "Limit")
    protected LimitType limit;
    @XmlElement(name = "ItemDesc")
    protected CInfinite itemDesc;
    @XmlElement(name = "UseAndPositionInBldgDesc")
    protected C255 useAndPositionInBldgDesc;
    @XmlElement(name = "NumPlatesLargePlateLossPayment")
    protected Long numPlatesLargePlateLossPayment;
    @XmlElement(name = "InsideOutsideSignCd")
    protected InsideOutside insideOutsideSignCd;
    @XmlElement(name = "GlassBldgInteriorInd")
    protected Boolean glassBldgInteriorInd;
    @XmlElement(name = "GlassTenantsExteriorInd")
    protected Boolean glassTenantsExteriorInd;
    @XmlElement(name = "Length")
    protected MEASUREMENT length;
    @XmlElement(name = "ItemValueAmt")
    protected CURRENCY itemValueAmt;
    @XmlElement(name = "SignConstructionMaterialCd")
    protected SignConstructionMaterial signConstructionMaterialCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfoType }
     *     
     */
    public ItemIdInfoType getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfoType }
     *     
     */
    public void setItemIdInfo(ItemIdInfoType value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the scheduleTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getScheduleTypeCd() {
        return scheduleTypeCd;
    }

    /**
     * Sets the value of the scheduleTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setScheduleTypeCd(ScheduleType value) {
        this.scheduleTypeCd = value;
    }

    /**
     * Gets the value of the numMotelRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumMotelRooms() {
        return numMotelRooms;
    }

    /**
     * Sets the value of the numMotelRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumMotelRooms(Long value) {
        this.numMotelRooms = value;
    }

    /**
     * Gets the value of the numPlates property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPlates() {
        return numPlates;
    }

    /**
     * Sets the value of the numPlates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPlates(Long value) {
        this.numPlates = value;
    }

    /**
     * Gets the value of the plateSizeLength property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getPlateSizeLength() {
        return plateSizeLength;
    }

    /**
     * Sets the value of the plateSizeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setPlateSizeLength(MEASUREMENT value) {
        this.plateSizeLength = value;
    }

    /**
     * Gets the value of the plateSizeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getPlateSizeWidth() {
        return plateSizeWidth;
    }

    /**
     * Sets the value of the plateSizeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setPlateSizeWidth(MEASUREMENT value) {
        this.plateSizeWidth = value;
    }

    /**
     * Gets the value of the plateSizeArea property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getPlateSizeArea() {
        return plateSizeArea;
    }

    /**
     * Sets the value of the plateSizeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setPlateSizeArea(MEASUREMENT value) {
        this.plateSizeArea = value;
    }

    /**
     * Gets the value of the safetyGlassInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSafetyGlassInd() {
        return safetyGlassInd;
    }

    /**
     * Sets the value of the safetyGlassInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafetyGlassInd(Boolean value) {
        this.safetyGlassInd = value;
    }

    /**
     * Gets the value of the kindGlassClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getKindGlassClassCd() {
        return kindGlassClassCd;
    }

    /**
     * Sets the value of the kindGlassClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setKindGlassClassCd(OpenEnum value) {
        this.kindGlassClassCd = value;
    }

    /**
     * Gets the value of the glassPositionAndUseInBldgCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getGlassPositionAndUseInBldgCd() {
        return glassPositionAndUseInBldgCd;
    }

    /**
     * Sets the value of the glassPositionAndUseInBldgCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setGlassPositionAndUseInBldgCd(OpenEnum value) {
        this.glassPositionAndUseInBldgCd = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType }
     *     
     */
    public LimitType getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType }
     *     
     */
    public void setLimit(LimitType value) {
        this.limit = value;
    }

    /**
     * Gets the value of the itemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getItemDesc() {
        return itemDesc;
    }

    /**
     * Sets the value of the itemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setItemDesc(CInfinite value) {
        this.itemDesc = value;
    }

    /**
     * Gets the value of the useAndPositionInBldgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getUseAndPositionInBldgDesc() {
        return useAndPositionInBldgDesc;
    }

    /**
     * Sets the value of the useAndPositionInBldgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setUseAndPositionInBldgDesc(C255 value) {
        this.useAndPositionInBldgDesc = value;
    }

    /**
     * Gets the value of the numPlatesLargePlateLossPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPlatesLargePlateLossPayment() {
        return numPlatesLargePlateLossPayment;
    }

    /**
     * Sets the value of the numPlatesLargePlateLossPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPlatesLargePlateLossPayment(Long value) {
        this.numPlatesLargePlateLossPayment = value;
    }

    /**
     * Gets the value of the insideOutsideSignCd property.
     * 
     * @return
     *     possible object is
     *     {@link InsideOutside }
     *     
     */
    public InsideOutside getInsideOutsideSignCd() {
        return insideOutsideSignCd;
    }

    /**
     * Sets the value of the insideOutsideSignCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsideOutside }
     *     
     */
    public void setInsideOutsideSignCd(InsideOutside value) {
        this.insideOutsideSignCd = value;
    }

    /**
     * Gets the value of the glassBldgInteriorInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGlassBldgInteriorInd() {
        return glassBldgInteriorInd;
    }

    /**
     * Sets the value of the glassBldgInteriorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlassBldgInteriorInd(Boolean value) {
        this.glassBldgInteriorInd = value;
    }

    /**
     * Gets the value of the glassTenantsExteriorInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGlassTenantsExteriorInd() {
        return glassTenantsExteriorInd;
    }

    /**
     * Sets the value of the glassTenantsExteriorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlassTenantsExteriorInd(Boolean value) {
        this.glassTenantsExteriorInd = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLength(MEASUREMENT value) {
        this.length = value;
    }

    /**
     * Gets the value of the itemValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getItemValueAmt() {
        return itemValueAmt;
    }

    /**
     * Sets the value of the itemValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setItemValueAmt(CURRENCY value) {
        this.itemValueAmt = value;
    }

    /**
     * Gets the value of the signConstructionMaterialCd property.
     * 
     * @return
     *     possible object is
     *     {@link SignConstructionMaterial }
     *     
     */
    public SignConstructionMaterial getSignConstructionMaterialCd() {
        return signConstructionMaterialCd;
    }

    /**
     * Sets the value of the signConstructionMaterialCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignConstructionMaterial }
     *     
     */
    public void setSignConstructionMaterialCd(SignConstructionMaterial value) {
        this.signConstructionMaterialCd = value;
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
