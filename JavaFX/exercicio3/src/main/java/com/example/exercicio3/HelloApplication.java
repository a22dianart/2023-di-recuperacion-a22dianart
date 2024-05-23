package com.example.exercicio3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox hbox = new HBox(20);
        hbox.setSpacing(4);

        hbox.setAlignment(Pos.CENTER);

        Button botonUn = new Button("Un");
        hbox.getChildren().add(botonUn);

        Button botonDous = new Button("Dous");
        hbox.getChildren().add(botonDous);

        Button botonTres = new Button("Tres");
        hbox.getChildren().add(botonTres);

        Button botonCatro = new Button("Catro");
        hbox.getChildren().add(botonCatro);

        Scene scene = new Scene(hbox , 320, 240);
        stage.setTitle("Fila de botóns");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}