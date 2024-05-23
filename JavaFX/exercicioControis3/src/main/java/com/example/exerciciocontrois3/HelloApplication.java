package com.example.exerciciocontrois3;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        Label label = new Label();
        vbox.getChildren().add(label);

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("item1", "item2", "item3");
        choiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() { //IMPORTANTE
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                label.setText(t1.toString());
            }
        });

        vbox.getChildren().add(choiceBox);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}