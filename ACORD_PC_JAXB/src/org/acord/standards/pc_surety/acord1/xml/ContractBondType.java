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
 * <p>Java class for ContractBond_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractBond_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BidBondCommitmentLetterInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractorsProjectNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractSolicitationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractStartDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BidDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DesignBuildContractInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OwnersEstimateAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EstimatedBidAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EstimatedCompletionDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}JobBreakdownEquipmentPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}JobBreakdownLaborPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}JobBreakdownOverheadPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}JobBreakdownProfitPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}JobBreakdownSubContractedPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthContract" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthContractCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractTerm" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LiquidatedDamagesAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MaintenanceTerm" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NewContractedWorkAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OtherOutstandingBidsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OutstandingBidsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumOutstandingBids" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OutstandingLowBidsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PaymentScheduleCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PotentialWorkProgramAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProjectDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RetainageDetailsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RetainagePct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RunOffAllowanceAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TimeBid" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WorkOnHandAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WorkOnHandBasisCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WorkOnHandReportDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractBidResults" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Location" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EngineersEstimateAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}JobBreakdownMaterialPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WorkTypeSubContractedDesc" minOccurs="0"/>
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
@XmlType(name = "ContractBond_Type", propOrder = {
    "bidBondCommitmentLetterInd",
    "contractDt",
    "contractorsProjectNumber",
    "contractAmt",
    "contractSolicitationNumber",
    "contractStartDt",
    "bidDt",
    "designBuildContractInd",
    "ownersEstimateAmt",
    "estimatedBidAmt",
    "estimatedCompletionDt",
    "jobBreakdownEquipmentPct",
    "jobBreakdownLaborPct",
    "jobBreakdownOverheadPct",
    "jobBreakdownProfitPct",
    "jobBreakdownSubContractedPct",
    "lengthContract",
    "lengthContractCd",
    "contractTerm",
    "liquidatedDamagesAmt",
    "maintenanceTerm",
    "newContractedWorkAmt",
    "otherOutstandingBidsAmt",
    "outstandingBidsAmt",
    "numOutstandingBids",
    "outstandingLowBidsAmt",
    "paymentScheduleCd",
    "potentialWorkProgramAmt",
    "projectDesc",
    "retainageDetailsDesc",
    "retainagePct",
    "runOffAllowanceAmt",
    "timeBid",
    "workOnHandAmt",
    "workOnHandBasisCd",
    "workOnHandReportDt",
    "contractBidResults",
    "location",
    "miscParty",
    "engineersEstimateAmt",
    "jobBreakdownMaterialPct",
    "workTypeSubContractedDesc"
})
public class ContractBondType {

