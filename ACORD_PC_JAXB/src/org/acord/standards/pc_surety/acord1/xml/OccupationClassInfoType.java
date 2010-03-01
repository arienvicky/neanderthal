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
 * <p>Java class for OccupationClassInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccupationClassInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OccupationClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BlanketInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OccupationClassInfo_Type", propOrder = {
    "occupationClassCd",
    "numEmployees",
    "blanketInd",
    "commlCoverage"
})
public class OccupationClassInfoType {

    @XmlElement(name = "OccupationClassCd")
    protected OccupationClass occupationClassCd;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "BlanketInd")
    protected Boolean blanketInd;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the occupationClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OccupationClass }
     *     
     */
    public OccupationClass getOccupationClassCd() {
        return occupationClassCd;
    }

    /**
     * Sets the value of the occupationClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationClass }
     *     
     */
    public void setOccupationClassCd(OccupationClass value) {
        this.occupationClassCd = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the blanketInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBlanketInd() {
        return blanketInd;
    }

    /**
     * Sets the value of the blanketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlanketInd(Boolean value) {
        this.blanketInd = value;
    }

    /**
     * Gets the value of the commlCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlCoverageType }
     * 
     * 
     */
    public List<CommlCoverageType> getCommlCoverage() {
        if (commlCoverage == null) {
            commlCoverage = new ArrayList<CommlCoverageType>();
        }
        return this.commlCoverage;
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
