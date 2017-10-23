
package es.jdl.europass.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "Label"
})
public class Use_ {

    @JsonProperty("Code")
    private Use_.Code code;
    @JsonProperty("Label")
    private String label;

    @JsonProperty("Code")
    public Use_.Code getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(Use_.Code code) {
        this.code = code;
    }

    @JsonProperty("Label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("Label")
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("label", label).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(label).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Use_) == false) {
            return false;
        }
        Use_ rhs = ((Use_) other);
        return new EqualsBuilder().append(code, rhs.code).append(label, rhs.label).isEquals();
    }

    public enum Code {

        PERSONAL("personal"),
        BUSINESS("business"),
        BLOG("blog"),
        PORTFOLIO("portfolio");
        private final String value;
        private final static Map<String, Use_.Code> CONSTANTS = new HashMap<String, Use_.Code>();

        static {
            for (Use_.Code c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Code(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Use_.Code fromValue(String value) {
            Use_.Code constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
