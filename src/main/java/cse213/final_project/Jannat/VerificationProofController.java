package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VerificationProofController
{
    @javafx.fxml.FXML
    private ComboBox<String> validationStatusComboBox;
    @javafx.fxml.FXML
    private TextArea remarksTextArea;
    @javafx.fxml.FXML
    private TextField nationalIdTextField;
    @javafx.fxml.FXML
    private TextField birthCertificateTextField;
    @javafx.fxml.FXML
    private TextArea clarificationTextArea;
    @javafx.fxml.FXML
    private TextField passportTextField;
    @javafx.fxml.FXML
    private ComboBox<String> documentValidityComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        documentValidityComboBox.getItems().addAll("Valid", "Invalid", "Pending");
        validationStatusComboBox.getItems().addAll("Approved", "Flagged");
    }

    @javafx.fxml.FXML
    public void browseBirthButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void browsePassButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void browseIdButtonOnAction(ActionEvent actionEvent) {
    }
}