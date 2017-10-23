
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Defines the label to indicate that there are documents accompanying a letter. It is described by a code (optional) and a label. E.g. code: heading_1, label: Enclosed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "Label"
})
public class Heading {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Label")
    private String label;

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("Label")
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("label", label).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(label).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Heading) == false) {
            return false;
        }
        Heading rhs = ((Heading) other);
        return new EqualsBuilder().append(code, rhs.code).append(label, rhs.label).isEquals();
    }

}
