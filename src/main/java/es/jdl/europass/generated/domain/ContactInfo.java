
package es.jdl.europass.generated.domain;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Contains all the available methods of contacting individual.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Address",
    "Email",
    "Telephone",
    "Website",
    "InstantMessaging"
})
public class ContactInfo {

    /**
     * Defines the residence address of an individual.
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("Defines the residence address of an individual.")
    private Address address;
    /**
     * Defines the email address of an individual.
     * 
     */
    @JsonProperty("Email")
    @JsonPropertyDescription("Defines the email address of an individual.")
    private Email email;
    /**
     * Lists the telephone numbers owned by the individual.
     * 
     */
    @JsonProperty("Telephone")
    @JsonPropertyDescription("Lists the telephone numbers owned by the individual.")
    private List<Telephone> telephone = new ArrayList<Telephone>();
    /**
     * Lists the websites that are owned, built by or refer to the individual.
     * 
     */
    @JsonProperty("Website")
    @JsonPropertyDescription("Lists the websites that are owned, built by or refer to the individual.")
    private List<Website> website = new ArrayList<Website>();
    /**
     * Lists the instant messaging accounts numbers owned by the individual.
     * 
     */
    @JsonProperty("InstantMessaging")
    @JsonPropertyDescription("Lists the instant messaging accounts numbers owned by the individual.")
    private List<InstantMessaging> instantMessaging = new ArrayList<InstantMessaging>();

    /**
     * Defines the residence address of an individual.
     * 
     */
    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    /**
     * Defines the residence address of an individual.
     * 
     */
    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Defines the email address of an individual.
     * 
     */
    @JsonProperty("Email")
    public Email getEmail() {
        return email;
    }

    /**
     * Defines the email address of an individual.
     * 
     */
    @JsonProperty("Email")
    public void setEmail(Email email) {
        this.email = email;
    }

    /**
     * Lists the telephone numbers owned by the individual.
     * 
     */
    @JsonProperty("Telephone")
    public List<Telephone> getTelephone() {
        return telephone;
    }

    /**
     * Lists the telephone numbers owned by the individual.
     * 
     */
    @JsonProperty("Telephone")
    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    /**
     * Lists the websites that are owned, built by or refer to the individual.
     * 
     */
    @JsonProperty("Website")
    public List<Website> getWebsite() {
        return website;
    }

    /**
     * Lists the websites that are owned, built by or refer to the individual.
     * 
     */
    @JsonProperty("Website")
    public void setWebsite(List<Website> website) {
        this.website = website;
    }

    /**
     * Lists the instant messaging accounts numbers owned by the individual.
     * 
     */
    @JsonProperty("InstantMessaging")
    public List<InstantMessaging> getInstantMessaging() {
        return instantMessaging;
    }

    /**
     * Lists the instant messaging accounts numbers owned by the individual.
     * 
     */
    @JsonProperty("InstantMessaging")
    public void setInstantMessaging(List<InstantMessaging> instantMessaging) {
        this.instantMessaging = instantMessaging;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("address", address).append("email", email).append("telephone", telephone).append("website", website).append("instantMessaging", instantMessaging).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(telephone).append(website).append(address).append(email).append(instantMessaging).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactInfo) == false) {
            return false;
        }
        ContactInfo rhs = ((ContactInfo) other);
        return new EqualsBuilder().append(telephone, rhs.telephone).append(website, rhs.website).append(address, rhs.address).append(email, rhs.email).append(instantMessaging, rhs.instantMessaging).isEquals();
    }

}
