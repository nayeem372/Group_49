package cse213.final_project.Nayeem;

public class ValidationResult {
    private boolean isSuccessful;
    private String message;
    private String errorField;

    public ValidationResult(String errorField, boolean isSuccessful, String message) {
        this.errorField = errorField;
        this.isSuccessful = isSuccessful;
        this.message = message;
    }

    public String getErrorField() {
        return errorField;
    }

    public void setErrorField(String errorField) {
        this.errorField = errorField;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "errorField='" + errorField + '\'' +
                ", isSuccessful=" + isSuccessful +
                ", message='" + message + '\'' +
                '}';
    }
}
