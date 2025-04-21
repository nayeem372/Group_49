package cse213.final_project.Nayeem;

public class FlaggedCase {
    private String ApplicantId;
    private String flaggedReason;

    public FlaggedCase(String applicantId, String flaggedReason) {
        ApplicantId = applicantId;
        this.flaggedReason = flaggedReason;
    }

    public String getApplicantId() {
        return ApplicantId;
    }

    public void setApplicantId(String applicantId) {
        ApplicantId = applicantId;
    }

    public String getFlaggedReason() {
        return flaggedReason;
    }

    public void setFlaggedReason(String flaggedReason) {
        this.flaggedReason = flaggedReason;
    }

    @Override
    public String toString() {
        return "FlaggedCase{" +
                "ApplicantId='" + ApplicantId + '\'' +
                ", flaggedReason='" + flaggedReason + '\'' +
                '}';
    }
    public void FlaggedCase(){

    }
}
