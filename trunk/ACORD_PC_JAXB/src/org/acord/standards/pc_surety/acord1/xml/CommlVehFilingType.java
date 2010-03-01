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
 * <p>Java class for CommlVehFiling_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommlVehFiling_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuthorityTypeCargoCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuthorityTypeLiabilityCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BaseStateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CargoDocketNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DOTRatingAppliesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LiabilityDocketNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FinancialResponsibilityFiling" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CommlVehFiling_Type", propOrder = {
    "authorityTypeCargoCd",
    "authorityTypeLiabilityCd",
    "baseStateProvCd",
    "cargoDocketNumber",
    "dotRatingAppliesInd",
    "liabilityDocketNumber",
    "financialResponsibilityFiling"
})
public class CommlVehFilingType {

    @XmlElement(name = "AuthorityTypeCargoCd")
    protected LiabilityCargoAuthorityType authorityTypeCargoCd;
    @XmlElement(name = "AuthorityTypeLiabilityCd")
    protected LiabilityCargoAuthorityType authorityTypeLiabilityCd;
    @XmlElement(name = "BaseStateProvCd")
    protected OpenEnum baseStateProvCd;
    @XmlElement(name = "CargoDocketNumber")
    protected Long cargoDocketNumber;
    @XmlElement(name = "DOTRatingAppliesInd")
    protected Boolean dotRatingAppliesInd;
    @XmlElement(name = "LiabilityDocketNumber")
    protected Long liabilityDocketNumber;
    @XmlElement(name = "FinancialResponsibilityFiling")
    protected List<FinancialResponsibilityFilingType> financialResponsibilityFiling;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the authorityTypeCargoCd property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityCargoAuthorityType }
     *     
     */
    public LiabilityCargoAuthorityType getAuthorityTypeCargoCd() {
        return authorityTypeCargoCd;
    }

    /**
     * Sets the value of the authorityTypeCargoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityCargoAuthorityType }
     *     
     */
    public void setAuthorityTypeCargoCd(LiabilityCargoAuthorityType value) {
        this.authorityTypeCargoCd = value;
    }

    /**
     * Gets the value of the authorityTypeLiabilityCd property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityCargoAuthorityType }
     *     
     */
    public LiabilityCargoAuthorityType getAuthorityTypeLiabilityCd() {
        return authorityTypeLiabilityCd;
    }

    /**
     * Sets the value of the authorityTypeLiabilityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityCargoAuthorityType }
     *     
     */
    public void setAuthorityTypeLiabilityCd(LiabilityCargoAuthorityType value) {
        this.authorityTypeLiabilityCd = value;
    }

    /**
     * Gets the value of the baseStateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getBaseStateProvCd() {
        return baseStateProvCd;
    }

    /**
     * Sets the value of the baseStateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setBaseStateProvCd(OpenEnum value) {
        this.baseStateProvCd = value;
    }

    /**
     * Gets the value of the cargoDocketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoDocketNumber() {
        return cargoDocketNumber;
    }

    /**
     * Sets the value of the cargoDocketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoDocketNumber(Long value) {
        this.cargoDocketNumber = value;
    }

    /**
     * Gets the value of the dotRatingAppliesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDOTRatingAppliesInd() {
        return dotRatingAppliesInd;
    }

    /**
     * Sets the value of the dotRatingAppliesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDOTRatingAppliesInd(Boolean value) {
        this.dotRatingAppliesInd = value;
    }

    /**
     * Gets the value of the liabilityDocketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLiabilityDocketNumber() {
        return liabilityDocketNumber;
    }

    /**
     * Sets the value of the liabilityDocketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLiabilityDocketNumber(Long value) {
        this.liabilityDocketNumber = value;
    }

    /**
     * Gets the value of the financialResponsibilityFiling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialResponsibilityFiling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialResponsibilityFiling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialResponsibilityFilingType }
     * 
     * 
     */
    public List<FinancialResponsibilityFilingType> getFinancialResponsibilityFiling() {
        if (financialResponsibilityFiling == null) {
            financialResponsibilityFiling = new ArrayList<FinancialResponsibilityFilingType>();
        }
        return this.financialResponsibilityFiling;
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