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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines an abstract organisation type. An organisation is generally described by a name and an address. 
 *             
 * 
 * <p>Clase Java para OrganisationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrganisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://europass.cedefop.europa.eu/Europass}OrganisationalContactInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "name",
    "contactInfo"
})
@XmlSeeAlso({
    EmployerType.class
})
public class OrganisationType {

    @XmlElement(name = "Name", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String name;
    @XmlElement(name = "ContactInfo", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OrganisationalContactInfoType contactInfo;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad contactInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationalContactInfoType }
     *     
     */
    public OrganisationalContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Define el valor de la propiedad contactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationalContactInfoType }
     *     
     */
    public void setContactInfo(OrganisationalContactInfoType value) {
        this.contactInfo = value;
    }

}
