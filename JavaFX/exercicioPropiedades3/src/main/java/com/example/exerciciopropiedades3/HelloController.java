package com.example.exerciciopropiedades3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class HelloController {

    @FXML
    private ImageView imaxe;
    @FXML
    private Slider slider;

    public void initialize() throws FileNotFoundException {
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(0);

        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(25f);
        slider.setBlockIncrement(1f);
        imaxe.setImage(new Image(this.getClass().getResource("/imaxes/senson.png").toString()));

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                double valor = (double) t1;
                if (valor==0.0){
                    imaxe.setImage(new Image(this.getClass().getResource("/imaxes/senson.png").toString()));

                }else if(valor<50){
                    imaxe.setImage(new Image(this.getClass().getResource("/imaxes/algosonido.jpg").toString()));
                }
                else{
                    imaxe.setImage(new Image(this.getClass().getResource("/imaxes/sonido.png").toString()));
                }
            }
        });



    }



}