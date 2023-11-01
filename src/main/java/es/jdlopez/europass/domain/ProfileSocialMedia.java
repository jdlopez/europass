
package es.jdlopez.europass.domain;

import lombok.Data;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class ProfileSocialMedia {

    /**
     * e.g. Facebook or Twitter
     * 
     */
    private String network;
    /**
     * e.g. neutralthoughts
     * 
     */
    private String username;
    /**
     * e.g. http://twitter.example.com/neutralthoughts
     * 
     */
    private URI url;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
