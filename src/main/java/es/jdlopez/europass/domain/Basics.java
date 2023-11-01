
package es.jdlopez.europass.domain;

import com.fasterxml.jackson.annotation.JsonView;
import es.jdlopez.europass.domain.json.SerializationViews;
import lombok.Data;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Basics {

    private String name;
    /**
     * e.g. Web Developer
     * 
     */
    private String label;
    /**
     * URL (as per RFC 3986) to a image in JPEG or PNG format
     * 
     */
    private URL image;
    /**
     * e.g. thomas@gmail.com
     * 
     */
    private String email;
    /**
     * Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923
     * 
     */
    private String phone;
    /**
     * URL (as per RFC 3986) to your website, e.g. personal homepage
     * 
     */
    private URI url;
    /**
     * Write a short 2-3 sentence biography about yourself
     * 
     */
    private String summary;
    private Location location;
    /**
     * Specify any number of social networks that you participate in
     * 
     */
    private List<ProfileSocialMedia> profiles = new ArrayList<ProfileSocialMedia>();
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonView(SerializationViews.NoJsonResume.class)
    private String surname;

}
