package cse213.final_project.Jannat;

import cse213.final_project.User;
import javafx.scene.control.DatePicker;

import java.io.Serializable;
import java.time.LocalDate;

public class GeneralCitizen extends User implements Serializable {

    public GeneralCitizen(String address, LocalDate dob, String email, int id, String name, String password, String pN, String type) {
        super(address, dob, email, id, name, password, pN, type);
    }
}
