package cse213.final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CreateAccountViewController
{
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private TextArea showTA;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField pNTF;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeCB;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private DatePicker dobDP;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeCB.getItems().addAll("Gene", "Member", "SoD") ;
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createAccountButtonOA(ActionEvent actionEvent) {
    }
}