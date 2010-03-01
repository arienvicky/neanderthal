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
 * <p>Java class for PartialSuretyBond_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialSuretyBond_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondTerm" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondTermCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondLineDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExecutionDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CancellableInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RenewalMethodCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FullTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NetChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WrittenAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BondPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommissionAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NAICCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NetChangeCommissionAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PaymentAmt" minOccurs="0"/>
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
@XmlType(name = "PartialSuretyBond_Type", propOrder = {
    "bondNumber",
    "bondTerm",
    "bondTermCd",
    "bondTypeCd",
    "bondLineDesc",
    "executionDt",
    "cancellableInd",
    "renewalMethodCd",
    "stateProvCd",
    "currentTermAmt",
    "fullTermAmt",
    "netChangeAmt",
    "writtenAmt",
    "bondAmt",
    "bondPct",
    "commissionAmt",
    "naicCd",
    "netChangeCommissionAmt",
    "paymentAmt"
})
public class PartialSuretyBondType {

    @XmlElement(name = "BondNumber")
    protected C25 bondNumber;
    @XmlElement(name = "BondTerm")
    protected DURATION bondTerm;
    @XmlElement(name = "BondTermCd")
    protected BondTerms bondTermCd;
    @XmlElement(name = "BondTypeCd")
    protected BondType bondTypeCd;
    @XmlElement(name = "BondLineDesc")
    protected CInfinite bondLineDesc;
    @XmlElement(name = "ExecutionDt")
    protected Date executionDt;
    @XmlElement(name = "CancellableInd")
    protected Boolean cancellableInd;
    @XmlElement(name = "RenewalMethodCd")
    protected RenewalMethod renewalMethodCd;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "CurrentTermAmt")
    protected CURRENCY currentTermAmt;
    @XmlElement(name = "FullTermAmt")
    protected CURRENCY fullTermAmt;
    @XmlElement(name = "NetChangeAmt")
    protected CURRENCY netChangeAmt;
    @XmlElement(name = "WrittenAmt")
    protected CURRENCY writtenAmt;
    @XmlElement(name = "BondAmt")
    protected CURRENCY bondAmt;
    @XmlElement(name = "BondPct")
    protected PercentLong bondPct;
    @XmlElement(name = "CommissionAmt")
    protected CURRENCY commissionAmt;
    @XmlElement(name = "NAICCd")
    protected OpenEnum naicCd;
    @XmlElement(name = "NetChangeCommissionAmt")
    protected CURRENCY netChangeCommissionAmt;
    @XmlElement(name = "PaymentAmt")
    protected CURRENCY paymentAmt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the bondNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getBondNumber() {
        return bondNumber;
    }

    /**
     * Sets the value of the bondNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setBondNumber(C25 value) {
        this.bondNumber = value;
    }

    /**
     * Gets the value of the bondTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getBondTerm() {
        return bondTerm;
    }

    /**
     * Sets the value of the bondTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setBondTerm(DURATION value) {
        this.bondTerm = value;
    }

    /**
     * Gets the value of the bondTermCd property.
     * 
     * @return
     *     possible object is
     *     {@link BondTerms }
     *     
     */
    public BondTerms getBondTermCd() {
        return bondTermCd;
    }

    /**
     * Sets the value of the bondTermCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondTerms }
     *     
     */
    public void setBondTermCd(BondTerms value) {
        this.bondTermCd = value;
    }

    /**
     * Gets the value of the bondTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link BondType }
     *     
     */
    public BondType getBondTypeCd() {
        return bondTypeCd;
    }

    /**
     * Sets the value of the bondTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondType }
     *     
     */
    public void setBondTypeCd(BondType value) {
        this.bondTypeCd = value;
    }

    /**
     * Gets the value of the bondLineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getBondLineDesc() {
        return bondLineDesc;
    }

    /**
     * Sets the value of the bondLineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setBondLineDesc(CInfinite value) {
        this.bondLineDesc = value;
    }

    /**
     * Gets the value of the executionDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExecutionDt() {
        return executionDt;
    }

    /**
     * Sets the value of the executionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExecutionDt(Date value) {
        this.executionDt = value;
    }

    /**
     * Gets the value of the cancellableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCancellableInd() {
        return cancellableInd;
    }

    /**
     * Sets the value of the cancellableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellableInd(Boolean value) {
        this.cancellableInd = value;
    }

    /**
     * Gets the value of the renewalMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link RenewalMethod }
     *     
     */
    public RenewalMethod getRenewalMethodCd() {
        return renewalMethodCd;
    }

    /**
     * Sets the value of the renewalMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewalMethod }
     *     
     */
    public void setRenewalMethodCd(RenewalMethod value) {
        this.renewalMethodCd = value;
    }

    /**
     * Gets the value of the stateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getStateProvCd() {
        return stateProvCd;
    }

    /**
     * Sets the value of the stateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setStateProvCd(OpenEnum value) {
        this.stateProvCd = value;
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
     * Gets the value of the fullTermAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getFullTermAmt() {
        return fullTermAmt;
    }

    /**
     * Sets the value of the fullTermAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setFullTermAmt(CURRENCY value) {
        this.fullTermAmt = value;
    }

    /**
     * Gets the value of the netChangeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetChangeAmt() {
        return netChangeAmt;
    }

    /**
     * Sets the value of the netChangeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetChangeAmt(CURRENCY value) {
        this.netChangeAmt = value;
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
     * Gets the value of the bondAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getBondAmt() {
        return bondAmt;
    }

    /**
     * Sets the value of the bondAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setBondAmt(CURRENCY value) {
        this.bondAmt = value;
    }

    /**
     * Gets the value of the bondPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getBondPct() {
        return bondPct;
    }

    /**
     * Sets the value of the bondPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setBondPct(PercentLong value) {
        this.bondPct = value;
    }

    /**
     * Gets the value of the commissionAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCommissionAmt() {
        return commissionAmt;
    }

    /**
     * Sets the value of the commissionAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCommissionAmt(CURRENCY value) {
        this.commissionAmt = value;
    }

    /**
     * Gets the value of the naicCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getNAICCd() {
        return naicCd;
    }

    /**
     * Sets the value of the naicCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setNAICCd(OpenEnum value) {
        this.naicCd = value;
    }

    /**
     * Gets the value of the netChangeCommissionAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetChangeCommissionAmt() {
        return netChangeCommissionAmt;
    }

    /**
     * Sets the value of the netChangeCommissionAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetChangeCommissionAmt(CURRENCY value) {
        this.netChangeCommissionAmt = value;
    }

    /**
     * Gets the value of the paymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPaymentAmt() {
        return paymentAmt;
    }

    /**
     * Sets the value of the paymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPaymentAmt(CURRENCY value) {
        this.paymentAmt = value;
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
