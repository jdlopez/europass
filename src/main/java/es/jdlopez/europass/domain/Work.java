
package es.jdlopez.europass.domain;

import com.fasterxml.jackson.annotation.JsonView;
import es.jdlopez.europass.domain.json.SerializationViews;
import lombok.Data;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Work {

    /**
     * e.g. Facebook
     * 
     */
    private String name;
    /**
     * e.g. Menlo Park, CA
     * 
     */
    private String location;
    /**
     * e.g. Social Media Company
     * 
     */
    private String description;
    /**
     * e.g. Software Engineer
     * 
     */
    private String position;
    /**
     * e.g. http://facebook.example.com
     * 
     */
    private URI url;
    /**
     * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
     * 
     */
    private String startDate;
    /**
     * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
     * 
     */
    private String endDate;
    /**
     * Give an overview of your responsibilities at the company
     * 
     */
    private String summary;
    /**
     * Specify multiple accomplishments
     * 
     */
    private List<String> highlights = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    //
    @JsonView(SerializationViews.NoJsonResume.class)
    private Boolean relevant; // to add in fist page?
    @JsonView(SerializationViews.NoJsonResume.class)
    private List<Project> projects; // related to work added to resume automatically?

}
