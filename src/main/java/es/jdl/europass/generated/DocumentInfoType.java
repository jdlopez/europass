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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains information about the date the XML was issued/ produced, the xsd version with which the xml file is compatible, and optional comments.
 * 			
 * 
 * <p>Clase Java para DocumentInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentType" type="{http://europass.cedefop.europa.eu/Europass}DocumentTypeType"/>
 *         &lt;element name="Bundle" type="{http://europass.cedefop.europa.eu/Europass}DocumentListType" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="XSDVersion" type="{http://europass.cedefop.europa.eu/Europass}CurrentVersionNumberType"/>
 *         &lt;element name="Generator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EuropassLogo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfoType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "documentType",
    "bundle",
    "creationDate",
    "lastUpdateDate",
    "xsdVersion",
    "generator",
    "comment",
    "copyright",
    "europassLogo"
})
public class DocumentInfoType {

    @XmlElement(name = "DocumentType", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentTypeType documentType;
    @XmlElement(name = "Bundle", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DocumentListType bundle;
    @XmlElement(name = "CreationDate", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "XSDVersion", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    protected String xsdVersion;
    @XmlElement(name = "Generator", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    protected String generator;
    @XmlElement(name = "Comment", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String comment;
    @XmlElement(name = "Copyright", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String copyright;
    @XmlElement(name = "EuropassLogo", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected Boolean europassLogo;

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeType }
     *     
     */
    public DocumentTypeType getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeType }
     *     
     */
    public void setDocumentType(DocumentTypeType value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad bundle.
     * 
     * @return
     *     possible object is
     *     {@link DocumentListType }
     *     
     */
    public DocumentListType getBundle() {
        return bundle;
    }

    /**
     * Define el valor de la propiedad bundle.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentListType }
     *     
     */
    public void setBundle(DocumentListType value) {
        this.bundle = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Define el valor de la propiedad lastUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad xsdVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSDVersion() {
        return xsdVersion;
    }

    /**
     * Define el valor de la propiedad xsdVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSDVersion(String value) {
        this.xsdVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad generator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Define el valor de la propiedad generator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtiene el valor de la propiedad copyright.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Define el valor de la propiedad copyright.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Obtiene el valor de la propiedad europassLogo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEuropassLogo() {
        return europassLogo;
    }

    /**
     * Define el valor de la propiedad europassLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEuropassLogo(Boolean value) {
        this.europassLogo = value;
    }

}
