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
        System.out.println("Navigating to request more details page...");

        massageTextlabel.setText("Requesting additional details... please wait.");
    }


    @javafx.fxml.FXML
    public void checkStatusButtonOnAction(ActionEvent actionEvent) {
        String applicationNumber = applicationNumberField.getText();
        String applicationStatus = getApplicationStatus(applicationNumber);
        if (applicationStatus != null) {
            statusLabel.setText(applicationStatus);
            massageTextlabel.setText("You will be notified via SMS/email if the application is updated.");
        } else {
            statusLabel.setText("Not Found");
            massageTextlabel.setText("No application found for this number. Please try again.");
        }
    }
    private String getApplicationStatus(String applicationNumber) {
        if (applicationNumber.equals("12345")) {
            return "Under Review";
        } else if (applicationNumber.equals("67890")) {
            return "Approved";
        } else if (applicationNumber.equals("11223")) {
            return "Rejected";
        } else {
            return null;
        }
    }
}