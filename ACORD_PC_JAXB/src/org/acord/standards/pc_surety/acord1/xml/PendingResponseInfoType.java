//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PendingResponseInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingResponseInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MsgRqUID"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MsgNameCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TransactionRequestDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NotificationDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PendingResponseExpDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingResponseInfo_Type", propOrder = {
    "msgRqUID",
    "msgNameCd",
    "transactionRequestDt",
    "notificationDt",
    "pendingResponseExpDt"
})
public class PendingResponseInfoType {

    @XmlElement(name = "MsgRqUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String msgRqUID;
    @XmlElement(name = "MsgNameCd", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String msgNameCd;
    @XmlElement(name = "TransactionRequestDt")
    protected DateTime transactionRequestDt;
    @XmlElement(name = "NotificationDt")
    protected String notificationDt;
    @XmlElement(name = "PendingResponseExpDt")
    protected DateTime pendingResponseExpDt;

    /**
     * Gets the value of the msgRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRqUID() {
        return msgRqUID;
    }

    /**
     * Sets the value of the msgRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRqUID(String value) {
        this.msgRqUID = value;
    }

    /**
     * Gets the value of the msgNameCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNameCd() {
        return msgNameCd;
    }

    /**
     * Sets the value of the msgNameCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNameCd(String value) {
        this.msgNameCd = value;
    }

    /**
     * Gets the value of the transactionRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionRequestDt() {
        return transactionRequestDt;
    }

    /**
     * Sets the value of the transactionRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionRequestDt(DateTime value) {
        this.transactionRequestDt = value;
    }

    /**
     * Gets the value of the notificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationDt() {
        return notificationDt;
    }

    /**
     * Sets the value of the notificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationDt(String value) {
        this.notificationDt = value;
    }

    /**
     * Gets the value of the pendingResponseExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getPendingResponseExpDt() {
        return pendingResponseExpDt;
    }

    /**
     * Sets the value of the pendingResponseExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setPendingResponseExpDt(DateTime value) {
        this.pendingResponseExpDt = value;
    }

}
