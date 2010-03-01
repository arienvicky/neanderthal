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
 * <p>Java class for PartyInvestigationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyInvestigationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SuppressMatchInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DisputeStatementDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SocialSecurityIssuancePeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SSNValidationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TINValidationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProfessionalSanctionInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PartyInvestigationInfo_Type", propOrder = {
    "suppressMatchInd",
    "disputeStatementDesc",
    "socialSecurityIssuancePeriod",
    "ssnValidationCd",
    "tinValidationCd",
    "professionalSanctionInfo"
})
public class PartyInvestigationInfoType {

    @XmlElement(name = "SuppressMatchInd")
    protected Boolean suppressMatchInd;
    @XmlElement(name = "DisputeStatementDesc")
    protected CInfinite disputeStatementDesc;
    @XmlElement(name = "SocialSecurityIssuancePeriod")
    protected DURATION socialSecurityIssuancePeriod;
    @XmlElement(name = "SSNValidationCd")
    protected OpenEnum ssnValidationCd;
    @XmlElement(name = "TINValidationCd")
    protected OpenEnum tinValidationCd;
    @XmlElement(name = "ProfessionalSanctionInfo")
    protected List<ProfessionalSanctionInfoType> professionalSanctionInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the suppressMatchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSuppressMatchInd() {
        return suppressMatchInd;
    }

    /**
     * Sets the value of the suppressMatchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressMatchInd(Boolean value) {
        this.suppressMatchInd = value;
    }

    /**
     * Gets the value of the disputeStatementDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getDisputeStatementDesc() {
        return disputeStatementDesc;
    }

    /**
     * Sets the value of the disputeStatementDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setDisputeStatementDesc(CInfinite value) {
        this.disputeStatementDesc = value;
    }

    /**
     * Gets the value of the socialSecurityIssuancePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getSocialSecurityIssuancePeriod() {
        return socialSecurityIssuancePeriod;
    }

    /**
     * Sets the value of the socialSecurityIssuancePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setSocialSecurityIssuancePeriod(DURATION value) {
        this.socialSecurityIssuancePeriod = value;
    }

    /**
     * Gets the value of the ssnValidationCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getSSNValidationCd() {
        return ssnValidationCd;
    }

    /**
     * Sets the value of the ssnValidationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setSSNValidationCd(OpenEnum value) {
        this.ssnValidationCd = value;
    }

    /**
     * Gets the value of the tinValidationCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getTINValidationCd() {
        return tinValidationCd;
    }

    /**
     * Sets the value of the tinValidationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setTINValidationCd(OpenEnum value) {
        this.tinValidationCd = value;
    }

    /**
     * Gets the value of the professionalSanctionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalSanctionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalSanctionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalSanctionInfoType }
     * 
     * 
     */
    public List<ProfessionalSanctionInfoType> getProfessionalSanctionInfo() {
        if (professionalSanctionInfo == null) {
            professionalSanctionInfo = new ArrayList<ProfessionalSanctionInfoType>();
        }
        return this.professionalSanctionInfo;
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