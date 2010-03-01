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
 * <p>Java class for LiquorInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiquorInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}License" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumBarsOnPremises" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumBartenders" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumWaiters" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AvgLengthEmployment" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BeerSalesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WineSalesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AlcoholPolicyInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MgtNotifiedPatronInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SteadyClienteleInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ShotsServedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ShotSpecialsInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HappyHourInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReducedPriceDrinksInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LastCallInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LastCallTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PackageGoodsSalesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PackageLiquorReceiptsPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FullBarInd" minOccurs="0"/>
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
@XmlType(name = "LiquorInfo_Type", propOrder = {
    "license",
    "numBarsOnPremises",
    "numBartenders",
    "numWaiters",
    "avgLengthEmployment",
    "beerSalesInd",
    "wineSalesInd",
    "alcoholPolicyInd",
    "mgtNotifiedPatronInd",
    "steadyClienteleInd",
    "shotsServedInd",
    "shotSpecialsInd",
    "happyHourInd",
    "reducedPriceDrinksInd",
    "lastCallInd",
    "lastCallTime",
    "packageGoodsSalesInd",
    "packageLiquorReceiptsPct",
    "fullBarInd"
})
public class LiquorInfoType {

    @XmlElement(name = "License")
    protected LicenseType2 license;
    @XmlElement(name = "NumBarsOnPremises")
    protected Long numBarsOnPremises;
    @XmlElement(name = "NumBartenders")
    protected Long numBartenders;
    @XmlElement(name = "NumWaiters")
    protected Long numWaiters;
    @XmlElement(name = "AvgLengthEmployment")
    protected MEASUREMENT avgLengthEmployment;
    @XmlElement(name = "BeerSalesInd")
    protected Boolean beerSalesInd;
    @XmlElement(name = "WineSalesInd")
    protected Boolean wineSalesInd;
    @XmlElement(name = "AlcoholPolicyInd")
    protected Boolean alcoholPolicyInd;
    @XmlElement(name = "MgtNotifiedPatronInd")
    protected Boolean mgtNotifiedPatronInd;
    @XmlElement(name = "SteadyClienteleInd")
    protected Boolean steadyClienteleInd;
    @XmlElement(name = "ShotsServedInd")
    protected Boolean shotsServedInd;
    @XmlElement(name = "ShotSpecialsInd")
    protected Boolean shotSpecialsInd;
    @XmlElement(name = "HappyHourInd")
    protected Boolean happyHourInd;
    @XmlElement(name = "ReducedPriceDrinksInd")
    protected Boolean reducedPriceDrinksInd;
    @XmlElement(name = "LastCallInd")
    protected Boolean lastCallInd;
    @XmlElement(name = "LastCallTime")
    protected Time lastCallTime;
    @XmlElement(name = "PackageGoodsSalesInd")
    protected Boolean packageGoodsSalesInd;
    @XmlElement(name = "PackageLiquorReceiptsPct")
    protected PercentDecimal packageLiquorReceiptsPct;
    @XmlElement(name = "FullBarInd")
    protected Boolean fullBarInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseType2 }
     *     
     */
    public LicenseType2 getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseType2 }
     *     
     */
    public void setLicense(LicenseType2 value) {
        this.license = value;
    }

    /**
     * Gets the value of the numBarsOnPremises property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumBarsOnPremises() {
        return numBarsOnPremises;
    }

    /**
     * Sets the value of the numBarsOnPremises property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumBarsOnPremises(Long value) {
        this.numBarsOnPremises = value;
    }

    /**
     * Gets the value of the numBartenders property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumBartenders() {
        return numBartenders;
    }

    /**
     * Sets the value of the numBartenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumBartenders(Long value) {
        this.numBartenders = value;
    }

    /**
     * Gets the value of the numWaiters property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumWaiters() {
        return numWaiters;
    }

    /**
     * Sets the value of the numWaiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumWaiters(Long value) {
        this.numWaiters = value;
    }

    /**
     * Gets the value of the avgLengthEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getAvgLengthEmployment() {
        return avgLengthEmployment;
    }

    /**
     * Sets the value of the avgLengthEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setAvgLengthEmployment(MEASUREMENT value) {
        this.avgLengthEmployment = value;
    }

    /**
     * Gets the value of the beerSalesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBeerSalesInd() {
        return beerSalesInd;
    }

    /**
     * Sets the value of the beerSalesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeerSalesInd(Boolean value) {
        this.beerSalesInd = value;
    }

    /**
     * Gets the value of the wineSalesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWineSalesInd() {
        return wineSalesInd;
    }

    /**
     * Sets the value of the wineSalesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWineSalesInd(Boolean value) {
        this.wineSalesInd = value;
    }

    /**
     * Gets the value of the alcoholPolicyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAlcoholPolicyInd() {
        return alcoholPolicyInd;
    }

    /**
     * Sets the value of the alcoholPolicyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlcoholPolicyInd(Boolean value) {
        this.alcoholPolicyInd = value;
    }

    /**
     * Gets the value of the mgtNotifiedPatronInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMgtNotifiedPatronInd() {
        return mgtNotifiedPatronInd;
    }

    /**
     * Sets the value of the mgtNotifiedPatronInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMgtNotifiedPatronInd(Boolean value) {
        this.mgtNotifiedPatronInd = value;
    }

    /**
     * Gets the value of the steadyClienteleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSteadyClienteleInd() {
        return steadyClienteleInd;
    }

    /**
     * Sets the value of the steadyClienteleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSteadyClienteleInd(Boolean value) {
        this.steadyClienteleInd = value;
    }

    /**
     * Gets the value of the shotsServedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShotsServedInd() {
        return shotsServedInd;
    }

    /**
     * Sets the value of the shotsServedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShotsServedInd(Boolean value) {
        this.shotsServedInd = value;
    }

    /**
     * Gets the value of the shotSpecialsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShotSpecialsInd() {
        return shotSpecialsInd;
    }

    /**
     * Sets the value of the shotSpecialsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShotSpecialsInd(Boolean value) {
        this.shotSpecialsInd = value;
    }

    /**
     * Gets the value of the happyHourInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHappyHourInd() {
        return happyHourInd;
    }

    /**
     * Sets the value of the happyHourInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHappyHourInd(Boolean value) {
        this.happyHourInd = value;
    }

    /**
     * Gets the value of the reducedPriceDrinksInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReducedPriceDrinksInd() {
        return reducedPriceDrinksInd;
    }

    /**
     * Sets the value of the reducedPriceDrinksInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReducedPriceDrinksInd(Boolean value) {
        this.reducedPriceDrinksInd = value;
    }

    /**
     * Gets the value of the lastCallInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLastCallInd() {
        return lastCallInd;
    }

    /**
     * Sets the value of the lastCallInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastCallInd(Boolean value) {
        this.lastCallInd = value;
    }

    /**
     * Gets the value of the lastCallTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getLastCallTime() {
        return lastCallTime;
    }

    /**
     * Sets the value of the lastCallTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setLastCallTime(Time value) {
        this.lastCallTime = value;
    }

    /**
     * Gets the value of the packageGoodsSalesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPackageGoodsSalesInd() {
        return packageGoodsSalesInd;
    }

    /**
     * Sets the value of the packageGoodsSalesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackageGoodsSalesInd(Boolean value) {
        this.packageGoodsSalesInd = value;
    }

    /**
     * Gets the value of the packageLiquorReceiptsPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getPackageLiquorReceiptsPct() {
        return packageLiquorReceiptsPct;
    }

    /**
     * Sets the value of the packageLiquorReceiptsPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setPackageLiquorReceiptsPct(PercentDecimal value) {
        this.packageLiquorReceiptsPct = value;
    }

    /**
     * Gets the value of the fullBarInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFullBarInd() {
        return fullBarInd;
    }

    /**
     * Sets the value of the fullBarInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullBarInd(Boolean value) {
        this.fullBarInd = value;
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
