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
 * <p>Java class for ReceiptsDistanceUnits_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptsDistanceUnits_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}YearIdentifierCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AnnualGrossReceiptsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EstimatedAnnualDistance" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumUnits" minOccurs="0"/>
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
@XmlType(name = "ReceiptsDistanceUnits_Type", propOrder = {
    "yearIdentifierCd",
    "annualGrossReceiptsAmt",
    "estimatedAnnualDistance",
    "numUnits"
})
public class ReceiptsDistanceUnitsType {

    @XmlElement(name = "YearIdentifierCd")
    protected YearIdentifier yearIdentifierCd;
    @XmlElement(name = "AnnualGrossReceiptsAmt")
    protected CURRENCY annualGrossReceiptsAmt;
    @XmlElement(name = "EstimatedAnnualDistance")
    protected MEASUREMENT estimatedAnnualDistance;
    @XmlElement(name = "NumUnits")
    protected Decimal numUnits;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the yearIdentifierCd property.
     * 
     * @return
     *     possible object is
     *     {@link YearIdentifier }
     *     
     */
    public YearIdentifier getYearIdentifierCd() {
        return yearIdentifierCd;
    }

    /**
     * Sets the value of the yearIdentifierCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearIdentifier }
     *     
     */
    public void setYearIdentifierCd(YearIdentifier value) {
        this.yearIdentifierCd = value;
    }

    /**
     * Gets the value of the annualGrossReceiptsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAnnualGrossReceiptsAmt() {
        return annualGrossReceiptsAmt;
    }

    /**
     * Sets the value of the annualGrossReceiptsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAnnualGrossReceiptsAmt(CURRENCY value) {
        this.annualGrossReceiptsAmt = value;
    }

    /**
     * Gets the value of the estimatedAnnualDistance property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getEstimatedAnnualDistance() {
        return estimatedAnnualDistance;
    }

    /**
     * Sets the value of the estimatedAnnualDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setEstimatedAnnualDistance(MEASUREMENT value) {
        this.estimatedAnnualDistance = value;
    }

    /**
     * Gets the value of the numUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getNumUnits() {
        return numUnits;
    }

    /**
     * Sets the value of the numUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setNumUnits(Decimal value) {
        this.numUnits = value;
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
