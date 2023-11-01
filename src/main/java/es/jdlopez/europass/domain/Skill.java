
package es.jdlopez.europass.domain;

import com.fasterxml.jackson.annotation.JsonView;
import es.jdlopez.europass.domain.json.SerializationViews;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Skill {

    /**
     * e.g. Web Development
     * 
     */
    private String name;
    /**
     * e.g. Master
     * 
     */
    private String level;
    /**
     * List some keywords pertaining to this skill
     * 
     */
    private List<String> keywords = new ArrayList<String>();
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    /** some kind of classification like: tool technology practice hardware domain */
    @JsonView(SerializationViews.NoJsonResume.class)
    private String type;
}
