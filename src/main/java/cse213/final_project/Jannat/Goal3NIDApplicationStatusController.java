package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class Goal3NIDApplicationStatusController
{

    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField applicationNumberField;
    @javafx.fxml.FXML
    private Label massageTextlabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void requestDetailsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkStatusButtonOnAction(ActionEvent actionEvent) {
        massageTextlabel.setText("If the application is updated, you will be notified by SMS/email.");
    }
}