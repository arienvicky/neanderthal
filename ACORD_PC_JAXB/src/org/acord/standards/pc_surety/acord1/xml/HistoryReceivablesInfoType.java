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
 * <p>Java class for HistoryReceivablesInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryReceivablesInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DeferredPaymentsPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UncollectableAccountsReceivableInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OutstandingAccountsReceivableInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "HistoryReceivablesInfo_Type", propOrder = {
    "deferredPaymentsPct",
    "uncollectableAccountsReceivableInfo",
    "outstandingAccountsReceivableInfo"
})
public class HistoryReceivablesInfoType {

    @XmlElement(name = "DeferredPaymentsPct")
    protected PercentDecimal deferredPaymentsPct;
    @XmlElement(name = "UncollectableAccountsReceivableInfo")
    protected List<UncollectableAccountsReceivableInfoType> uncollectableAccountsReceivableInfo;
    @XmlElement(name = "OutstandingAccountsReceivableInfo")
    protected List<OutstandingAccountsReceivableInfoType> outstandingAccountsReceivableInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the deferredPaymentsPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getDeferredPaymentsPct() {
        return deferredPaymentsPct;
    }

    /**
     * Sets the value of the deferredPaymentsPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setDeferredPaymentsPct(PercentDecimal value) {
        this.deferredPaymentsPct = value;
    }

    /**
     * Gets the value of the uncollectableAccountsReceivableInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uncollectableAccountsReceivableInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUncollectableAccountsReceivableInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UncollectableAccountsReceivableInfoType }
     * 
     * 
     */
    public List<UncollectableAccountsReceivableInfoType> getUncollectableAccountsReceivableInfo() {
        if (uncollectableAccountsReceivableInfo == null) {
            uncollectableAccountsReceivableInfo = new ArrayList<UncollectableAccountsReceivableInfoType>();
        }
        return this.uncollectableAccountsReceivableInfo;
    }

    /**
     * Gets the value of the outstandingAccountsReceivableInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outstandingAccountsReceivableInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutstandingAccountsReceivableInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutstandingAccountsReceivableInfoType }
     * 
     * 
     */
    public List<OutstandingAccountsReceivableInfoType> getOutstandingAccountsReceivableInfo() {
        if (outstandingAccountsReceivableInfo == null) {
            outstandingAccountsReceivableInfo = new ArrayList<OutstandingAccountsReceivableInfoType>();
        }
        return this.outstandingAccountsReceivableInfo;
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
