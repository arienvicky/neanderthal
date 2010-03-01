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
 * <p>Java class for BoilerMachineryPolicyModRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoilerMachineryPolicyModRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MSGRSINFO"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ModInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BOILERMACHINERYPOLINFO" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicySummaryInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BoilerMachineryPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoilerMachineryPolicyModRs_Type", propOrder = {
    "rqUID",
    "transactionResponseDt",
    "transactionEffectiveDt",
    "curCd",
    "codeList",
    "conversionRate",
    "msgStatus",
    "spxEditVersionApplied",
    "acordStandardVersionCd",
    "modInfo",
    "producer",
    "insuredOrPrincipal",
    "commlPolicy",
    "location",
    "boilerMachineryLineBusiness",
    "commlSubLocation",
    "remarkText",
    "fileAttachmentInfo",
    "policySummaryInfo",
    "boilerMachineryPolicy"
})
public class BoilerMachineryPolicyModRsType {

    @XmlElement(name = "RqUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rqUID;
    @XmlElement(name = "TransactionResponseDt", required = true)
    protected DateTime transactionResponseDt;
    @XmlElement(name = "TransactionEffectiveDt")
    protected DateTime transactionEffectiveDt;
    @XmlElement(name = "CurCd")
    protected OpenEnum curCd;
    @XmlElement(name = "CodeList")
    protected List<CodeListType> codeList;
    @XmlElement(name = "ConversionRate")
    protected List<ConversionRateType> conversionRate;
    @XmlElement(name = "MsgStatus", required = true)
    protected MsgStatusType msgStatus;
    @XmlElement(name = "SPXEditVersionApplied")
    protected AssignedIdentifier spxEditVersionApplied;
    @XmlElement(name = "ACORDStandardVersionCd")
    protected ACORDStandardVersion acordStandardVersionCd;
    @XmlElement(name = "ModInfo")
    protected List<ModInfoType> modInfo;
    @XmlElement(name = "Producer")
    protected List<ProducerType> producer;
    @XmlElement(name = "InsuredOrPrincipal")
    protected List<InsuredOrPrincipalType> insuredOrPrincipal;
    @XmlElement(name = "CommlPolicy")
    protected CommlPolicyType commlPolicy;
    @XmlElement(name = "Location")
    protected List<LocationType2> location;
    @XmlElement(name = "BoilerMachineryLineBusiness")
    protected BoilerMachineryLineBusinessType boilerMachineryLineBusiness;
    @XmlElement(name = "CommlSubLocation")
    protected List<CommlSubLocationType> commlSubLocation;
    @XmlElement(name = "RemarkText")
    protected List<RemarkText> remarkText;
    @XmlElement(name = "FileAttachmentInfo")
    protected List<FileAttachmentInfoType> fileAttachmentInfo;
    @XmlElement(name = "PolicySummaryInfo")
    protected PolicySummaryInfoType policySummaryInfo;
    @XmlElement(name = "BoilerMachineryPolicy")
    protected List<BoilerMachineryPolicyType> boilerMachineryPolicy;

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
     * Gets the value of the transactionResponseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionResponseDt() {
        return transactionResponseDt;
    }

    /**
     * Sets the value of the transactionResponseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionResponseDt(DateTime value) {
        this.transactionResponseDt = value;
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
     * Gets the value of the msgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MsgStatusType }
     *     
     */
    public MsgStatusType getMsgStatus() {
        return msgStatus;
    }

    /**
     * Sets the value of the msgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgStatusType }
     *     
     */
    public void setMsgStatus(MsgStatusType value) {
        this.msgStatus = value;
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
     * Gets the value of the boilerMachineryLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link BoilerMachineryLineBusinessType }
     *     
     */
    public BoilerMachineryLineBusinessType getBoilerMachineryLineBusiness() {
        return boilerMachineryLineBusiness;
    }

    /**
     * Sets the value of the boilerMachineryLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoilerMachineryLineBusinessType }
     *     
     */
    public void setBoilerMachineryLineBusiness(BoilerMachineryLineBusinessType value) {
        this.boilerMachineryLineBusiness = value;
    }

    /**
     * Gets the value of the commlSubLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlSubLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlSubLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlSubLocationType }
     * 
     * 
     */
    public List<CommlSubLocationType> getCommlSubLocation() {
        if (commlSubLocation == null) {
            commlSubLocation = new ArrayList<CommlSubLocationType>();
        }
        return this.commlSubLocation;
    }

    /**
     * Gets the value of the remarkText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarkText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarkText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkText }
     * 
     * 
     */
    public List<RemarkText> getRemarkText() {
        if (remarkText == null) {
            remarkText = new ArrayList<RemarkText>();
        }
        return this.remarkText;
    }

    /**
     * Gets the value of the fileAttachmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAttachmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAttachmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileAttachmentInfoType }
     * 
     * 
     */
    public List<FileAttachmentInfoType> getFileAttachmentInfo() {
        if (fileAttachmentInfo == null) {
            fileAttachmentInfo = new ArrayList<FileAttachmentInfoType>();
        }
        return this.fileAttachmentInfo;
    }

    /**
     * Gets the value of the policySummaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PolicySummaryInfoType }
     *     
     */
    public PolicySummaryInfoType getPolicySummaryInfo() {
        return policySummaryInfo;
    }

    /**
     * Sets the value of the policySummaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicySummaryInfoType }
     *     
     */
    public void setPolicySummaryInfo(PolicySummaryInfoType value) {
        this.policySummaryInfo = value;
    }

    /**
     * Gets the value of the boilerMachineryPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boilerMachineryPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoilerMachineryPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoilerMachineryPolicyType }
     * 
     * 
     */
    public List<BoilerMachineryPolicyType> getBoilerMachineryPolicy() {
        if (boilerMachineryPolicy == null) {
            boilerMachineryPolicy = new ArrayList<BoilerMachineryPolicyType>();
        }
        return this.boilerMachineryPolicy;
    }

}
