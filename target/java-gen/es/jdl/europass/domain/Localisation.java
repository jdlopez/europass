
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Date",
    "Place"
})
public class Localisation {

    @JsonProperty("Date")
    private Birthdate date;
    @JsonProperty("Place")
    private Place place;

    @JsonProperty("Date")
    public Birthdate getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(Birthdate date) {
        this.date = date;
    }

    @JsonProperty("Place")
    public Place getPlace() {
        return place;
    }

    @JsonProperty("Place")
    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("date", date).append("place", place).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(place).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Localisation) == false) {
            return false;
        }
        Localisation rhs = ((Localisation) other);
        return new EqualsBuilder().append(date, rhs.date).append(place, rhs.place).isEquals();
    }

}
