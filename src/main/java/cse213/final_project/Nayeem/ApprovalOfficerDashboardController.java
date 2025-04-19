package cse213.final_project.Nayeem;

import cse213.final_project.User;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ApprovalOfficerDashboardController
{
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
    public void coordinateUnclearCasesOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewFlaggedCasesOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintainApprovalLogsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveFinalNIDOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void providePrintingAuthorizationOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void appealsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ensureApplicantInfoCorrectOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void followUpPendingApplicationsOnAction(ActionEvent actionEvent) {
    }
    public void setUser(User user) {
        this.user = user;
        idLabel.setText(String.valueOf(user.getId()));
        pNLabel.setText(user.getpN());
        emailLabel.setText(user.getEmail());
        nameLabel.setText(user.getName());
    }
    public User getUser() {
        return user;
    }
}