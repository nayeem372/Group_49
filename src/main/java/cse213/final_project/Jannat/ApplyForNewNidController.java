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
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {

    }
}