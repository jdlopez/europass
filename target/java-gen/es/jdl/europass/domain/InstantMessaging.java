
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Contact",
    "Use"
})
public class InstantMessaging {

    @JsonProperty("Contact")
    private String contact;
    @JsonProperty("Use")
    private Use__ use;

    @JsonProperty("Contact")
    public String getContact() {
        return contact;
    }

    @JsonProperty("Contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    @JsonProperty("Use")
    public Use__ getUse() {
        return use;
    }

    @JsonProperty("Use")
    public void setUse(Use__ use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contact", contact).append("use", use).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(use).append(contact).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstantMessaging) == false) {
            return false;
        }
        InstantMessaging rhs = ((InstantMessaging) other);
        return new EqualsBuilder().append(use, rhs.use).append(contact, rhs.contact).isEquals();
    }

}
