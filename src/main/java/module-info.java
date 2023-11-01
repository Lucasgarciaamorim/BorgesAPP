module com.example.borgesapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.guiborges to javafx.fxml;
    exports com.guiborges;
}