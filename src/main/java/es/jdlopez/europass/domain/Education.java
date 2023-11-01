
package es.jdlopez.europass.domain;

import es.jdlopez.europass.domain.extra.FlexibleDate;
import lombok.Data;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Education {

    /**
     * e.g. Massachusetts Institute of Technology
     * 
     */
    private String institution;
    /**
     * e.g. http://facebook.example.com
     * 
     */
    private URI url;
    /**
     * e.g. Arts
     * 
     */
    private String area;
    /**
     * e.g. Bachelor
     * 
     */
    private String studyType;
    /**
     * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
     * 
     */
    private FlexibleDate startDate;
    /**
     * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
     * 
     */
    private FlexibleDate endDate;
    /**
     * grade point average, e.g. 3.67/4.0
     * 
     */
    private String score;
    /**
     * List notable courses/subjects
     * 
     */
    private List<String> courses = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * e.g. Massachusetts Institute of Technology
     * 
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * e.g. Massachusetts Institute of Technology
     * 
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }

}
