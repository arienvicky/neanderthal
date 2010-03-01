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
 * <p>Java class for Binder_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Binder_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AgencyBinderNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BinderPurposeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractTerm"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EffectiveDtTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExpirationDtTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FormNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NewBinderInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NonStandardConditionsInd" minOccurs="0"/>
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
@XmlType(name = "Binder_Type", propOrder = {
    "agencyBinderNumber",
    "binderPurposeCd",
    "contractTerm",
    "effectiveDtTime",
    "expirationDtTime",
    "formNumber",
    "newBinderInd",
    "nonStandardConditionsInd"
})
public class BinderType {

    @XmlElement(name = "AgencyBinderNumber")
    protected C25 agencyBinderNumber;
    @XmlElement(name = "BinderPurposeCd")
    protected BinderPurpose binderPurposeCd;
    @XmlElement(name = "ContractTerm", required = true)
    protected DURATION contractTerm;
    @XmlElement(name = "EffectiveDtTime")
    protected DateTime effectiveDtTime;
    @XmlElement(name = "ExpirationDtTime")
    protected DateTime expirationDtTime;
    @XmlElement(name = "FormNumber")
    protected C20 formNumber;
    @XmlElement(name = "NewBinderInd")
    protected Boolean newBinderInd;
    @XmlElement(name = "NonStandardConditionsInd")
    protected Boolean nonStandardConditionsInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the agencyBinderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getAgencyBinderNumber() {
        return agencyBinderNumber;
    }

    /**
     * Sets the value of the agencyBinderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setAgencyBinderNumber(C25 value) {
        this.agencyBinderNumber = value;
    }

    /**
     * Gets the value of the binderPurposeCd property.
     * 
     * @return
     *     possible object is
     *     {@link BinderPurpose }
     *     
     */
    public BinderPurpose getBinderPurposeCd() {
        return binderPurposeCd;
    }

    /**
     * Sets the value of the binderPurposeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinderPurpose }
     *     
     */
    public void setBinderPurposeCd(BinderPurpose value) {
        this.binderPurposeCd = value;
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
     * Gets the value of the effectiveDtTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveDtTime() {
        return effectiveDtTime;
    }

    /**
     * Sets the value of the effectiveDtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveDtTime(DateTime value) {
        this.effectiveDtTime = value;
    }

    /**
     * Gets the value of the expirationDtTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getExpirationDtTime() {
        return expirationDtTime;
    }

    /**
     * Sets the value of the expirationDtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setExpirationDtTime(DateTime value) {
        this.expirationDtTime = value;
    }

    /**
     * Gets the value of the formNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C20 }
     *     
     */
    public C20 getFormNumber() {
        return formNumber;
    }

    /**
     * Sets the value of the formNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C20 }
     *     
     */
    public void setFormNumber(C20 value) {
        this.formNumber = value;
    }

    /**
     * Gets the value of the newBinderInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewBinderInd() {
        return newBinderInd;
    }

    /**
     * Sets the value of the newBinderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewBinderInd(Boolean value) {
        this.newBinderInd = value;
    }

    /**
     * Gets the value of the nonStandardConditionsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNonStandardConditionsInd() {
        return nonStandardConditionsInd;
    }

    /**
     * Sets the value of the nonStandardConditionsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStandardConditionsInd(Boolean value) {
        this.nonStandardConditionsInd = value;
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
