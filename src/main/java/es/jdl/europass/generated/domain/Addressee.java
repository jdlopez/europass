
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
    "PersonName",
    "Position",
    "Organisation"
})
public class Addressee {

    /**
     * Describes the name of a person. Consists of a title (optionally), a first-name and surname.
     * 
     */
    @JsonProperty("PersonName")
    @JsonPropertyDescription("Describes the name of a person. Consists of a title (optionally), a first-name and surname.")
    private PersonName personName;
    /**
     * The occupational field is described by a code and a label. E.g. code: 41150, label: Secretary.
     * 
     */
    @JsonProperty("Position")
    @JsonPropertyDescription("The occupational field is described by a code and a label. E.g. code: 41150, label: Secretary.")
    private Position position;
    @JsonProperty("Organisation")
    private Organisation organisation;

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
     * The occupational field is described by a code and a label. E.g. code: 41150, label: Secretary.
     * 
     */
    @JsonProperty("Position")
    public Position getPosition() {
        return position;
    }

    /**
     * The occupational field is described by a code and a label. E.g. code: 41150, label: Secretary.
     * 
     */
    @JsonProperty("Position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("Organisation")
    public Organisation getOrganisation() {
        return organisation;
    }

    @JsonProperty("Organisation")
    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("personName", personName).append("position", position).append("organisation", organisation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(personName).append(organisation).append(position).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Addressee) == false) {
            return false;
        }
        Addressee rhs = ((Addressee) other);
        return new EqualsBuilder().append(personName, rhs.personName).append(organisation, rhs.organisation).append(position, rhs.position).isEquals();
    }

}
