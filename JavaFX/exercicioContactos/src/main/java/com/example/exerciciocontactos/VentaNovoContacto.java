package com.example.exerciciocontactos;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

public class VentaNovoContacto
{
    private HelloController helloController;
    private Stage stage;
    @javafx.fxml.FXML
    private TextField nomeTxt;
    @javafx.fxml.FXML
    private TextField apelidosTxt;
    @javafx.fxml.FXML
    private TextField notasTxt;
    @javafx.fxml.FXML
    private TextField telefonoTxt;
    @javafx.fxml.FXML
    private Button boton;

    @javafx.fxml.FXML
    public void initialize() {

    }

    public void setHelloController(HelloController helloController){
        this.helloController=helloController;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @javafx.fxml.FXML
    public void onBotonClick(ActionEvent actionEvent) {
        helloController.crearContacto(nomeTxt.getText(), apelidosTxt.getText(), telefonoTxt.getText(), notasTxt.getText());
        stage.close();
    }
}

