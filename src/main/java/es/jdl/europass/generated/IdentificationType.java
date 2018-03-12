//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the personal information of the individual, which includes at least the name, and optionally contact information, demographics, photo and signature.
 * 			
 * 
 * <p>Clase Java para IdentificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://europass.cedefop.europa.eu/Europass}PersonNameType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://europass.cedefop.europa.eu/Europass}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="Demographics" type="{http://europass.cedefop.europa.eu/Europass}DemographicsType" minOccurs="0"/>
 *         &lt;element name="Photo" type="{http://europass.cedefop.europa.eu/Europass}PhotoDataType" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://europass.cedefop.europa.eu/Europass}SignatureDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "personName",
    "contactInfo",
    "demographics",
    "photo",
    "signature"
})
public class IdentificationType {

    @XmlElement(name = "PersonName", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected PersonNameType personName;
    @XmlElement(name = "ContactInfo", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "Demographics", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DemographicsType demographics;
    @XmlElement(name = "Photo", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected PhotoDataType photo;
    @XmlElement(name = "Signature", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected SignatureDataType signature;

    /**
     * Obtiene el valor de la propiedad personName.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Define el valor de la propiedad personName.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Obtiene el valor de la propiedad contactInfo.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Define el valor de la propiedad contactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad demographics.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType }
     *     
     */
    public DemographicsType getDemographics() {
        return demographics;
    }

    /**
     * Define el valor de la propiedad demographics.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType }
     *     
     */
    public void setDemographics(DemographicsType value) {
        this.demographics = value;
    }

    /**
     * Obtiene el valor de la propiedad photo.
     * 
     * @return
     *     possible object is
     *     {@link PhotoDataType }
     *     
     */
    public PhotoDataType getPhoto() {
        return photo;
    }

    /**
     * Define el valor de la propiedad photo.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoDataType }
     *     
     */
    public void setPhoto(PhotoDataType value) {
        this.photo = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureDataType }
     *     
     */
    public SignatureDataType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureDataType }
     *     
     */
    public void setSignature(SignatureDataType value) {
        this.signature = value;
    }

}
