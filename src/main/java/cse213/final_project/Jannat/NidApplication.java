package cse213.final_project.Jannat;

import java.time.LocalDate;

public class NidApplication {
    private String applicationNumber;
    private String status;
    private LocalDate submissionDate;

    public NidApplication() {
    }

    public NidApplication(String applicationNumber, String status, LocalDate submissionDate) {
        this.applicationNumber = applicationNumber;
        this.status = status;
        this.submissionDate = submissionDate;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "NidApplication{" +
                "applicationNumber='" + applicationNumber + '\'' +
                ", status='" + status + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }

    
}
