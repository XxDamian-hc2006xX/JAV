package com.example.tt04_s2;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField campoPlaneacion;

    @FXML
    private Button btnAplicar;

    @FXML
    private ListView<String> listaPlaneacion;


    @FXML
    public void initialize() {
        // Aquí podrías inicializar la lista con contenido de ejemplo
        listaPlaneacion.getItems().addAll(
                "Planeación 1", "Planeación 2", "Planeación 3",
                "Planeación 4", "Planeación 5", "Planeación 6"
        );

        btnAplicar.setOnAction(e -> {
            String nuevaPlaneacion = campoPlaneacion.getText();
            if (!nuevaPlaneacion.isEmpty()) {
                listaPlaneacion.getItems().add(nuevaPlaneacion);
                campoPlaneacion.clear();
            }
        });
    }

}