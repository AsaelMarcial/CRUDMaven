module com.example.ejemplo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires java.sql;

    opens com.example.ejemplo to javafx.fxml;
    exports com.example.ejemplo;
}