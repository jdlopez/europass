
package es.jdlopez.europass.domain;

import es.jdlopez.europass.domain.extra.FlexibleDate;
import lombok.Data;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Project {

    /**
     * e.g. The World Wide Web
     * 
     */
    private String name;
    /**
     * Short summary of project. e.g. Collated works of 2017.
     * 
     */
    private String description;
    /**
     * Specify multiple features
     * 
     */
    private List<String> highlights = new ArrayList<String>();
    /**
     * Specify special elements involved
     * 
     */
    private List<String> keywords = new ArrayList<String>();
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
     * e.g. http://www.computer.org/csdl/mags/co/1996/10/rx069-abs.html
     * 
     */
    private URI url;
    /**
     * Specify your role on this project or in company
     * 
     */
    private List<String> roles = new ArrayList<String>();
    /**
     * Specify the relevant company/entity affiliations e.g. 'greenpeace', 'corporationXYZ'
     * 
     */
    private String entity;
    /**
     *  e.g. 'volunteering', 'presentation', 'talk', 'application', 'conference'
     * 
     */
    private String type;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
