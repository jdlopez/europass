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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FileDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MimeType" type="{http://europass.cedefop.europa.eu/Europass}MimeTypeEnumeration"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="MetadataList" type="{http://europass.cedefop.europa.eu/Europass}MetadataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDataType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "name",
    "mimeType",
    "data",
    "metadataList"
})
@XmlSeeAlso({
    AttachmentType.class,
    PhotoDataType.class
})
public class FileDataType {

    @XmlElement(name = "Name", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String name;
    @XmlElement(name = "MimeType", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    @XmlSchemaType(name = "string")
    protected MimeTypeEnumeration mimeType;
    @XmlElement(name = "Data", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    protected byte[] data;
    @XmlElement(name = "MetadataList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected MetadataListType metadataList;

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
     * Obtiene el valor de la propiedad mimeType.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypeEnumeration }
     *     
     */
    public MimeTypeEnumeration getMimeType() {
        return mimeType;
    }

    /**
     * Define el valor de la propiedad mimeType.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypeEnumeration }
     *     
     */
    public void setMimeType(MimeTypeEnumeration value) {
        this.mimeType = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad metadataList.
     * 
     * @return
     *     possible object is
     *     {@link MetadataListType }
     *     
     */
    public MetadataListType getMetadataList() {
        return metadataList;
    }

    /**
     * Define el valor de la propiedad metadataList.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataListType }
     *     
     */
    public void setMetadataList(MetadataListType value) {
        this.metadataList = value;
    }

}
