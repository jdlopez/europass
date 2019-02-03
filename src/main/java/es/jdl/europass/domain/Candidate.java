package es.jdl.europass.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Candidate model
 */
public class Candidate extends JobApplicant {

    @Id
    private String id;
    private EnumSource source;
    private Date creationDate;
    private String user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnumSource getSource() {
        return source;
    }

    public void setSource(EnumSource source) {
        this.source = source;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
