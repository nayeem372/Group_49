package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VerificationCrossCheckController
{
    @javafx.fxml.FXML
    private Label applicantDOBLabel;
    @javafx.fxml.FXML
    private ComboBox<String> applicationComboBox;
    @javafx.fxml.FXML
    private ComboBox<String>  approvalComboBox;
    @javafx.fxml.FXML
    private Label applicantNameLabel;
    @javafx.fxml.FXML
    private Label applicantAddressLabel;
    @javafx.fxml.FXML
    private Label docStatusLabel;
    @javafx.fxml.FXML
    private TextField notesTextField;
    @javafx.fxml.FXML
    private TextField reUploadFeedbackTextField;

    @javafx.fxml.FXML
    public void initialize() {
        applicationComboBox.getItems().addAll("Application 1", "Application 2", "Application 3");
        approvalComboBox.getItems().addAll("Approved", "Flagged for Review", "Rejected");
    }

    @javafx.fxml.FXML
    public void submitVerificationStatus(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void requestDocumentsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyDataAgainstDatabaseButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewApplicationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void revalidateInformationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifyApplicantButtonOnAction(ActionEvent actionEvent) {
    }
}