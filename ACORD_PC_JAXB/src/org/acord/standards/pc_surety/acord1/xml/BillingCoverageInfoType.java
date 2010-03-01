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
 * <p>Java class for BillingCoverageInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingCoverageInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CoverageCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IterationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TaxFeeSurchargeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WrittenAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommissionRatePct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommissionRateCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EffectiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExpirationDt" minOccurs="0"/>
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
@XmlType(name = "BillingCoverageInfo_Type", propOrder = {
    "itemIdInfo",
    "coverageCd",
    "iterationNumber",
    "taxFeeSurchargeCd",
    "currentTermAmt",
    "writtenAmt",
    "commissionRatePct",
    "commissionRateCd",
    "effectiveDt",
    "expirationDt"
})
public class BillingCoverageInfoType {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "CoverageCd")
    protected Coverages coverageCd;
    @XmlElement(name = "IterationNumber")
    protected Long iterationNumber;
    @XmlElement(name = "TaxFeeSurchargeCd")
    protected TaxFeeSurcharge taxFeeSurchargeCd;
    @XmlElement(name = "CurrentTermAmt")
    protected CURRENCY currentTermAmt;
    @XmlElement(name = "WrittenAmt")
    protected CURRENCY writtenAmt;
    @XmlElement(name = "CommissionRatePct")
    protected PercentDecimal commissionRatePct;
    @XmlElement(name = "CommissionRateCd")
    protected RateScaleType commissionRateCd;
    @XmlElement(name = "EffectiveDt")
    protected Date effectiveDt;
    @XmlElement(name = "ExpirationDt")
    protected Date expirationDt;
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
     * Gets the value of the coverageCd property.
     * 
     * @return
     *     possible object is
     *     {@link Coverages }
     *     
     */
    public Coverages getCoverageCd() {
        return coverageCd;
    }

    /**
     * Sets the value of the coverageCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coverages }
     *     
     */
    public void setCoverageCd(Coverages value) {
        this.coverageCd = value;
    }

    /**
     * Gets the value of the iterationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIterationNumber() {
        return iterationNumber;
    }

    /**
     * Sets the value of the iterationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIterationNumber(Long value) {
        this.iterationNumber = value;
    }

    /**
     * Gets the value of the taxFeeSurchargeCd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxFeeSurcharge }
     *     
     */
    public TaxFeeSurcharge getTaxFeeSurchargeCd() {
        return taxFeeSurchargeCd;
    }

    /**
     * Sets the value of the taxFeeSurchargeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxFeeSurcharge }
     *     
     */
    public void setTaxFeeSurchargeCd(TaxFeeSurcharge value) {
        this.taxFeeSurchargeCd = value;
    }

    /**
     * Gets the value of the currentTermAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCurrentTermAmt() {
        return currentTermAmt;
    }

    /**
     * Sets the value of the currentTermAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCurrentTermAmt(CURRENCY value) {
        this.currentTermAmt = value;
    }

    /**
     * Gets the value of the writtenAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getWrittenAmt() {
        return writtenAmt;
    }

    /**
     * Sets the value of the writtenAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setWrittenAmt(CURRENCY value) {
        this.writtenAmt = value;
    }

    /**
     * Gets the value of the commissionRatePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getCommissionRatePct() {
        return commissionRatePct;
    }

    /**
     * Sets the value of the commissionRatePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setCommissionRatePct(PercentDecimal value) {
        this.commissionRatePct = value;
    }

    /**
     * Gets the value of the commissionRateCd property.
     * 
     * @return
     *     possible object is
     *     {@link RateScaleType }
     *     
     */
    public RateScaleType getCommissionRateCd() {
        return commissionRateCd;
    }

    /**
     * Sets the value of the commissionRateCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateScaleType }
     *     
     */
    public void setCommissionRateCd(RateScaleType value) {
        this.commissionRateCd = value;
    }

    /**
     * Gets the value of the effectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEffectiveDt() {
        return effectiveDt;
    }

    /**
     * Sets the value of the effectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEffectiveDt(Date value) {
        this.effectiveDt = value;
    }

    /**
     * Gets the value of the expirationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpirationDt() {
        return expirationDt;
    }

    /**
     * Sets the value of the expirationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDt(Date value) {
        this.expirationDt = value;
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
