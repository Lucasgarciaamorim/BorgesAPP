module com.example.borgesapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.borgesapp to javafx.fxml;
    exports com.example.borgesapp;
}