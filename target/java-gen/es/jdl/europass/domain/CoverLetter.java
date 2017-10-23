
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Addressee",
    "Letter",
    "Documentation"
})
public class CoverLetter {

    @JsonProperty("Addressee")
    private Addressee addressee;
    @JsonProperty("Letter")
    private Letter letter;
    @JsonProperty("Documentation")
    private Documentation documentation;

    @JsonProperty("Addressee")
    public Addressee getAddressee() {
        return addressee;
    }

    @JsonProperty("Addressee")
    public void setAddressee(Addressee addressee) {
        this.addressee = addressee;
    }

    @JsonProperty("Letter")
    public Letter getLetter() {
        return letter;
    }

    @JsonProperty("Letter")
    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    @JsonProperty("Documentation")
    public Documentation getDocumentation() {
        return documentation;
    }

    @JsonProperty("Documentation")
    public void setDocumentation(Documentation documentation) {
        this.documentation = documentation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("addressee", addressee).append("letter", letter).append("documentation", documentation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(addressee).append(letter).append(documentation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoverLetter) == false) {
            return false;
        }
        CoverLetter rhs = ((CoverLetter) other);
        return new EqualsBuilder().append(addressee, rhs.addressee).append(letter, rhs.letter).append(documentation, rhs.documentation).isEquals();
    }

}
