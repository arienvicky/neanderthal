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
 * <p>Java class for BldgOccupancy_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BldgOccupancy_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumUnitsOwnerOccupied" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VacantUnoccupiedCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OccupiedPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaOccupied" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaUnoccupied" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaOpenToPublic" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OccupancyDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NatureBusinessCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployeesFullTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployeesPartTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RepairServiceDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeOccupancyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PriorNatureBusinessCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OccupiedDuringConstructionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaLeasedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VacancyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaOccupiedByOthers" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaOccupiedByOthersDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PriorOccupancyDesc" minOccurs="0"/>
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
@XmlType(name = "BldgOccupancy_Type", propOrder = {
    "numUnitsOwnerOccupied",
    "vacantUnoccupiedCd",
    "occupiedPct",
    "areaOccupied",
    "areaUnoccupied",
    "areaOpenToPublic",
    "occupancyDesc",
    "natureBusinessCd",
    "operationsDesc",
    "numEmployees",
    "numEmployeesFullTime",
    "numEmployeesPartTime",
    "repairServiceDesc",
    "lengthTimeOccupancyType",
    "priorNatureBusinessCd",
    "occupiedDuringConstructionInd",
    "areaLeasedInd",
    "vacancyInfo",
    "areaOccupiedByOthers",
    "areaOccupiedByOthersDesc",
    "priorOccupancyDesc"
})
public class BldgOccupancyType {

