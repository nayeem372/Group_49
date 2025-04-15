package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

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
    private ComboBox genderComboBox;
    @javafx.fxml.FXML
    private DatePicker dobPicker;
    @javafx.fxml.FXML
    private TextField ApplicantIdfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/dataEntryDashboard.fxml", actionEvent); {
        }
    }
}