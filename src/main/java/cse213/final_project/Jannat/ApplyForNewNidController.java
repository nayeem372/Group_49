package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ApplyForNewNidController
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
    private DatePicker dateOfBirthDatePicker;
    @javafx.fxml.FXML
    private TextField emailTextField1;
    @javafx.fxml.FXML
    private ComboBox<String>  genderComboBox;
    @javafx.fxml.FXML
    private TextField nationalityTextField;

    @javafx.fxml.FXML
    public void initialize() {
        genderComboBox.getItems().addAll("Male", "Female", "Other");
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        if (nameTextField.getText().isEmpty() &&
                citizenIdTextField.getText().isEmpty() &&
                phoneNumberTextField.getText().isEmpty() &&
                addressTextField.getText().isEmpty() &&
                emailTextField1.getText().isEmpty() &&
                nationalityTextField.getText().isEmpty() &&
                genderComboBox.getValue() != null &&
                dateOfBirthDatePicker.getValue() != null) {

            System.out.println("Application Submitted!");

        } else {

            System.out.println("Please complete all required fields.");
        }

        nameTextField.clear();citizenIdTextField.clear();phoneNumberTextField.clear();
        addressTextField.clear();emailTextField1.clear();nationalityTextField.clear();
        genderComboBox.setValue(null);dateOfBirthDatePicker.setValue(null);
    }


}