package cse213.final_project.Jannat;

import cse213.final_project.Nayeem.DataEntryDashboardController;
import cse213.final_project.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class VerificationOfficerDashboardController
{

    private User user;
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private Label pNLabel;
    @javafx.fxml.FXML
    private Label emailLabel;
    @javafx.fxml.FXML
    private Label nameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void requestAdditionalDocumentationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void crossCheckDataButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/VerificationController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void recordVerificationResultsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/RecordVerificationResultsController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void reviewFlaggedApplicationsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/ReviewFlaggedApplicationsController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void validateCitizenshipButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/VerificationProofController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void approveRejectVerificationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/ApproveRejectVerificationRequestsController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @javafx.fxml.FXML
    public void collaborateWithLawEnforcementButtonOnAction(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void VerificationApplicationButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/VerifyApplicationController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void setUser(User user) {
        this.user = user;
        idLabel.setText(String.valueOf(user.getId()));
        pNLabel.setText(user.getpN());
        emailLabel.setText(user.getEmail());
        nameLabel.setText(user.getName());
    }
}