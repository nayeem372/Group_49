package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class VerificationWorkController
{
    @javafx.fxml.FXML
    private TextField verificationOfficerField;
    @javafx.fxml.FXML
    private TextArea verifiedTextArea;
    @javafx.fxml.FXML
    private TextField applicationIdField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markVerifiedOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void sendVerificationOnAction(ActionEvent actionEvent) {
    }
}