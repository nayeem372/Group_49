package cse213.final_project.Nayeem;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class flagApplicationController
{
    @javafx.fxml.FXML
    private TextField appIdField;
    @javafx.fxml.FXML
    private TableColumn<ManualApplicant,String> emailIdTCol;
    @javafx.fxml.FXML
    private TableColumn<ManualApplicant,String> applicantTypeCol;
    @javafx.fxml.FXML
    private TableView<ManualApplicant> tableView;
    @javafx.fxml.FXML
    private TableColumn<ManualApplicant,String> applicantIdTCol;
    @javafx.fxml.FXML
    private TableColumn<ManualApplicant,String> pNTCol;
    @javafx.fxml.FXML
    private TableColumn<ManualApplicant,String> DOBTCol;
    @javafx.fxml.FXML
    private TableColumn<ManualApplicant,String> nameIdTcol;
    @javafx.fxml.FXML
    private TableColumn<ManualApplicant,String> genderTCol;
    @javafx.fxml.FXML
    private TextArea issueDescriptionArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FlagButtonOnAction(ActionEvent actionEvent) {
    }
}