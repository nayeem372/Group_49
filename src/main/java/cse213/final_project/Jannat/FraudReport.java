package cse213.final_project.Jannat;

public class FraudReport {
    private String reportID;
    private String fraudType;
    private String summary;
    private String caseRef;

    public FraudReport() {
    }

    public FraudReport(String reportID, String fraudType, String summary, String caseRef) {
        this.reportID = reportID;
        this.fraudType = fraudType;
        this.summary = summary;
        this.caseRef = caseRef;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getFraudType() {
        return fraudType;
    }

    public void setFraudType(String fraudType) {
        this.fraudType = fraudType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCaseRef() {
        return caseRef;
    }

    public void setCaseRef(String caseRef) {
        this.caseRef = caseRef;
    }

    @Override
    public String toString() {
        return "FraudReport{" +
                "reportID='" + reportID + '\'' +
                ", fraudType='" + fraudType + '\'' +
                ", summary='" + summary + '\'' +
                ", caseRef='" + caseRef + '\'' +
                '}';
    }

    public void reportFraud() {}

}
