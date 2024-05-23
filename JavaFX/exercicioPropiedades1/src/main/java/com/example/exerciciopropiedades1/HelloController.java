package com.example.exerciciopropiedades1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;

public class HelloController {

    @FXML
    private Slider slider;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Button aumentarBtn;
    @FXML
    private Button diminuirBtn;

    public void initialize(){
        slider.setMin(0);
        slider.setMax(1);
        slider.setValue(0.5);
        progressBar.setPrefWidth(250);
        progressBar.progressProperty().bindBidirectional(slider.valueProperty());//importanteee


    }


    @FXML
    public void onAumentarBtnClick(ActionEvent actionEvent) {
        progressBar.setProgress(progressBar.getProgress()+0.1);
    }

    @FXML
    public void onDiminuirBtnClick(ActionEvent actionEvent) {
        progressBar.setProgress(progressBar.getProgress()-0.1);
    }
}