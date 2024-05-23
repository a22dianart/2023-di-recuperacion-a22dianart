package com.example.exerciciocontrois6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Label colores;
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);


        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setOnAction(e -> {
            Color c = colorPicker.getValue();
            colores.setTextFill(c); //IMPORTANTE

        });
        vbox.getChildren().add(colorPicker);
        colores = new Label("Colores");
        vbox.getChildren().add(colores);
        Scene scene = new Scene(vbox, 320, 240);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}