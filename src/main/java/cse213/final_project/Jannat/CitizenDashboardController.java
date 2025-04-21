package cse213.final_project.Jannat;

import cse213.final_project.Nayeem.DataEntryDashboardController;
import cse213.final_project.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CitizenDashboardController
{
    @javafx.fxml.FXML
    private Button requestCorrectionNIDButton;
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private Label pNLabel;
    @javafx.fxml.FXML
    private Label emailLabel;
    @javafx.fxml.FXML
    private Label nameLabel;
    private User user;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void payServiceFeesButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/Goal7PayServiceController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void verifyNIDButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/Goal4NIDInformationController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void applyForNewNIDButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/ApplyForNewNidController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void checkNIDStatusButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/Goal2UpdateInformationController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void requestAppointmentButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/Goal6RequestAppoinment.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void applyForDuplicateNIDButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/Goal5duplicateNidController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void requestCorrectionNIDButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/Goal8RequestNIDCorrectionController.fxml"));
        Parent root = loader.load();
        DataEntryDashboardController controller = loader.getController();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void updatePersonalInfoButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/Goal2UpdateInformationController.fxml"));
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