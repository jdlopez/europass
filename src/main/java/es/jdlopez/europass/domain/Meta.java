
package es.jdlopez.europass.domain;

import lombok.Data;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * The schema version and any other tooling configuration lives here
 * 
 */
@Data
public class Meta {

    /**
     * URL (as per RFC 3986) to latest version of this document
     * 
     */
    private URI canonical;
    /**
     * A version field which follows semver - e.g. v1.0.0
     * 
     */
    private String version;
    /**
     * Using ISO 8601 with YYYY-MM-DDThh:mm:ss
     * 
     */
    private LocalDateTime lastModified;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
