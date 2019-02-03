package es.jdl.europass.domain;

import com.fasterxml.jackson.annotation.JsonView;
import es.jdl.europass.generated.domain.Skill;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class Position {
    @JsonView(Views.Public.class)
    private String id;
    @JsonView(Views.Public.class)
    @NotNull
    private String name;
    @JsonView(Views.Public.class)
    @NotNull
    private String description;
    @JsonView(Views.Public.class)
    private String offering;
    @JsonView(Views.Public.class)
    private String locationCountry;
    @JsonView(Views.Public.class)
    private String locationCity;
    @JsonView(Views.Public.class)
    private List<Skill> skills;
    @JsonView(Views.Public.class)
    private Date creationDate;
    private Date endDate;
    private Date lastModification;
    private EnumStatus status;
    private boolean openToPublic;
    private String createdBy;
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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public boolean isOpenToPublic() {
        return openToPublic;
    }

    public void setOpenToPublic(boolean openToPublic) {
        this.openToPublic = openToPublic;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }
}
