package cse213.final_project;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {
    private Long id ;
    private String name, email, pN, password, type, address ;
    private LocalDate dob ;

    public User(String address, LocalDate dob, String email, Long id, String name, String password, String pN, String type) {
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
        this.pN = pN;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getpN() {
        return pN;
    }

    public void setpN(String pN) {
        this.pN = pN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pN='" + pN + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", dob=" + dob +
                '}';
    }
}
