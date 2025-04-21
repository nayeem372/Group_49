package cse213.final_project.Jannat;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class VerificationController
{
    @javafx.fxml.FXML
    private ComboBox<String> applicationComboBox;
    @javafx.fxml.FXML
    private Label applicantDOBLabel;
    @javafx.fxml.FXML
    private ComboBox<String> approvalComboBox;
    @javafx.fxml.FXML
    private Label applicantNameLabel;
    @javafx.fxml.FXML
    private Label applicantAddressLabel;
    @javafx.fxml.FXML
    private Label verificationResultLabel;
    @javafx.fxml.FXML
    private Label applicantNameTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField verificationResultTextField;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        approvalComboBox.getItems().addAll("Approved", "Flagged for Review", "Rejected");
    }


    @javafx.fxml.FXML
    public void verifyDataButtonOnAction(ActionEvent actionEvent) {
        String applicantName = applicantNameTextField.getText();
        String applicantAddress = addressTextField.getText();
        String applicantDOB = dobDatePicker.getValue() != null ? dobDatePicker.getValue().toString() : "";

        if (applicantName.equals("John Doe") && applicantDOB.equals("1990-01-01") && applicantAddress.equals("123 Main St.")) {
            verificationResultTextField.setText("Data matches official records.");
        } else {
            verificationResultTextField.setText("Discrepancies found.");
        }
    }

    @javafx.fxml.FXML
    public void submitVerificationStatusButtonOnAction(ActionEvent actionEvent) {
        String approvalStatus = approvalComboBox.getValue();
        if (approvalStatus != null) {
            verificationResultLabel.setText("Verification Status: " + approvalStatus);
        }
    }
}