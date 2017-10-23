
package es.jdl.europass.generated.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "MotherTongue",
    "ForeignLanguage"
})
public class Linguistic {

    @JsonProperty("MotherTongue")
    private List<Object> motherTongue = new ArrayList<Object>();
    @JsonProperty("ForeignLanguage")
    private List<Object> foreignLanguage = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MotherTongue")
    public List<Object> getMotherTongue() {
        return motherTongue;
    }

    @JsonProperty("MotherTongue")
    public void setMotherTongue(List<Object> motherTongue) {
        this.motherTongue = motherTongue;
    }

    @JsonProperty("ForeignLanguage")
    public List<Object> getForeignLanguage() {
        return foreignLanguage;
    }

    @JsonProperty("ForeignLanguage")
    public void setForeignLanguage(List<Object> foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
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
        return new ToStringBuilder(this).append("motherTongue", motherTongue).append("foreignLanguage", foreignLanguage).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(foreignLanguage).append(motherTongue).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Linguistic) == false) {
            return false;
        }
        Linguistic rhs = ((Linguistic) other);
        return new EqualsBuilder().append(foreignLanguage, rhs.foreignLanguage).append(motherTongue, rhs.motherTongue).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
