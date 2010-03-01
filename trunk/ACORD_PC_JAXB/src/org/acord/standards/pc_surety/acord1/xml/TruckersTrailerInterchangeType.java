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
 * <p>Java class for TruckersTrailerInterchange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TruckersTrailerInterchange_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FarthestTerminalZoneCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumDays" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumTrailers" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RadiusUse" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RadiusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditOrSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ValueInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TruckersTrailerInterchange_Type", propOrder = {
    "farthestTerminalZoneCd",
    "numDays",
    "numTrailers",
    "radiusUse",
    "radiusCd",
    "commlCoverage",
    "creditOrSurcharge",
    "valueInfo"
})
public class TruckersTrailerInterchangeType {

    @XmlElement(name = "FarthestTerminalZoneCd")
    protected OpenEnum farthestTerminalZoneCd;
    @XmlElement(name = "NumDays")
    protected Long numDays;
    @XmlElement(name = "NumTrailers")
    protected Long numTrailers;
    @XmlElement(name = "RadiusUse")
    protected MEASUREMENT radiusUse;
    @XmlElement(name = "RadiusCd")
    protected OpenEnum radiusCd;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
    @XmlElement(name = "CreditOrSurcharge")
    protected List<PCCREDITSURCHARGE> creditOrSurcharge;
    @XmlElement(name = "ValueInfo")
    protected List<ValueInfoType> valueInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the farthestTerminalZoneCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getFarthestTerminalZoneCd() {
        return farthestTerminalZoneCd;
    }

    /**
     * Sets the value of the farthestTerminalZoneCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setFarthestTerminalZoneCd(OpenEnum value) {
        this.farthestTerminalZoneCd = value;
    }

    /**
     * Gets the value of the numDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumDays() {
        return numDays;
    }

    /**
     * Sets the value of the numDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumDays(Long value) {
        this.numDays = value;
    }

    /**
     * Gets the value of the numTrailers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumTrailers() {
        return numTrailers;
    }

    /**
     * Sets the value of the numTrailers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumTrailers(Long value) {
        this.numTrailers = value;
    }

    /**
     * Gets the value of the radiusUse property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getRadiusUse() {
        return radiusUse;
    }

    /**
     * Sets the value of the radiusUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setRadiusUse(MEASUREMENT value) {
        this.radiusUse = value;
    }

    /**
     * Gets the value of the radiusCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRadiusCd() {
        return radiusCd;
    }

    /**
     * Sets the value of the radiusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRadiusCd(OpenEnum value) {
        this.radiusCd = value;
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
     * Gets the value of the creditOrSurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditOrSurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditOrSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCCREDITSURCHARGE }
     * 
     * 
     */
    public List<PCCREDITSURCHARGE> getCreditOrSurcharge() {
        if (creditOrSurcharge == null) {
            creditOrSurcharge = new ArrayList<PCCREDITSURCHARGE>();
        }
        return this.creditOrSurcharge;
    }

    /**
     * Gets the value of the valueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueInfoType }
     * 
     * 
     */
    public List<ValueInfoType> getValueInfo() {
        if (valueInfo == null) {
            valueInfo = new ArrayList<ValueInfoType>();
        }
        return this.valueInfo;
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
