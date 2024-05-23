package com.example.exerciciocontactos.datamodel;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contact {
    private SimpleStringProperty nome;
    private SimpleStringProperty apelidos;
    private SimpleStringProperty telefono;
    private SimpleStringProperty notas;
    public Contact(String nome, String apelidos, String telefono, String notas) {
        this.nome = new SimpleStringProperty(nome);
        this.apelidos = new SimpleStringProperty(apelidos);
        this.telefono = new SimpleStringProperty(telefono);
        this.notas = new SimpleStringProperty(notas);
    }

    public String getNome() {
        return nome.get();
    }
    public void setNome(String nome) {
        this.nome.set(nome);
    }
    public SimpleStringProperty nomeProperty() {
        return nome;
    }

    public String getApelidos() {
        return apelidos.get();
    }
    public void setApelidos(String apelidos) {
        this.apelidos.set(apelidos);
    }
    public SimpleStringProperty apelidosProperty() {
        return apelidos;
    }

    public String getTelefono() {
        return telefono.get();
    }
    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }
    public SimpleStringProperty telefonoProperty() {
        return telefono;
    }

    public String getNotas() {
        return notas.get();
    }
    public void setNotas(String notas) {
        this.notas.set(notas);
    }
    public SimpleStringProperty notasProperty() {
        return notas;
    }




}
