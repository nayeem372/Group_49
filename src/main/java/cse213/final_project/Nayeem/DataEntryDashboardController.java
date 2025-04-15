package cse213.final_project.Nayeem;

import cse213.final_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class DataEntryDashboardController
{
    @javafx.fxml.FXML
    private Button newAppButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignTrackingButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/TrackingAssignmentView.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void validateFormButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/FormValidationView.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void flagAppButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/FlagApplicationView.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void recordSearchButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/RecordSearchView.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void uploadDocsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void newAppButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/newApplicationView.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void logOutOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("login.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void appSButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/ApplicationSummaryView.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void veriCButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Nayeem/VerificationCoordinationView.fxml", actionEvent); {
        }
    }
}