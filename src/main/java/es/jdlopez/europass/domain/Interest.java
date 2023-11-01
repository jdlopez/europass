
package es.jdlopez.europass.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Interest {

    /**
     * e.g. Philosophy
     * 
     */
    private String name;
    private List<String> keywords = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
