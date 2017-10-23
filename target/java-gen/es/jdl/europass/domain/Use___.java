
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
    "Code"
})
public class Use___ {

    @JsonProperty("Code")
    private Use___.Code code;

    @JsonProperty("Code")
    public Use___.Code getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(Use___.Code code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Use___) == false) {
            return false;
        }
        Use___ rhs = ((Use___) other);
        return new EqualsBuilder().append(code, rhs.code).isEquals();
    }

    public enum Code {

        BUSINESS("business");
        private final String value;
        private final static Map<String, Use___.Code> CONSTANTS = new HashMap<String, Use___.Code>();

        static {
            for (Use___.Code c: values()) {
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
        public static Use___.Code fromValue(String value) {
            Use___.Code constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
