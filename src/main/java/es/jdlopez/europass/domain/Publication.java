
package es.jdlopez.europass.domain;

import es.jdlopez.europass.domain.extra.FlexibleDate;
import lombok.Data;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Publication {

    /**
     * e.g. The World Wide Web
     * 
     */
    private String name;
    /**
     * e.g. IEEE, Computer Magazine
     * 
     */
    private String publisher;
    /**
     * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
     * 
     */
    private FlexibleDate releaseDate;
    /**
     * e.g. http://www.computer.org.example.com/csdl/mags/co/1996/10/rx069-abs.html
     * 
     */
    private URI url;
    /**
     * Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML.
     * 
     */
    private String summary;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
