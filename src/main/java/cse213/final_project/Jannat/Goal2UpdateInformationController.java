package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Goal2UpdateInformationController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField citizenIdTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> genderComboBox;
    @javafx.fxml.FXML
    private DatePicker dateOfBirthDatePicker;
    @javafx.fxml.FXML
    private TextField birthCertificateTextField;
    @javafx.fxml.FXML
    private TextField nationalityTextField;

    @javafx.fxml.FXML
    public void initialize() {
        genderComboBox.getItems().addAll("Male", "Female", "Other");
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
        if (nameTextField.getText().isEmpty() &&
                citizenIdTextField.getText().isEmpty() &&
                phoneNumberTextField.getText().isEmpty() &&
                addressTextField.getText().isEmpty() &&
                birthCertificateTextField.getText().isEmpty() &&
                nationalityTextField.getText().isEmpty() &&
                genderComboBox.getValue() != null &&
                dateOfBirthDatePicker.getValue() != null) {


            System.out.println("Application Submitted!");


            boolean isDataValid = true;

            if (isDataValid) {

                System.out.println("Information successfully updated!");
            } else {

                System.out.println("Invalid data or not found in the database.");
            }


            nameTextField.clear();citizenIdTextField.clear();phoneNumberTextField.clear();
            addressTextField.clear();birthCertificateTextField.clear();nationalityTextField.clear();
            genderComboBox.setValue(null);dateOfBirthDatePicker.setValue(null);

        } else {

            System.out.println("Please complete all required fields.");
        }

    }
}