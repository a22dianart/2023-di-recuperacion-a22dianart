package com.mycompany.todolist.datamodel;


import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;

public class Tarefa {
    private String descricion;
    private String detalles;
    private SimpleObjectProperty<LocalDate> dataLimite;

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
        this.dataLimite.set(dataLimite);
    }

    public SimpleObjectProperty<LocalDate> dataLimiteProperty(){
        return dataLimite;
    }

    @Override
    public String toString() {
        return descricion;
    }

}
