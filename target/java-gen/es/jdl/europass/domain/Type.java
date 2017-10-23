
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
public class Type {

    @JsonProperty("Code")
    private Type.Code code;
    @JsonProperty("Label")
    private String label;

    @JsonProperty("Code")
    public Type.Code getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(Type.Code code) {
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
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return new EqualsBuilder().append(code, rhs.code).append(label, rhs.label).isEquals();
    }

    public enum Code {

        PREFERRED_JOB("preferred_job"),
        JOB_APPLIED_FOR("job_applied_for"),
        STUDIES_APPLIED_FOR("studies_applied_for"),
        POSITION("position"),
        PERSONAL_STATEMENT("personal_statement");
        private final String value;
        private final static Map<String, Type.Code> CONSTANTS = new HashMap<String, Type.Code>();

        static {
            for (Type.Code c: values()) {
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
        public static Type.Code fromValue(String value) {
            Type.Code constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
