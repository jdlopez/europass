package es.jdl.europass.domain;

/**
 *
 */
public class Employee {

    private Curriculum cv;
    private String employeeId;
    private String companyName;
    private String office;
    private String postion;
    private String corporateEmail;
    private String corporatePhone;

    public Curriculum getCv() {
        return cv;
    }

    public void setCv(Curriculum cv) {
        this.cv = cv;
    }
}
