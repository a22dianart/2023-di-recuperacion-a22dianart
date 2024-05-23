package com.example.exercicioscenebuilder2.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.lang.constant.ConstantDesc;

public class Direccion {
    private SimpleStringProperty nome;
    private SimpleStringProperty apelidos;

    private SimpleStringProperty enderezo;

    private SimpleStringProperty cidade;

    private SimpleStringProperty codPostal;

    private SimpleStringProperty dataNac;

    public Direccion(String nome, String apelidos, String enderezo, String cidade, String codPostal, String dataNac) {
        this.nome = new SimpleStringProperty(nome);
        this.apelidos = new SimpleStringProperty(apelidos);
        this.enderezo = new SimpleStringProperty(enderezo);
        this.cidade = new SimpleStringProperty(cidade);
        this.codPostal = new SimpleStringProperty(codPostal);
        this.dataNac = new SimpleStringProperty(dataNac);
    }

    public String getNome() {
        return nome.get();
    }
    public void setNome(String nome) {
        this.nome.set(nome);
    }
    public StringProperty nomeProperty() {
        return nome;
    }

    public String getApelidos() {
        return apelidos.get();
    }
    public void setApelidos(String apelidos) {
        this.apelidos.set(apelidos);
    }
    public StringProperty apelidosProperty() {
        return apelidos;
    }

    public String getEnderezo() {
        return enderezo.get();
    }
    public void setEnderezo(String enderezo) {
        this.enderezo.set(enderezo);
    }
    public StringProperty enderezoProperty() {
        return enderezo;
    }

    public String getCidade() {
        return cidade.get();
    }
    public void setCidade(String cidade) {
        this.cidade.set(cidade);
    }
    public StringProperty cidadeProperty() {
        return cidade;
    }

    public String getCodPostal() {
        return nome.get();
    }
    public void setCodPostal(String codPostal) {
        this.codPostal.set(codPostal);
    }
    public StringProperty codPostalProperty() {
        return codPostal;
    }

    public String getDataNac() {
        return dataNac.get();
    }
    public void setDataNac(String dataNac) {
        this.dataNac.set(dataNac);
    }
    public StringProperty dataNacProperty() {
        return dataNac;
    }
}