    @XmlElement(name = "NumUnitsOwnerOccupied")
    protected Long numUnitsOwnerOccupied;
    @XmlElement(name = "VacantUnoccupiedCd")
    protected VacantOccupiedIndicator vacantUnoccupiedCd;
    @XmlElement(name = "OccupiedPct")
    protected PercentLong occupiedPct;
    @XmlElement(name = "AreaOccupied")
    protected MEASUREMENT areaOccupied;
    @XmlElement(name = "AreaUnoccupied")
    protected MEASUREMENT areaUnoccupied;
    @XmlElement(name = "AreaOpenToPublic")
    protected MEASUREMENT areaOpenToPublic;
    @XmlElement(name = "OccupancyDesc")
    protected C255 occupancyDesc;
    @XmlElement(name = "NatureBusinessCd")
    protected List<NatureOfBusiness> natureBusinessCd;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "NumEmployeesFullTime")
    protected Long numEmployeesFullTime;
    @XmlElement(name = "NumEmployeesPartTime")
    protected Long numEmployeesPartTime;
    @XmlElement(name = "RepairServiceDesc")
    protected C255 repairServiceDesc;
    @XmlElement(name = "LengthTimeOccupancyType")
    protected MEASUREMENT lengthTimeOccupancyType;
    @XmlElement(name = "PriorNatureBusinessCd")
    protected NatureOfBusiness priorNatureBusinessCd;
    @XmlElement(name = "OccupiedDuringConstructionInd")
    protected Boolean occupiedDuringConstructionInd;
    @XmlElement(name = "AreaLeasedInd")
    protected Boolean areaLeasedInd;
    @XmlElement(name = "VacancyInfo")
    protected VacancyInfoType vacancyInfo;
    @XmlElement(name = "AreaOccupiedByOthers")
    protected MEASUREMENT areaOccupiedByOthers;
    @XmlElement(name = "AreaOccupiedByOthersDesc")
    protected C255 areaOccupiedByOthersDesc;
    @XmlElement(name = "PriorOccupancyDesc")
    protected C255 priorOccupancyDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the numUnitsOwnerOccupied property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumUnitsOwnerOccupied() {
        return numUnitsOwnerOccupied;
    }

    /**
     * Sets the value of the numUnitsOwnerOccupied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumUnitsOwnerOccupied(Long value) {
        this.numUnitsOwnerOccupied = value;
    }

    /**
     * Gets the value of the vacantUnoccupiedCd property.
     * 
     * @return
     *     possible object is
     *     {@link VacantOccupiedIndicator }
     *     
     */
    public VacantOccupiedIndicator getVacantUnoccupiedCd() {
        return vacantUnoccupiedCd;
    }

    /**
     * Sets the value of the vacantUnoccupiedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VacantOccupiedIndicator }
     *     
     */
    public void setVacantUnoccupiedCd(VacantOccupiedIndicator value) {
        this.vacantUnoccupiedCd = value;
    }

    /**
     * Gets the value of the occupiedPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getOccupiedPct() {
        return occupiedPct;
    }

    /**
     * Sets the value of the occupiedPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setOccupiedPct(PercentLong value) {
        this.occupiedPct = value;
    }

    /**
     * Gets the value of the areaOccupied property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getAreaOccupied() {
        return areaOccupied;
    }

    /**
     * Sets the value of the areaOccupied property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setAreaOccupied(MEASUREMENT value) {
        this.areaOccupied = value;
    }

    /**
     * Gets the value of the areaUnoccupied property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getAreaUnoccupied() {
        return areaUnoccupied;
    }

    /**
     * Sets the value of the areaUnoccupied property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setAreaUnoccupied(MEASUREMENT value) {
        this.areaUnoccupied = value;
    }

    /**
     * Gets the value of the areaOpenToPublic property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getAreaOpenToPublic() {
        return areaOpenToPublic;
    }

    /**
     * Sets the value of the areaOpenToPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setAreaOpenToPublic(MEASUREMENT value) {
        this.areaOpenToPublic = value;
    }

    /**
     * Gets the value of the occupancyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOccupancyDesc() {
        return occupancyDesc;
    }

    /**
     * Sets the value of the occupancyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOccupancyDesc(C255 value) {
        this.occupancyDesc = value;
    }

    /**
     * Gets the value of the natureBusinessCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the natureBusinessCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNatureBusinessCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NatureOfBusiness }
     * 
     * 
     */
    public List<NatureOfBusiness> getNatureBusinessCd() {
        if (natureBusinessCd == null) {
            natureBusinessCd = new ArrayList<NatureOfBusiness>();
        }
        return this.natureBusinessCd;
    }

    /**
     * Gets the value of the operationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOperationsDesc() {
        return operationsDesc;
    }

    /**
     * Sets the value of the operationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOperationsDesc(C255 value) {
        this.operationsDesc = value;
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
     * Gets the value of the numEmployeesFullTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesFullTime() {
        return numEmployeesFullTime;
    }

    /**
     * Sets the value of the numEmployeesFullTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesFullTime(Long value) {
        this.numEmployeesFullTime = value;
    }

    /**
     * Gets the value of the numEmployeesPartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesPartTime() {
        return numEmployeesPartTime;
    }

    /**
     * Sets the value of the numEmployeesPartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesPartTime(Long value) {
        this.numEmployeesPartTime = value;
    }

    /**
     * Gets the value of the repairServiceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRepairServiceDesc() {
        return repairServiceDesc;
    }

    /**
     * Sets the value of the repairServiceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRepairServiceDesc(C255 value) {
        this.repairServiceDesc = value;
    }

    /**
     * Gets the value of the lengthTimeOccupancyType property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLengthTimeOccupancyType() {
        return lengthTimeOccupancyType;
    }

    /**
     * Sets the value of the lengthTimeOccupancyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLengthTimeOccupancyType(MEASUREMENT value) {
        this.lengthTimeOccupancyType = value;
    }

    /**
     * Gets the value of the priorNatureBusinessCd property.
     * 
     * @return
     *     possible object is
     *     {@link NatureOfBusiness }
     *     
     */
    public NatureOfBusiness getPriorNatureBusinessCd() {
        return priorNatureBusinessCd;
    }

    /**
     * Sets the value of the priorNatureBusinessCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureOfBusiness }
     *     
     */
    public void setPriorNatureBusinessCd(NatureOfBusiness value) {
        this.priorNatureBusinessCd = value;
    }

    /**
     * Gets the value of the occupiedDuringConstructionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOccupiedDuringConstructionInd() {
        return occupiedDuringConstructionInd;
    }

    /**
     * Sets the value of the occupiedDuringConstructionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOccupiedDuringConstructionInd(Boolean value) {
        this.occupiedDuringConstructionInd = value;
    }

    /**
     * Gets the value of the areaLeasedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAreaLeasedInd() {
        return areaLeasedInd;
    }

    /**
     * Sets the value of the areaLeasedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreaLeasedInd(Boolean value) {
        this.areaLeasedInd = value;
    }

    /**
     * Gets the value of the vacancyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VacancyInfoType }
     *     
     */
    public VacancyInfoType getVacancyInfo() {
        return vacancyInfo;
    }

    /**
     * Sets the value of the vacancyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VacancyInfoType }
     *     
     */
    public void setVacancyInfo(VacancyInfoType value) {
        this.vacancyInfo = value;
    }

    /**
     * Gets the value of the areaOccupiedByOthers property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getAreaOccupiedByOthers() {
        return areaOccupiedByOthers;
    }

    /**
     * Sets the value of the areaOccupiedByOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setAreaOccupiedByOthers(MEASUREMENT value) {
        this.areaOccupiedByOthers = value;
    }

    /**
     * Gets the value of the areaOccupiedByOthersDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getAreaOccupiedByOthersDesc() {
        return areaOccupiedByOthersDesc;
    }

    /**
     * Sets the value of the areaOccupiedByOthersDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setAreaOccupiedByOthersDesc(C255 value) {
        this.areaOccupiedByOthersDesc = value;
    }

    /**
     * Gets the value of the priorOccupancyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getPriorOccupancyDesc() {
        return priorOccupancyDesc;
    }

    /**
     * Sets the value of the priorOccupancyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setPriorOccupancyDesc(C255 value) {
        this.priorOccupancyDesc = value;
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
