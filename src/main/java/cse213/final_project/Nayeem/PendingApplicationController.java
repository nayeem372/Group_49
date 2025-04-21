package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PendingApplicationController
{
    @javafx.fxml.FXML
    private TextArea pendingReasonField;
    @javafx.fxml.FXML
    private TextField applicationIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendReminderOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void escalateVerificationOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void markResolvedOnACtion(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnACtion(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent); {
        }
    }
}