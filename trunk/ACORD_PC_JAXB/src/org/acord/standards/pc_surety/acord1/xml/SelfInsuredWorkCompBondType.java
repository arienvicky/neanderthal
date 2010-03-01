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
 * <p>Java class for SelfInsuredWorkCompBond_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelfInsuredWorkCompBond_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LongTermDisabilityReservesAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExcessWorkCompAggregateStopLossProvisionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExcessWorkCompInsurer" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExcessWorkCompDeductible" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExcessWorkCompInsuranceInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExcessWorkCompLimits" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NoReservesEstablishedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReserveFundingStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReservesStatusInFinancialStatementsCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StopLossAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalClaimsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalIndemnityPaidAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalIndemnityReservedAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalMedicalPaidAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalMedicalReservedAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumTotalClaims" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumTotalOpenClaims" minOccurs="0"/>
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
@XmlType(name = "SelfInsuredWorkCompBond_Type", propOrder = {
    "longTermDisabilityReservesAmt",
    "excessWorkCompAggregateStopLossProvisionInd",
    "excessWorkCompInsurer",
    "excessWorkCompDeductible",
    "excessWorkCompInsuranceInd",
    "excessWorkCompLimits",
    "noReservesEstablishedInd",
    "reserveFundingStatusCd",
    "reservesStatusInFinancialStatementsCd",
    "stopLossAmt",
    "totalClaimsAmt",
    "totalIndemnityPaidAmt",
    "totalIndemnityReservedAmt",
    "totalMedicalPaidAmt",
    "totalMedicalReservedAmt",
    "miscParty",
    "numTotalClaims",
    "numTotalOpenClaims"
})
public class SelfInsuredWorkCompBondType {

    @XmlElement(name = "LongTermDisabilityReservesAmt")
    protected CURRENCY longTermDisabilityReservesAmt;
    @XmlElement(name = "ExcessWorkCompAggregateStopLossProvisionInd")
    protected Boolean excessWorkCompAggregateStopLossProvisionInd;
    @XmlElement(name = "ExcessWorkCompInsurer")
    protected C60 excessWorkCompInsurer;
    @XmlElement(name = "ExcessWorkCompDeductible")
    protected PCDEDUCTIBLE excessWorkCompDeductible;
    @XmlElement(name = "ExcessWorkCompInsuranceInd")
    protected Boolean excessWorkCompInsuranceInd;
    @XmlElement(name = "ExcessWorkCompLimits")
    protected PCLIMIT excessWorkCompLimits;
    @XmlElement(name = "NoReservesEstablishedInd")
    protected Boolean noReservesEstablishedInd;
    @XmlElement(name = "ReserveFundingStatusCd")
    protected ReserveFundingStatus reserveFundingStatusCd;
    @XmlElement(name = "ReservesStatusInFinancialStatementsCd")
    protected ReservesStatusInFinancialStatements reservesStatusInFinancialStatementsCd;
    @XmlElement(name = "StopLossAmt")
    protected CURRENCY stopLossAmt;
    @XmlElement(name = "TotalClaimsAmt")
    protected CURRENCY totalClaimsAmt;
    @XmlElement(name = "TotalIndemnityPaidAmt")
    protected CURRENCY totalIndemnityPaidAmt;
    @XmlElement(name = "TotalIndemnityReservedAmt")
    protected CURRENCY totalIndemnityReservedAmt;
    @XmlElement(name = "TotalMedicalPaidAmt")
    protected CURRENCY totalMedicalPaidAmt;
    @XmlElement(name = "TotalMedicalReservedAmt")
    protected CURRENCY totalMedicalReservedAmt;
    @XmlElement(name = "MiscParty")
    protected MiscPartyType miscParty;
    @XmlElement(name = "NumTotalClaims")
    protected Long numTotalClaims;
    @XmlElement(name = "NumTotalOpenClaims")
    protected Long numTotalOpenClaims;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the longTermDisabilityReservesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getLongTermDisabilityReservesAmt() {
        return longTermDisabilityReservesAmt;
    }

    /**
     * Sets the value of the longTermDisabilityReservesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setLongTermDisabilityReservesAmt(CURRENCY value) {
        this.longTermDisabilityReservesAmt = value;
    }

    /**
     * Gets the value of the excessWorkCompAggregateStopLossProvisionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcessWorkCompAggregateStopLossProvisionInd() {
        return excessWorkCompAggregateStopLossProvisionInd;
    }

    /**
     * Sets the value of the excessWorkCompAggregateStopLossProvisionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessWorkCompAggregateStopLossProvisionInd(Boolean value) {
        this.excessWorkCompAggregateStopLossProvisionInd = value;
    }

    /**
     * Gets the value of the excessWorkCompInsurer property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getExcessWorkCompInsurer() {
        return excessWorkCompInsurer;
    }

    /**
     * Sets the value of the excessWorkCompInsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setExcessWorkCompInsurer(C60 value) {
        this.excessWorkCompInsurer = value;
    }

    /**
     * Gets the value of the excessWorkCompDeductible property.
     * 
     * @return
     *     possible object is
     *     {@link PCDEDUCTIBLE }
     *     
     */
    public PCDEDUCTIBLE getExcessWorkCompDeductible() {
        return excessWorkCompDeductible;
    }

