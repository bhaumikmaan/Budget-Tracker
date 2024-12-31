module org.app.mytracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.app.mytracker to javafx.fxml;
    exports org.app.mytracker;
}