    @XmlElement(name = "BidBondCommitmentLetterInd")
    protected Boolean bidBondCommitmentLetterInd;
    @XmlElement(name = "ContractDt")
    protected Date contractDt;
    @XmlElement(name = "ContractorsProjectNumber")
    protected C25 contractorsProjectNumber;
    @XmlElement(name = "ContractAmt")
    protected CURRENCY contractAmt;
    @XmlElement(name = "ContractSolicitationNumber")
    protected C25 contractSolicitationNumber;
    @XmlElement(name = "ContractStartDt")
    protected Date contractStartDt;
    @XmlElement(name = "BidDt")
    protected Date bidDt;
    @XmlElement(name = "DesignBuildContractInd")
    protected Boolean designBuildContractInd;
    @XmlElement(name = "OwnersEstimateAmt")
    protected CURRENCY ownersEstimateAmt;
    @XmlElement(name = "EstimatedBidAmt")
    protected CURRENCY estimatedBidAmt;
    @XmlElement(name = "EstimatedCompletionDt")
    protected Date estimatedCompletionDt;
    @XmlElement(name = "JobBreakdownEquipmentPct")
    protected PercentLong jobBreakdownEquipmentPct;
    @XmlElement(name = "JobBreakdownLaborPct")
    protected PercentLong jobBreakdownLaborPct;
    @XmlElement(name = "JobBreakdownOverheadPct")
    protected PercentLong jobBreakdownOverheadPct;
    @XmlElement(name = "JobBreakdownProfitPct")
    protected PercentLong jobBreakdownProfitPct;
    @XmlElement(name = "JobBreakdownSubContractedPct")
    protected PercentLong jobBreakdownSubContractedPct;
    @XmlElement(name = "LengthContract")
    protected Long lengthContract;
    @XmlElement(name = "LengthContractCd")
    protected TimePeriod lengthContractCd;
    @XmlElement(name = "ContractTerm")
    protected DURATION contractTerm;
    @XmlElement(name = "LiquidatedDamagesAmt")
    protected CURRENCY liquidatedDamagesAmt;
    @XmlElement(name = "MaintenanceTerm")
    protected DURATION maintenanceTerm;
    @XmlElement(name = "NewContractedWorkAmt")
    protected CURRENCY newContractedWorkAmt;
    @XmlElement(name = "OtherOutstandingBidsAmt")
    protected CURRENCY otherOutstandingBidsAmt;
    @XmlElement(name = "OutstandingBidsAmt")
    protected CURRENCY outstandingBidsAmt;
    @XmlElement(name = "NumOutstandingBids")
    protected Long numOutstandingBids;
    @XmlElement(name = "OutstandingLowBidsAmt")
    protected CURRENCY outstandingLowBidsAmt;
    @XmlElement(name = "PaymentScheduleCd")
    protected Frequency paymentScheduleCd;
    @XmlElement(name = "PotentialWorkProgramAmt")
    protected CURRENCY potentialWorkProgramAmt;
    @XmlElement(name = "ProjectDesc")
    protected C255 projectDesc;
    @XmlElement(name = "RetainageDetailsDesc")
    protected C255 retainageDetailsDesc;
    @XmlElement(name = "RetainagePct")
    protected PercentLong retainagePct;
    @XmlElement(name = "RunOffAllowanceAmt")
    protected CURRENCY runOffAllowanceAmt;
    @XmlElement(name = "TimeBid")
    protected Time timeBid;
    @XmlElement(name = "WorkOnHandAmt")
    protected CURRENCY workOnHandAmt;
    @XmlElement(name = "WorkOnHandBasisCd")
    protected SuretyTermsType workOnHandBasisCd;
    @XmlElement(name = "WorkOnHandReportDt")
    protected Date workOnHandReportDt;
    @XmlElement(name = "ContractBidResults")
    protected ContractBidResultsType contractBidResults;
    @XmlElement(name = "Location")
    protected LocationType2 location;
    @XmlElement(name = "MiscParty")
    protected MiscPartyType miscParty;
    @XmlElement(name = "EngineersEstimateAmt")
    protected CURRENCY engineersEstimateAmt;
    @XmlElement(name = "JobBreakdownMaterialPct")
    protected PercentLong jobBreakdownMaterialPct;
    @XmlElement(name = "WorkTypeSubContractedDesc")
    protected CInfinite workTypeSubContractedDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the bidBondCommitmentLetterInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBidBondCommitmentLetterInd() {
        return bidBondCommitmentLetterInd;
    }

