package com.mycompany.todolist;

import com.mycompany.todolist.datamodel.Tarefa;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EditarTarefaDialogoController {
    @javafx.fxml.FXML
    private TextArea detallesTxt;
    @javafx.fxml.FXML
    private TextField descricionTxt;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    private Tarefa tarefaEditar;

    public void initialize(){

    }

    public void setTarefaEditar(Tarefa tarefaEditar) {
        this.tarefaEditar = tarefaEditar;
        detallesTxt.setText(tarefaEditar.getDetalles());
        descricionTxt.setText(tarefaEditar.getDescricion());
        datePicker.setValue(tarefaEditar.getDataLimite());


    }


    public Tarefa procesarResultado() {


        TarefasFicheiro.getInstance().modificarTarefa(tarefaEditar, detallesTxt.getText(), descricionTxt.getText(), datePicker.getValue());

        return tarefaEditar;
    }
}
