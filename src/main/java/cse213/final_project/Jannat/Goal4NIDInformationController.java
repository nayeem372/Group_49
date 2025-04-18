package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Goal4NIDInformationController
{
    @javafx.fxml.FXML
    private TextField unidTextField;
    @javafx.fxml.FXML
    private Label verifiedDOB;
    @javafx.fxml.FXML
    private Label verifiedAddress;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private Label verifiedFullName;
    @javafx.fxml.FXML
    private Label errorMessageLabel;
    @javafx.fxml.FXML
    private TextField fullNameTextField;
    @javafx.fxml.FXML
    private Label verifiedStatus;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        statusLabel.setText("Pending");
    }


    @javafx.fxml.FXML
    public void verifyNIDInformationButtonOnAction(ActionEvent actionEvent) {
        if (unidTextField.getText().equals("12345")) {
            verifiedFullName.setText("John Doe");
            verifiedStatus.setText("Verified");
            verifiedAddress.setText("123 Main St, City, Country");
            statusLabel.setText("Verified");
            errorMessageLabel.setText("");
        } else {

            statusLabel.setText("Not Verified");
            errorMessageLabel.setText("Error: Invalid NID. Please check the details.");

        }

        unidTextField.clear();fullNameTextField.clear();addressTextField.clear();dobDatePicker.setValue(null);
        verifiedFullName.setText("N/A");verifiedStatus.setText("N/A");verifiedAddress.setText("N/A");
    }

    @javafx.fxml.FXML
    public void contactSupportButtonOnAction(ActionEvent actionEvent) {
        System.out.println("Contacting support for assistance...");
        errorMessageLabel.setText("Please contact support for further assistance.");
    }

    @javafx.fxml.FXML
    public void recheckInformationButtonOnAction(ActionEvent actionEvent) {
        System.out.println("Rechecking the information...");
        errorMessageLabel.setText("Please recheck the entered information.");
    }
}