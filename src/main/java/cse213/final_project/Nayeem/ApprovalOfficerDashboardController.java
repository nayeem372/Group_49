package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import cse213.final_project.User;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

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
    public void coordinateUnclearCasesOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Nayeem/VerificationWork.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void reviewFlaggedCasesOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/FlaggedCaseReview.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void maintainApprovalLogsOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalAuditLogs.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void approveFinalNIDOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApprovalFinalCheck.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void providePrintingAuthorizationOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/printingAuthorization.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void appealsOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/AppealReview.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void ensureApplicantInfoCorrectOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApplicantDataVerification.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void followUpPendingApplicationsOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/PendingApplication.fxml", actionEvent); {
        }
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

    @javafx.fxml.FXML
    public void logOutOnAction(ActionEvent actionEvent) {
    }
}