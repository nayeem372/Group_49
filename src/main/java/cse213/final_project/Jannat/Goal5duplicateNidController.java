package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Goal5duplicateNidController
{
    @javafx.fxml.FXML
    private ComboBox<String> nidStatusComboBox;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField nidNumberTextField;
    @javafx.fxml.FXML
    private TextField fullNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
        nidStatusComboBox.getItems().addAll("Found", "Lose");

    }

    @javafx.fxml.FXML
    public void handleFileUploadButtonOnAction(ActionEvent actionEvent) {
        System.out.println("Uploading Loss Report...");
    }

    @javafx.fxml.FXML
    public void submitForVerificationButtonOnAction(ActionEvent actionEvent) {
        System.out.println("Submitting for Verification...");
    }


}