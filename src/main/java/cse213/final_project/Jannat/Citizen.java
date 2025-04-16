package cse213.final_project.Jannat;

import javafx.scene.control.DatePicker;

public class Citizen {private String citizenID;
    private String password;
    private String name;
    private String address;
    private DatePicker dateOfBirth;
    private Long birthCertificate;
    private Integer phoneNumber;
    private String nationality;
    private String gender;

    public Citizen() {
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DatePicker getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DatePicker dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getBirthCertificate() {
        return birthCertificate;
    }

    public void setBirthCertificate(Long birthCertificate) {
        this.birthCertificate = birthCertificate;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "citizenID='" + citizenID + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", birthCertificate=" + birthCertificate +
                ", phoneNumber=" + phoneNumber +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
