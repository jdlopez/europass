//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sector-level1.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="sector-level1">
 *   &lt;restriction base="{http://europass.cedefop.europa.eu/NACE}sector">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sector-level1", namespace = "http://europass.cedefop.europa.eu/NACE")
@XmlEnum
public enum SectorLevel1 {


    /**
     * Tar\u0131m, ormanc\u0131l\u0131k ve bal\u0131kç\u0131l\u0131k
     * 
     */
    A,

    /**
     * Madencilik ve ta\u015f oca\u011f\u0131 
     * 
     */
    B,

    /**
     * Imalat
     * 
     */
    C,

    /**
     * Elektirik, gaz, buhar ve klima tedariki
     * 
     */
    D,

    /**
     * Su tedariki, çöplük, at\u0131m yönetimi ve su kalitesinin iyile\u015ftirilmesi
     * 
     */
    E,

    /**
     * In\u015faat
     * 
     */
    F,

    /**
     * Toptan Ve Perakende Sat\u0131\u015f, Motorlu Araçlar\u0131n Tamiri
     * 
     */
    G,

    /**
     * Ta\u015f\u0131mac\u0131l\u0131k Ve Depolama
     * 
     */
    H,

    /**
     * Bar\u0131nma Ve G\u0131da Hizmeti
     * 
     */
    I,

    /**
     * Bilgi Ve Ileti\u015fim
     * 
     */
    J,

    /**
     * Finans Ve Sigorta Faaliyetleri
     * 
     */
    K,

    /**
     * Gayrimenkul Sektörü Faaliyetleri
     * 
     */
    L,

    /**
     * Mesleki, Bilimsel Ve Teknik Faaliyetler
     * 
     */
    M,

    /**
     * Idari Ve Destek Hizmetleri Faaliyetleri
     * 
     */
    N,

    /**
     * Kamu Yönetimi Ve Savunma; Zorunlu Sosyal Güvenlik
     * 
     */
    O,

    /**
     * E\u011fitim
     * 
     */
    P,

    /**
     * Insan Sa\u011fl\u0131\u011f\u0131 Ve Sosyal Çal\u0131\u015fma Faaliyetleri
     * 
     */
    Q,

    /**
     * Sanat Ve E\u011flence
     * 
     */
    R,

    /**
     * Di\u011fer Hizmet Faaliyetleri
     * 
     */
    S,

    /**
     * Hane Halk\u0131n\u0131 I\u015f Gücü Olarak Kullanan Faaliyetler; Pazarlananan Mallar - Ve Hizmetler- \u015eahsi Kullan\u0131m Için Üretim Faaliyetleri
     * 
     */
    T,

    /**
     * Ülke Yasalar\u0131na Dahil Olmayan Örgüt Ve Te\u015fkilatlar\u0131n Faaliyetleri
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static SectorLevel1 fromValue(String v) {
        return valueOf(v);
    }

}
