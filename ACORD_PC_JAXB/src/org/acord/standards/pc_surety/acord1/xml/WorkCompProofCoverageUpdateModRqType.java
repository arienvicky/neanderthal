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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for WorkCompProofCoverageUpdateModRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkCompProofCoverageUpdateModRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MSGRQINFO"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ChangeStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ModInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WORKCOMPPROOFCOVERAGEINFO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCompProofCoverageUpdateModRq_Type", propOrder = {
    "rqUID",
    "transactionRequestDt",
    "transactionEffectiveDt",
    "curCd",
    "codeList",
    "conversionRate",
    "spxEditVersionApplied",
    "broadLOBCd",
    "acordStandardVersionCd",
    "pendManualProcessingInd",
    "changeStatus",
    "modInfo",
    "producer",
    "miscParty",
    "insuredOrPrincipal",
    "commlPolicy",
    "location",
    "companyState",
    "workCompLineBusiness",
    "vendorReceiveDt",
    "vendorDocumentId"
})
public class WorkCompProofCoverageUpdateModRqType {

    @XmlElement(name = "RqUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rqUID;
    @XmlElement(name = "TransactionRequestDt", required = true)
    protected DateTime transactionRequestDt;
    @XmlElement(name = "TransactionEffectiveDt")
    protected DateTime transactionEffectiveDt;
    @XmlElement(name = "CurCd", required = true)
    protected OpenEnum curCd;
    @XmlElement(name = "CodeList")
    protected List<CodeListType> codeList;
    @XmlElement(name = "ConversionRate")
    protected List<ConversionRateType> conversionRate;
    @XmlElement(name = "SPXEditVersionApplied")
    protected AssignedIdentifier spxEditVersionApplied;
    @XmlElement(name = "BroadLOBCd")
    protected BroadLineBusiness broadLOBCd;
    @XmlElement(name = "ACORDStandardVersionCd")
    protected ACORDStandardVersion acordStandardVersionCd;
    @XmlElement(name = "PendManualProcessingInd")
    protected Boolean pendManualProcessingInd;
    @XmlElement(name = "ChangeStatus")
    protected List<ChangeStatusType> changeStatus;
    @XmlElement(name = "ModInfo")
    protected List<ModInfoType> modInfo;
    @XmlElement(name = "Producer")
    protected List<ProducerType> producer;
    @XmlElement(name = "MiscParty")
    protected MiscPartyType miscParty;
    @XmlElement(name = "InsuredOrPrincipal")
    protected List<InsuredOrPrincipalType> insuredOrPrincipal;
    @XmlElement(name = "CommlPolicy", required = true)
    protected CommlPolicyType commlPolicy;
    @XmlElement(name = "Location")
    protected List<LocationType2> location;
    @XmlElement(name = "CompanyState")
    protected List<CompanyStateType> companyState;
    @XmlElement(name = "WorkCompLineBusiness", required = true)
    protected WorkCompLineBusinessType workCompLineBusiness;
    @XmlElement(name = "VendorReceiveDt")
    protected Date vendorReceiveDt;
    @XmlElement(name = "VendorDocumentId")
    protected AssignedIdentifier vendorDocumentId;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the transactionRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionRequestDt() {
        return transactionRequestDt;
    }

    /**
     * Sets the value of the transactionRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionRequestDt(DateTime value) {
        this.transactionRequestDt = value;
    }

    /**
     * Gets the value of the transactionEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionEffectiveDt() {
        return transactionEffectiveDt;
    }

    /**
     * Sets the value of the transactionEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionEffectiveDt(DateTime value) {
        this.transactionEffectiveDt = value;
    }

    /**
     * Gets the value of the curCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCurCd() {
        return curCd;
    }

    /**
     * Sets the value of the curCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCurCd(OpenEnum value) {
        this.curCd = value;
    }

    /**
     * Gets the value of the codeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListType }
     * 
     * 
     */
    public List<CodeListType> getCodeList() {
        if (codeList == null) {
            codeList = new ArrayList<CodeListType>();
        }
        return this.codeList;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionRateType }
     * 
     * 
     */
    public List<ConversionRateType> getConversionRate() {
        if (conversionRate == null) {
            conversionRate = new ArrayList<ConversionRateType>();
        }
        return this.conversionRate;
    }

    /**
     * Gets the value of the spxEditVersionApplied property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getSPXEditVersionApplied() {
        return spxEditVersionApplied;
    }

    /**
     * Sets the value of the spxEditVersionApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setSPXEditVersionApplied(AssignedIdentifier value) {
        this.spxEditVersionApplied = value;
    }

    /**
     * Gets the value of the broadLOBCd property.
     * 
     * @return
     *     possible object is
     *     {@link BroadLineBusiness }
     *     
     */
    public BroadLineBusiness getBroadLOBCd() {
        return broadLOBCd;
    }

    /**
     * Sets the value of the broadLOBCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadLineBusiness }
     *     
     */
    public void setBroadLOBCd(BroadLineBusiness value) {
        this.broadLOBCd = value;
    }

    /**
     * Gets the value of the acordStandardVersionCd property.
     * 
     * @return
     *     possible object is
     *     {@link ACORDStandardVersion }
     *     
     */
    public ACORDStandardVersion getACORDStandardVersionCd() {
        return acordStandardVersionCd;
    }

    /**
     * Sets the value of the acordStandardVersionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACORDStandardVersion }
     *     
     */
    public void setACORDStandardVersionCd(ACORDStandardVersion value) {
        this.acordStandardVersionCd = value;
    }

    /**
     * Gets the value of the pendManualProcessingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPendManualProcessingInd() {
        return pendManualProcessingInd;
    }

    /**
     * Sets the value of the pendManualProcessingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendManualProcessingInd(Boolean value) {
        this.pendManualProcessingInd = value;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeStatusType }
     * 
     * 
     */
    public List<ChangeStatusType> getChangeStatus() {
        if (changeStatus == null) {
            changeStatus = new ArrayList<ChangeStatusType>();
        }
        return this.changeStatus;
    }

    /**
     * Gets the value of the modInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModInfoType }
     * 
     * 
     */
    public List<ModInfoType> getModInfo() {
        if (modInfo == null) {
            modInfo = new ArrayList<ModInfoType>();
        }
        return this.modInfo;
    }

    /**
     * Gets the value of the producer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerType }
     * 
     * 
     */
    public List<ProducerType> getProducer() {
        if (producer == null) {
            producer = new ArrayList<ProducerType>();
        }
        return this.producer;
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
     * Gets the value of the insuredOrPrincipal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuredOrPrincipal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuredOrPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredOrPrincipalType }
     * 
     * 
     */
    public List<InsuredOrPrincipalType> getInsuredOrPrincipal() {
        if (insuredOrPrincipal == null) {
            insuredOrPrincipal = new ArrayList<InsuredOrPrincipalType>();
        }
        return this.insuredOrPrincipal;
    }

    /**
     * Gets the value of the commlPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CommlPolicyType }
     *     
     */
    public CommlPolicyType getCommlPolicy() {
        return commlPolicy;
    }

    /**
     * Sets the value of the commlPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommlPolicyType }
     *     
     */
    public void setCommlPolicy(CommlPolicyType value) {
        this.commlPolicy = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType2 }
     * 
     * 
     */
    public List<LocationType2> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType2>();
        }
        return this.location;
    }

    /**
     * Gets the value of the companyState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyStateType }
     * 
     * 
     */
    public List<CompanyStateType> getCompanyState() {
        if (companyState == null) {
            companyState = new ArrayList<CompanyStateType>();
        }
        return this.companyState;
    }

    /**
     * Gets the value of the workCompLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link WorkCompLineBusinessType }
     *     
     */
    public WorkCompLineBusinessType getWorkCompLineBusiness() {
        return workCompLineBusiness;
    }

    /**
     * Sets the value of the workCompLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkCompLineBusinessType }
     *     
     */
    public void setWorkCompLineBusiness(WorkCompLineBusinessType value) {
        this.workCompLineBusiness = value;
    }

    /**
     * Gets the value of the vendorReceiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getVendorReceiveDt() {
        return vendorReceiveDt;
    }

    /**
     * Sets the value of the vendorReceiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setVendorReceiveDt(Date value) {
        this.vendorReceiveDt = value;
    }

    /**
     * Gets the value of the vendorDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getVendorDocumentId() {
        return vendorDocumentId;
    }

    /**
     * Sets the value of the vendorDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setVendorDocumentId(AssignedIdentifier value) {
        this.vendorDocumentId = value;
    }

}
