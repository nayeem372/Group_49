package cse213.final_project;

import cse213.final_project.Nayeem.ApprovalOfficer;
import cse213.final_project.Nayeem.DataEntryOperator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class logInViewcontroller
{
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private TextField userIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logInOnAction(ActionEvent actionEvent)throws IOException {
        int id = Integer.parseInt(userIdTextField.getText()) ;
        String password = passwordPasswordField.getText() ;

        if (Integer.toString(id).length() == 5) {
            ObservableList<DataEntryOperator> DataEntryObservableList = this.readDataEntry() ;
            for(DataEntryOperator DataEntry : DataEntryObservableList) {
                if (DataEntry.getId() == id && Objects.equals(DataEntry.getPassword(), password)) {
                    SceneSwitcher.switchTo("Nayeem/dataEntryDashboard.fxml", actionEvent);
                    break;
                }
            }
        }
        else if (Integer.toString(id).length() == 7) {
            ObservableList<ApprovalOfficer> AppOfficerObservableList = this.readAppOfficer() ;
            for(ApprovalOfficer AppOfficer : AppOfficerObservableList) {
                if (AppOfficer.getId() == id && Objects.equals(AppOfficer.getPassword(), password)) {
                    SceneSwitcher.switchTo("Nayeem/ApprovalOfficerDashboard.fxml", actionEvent);
                    break;
                }
            }
        }

    }

    @javafx.fxml.FXML
    public void createAccountOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("CreateAccountView.fxml", actionEvent); {
        }
    }




    public ObservableList<DataEntryOperator> readDataEntry() {
        ObservableList<DataEntryOperator> DataEntryObservableList = FXCollections.observableArrayList() ;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("DataEntryOperatorData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            DataEntryOperator DataEntry;
            try{
                while(true){
                    DataEntry = (DataEntryOperator) ois.readObject();
                    DataEntryObservableList.add(DataEntry) ;
                }
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("External Error: " + ex.getMessage());
        }
        finally {
            try {

                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return DataEntryObservableList ;
    }
    public ObservableList<ApprovalOfficer> readAppOfficer() {
        ObservableList<ApprovalOfficer> AppOfficerObservableList = FXCollections.observableArrayList() ;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("ApprovalOfficer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ApprovalOfficer AppOfficer;
            try{
                while(true){
                    AppOfficer = (ApprovalOfficer) ois.readObject();
                    AppOfficerObservableList.add(AppOfficer) ;
                }
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        finally {
            try {

                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return AppOfficerObservableList ;
    }
}
