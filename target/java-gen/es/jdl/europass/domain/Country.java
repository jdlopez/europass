
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Defines a country. The country is described by a code and a label. E.g. code: FR, label: France.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "Label"
})
public class Country {

    /**
     * Defines the country code type. The type is defined in the included schema 'EuropassISOCountries'. 
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("Defines the country code type. The type is defined in the included schema 'EuropassISOCountries'. ")
    private String code;
    @JsonProperty("Label")
    private String label;

    /**
     * Defines the country code type. The type is defined in the included schema 'EuropassISOCountries'. 
     * 
     */
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    /**
     * Defines the country code type. The type is defined in the included schema 'EuropassISOCountries'. 
     * 
     */
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
        if ((other instanceof Country) == false) {
            return false;
        }
        Country rhs = ((Country) other);
        return new EqualsBuilder().append(code, rhs.code).append(label, rhs.label).isEquals();
    }

}
