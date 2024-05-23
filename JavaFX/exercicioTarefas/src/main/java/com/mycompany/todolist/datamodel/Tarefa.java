package com.mycompany.todolist.datamodel;

import java.time.LocalDate;

public class Tarefa {
    private String descricion;
    private String detalles;
    private LocalDate dataLimite;

    public Tarefa(String descricion, String detalles, LocalDate dataLimite) {
        this.descricion = descricion;
        this.detalles = detalles;
        this.dataLimite = dataLimite;
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
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    @Override
    public String toString() {
        return descricion;
    }
}
