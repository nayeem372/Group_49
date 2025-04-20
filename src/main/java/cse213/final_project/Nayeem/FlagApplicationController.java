package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FlagApplicationController
{
    @javafx.fxml.FXML
    private TextField appIdField;
    @javafx.fxml.FXML
    private TextArea issueDescriptionArea;
    @javafx.fxml.FXML
    private TableColumn emailIdTCol;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn applicantIdTCol;
    @javafx.fxml.FXML
    private TableColumn pNTCol;
    @javafx.fxml.FXML
    private TableColumn DOBTCol;
    @javafx.fxml.FXML
    private TableColumn nameIdTcol;
    @javafx.fxml.FXML
    private TableColumn genderTCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void flagButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/dataEntryDashboard.fxml", actionEvent); {
        }
    }
}