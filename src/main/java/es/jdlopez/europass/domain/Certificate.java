
package es.jdlopez.europass.domain;

import es.jdlopez.europass.domain.extra.FlexibleDate;
import lombok.Data;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Certificate {

    /**
     * e.g. Certified Kubernetes Administrator
     * 
     */
    private String name;
    /**
     * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
     * 
     */
    private FlexibleDate date;
    /**
     * e.g. http://example.com
     * 
     */
    private URI url;
    /**
     * e.g. CNCF
     * 
     */
    private String issuer;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
