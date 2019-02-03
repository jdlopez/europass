package es.jdl.europass.domain;

import org.springframework.data.annotation.Id;

/**
 * Employee model. Only to CV consideration
 */
public class Employee extends JobApplicant {

    // external data
    @Id
    private String employeeId;
    private String companyName;
    private String office;
    private String postion;

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

}
