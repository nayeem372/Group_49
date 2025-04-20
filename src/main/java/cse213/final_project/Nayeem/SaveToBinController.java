package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class SaveToBinController
{
    @javafx.fxml.FXML
    private TableColumn phoneCol;
    @javafx.fxml.FXML
    private TableColumn fatherNameCol;
    @javafx.fxml.FXML
    private TableColumn dobCol;
    @javafx.fxml.FXML
    private TableView applicantTable;
    @javafx.fxml.FXML
    private TableColumn emailCol;
    @javafx.fxml.FXML
    private TableColumn motherNameCol;
    @javafx.fxml.FXML
    private TableColumn genderCol;
    @javafx.fxml.FXML
    private Button saveButton;
    @javafx.fxml.FXML
    private TableColumn fullNameCol;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Button saveButton1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveToBinOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/dataEntryDashboard.fxml", actionEvent); {
        }
    }
}