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
 * <p>Java class for AffiliationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommercialName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LegalEntityCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TitleRelationshipCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AffiliationInfo_Type", propOrder = {
    "commercialName",
    "legalEntityCd",
    "titleRelationshipCd",
    "miscParty"
})
public class AffiliationInfoType {

    @XmlElement(name = "CommercialName")
    protected C255 commercialName;
    @XmlElement(name = "LegalEntityCd")
    protected List<LegalEntity> legalEntityCd;
    @XmlElement(name = "TitleRelationshipCd")
    protected TitleRelationship titleRelationshipCd;
    @XmlElement(name = "MiscParty")
    protected List<MiscPartyType> miscParty;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setCommercialName(C255 value) {
        this.commercialName = value;
    }

    /**
     * Gets the value of the legalEntityCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalEntityCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalEntityCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEntity }
     * 
     * 
     */
    public List<LegalEntity> getLegalEntityCd() {
        if (legalEntityCd == null) {
            legalEntityCd = new ArrayList<LegalEntity>();
        }
        return this.legalEntityCd;
    }

    /**
     * Gets the value of the titleRelationshipCd property.
     * 
     * @return
     *     possible object is
     *     {@link TitleRelationship }
     *     
     */
    public TitleRelationship getTitleRelationshipCd() {
        return titleRelationshipCd;
    }

    /**
     * Sets the value of the titleRelationshipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleRelationship }
     *     
     */
    public void setTitleRelationshipCd(TitleRelationship value) {
        this.titleRelationshipCd = value;
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
