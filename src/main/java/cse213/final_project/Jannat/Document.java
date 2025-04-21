package cse213.final_project.Jannat;

public class Document {
    private String documentID;
    private String type;
    private String filePath;

    public Document() {
    }

    public Document(String documentID, String type, String filePath) {
        this.documentID = documentID;
        this.type = type;
        this.filePath = filePath;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentID='" + documentID + '\'' +
                ", type='" + type + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }

    public boolean isValid() {
        return true;
    }
}
