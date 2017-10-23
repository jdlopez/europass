
package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Skills
 * <p>
 * Contains a sequence of skills and competences that the learner has acquired during any formal or informal experience.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Linguistic",
    "Communication",
    "Organisational",
    "JobRelated",
    "Computer",
    "Driving",
    "Other"
})
public class Skills {

    @JsonProperty("Linguistic")
    private Linguistic linguistic;
    @JsonProperty("Communication")
    private Object communication;
    @JsonProperty("Organisational")
    private Object organisational;
    @JsonProperty("JobRelated")
    private Object jobRelated;
    /**
     * Describes a person's computer skills, including self assesement and c ertifications if applicable
     * 
     */
    @JsonProperty("Computer")
    @JsonPropertyDescription("Describes a person's computer skills, including self assesement and c ertifications if applicable")
    private Computer computer;
    @JsonProperty("Driving")
    private Object driving;
    @JsonProperty("Other")
    private Object other;

    @JsonProperty("Linguistic")
    public Linguistic getLinguistic() {
        return linguistic;
    }

    @JsonProperty("Linguistic")
    public void setLinguistic(Linguistic linguistic) {
        this.linguistic = linguistic;
    }

    @JsonProperty("Communication")
    public Object getCommunication() {
        return communication;
    }

    @JsonProperty("Communication")
    public void setCommunication(Object communication) {
        this.communication = communication;
    }

    @JsonProperty("Organisational")
    public Object getOrganisational() {
        return organisational;
    }

    @JsonProperty("Organisational")
    public void setOrganisational(Object organisational) {
        this.organisational = organisational;
    }

    @JsonProperty("JobRelated")
    public Object getJobRelated() {
        return jobRelated;
    }

    @JsonProperty("JobRelated")
    public void setJobRelated(Object jobRelated) {
        this.jobRelated = jobRelated;
    }

    /**
     * Describes a person's computer skills, including self assesement and c ertifications if applicable
     * 
     */
    @JsonProperty("Computer")
    public Computer getComputer() {
        return computer;
    }

    /**
     * Describes a person's computer skills, including self assesement and c ertifications if applicable
     * 
     */
    @JsonProperty("Computer")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @JsonProperty("Driving")
    public Object getDriving() {
        return driving;
    }

    @JsonProperty("Driving")
    public void setDriving(Object driving) {
        this.driving = driving;
    }

    @JsonProperty("Other")
    public Object getOther() {
        return other;
    }

    @JsonProperty("Other")
    public void setOther(Object other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("linguistic", linguistic).append("communication", communication).append("organisational", organisational).append("jobRelated", jobRelated).append("computer", computer).append("driving", driving).append("other", other).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linguistic).append(driving).append(computer).append(other).append(organisational).append(communication).append(jobRelated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Skills) == false) {
            return false;
        }
        Skills rhs = ((Skills) other);
        return new EqualsBuilder().append(linguistic, rhs.linguistic).append(driving, rhs.driving).append(computer, rhs.computer).append(other, rhs.other).append(organisational, rhs.organisational).append(communication, rhs.communication).append(jobRelated, rhs.jobRelated).isEquals();
    }

}
