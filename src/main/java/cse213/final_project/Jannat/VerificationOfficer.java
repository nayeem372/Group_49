package cse213.final_project.Jannat;

import cse213.final_project.User;

import java.io.Serializable;
import java.time.LocalDate;

public class VerificationOfficer extends User  implements Serializable {
    public VerificationOfficer(String address, LocalDate dob, String email, Long id, String name, String password, String pN, String type) {
        super(address, dob, email, id, name, password, pN, type);
    }
}
