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
 * 
 * 				Contains demographics-related information about the individual. It includes the birthdate, gender and list of nationalities.
 * 			
 * 
 * <p>Clase Java para DemographicsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DemographicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Birthdate" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://europass.cedefop.europa.eu/Europass}GenderLabelType" minOccurs="0"/>
 *         &lt;element name="NationalityList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Nationality" type="{http://europass.cedefop.europa.eu/Europass}NationalityType" maxOccurs="unbounded"/>
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
@XmlType(name = "DemographicsType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "birthdate",
    "gender",
    "nationalityList"
})
public class DemographicsType {

    @XmlElement(name = "Birthdate", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DateType birthdate;
    @XmlElement(name = "Gender", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected GenderLabelType gender;
    @XmlElement(name = "NationalityList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DemographicsType.NationalityList nationalityList;

    /**
     * Obtiene el valor de la propiedad birthdate.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBirthdate() {
        return birthdate;
    }

    /**
     * Define el valor de la propiedad birthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBirthdate(DateType value) {
        this.birthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link GenderLabelType }
     *     
     */
    public GenderLabelType getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderLabelType }
     *     
     */
    public void setGender(GenderLabelType value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalityList.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType.NationalityList }
     *     
     */
    public DemographicsType.NationalityList getNationalityList() {
        return nationalityList;
    }

    /**
     * Define el valor de la propiedad nationalityList.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType.NationalityList }
     *     
     */
    public void setNationalityList(DemographicsType.NationalityList value) {
        this.nationalityList = value;
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
     *         &lt;element name="Nationality" type="{http://europass.cedefop.europa.eu/Europass}NationalityType" maxOccurs="unbounded"/>
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
        "nationality"
    })
    public static class NationalityList {

        @XmlElement(name = "Nationality", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
        protected List<NationalityType> nationality;

        /**
         * Gets the value of the nationality property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nationality property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNationality().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NationalityType }
         * 
         * 
         */
        public List<NationalityType> getNationality() {
            if (nationality == null) {
                nationality = new ArrayList<NationalityType>();
            }
            return this.nationality;
        }

    }

}
