package com.damian.form.u2_ti_02_form;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
     Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();
     Label lblEdad = new Label("Edad: ");
        TextField tfEdad = new TextField();
     Label lblOpciones = new Label("Opciones");
     ObservableList<String> opciones = FXCollections .observableArrayList("Estudiante", "Profesor", "Administrador");
     ComboBox <String> cbOpciones = new ComboBox(opciones);
     Button btnCrear = new Button("Guardar");
     Label lblresultado = new Label();
     GridPane form = new GridPane();


     btnCrear.setOnAction(e -> {
        String nombre =tfNombre.getText();
        String edad = tfEdad.getText();
        String seleccion = cbOpciones.getSelectionModel().getSelectedItem();
        if(nombre.isEmpty() || edad.isEmpty() || (seleccion == null)){
            System.out.println("Falta Rellenar datos");
            lblresultado.setText("Llena todo los campos hermano");
        } else {

            lblresultado.setText("Usuario creado"+ "\nNombre: " + nombre+"\nEdad: " + edad  +"\nOpciones: " + seleccion);
            lblresultado.setStyle("-fx-background-color: Green");
            form.setStyle("-fx-background-color: LightGreen");
            System.out.println("Usuario guardado");
        }
     });
     form.setAlignment(Pos.CENTER);
     form.setHgap(5);
     form.setVgap(5);

     form.add(lblNombre, 0, 0);
     form.add(tfNombre, 1, 0);
     form.add(lblEdad, 0, 1);
     form.add(tfEdad, 1, 1);
     form.add(lblOpciones, 0, 2);
     form.add(cbOpciones, 1, 2);
     form.add(btnCrear, 1, 3);
     form.add(lblresultado, 2, 4);


     Scene scene = new Scene(form ,500,700);
     stage.setTitle("Registro ");
     stage.setScene(scene);
     stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}