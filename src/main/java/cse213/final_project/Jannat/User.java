package cse213.final_project.Jannat;

public class User {
    protected String userID;
    protected String password,phone,email,address;
    protected String fullName;

    public User() {
    }

    public User(String userID, String password, String phone, String email, String fullName, String address) {
        this.userID = userID;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.fullName = fullName;
        this.address = address;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public void login(String userId, String password) {
    }
    public void logout() {
    }

    public void updateProfile(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

}
