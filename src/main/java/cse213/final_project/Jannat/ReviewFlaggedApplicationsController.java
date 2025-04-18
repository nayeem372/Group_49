package cse213.final_project.Jannat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ReviewFlaggedApplicationsController
{
    @javafx.fxml.FXML
    private ComboBox<String> applicationComboBox;
    @javafx.fxml.FXML
    private TextField documentTextField;
    @javafx.fxml.FXML
    private Button browseDocumentButton;
    @javafx.fxml.FXML
    private TextArea previousNotesTextArea;
    @javafx.fxml.FXML
    private TextArea notificationTextArea;
    @javafx.fxml.FXML
    private Button submitReviewButton;
    @javafx.fxml.FXML
    private ComboBox<String> decisionComboBox;
    @javafx.fxml.FXML
    private TextArea commentsTextArea;
    @javafx.fxml.FXML
    private CheckBox compareWithDatabaseCheckBox;
    @javafx.fxml.FXML
    private TableView flaggingHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn issueTypeColumn;
    @javafx.fxml.FXML
    private TableColumn descriptionColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReviewButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void browseDocumentButtonOnAction(ActionEvent actionEvent) {
    }
}