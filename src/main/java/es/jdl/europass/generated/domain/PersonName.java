
package es.jdl.europass.generated.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Describes the name of a person. Consists of a title (optionally), a first-name and surname.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Title",
    "FirstName",
    "Surname"
})
public class PersonName {

    @JsonProperty("Title")
    private Title title;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("Surname")
    private String surname;

    @JsonProperty("Title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("Surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("Surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).append("firstName", firstName).append("surname", surname).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstName).append(title).append(surname).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonName) == false) {
            return false;
        }
        PersonName rhs = ((PersonName) other);
        return new EqualsBuilder().append(firstName, rhs.firstName).append(title, rhs.title).append(surname, rhs.surname).isEquals();
    }

}
