//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DocumentInfo" type="{http://europass.cedefop.europa.eu/Europass}DocumentInfoType"/>
 *         &lt;element name="PrintingPreferences" type="{http://europass.cedefop.europa.eu/Europass}PrintingPreferencesType" minOccurs="0"/>
 *         &lt;element name="LearnerInfo" type="{http://europass.cedefop.europa.eu/Europass}LearnerInfoType"/>
 *         &lt;element name="AttachmentList" type="{http://europass.cedefop.europa.eu/Europass}AttachmentListType" minOccurs="0"/>
 *         &lt;element name="CoverLetter" type="{http://europass.cedefop.europa.eu/Europass}CoverLetterType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="locale" use="required" type="{http://europass.cedefop.europa.eu/Europass}LocaleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentInfo",
    "printingPreferences",
    "learnerInfo",
    "attachmentList",
    "coverLetter"
})
@XmlRootElement(name = "SkillsPassport", namespace = "http://europass.cedefop.europa.eu/Europass")
public class SkillsPassport {

    @XmlElement(name = "DocumentInfo", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    protected DocumentInfoType documentInfo;
    @XmlElement(name = "PrintingPreferences", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected PrintingPreferencesType printingPreferences;
    @XmlElement(name = "LearnerInfo", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    protected LearnerInfoType learnerInfo;
    @XmlElement(name = "AttachmentList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected AttachmentListType attachmentList;
    @XmlElement(name = "CoverLetter", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected CoverLetterType coverLetter;
    @XmlAttribute(name = "locale", required = true)
    protected String locale;

    /**
     * Obtiene el valor de la propiedad documentInfo.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfoType }
     *     
     */
    public DocumentInfoType getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Define el valor de la propiedad documentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfoType }
     *     
     */
    public void setDocumentInfo(DocumentInfoType value) {
        this.documentInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad printingPreferences.
     * 
     * @return
     *     possible object is
     *     {@link PrintingPreferencesType }
     *     
     */
    public PrintingPreferencesType getPrintingPreferences() {
        return printingPreferences;
    }

    /**
     * Define el valor de la propiedad printingPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintingPreferencesType }
     *     
     */
    public void setPrintingPreferences(PrintingPreferencesType value) {
        this.printingPreferences = value;
    }

    /**
     * Obtiene el valor de la propiedad learnerInfo.
     * 
     * @return
     *     possible object is
     *     {@link LearnerInfoType }
     *     
     */
    public LearnerInfoType getLearnerInfo() {
        return learnerInfo;
    }

    /**
     * Define el valor de la propiedad learnerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LearnerInfoType }
     *     
     */
    public void setLearnerInfo(LearnerInfoType value) {
        this.learnerInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentList.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListType }
     *     
     */
    public AttachmentListType getAttachmentList() {
        return attachmentList;
    }

    /**
     * Define el valor de la propiedad attachmentList.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListType }
     *     
     */
    public void setAttachmentList(AttachmentListType value) {
        this.attachmentList = value;
    }

    /**
     * Obtiene el valor de la propiedad coverLetter.
     * 
     * @return
     *     possible object is
     *     {@link CoverLetterType }
     *     
     */
    public CoverLetterType getCoverLetter() {
        return coverLetter;
    }

    /**
     * Define el valor de la propiedad coverLetter.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverLetterType }
     *     
     */
    public void setCoverLetter(CoverLetterType value) {
        this.coverLetter = value;
    }

    /**
     * Obtiene el valor de la propiedad locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Define el valor de la propiedad locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}
