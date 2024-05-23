package com.example.exerciciofxml1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class HelloController {
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label cantidade;
    @FXML
    private Button aumentar;
    @FXML
    private Button diminuir;

    @FXML
    public void onAumentarClick(ActionEvent actionEvent) {
        double novaCant = progressBar.getProgress()+0.1;
        progressBar.setProgress(novaCant);
        cantidade.setText(String.valueOf(novaCant));
    }

    @FXML
    public void onDiminuirClick(ActionEvent actionEvent) {
        double novaCant = progressBar.getProgress()-0.1;
        progressBar.setProgress(novaCant);
        cantidade.setText(String.valueOf(novaCant));
    }
}