
package es.jdlopez.europass.domain;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Reference {

    /**
     * e.g. Timothy Cook
     * 
     */
    private String name;
    /**
     * e.g. Joe blogs was a great employee, who turned up to work at least once a week. He exceeded my expectations when it came to doing nothing.
     * 
     */
    private String reference;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
