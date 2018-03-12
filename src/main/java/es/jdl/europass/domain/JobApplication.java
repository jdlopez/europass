package es.jdl.europass.domain;

import java.util.Date;

public class JobApplication {
    private String id;
    private Position position;
    private Employee innerApplicant;
    private Candidate candidate;
    private String interview;
    private String techAssessment;
    private Date submitDate;
    private Boolean active;
    private String aplicantComments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Employee getInnerApplicant() {
        return innerApplicant;
    }

    public void setInnerApplicant(Employee innerApplicant) {
        this.innerApplicant = innerApplicant;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview;
    }

    public String getTechAssessment() {
        return techAssessment;
    }

    public void setTechAssessment(String techAssessment) {
        this.techAssessment = techAssessment;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setAplicantComments(String aplicantComments) {
        this.aplicantComments = aplicantComments;
    }

    public String getAplicantComments() {
        return aplicantComments;
    }
}
