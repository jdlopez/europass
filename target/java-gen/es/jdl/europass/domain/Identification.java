
package es.jdl.europass.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Personal Information
 * <p>
 * Contains the personal information of the individual, which includes at least the name, and contact information, demographics and photo.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PersonName",
    "ContactInfo",
    "Demographics",
    "Photo",
    "Signature"
})
public class Identification {

    /**
     * Describes the name of a person. Consists of a title (optionally), a first-name and surname.
     * 
     */
    @JsonProperty("PersonName")
    @JsonPropertyDescription("Describes the name of a person. Consists of a title (optionally), a first-name and surname.")
    private PersonName personName;
    /**
     * Contains all the available methods of contacting individual.
     * 
     */
    @JsonProperty("ContactInfo")
    @JsonPropertyDescription("Contains all the available methods of contacting individual.")
    private ContactInfo contactInfo;
    /**
     * Contains demographics-related information about the individual. It includes the birthdate, gender and list of nationalities.
     * 
     */
    @JsonProperty("Demographics")
    @JsonPropertyDescription("Contains demographics-related information about the individual. It includes the birthdate, gender and list of nationalities.")
    private Demographics demographics;
    @JsonProperty("Photo")
    private Object photo;
    @JsonProperty("Signature")
    private Object signature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Describes the name of a person. Consists of a title (optionally), a first-name and surname.
     * 
     */
    @JsonProperty("PersonName")
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Describes the name of a person. Consists of a title (optionally), a first-name and surname.
     * 
     */
    @JsonProperty("PersonName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    /**
     * Contains all the available methods of contacting individual.
     * 
     */
    @JsonProperty("ContactInfo")
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Contains all the available methods of contacting individual.
     * 
     */
    @JsonProperty("ContactInfo")
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * Contains demographics-related information about the individual. It includes the birthdate, gender and list of nationalities.
     * 
     */
    @JsonProperty("Demographics")
    public Demographics getDemographics() {
        return demographics;
    }

    /**
     * Contains demographics-related information about the individual. It includes the birthdate, gender and list of nationalities.
     * 
     */
    @JsonProperty("Demographics")
    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    @JsonProperty("Photo")
    public Object getPhoto() {
        return photo;
    }

    @JsonProperty("Photo")
    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    @JsonProperty("Signature")
    public Object getSignature() {
        return signature;
    }

    @JsonProperty("Signature")
    public void setSignature(Object signature) {
        this.signature = signature;
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
        return new ToStringBuilder(this).append("personName", personName).append("contactInfo", contactInfo).append("demographics", demographics).append("photo", photo).append("signature", signature).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(personName).append(contactInfo).append(signature).append(photo).append(additionalProperties).append(demographics).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identification) == false) {
            return false;
        }
        Identification rhs = ((Identification) other);
        return new EqualsBuilder().append(personName, rhs.personName).append(contactInfo, rhs.contactInfo).append(signature, rhs.signature).append(photo, rhs.photo).append(additionalProperties, rhs.additionalProperties).append(demographics, rhs.demographics).isEquals();
    }

}
