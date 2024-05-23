package com.example.exerciciocontrois10;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    private Rectangle rectangle;
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        ToggleButton toggleVermello = new ToggleButton("Vermello");
        ToggleButton toggleVerde = new ToggleButton("Verde");
        ToggleButton toggleAzul = new ToggleButton("Azul");
        ToggleGroup group = new ToggleGroup();
        toggleVermello.setToggleGroup(group);
        toggleVerde.setToggleGroup(group);
        toggleAzul.setToggleGroup(group);

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                if (group.getSelectedToggle() != null) {
                    ToggleButton selected = (ToggleButton) group.getSelectedToggle();
                    if("Vermello".equals(selected.getText())){
                        rectangle.setStyle("-fx-fill: red;");
                    }else if ("Verde".equals(selected.getText())){
                        rectangle.setStyle("-fx-fill: green;");
                    }else if ("Azul".equals(selected.getText())){
                        rectangle.setStyle("-fx-fill: blue;");
                    }
                }
            }
        });

        rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(30);
        rectangle.setStyle("-fx-fill: black;"); //moi importantee!!! o de background no!

        vbox.getChildren().add(toggleVermello);
        vbox.getChildren().add(toggleVerde);
        vbox.getChildren().add(toggleAzul);
        vbox.getChildren().add(rectangle);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}