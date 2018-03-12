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
 * 				Contains a list of references to material attached to this XML instance or outside the scope of it, and which enrich or support the learner’s information.
 * 			
 * 
 * <p>Clase Java para GenericDocumentationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenericDocumentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Heading" type="{http://europass.cedefop.europa.eu/Europass}DocumentationHeadingLabelType" minOccurs="0"/>
 *         &lt;element name="InterDocument" type="{http://europass.cedefop.europa.eu/Europass}InterDocumentDocumentationType" minOccurs="0"/>
 *         &lt;element name="IntraDocument" type="{http://europass.cedefop.europa.eu/Europass}IntraDocumentDocumentationType" minOccurs="0"/>
 *         &lt;element name="ExtraDocument" type="{http://europass.cedefop.europa.eu/Europass}ExtraDocumentDocumentationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericDocumentationType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "heading",
    "interDocument",
    "intraDocument",
    "extraDocument"
})
public class GenericDocumentationType {

    @XmlElement(name = "Heading", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DocumentationHeadingLabelType heading;
    @XmlElement(name = "InterDocument", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected InterDocumentDocumentationType interDocument;
    @XmlElement(name = "IntraDocument", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected IntraDocumentDocumentationType intraDocument;
    @XmlElement(name = "ExtraDocument", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ExtraDocumentDocumentationType extraDocument;

    /**
     * Obtiene el valor de la propiedad heading.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationHeadingLabelType }
     *     
     */
    public DocumentationHeadingLabelType getHeading() {
        return heading;
    }

    /**
     * Define el valor de la propiedad heading.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationHeadingLabelType }
     *     
     */
    public void setHeading(DocumentationHeadingLabelType value) {
        this.heading = value;
    }

    /**
     * Obtiene el valor de la propiedad interDocument.
     * 
     * @return
     *     possible object is
     *     {@link InterDocumentDocumentationType }
     *     
     */
    public InterDocumentDocumentationType getInterDocument() {
        return interDocument;
    }

    /**
     * Define el valor de la propiedad interDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link InterDocumentDocumentationType }
     *     
     */
    public void setInterDocument(InterDocumentDocumentationType value) {
        this.interDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad intraDocument.
     * 
     * @return
     *     possible object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public IntraDocumentDocumentationType getIntraDocument() {
        return intraDocument;
    }

    /**
     * Define el valor de la propiedad intraDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public void setIntraDocument(IntraDocumentDocumentationType value) {
        this.intraDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad extraDocument.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDocumentDocumentationType }
     *     
     */
    public ExtraDocumentDocumentationType getExtraDocument() {
        return extraDocument;
    }

    /**
     * Define el valor de la propiedad extraDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDocumentDocumentationType }
     *     
     */
    public void setExtraDocument(ExtraDocumentDocumentationType value) {
        this.extraDocument = value;
    }

}
