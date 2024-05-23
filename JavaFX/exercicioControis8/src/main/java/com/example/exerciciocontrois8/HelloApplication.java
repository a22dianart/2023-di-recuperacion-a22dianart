package com.example.exerciciocontrois8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Label label;
    @Override
    public void start(Stage stage) throws IOException {

        MenuItem menu1Item1 = new MenuItem("File1");
        MenuItem menu1Item2 = new MenuItem("File2");
        Menu menu1 = new Menu("File");
        menu1.getItems().add(menu1Item1);
        menu1.getItems().add(menu1Item2);

        MenuItem menu2Item1 = new MenuItem("Option1");
        MenuItem menu2Item2 = new MenuItem("Option2");
        SeparatorMenuItem separator = new SeparatorMenuItem();
        CheckMenuItem check = new CheckMenuItem("check");
        Menu menu2 = new Menu("Options");
        menu2.getItems().add(menu2Item1);
        menu2.getItems().add(menu2Item2);
        menu2.getItems().add(separator);
        menu2.getItems().add(check);

        MenuItem menu3Item1 = new MenuItem("Help1");
        menu3Item1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    label.setText("Pulsaches axuda 1 polo menos 1 vez");
            }
        });
        Menu menu3 = new Menu("Help");
        menu3.getItems().add(menu3Item1);
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        VBox vbox = new VBox();

        vbox.getChildren().add(menuBar);

        label = new Label();
        vbox.getChildren().add(label);



        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}