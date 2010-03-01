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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LossRunInqInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LossRunInqInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EvaluationPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AsOfDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EventCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InsuredOrPrincipal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Policy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CoverageCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AllLocationInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LossDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimStatusDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClosureMethodCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LossCauseCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DetailPaymentInd" minOccurs="0"/>
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
@XmlType(name = "LossRunInqInfo_Type", propOrder = {
    "itemIdInfo",
    "evaluationPeriod",
    "asOfDt",
    "eventCd",
    "insuredOrPrincipal",
    "claimsParty",
    "policy",
    "coverageCd",
    "location",
    "allLocationInd",
    "lossDt",
    "claimStatusCd",
    "claimStatusDt",
    "closureMethodCd",
    "lossCauseCd",
    "detailPaymentInd"
})
public class LossRunInqInfoType {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "EvaluationPeriod")
    protected DURATION evaluationPeriod;
    @XmlElement(name = "AsOfDt")
    protected Date asOfDt;
    @XmlElement(name = "EventCd")
    protected List<Event> eventCd;
    @XmlElement(name = "InsuredOrPrincipal")
    protected List<InsuredOrPrincipalType> insuredOrPrincipal;
    @XmlElement(name = "ClaimsParty")
    protected List<ClaimsPartyType> claimsParty;
    @XmlElement(name = "Policy")
    protected List<PCPOLICY> policy;
    @XmlElement(name = "CoverageCd")
    protected List<Coverages> coverageCd;
    @XmlElement(name = "Location")
    protected List<LocationType2> location;
    @XmlElement(name = "AllLocationInd")
    protected Boolean allLocationInd;
    @XmlElement(name = "LossDt")
    protected Date lossDt;
    @XmlElement(name = "ClaimStatusCd")
    protected ClaimStatus claimStatusCd;
    @XmlElement(name = "ClaimStatusDt")
    protected Date claimStatusDt;
    @XmlElement(name = "ClosureMethodCd")
    protected ClosureMethod closureMethodCd;
    @XmlElement(name = "LossCauseCd")
    protected List<OpenEnum> lossCauseCd;
    @XmlElement(name = "DetailPaymentInd")
    protected Boolean detailPaymentInd;
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
     * Gets the value of the evaluationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getEvaluationPeriod() {
        return evaluationPeriod;
    }

    /**
     * Sets the value of the evaluationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setEvaluationPeriod(DURATION value) {
        this.evaluationPeriod = value;
    }

    /**
     * Gets the value of the asOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAsOfDt() {
        return asOfDt;
    }

    /**
     * Sets the value of the asOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAsOfDt(Date value) {
        this.asOfDt = value;
    }

    /**
     * Gets the value of the eventCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEventCd() {
        if (eventCd == null) {
            eventCd = new ArrayList<Event>();
        }
        return this.eventCd;
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
     * Gets the value of the claimsParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimsParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsPartyType }
     * 
     * 
     */
    public List<ClaimsPartyType> getClaimsParty() {
        if (claimsParty == null) {
            claimsParty = new ArrayList<ClaimsPartyType>();
        }
        return this.claimsParty;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCPOLICY }
     * 
     * 
     */
    public List<PCPOLICY> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PCPOLICY>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the coverageCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coverages }
     * 
     * 
     */
    public List<Coverages> getCoverageCd() {
        if (coverageCd == null) {
            coverageCd = new ArrayList<Coverages>();
        }
        return this.coverageCd;
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
     * Gets the value of the allLocationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllLocationInd() {
        return allLocationInd;
    }

    /**
     * Sets the value of the allLocationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllLocationInd(Boolean value) {
        this.allLocationInd = value;
    }

    /**
     * Gets the value of the lossDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLossDt() {
        return lossDt;
    }

    /**
     * Sets the value of the lossDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLossDt(Date value) {
        this.lossDt = value;
    }

    /**
     * Gets the value of the claimStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getClaimStatusCd() {
        return claimStatusCd;
    }

    /**
     * Sets the value of the claimStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setClaimStatusCd(ClaimStatus value) {
        this.claimStatusCd = value;
    }

    /**
     * Gets the value of the claimStatusDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getClaimStatusDt() {
        return claimStatusDt;
    }

    /**
     * Sets the value of the claimStatusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setClaimStatusDt(Date value) {
        this.claimStatusDt = value;
    }

    /**
     * Gets the value of the closureMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClosureMethod }
     *     
     */
    public ClosureMethod getClosureMethodCd() {
        return closureMethodCd;
    }

    /**
     * Sets the value of the closureMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosureMethod }
     *     
     */
    public void setClosureMethodCd(ClosureMethod value) {
        this.closureMethodCd = value;
    }

    /**
     * Gets the value of the lossCauseCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lossCauseCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLossCauseCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenEnum }
     * 
     * 
     */
    public List<OpenEnum> getLossCauseCd() {
        if (lossCauseCd == null) {
            lossCauseCd = new ArrayList<OpenEnum>();
        }
        return this.lossCauseCd;
    }

    /**
     * Gets the value of the detailPaymentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDetailPaymentInd() {
        return detailPaymentInd;
    }

    /**
     * Sets the value of the detailPaymentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailPaymentInd(Boolean value) {
        this.detailPaymentInd = value;
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
