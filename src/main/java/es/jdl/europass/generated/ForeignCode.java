//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para foreignCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="foreignCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bg"/>
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="da"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="et"/>
 *     &lt;enumeration value="fi"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="el"/>
 *     &lt;enumeration value="hu"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="lv"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="mt"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="sl"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="sv"/>
 *     &lt;enumeration value="tr"/>
 *     &lt;enumeration value="ab"/>
 *     &lt;enumeration value="af"/>
 *     &lt;enumeration value="sq"/>
 *     &lt;enumeration value="am"/>
 *     &lt;enumeration value="ar"/>
 *     &lt;enumeration value="an"/>
 *     &lt;enumeration value="hy"/>
 *     &lt;enumeration value="as"/>
 *     &lt;enumeration value="az"/>
 *     &lt;enumeration value="eu"/>
 *     &lt;enumeration value="be"/>
 *     &lt;enumeration value="bn"/>
 *     &lt;enumeration value="bs"/>
 *     &lt;enumeration value="br"/>
 *     &lt;enumeration value="my"/>
 *     &lt;enumeration value="ca"/>
 *     &lt;enumeration value="ce"/>
 *     &lt;enumeration value="zh"/>
 *     &lt;enumeration value="cu"/>
 *     &lt;enumeration value="kw"/>
 *     &lt;enumeration value="co"/>
 *     &lt;enumeration value="eo"/>
 *     &lt;enumeration value="fo"/>
 *     &lt;enumeration value="fj"/>
 *     &lt;enumeration value="fy"/>
 *     &lt;enumeration value="ka"/>
 *     &lt;enumeration value="gd"/>
 *     &lt;enumeration value="ga"/>
 *     &lt;enumeration value="gl"/>
 *     &lt;enumeration value="gv"/>
 *     &lt;enumeration value="grc"/>
 *     &lt;enumeration value="gu"/>
 *     &lt;enumeration value="ht"/>
 *     &lt;enumeration value="he"/>
 *     &lt;enumeration value="hi"/>
 *     &lt;enumeration value="id"/>
 *     &lt;enumeration value="jv"/>
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="kn"/>
 *     &lt;enumeration value="kk"/>
 *     &lt;enumeration value="ky"/>
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="ko"/>
 *     &lt;enumeration value="ku"/>
 *     &lt;enumeration value="lo"/>
 *     &lt;enumeration value="la"/>
 *     &lt;enumeration value="li"/>
 *     &lt;enumeration value="ln"/>
 *     &lt;enumeration value="lb"/>
 *     &lt;enumeration value="mk"/>
 *     &lt;enumeration value="ml"/>
 *     &lt;enumeration value="mr"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="mg"/>
 *     &lt;enumeration value="mo"/>
 *     &lt;enumeration value="mn"/>
 *     &lt;enumeration value="ne"/>
 *     &lt;enumeration value="nn"/>
 *     &lt;enumeration value="nb"/>
 *     &lt;enumeration value="oc"/>
 *     &lt;enumeration value="om"/>
 *     &lt;enumeration value="pa"/>
 *     &lt;enumeration value="fa"/>
 *     &lt;enumeration value="ps"/>
 *     &lt;enumeration value="rm"/>
 *     &lt;enumeration value="rom"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="sr"/>
 *     &lt;enumeration value="se"/>
 *     &lt;enumeration value="sd"/>
 *     &lt;enumeration value="so"/>
 *     &lt;enumeration value="sc"/>
 *     &lt;enumeration value="sw"/>
 *     &lt;enumeration value="ty"/>
 *     &lt;enumeration value="ta"/>
 *     &lt;enumeration value="tt"/>
 *     &lt;enumeration value="te"/>
 *     &lt;enumeration value="tg"/>
 *     &lt;enumeration value="tl"/>
 *     &lt;enumeration value="th"/>
 *     &lt;enumeration value="bo"/>
 *     &lt;enumeration value="tk"/>
 *     &lt;enumeration value="uk"/>
 *     &lt;enumeration value="ur"/>
 *     &lt;enumeration value="uz"/>
 *     &lt;enumeration value="vi"/>
 *     &lt;enumeration value="vo"/>
 *     &lt;enumeration value="cy"/>
 *     &lt;enumeration value="yi"/>
 *     &lt;enumeration value="yo"/>
 *     &lt;enumeration value="km"/>
 *     &lt;enumeration value="asq"/>
 *     &lt;enumeration value="sqk"/>
 *     &lt;enumeration value="bos-sgn"/>
 *     &lt;enumeration value="bfi"/>
 *     &lt;enumeration value="bqn"/>
 *     &lt;enumeration value="csc"/>
 *     &lt;enumeration value="csq"/>
 *     &lt;enumeration value="cy-sgn"/>
 *     &lt;enumeration value="cse"/>
 *     &lt;enumeration value="dsl"/>
 *     &lt;enumeration value="dse"/>
 *     &lt;enumeration value="eso"/>
 *     &lt;enumeration value="fse"/>
 *     &lt;enumeration value="vgt"/>
 *     &lt;enumeration value="sfb"/>
 *     &lt;enumeration value="fsl"/>
 *     &lt;enumeration value="gsg"/>
 *     &lt;enumeration value="gss"/>
 *     &lt;enumeration value="hsh"/>
 *     &lt;enumeration value="icl"/>
 *     &lt;enumeration value="isg"/>
 *     &lt;enumeration value="ise"/>
 *     &lt;enumeration value="xk-sgn"/>
 *     &lt;enumeration value="lsl"/>
 *     &lt;enumeration value="lls"/>
 *     &lt;enumeration value="mk-sgn"/>
 *     &lt;enumeration value="mdl"/>
 *     &lt;enumeration value="me-sgn"/>
 *     &lt;enumeration value="nsl"/>
 *     &lt;enumeration value="pso"/>
 *     &lt;enumeration value="psr"/>
 *     &lt;enumeration value="rms"/>
 *     &lt;enumeration value="srp-sgn"/>
 *     &lt;enumeration value="svk"/>
 *     &lt;enumeration value="slv-sgn"/>
 *     &lt;enumeration value="ssp"/>
 *     &lt;enumeration value="swl-sgn"/>
 *     &lt;enumeration value="ssr"/>
 *     &lt;enumeration value="sgg"/>
 *     &lt;enumeration value="slf"/>
 *     &lt;enumeration value="tsm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "foreignCode", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum ForeignCode {


    /**
     * bulgarca
     * 
     */
    @XmlEnumValue("bg")
    BG("bg"),

    /**
     * �ek�e
     * 
     */
    @XmlEnumValue("cs")
    CS("cs"),

    /**
     * danca
     * 
     */
    @XmlEnumValue("da")
    DA("da"),

    /**
     * flemenk�e
     * 
     */
    @XmlEnumValue("nl")
    NL("nl"),

    /**
     * ingilizce
     * 
     */
    @XmlEnumValue("en")
    EN("en"),

    /**
     * estonca
     * 
     */
    @XmlEnumValue("et")
    ET("et"),

    /**
     * fince
     * 
     */
    @XmlEnumValue("fi")
    FI("fi"),

    /**
     * frans\u0131zca
     * 
     */
    @XmlEnumValue("fr")
    FR("fr"),

    /**
     * almanca
     * 
     */
    @XmlEnumValue("de")
    DE("de"),

    /**
     * yunanca
     * 
     */
    @XmlEnumValue("el")
    EL("el"),

    /**
     * macarca
     * 
     */
    @XmlEnumValue("hu")
    HU("hu"),

    /**
     * izlandaca
     * 
     */
    @XmlEnumValue("is")
    IS("is"),

    /**
     * italyanca
     * 
     */
    @XmlEnumValue("it")
    IT("it"),

    /**
     * letonca
     * 
     */
    @XmlEnumValue("lv")
    LV("lv"),

    /**
     * litvanca
     * 
     */
    @XmlEnumValue("lt")
    LT("lt"),

    /**
     * maltaca
     * 
     */
    @XmlEnumValue("mt")
    MT("mt"),

    /**
     * norve��e
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * leh�e
     * 
     */
    @XmlEnumValue("pl")
    PL("pl"),

    /**
     * portekizce
     * 
     */
    @XmlEnumValue("pt")
    PT("pt"),

    /**
     * rumence
     * 
     */
    @XmlEnumValue("ro")
    RO("ro"),

    /**
     * h\u0131rvat�a
     * 
     */
    @XmlEnumValue("hr")
    HR("hr"),

    /**
     * slovak�a
     * 
     */
    @XmlEnumValue("sk")
    SK("sk"),

    /**
     * slovence
     * 
     */
    @XmlEnumValue("sl")
    SL("sl"),

    /**
     * ispanyolca
     * 
     */
    @XmlEnumValue("es")
    ES("es"),

    /**
     * isve��e
     * 
     */
    @XmlEnumValue("sv")
    SV("sv"),

    /**
     * t�rk�e
     * 
     */
    @XmlEnumValue("tr")
    TR("tr"),

    /**
     * abhazca
     * 
     */
    @XmlEnumValue("ab")
    AB("ab"),

    /**
     * afrikanca
     * 
     */
    @XmlEnumValue("af")
    AF("af"),

    /**
     * arnavut�a
     * 
     */
    @XmlEnumValue("sq")
    SQ("sq"),

    /**
     * amharca
     * 
     */
    @XmlEnumValue("am")
    AM("am"),

    /**
     * arap�a
     * 
     */
    @XmlEnumValue("ar")
    AR("ar"),

    /**
     * aragonca
     * 
     */
    @XmlEnumValue("an")
    AN("an"),

    /**
     * ermenice 
     * 
     */
    @XmlEnumValue("hy")
    HY("hy"),

    /**
     * assamca
     * 
     */
    @XmlEnumValue("as")
    AS("as"),

    /**
     * azerice
     * 
     */
    @XmlEnumValue("az")
    AZ("az"),

    /**
     * bask�a
     * 
     */
    @XmlEnumValue("eu")
    EU("eu"),

    /**
     * belarus�a
     * 
     */
    @XmlEnumValue("be")
    BE("be"),

    /**
     * banglade\u015f�e
     * 
     */
    @XmlEnumValue("bn")
    BN("bn"),

    /**
     * bo\u015fnak�a
     * 
     */
    @XmlEnumValue("bs")
    BS("bs"),

    /**
     * bretonca
     * 
     */
    @XmlEnumValue("br")
    BR("br"),

    /**
     * burmaca 
     * 
     */
    @XmlEnumValue("my")
    MY("my"),

    /**
     * katalanca/valensiyaca
     * 
     */
    @XmlEnumValue("ca")
    CA("ca"),

    /**
     * �e�ence
     * 
     */
    @XmlEnumValue("ce")
    CE("ce"),

    /**
     * �ince
     * 
     */
    @XmlEnumValue("zh")
    ZH("zh"),

    /**
     * slavca
     * 
     */
    @XmlEnumValue("cu")
    CU("cu"),

    /**
     * korni\u015fce
     * 
     */
    @XmlEnumValue("kw")
    KW("kw"),

    /**
     * korsikaca
     * 
     */
    @XmlEnumValue("co")
    CO("co"),

    /**
     * esperantoca
     * 
     */
    @XmlEnumValue("eo")
    EO("eo"),

    /**
     * faraoece
     * 
     */
    @XmlEnumValue("fo")
    FO("fo"),

    /**
     * fijice
     * 
     */
    @XmlEnumValue("fj")
    FJ("fj"),

    /**
     * frizyaca
     * 
     */
    @XmlEnumValue("fy")
    FY("fy"),

    /**
     * g�rc�ce 
     * 
     */
    @XmlEnumValue("ka")
    KA("ka"),

    /**
     * gaelce/isko��a
     * 
     */
    @XmlEnumValue("gd")
    GD("gd"),

    /**
     * irlandaca
     * 
     */
    @XmlEnumValue("ga")
    GA("ga"),

    /**
     * gali�yaca 
     * 
     */
    @XmlEnumValue("gl")
    GL("gl"),

    /**
     * mansk�a 
     * 
     */
    @XmlEnumValue("gv")
    GV("gv"),

    /**
     * eski yunanca
     * 
     */
    @XmlEnumValue("grc")
    GRC("grc"),

    /**
     * gucarat�a
     * 
     */
    @XmlEnumValue("gu")
    GU("gu"),

    /**
     * haitice/haiti kreyolu
     * 
     */
    @XmlEnumValue("ht")
    HT("ht"),

    /**
     * \u0130branice
     * 
     */
    @XmlEnumValue("he")
    HE("he"),

    /**
     * hint�e
     * 
     */
    @XmlEnumValue("hi")
    HI("hi"),

    /**
     * endonezce
     * 
     */
    @XmlEnumValue("id")
    ID("id"),

    /**
     * javaca
     * 
     */
    @XmlEnumValue("jv")
    JV("jv"),

    /**
     * japonca
     * 
     */
    @XmlEnumValue("ja")
    JA("ja"),

    /**
     * kannada
     * 
     */
    @XmlEnumValue("kn")
    KN("kn"),

    /**
     * kazak�a
     * 
     */
    @XmlEnumValue("kk")
    KK("kk"),

    /**
     * k\u0131rg\u0131zca
     * 
     */
    @XmlEnumValue("ky")
    KY("ky"),

    /**
     * kongoca
     * 
     */
    @XmlEnumValue("kg")
    KG("kg"),

    /**
     * korece 
     * 
     */
    @XmlEnumValue("ko")
    KO("ko"),

    /**
     * k�rt�e
     * 
     */
    @XmlEnumValue("ku")
    KU("ku"),

    /**
     * laoca
     * 
     */
    @XmlEnumValue("lo")
    LO("lo"),

    /**
     * latince
     * 
     */
    @XmlEnumValue("la")
    LA("la"),

    /**
     * limburgca
     * 
     */
    @XmlEnumValue("li")
    LI("li"),

    /**
     * lingalaca
     * 
     */
    @XmlEnumValue("ln")
    LN("ln"),

    /**
     * l�ksemburgca
     * 
     */
    @XmlEnumValue("lb")
    LB("lb"),

    /**
     * makedonca
     * 
     */
    @XmlEnumValue("mk")
    MK("mk"),

    /**
     * malayalam
     * 
     */
    @XmlEnumValue("ml")
    ML("ml"),

    /**
     * marathi
     * 
     */
    @XmlEnumValue("mr")
    MR("mr"),

    /**
     * malezyaca
     * 
     */
    @XmlEnumValue("ms")
    MS("ms"),

    /**
     * malagasi
     * 
     */
    @XmlEnumValue("mg")
    MG("mg"),

    /**
     * moldovca
     * 
     */
    @XmlEnumValue("mo")
    MO("mo"),

    /**
     * mogolca
     * 
     */
    @XmlEnumValue("mn")
    MN("mn"),

    /**
     * nepalce 
     * 
     */
    @XmlEnumValue("ne")
    NE("ne"),

    /**
     * norve��e (Norsk)
     * 
     */
    @XmlEnumValue("nn")
    NN("nn"),

    /**
     * norve��e (Bokm�l)
     * 
     */
    @XmlEnumValue("nb")
    NB("nb"),

    /**
     * oksitanca/provencal
     * 
     */
    @XmlEnumValue("oc")
    OC("oc"),

    /**
     * oromo
     * 
     */
    @XmlEnumValue("om")
    OM("om"),

    /**
     * pencap�a
     * 
     */
    @XmlEnumValue("pa")
    PA("pa"),

    /**
     * fars�a
     * 
     */
    @XmlEnumValue("fa")
    FA("fa"),

    /**
     * pe\u015ftuca
     * 
     */
    @XmlEnumValue("ps")
    PS("ps"),

    /**
     * reto romanca
     * 
     */
    @XmlEnumValue("rm")
    RM("rm"),

    /**
     * �ingenece
     * 
     */
    @XmlEnumValue("rom")
    ROM("rom"),

    /**
     * rus�a
     * 
     */
    @XmlEnumValue("ru")
    RU("ru"),

    /**
     * s\u0131rp�a
     * 
     */
    @XmlEnumValue("sr")
    SR("sr"),

    /**
     * sami
     * 
     */
    @XmlEnumValue("se")
    SE("se"),

    /**
     * sint�e
     * 
     */
    @XmlEnumValue("sd")
    SD("sd"),

    /**
     * somalice
     * 
     */
    @XmlEnumValue("so")
    SO("so"),

    /**
     * sarduca
     * 
     */
    @XmlEnumValue("sc")
    SC("sc"),

    /**
     * swahilice
     * 
     */
    @XmlEnumValue("sw")
    SW("sw"),

    /**
     * tahitice
     * 
     */
    @XmlEnumValue("ty")
    TY("ty"),

    /**
     * tamilce
     * 
     */
    @XmlEnumValue("ta")
    TA("ta"),

    /**
     * tatarca
     * 
     */
    @XmlEnumValue("tt")
    TT("tt"),

    /**
     * teluguca
     * 
     */
    @XmlEnumValue("te")
    TE("te"),

    /**
     * tacik�e
     * 
     */
    @XmlEnumValue("tg")
    TG("tg"),

    /**
     * tagalogca
     * 
     */
    @XmlEnumValue("tl")
    TL("tl"),

    /**
     * tayca
     * 
     */
    @XmlEnumValue("th")
    TH("th"),

    /**
     * tibet�e
     * 
     */
    @XmlEnumValue("bo")
    BO("bo"),

    /**
     * t�rkmence
     * 
     */
    @XmlEnumValue("tk")
    TK("tk"),

    /**
     * ukraynaca
     * 
     */
    @XmlEnumValue("uk")
    UK("uk"),

    /**
     * urduca
     * 
     */
    @XmlEnumValue("ur")
    UR("ur"),

    /**
     * �zbek�e
     * 
     */
    @XmlEnumValue("uz")
    UZ("uz"),

    /**
     * vietnamca
     * 
     */
    @XmlEnumValue("vi")
    VI("vi"),

    /**
     * volap�k
     * 
     */
    @XmlEnumValue("vo")
    VO("vo"),

    /**
     * galce
     * 
     */
    @XmlEnumValue("cy")
    CY("cy"),

    /**
     * yidce
     * 
     */
    @XmlEnumValue("yi")
    YI("yi"),

    /**
     * yoruba
     * 
     */
    @XmlEnumValue("yo")
    YO("yo"),

    /**
     * Khmerce
     * 
     */
    @XmlEnumValue("km")
    KM("km"),

    /**
     * langue des signes autrichienne
     * 
     */
    @XmlEnumValue("asq")
    ASQ("asq"),

    /**
     * langue des signes albanaise
     * 
     */
    @XmlEnumValue("sqk")
    SQK("sqk"),

    /**
     * langue des signes bosniaque
     * 
     */
    @XmlEnumValue("bos-sgn")
    BOS_SGN("bos-sgn"),

    /**
     * langue des signes britannique
     * 
     */
    @XmlEnumValue("bfi")
    BFI("bfi"),

    /**
     * langue des signes bulgare
     * 
     */
    @XmlEnumValue("bqn")
    BQN("bqn"),

    /**
     * langue des signes catalane
     * 
     */
    @XmlEnumValue("csc")
    CSC("csc"),

    /**
     * Hrvatski znakovni jezik
     * 
     */
    @XmlEnumValue("csq")
    CSQ("csq"),

    /**
     * langue des signes chypriote
     * 
     */
    @XmlEnumValue("cy-sgn")
    CY_SGN("cy-sgn"),

    /**
     * langue des signes tch�que
     * 
     */
    @XmlEnumValue("cse")
    CSE("cse"),

    /**
     * langue des signes danoise
     * 
     */
    @XmlEnumValue("dsl")
    DSL("dsl"),

    /**
     * Nederlandse Gebarentaal
     * 
     */
    @XmlEnumValue("dse")
    DSE("dse"),

    /**
     * langue des signes estonienne
     * 
     */
    @XmlEnumValue("eso")
    ESO("eso"),

    /**
     * suomalainen viittomakieli
     * 
     */
    @XmlEnumValue("fse")
    FSE("fse"),

    /**
     * langue des signes flamande
     * 
     */
    @XmlEnumValue("vgt")
    VGT("vgt"),

    /**
     * langue des signes belge francophone
     * 
     */
    @XmlEnumValue("sfb")
    SFB("sfb"),

    /**
     * langue des signes fran�aise
     * 
     */
    @XmlEnumValue("fsl")
    FSL("fsl"),

    /**
     * langue des signes allemande
     * 
     */
    @XmlEnumValue("gsg")
    GSG("gsg"),

    /**
     * langue des signes grecque
     * 
     */
    @XmlEnumValue("gss")
    GSS("gss"),

    /**
     * Magyar jelnyelv, Magyarorsz�gi jelnyelv
     * 
     */
    @XmlEnumValue("hsh")
    HSH("hsh"),

    /**
     * �slenskt T�knm�l
     * 
     */
    @XmlEnumValue("icl")
    ICL("icl"),

    /**
     * langue des signes irlandaise
     * 
     */
    @XmlEnumValue("isg")
    ISG("isg"),

    /**
     * lingua italiana dei segni
     * 
     */
    @XmlEnumValue("ise")
    ISE("ise"),

    /**
     * langue des signes kosovare
     * 
     */
    @XmlEnumValue("xk-sgn")
    XK_SGN("xk-sgn"),

    /**
     * latvie�u z\u012bmju valoda
     * 
     */
    @XmlEnumValue("lsl")
    LSL("lsl"),

    /**
     * lietuvi\u0173 gest\u0173 kalba
     * 
     */
    @XmlEnumValue("lls")
    LLS("lls"),

    /**
     * \u043c\u0430\u043a\u0435\u0434\u043e\u043d\u0441\u043a\u0438 \u0437\u043d\u0430\u043a\u043e\u0432\u0435\u043d \u0458\u0430\u0437\u0438\u043a
     * 
     */
    @XmlEnumValue("mk-sgn")
    MK_SGN("mk-sgn"),

    /**
     * Lingwa tas-Sinjali Maltija
     * 
     */
    @XmlEnumValue("mdl")
    MDL("mdl"),

    /**
     * langue des signes mont�n�grine
     * 
     */
    @XmlEnumValue("me-sgn")
    ME_SGN("me-sgn"),

    /**
     * Norsk Tegnspr�k
     * 
     */
    @XmlEnumValue("nsl")
    NSL("nsl"),

    /**
     * polski j\u0119zyk migowy
     * 
     */
    @XmlEnumValue("pso")
    PSO("pso"),

    /**
     * l�ngua gestual portuguesa
     * 
     */
    @XmlEnumValue("psr")
    PSR("psr"),

    /**
     * limbajul semnelor rom�n\u0103
     * 
     */
    @XmlEnumValue("rms")
    RMS("rms"),

    /**
     * langue des signes serbe
     * 
     */
    @XmlEnumValue("srp-sgn")
    SRP_SGN("srp-sgn"),

    /**
     * Slovn�k Posunkovej Rec
     * 
     */
    @XmlEnumValue("svk")
    SVK("svk"),

    /**
     * Slovenski znakovni jezik
     * 
     */
    @XmlEnumValue("slv-sgn")
    SLV_SGN("slv-sgn"),

    /**
     * lengua de signos espa�ola
     * 
     */
    @XmlEnumValue("ssp")
    SSP("ssp"),

    /**
     * STS, Svenskt teckenspr�k,
     * 
     */
    @XmlEnumValue("swl-sgn")
    SWL_SGN("swl-sgn"),

    /**
     * langue des Signes Suisse romande
     * 
     */
    @XmlEnumValue("ssr")
    SSR("ssr"),

    /**
     * langue des signes suisse allemanique
     * 
     */
    @XmlEnumValue("sgg")
    SGG("sgg"),

    /**
     * langue des signes suisse italienne
     * 
     */
    @XmlEnumValue("slf")
    SLF("slf"),

    /**
     * t�rk i\u015faret dili
     * 
     */
    @XmlEnumValue("tsm")
    TSM("tsm");
    private final String value;

    ForeignCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeignCode fromValue(String v) {
        for (ForeignCode c: ForeignCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
