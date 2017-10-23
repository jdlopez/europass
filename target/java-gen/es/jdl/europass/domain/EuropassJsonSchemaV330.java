
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * A JSON Representation of a Europass Document corresponding to Europass XML 3.3.0
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SkillsPassport"
})
public class EuropassJsonSchemaV330 {

    /**
     * Defines a sequence of elements that fully describe a Europass XML document.
     * 
     */
    @JsonProperty("SkillsPassport")
    @JsonPropertyDescription("Defines a sequence of elements that fully describe a Europass XML document.")
    private SkillsPassport skillsPassport;

    /**
     * Defines a sequence of elements that fully describe a Europass XML document.
     * 
     */
    @JsonProperty("SkillsPassport")
    public SkillsPassport getSkillsPassport() {
        return skillsPassport;
    }

    /**
     * Defines a sequence of elements that fully describe a Europass XML document.
     * 
     */
    @JsonProperty("SkillsPassport")
    public void setSkillsPassport(SkillsPassport skillsPassport) {
        this.skillsPassport = skillsPassport;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("skillsPassport", skillsPassport).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(skillsPassport).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuropassJsonSchemaV330) == false) {
            return false;
        }
        EuropassJsonSchemaV330 rhs = ((EuropassJsonSchemaV330) other);
        return new EqualsBuilder().append(skillsPassport, rhs.skillsPassport).isEquals();
    }

}
