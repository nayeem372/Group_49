package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ApplicantDataVerificationController
{
    @javafx.fxml.FXML
    private CheckBox dataVerifiedCheckBox;
    @javafx.fxml.FXML
    private TextField applicationIdField;
    @javafx.fxml.FXML
    private TextArea fOFTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmVerified(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void flagForCorrection(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportONAction(ActionEvent actionEvent) {
    }
}