//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LinguisticSkillType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LinguisticSkillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MotherTongueList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MotherTongue" type="{http://europass.cedefop.europa.eu/Europass}MotherTongueSkillType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ForeignLanguageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ForeignLanguage" type="{http://europass.cedefop.europa.eu/Europass}ForeignLanguageSkillType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinguisticSkillType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "motherTongueList",
    "foreignLanguageList"
})
public class LinguisticSkillType {

    @XmlElement(name = "MotherTongueList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LinguisticSkillType.MotherTongueList motherTongueList;
    @XmlElement(name = "ForeignLanguageList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LinguisticSkillType.ForeignLanguageList foreignLanguageList;

    /**
     * Obtiene el valor de la propiedad motherTongueList.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticSkillType.MotherTongueList }
     *     
     */
    public LinguisticSkillType.MotherTongueList getMotherTongueList() {
        return motherTongueList;
    }

    /**
     * Define el valor de la propiedad motherTongueList.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticSkillType.MotherTongueList }
     *     
     */
    public void setMotherTongueList(LinguisticSkillType.MotherTongueList value) {
        this.motherTongueList = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignLanguageList.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticSkillType.ForeignLanguageList }
     *     
     */
    public LinguisticSkillType.ForeignLanguageList getForeignLanguageList() {
        return foreignLanguageList;
    }

    /**
     * Define el valor de la propiedad foreignLanguageList.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticSkillType.ForeignLanguageList }
     *     
     */
    public void setForeignLanguageList(LinguisticSkillType.ForeignLanguageList value) {
        this.foreignLanguageList = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ForeignLanguage" type="{http://europass.cedefop.europa.eu/Europass}ForeignLanguageSkillType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "foreignLanguage"
    })
    public static class ForeignLanguageList {

        @XmlElement(name = "ForeignLanguage", namespace = "http://europass.cedefop.europa.eu/Europass")
        protected List<ForeignLanguageSkillType> foreignLanguage;

        /**
         * Gets the value of the foreignLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the foreignLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForeignLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ForeignLanguageSkillType }
         * 
         * 
         */
        public List<ForeignLanguageSkillType> getForeignLanguage() {
            if (foreignLanguage == null) {
                foreignLanguage = new ArrayList<ForeignLanguageSkillType>();
            }
            return this.foreignLanguage;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MotherTongue" type="{http://europass.cedefop.europa.eu/Europass}MotherTongueSkillType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "motherTongue"
    })
    public static class MotherTongueList {

        @XmlElement(name = "MotherTongue", namespace = "http://europass.cedefop.europa.eu/Europass")
        protected List<MotherTongueSkillType> motherTongue;

        /**
         * Gets the value of the motherTongue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motherTongue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotherTongue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MotherTongueSkillType }
         * 
         * 
         */
        public List<MotherTongueSkillType> getMotherTongue() {
            if (motherTongue == null) {
                motherTongue = new ArrayList<MotherTongueSkillType>();
            }
            return this.motherTongue;
        }

    }

}
