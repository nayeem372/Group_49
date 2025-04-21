package cse213.final_project.Nayeem;

public class Issue {
    private String description;
    private boolean resolved;

    public Issue(String description, boolean resolved) {
        this.description = description;
        this.resolved = resolved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "description='" + description + '\'' +
                ", resolved=" + resolved +
                '}';
    }

    public void markResolved() { this.resolved = true; }
}

