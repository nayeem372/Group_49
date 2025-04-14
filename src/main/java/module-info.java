module cse213.final_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.final_project to javafx.fxml;
    opens cse213.final_project.DataEntryOperator to javafx.fxml;
    exports cse213.final_project;
}