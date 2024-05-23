package com.example.exercicio4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane anchorPane = new AnchorPane();
        Button boton = new Button("Hello");
        AnchorPane.setBottomAnchor(boton, 10.0);
        AnchorPane.setRightAnchor(boton, 10.0);

        anchorPane.getChildren().add(boton);
        Scene scene = new Scene(anchorPane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}