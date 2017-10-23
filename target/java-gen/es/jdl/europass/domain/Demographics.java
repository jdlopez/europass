
package es.jdl.europass.domain;

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
 * Contains demographics-related information about the individual. It includes the birthdate, gender and list of nationalities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Birthdate",
    "Gender",
    "Nationality"
})
public class Demographics {

    @JsonProperty("Birthdate")
    private Birthdate birthdate;
    @JsonProperty("Gender")
    private Gender gender;
    /**
     * Defines a nationality. The nationality is described by a code and is a text only element. E.g. code: DE, label: German.
     * 
     */
    @JsonProperty("Nationality")
    @JsonPropertyDescription("Defines a nationality. The nationality is described by a code and is a text only element. E.g. code: DE, label: German.")
    private List<Nationality> nationality = new ArrayList<Nationality>();

    @JsonProperty("Birthdate")
    public Birthdate getBirthdate() {
        return birthdate;
    }

    @JsonProperty("Birthdate")
    public void setBirthdate(Birthdate birthdate) {
        this.birthdate = birthdate;
    }

    @JsonProperty("Gender")
    public Gender getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Defines a nationality. The nationality is described by a code and is a text only element. E.g. code: DE, label: German.
     * 
     */
    @JsonProperty("Nationality")
    public List<Nationality> getNationality() {
        return nationality;
    }

    /**
     * Defines a nationality. The nationality is described by a code and is a text only element. E.g. code: DE, label: German.
     * 
     */
    @JsonProperty("Nationality")
    public void setNationality(List<Nationality> nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("birthdate", birthdate).append("gender", gender).append("nationality", nationality).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(birthdate).append(gender).append(nationality).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Demographics) == false) {
            return false;
        }
        Demographics rhs = ((Demographics) other);
        return new EqualsBuilder().append(birthdate, rhs.birthdate).append(gender, rhs.gender).append(nationality, rhs.nationality).isEquals();
    }

}
