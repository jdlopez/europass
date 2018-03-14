package es.jdl.europass.domain;

public class JobSystemUser {

    private Employee employee;
    private Candidate candidate;

    public boolean isInternal() {
        return  (employee != null);
    }

    public String getDisplayName() {
        if (isInternal())
            return employee.getFullName();
        else
            return candidate.getFullName();
    }

    public JobApplicant getJobApplicant() {
        if (isInternal())
            return employee;
        else
            return candidate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
}
