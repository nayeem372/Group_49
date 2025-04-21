package cse213.final_project.sadika;

import java.time.LocalDate;

public class serviceRequest {
    private String requestId, type,status;
    private LocalDate date;

    public serviceRequest(String requestId, String type, String status, LocalDate date) {
        this.requestId = requestId;
        this.type = type;
        this.status = status;
        this.date = date;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "serviceRequest{" +
                "requestId='" + requestId + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
