
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
    "AddressLine",
    "AddressLine2",
    "PostalCode",
    "Municipality",
    "Country"
})
public class Contact {

    @JsonProperty("AddressLine")
    private String addressLine;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("Municipality")
    private String municipality;
    /**
     * Defines a country. The country is described by a code and a label. E.g. code: FR, label: France.
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("Defines a country. The country is described by a code and a label. E.g. code: FR, label: France.")
    private Country country;

    @JsonProperty("AddressLine")
    public String getAddressLine() {
        return addressLine;
    }

    @JsonProperty("AddressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @JsonProperty("AddressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("AddressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

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
        return new ToStringBuilder(this).append("addressLine", addressLine).append("addressLine2", addressLine2).append("postalCode", postalCode).append("municipality", municipality).append("country", country).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(municipality).append(country).append(addressLine2).append(addressLine).append(postalCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return new EqualsBuilder().append(municipality, rhs.municipality).append(country, rhs.country).append(addressLine2, rhs.addressLine2).append(addressLine, rhs.addressLine).append(postalCode, rhs.postalCode).isEquals();
    }

}
