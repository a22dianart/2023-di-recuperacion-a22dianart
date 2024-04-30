/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xestionclientes.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author diana
 */
public class Cliente {
    private String nome;
    private String apelidos;
    private Date dataAlta;
    private String provincia;

    public Cliente(String nome, String apelidos, Date dataAlta, String provincia) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.dataAlta = dataAlta;
        this.provincia = provincia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String[] toArray() {
        String[] array = new String[4];
        array[0] = nome;
        array[1] = apelidos;
        array[2] = formatearData(dataAlta);
        array[3] = provincia;
        return array;
    }
    public String formatearData(Date data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(data);
        return formattedDate;
    }

}
