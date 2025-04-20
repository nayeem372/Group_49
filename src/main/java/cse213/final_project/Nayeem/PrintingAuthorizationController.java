package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PrintingAuthorizationController
{
    @javafx.fxml.FXML
    private TextField authorizationStatusField;
    @javafx.fxml.FXML
    private TextField applicationIdField;
    @javafx.fxml.FXML
    private Label checkAppLogLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkLogsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void authorizePrintingOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void forwardToPrintDeptOnAction(ActionEvent actionEvent) {
    }
}