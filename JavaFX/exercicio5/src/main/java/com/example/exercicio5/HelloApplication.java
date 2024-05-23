package com.example.exercicio5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10.0);
        gridPane.setVgap(10.0);
        gridPane.setPadding(new Insets(25,25,25,25));
        gridPane.setPrefHeight(275);
        gridPane.setPrefWidth(400);



        Label welcomeLbl = new Label("Welcome");
        welcomeLbl.setStyle("-fx-font-size: 24; -fx-font-weight: bold;");

        gridPane.add(welcomeLbl, 0, 0, 1, 1);


        Label userLbl = new Label("User name: ");
        gridPane.add(userLbl, 0, 1, 1, 1);

        TextField userTxt = new TextField("usuario");
        gridPane.add(userTxt,1,1,1,1);

        Label passLbl = new Label("Password: ");
        gridPane.add(passLbl,0,2,1,1);

        TextField passTxt = new TextField();
        gridPane.add(passTxt, 1,2,1,1);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        Button loginBtn = new Button("Login");
        hBox.getChildren().add(loginBtn);

        gridPane.add(hBox,0,3,2,1);



        Scene scene = new Scene(gridPane, 320, 240);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}