package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ApprovalFinalCheckController
{
    @javafx.fxml.FXML
    private TextField verificationStatusField;
    @javafx.fxml.FXML
    private CheckBox flaggedIssuesCheckBox;
    @javafx.fxml.FXML
    private TextField applicantNameField;
    @javafx.fxml.FXML
    private TextField applicationIdField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateSummaryOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveActionOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent); {
        }
    }
}