    /**
     * Sets the value of the bidBondCommitmentLetterInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBidBondCommitmentLetterInd(Boolean value) {
        this.bidBondCommitmentLetterInd = value;
    }

    /**
     * Gets the value of the contractDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getContractDt() {
        return contractDt;
    }

    /**
     * Sets the value of the contractDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setContractDt(Date value) {
        this.contractDt = value;
    }

    /**
     * Gets the value of the contractorsProjectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getContractorsProjectNumber() {
        return contractorsProjectNumber;
    }

    /**
     * Sets the value of the contractorsProjectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setContractorsProjectNumber(C25 value) {
        this.contractorsProjectNumber = value;
    }

    /**
     * Gets the value of the contractAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getContractAmt() {
        return contractAmt;
    }

    /**
     * Sets the value of the contractAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setContractAmt(CURRENCY value) {
        this.contractAmt = value;
    }

    /**
     * Gets the value of the contractSolicitationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getContractSolicitationNumber() {
        return contractSolicitationNumber;
    }

    /**
     * Sets the value of the contractSolicitationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setContractSolicitationNumber(C25 value) {
        this.contractSolicitationNumber = value;
    }

    /**
     * Gets the value of the contractStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getContractStartDt() {
        return contractStartDt;
    }

    /**
     * Sets the value of the contractStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setContractStartDt(Date value) {
        this.contractStartDt = value;
    }

    /**
     * Gets the value of the bidDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBidDt() {
        return bidDt;
    }

    /**
     * Sets the value of the bidDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBidDt(Date value) {
        this.bidDt = value;
    }

    /**
     * Gets the value of the designBuildContractInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDesignBuildContractInd() {
        return designBuildContractInd;
    }

    /**
     * Sets the value of the designBuildContractInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesignBuildContractInd(Boolean value) {
        this.designBuildContractInd = value;
    }

    /**
     * Gets the value of the ownersEstimateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getOwnersEstimateAmt() {
        return ownersEstimateAmt;
    }

    /**
     * Sets the value of the ownersEstimateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setOwnersEstimateAmt(CURRENCY value) {
        this.ownersEstimateAmt = value;
    }

    /**
     * Gets the value of the estimatedBidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getEstimatedBidAmt() {
        return estimatedBidAmt;
    }

    /**
     * Sets the value of the estimatedBidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setEstimatedBidAmt(CURRENCY value) {
        this.estimatedBidAmt = value;
    }

    /**
     * Gets the value of the estimatedCompletionDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEstimatedCompletionDt() {
        return estimatedCompletionDt;
    }

    /**
     * Sets the value of the estimatedCompletionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEstimatedCompletionDt(Date value) {
        this.estimatedCompletionDt = value;
    }

    /**
     * Gets the value of the jobBreakdownEquipmentPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getJobBreakdownEquipmentPct() {
        return jobBreakdownEquipmentPct;
    }

    /**
     * Sets the value of the jobBreakdownEquipmentPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setJobBreakdownEquipmentPct(PercentLong value) {
        this.jobBreakdownEquipmentPct = value;
    }

    /**
     * Gets the value of the jobBreakdownLaborPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getJobBreakdownLaborPct() {
        return jobBreakdownLaborPct;
    }

    /**
     * Sets the value of the jobBreakdownLaborPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setJobBreakdownLaborPct(PercentLong value) {
        this.jobBreakdownLaborPct = value;
    }

    /**
     * Gets the value of the jobBreakdownOverheadPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getJobBreakdownOverheadPct() {
        return jobBreakdownOverheadPct;
    }

    /**
     * Sets the value of the jobBreakdownOverheadPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setJobBreakdownOverheadPct(PercentLong value) {
        this.jobBreakdownOverheadPct = value;
    }

    /**
     * Gets the value of the jobBreakdownProfitPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getJobBreakdownProfitPct() {
        return jobBreakdownProfitPct;
    }

    /**
     * Sets the value of the jobBreakdownProfitPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setJobBreakdownProfitPct(PercentLong value) {
        this.jobBreakdownProfitPct = value;
    }

    /**
     * Gets the value of the jobBreakdownSubContractedPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getJobBreakdownSubContractedPct() {
        return jobBreakdownSubContractedPct;
    }

    /**
     * Sets the value of the jobBreakdownSubContractedPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setJobBreakdownSubContractedPct(PercentLong value) {
        this.jobBreakdownSubContractedPct = value;
    }

    /**
     * Gets the value of the lengthContract property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLengthContract() {
        return lengthContract;
    }

    /**
     * Sets the value of the lengthContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLengthContract(Long value) {
        this.lengthContract = value;
    }

    /**
     * Gets the value of the lengthContractCd property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getLengthContractCd() {
        return lengthContractCd;
    }

    /**
     * Sets the value of the lengthContractCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setLengthContractCd(TimePeriod value) {
        this.lengthContractCd = value;
    }

    /**
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setContractTerm(DURATION value) {
        this.contractTerm = value;
    }

    /**
     * Gets the value of the liquidatedDamagesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getLiquidatedDamagesAmt() {
        return liquidatedDamagesAmt;
    }

    /**
     * Sets the value of the liquidatedDamagesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setLiquidatedDamagesAmt(CURRENCY value) {
        this.liquidatedDamagesAmt = value;
    }

    /**
     * Gets the value of the maintenanceTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getMaintenanceTerm() {
        return maintenanceTerm;
    }

    /**
     * Sets the value of the maintenanceTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setMaintenanceTerm(DURATION value) {
        this.maintenanceTerm = value;
    }

    /**
     * Gets the value of the newContractedWorkAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNewContractedWorkAmt() {
        return newContractedWorkAmt;
    }

    /**
     * Sets the value of the newContractedWorkAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNewContractedWorkAmt(CURRENCY value) {
        this.newContractedWorkAmt = value;
    }

    /**
     * Gets the value of the otherOutstandingBidsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getOtherOutstandingBidsAmt() {
        return otherOutstandingBidsAmt;
    }

    /**
     * Sets the value of the otherOutstandingBidsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setOtherOutstandingBidsAmt(CURRENCY value) {
        this.otherOutstandingBidsAmt = value;
    }

    /**
     * Gets the value of the outstandingBidsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getOutstandingBidsAmt() {
        return outstandingBidsAmt;
    }

    /**
     * Sets the value of the outstandingBidsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setOutstandingBidsAmt(CURRENCY value) {
        this.outstandingBidsAmt = value;
    }

    /**
     * Gets the value of the numOutstandingBids property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOutstandingBids() {
        return numOutstandingBids;
    }

    /**
     * Sets the value of the numOutstandingBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOutstandingBids(Long value) {
        this.numOutstandingBids = value;
    }

    /**
     * Gets the value of the outstandingLowBidsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getOutstandingLowBidsAmt() {
        return outstandingLowBidsAmt;
    }

    /**
     * Sets the value of the outstandingLowBidsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setOutstandingLowBidsAmt(CURRENCY value) {
        this.outstandingLowBidsAmt = value;
    }

    /**
     * Gets the value of the paymentScheduleCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getPaymentScheduleCd() {
        return paymentScheduleCd;
    }

    /**
     * Sets the value of the paymentScheduleCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setPaymentScheduleCd(Frequency value) {
        this.paymentScheduleCd = value;
    }

    /**
     * Gets the value of the potentialWorkProgramAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPotentialWorkProgramAmt() {
        return potentialWorkProgramAmt;
    }

    /**
     * Sets the value of the potentialWorkProgramAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPotentialWorkProgramAmt(CURRENCY value) {
        this.potentialWorkProgramAmt = value;
    }

    /**
     * Gets the value of the projectDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getProjectDesc() {
        return projectDesc;
    }

    /**
     * Sets the value of the projectDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setProjectDesc(C255 value) {
        this.projectDesc = value;
    }

    /**
     * Gets the value of the retainageDetailsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRetainageDetailsDesc() {
        return retainageDetailsDesc;
    }

    /**
     * Sets the value of the retainageDetailsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRetainageDetailsDesc(C255 value) {
        this.retainageDetailsDesc = value;
    }

    /**
     * Gets the value of the retainagePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getRetainagePct() {
        return retainagePct;
    }

    /**
     * Sets the value of the retainagePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setRetainagePct(PercentLong value) {
        this.retainagePct = value;
    }

    /**
     * Gets the value of the runOffAllowanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getRunOffAllowanceAmt() {
        return runOffAllowanceAmt;
    }

    /**
     * Sets the value of the runOffAllowanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setRunOffAllowanceAmt(CURRENCY value) {
        this.runOffAllowanceAmt = value;
    }

    /**
     * Gets the value of the timeBid property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTimeBid() {
        return timeBid;
    }

    /**
     * Sets the value of the timeBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTimeBid(Time value) {
        this.timeBid = value;
    }

    /**
     * Gets the value of the workOnHandAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getWorkOnHandAmt() {
        return workOnHandAmt;
    }

    /**
     * Sets the value of the workOnHandAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setWorkOnHandAmt(CURRENCY value) {
        this.workOnHandAmt = value;
    }

    /**
     * Gets the value of the workOnHandBasisCd property.
     * 
     * @return
     *     possible object is
     *     {@link SuretyTermsType }
     *     
     */
    public SuretyTermsType getWorkOnHandBasisCd() {
        return workOnHandBasisCd;
    }

