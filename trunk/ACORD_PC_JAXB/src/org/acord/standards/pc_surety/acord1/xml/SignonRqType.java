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
import org.acord.standards.pc_surety.acord1.xml.runtime.ZeroOneBooleanAdapter;


/**
 * <p>Java class for SignonRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonRq_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SIGNONENTITY" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClientDt"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CustLangPref"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClientApp"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProxyClient" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SuppressEcho" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignonRq_Type", propOrder = {
    "signonPswd",
    "signonCert",
    "signonTransport",
    "sessKey",
    "clientDt",
    "custLangPref",
    "clientApp",
    "proxyClient",
    "suppressEcho"
})
public class SignonRqType {

    @XmlElement(name = "SignonPswd")
    protected SignonPswdType signonPswd;
    @XmlElement(name = "SignonCert")
    protected SignonCertType signonCert;
    @XmlElement(name = "SignonTransport")
    protected SignonTransportType signonTransport;
    @XmlElement(name = "SessKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sessKey;
    @XmlElement(name = "ClientDt", required = true)
    protected String clientDt;
    @XmlElement(name = "CustLangPref", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String custLangPref;
    @XmlElement(name = "ClientApp", required = true)
    protected ClientAppType clientApp;
    @XmlElement(name = "ProxyClient")
    protected ProxyClientType proxyClient;
    @XmlElement(name = "SuppressEcho", type = String.class)
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected java.lang.Boolean suppressEcho;

    /**
     * Gets the value of the signonPswd property.
     * 
     * @return
     *     possible object is
     *     {@link SignonPswdType }
     *     
     */
    public SignonPswdType getSignonPswd() {
        return signonPswd;
    }

    /**
     * Sets the value of the signonPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonPswdType }
     *     
     */
    public void setSignonPswd(SignonPswdType value) {
        this.signonPswd = value;
    }

    /**
     * Gets the value of the signonCert property.
     * 
     * @return
     *     possible object is
     *     {@link SignonCertType }
     *     
     */
    public SignonCertType getSignonCert() {
        return signonCert;
    }

    /**
     * Sets the value of the signonCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonCertType }
     *     
     */
    public void setSignonCert(SignonCertType value) {
        this.signonCert = value;
    }

    /**
     * Gets the value of the signonTransport property.
     * 
     * @return
     *     possible object is
     *     {@link SignonTransportType }
     *     
     */
    public SignonTransportType getSignonTransport() {
        return signonTransport;
    }

    /**
     * Sets the value of the signonTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignonTransportType }
     *     
     */
    public void setSignonTransport(SignonTransportType value) {
        this.signonTransport = value;
    }

    /**
     * Gets the value of the sessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessKey() {
        return sessKey;
    }

    /**
     * Sets the value of the sessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessKey(String value) {
        this.sessKey = value;
    }

    /**
     * Gets the value of the clientDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDt() {
        return clientDt;
    }

    /**
     * Sets the value of the clientDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDt(String value) {
        this.clientDt = value;
    }

    /**
     * Gets the value of the custLangPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLangPref() {
        return custLangPref;
    }

    /**
     * Sets the value of the custLangPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLangPref(String value) {
        this.custLangPref = value;
    }

    /**
     * Gets the value of the clientApp property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAppType }
     *     
     */
    public ClientAppType getClientApp() {
        return clientApp;
    }

    /**
     * Sets the value of the clientApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAppType }
     *     
     */
    public void setClientApp(ClientAppType value) {
        this.clientApp = value;
    }

    /**
     * Gets the value of the proxyClient property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyClientType }
     *     
     */
    public ProxyClientType getProxyClient() {
        return proxyClient;
    }

    /**
     * Sets the value of the proxyClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyClientType }
     *     
     */
    public void setProxyClient(ProxyClientType value) {
        this.proxyClient = value;
    }

    /**
     * Gets the value of the suppressEcho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public java.lang.Boolean isSuppressEcho() {
        return suppressEcho;
    }

    /**
     * Sets the value of the suppressEcho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressEcho(java.lang.Boolean value) {
        this.suppressEcho = value;
    }

}
