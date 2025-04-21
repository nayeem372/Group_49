package cse213.final_project.Jannat;

import java.time.LocalDate;

public class Verification {
    private String verificationId;
    private String officerId;
    private String applicationId;
    private LocalDate verificationDate;
    private String status;
    private String remarks;

    public Verification() {

    }

    public Verification(String verificationId, String officerId, String applicationId, LocalDate verificationDate, String status, String remarks) {
        this.verificationId = verificationId;
        this.officerId = officerId;
        this.applicationId = applicationId;
        this.verificationDate = verificationDate;
        this.status = status;
        this.remarks = remarks;
    }

    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public LocalDate getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(LocalDate verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Verification{" +
                "verificationId='" + verificationId + '\'' +
                ", officerId='" + officerId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", verificationDate=" + verificationDate +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
