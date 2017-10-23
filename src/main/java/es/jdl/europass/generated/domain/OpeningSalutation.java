
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
    "Salutation",
    "PersonName"
})
public class OpeningSalutation {

    /**
     * Defines the opening salutation in a letter. It is described by a code (optional) and a label. E.g. code: salutation_2, label: Dear Mrs.
     * 
     */
    @JsonProperty("Salutation")
    @JsonPropertyDescription("Defines the opening salutation in a letter. It is described by a code (optional) and a label. E.g. code: salutation_2, label: Dear Mrs.")
    private Salutation salutation;
    /**
     * Describes the name of a person. Consists of a title (optionally), a first-name and surname.
     * 
     */
    @JsonProperty("PersonName")
    @JsonPropertyDescription("Describes the name of a person. Consists of a title (optionally), a first-name and surname.")
    private PersonName personName;

    /**
     * Defines the opening salutation in a letter. It is described by a code (optional) and a label. E.g. code: salutation_2, label: Dear Mrs.
     * 
     */
    @JsonProperty("Salutation")
    public Salutation getSalutation() {
        return salutation;
    }

    /**
     * Defines the opening salutation in a letter. It is described by a code (optional) and a label. E.g. code: salutation_2, label: Dear Mrs.
     * 
     */
    @JsonProperty("Salutation")
    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("salutation", salutation).append("personName", personName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(personName).append(salutation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpeningSalutation) == false) {
            return false;
        }
        OpeningSalutation rhs = ((OpeningSalutation) other);
        return new EqualsBuilder().append(personName, rhs.personName).append(salutation, rhs.salutation).isEquals();
    }

}
