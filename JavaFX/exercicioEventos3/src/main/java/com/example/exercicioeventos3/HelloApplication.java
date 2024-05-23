package com.example.exercicioeventos3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Label label;
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        label = new Label();
        vbox.getChildren().add(label);

        Button boton1 = new Button("1");
        Button boton2 = new Button("2");
        Button boton3 = new Button("3");
        Button boton4 = new Button("4");
        vbox.getChildren().add(boton1);
        vbox.getChildren().add(boton2);
        vbox.getChildren().add(boton3);
        vbox.getChildren().add(boton4);

        EventHandler<ActionEvent> handler1 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button pulsado = (Button) actionEvent.getSource();
                label.setText(pulsado.getText());
            }
        };

        boton1.setOnAction(handler1);
        boton2.setOnAction(handler1);
        boton3.setOnAction(handler1);
        boton4.setOnAction(handler1);


        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}