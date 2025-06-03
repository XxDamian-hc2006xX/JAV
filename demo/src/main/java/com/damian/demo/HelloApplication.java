package com.damian.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label cheeto = new Label("Hola mundo, esta es mi primera chamba ejeej");
        Image image = new Image(getClass().getResourceAsStream("/Images/artist_2288766.png"));
        StackPane root = new StackPane(cheeto);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Gael Damian Hernandez Carranza");
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}