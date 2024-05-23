/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

import java.io.Serializable;

/**
 *
 * @author diana
 */
public class Alarma implements Serializable{
    private boolean programada;
    private int hora;
    private int minuto;
    private int segundo;

    public Alarma(boolean programada, int hora, int minuto, int segundo) {
        this.programada = programada;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public boolean isProgramada() {
        return programada;
    }

    public void setProgramada(boolean programada) {
        this.programada = programada;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        if(!programada){
            return "NOT SET";
        }else{
            return hora+":"+minuto+":"+segundo;
        }
    }
    
}
