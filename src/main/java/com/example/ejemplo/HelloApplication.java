package com.example.ejemplo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 406, 442);
        stage.setTitle("Escuela");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {

        Connect2Db.getInstance();
        launch();
    }
}