package cse213.final_project.sadika;

import cse213.final_project.User;

import java.time.LocalDate;

public class registrationOfficer extends User {


    public registrationOfficer(String address, LocalDate dob, String email, Long id, String name, String password, String pN, String type) {
        super(address, dob, email, id, name, password, pN, type);
    }
}
