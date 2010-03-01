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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CURRENCY_NoID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CURRENCY_NoID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Amt"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Precision" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConversionRateRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CURRENCY_NoID", propOrder = {
    "amt",
    "curCd",
    "precision"
})
public class CURRENCYNoID {

    @XmlElement(name = "Amt", required = true)
    protected Decimal amt;
    @XmlElement(name = "CurCd")
    protected OpenEnum curCd;
    @XmlElement(name = "Precision")
    protected Long precision;
    @XmlAttribute(name = "ConversionRateRef")
    @XmlIDREF
    protected Object conversionRateRef;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setAmt(Decimal value) {
        this.amt = value;
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
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrecision(Long value) {
        this.precision = value;
    }

    /**
     * Gets the value of the conversionRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConversionRateRef() {
        return conversionRateRef;
    }

    /**
     * Sets the value of the conversionRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConversionRateRef(Object value) {
        this.conversionRateRef = value;
    }

}