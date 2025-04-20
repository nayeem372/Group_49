package cse213.final_project.Nayeem;

import cse213.final_project.AppendableObjectOutputStream;
import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class NewApplicationViewController
{
    @javafx.fxml.FXML
    private TextField phoneNumberField;
    @javafx.fxml.FXML
    private TextField upozilaField;
    @javafx.fxml.FXML
    private TextField unionField;
    @javafx.fxml.FXML
    private TextField postalCodeField;
    @javafx.fxml.FXML
    private TextField districtField;
    @javafx.fxml.FXML
    private TextField emailAddressField;
    @javafx.fxml.FXML
    private TextField motherNameField;
    @javafx.fxml.FXML
    private TextField villageField;
    @javafx.fxml.FXML
    private TextField divisionField;
    @javafx.fxml.FXML
    private TextField fullNameField;
    @javafx.fxml.FXML
    private TextField fatherNameField;
    @javafx.fxml.FXML
    private ComboBox<String> genderComboBox;
    @javafx.fxml.FXML
    private DatePicker dobPicker;
    @javafx.fxml.FXML
    private TextArea showTA;

    @javafx.fxml.FXML
    public void initialize() {genderComboBox.getItems().addAll("Male", "Female", "Other");
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        long ApplicantId = 0 ;
        Random random = new Random() ;
        if (!validateFields()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please fill all mandatory fields.");
            return;
        }
        ApplicantId =random.nextLong(1000000000L, 9999999999L);
        ManualApplicant applicant = new ManualApplicant(
                ApplicantId,
                dobPicker.getValue(),
                districtField.getText().trim(),
                divisionField.getText().trim(),
                emailAddressField.getText().trim(),
                fatherNameField.getText().trim(),
                fullNameField.getText().trim(),
                genderComboBox.getValue(),
                motherNameField.getText().trim(),
                phoneNumberField.getText().trim(),
                Integer.parseInt(postalCodeField.getText()),
                unionField.getText().trim(),
                upozilaField.getText().trim(),
                villageField.getText().trim());
        showTA.setText(applicant.toString());
        this.writeManualApplicant(applicant);
        showAlert(Alert.AlertType.INFORMATION, "Success", "Application submitted successfully! Applicant ID: " + ApplicantId);
        clearFields();
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/dataEntryDashboard.fxml", actionEvent); {
        }
    }
    public boolean validateFields() {
        return !fullNameField.getText().isEmpty() &&
                !fatherNameField.getText().isEmpty() &&
                !motherNameField.getText().isEmpty() &&
                genderComboBox.getValue() != null &&
                dobPicker.getValue() != null &&
                !phoneNumberField.getText().isEmpty() &&
                !emailAddressField.getText().isEmpty() &&
                !divisionField.getText().isEmpty() &&
                !districtField.getText().isEmpty() &&
                !upozilaField.getText().isEmpty() &&
                !villageField.getText().isEmpty() &&
                !unionField.getText().isEmpty() &&
                !postalCodeField.getText().isEmpty();
    }
    public void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public void clearFields() {
        fullNameField.clear();
        fatherNameField.clear();
        motherNameField.clear();
        genderComboBox.getSelectionModel().clearSelection();
        dobPicker.setValue(null);
        phoneNumberField.clear();
        emailAddressField.clear();
        divisionField.clear();
        districtField.clear();
        upozilaField.clear();
        villageField.clear();
        unionField.clear();
        postalCodeField.clear();
    }
    public void writeManualApplicant(ManualApplicant ManApplicant) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("ManualApplicant.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
//                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(ManApplicant);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}