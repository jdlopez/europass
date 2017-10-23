
package es.jdl.europass.generated.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Municipality",
    "Country"
})
public class Place {

    @JsonProperty("Municipality")
    private String municipality;
    /**
     * Defines a country. The country is described by a code and a label. E.g. code: FR, label: France.
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("Defines a country. The country is described by a code and a label. E.g. code: FR, label: France.")
    private Country country;

    @JsonProperty("Municipality")
    public String getMunicipality() {
        return municipality;
    }

    @JsonProperty("Municipality")
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /**
     * Defines a country. The country is described by a code and a label. E.g. code: FR, label: France.
     * 
     */
    @JsonProperty("Country")
    public Country getCountry() {
        return country;
    }

    /**
     * Defines a country. The country is described by a code and a label. E.g. code: FR, label: France.
     * 
     */
    @JsonProperty("Country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("municipality", municipality).append("country", country).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(municipality).append(country).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Place) == false) {
            return false;
        }
        Place rhs = ((Place) other);
        return new EqualsBuilder().append(municipality, rhs.municipality).append(country, rhs.country).isEquals();
    }

}
