package cse213.final_project.Jannat;

public class CorrectionRequest {
    private String requestID;
    private String nidNumber;
    private String correctionDetails;

    public CorrectionRequest() {
    }

    public CorrectionRequest(String requestID, String nidNumber, String correctionDetails) {
        this.requestID = requestID;
        this.nidNumber = nidNumber;
        this.correctionDetails = correctionDetails;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(String nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getCorrectionDetails() {
        return correctionDetails;
    }

    public void setCorrectionDetails(String correctionDetails) {
        this.correctionDetails = correctionDetails;
    }

    @Override
    public String toString() {
        return "CorrectionRequest{" +
                "requestID='" + requestID + '\'' +
                ", nidNumber='" + nidNumber + '\'' +
                ", correctionDetails='" + correctionDetails + '\'' +
                '}';
    }
}
