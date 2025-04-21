package cse213.final_project.Nayeem;

import javafx.application.Application;

public class Appeal {
    private String appealId;
    private String application;
    private String reason;
    private String status;

    public Appeal(String appealId, String application, String reason, String status) {
        this.appealId = appealId;
        this.application = application;
        this.reason = reason;
        this.status = status;
    }

    public String getAppealId() {
        return appealId;
    }

    public void setAppealId(String appealId) {
        this.appealId = appealId;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appeal{" +
                "appealId='" + appealId + '\'' +
                ", application='" + application + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public void approve() {

    }
    public void reject() {

    }
}


