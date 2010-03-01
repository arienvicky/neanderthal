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
 * <p>Java class for SuretyBondCancelNonRenew_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuretyBondCancelNonRenew_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PartialSuretyBond"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CancelNonRenewInfo"/>
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
@XmlType(name = "SuretyBondCancelNonRenew_Type", propOrder = {
    "partialSuretyBond",
    "cancelNonRenewInfo"
})
public class SuretyBondCancelNonRenewType {

    @XmlElement(name = "PartialSuretyBond", required = true)
    protected PartialSuretyBondType partialSuretyBond;
    @XmlElement(name = "CancelNonRenewInfo", required = true)
    protected CancelNonRenewInfoType cancelNonRenewInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the partialSuretyBond property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSuretyBondType }
     *     
     */
    public PartialSuretyBondType getPartialSuretyBond() {
        return partialSuretyBond;
    }

    /**
     * Sets the value of the partialSuretyBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSuretyBondType }
     *     
     */
    public void setPartialSuretyBond(PartialSuretyBondType value) {
        this.partialSuretyBond = value;
    }

    /**
     * Gets the value of the cancelNonRenewInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CancelNonRenewInfoType }
     *     
     */
    public CancelNonRenewInfoType getCancelNonRenewInfo() {
        return cancelNonRenewInfo;
    }

    /**
     * Sets the value of the cancelNonRenewInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelNonRenewInfoType }
     *     
     */
    public void setCancelNonRenewInfo(CancelNonRenewInfoType value) {
        this.cancelNonRenewInfo = value;
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