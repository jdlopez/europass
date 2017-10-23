
package es.jdl.europass.generated.domain;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Defines a sequence of elements that fully describe a Europass XML document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Locale",
    "DocumentInfo",
    "PrintingPreferences",
    "LearnerInfo",
    "Attachment",
    "CoverLetter"
})
public class SkillsPassport {

    /**
     * the language of this document
     * <p>
     * 
     * 
     */
    @JsonProperty("Locale")
    private String locale;
    /**
     * metadata information about this document
     * <p>
     * 
     * 
     */
    @JsonProperty("DocumentInfo")
    private DocumentInfo documentInfo;
    /**
     * Printing preferences
     * <p>
     * 
     * 
     */
    @JsonProperty("PrintingPreferences")
    private PrintingPreferences printingPreferences;
    @JsonProperty("LearnerInfo")
    private LearnerInfo learnerInfo;
    @JsonProperty("Attachment")
    private List<Object> attachment = new ArrayList<Object>();
    @JsonProperty("CoverLetter")
    private CoverLetter coverLetter;

    /**
     * the language of this document
     * <p>
     * 
     * 
     */
    @JsonProperty("Locale")
    public String getLocale() {
        return locale;
    }

    /**
     * the language of this document
     * <p>
     * 
     * 
     */
    @JsonProperty("Locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * metadata information about this document
     * <p>
     * 
     * 
     */
    @JsonProperty("DocumentInfo")
    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    /**
     * metadata information about this document
     * <p>
     * 
     * 
     */
    @JsonProperty("DocumentInfo")
    public void setDocumentInfo(DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
    }

    /**
     * Printing preferences
     * <p>
     * 
     * 
     */
    @JsonProperty("PrintingPreferences")
    public PrintingPreferences getPrintingPreferences() {
        return printingPreferences;
    }

    /**
     * Printing preferences
     * <p>
     * 
     * 
     */
    @JsonProperty("PrintingPreferences")
    public void setPrintingPreferences(PrintingPreferences printingPreferences) {
        this.printingPreferences = printingPreferences;
    }

    @JsonProperty("LearnerInfo")
    public LearnerInfo getLearnerInfo() {
        return learnerInfo;
    }

    @JsonProperty("LearnerInfo")
    public void setLearnerInfo(LearnerInfo learnerInfo) {
        this.learnerInfo = learnerInfo;
    }

    @JsonProperty("Attachment")
    public List<Object> getAttachment() {
        return attachment;
    }

    @JsonProperty("Attachment")
    public void setAttachment(List<Object> attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("CoverLetter")
    public CoverLetter getCoverLetter() {
        return coverLetter;
    }

    @JsonProperty("CoverLetter")
    public void setCoverLetter(CoverLetter coverLetter) {
        this.coverLetter = coverLetter;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("locale", locale).append("documentInfo", documentInfo).append("printingPreferences", printingPreferences).append("learnerInfo", learnerInfo).append("attachment", attachment).append("coverLetter", coverLetter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(documentInfo).append(attachment).append(learnerInfo).append(printingPreferences).append(coverLetter).append(locale).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SkillsPassport) == false) {
            return false;
        }
        SkillsPassport rhs = ((SkillsPassport) other);
        return new EqualsBuilder().append(documentInfo, rhs.documentInfo).append(attachment, rhs.attachment).append(learnerInfo, rhs.learnerInfo).append(printingPreferences, rhs.printingPreferences).append(coverLetter, rhs.coverLetter).append(locale, rhs.locale).isEquals();
    }

}
