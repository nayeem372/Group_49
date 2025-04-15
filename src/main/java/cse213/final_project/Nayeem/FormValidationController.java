package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FormValidationController
{
    @javafx.fxml.FXML
    private TextField appIdField;
    @javafx.fxml.FXML
    private Button validateButton;
    @javafx.fxml.FXML
    private TextArea validationResultArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/dataEntryDashboard.fxml", actionEvent); {
        }
    }
}