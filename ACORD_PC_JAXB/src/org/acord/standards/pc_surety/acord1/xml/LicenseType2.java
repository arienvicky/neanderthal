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
 * <p>Java class for License_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="License_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicenseTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicenseStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicensedDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FirstLicensedCurrentStateDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicensePermitNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicenseClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicenseTerm" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProv" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CountryCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Country" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}County" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SuspensionTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RestrictionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalNumLicensePoints" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AdjNumLicensePoints" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SuspensionRevocationDesc" minOccurs="0"/>
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
@XmlType(name = "License_Type", propOrder = {
    "licenseTypeCd",
    "licenseStatusCd",
    "licensedDt",
    "firstLicensedCurrentStateDt",
    "licensePermitNumber",
    "licenseClassCd",
    "licenseTerm",
    "stateProvCd",
    "stateProv",
    "countryCd",
    "country",
    "county",
    "suspensionTerm",
    "restrictionInfo",
    "totalNumLicensePoints",
    "adjNumLicensePoints",
    "suspensionRevocationDesc"
})
public class LicenseType2 {

    @XmlElement(name = "LicenseTypeCd")
    protected LicenseType licenseTypeCd;
    @XmlElement(name = "LicenseStatusCd")
    protected LicenseStatus licenseStatusCd;
    @XmlElement(name = "LicensedDt")
    protected Date licensedDt;
    @XmlElement(name = "FirstLicensedCurrentStateDt")
    protected Date firstLicensedCurrentStateDt;
    @XmlElement(name = "LicensePermitNumber")
    protected C30 licensePermitNumber;
    @XmlElement(name = "LicenseClassCd")
    protected OpenEnum licenseClassCd;
    @XmlElement(name = "LicenseTerm")
    protected DURATION licenseTerm;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "StateProv")
    protected C60 stateProv;
    @XmlElement(name = "CountryCd")
    protected OpenEnum countryCd;
    @XmlElement(name = "Country")
    protected C60 country;
    @XmlElement(name = "County")
    protected C50 county;
    @XmlElement(name = "SuspensionTerm")
    protected List<DURATION> suspensionTerm;
    @XmlElement(name = "RestrictionInfo")
    protected List<RestrictionInfoType> restrictionInfo;
    @XmlElement(name = "TotalNumLicensePoints")
    protected Long totalNumLicensePoints;
    @XmlElement(name = "AdjNumLicensePoints")
    protected Long adjNumLicensePoints;
    @XmlElement(name = "SuspensionRevocationDesc")
    protected C255 suspensionRevocationDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the licenseTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseType }
     *     
     */
    public LicenseType getLicenseTypeCd() {
        return licenseTypeCd;
    }

    /**
     * Sets the value of the licenseTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseType }
     *     
     */
    public void setLicenseTypeCd(LicenseType value) {
        this.licenseTypeCd = value;
    }

    /**
     * Gets the value of the licenseStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseStatus }
     *     
     */
    public LicenseStatus getLicenseStatusCd() {
        return licenseStatusCd;
    }

    /**
     * Sets the value of the licenseStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseStatus }
     *     
     */
    public void setLicenseStatusCd(LicenseStatus value) {
        this.licenseStatusCd = value;
    }

    /**
     * Gets the value of the licensedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLicensedDt() {
        return licensedDt;
    }

    /**
     * Sets the value of the licensedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLicensedDt(Date value) {
        this.licensedDt = value;
    }

    /**
     * Gets the value of the firstLicensedCurrentStateDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFirstLicensedCurrentStateDt() {
        return firstLicensedCurrentStateDt;
    }

    /**
     * Sets the value of the firstLicensedCurrentStateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFirstLicensedCurrentStateDt(Date value) {
        this.firstLicensedCurrentStateDt = value;
    }

    /**
     * Gets the value of the licensePermitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C30 }
     *     
     */
    public C30 getLicensePermitNumber() {
        return licensePermitNumber;
    }

    /**
     * Sets the value of the licensePermitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C30 }
     *     
     */
    public void setLicensePermitNumber(C30 value) {
        this.licensePermitNumber = value;
    }

    /**
     * Gets the value of the licenseClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getLicenseClassCd() {
        return licenseClassCd;
    }

    /**
     * Sets the value of the licenseClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setLicenseClassCd(OpenEnum value) {
        this.licenseClassCd = value;
    }

    /**
     * Gets the value of the licenseTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getLicenseTerm() {
        return licenseTerm;
    }

    /**
     * Sets the value of the licenseTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setLicenseTerm(DURATION value) {
        this.licenseTerm = value;
    }

    /**
     * Gets the value of the stateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getStateProvCd() {
        return stateProvCd;
    }

    /**
     * Sets the value of the stateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setStateProvCd(OpenEnum value) {
        this.stateProvCd = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setStateProv(C60 value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the countryCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCountryCd() {
        return countryCd;
    }

    /**
     * Sets the value of the countryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCountryCd(OpenEnum value) {
        this.countryCd = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setCountry(C60 value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setCounty(C50 value) {
        this.county = value;
    }

    /**
     * Gets the value of the suspensionTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suspensionTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuspensionTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DURATION }
     * 
     * 
     */
    public List<DURATION> getSuspensionTerm() {
        if (suspensionTerm == null) {
            suspensionTerm = new ArrayList<DURATION>();
        }
        return this.suspensionTerm;
    }

    /**
     * Gets the value of the restrictionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionInfoType }
     * 
     * 
     */
    public List<RestrictionInfoType> getRestrictionInfo() {
        if (restrictionInfo == null) {
            restrictionInfo = new ArrayList<RestrictionInfoType>();
        }
        return this.restrictionInfo;
    }

    /**
     * Gets the value of the totalNumLicensePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumLicensePoints() {
        return totalNumLicensePoints;
    }

    /**
     * Sets the value of the totalNumLicensePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumLicensePoints(Long value) {
        this.totalNumLicensePoints = value;
    }

    /**
     * Gets the value of the adjNumLicensePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjNumLicensePoints() {
        return adjNumLicensePoints;
    }

    /**
     * Sets the value of the adjNumLicensePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjNumLicensePoints(Long value) {
        this.adjNumLicensePoints = value;
    }

    /**
     * Gets the value of the suspensionRevocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getSuspensionRevocationDesc() {
        return suspensionRevocationDesc;
    }

    /**
     * Sets the value of the suspensionRevocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setSuspensionRevocationDesc(C255 value) {
        this.suspensionRevocationDesc = value;
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
