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
 * <p>Clase Java para OrganisationalContactInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrganisationalContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://europass.cedefop.europa.eu/Europass}ContactAddressType" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://europass.cedefop.europa.eu/Europass}OrganisationalWebsiteType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationalContactInfoType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "address",
    "website"
})
public class OrganisationalContactInfoType {

    @XmlElement(name = "Address", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ContactAddressType address;
    @XmlElement(name = "Website", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OrganisationalWebsiteType website;

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link ContactAddressType }
     *     
     */
    public ContactAddressType getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAddressType }
     *     
     */
    public void setAddress(ContactAddressType value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad website.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationalWebsiteType }
     *     
     */
    public OrganisationalWebsiteType getWebsite() {
        return website;
    }

    /**
     * Define el valor de la propiedad website.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationalWebsiteType }
     *     
     */
    public void setWebsite(OrganisationalWebsiteType value) {
        this.website = value;
    }

}
