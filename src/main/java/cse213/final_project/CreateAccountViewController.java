package cse213.final_project;

import cse213.final_project.Nayeem.ApprovalOfficer;
import cse213.final_project.Nayeem.DataEntryOperator;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class CreateAccountViewController
{
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private TextArea showTA;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField pNTF;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeCB;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private DatePicker dobDP;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeCB.getItems().addAll("General Citizen", "DataEntry Operator ", "Approval Officer","Verification Officer","Registration Officer","Help Desk Supporter") ;
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("login.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void createAccountButtonOA(ActionEvent actionEvent) {
        String name, email, pN, address, password, userType ;
        LocalDate dob ;
        int id = 0 ;
        Random random = new Random() ;

        name = nameTF.getText() ;
        email = emailTF.getText() ;
        pN = pNTF.getText() ;
        address = addressTA.getText() ;
        password = passwordPF.getText() ;
        userType = userTypeCB.getValue() ;
        dob = dobDP.getValue() ;
        if (userType == "DataEntry Operator") {
            id = random.nextInt(10000, 99999) ;
            DataEntryOperator DataEntry = new DataEntryOperator(address ,dob, email, id, name, password, pN,userType) ;
            showTA.setText(DataEntry.toString());
            this.writeDataEntryOperator(DataEntry);
            this.writeUser(DataEntry);
        }
//
//
        if (userType == "Approval Officer") {
            id = random.nextInt(1000000, 9999999) ;
            ApprovalOfficer AppOfficer = new ApprovalOfficer(address ,dob, email, id, name, password, pN,userType) ;
            showTA.setText(AppOfficer.toString());
            this.writeMember(AppOfficer);
            this.writeUser(AppOfficer);
        }
        nameTF.clear();
        emailTF.clear();
        pNTF.clear();
        addressTA.clear();
        passwordPF.clear();
    }

    public void writeDataEntryOperator(DataEntryOperator DataEntry) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("DataEntry.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
//                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(DataEntry);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    public void writeMember(ApprovalOfficer AppOfficer) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("ApprovalOfficer.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
//                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(AppOfficer);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    public void writeUser(User user) {
        File f = null ;
        FileWriter fw = null ;

        try {
            f = new File("UserData.txt") ;
            if (f.exists()) {
                fw = new FileWriter(f, true) ;
            }
            else {
                fw = new FileWriter(f) ;
            }

            fw.write(user.getId() + "," + user.getPassword() + "," + user.getType() + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}