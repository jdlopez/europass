
package es.jdl.europass.domain;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Heading",
    "InterDocument",
    "IntraDocument",
    "ExtraDocument"
})
public class Documentation {

    /**
     * Defines the label to indicate that there are documents accompanying a letter. It is described by a code (optional) and a label. E.g. code: heading_1, label: Enclosed.
     * 
     */
    @JsonProperty("Heading")
    @JsonPropertyDescription("Defines the label to indicate that there are documents accompanying a letter. It is described by a code (optional) and a label. E.g. code: heading_1, label: Enclosed.")
    private Heading heading;
    @JsonProperty("InterDocument")
    private List<InterDocument> interDocument = new ArrayList<InterDocument>();
    @JsonProperty("IntraDocument")
    private List<IntraDocument> intraDocument = new ArrayList<IntraDocument>();
    @JsonProperty("ExtraDocument")
    private List<ExtraDocument> extraDocument = new ArrayList<ExtraDocument>();

    /**
     * Defines the label to indicate that there are documents accompanying a letter. It is described by a code (optional) and a label. E.g. code: heading_1, label: Enclosed.
     * 
     */
    @JsonProperty("Heading")
    public Heading getHeading() {
        return heading;
    }

    /**
     * Defines the label to indicate that there are documents accompanying a letter. It is described by a code (optional) and a label. E.g. code: heading_1, label: Enclosed.
     * 
     */
    @JsonProperty("Heading")
    public void setHeading(Heading heading) {
        this.heading = heading;
    }

    @JsonProperty("InterDocument")
    public List<InterDocument> getInterDocument() {
        return interDocument;
    }

    @JsonProperty("InterDocument")
    public void setInterDocument(List<InterDocument> interDocument) {
        this.interDocument = interDocument;
    }

    @JsonProperty("IntraDocument")
    public List<IntraDocument> getIntraDocument() {
        return intraDocument;
    }

    @JsonProperty("IntraDocument")
    public void setIntraDocument(List<IntraDocument> intraDocument) {
        this.intraDocument = intraDocument;
    }

    @JsonProperty("ExtraDocument")
    public List<ExtraDocument> getExtraDocument() {
        return extraDocument;
    }

    @JsonProperty("ExtraDocument")
    public void setExtraDocument(List<ExtraDocument> extraDocument) {
        this.extraDocument = extraDocument;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("heading", heading).append("interDocument", interDocument).append("intraDocument", intraDocument).append("extraDocument", extraDocument).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(interDocument).append(extraDocument).append(intraDocument).append(heading).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Documentation) == false) {
            return false;
        }
        Documentation rhs = ((Documentation) other);
        return new EqualsBuilder().append(interDocument, rhs.interDocument).append(extraDocument, rhs.extraDocument).append(intraDocument, rhs.intraDocument).append(heading, rhs.heading).isEquals();
    }

}
