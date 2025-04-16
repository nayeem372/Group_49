package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Goal6RequestAppoinment
{
    @javafx.fxml.FXML
    private ComboBox<String> timeSlotComboBox;
    @javafx.fxml.FXML
    private Label confirmationMessageLabel;
    @javafx.fxml.FXML
    private Label slotAvailabilityLabel;
    @javafx.fxml.FXML
    private DatePicker dateForVaricationDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        timeSlotComboBox.getItems().addAll("Available","Slot Taken");
    }





    @javafx.fxml.FXML
    public void requestAppointmentButtonOnAction(ActionEvent actionEvent) {
        System.out.println("Navigating to Appointment Request form");
    }

    @javafx.fxml.FXML
    public void ConfirmAppointmentButtonOnAction(ActionEvent actionEvent) {
        String selectedDate = dateForVaricationDatePicker.getValue().toString();
        String selectedTimeSlot = timeSlotComboBox.getValue();

        if (selectedDate != null && selectedTimeSlot != null) {

            if (selectedTimeSlot.equals("9:00 AM - 11:00 AM")) {
                slotAvailabilityLabel.setText("Available");
                confirmationMessageLabel.setText("Appointment Confirmed! Appointment ID: A123");
            } else {
                slotAvailabilityLabel.setText("Slot Taken");
                confirmationMessageLabel.setText("Please select a different time slot.");
            }
        } else {
            slotAvailabilityLabel.setText("Please select a date and time.");
        }
    }
}