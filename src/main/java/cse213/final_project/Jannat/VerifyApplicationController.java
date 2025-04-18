package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class VerifyApplicationController
{
    @javafx.fxml.FXML
    private ComboBox<String> applicationComboBox;
    @javafx.fxml.FXML
    private Label birthCertificateLabel;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private Label proofOfAddressLabel;
    @javafx.fxml.FXML
    private Label addressLabel;
    @javafx.fxml.FXML
    private Label dobLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label nameLabel;

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Complete", "Incomplete");
        applicationComboBox.getItems().addAll("Application 1", "Application 2", "Application 3");

    }


    @javafx.fxml.FXML
    public void submitReviewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkMissingInformationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewApplicationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void markApplicationCompleteButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkUploadedDocumentsButtonOnAction(ActionEvent actionEvent) {
    }
}