package cse213.final_project.sadika;

import java.time.LocalDate;

public class systemError {
    private String errorId,description;
    private boolean resolve;
    private LocalDate date;

    public systemError(String errorId, String description, boolean resolve, LocalDate date) {
        this.errorId = errorId;
        this.description = description;
        this.resolve = resolve;
        this.date = date;
    }

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResolve() {
        return resolve;
    }

    public void setResolve(boolean resolve) {
        this.resolve = resolve;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "systemError{" +
                "errorId='" + errorId + '\'' +
                ", description='" + description + '\'' +
                ", resolve=" + resolve +
                ", date=" + date +
                '}';
    }
}
