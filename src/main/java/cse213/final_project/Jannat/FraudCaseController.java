package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import org.w3c.dom.Text;

public class FraudCaseController
{
    @javafx.fxml.FXML
    private Label reportFraudLabel;
    @javafx.fxml.FXML
    private Text titleLabel;
    @javafx.fxml.FXML
    private Text lockMessage;
    @javafx.fxml.FXML
    private Label sendToAuthoritiesLabel;
    @javafx.fxml.FXML
    private Label completedVerificationsLabel;
    @javafx.fxml.FXML
    private ComboBox<String> fraudTypeComboBox;
    @javafx.fxml.FXML
    private Label reviewLabel;
    @javafx.fxml.FXML
    private TableColumn<FraudCaseController,String> statusTableColumn;
    @javafx.fxml.FXML
    private TableView<String> flaggedApplicationsTableView;
    @javafx.fxml.FXML
    private TableColumn<FraudCaseController,String> idTableColumn;
    @javafx.fxml.FXML
    private TableColumn<FraudCaseController,String> fraudTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<FraudCaseController,String> nameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void generateCaseReferenceButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendCaseButtonOnAction(ActionEvent actionEvent) {
    }
}