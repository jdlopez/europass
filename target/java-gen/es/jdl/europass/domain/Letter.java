
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Localisation",
    "SubjectLine",
    "OpeningSalutation",
    "Body",
    "ClosingSalutation"
})
public class Letter {

    @JsonProperty("Localisation")
    private Localisation localisation;
    @JsonProperty("SubjectLine")
    private String subjectLine;
    @JsonProperty("OpeningSalutation")
    private OpeningSalutation openingSalutation;
    @JsonProperty("Body")
    private Body body;
    /**
     * Defines the closing salutation in a letter. It is described by a code (optional) and a label. E.g. code: closing_salutation_2, label: Your's faithfully.
     * 
     */
    @JsonProperty("ClosingSalutation")
    @JsonPropertyDescription("Defines the closing salutation in a letter. It is described by a code (optional) and a label. E.g. code: closing_salutation_2, label: Your's faithfully.")
    private ClosingSalutation closingSalutation;

    @JsonProperty("Localisation")
    public Localisation getLocalisation() {
        return localisation;
    }

    @JsonProperty("Localisation")
    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    @JsonProperty("SubjectLine")
    public String getSubjectLine() {
        return subjectLine;
    }

    @JsonProperty("SubjectLine")
    public void setSubjectLine(String subjectLine) {
        this.subjectLine = subjectLine;
    }

    @JsonProperty("OpeningSalutation")
    public OpeningSalutation getOpeningSalutation() {
        return openingSalutation;
    }

    @JsonProperty("OpeningSalutation")
    public void setOpeningSalutation(OpeningSalutation openingSalutation) {
        this.openingSalutation = openingSalutation;
    }

    @JsonProperty("Body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("Body")
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * Defines the closing salutation in a letter. It is described by a code (optional) and a label. E.g. code: closing_salutation_2, label: Your's faithfully.
     * 
     */
    @JsonProperty("ClosingSalutation")
    public ClosingSalutation getClosingSalutation() {
        return closingSalutation;
    }

    /**
     * Defines the closing salutation in a letter. It is described by a code (optional) and a label. E.g. code: closing_salutation_2, label: Your's faithfully.
     * 
     */
    @JsonProperty("ClosingSalutation")
    public void setClosingSalutation(ClosingSalutation closingSalutation) {
        this.closingSalutation = closingSalutation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("localisation", localisation).append("subjectLine", subjectLine).append("openingSalutation", openingSalutation).append("body", body).append("closingSalutation", closingSalutation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subjectLine).append(openingSalutation).append(body).append(localisation).append(closingSalutation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Letter) == false) {
            return false;
        }
        Letter rhs = ((Letter) other);
        return new EqualsBuilder().append(subjectLine, rhs.subjectLine).append(openingSalutation, rhs.openingSalutation).append(body, rhs.body).append(localisation, rhs.localisation).append(closingSalutation, rhs.closingSalutation).isEquals();
    }

}
