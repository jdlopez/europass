
package es.jdl.europass.generated.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * desired employment/ occupation field
 * <p>
 * Contains a headline label for the current document. It is optional and may accommodate various cases.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Description"
})
public class Headline {

    @JsonProperty("Type")
    private Type type;
    @JsonProperty("Description")
    private Description description;

    @JsonProperty("Type")
    public Type getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("Description")
    public Description getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(Description description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("description", description).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(description).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Headline) == false) {
            return false;
        }
        Headline rhs = ((Headline) other);
        return new EqualsBuilder().append(type, rhs.type).append(description, rhs.description).isEquals();
    }

}
