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


/**
 * <p>Java class for Limit_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Limit_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PCLIMIT">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IndexAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Limit_Type", propOrder = {
    "indexAdjustment"
})
public class LimitType
    extends PCLIMIT
{

    @XmlElement(name = "IndexAdjustment")
    protected List<IndexAdjustmentType> indexAdjustment;

    /**
     * Gets the value of the indexAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexAdjustmentType }
     * 
     * 
     */
    public List<IndexAdjustmentType> getIndexAdjustment() {
        if (indexAdjustment == null) {
            indexAdjustment = new ArrayList<IndexAdjustmentType>();
        }
        return this.indexAdjustment;
    }

}
