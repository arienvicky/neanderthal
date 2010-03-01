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
 * <p>Java class for PersPkgPolicyRenewRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersPkgPolicyRenewRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MSGRQINFO"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ModInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PERSPKGPOLINFO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersPkgPolicyRenewRq_Type", propOrder = {
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
    "modInfo",
    "producer",
    "insuredOrPrincipal",
    "persPolicy",
    "farmRanchPolicy",
    "location",
    "dwell",
    "persDriver",
    "persVeh",
    "propertySchedule",
    "watercraft",
    "watercraftAccessory",
    "persPkgDwellFireLineBusiness",
    "persPkgHomeLineBusiness",
    "persPkgAutoLineBusiness",
    "persPkgInlandMarineLineBusiness",
    "persPkgUmbrellaLineBusiness",
    "persPkgWatercraftLineBusiness",
    "farmPkgLineBusiness",
    "remarkText",
    "fileAttachmentInfo"
})
public class PersPkgPolicyRenewRqType {

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
    @XmlElement(name = "ModInfo")
    protected List<ModInfoType> modInfo;
    @XmlElement(name = "Producer")
    protected List<ProducerType> producer;
    @XmlElement(name = "InsuredOrPrincipal", required = true)
    protected List<InsuredOrPrincipalType> insuredOrPrincipal;
    @XmlElement(name = "PersPolicy")
    protected PersPolicyType persPolicy;
    @XmlElement(name = "FarmRanchPolicy")
    protected FarmRanchPolicyType farmRanchPolicy;
    @XmlElement(name = "Location")
    protected List<LocationType2> location;
    @XmlElement(name = "Dwell")
    protected List<DwellType> dwell;
    @XmlElement(name = "PersDriver")
    protected List<PersDriverType> persDriver;
    @XmlElement(name = "PersVeh")
    protected List<PersVehType> persVeh;
    @XmlElement(name = "PropertySchedule")
    protected List<PropertyScheduleType> propertySchedule;
    @XmlElement(name = "Watercraft")
    protected List<WatercraftType> watercraft;
    @XmlElement(name = "WatercraftAccessory")
    protected List<WatercraftAccessoryType> watercraftAccessory;
    @XmlElement(name = "PersPkgDwellFireLineBusiness")
    protected PersPkgDwellFireLineBusinessType persPkgDwellFireLineBusiness;
    @XmlElement(name = "PersPkgHomeLineBusiness")
    protected List<PersPkgHomeLineBusinessType> persPkgHomeLineBusiness;
    @XmlElement(name = "PersPkgAutoLineBusiness")
    protected PersPkgAutoLineBusinessType persPkgAutoLineBusiness;
    @XmlElement(name = "PersPkgInlandMarineLineBusiness")
    protected PersPkgInlandMarineLineBusinessType persPkgInlandMarineLineBusiness;
    @XmlElement(name = "PersPkgUmbrellaLineBusiness")
    protected PersPkgUmbrellaLineBusinessType persPkgUmbrellaLineBusiness;
    @XmlElement(name = "PersPkgWatercraftLineBusiness")
    protected PersPkgWatercraftLineBusinessType persPkgWatercraftLineBusiness;
    @XmlElement(name = "FarmPkgLineBusiness")
    protected FarmPkgLineBusinessType farmPkgLineBusiness;
    @XmlElement(name = "RemarkText")
    protected List<RemarkText> remarkText;
    @XmlElement(name = "FileAttachmentInfo")
    protected List<FileAttachmentInfoType> fileAttachmentInfo;

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
     * Gets the value of the persPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PersPolicyType }
     *     
     */
    public PersPolicyType getPersPolicy() {
        return persPolicy;
    }

    /**
     * Sets the value of the persPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersPolicyType }
     *     
     */
    public void setPersPolicy(PersPolicyType value) {
        this.persPolicy = value;
    }

    /**
     * Gets the value of the farmRanchPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link FarmRanchPolicyType }
     *     
     */
    public FarmRanchPolicyType getFarmRanchPolicy() {
        return farmRanchPolicy;
    }

    /**
     * Sets the value of the farmRanchPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmRanchPolicyType }
     *     
     */
    public void setFarmRanchPolicy(FarmRanchPolicyType value) {
        this.farmRanchPolicy = value;
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
     * Gets the value of the dwell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dwell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDwell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DwellType }
     * 
     * 
     */
    public List<DwellType> getDwell() {
        if (dwell == null) {
            dwell = new ArrayList<DwellType>();
        }
        return this.dwell;
    }

    /**
     * Gets the value of the persDriver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persDriver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersDriver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersDriverType }
     * 
     * 
     */
    public List<PersDriverType> getPersDriver() {
        if (persDriver == null) {
            persDriver = new ArrayList<PersDriverType>();
        }
        return this.persDriver;
    }

    /**
     * Gets the value of the persVeh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persVeh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersVeh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersVehType }
     * 
     * 
     */
    public List<PersVehType> getPersVeh() {
        if (persVeh == null) {
            persVeh = new ArrayList<PersVehType>();
        }
        return this.persVeh;
    }

    /**
     * Gets the value of the propertySchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertySchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertySchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyScheduleType }
     * 
     * 
     */
    public List<PropertyScheduleType> getPropertySchedule() {
        if (propertySchedule == null) {
            propertySchedule = new ArrayList<PropertyScheduleType>();
        }
        return this.propertySchedule;
    }

    /**
     * Gets the value of the watercraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watercraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatercraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WatercraftType }
     * 
     * 
     */
    public List<WatercraftType> getWatercraft() {
        if (watercraft == null) {
            watercraft = new ArrayList<WatercraftType>();
        }
        return this.watercraft;
    }

    /**
     * Gets the value of the watercraftAccessory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watercraftAccessory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatercraftAccessory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WatercraftAccessoryType }
     * 
     * 
     */
    public List<WatercraftAccessoryType> getWatercraftAccessory() {
        if (watercraftAccessory == null) {
            watercraftAccessory = new ArrayList<WatercraftAccessoryType>();
        }
        return this.watercraftAccessory;
    }

    /**
     * Gets the value of the persPkgDwellFireLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link PersPkgDwellFireLineBusinessType }
     *     
     */
    public PersPkgDwellFireLineBusinessType getPersPkgDwellFireLineBusiness() {
        return persPkgDwellFireLineBusiness;
    }

    /**
     * Sets the value of the persPkgDwellFireLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersPkgDwellFireLineBusinessType }
     *     
     */
    public void setPersPkgDwellFireLineBusiness(PersPkgDwellFireLineBusinessType value) {
        this.persPkgDwellFireLineBusiness = value;
    }

    /**
     * Gets the value of the persPkgHomeLineBusiness property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persPkgHomeLineBusiness property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersPkgHomeLineBusiness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersPkgHomeLineBusinessType }
     * 
     * 
     */
    public List<PersPkgHomeLineBusinessType> getPersPkgHomeLineBusiness() {
        if (persPkgHomeLineBusiness == null) {
            persPkgHomeLineBusiness = new ArrayList<PersPkgHomeLineBusinessType>();
        }
        return this.persPkgHomeLineBusiness;
    }

    /**
     * Gets the value of the persPkgAutoLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link PersPkgAutoLineBusinessType }
     *     
     */
    public PersPkgAutoLineBusinessType getPersPkgAutoLineBusiness() {
        return persPkgAutoLineBusiness;
    }

    /**
     * Sets the value of the persPkgAutoLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersPkgAutoLineBusinessType }
     *     
     */
    public void setPersPkgAutoLineBusiness(PersPkgAutoLineBusinessType value) {
        this.persPkgAutoLineBusiness = value;
    }

    /**
     * Gets the value of the persPkgInlandMarineLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link PersPkgInlandMarineLineBusinessType }
     *     
     */
    public PersPkgInlandMarineLineBusinessType getPersPkgInlandMarineLineBusiness() {
        return persPkgInlandMarineLineBusiness;
    }

    /**
     * Sets the value of the persPkgInlandMarineLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersPkgInlandMarineLineBusinessType }
     *     
     */
    public void setPersPkgInlandMarineLineBusiness(PersPkgInlandMarineLineBusinessType value) {
        this.persPkgInlandMarineLineBusiness = value;
    }

    /**
     * Gets the value of the persPkgUmbrellaLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link PersPkgUmbrellaLineBusinessType }
     *     
     */
    public PersPkgUmbrellaLineBusinessType getPersPkgUmbrellaLineBusiness() {
        return persPkgUmbrellaLineBusiness;
    }

    /**
     * Sets the value of the persPkgUmbrellaLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersPkgUmbrellaLineBusinessType }
     *     
     */
    public void setPersPkgUmbrellaLineBusiness(PersPkgUmbrellaLineBusinessType value) {
        this.persPkgUmbrellaLineBusiness = value;
    }

    /**
     * Gets the value of the persPkgWatercraftLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link PersPkgWatercraftLineBusinessType }
     *     
     */
    public PersPkgWatercraftLineBusinessType getPersPkgWatercraftLineBusiness() {
        return persPkgWatercraftLineBusiness;
    }

    /**
     * Sets the value of the persPkgWatercraftLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersPkgWatercraftLineBusinessType }
     *     
     */
    public void setPersPkgWatercraftLineBusiness(PersPkgWatercraftLineBusinessType value) {
        this.persPkgWatercraftLineBusiness = value;
    }

    /**
     * Gets the value of the farmPkgLineBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link FarmPkgLineBusinessType }
     *     
     */
    public FarmPkgLineBusinessType getFarmPkgLineBusiness() {
        return farmPkgLineBusiness;
    }

    /**
     * Sets the value of the farmPkgLineBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmPkgLineBusinessType }
     *     
     */
    public void setFarmPkgLineBusiness(FarmPkgLineBusinessType value) {
        this.farmPkgLineBusiness = value;
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

}
