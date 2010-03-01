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
 * <p>Java class for MotorTruckCargoDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotorTruckCargoDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlMajorRevenueSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GrossReceiptsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommodityInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingsInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MotorTruckCargoDetail_Type", propOrder = {
    "commlMajorRevenueSource",
    "grossReceiptsInfo",
    "commodityInfo",
    "filingsInfo",
    "valueInfo"
})
public class MotorTruckCargoDetailType {

    @XmlElement(name = "CommlMajorRevenueSource")
    protected List<CommlMajorRevenueSourceType> commlMajorRevenueSource;
    @XmlElement(name = "GrossReceiptsInfo")
    protected List<GrossReceiptsInfoType> grossReceiptsInfo;
    @XmlElement(name = "CommodityInfo")
    protected List<CommodityInfoType> commodityInfo;
    @XmlElement(name = "FilingsInfo")
    protected List<FilingsInfoType> filingsInfo;
    @XmlElement(name = "ValueInfo")
    protected List<ValueInfoType> valueInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the commlMajorRevenueSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlMajorRevenueSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlMajorRevenueSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlMajorRevenueSourceType }
     * 
     * 
     */
    public List<CommlMajorRevenueSourceType> getCommlMajorRevenueSource() {
        if (commlMajorRevenueSource == null) {
            commlMajorRevenueSource = new ArrayList<CommlMajorRevenueSourceType>();
        }
        return this.commlMajorRevenueSource;
    }

    /**
     * Gets the value of the grossReceiptsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossReceiptsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossReceiptsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossReceiptsInfoType }
     * 
     * 
     */
    public List<GrossReceiptsInfoType> getGrossReceiptsInfo() {
        if (grossReceiptsInfo == null) {
            grossReceiptsInfo = new ArrayList<GrossReceiptsInfoType>();
        }
        return this.grossReceiptsInfo;
    }

    /**
     * Gets the value of the commodityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityInfoType }
     * 
     * 
     */
    public List<CommodityInfoType> getCommodityInfo() {
        if (commodityInfo == null) {
            commodityInfo = new ArrayList<CommodityInfoType>();
        }
        return this.commodityInfo;
    }

    /**
     * Gets the value of the filingsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingsInfoType }
     * 
     * 
     */
    public List<FilingsInfoType> getFilingsInfo() {
        if (filingsInfo == null) {
            filingsInfo = new ArrayList<FilingsInfoType>();
        }
        return this.filingsInfo;
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