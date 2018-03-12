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
 * <p>Clase Java para CoverLetterType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CoverLetterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addressee" type="{http://europass.cedefop.europa.eu/Europass}AddresseeType" minOccurs="0"/>
 *         &lt;element name="Letter" type="{http://europass.cedefop.europa.eu/Europass}LetterType" minOccurs="0"/>
 *         &lt;element name="Documentation" type="{http://europass.cedefop.europa.eu/Europass}GenericDocumentationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverLetterType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "addressee",
    "letter",
    "documentation"
})
public class CoverLetterType {

    @XmlElement(name = "Addressee", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected AddresseeType addressee;
    @XmlElement(name = "Letter", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LetterType letter;
    @XmlElement(name = "Documentation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected GenericDocumentationType documentation;

    /**
     * Obtiene el valor de la propiedad addressee.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeType }
     *     
     */
    public AddresseeType getAddressee() {
        return addressee;
    }

    /**
     * Define el valor de la propiedad addressee.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeType }
     *     
     */
    public void setAddressee(AddresseeType value) {
        this.addressee = value;
    }

    /**
     * Obtiene el valor de la propiedad letter.
     * 
     * @return
     *     possible object is
     *     {@link LetterType }
     *     
     */
    public LetterType getLetter() {
        return letter;
    }

    /**
     * Define el valor de la propiedad letter.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterType }
     *     
     */
    public void setLetter(LetterType value) {
        this.letter = value;
    }

    /**
     * Obtiene el valor de la propiedad documentation.
     * 
     * @return
     *     possible object is
     *     {@link GenericDocumentationType }
     *     
     */
    public GenericDocumentationType getDocumentation() {
        return documentation;
    }

    /**
     * Define el valor de la propiedad documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDocumentationType }
     *     
     */
    public void setDocumentation(GenericDocumentationType value) {
        this.documentation = value;
    }

}
