package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RecordSearchController
{
    @javafx.fxml.FXML
    private TextField searchField;
    @javafx.fxml.FXML
    private ComboBox<String> searchTypeComboBox;
    @javafx.fxml.FXML
    private TextArea resultArea;
    @javafx.fxml.FXML
    private ComboBox updateByComboBox;
    @javafx.fxml.FXML
    private TextField updatedataField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordUpdateButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/dataEntryDashboard.fxml", actionEvent); {
        }
    }
}