module com.example.borgesapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.borgesapp to javafx.fxml;
    exports com.borgesapp;
}