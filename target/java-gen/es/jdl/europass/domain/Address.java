
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Defines the residence address of an individual.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Contact"
})
public class Address {

    @JsonProperty("Contact")
    private Contact contact;

    @JsonProperty("Contact")
    public Contact getContact() {
        return contact;
    }

    @JsonProperty("Contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contact", contact).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contact).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(contact, rhs.contact).isEquals();
    }

}
