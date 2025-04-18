module cse213.final_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cse213.final_project to javafx.fxml;
    opens cse213.final_project.Nayeem to javafx.fxml;
    exports cse213.final_project;
}