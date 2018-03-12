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
 * 				Contains all the available methods of contacting individual.
 * 			
 * 
 * <p>Clase Java para ContactInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://europass.cedefop.europa.eu/Europass}ContactAddressType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://europass.cedefop.europa.eu/Europass}ContactEmailType" minOccurs="0"/>
 *         &lt;element name="TelephoneList" type="{http://europass.cedefop.europa.eu/Europass}TelephoneListType" minOccurs="0"/>
 *         &lt;element name="WebsiteList" type="{http://europass.cedefop.europa.eu/Europass}WebsiteListType" minOccurs="0"/>
 *         &lt;element name="InstantMessagingList" type="{http://europass.cedefop.europa.eu/Europass}InstantMessagingListType" minOccurs="0"/>
 *         &lt;element name="ContactMethodList" type="{http://europass.cedefop.europa.eu/Europass}ContactMethodListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "address",
    "email",
    "telephoneList",
    "websiteList",
    "instantMessagingList",
    "contactMethodList"
})
public class ContactInfoType {

    @XmlElement(name = "Address", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ContactAddressType address;
    @XmlElement(name = "Email", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ContactEmailType email;
    @XmlElement(name = "TelephoneList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected TelephoneListType telephoneList;
    @XmlElement(name = "WebsiteList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected WebsiteListType websiteList;
    @XmlElement(name = "InstantMessagingList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected InstantMessagingListType instantMessagingList;
    @XmlElement(name = "ContactMethodList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ContactMethodListType contactMethodList;

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
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link ContactEmailType }
     *     
     */
    public ContactEmailType getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactEmailType }
     *     
     */
    public void setEmail(ContactEmailType value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad telephoneList.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneListType }
     *     
     */
    public TelephoneListType getTelephoneList() {
        return telephoneList;
    }

    /**
     * Define el valor de la propiedad telephoneList.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneListType }
     *     
     */
    public void setTelephoneList(TelephoneListType value) {
        this.telephoneList = value;
    }

    /**
     * Obtiene el valor de la propiedad websiteList.
     * 
     * @return
     *     possible object is
     *     {@link WebsiteListType }
     *     
     */
    public WebsiteListType getWebsiteList() {
        return websiteList;
    }

    /**
     * Define el valor de la propiedad websiteList.
     * 
     * @param value
     *     allowed object is
     *     {@link WebsiteListType }
     *     
     */
    public void setWebsiteList(WebsiteListType value) {
        this.websiteList = value;
    }

    /**
     * Obtiene el valor de la propiedad instantMessagingList.
     * 
     * @return
     *     possible object is
     *     {@link InstantMessagingListType }
     *     
     */
    public InstantMessagingListType getInstantMessagingList() {
        return instantMessagingList;
    }

    /**
     * Define el valor de la propiedad instantMessagingList.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantMessagingListType }
     *     
     */
    public void setInstantMessagingList(InstantMessagingListType value) {
        this.instantMessagingList = value;
    }

    /**
     * Obtiene el valor de la propiedad contactMethodList.
     * 
     * @return
     *     possible object is
     *     {@link ContactMethodListType }
     *     
     */
    public ContactMethodListType getContactMethodList() {
        return contactMethodList;
    }

    /**
     * Define el valor de la propiedad contactMethodList.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMethodListType }
     *     
     */
    public void setContactMethodList(ContactMethodListType value) {
        this.contactMethodList = value;
    }

}
