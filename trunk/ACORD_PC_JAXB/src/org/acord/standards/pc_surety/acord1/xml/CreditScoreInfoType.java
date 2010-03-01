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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditScoreInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditScoreInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReferenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditScore"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditScoreDt"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CSPolicyTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CSReasonCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CSReasonDesc" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="InsuredOrPrincipalRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditScoreInfo_Type", propOrder = {
    "referenceNumber",
    "creditScore",
    "creditScoreDt",
    "csPolicyTypeCd",
    "csReasonCd",
    "csReasonDesc"
})
public class CreditScoreInfoType {

    @XmlElement(name = "ReferenceNumber")
    protected AssignedIdentifier referenceNumber;
    @XmlElement(name = "CreditScore", required = true)
    protected C10 creditScore;
    @XmlElement(name = "CreditScoreDt", required = true)
    protected Date creditScoreDt;
    @XmlElement(name = "CSPolicyTypeCd")
    protected OpenEnum csPolicyTypeCd;
    @XmlElement(name = "CSReasonCd")
    protected List<OpenEnum> csReasonCd;
    @XmlElement(name = "CSReasonDesc")
    protected C255 csReasonDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "InsuredOrPrincipalRef")
    @XmlIDREF
    protected Object insuredOrPrincipalRef;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setReferenceNumber(AssignedIdentifier value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the creditScore property.
     * 
     * @return
     *     possible object is
     *     {@link C10 }
     *     
     */
    public C10 getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link C10 }
     *     
     */
    public void setCreditScore(C10 value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the creditScoreDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCreditScoreDt() {
        return creditScoreDt;
    }

    /**
     * Sets the value of the creditScoreDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCreditScoreDt(Date value) {
        this.creditScoreDt = value;
    }

    /**
     * Gets the value of the csPolicyTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCSPolicyTypeCd() {
        return csPolicyTypeCd;
    }

    /**
     * Sets the value of the csPolicyTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCSPolicyTypeCd(OpenEnum value) {
        this.csPolicyTypeCd = value;
    }

    /**
     * Gets the value of the csReasonCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csReasonCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSReasonCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenEnum }
     * 
     * 
     */
    public List<OpenEnum> getCSReasonCd() {
        if (csReasonCd == null) {
            csReasonCd = new ArrayList<OpenEnum>();
        }
        return this.csReasonCd;
    }

    /**
     * Gets the value of the csReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getCSReasonDesc() {
        return csReasonDesc;
    }

    /**
     * Sets the value of the csReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setCSReasonDesc(C255 value) {
        this.csReasonDesc = value;
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

    /**
     * Gets the value of the insuredOrPrincipalRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInsuredOrPrincipalRef() {
        return insuredOrPrincipalRef;
    }

    /**
     * Sets the value of the insuredOrPrincipalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInsuredOrPrincipalRef(Object value) {
        this.insuredOrPrincipalRef = value;
    }

}
