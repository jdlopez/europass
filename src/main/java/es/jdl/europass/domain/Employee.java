package es.jdl.europass.domain;

/**
 *
 */
public class Employee {
    // external data
    private String employeeId;
    private String companyName;
    private String office;
    private String postion;
    private String corporateEmail;
    private String corporatePhone;
    // app data
    private Curriculum cv;

    public String getFullName() {
        // fill from CV?
        return null;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getCorporateEmail() {
        return corporateEmail;
    }

    public void setCorporateEmail(String corporateEmail) {
        this.corporateEmail = corporateEmail;
    }

    public String getCorporatePhone() {
        return corporatePhone;
    }

    public void setCorporatePhone(String corporatePhone) {
        this.corporatePhone = corporatePhone;
    }

    public Curriculum getCv() {
        return cv;
    }

    public void setCv(Curriculum cv) {
        this.cv = cv;
    }
}
