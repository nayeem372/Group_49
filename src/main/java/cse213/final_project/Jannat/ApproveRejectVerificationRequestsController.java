package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ApproveRejectVerificationRequestsController
{
    @javafx.fxml.FXML
    private ComboBox<String> applicationComboBox;
    @javafx.fxml.FXML
    private TextArea verificationSummaryTextArea;
    @javafx.fxml.FXML
    private CheckBox allChecksClearCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> rejectionReasonComboBox;
    @javafx.fxml.FXML
    private TextArea notificationTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> decisionComboBox;
    @javafx.fxml.FXML
    private TextArea commentsTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        decisionComboBox.getItems().addAll("Approve", "Reject");
        rejectionReasonComboBox.getItems().addAll("Document Mismatch", "Failed Citizenship Check", "Other");
        rejectionReasonComboBox.setDisable(true);

    }

    @javafx.fxml.FXML
    public void submitDecisionButtonOnAction(ActionEvent actionEvent) {


    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}