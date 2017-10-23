
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Year",
    "Month",
    "Day"
})
public class Birthdate {

    @JsonProperty("Year")
    private Double year;
    @JsonProperty("Month")
    private Double month;
    @JsonProperty("Day")
    private Double day;

    @JsonProperty("Year")
    public Double getYear() {
        return year;
    }

    @JsonProperty("Year")
    public void setYear(Double year) {
        this.year = year;
    }

    @JsonProperty("Month")
    public Double getMonth() {
        return month;
    }

    @JsonProperty("Month")
    public void setMonth(Double month) {
        this.month = month;
    }

    @JsonProperty("Day")
    public Double getDay() {
        return day;
    }

    @JsonProperty("Day")
    public void setDay(Double day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("year", year).append("month", month).append("day", day).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(month).append(year).append(day).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Birthdate) == false) {
            return false;
        }
        Birthdate rhs = ((Birthdate) other);
        return new EqualsBuilder().append(month, rhs.month).append(year, rhs.year).append(day, rhs.day).isEquals();
    }

}
