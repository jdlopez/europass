
package es.jdlopez.europass.domain;

import com.fasterxml.jackson.annotation.JsonView;
import es.jdlopez.europass.domain.extra.JobApplication;
import es.jdlopez.europass.domain.json.SerializationViews;
import lombok.Data;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;


/**
 * Resume Schema
 */
@Data
public class Resume {

    /**
     * link to the version of the schema that can validate the resume
     * 
     */
    private URI $schema;
    private Basics basics;
    private List<Work> work = new ArrayList<Work>();
    private List<Volunteer> volunteer = new ArrayList<Volunteer>();
    private List<Education> education = new ArrayList<Education>();
    /**
     * Specify any awards you have received throughout your professional career
     * 
     */
    private List<Award> awards = new ArrayList<Award>();
    /**
     * Specify any certificates you have received throughout your professional career
     * 
     */
    private List<Certificate> certificates = new ArrayList<Certificate>();
    /**
     * Specify your publications through your career
     * 
     */
    private List<Publication> publications = new ArrayList<Publication>();
    /**
     * List out your professional skill-set
     * 
     */
    private List<Skill> skills = new ArrayList<Skill>();
    /**
     * List any other languages you speak
     * 
     */
    private List<Language> languages = new ArrayList<Language>();
    private List<Interest> interests = new ArrayList<Interest>();
    /**
     * List references you have received
     * 
     */
    private List<Reference> references = new ArrayList<Reference>();
    /**
     * Specify career projects
     * 
     */
    private List<Project> projects = new ArrayList<Project>();
    /**
     * The schema version and any other tooling configuration lives here
     * 
     */
    private Meta meta;
    //
    /** extra info about the job i want */
    @JsonView(SerializationViews.NoJsonResume.class)
    private JobApplication jobApplication;

}
