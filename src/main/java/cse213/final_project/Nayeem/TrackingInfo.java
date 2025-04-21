package cse213.final_project.Nayeem;

import java.time.LocalDate;

public class TrackingInfo {
    private String trackingNumber;
    private String applicationId;
    private LocalDate generatedDate;

    public TrackingInfo(String applicationId, LocalDate generatedDate, String trackingNumber) {
        this.applicationId = applicationId;
        this.generatedDate = generatedDate;
        this.trackingNumber = trackingNumber;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String toString() {
        return "TrackingInfo{" +
                "applicationId='" + applicationId + '\'' +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", generatedDate=" + generatedDate +
                '}';
    }
    public TrackingInfo(String trackingNumber, String applicationId, LocalDate generatedDate) {
        this.trackingNumber = trackingNumber;
        this.applicationId = applicationId;
        this.generatedDate = generatedDate;
    }
}
