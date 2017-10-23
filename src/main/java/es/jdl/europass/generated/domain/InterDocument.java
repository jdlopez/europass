
package es.jdl.europass.generated.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ref"
})
public class InterDocument {

    @JsonProperty("ref")
    private es.jdl.europass.generated.domain.DocumentInfo.DocumentType ref;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref")
    public es.jdl.europass.generated.domain.DocumentInfo.DocumentType getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(es.jdl.europass.generated.domain.DocumentInfo.DocumentType ref) {
        this.ref = ref;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ref", ref).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ref).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InterDocument) == false) {
            return false;
        }
        InterDocument rhs = ((InterDocument) other);
        return new EqualsBuilder().append(ref, rhs.ref).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
