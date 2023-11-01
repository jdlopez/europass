
package es.jdlopez.europass.domain;

import com.fasterxml.jackson.annotation.JsonView;
import es.jdlopez.europass.domain.json.SerializationViews;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class Language {

    /**
     * e.g. English, Spanish
     * 
     */
    private String language;
    /**
     * language level enumeration
     */
    private String fluency;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    // Language expressed as a [ISO 639-1 code](https://en.wikipedia.org/wiki/ISO_639-1)",
    @JsonView(SerializationViews.NoJsonResume.class)
    private String iso;

}
