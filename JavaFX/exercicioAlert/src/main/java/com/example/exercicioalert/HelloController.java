package com.example.exercicioalert;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;

public class HelloController {


    @FXML
    public void onEClick(ActionEvent actionEvent) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Escriba nome");
        dialog.setHeaderText(null);
        dialog.setContentText(null);
        dialog.setResultConverter(buttonType -> {
            if (buttonType == ButtonType.OK) {
                String selectedColor = dialog.getEditor().getText();
                System.out.println("O nome é: " + selectedColor);
            }
            return String.valueOf(buttonType);
        });
        dialog.showAndWait();

    }

    @FXML
    public void onCClick(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Este é o título");
        alert.setHeaderText("Esto é o header");
        alert.setContentText("Este é o content");

        alert.showAndWait();
    }

    @FXML
    public void onFClick(ActionEvent actionEvent) {
        List<String> colors = List.of("Red", "Yellow", "Green");
        ChoiceDialog choiceDialog = new ChoiceDialog<>("Yellow", colors);
        choiceDialog.setTitle("Escolla");
        choiceDialog.setHeaderText("Cal é a súa opción??");
        choiceDialog.setResultConverter(buttonType -> {
            if (buttonType == ButtonType.OK) {
                String selectedColor = (String) choiceDialog.getSelectedItem();
                System.out.println("Opción seleccionada: " + selectedColor);
            }
            return buttonType;
        });
        //PARA A ICONA DA ESQUINA
        Stage stage = (Stage) choiceDialog.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("/icona.png").toString()));
        //************************
        //PARA CAMBIAR A ICONA DA PREGUNTA (O DO EXERCICIO)!!!
        choiceDialog.setGraphic(new ImageView(this.getClass().getResource("/icona.png").toString()));
        //*************************************************************

        choiceDialog.showAndWait();
    }

    @FXML
    public void onBClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR, "Este é o título");
        alert.setHeaderText("Esto é o header");
        alert.setContentText("Este é o content");
        alert.showAndWait();
    }

    @FXML
    public void onAClick(ActionEvent actionEvent) {
        List<String> colors = List.of("Red", "Yellow", "Green");
        ChoiceDialog choiceDialog = new ChoiceDialog<>("Yellow", colors);
        choiceDialog.setTitle("Escolla");
        choiceDialog.setHeaderText("Cal é a súa opción??");
        choiceDialog.setResultConverter(buttonType -> {
            if (buttonType == ButtonType.OK) {
                String selectedColor = (String) choiceDialog.getSelectedItem();
                System.out.println("Opción seleccionada: " + selectedColor);
            }
            return buttonType;
        });
        choiceDialog.showAndWait();

    }

    @FXML
    public void onDClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING, "Este é o título");
        alert.setHeaderText("Esto é o header");
        alert.setContentText("Este é o content");
        alert.showAndWait();
    }



}