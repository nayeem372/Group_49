package cse213.final_project.Jannat;

import cse213.final_project.User;

import java.io.Serializable;
import java.time.LocalDate;

public class VerificationOfficer extends User  implements Serializable {
    private String officerID;
    private String name;

    public VerificationOfficer(String address, LocalDate dob, String email, Long id, String name, String password, String pN, String type, String officerID, String name1) {
        super(address, dob, email, id, name, password, pN, type);
        this.officerID = officerID;
        this.name = name1;
    }

    public String getOfficerID() {
        return officerID;
    }

    public void setOfficerID(String officerID) {
        this.officerID = officerID;
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
    public String toString() {
        return "VerificationOfficer{" +
                "officerID='" + officerID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public VerificationOfficer(String address, LocalDate dob, String email, Long id, String name, String password, String pN, String type) {
        super(address, dob, email, id, name, password, pN, type);
    }
}
