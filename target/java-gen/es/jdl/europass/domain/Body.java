
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Opening",
    "MainBody",
    "Closing"
})
public class Body {

    @JsonProperty("Opening")
    private String opening;
    @JsonProperty("MainBody")
    private String mainBody;
    @JsonProperty("Closing")
    private String closing;

    @JsonProperty("Opening")
    public String getOpening() {
        return opening;
    }

    @JsonProperty("Opening")
    public void setOpening(String opening) {
        this.opening = opening;
    }

    @JsonProperty("MainBody")
    public String getMainBody() {
        return mainBody;
    }

    @JsonProperty("MainBody")
    public void setMainBody(String mainBody) {
        this.mainBody = mainBody;
    }

    @JsonProperty("Closing")
    public String getClosing() {
        return closing;
    }

    @JsonProperty("Closing")
    public void setClosing(String closing) {
        this.closing = closing;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("opening", opening).append("mainBody", mainBody).append("closing", closing).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(closing).append(mainBody).append(opening).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Body) == false) {
            return false;
        }
        Body rhs = ((Body) other);
        return new EqualsBuilder().append(closing, rhs.closing).append(mainBody, rhs.mainBody).append(opening, rhs.opening).isEquals();
    }

}