    /**
     * Sets the value of the excessWorkCompDeductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCDEDUCTIBLE }
     *     
     */
    public void setExcessWorkCompDeductible(PCDEDUCTIBLE value) {
        this.excessWorkCompDeductible = value;
    }

    /**
     * Gets the value of the excessWorkCompInsuranceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcessWorkCompInsuranceInd() {
        return excessWorkCompInsuranceInd;
    }

    /**
     * Sets the value of the excessWorkCompInsuranceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessWorkCompInsuranceInd(Boolean value) {
        this.excessWorkCompInsuranceInd = value;
    }

    /**
     * Gets the value of the excessWorkCompLimits property.
     * 
     * @return
     *     possible object is
     *     {@link PCLIMIT }
     *     
     */
    public PCLIMIT getExcessWorkCompLimits() {
        return excessWorkCompLimits;
    }

    /**
     * Sets the value of the excessWorkCompLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCLIMIT }
     *     
     */
    public void setExcessWorkCompLimits(PCLIMIT value) {
        this.excessWorkCompLimits = value;
    }

    /**
     * Gets the value of the noReservesEstablishedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNoReservesEstablishedInd() {
        return noReservesEstablishedInd;
    }

    /**
     * Sets the value of the noReservesEstablishedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoReservesEstablishedInd(Boolean value) {
        this.noReservesEstablishedInd = value;
    }

    /**
     * Gets the value of the reserveFundingStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link ReserveFundingStatus }
     *     
     */
    public ReserveFundingStatus getReserveFundingStatusCd() {
        return reserveFundingStatusCd;
    }

    /**
     * Sets the value of the reserveFundingStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReserveFundingStatus }
     *     
     */
    public void setReserveFundingStatusCd(ReserveFundingStatus value) {
        this.reserveFundingStatusCd = value;
    }

    /**
     * Gets the value of the reservesStatusInFinancialStatementsCd property.
     * 
     * @return
     *     possible object is
     *     {@link ReservesStatusInFinancialStatements }
     *     
     */
    public ReservesStatusInFinancialStatements getReservesStatusInFinancialStatementsCd() {
        return reservesStatusInFinancialStatementsCd;
    }

    /**
     * Sets the value of the reservesStatusInFinancialStatementsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservesStatusInFinancialStatements }
     *     
     */
    public void setReservesStatusInFinancialStatementsCd(ReservesStatusInFinancialStatements value) {
        this.reservesStatusInFinancialStatementsCd = value;
    }

    /**
     * Gets the value of the stopLossAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getStopLossAmt() {
        return stopLossAmt;
    }

    /**
     * Sets the value of the stopLossAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setStopLossAmt(CURRENCY value) {
        this.stopLossAmt = value;
    }

    /**
     * Gets the value of the totalClaimsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalClaimsAmt() {
        return totalClaimsAmt;
    }

    /**
     * Sets the value of the totalClaimsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalClaimsAmt(CURRENCY value) {
        this.totalClaimsAmt = value;
    }

    /**
     * Gets the value of the totalIndemnityPaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalIndemnityPaidAmt() {
        return totalIndemnityPaidAmt;
    }

    /**
     * Sets the value of the totalIndemnityPaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalIndemnityPaidAmt(CURRENCY value) {
        this.totalIndemnityPaidAmt = value;
    }

    /**
     * Gets the value of the totalIndemnityReservedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalIndemnityReservedAmt() {
        return totalIndemnityReservedAmt;
    }

    /**
     * Sets the value of the totalIndemnityReservedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalIndemnityReservedAmt(CURRENCY value) {
        this.totalIndemnityReservedAmt = value;
    }

    /**
     * Gets the value of the totalMedicalPaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalMedicalPaidAmt() {
        return totalMedicalPaidAmt;
    }

    /**
     * Sets the value of the totalMedicalPaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalMedicalPaidAmt(CURRENCY value) {
        this.totalMedicalPaidAmt = value;
    }

    /**
     * Gets the value of the totalMedicalReservedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalMedicalReservedAmt() {
        return totalMedicalReservedAmt;
    }

    /**
     * Sets the value of the totalMedicalReservedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalMedicalReservedAmt(CURRENCY value) {
        this.totalMedicalReservedAmt = value;
    }

    /**
     * Gets the value of the miscParty property.
     * 
     * @return
     *     possible object is
     *     {@link MiscPartyType }
     *     
     */
    public MiscPartyType getMiscParty() {
        return miscParty;
    }

    /**
     * Sets the value of the miscParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscPartyType }
     *     
     */
    public void setMiscParty(MiscPartyType value) {
        this.miscParty = value;
    }

    /**
     * Gets the value of the numTotalClaims property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumTotalClaims() {
        return numTotalClaims;
    }

    /**
     * Sets the value of the numTotalClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumTotalClaims(Long value) {
        this.numTotalClaims = value;
    }

    /**
     * Gets the value of the numTotalOpenClaims property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumTotalOpenClaims() {
        return numTotalOpenClaims;
    }

    /**
     * Sets the value of the numTotalOpenClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumTotalOpenClaims(Long value) {
        this.numTotalOpenClaims = value;
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
