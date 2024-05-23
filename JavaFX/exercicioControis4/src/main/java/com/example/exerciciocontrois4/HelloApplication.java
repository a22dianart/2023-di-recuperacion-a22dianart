package com.example.exerciciocontrois4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private ProgressBar progressBar;
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        Button aumentarBtn = new Button("Aumentar");
        aumentarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                double progresoNovo = progressBar.getProgress() +0.1;
                progressBar.setProgress(progresoNovo);

            }
        });
        vbox.getChildren().add(aumentarBtn);


        progressBar = new ProgressBar();
        progressBar.setProgress(0.0);
        vbox.getChildren().add(progressBar);

        Button diminuirBtn = new Button("Diminuír");
        diminuirBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                double progresoNovo = progressBar.getProgress() -0.1;
                progressBar.setProgress(progresoNovo);
            }
        });
        vbox.getChildren().add(diminuirBtn);

        ProgressIndicator progressIndicator = new ProgressIndicator();
        progressIndicator.progressProperty().bind(progressBar.progressProperty());//IMPORTANTE
        vbox.getChildren().add(progressIndicator);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}