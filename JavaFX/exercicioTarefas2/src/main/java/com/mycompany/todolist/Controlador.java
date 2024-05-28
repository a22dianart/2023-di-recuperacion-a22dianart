package com.mycompany.todolist;

import com.mycompany.todolist.datamodel.Tarefa;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.util.converter.LocalDateStringConverter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Controlador {
    private List<Tarefa> tarefas;
    @FXML
    private ListView<Tarefa> tarefasListView;
    @FXML
    private TextArea informacionArea;
    @FXML
    private Label datatarefaSeleccionada;
    @FXML
    private BorderPane mainBorderPane;

    public void initialize() {
        tarefas = new ArrayList<Tarefa>();
        tarefasListView.getItems().setAll(TarefasFicheiro.getInstance().getTarefas());

        tarefasListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tarefa>() { //IMPORTANTE
            @Override
            public void changed(ObservableValue<? extends Tarefa> observableValue, Tarefa tarefa, Tarefa t1) {
                mostrarTarefa();
            }
        });
        tarefasListView.getSelectionModel().select(0); //detras do listener para que mostre a primeira tarefa!!!





    }
    @FXML
    public void mostrarTarefa() {
        Tarefa tarefaSeleccionada = tarefasListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder();
        sb.append(tarefaSeleccionada.getDetalles());
        informacionArea.setText(sb.toString());

        LocalDate data = tarefaSeleccionada.getDataLimite();

        Locale galicianLocale = new Locale("gl", "ES");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", galicianLocale);
        String dataFormateada = data.format(formatter);

        datatarefaSeleccionada.setText(dataFormateada);
    }

    @FXML
    public void onSairClick(ActionEvent actionEvent) {
        System.exit(0);

    }

    @FXML
    public void onNovoClick(ActionEvent actionEvent) {
        mostrarDialogoNovaTarefa();
    }

    public void mostrarDialogoNovaTarefa(){
        Dialog<ButtonType> dialog = new Dialog<>();

        dialog.initOwner(mainBorderPane.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("novaTarefaDialogo.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Non se puido cargar o diálogo");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            NovaTarefaDialogoController controladorDialogo = fxmlLoader.getController();
            Tarefa novaTarefa = controladorDialogo.procesarResultados();

            tarefasListView.getItems().setAll(TarefasFicheiro.getInstance().getTarefas()); //para que se vexa a nova tarefa
            tarefasListView.getSelectionModel().select(novaTarefa); //para que se seleccione a nova tarefa
        } else {
            System.out.println("Cancel pressed");
        }
    }


}