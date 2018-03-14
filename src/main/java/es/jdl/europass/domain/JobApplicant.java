package es.jdl.europass.domain;

/**
 *
 * @author jdlopez
 */
public abstract class JobApplicant {
    // check polymorphism in mongo
    protected Curriculum cv;
    protected String firstName;
    protected String lastName;

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null)
            sb.append(firstName);
        if (lastName != null) {
            if (sb.length() > 0)
                sb.append(" ");
            sb.append(lastName);
        }
        return sb.toString();
    }

    public Curriculum getCv() {
        return cv;
    }

    public void setCv(Curriculum cv) {
        this.cv = cv;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
