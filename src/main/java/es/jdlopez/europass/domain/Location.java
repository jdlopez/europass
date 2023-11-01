
package es.jdlopez.europass.domain;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Location {

    /**
     * To add multiple address lines, use 
     * . For example, 1234 Glücklichkeit Straße
     * Hinterhaus 5. Etage li.
     * 
     */
    private String address;
    private String postalCode;
    private String city;
    /**
     * code as per ISO-3166-1 ALPHA-2, e.g. US, AU, IN
     * 
     */
    private String countryCode;
    /**
     * The general region where you live. Can be a US state, or a province, for instance.
     * 
     */
    private String region;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
