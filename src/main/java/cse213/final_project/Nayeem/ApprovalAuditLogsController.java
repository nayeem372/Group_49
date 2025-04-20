package cse213.final_project.Nayeem;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ApprovalAuditLogsController
{
    @javafx.fxml.FXML
    private TableView logsTable;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField officerIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterLogsOnAction(ActionEvent actionEvent) {
    }
}