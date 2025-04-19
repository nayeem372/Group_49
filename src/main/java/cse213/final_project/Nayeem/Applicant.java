package cse213.final_project.Nayeem;

import java.time.LocalDate;

public class Applicant {
    private String fullName;
    private String fatherName;
    private String motherName;
    private String gender;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String emailAddress;
    private Long ApplicantId;
    private String division;
    private String district;
    private String upozila;
    private String union;
    private String villageOrWard;
    private Integer postalCode;

    public Applicant(Long applicantId, LocalDate dateOfBirth, String district, String division, String emailAddress, String fatherName, String fullName, String gender, String motherName, String phoneNumber, Integer postalCode, String union, String upozila, String villageOrWard) {
        ApplicantId = applicantId;
        this.dateOfBirth = dateOfBirth;
        this.district = district;
        this.division = division;
        this.emailAddress = emailAddress;
        this.fatherName = fatherName;
        this.fullName = fullName;
        this.gender = gender;
        this.motherName = motherName;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.union = union;
        this.upozila = upozila;
        this.villageOrWard = villageOrWard;
    }

    public Long getApplicantId() {
        return ApplicantId;
    }

    public void setApplicantId(Long applicantId) {
        ApplicantId = applicantId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getUnion() {
        return union;
    }

    public void setUnion(String union) {
        this.union = union;
    }

    public String getUpozila() {
        return upozila;
    }

    public void setUpozila(String upozila) {
        this.upozila = upozila;
    }

    public String getVillageOrWard() {
        return villageOrWard;
    }

    public void setVillageOrWard(String villageOrWard) {
        this.villageOrWard = villageOrWard;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "ApplicantId='" + ApplicantId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", division='" + division + '\'' +
                ", district='" + district + '\'' +
                ", upozila='" + upozila + '\'' +
                ", union='" + union + '\'' +
                ", villageOrWard='" + villageOrWard + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
