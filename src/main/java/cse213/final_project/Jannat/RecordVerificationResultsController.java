package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class RecordVerificationResultsController
{
    @javafx.fxml.FXML
    private ComboBox<String> applicationComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> verificationResultComboBox;
    @javafx.fxml.FXML
    private TextArea applicantDetailsTextArea;
    @javafx.fxml.FXML
    private TextArea remarksTextArea;
    @javafx.fxml.FXML
    private TextArea confirmationMessageTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void submitVerificationResultButtonOnAction(ActionEvent actionEvent) {
    }
}