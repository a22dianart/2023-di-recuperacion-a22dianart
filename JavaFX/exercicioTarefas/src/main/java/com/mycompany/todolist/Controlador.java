package com.mycompany.todolist;

import com.mycompany.todolist.datamodel.Tarefa;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TextArea;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Controlador {
    private List<Tarefa> tarefas;
    @FXML
    private ListView<Tarefa> tarefasListView;
    @FXML
    private TextArea informacionArea;
    @FXML
    private Label datatarefaSeleccionada;

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

}