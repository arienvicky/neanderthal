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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MsgSetResponsePullRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgSetResponsePullRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RqUID"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TransactionRequestDt"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MsgSetResponse" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgSetResponsePullRq_Type", propOrder = {
    "rqUID",
    "transactionRequestDt",
    "msgSetResponse"
})
public class MsgSetResponsePullRqType {

    @XmlElement(name = "RqUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rqUID;
    @XmlElement(name = "TransactionRequestDt", required = true)
    protected DateTime transactionRequestDt;
    @XmlElement(name = "MsgSetResponse", required = true)
    protected List<MsgSetResponseType> msgSetResponse;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
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
     * Gets the value of the msgSetResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgSetResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgSetResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsgSetResponseType }
     * 
     * 
     */
    public List<MsgSetResponseType> getMsgSetResponse() {
        if (msgSetResponse == null) {
            msgSetResponse = new ArrayList<MsgSetResponseType>();
        }
        return this.msgSetResponse;
    }

}
