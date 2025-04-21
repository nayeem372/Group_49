package cse213.final_project.Nayeem;

import java.time.LocalDate;

public class Approvlog {
    private String approvalLogId;
    private String Status;
    LocalDate time ;

    public Approvlog(String approvalLogId, String status, LocalDate time) {
        this.approvalLogId = approvalLogId;
        Status = status;
        this.time = time;
    }

    public String getApprovalLogId() {
        return approvalLogId;
    }

    public void setApprovalLogId(String approvalLogId) {
        this.approvalLogId = approvalLogId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Approvlog{" +
                "approvalLogId='" + approvalLogId + '\'' +
                ", Status='" + Status + '\'' +
                ", time=" + time +
                '}';
    }
}
