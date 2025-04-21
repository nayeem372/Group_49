package cse213.final_project.Jannat;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class Appointment {
    private String appointmentID;
    private LocalDate date;
    private String timeSlot;

    public Appointment() {
    }

    public Appointment(String appointmentID, LocalDate date, String timeSlot) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.timeSlot = timeSlot;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID='" + appointmentID + '\'' +
                ", date=" + date +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    public void confirmAppointment() {

    }
}