    /**
     * Sets the value of the workOnHandBasisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuretyTermsType }
     *     
     */
    public void setWorkOnHandBasisCd(SuretyTermsType value) {
        this.workOnHandBasisCd = value;
    }

    /**
     * Gets the value of the workOnHandReportDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getWorkOnHandReportDt() {
        return workOnHandReportDt;
    }

    /**
     * Sets the value of the workOnHandReportDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setWorkOnHandReportDt(Date value) {
        this.workOnHandReportDt = value;
    }

    /**
     * Gets the value of the contractBidResults property.
     * 
     * @return
     *     possible object is
     *     {@link ContractBidResultsType }
     *     
     */
    public ContractBidResultsType getContractBidResults() {
        return contractBidResults;
    }

    /**
     * Sets the value of the contractBidResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractBidResultsType }
     *     
     */
    public void setContractBidResults(ContractBidResultsType value) {
        this.contractBidResults = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType2 }
     *     
     */
    public LocationType2 getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType2 }
     *     
     */
    public void setLocation(LocationType2 value) {
        this.location = value;
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
     * Gets the value of the engineersEstimateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getEngineersEstimateAmt() {
        return engineersEstimateAmt;
    }

    /**
     * Sets the value of the engineersEstimateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setEngineersEstimateAmt(CURRENCY value) {
        this.engineersEstimateAmt = value;
    }

    /**
     * Gets the value of the jobBreakdownMaterialPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getJobBreakdownMaterialPct() {
        return jobBreakdownMaterialPct;
    }

    /**
     * Sets the value of the jobBreakdownMaterialPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setJobBreakdownMaterialPct(PercentLong value) {
        this.jobBreakdownMaterialPct = value;
    }

    /**
     * Gets the value of the workTypeSubContractedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getWorkTypeSubContractedDesc() {
        return workTypeSubContractedDesc;
    }

    /**
     * Sets the value of the workTypeSubContractedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setWorkTypeSubContractedDesc(CInfinite value) {
        this.workTypeSubContractedDesc = value;
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
