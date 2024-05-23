package com.example.exerciciocontrois1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10.0);



        Label nomeLbl = new Label("_Nome:");
        nomeLbl.setMnemonicParsing(true);//IMPORTANTE
        GridPane.setHalignment(nomeLbl, HPos.RIGHT);//IMPORTANTE
        gridPane.add(nomeLbl,0,0,1,1);
        TextField nomeTxt= new TextField();
        nomeLbl.setLabelFor(nomeTxt);//IMPORTANTE
        gridPane.add(nomeTxt,1,0,1,1);

        Label enderezoLbl = new Label("_Enderezo:");
        enderezoLbl.setMnemonicParsing(true);
        GridPane.setHalignment(enderezoLbl, HPos.RIGHT);
        gridPane.add(enderezoLbl,0,1,1,1);
        TextField enderezoTxt= new TextField();
        enderezoLbl.setLabelFor(enderezoTxt);
        gridPane.add(enderezoTxt,1,1,1,1);

        Label ocupacionLbl = new Label("_Ocupación:");
        ocupacionLbl.setMnemonicParsing(true);
        GridPane.setHalignment(ocupacionLbl, HPos.RIGHT);
        gridPane.add(ocupacionLbl, 0,2,1,1);
        TextField ocupacionTxt= new TextField();
        ocupacionLbl.setLabelFor(ocupacionTxt);
        gridPane.add(ocupacionTxt,1,2,1,1);




        Scene scene = new Scene(gridPane, 320, 240);
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}