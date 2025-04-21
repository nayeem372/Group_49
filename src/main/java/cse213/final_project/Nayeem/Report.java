package cse213.final_project.Nayeem;

import java.time.LocalDate;

public class Report {
    private String reportId;
    private String application;
    private String reportType;
    private LocalDate generatedDate;

    public Report(String application, LocalDate generatedDate, String reportId, String reportType) {
        this.application = application;
        this.generatedDate = generatedDate;
        this.reportId = reportId;
        this.reportType = reportType;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "Report{" +
                "application='" + application + '\'' +
                ", reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", generatedDate=" + generatedDate +
                '}';
    }
    public Report(String reportId, String application, String reportType, LocalDate generatedDate) {
        this.reportId = reportId;
        this.application = application;
        this.reportType = reportType;
        this.generatedDate = generatedDate;
    }
}
