package cse213.final_project.Nayeem;

import cse213.final_project.User;

import java.io.Serializable;
import java.time.LocalDate;

public class DataEntryOperator extends User {
    public DataEntryOperator(String address, LocalDate dob, String email, int id, String name, String password, String pN, String type) {
        super(address, dob, email, id, name, password, pN, type);
    }

}
