package com.example.exerciciocontrois7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TabPane tabPane = new TabPane();

        Label label = new Label("Texto na tabela 1");
        Tab tab = new Tab();
        tab.setText("TAB 1");
        tab.setContent(label);
        tabPane.getTabs().add(tab);

        Label label2 = new Label("Texto na tabela 2");
        Tab tab2 = new Tab();
        tab2.setText("TAB 2");
        tab2.setContent(label2);
        tabPane.getTabs().add(tab2);


        Scene scene = new Scene(tabPane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}