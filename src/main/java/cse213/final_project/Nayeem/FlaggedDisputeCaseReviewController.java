package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FlaggedDisputeCaseReviewController
{
    @javafx.fxml.FXML
    private TextArea flaggedReasonField;
    @javafx.fxml.FXML
    private TextField applicationIdField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField caseIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void forwardCaseOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveFlaggedCaseOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestDocsOnAction(ActionEvent actionEvent) {
    }
}