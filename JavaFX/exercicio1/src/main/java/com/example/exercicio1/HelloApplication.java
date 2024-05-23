package com.example.exercicio1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private int clicks =0;
    private Button boton;
    private Label label;
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        label = new Label();
        label.setStyle("-fx-font-size: 20; -fx-text-fill: blue; -fx-font-weight: bold; -fx-font-family: 'Times New Roman';"); //IMPORTANTEEE
        vbox.getChildren().add(label);
        boton = new Button("Click");
        boton.setOnAction((e) -> aumentarCliks());

        Button botonSair = new Button("_SAIR");
        botonSair.setOnAction((e) -> Platform.exit());
        botonSair.setTooltip(new Tooltip("Para sair da app"));


        vbox.getChildren().add(boton);
        vbox.getChildren().add(botonSair);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("CLICKS");
        stage.setScene(scene);
        stage.show();
    }

    private void aumentarCliks(){
        clicks++;
        label.setText(String.valueOf(clicks));
    }


    public static void main(String[] args) {
        launch();
    }
}