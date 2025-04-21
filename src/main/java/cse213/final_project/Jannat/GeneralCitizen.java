package cse213.final_project.Jannat;

import cse213.final_project.User;
import javafx.scene.control.DatePicker;

import java.io.Serializable;
import java.time.LocalDate;

public class GeneralCitizen extends User implements Serializable {
    private String citizenID;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String NIDStatus;


    public GeneralCitizen(String address, LocalDate dob, String email, Long id, String name, String password, String pN, String type, String citizenID, String name1, String address1, String phone, String email1, String NIDStatus) {
        super(address, dob, email, id, name, password, pN, type);
        this.citizenID = citizenID;
        this.name = name1;
        this.address = address1;
        this.phone = phone;
        this.email = email1;
        this.NIDStatus = NIDStatus;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNIDStatus() {
        return NIDStatus;
    }

    public void setNIDStatus(String NIDStatus) {
        this.NIDStatus = NIDStatus;
    }

    @Override
    public String toString() {
        return "GeneralCitizen{" +
                "citizenID='" + citizenID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", NIDStatus='" + NIDStatus + '\'' +
                '}';
    }

    public GeneralCitizen(String address, LocalDate dob, String email, Long id, String name, String password, String pN, String type) {
        super(address, dob, email, id, name, password, pN, type);
    }

    public void applyForNewNID() {
        System.out.println("Application for new NID submitted.");
    }

    public void updatePersonalInfo() {
        System.out.println("Personal information updated.");
    }

    public String checkApplicationStatus() {
        return "Status: Under Review";
    }

    public boolean verifyNIDOnline() {
        return true;
    }

    public void requestDuplicateNID() {
        System.out.println("Duplicate NID requested.");
    }

    public void scheduleAppointment() {
        System.out.println("Appointment scheduled.");
    }

    public boolean payFeesOnline() {
        return true;
    }

    public void requestCorrection() {
        System.out.println("Correction request submitted.");
    }

}



