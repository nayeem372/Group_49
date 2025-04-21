package cse213.final_project.Nayeem;

public class Verification {
    private boolean status;
    private String details;

    public Verification(boolean status, String details) {
        this.status = status;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Verification{" +
                "details='" + details + '\'' +
                ", status=" + status +
                '}';
    }
}
