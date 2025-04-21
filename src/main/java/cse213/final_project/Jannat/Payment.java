package cse213.final_project.Jannat;

import java.time.LocalDate;

public class Payment {
    private String paymentID;
    private double amount;
    private LocalDate paymentDate;

    public Payment(String paymentID, double amount, LocalDate paymentDate) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public Payment() {
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                '}';
    }

    public void confirmPayment() {

    }
}
