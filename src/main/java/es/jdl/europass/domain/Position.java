package es.jdl.europass.domain;

import es.jdl.europass.generated.ComputerSkillType;

import java.util.Date;
import java.util.List;

public class Position {
    private String id;
    private String name;
    private String description;
    private String offering;
    private List<ComputerSkillType> skills;
    private Date creationDate;
    private boolean open; // status?-> enum?
    private Date endDate;
    private List<JobApplication> applications;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOffering() {
        return offering;
    }

    public void setOffering(String offering) {
        this.offering = offering;
    }

    public List<ComputerSkillType> getSkills() {
        return skills;
    }

    public void setSkills(List<ComputerSkillType> skills) {
        this.skills = skills;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<JobApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<JobApplication> applications) {
        this.applications = applications;
    }
}
