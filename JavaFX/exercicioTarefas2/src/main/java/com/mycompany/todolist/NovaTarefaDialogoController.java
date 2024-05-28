package com.mycompany.todolist;

import com.mycompany.todolist.datamodel.Tarefa;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NovaTarefaDialogoController {
    @javafx.fxml.FXML
    private TextArea detallesTxt;
    @javafx.fxml.FXML
    private TextField descricionTxt;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    public Tarefa procesarResultados() {
        Tarefa novaTarefa = new Tarefa(descricionTxt.getText(),detallesTxt.getText(), datePicker.getValue() );

        TarefasFicheiro.getInstance().engadirTarefa(novaTarefa);

        return novaTarefa;
    }

}
