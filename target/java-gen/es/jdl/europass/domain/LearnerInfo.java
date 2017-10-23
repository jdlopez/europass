
package es.jdl.europass.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identification",
    "Headline",
    "WorkExperience",
    "Education",
    "Skills",
    "Achievement",
    "ReferenceTo"
})
public class LearnerInfo {

    /**
     * Personal Information
     * <p>
     * Contains the personal information of the individual, which includes at least the name, and contact information, demographics and photo.
     * 
     */
    @JsonProperty("Identification")
    @JsonPropertyDescription("Contains the personal information of the individual, which includes at least the name, and contact information, demographics and photo.")
    private Identification identification;
    /**
     * desired employment/ occupation field
     * <p>
     * Contains a headline label for the current document. It is optional and may accommodate various cases.
     * 
     */
    @JsonProperty("Headline")
    @JsonPropertyDescription("Contains a headline label for the current document. It is optional and may accommodate various cases.")
    private Headline headline;
    /**
     * list of work experiences
     * <p>
     * Contains an list of work experiences. The order of those experiences is defined by the related printing preferences.
     * 
     */
    @JsonProperty("WorkExperience")
    @JsonPropertyDescription("Contains an list of work experiences. The order of those experiences is defined by the related printing preferences.")
    private List<Object> workExperience = new ArrayList<Object>();
    /**
     * list of education experiences
     * <p>
     * Contains an list of learning achievements or a training periods (formal or not). The order of those experiences is defined by the related printing preferences.
     * 
     */
    @JsonProperty("Education")
    @JsonPropertyDescription("Contains an list of learning achievements or a training periods (formal or not). The order of those experiences is defined by the related printing preferences.")
    private List<Object> education = new ArrayList<Object>();
    /**
     * Skills
     * <p>
     * Contains a sequence of skills and competences that the learner has acquired during any formal or informal experience.
     * 
     */
    @JsonProperty("Skills")
    @JsonPropertyDescription("Contains a sequence of skills and competences that the learner has acquired during any formal or informal experience.")
    private Skills skills;
    /**
     * Achievements
     * <p>
     * Contains a list of additional information about the various achievements of an individual, such as participation to conferences, workshops, memberships to organisations, list of publications, etc.
     * 
     */
    @JsonProperty("Achievement")
    @JsonPropertyDescription("Contains a list of additional information about the various achievements of an individual, such as participation to conferences, workshops, memberships to organisations, list of publications, etc.")
    private List<Object> achievement = new ArrayList<Object>();
    @JsonProperty("ReferenceTo")
    private List<ReferenceTo> referenceTo = new ArrayList<ReferenceTo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Personal Information
     * <p>
     * Contains the personal information of the individual, which includes at least the name, and contact information, demographics and photo.
     * 
     */
    @JsonProperty("Identification")
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Personal Information
     * <p>
     * Contains the personal information of the individual, which includes at least the name, and contact information, demographics and photo.
     * 
     */
    @JsonProperty("Identification")
    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    /**
     * desired employment/ occupation field
     * <p>
     * Contains a headline label for the current document. It is optional and may accommodate various cases.
     * 
     */
    @JsonProperty("Headline")
    public Headline getHeadline() {
        return headline;
    }

    /**
     * desired employment/ occupation field
     * <p>
     * Contains a headline label for the current document. It is optional and may accommodate various cases.
     * 
     */
    @JsonProperty("Headline")
    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    /**
     * list of work experiences
     * <p>
     * Contains an list of work experiences. The order of those experiences is defined by the related printing preferences.
     * 
     */
    @JsonProperty("WorkExperience")
    public List<Object> getWorkExperience() {
        return workExperience;
    }

    /**
     * list of work experiences
     * <p>
     * Contains an list of work experiences. The order of those experiences is defined by the related printing preferences.
     * 
     */
    @JsonProperty("WorkExperience")
    public void setWorkExperience(List<Object> workExperience) {
        this.workExperience = workExperience;
    }

    /**
     * list of education experiences
     * <p>
     * Contains an list of learning achievements or a training periods (formal or not). The order of those experiences is defined by the related printing preferences.
     * 
     */
    @JsonProperty("Education")
    public List<Object> getEducation() {
        return education;
    }

    /**
     * list of education experiences
     * <p>
     * Contains an list of learning achievements or a training periods (formal or not). The order of those experiences is defined by the related printing preferences.
     * 
     */
    @JsonProperty("Education")
    public void setEducation(List<Object> education) {
        this.education = education;
    }

    /**
     * Skills
     * <p>
     * Contains a sequence of skills and competences that the learner has acquired during any formal or informal experience.
     * 
     */
    @JsonProperty("Skills")
    public Skills getSkills() {
        return skills;
    }

    /**
     * Skills
     * <p>
     * Contains a sequence of skills and competences that the learner has acquired during any formal or informal experience.
     * 
     */
    @JsonProperty("Skills")
    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    /**
     * Achievements
     * <p>
     * Contains a list of additional information about the various achievements of an individual, such as participation to conferences, workshops, memberships to organisations, list of publications, etc.
     * 
     */
    @JsonProperty("Achievement")
    public List<Object> getAchievement() {
        return achievement;
    }

    /**
     * Achievements
     * <p>
     * Contains a list of additional information about the various achievements of an individual, such as participation to conferences, workshops, memberships to organisations, list of publications, etc.
     * 
     */
    @JsonProperty("Achievement")
    public void setAchievement(List<Object> achievement) {
        this.achievement = achievement;
    }

    @JsonProperty("ReferenceTo")
    public List<ReferenceTo> getReferenceTo() {
        return referenceTo;
    }

    @JsonProperty("ReferenceTo")
    public void setReferenceTo(List<ReferenceTo> referenceTo) {
        this.referenceTo = referenceTo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("identification", identification).append("headline", headline).append("workExperience", workExperience).append("education", education).append("skills", skills).append("achievement", achievement).append("referenceTo", referenceTo).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(skills).append(identification).append(education).append(achievement).append(workExperience).append(additionalProperties).append(headline).append(referenceTo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LearnerInfo) == false) {
            return false;
        }
        LearnerInfo rhs = ((LearnerInfo) other);
        return new EqualsBuilder().append(skills, rhs.skills).append(identification, rhs.identification).append(education, rhs.education).append(achievement, rhs.achievement).append(workExperience, rhs.workExperience).append(additionalProperties, rhs.additionalProperties).append(headline, rhs.headline).append(referenceTo, rhs.referenceTo).isEquals();
    }

}
