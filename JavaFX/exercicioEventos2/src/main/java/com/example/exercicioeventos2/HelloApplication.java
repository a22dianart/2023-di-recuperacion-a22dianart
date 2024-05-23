package com.example.exercicioeventos2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);


        //CONTEXT MENU
        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem1 = new MenuItem("menu item 1");
        menuItem1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("menu item 1");
            }
        });

        MenuItem menuItem2 = new MenuItem("menu item 2");

        menuItem2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("menu item 2");
            }
        });
        MenuItem menuItem3 = new MenuItem("menu item 3");
        menuItem3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("menu item 3");
            }
        });
        contextMenu.getItems().add(menuItem1);
        contextMenu.getItems().add(menuItem2);
        contextMenu.getItems().add(menuItem3);



        hbox.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.SECONDARY) { //MOI IMPORTANTE
                double x = event.getScreenX();
                double y = event.getScreenY();
                contextMenu.show(hbox,x,y);
            }
        });

        Scene scene = new Scene(hbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}