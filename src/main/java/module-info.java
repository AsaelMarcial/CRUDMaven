module com.example.ejemplo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires java.sql;

    opens com.example.ejemplo to javafx.fxml;
    exports com.example.ejemplo;
    exports com.vistas;
    opens com.vistas to javafx.fxml;
    exports com.main;
    opens com.main to javafx.fxml;
    exports com.controladores;
    opens com.controladores to javafx.fxml;
    exports com.pojos;
    opens com.pojos to javafx.fxml;
    exports com.baseDeDatos;
    opens com.baseDeDatos to javafx.fxml;
}