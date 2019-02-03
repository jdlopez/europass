package es.jdl.europass.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class SkillType {
    private String id;
    private String name;
    @DBRef
    private SkillType parent;

    /** Includes parent name */
    public String getFullName() {
        return (parent!=null?parent.getName()+"- ":"") + name;
    }

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

    public SkillType getParent() {
        return parent;
    }

    public void setParent(SkillType parent) {
        this.parent = parent;
    }
}
