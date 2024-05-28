package com.mycompany.todolist;


import com.mycompany.todolist.datamodel.Tarefa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class TarefasFicheiro {
    // creación dunha instancia da clase
    private static TarefasFicheiro instance = new TarefasFicheiro();
    private static String filename = "tarefas.txt";
    private ObservableList<Tarefa> tarefas;
    private DateTimeFormatter formatter;
    private TarefasFicheiro() {
        formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
    }
    // Método para acceder á instancia da clase dun Singleton
    public static TarefasFicheiro getInstance(){
        return instance;
    }
    public ObservableList<Tarefa> getTarefas() {
        return tarefas;
    }
    public void setTarefas(ObservableList<Tarefa> tarefas) {
        this.tarefas=tarefas;
    }
    public void lerTarefas() throws IOException {
        tarefas = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);
        String input;
        try {
            while ((input = br.readLine()) != null) {
                String[] palabras = input.split("\t");
                String descricion = palabras[0];
                String detalles = palabras[1];
                String dataString = palabras[2];
                LocalDate data = LocalDate.parse(dataString, formatter);
                Tarefa tarefa = new Tarefa(descricion, detalles, data);
                tarefas.add(tarefa);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
    public void gardarTarefas() throws IOException {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try {
            Iterator<Tarefa> iterator = tarefas.iterator();
            while (iterator.hasNext()) {
                Tarefa tarefa = iterator.next();
                bw.write(String.format("%s\t%s\t%s",
                        tarefa.getDescricion(),
                        tarefa.getDetalles(),
                        tarefa.getDataLimite().format(formatter)));
                bw.newLine();
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }
    public void engadirTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void borrarTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void modificarTarefa(Tarefa tarefa, Tarefa tarefaModificada){
       // ver en que indice está tarefaorixinal para cambialo por tarefaModificada
        int indice = tarefas.indexOf(tarefa);
        tarefas.add(indice, tarefaModificada);


    }

}


