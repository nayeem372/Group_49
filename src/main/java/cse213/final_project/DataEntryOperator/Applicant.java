package cse213.final_project.DataEntryOperator;

public class Applicant {
    private String fullName;
    private String fatherName;
    private String motherName;
    private String gender;
    private String dateOfBirth;
    private String phoneNumber;
    private String emailAddress;
    private String ApplicantId;
    private String division;
    private String district;
    private String upazila;
    private String union;
    private String villageOrWard;
    private String postalCode;

    public Applicant(String applicantId, String dateOfBirth, String district, String division, String emailAddress, String fatherName, String fullName, String gender, String motherName, String postalCode, String phoneNumber, String union, String upazila, String villageOrWard) {
        ApplicantId = applicantId;
        this.dateOfBirth = dateOfBirth;
        this.district = district;
        this.division = division;
        this.emailAddress = emailAddress;
        this.fatherName = fatherName;
        this.fullName = fullName;
        this.gender = gender;
        this.motherName = motherName;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.union = union;
        this.upazila = upazila;
        this.villageOrWard = villageOrWard;
    }

    public String getApplicantId() {
        return ApplicantId;
    }

    public void setApplicantId(String applicantId) {
        ApplicantId = applicantId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getUnion() {
        return union;
    }

    public void setUnion(String union) {
        this.union = union;
    }

    public String getUpazila() {
        return upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
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
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", division='" + division + '\'' +
                ", district='" + district + '\'' +
                ", upazila='" + upazila + '\'' +
                ", union='" + union + '\'' +
                ", villageOrWard='" + villageOrWard + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
