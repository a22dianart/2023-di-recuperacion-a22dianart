package com.mycompany.todolist.datamodel;


import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.time.LocalDate;

public class Tarefa {
    private String descricion;
    private String detalles;
    private ObjectProperty<LocalDate> dataLimite;

    public Tarefa(String descricion, String detalles, LocalDate dataLimite) {
        this.descricion = descricion;
        this.detalles = detalles;
        this.dataLimite = new SimpleObjectProperty<>(dataLimite);

    }




    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getDataLimite() {
        return dataLimite.get();
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = new SimpleObjectProperty<LocalDate>(dataLimite);
    }
    public ObjectProperty<LocalDate> dataLimiteProperty(){
        return dataLimite;
    }

    @Override
    public String toString() {
        return descricion;
    }

}
