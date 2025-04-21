package cse213.final_project;

import cse213.final_project.Jannat.CitizenDashboardController;
import cse213.final_project.Jannat.GeneralCitizen;
import cse213.final_project.Jannat.VerificationOfficer;
import cse213.final_project.Jannat.VerificationOfficerDashboardController;
import cse213.final_project.Nayeem.ApprovalOfficer;
import cse213.final_project.Nayeem.ApprovalOfficerDashboardController;
import cse213.final_project.Nayeem.DataEntryDashboardController;
import cse213.final_project.Nayeem.DataEntryOperator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.Objects;

public class logInViewcontroller
{
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    private FXMLLoader loader;

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
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Nayeem/dataEntryDashboard.fxml"));
                    Parent root = loader.load();
                    DataEntryDashboardController controller = loader.getController();
                    controller.setUser(DataEntry);
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    break;
                }
            }
        }
        else if (Integer.toString(id).length() == 7) {
            ObservableList<ApprovalOfficer> AppOfficerObservableList = this.readAppOfficer() ;
            for(ApprovalOfficer AppOfficer : AppOfficerObservableList) {
                if (AppOfficer.getId() == id && Objects.equals(AppOfficer.getPassword(), password)) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Nayeem/ApprovalOfficerDashboard.fxml"));
                    Parent root = loader.load();
                    ApprovalOfficerDashboardController controller = loader.getController();
                    controller.setUser(AppOfficer);
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    break;
                }
            }
        }
        else if (Long.toString(id).length() == 10) {
            ObservableList<GeneralCitizen> generalCitizenObservableList = this.readGeneralCitizen();
            for (GeneralCitizen generalCitizen : generalCitizenObservableList) {
                if (generalCitizen.getId().equals(String.valueOf(id)) && Objects.equals(generalCitizen.getPassword(), password)) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/CitizenDashboardController.fxml"));
                    Parent root = loader.load();
                    CitizenDashboardController controller = loader.getController();
                    controller.setUser(generalCitizen);
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    break;
                }
            }
        }
        else if (Integer.toString(id).length() == 4) {
            ObservableList<VerificationOfficer> verificationOfficerObservableList = this.readVerificationOfficer();
            for (VerificationOfficer verificationOfficer : verificationOfficerObservableList) {
                if (verificationOfficer.getId().equals(Integer.toString(id)) && Objects.equals(verificationOfficer.getPassword(), password)) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Jannat/VerificationOfficerDashboardController.fxml"));
                    Parent root = loader.load();
                    VerificationOfficerDashboardController controller = loader.getController();
                    controller.setUser(verificationOfficer);
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
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
            f = new File("DataEntryOp.bin");
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
            f = new File("ApOfficer.bin");
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

    public ObservableList<GeneralCitizen> readGeneralCitizen() {
        ObservableList<GeneralCitizen> generalCitizenObservableList = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("GeneralCitizenData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            GeneralCitizen generalCitizen;
            while (true) {
                try {
                    generalCitizen = (GeneralCitizen) ois.readObject();
                    generalCitizenObservableList.add(generalCitizen);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException ex) {
                System.out.println("External Error: " + ex.getMessage());
            }
        }
        return generalCitizenObservableList;
    }


    public ObservableList<VerificationOfficer> readVerificationOfficer() {
        ObservableList<VerificationOfficer> verificationOfficerObservableList = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("VerificationOfficerData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            VerificationOfficer verificationOfficer;
            while (true) {
                try {
                    verificationOfficer = (VerificationOfficer) ois.readObject();
                    verificationOfficerObservableList.add(verificationOfficer);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException ex) {
                System.out.println("External Error: " + ex.getMessage());
            }
        }
        return verificationOfficerObservableList;
    }








}
