package com.example.exerciciocontrois9;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);

        RadioButton raddioButton1 = new RadioButton("Boton 1");
        RadioButton raddioButton2 = new RadioButton("Boton 2");
        RadioButton raddioButton3 = new RadioButton("Boton 3");

        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.getToggles().add(raddioButton1);
        toggleGroup.getToggles().add(raddioButton2);
        toggleGroup.getToggles().add(raddioButton3);
        toggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                if (toggleGroup.getSelectedToggle() != null) {
                    RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
                    label.setText("Selected: " + selectedRadioButton.getText());
                }
            }
        });

        label = new Label();

        vbox.getChildren().add(raddioButton1);
        vbox.getChildren().add(raddioButton2);
        vbox.getChildren().add(raddioButton3);
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