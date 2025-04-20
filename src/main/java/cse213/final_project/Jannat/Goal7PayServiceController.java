package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Goal7PayServiceController
{
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private Label confirmationMessageLabel;
    @javafx.fxml.FXML
    private TextField creditCardTextField;
    @javafx.fxml.FXML
    private CheckBox creditCardCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void paymentButtonOnAction(ActionEvent actionEvent) {
        if (creditCardCheckBox.isSelected()) {
            String cardNumber = creditCardTextField.getText();

            if (cardNumber.length() <= 10) {
                String amount = amountTextField.getText();

                confirmationMessageLabel.setText("Payment of " + amount + " Taka successful.");

                System.out.println("Payment processed for card: " + cardNumber + " for amount: " + amount + " Taka.");
            } else {
                confirmationMessageLabel.setText("Invalid card number. It should be 10 digits or less.");
            }
        } else {
            confirmationMessageLabel.setText("Please select the payment method.");
        }

    }
}