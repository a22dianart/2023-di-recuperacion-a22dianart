package com.example.exerciciopropiedades2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField texto1;
    @FXML
    private TextField texto2;

    public void initialize(){
        texto1.textProperty().bindBidirectional(texto2.textProperty());


    }
}