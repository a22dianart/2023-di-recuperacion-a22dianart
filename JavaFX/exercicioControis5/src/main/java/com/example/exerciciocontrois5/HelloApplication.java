package com.example.exerciciocontrois5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HelloApplication extends Application {
    private Label label;
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);

        DatePicker datePicker = new DatePicker();
        datePicker.setOnAction(e -> {
            LocalDate date = datePicker.getValue();
            label.setText(showDate(date));

        });

        vbox.getChildren().add(datePicker);

        label = new Label();
        vbox.getChildren().add(label);

        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }
    private String showDate(LocalDate localDate){ //MOI IMPORTANTE



        Locale galicianLocale = new Locale("gl", "ES");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy",galicianLocale);

        String formattedDate = localDate.format(formatter);

        return formattedDate;
    }

    public static void main(String[] args) {
        launch();
    }
}