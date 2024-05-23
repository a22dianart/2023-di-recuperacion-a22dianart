package com.example.exercicioeventos1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(30);
        rectangle.setWidth(40);

        EventHandler<MouseEvent> handler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                StringBuilder sb = new StringBuilder();
                sb.append("Source: "+ event.getSource()+"\n");
                sb.append("Target: "+event.getTarget()+"\n");
                sb.append("Type: "+event.getEventType()+"\n");
                sb.append("X: "+event.getX()+"\n"); //respecto da app en si
                sb.append("Y: "+event.getY()+"\n");
                System.out.println(sb.toString());
            }
        };

        rectangle.setOnMouseClicked(handler1);
        vbox.setOnMouseClicked(handler1);


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