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
 * <p>Java class for ShareHoldersInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHoldersInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumSharesHeld" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SharesHeldPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DirectorOrOfficerInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BoardDirectorsRepInd" minOccurs="0"/>
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
@XmlType(name = "ShareHoldersInfo_Type", propOrder = {
    "miscParty",
    "numSharesHeld",
    "sharesHeldPct",
    "directorOrOfficerInd",
    "boardDirectorsRepInd"
})
public class ShareHoldersInfoType {

    @XmlElement(name = "MiscParty")
    protected MiscPartyType miscParty;
    @XmlElement(name = "NumSharesHeld")
    protected Long numSharesHeld;
    @XmlElement(name = "SharesHeldPct")
    protected PercentDecimal sharesHeldPct;
    @XmlElement(name = "DirectorOrOfficerInd")
    protected Boolean directorOrOfficerInd;
    @XmlElement(name = "BoardDirectorsRepInd")
    protected Boolean boardDirectorsRepInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the miscParty property.
     * 
     * @return
     *     possible object is
     *     {@link MiscPartyType }
     *     
     */
    public MiscPartyType getMiscParty() {
        return miscParty;
    }

    /**
     * Sets the value of the miscParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscPartyType }
     *     
     */
    public void setMiscParty(MiscPartyType value) {
        this.miscParty = value;
    }

    /**
     * Gets the value of the numSharesHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSharesHeld() {
        return numSharesHeld;
    }

    /**
     * Sets the value of the numSharesHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSharesHeld(Long value) {
        this.numSharesHeld = value;
    }

    /**
     * Gets the value of the sharesHeldPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getSharesHeldPct() {
        return sharesHeldPct;
    }

    /**
     * Sets the value of the sharesHeldPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setSharesHeldPct(PercentDecimal value) {
        this.sharesHeldPct = value;
    }

    /**
     * Gets the value of the directorOrOfficerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDirectorOrOfficerInd() {
        return directorOrOfficerInd;
    }

    /**
     * Sets the value of the directorOrOfficerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectorOrOfficerInd(Boolean value) {
        this.directorOrOfficerInd = value;
    }

    /**
     * Gets the value of the boardDirectorsRepInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBoardDirectorsRepInd() {
        return boardDirectorsRepInd;
    }

    /**
     * Sets the value of the boardDirectorsRepInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardDirectorsRepInd(Boolean value) {
        this.boardDirectorsRepInd = value;
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
