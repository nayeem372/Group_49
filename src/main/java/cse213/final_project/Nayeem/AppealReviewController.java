package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AppealReviewController
{
    @javafx.fxml.FXML
    private TableColumn appelIdCol;
    @javafx.fxml.FXML
    private TextField appealIdField;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn emailCol;
    @javafx.fxml.FXML
    private TableColumn applicantNameCol;
    @javafx.fxml.FXML
    private TableColumn pNCol;
    @javafx.fxml.FXML
    private TextField applicantNameField;
    @javafx.fxml.FXML
    private TextArea appealReasonField;
    @javafx.fxml.FXML
    private TableColumn appealReasonCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reprocessOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent); {
        }
    }
}