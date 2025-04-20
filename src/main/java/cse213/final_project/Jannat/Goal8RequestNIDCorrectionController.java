package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Goal8RequestNIDCorrectionController
{
    @javafx.fxml.FXML
    private TextField detailsTextField;
    @javafx.fxml.FXML
    private TextField nidTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String nid = nidTextField.getText();
        String detailsToCorrect = detailsTextField.getText();

        if (nid.isEmpty() || detailsToCorrect.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please fill in all the fields.");
        } else {

            showAlert(Alert.AlertType.INFORMATION, "Request Submitted", "Your NID correction request has been submitted.");
        }

    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}