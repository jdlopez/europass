
package es.jdl.europass.generated.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * metadata information about this document
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DocumentType",
    "Document",
    "CreationDate",
    "LastUpdateDate",
    "XSDVersion",
    "Generator",
    "Comment",
    "EuropassLogo"
})
public class DocumentInfo {

    @JsonProperty("DocumentType")
    private DocumentInfo.DocumentType documentType;
    @JsonProperty("Document")
    private List<DocumentInfo.DocumentType> document = new ArrayList<DocumentInfo.DocumentType>();
    @JsonProperty("CreationDate")
    private String creationDate;
    @JsonProperty("LastUpdateDate")
    private String lastUpdateDate;
    @JsonProperty("XSDVersion")
    private String xSDVersion;
    @JsonProperty("Generator")
    private String generator;
    @JsonProperty("Comment")
    private String comment;
    @JsonProperty("EuropassLogo")
    private Boolean europassLogo;

    @JsonProperty("DocumentType")
    public DocumentInfo.DocumentType getDocumentType() {
        return documentType;
    }

    @JsonProperty("DocumentType")
    public void setDocumentType(DocumentInfo.DocumentType documentType) {
        this.documentType = documentType;
    }

    @JsonProperty("Document")
    public List<DocumentInfo.DocumentType> getDocument() {
        return document;
    }

    @JsonProperty("Document")
    public void setDocument(List<DocumentInfo.DocumentType> document) {
        this.document = document;
    }

    @JsonProperty("CreationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("CreationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("LastUpdateDate")
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    @JsonProperty("LastUpdateDate")
    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @JsonProperty("XSDVersion")
    public String getXSDVersion() {
        return xSDVersion;
    }

    @JsonProperty("XSDVersion")
    public void setXSDVersion(String xSDVersion) {
        this.xSDVersion = xSDVersion;
    }

    @JsonProperty("Generator")
    public String getGenerator() {
        return generator;
    }

    @JsonProperty("Generator")
    public void setGenerator(String generator) {
        this.generator = generator;
    }

    @JsonProperty("Comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("Comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("EuropassLogo")
    public Boolean getEuropassLogo() {
        return europassLogo;
    }

    @JsonProperty("EuropassLogo")
    public void setEuropassLogo(Boolean europassLogo) {
        this.europassLogo = europassLogo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("documentType", documentType).append("document", document).append("creationDate", creationDate).append("lastUpdateDate", lastUpdateDate).append("xSDVersion", xSDVersion).append("generator", generator).append("comment", comment).append("europassLogo", europassLogo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(documentType).append(xSDVersion).append(lastUpdateDate).append(document).append(generator).append(comment).append(europassLogo).append(creationDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentInfo) == false) {
            return false;
        }
        DocumentInfo rhs = ((DocumentInfo) other);
        return new EqualsBuilder().append(documentType, rhs.documentType).append(xSDVersion, rhs.xSDVersion).append(lastUpdateDate, rhs.lastUpdateDate).append(document, rhs.document).append(generator, rhs.generator).append(comment, rhs.comment).append(europassLogo, rhs.europassLogo).append(creationDate, rhs.creationDate).isEquals();
    }

    public enum DocumentType {

        ECV_ESP("ECV_ESP"),
        ESP("ESP"),
        ECV("ECV"),
        ELP("ELP"),
        ECL("ECL"),
        EX("EX");
        private final String value;
        private final static Map<String, DocumentInfo.DocumentType> CONSTANTS = new HashMap<String, DocumentInfo.DocumentType>();

        static {
            for (DocumentInfo.DocumentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DocumentType(String value) {
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
        public static DocumentInfo.DocumentType fromValue(String value) {
            DocumentInfo.DocumentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
