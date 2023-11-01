
package es.jdlopez.europass.domain;

import es.jdlopez.europass.domain.extra.FlexibleDate;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Award {

    /**
     * e.g. One of the 100 greatest minds of the century
     * 
     */
    private String title;
    /**
     * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
     * 
     */
    private FlexibleDate date;
    /**
     * e.g. Time Magazine
     * 
     */
    private String awarder;
    /**
     * e.g. Received for my work with Quantum Physics
     * 
     */
    private String summary;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
