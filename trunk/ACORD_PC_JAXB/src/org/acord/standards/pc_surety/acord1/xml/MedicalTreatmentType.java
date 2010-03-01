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
 * <p>Java class for MedicalTreatment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalTreatment_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TreatmentCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LastTreatmentDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TreatmentFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeUnderPhysiciansCare" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TreatmentAdministrationMethodCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TreatmentDosage" minOccurs="0"/>
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
@XmlType(name = "MedicalTreatment_Type", propOrder = {
    "treatmentCd",
    "lastTreatmentDt",
    "treatmentFrequencyCd",
    "miscParty",
    "lengthTimeUnderPhysiciansCare",
    "treatmentAdministrationMethodCd",
    "treatmentDosage"
})
public class MedicalTreatmentType {

    @XmlElement(name = "TreatmentCd")
    protected Treatment treatmentCd;
    @XmlElement(name = "LastTreatmentDt")
    protected Date lastTreatmentDt;
    @XmlElement(name = "TreatmentFrequencyCd")
    protected Frequency treatmentFrequencyCd;
    @XmlElement(name = "MiscParty")
    protected List<MiscPartyType> miscParty;
    @XmlElement(name = "LengthTimeUnderPhysiciansCare")
    protected MEASUREMENT lengthTimeUnderPhysiciansCare;
    @XmlElement(name = "TreatmentAdministrationMethodCd")
    protected TreatmentAdministrationMethod treatmentAdministrationMethodCd;
    @XmlElement(name = "TreatmentDosage")
    protected MEASUREMENT treatmentDosage;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the treatmentCd property.
     * 
     * @return
     *     possible object is
     *     {@link Treatment }
     *     
     */
    public Treatment getTreatmentCd() {
        return treatmentCd;
    }

    /**
     * Sets the value of the treatmentCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Treatment }
     *     
     */
    public void setTreatmentCd(Treatment value) {
        this.treatmentCd = value;
    }

    /**
     * Gets the value of the lastTreatmentDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLastTreatmentDt() {
        return lastTreatmentDt;
    }

    /**
     * Sets the value of the lastTreatmentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLastTreatmentDt(Date value) {
        this.lastTreatmentDt = value;
    }

    /**
     * Gets the value of the treatmentFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getTreatmentFrequencyCd() {
        return treatmentFrequencyCd;
    }

    /**
     * Sets the value of the treatmentFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setTreatmentFrequencyCd(Frequency value) {
        this.treatmentFrequencyCd = value;
    }

    /**
     * Gets the value of the miscParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscPartyType }
     * 
     * 
     */
    public List<MiscPartyType> getMiscParty() {
        if (miscParty == null) {
            miscParty = new ArrayList<MiscPartyType>();
        }
        return this.miscParty;
    }

    /**
     * Gets the value of the lengthTimeUnderPhysiciansCare property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLengthTimeUnderPhysiciansCare() {
        return lengthTimeUnderPhysiciansCare;
    }

    /**
     * Sets the value of the lengthTimeUnderPhysiciansCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLengthTimeUnderPhysiciansCare(MEASUREMENT value) {
        this.lengthTimeUnderPhysiciansCare = value;
    }

    /**
     * Gets the value of the treatmentAdministrationMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentAdministrationMethod }
     *     
     */
    public TreatmentAdministrationMethod getTreatmentAdministrationMethodCd() {
        return treatmentAdministrationMethodCd;
    }

    /**
     * Sets the value of the treatmentAdministrationMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentAdministrationMethod }
     *     
     */
    public void setTreatmentAdministrationMethodCd(TreatmentAdministrationMethod value) {
        this.treatmentAdministrationMethodCd = value;
    }

    /**
     * Gets the value of the treatmentDosage property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getTreatmentDosage() {
        return treatmentDosage;
    }

    /**
     * Sets the value of the treatmentDosage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setTreatmentDosage(MEASUREMENT value) {
        this.treatmentDosage = value;
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