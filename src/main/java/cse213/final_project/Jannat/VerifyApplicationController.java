package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class VerifyApplicationController
{
    @javafx.fxml.FXML
    private ComboBox<String> applicationComboBox;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label applicantDOBLabel;
    @javafx.fxml.FXML
    private Label applicantNameLabel;
    @javafx.fxml.FXML
    private Label applicantAddressLabel;
    @javafx.fxml.FXML
    private CheckBox birthCertificateCheckBox;
    @javafx.fxml.FXML
    private CheckBox proofOfAddressCheckBox;
    @javafx.fxml.FXML
    private TextField applicantNameTextField;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private TextField addressTextField;

    @javafx.fxml.FXML
    public void initialize() {
        applicationComboBox.getItems().addAll("Application 1", "Application 2", "Application 3");

    }


    @javafx.fxml.FXML
    public void submitReviewButtonOnAction(ActionEvent actionEvent) {
        String applicationStatus = statusLabel.getText();
        statusLabel.setText("Review submitted. Application Status: " + applicationStatus);
    }



    @javafx.fxml.FXML
    public void markApplicationCompleteButtonOnAction(ActionEvent actionEvent) {
        String applicantName = applicantNameTextField.getText();
        String applicantAddress = addressTextField.getText();
        String applicantDOB = dobDatePicker.getValue() != null ? dobDatePicker.getValue().toString() : "";

        // Check if any required field is empty
        if (applicantName.isEmpty() || applicantAddress.isEmpty() || applicantDOB.isEmpty()) {
            statusLabel.setText("Application is incomplete. Missing information.");
        } else {
            statusLabel.setText("Application is complete.");
        }

    }




    @javafx.fxml.FXML
    public void checkDocumentsButtonOnAction(ActionEvent actionEvent) {
        boolean isBirthCertificateUploaded = birthCertificateCheckBox.isSelected();
        boolean isProofOfAddressUploaded = proofOfAddressCheckBox.isSelected();

        if (!isBirthCertificateUploaded || !isProofOfAddressUploaded) {
            statusLabel.setText("Documents are missing. Please request the missing documents.");
        } else {
            statusLabel.setText("All required documents are uploaded.");
        }
    }
}