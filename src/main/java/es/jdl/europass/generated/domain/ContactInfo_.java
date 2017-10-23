
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
    "Address",
    "Website"
})
public class ContactInfo_ {

    @JsonProperty("Address")
    private Address_ address;
    @JsonProperty("Website")
    private Website_ website;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Address")
    public Address_ getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address_ address) {
        this.address = address;
    }

    @JsonProperty("Website")
    public Website_ getWebsite() {
        return website;
    }

    @JsonProperty("Website")
    public void setWebsite(Website_ website) {
        this.website = website;
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
        return new ToStringBuilder(this).append("address", address).append("website", website).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(website).append(address).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactInfo_) == false) {
            return false;
        }
        ContactInfo_ rhs = ((ContactInfo_) other);
        return new EqualsBuilder().append(website, rhs.website).append(address, rhs.address).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
