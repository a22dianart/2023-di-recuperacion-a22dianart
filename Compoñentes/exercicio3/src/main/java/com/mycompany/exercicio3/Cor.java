/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author diana
 */
public class Cor implements Serializable{
    Color corTexto;
    Color corFondo;
    
    
    public Cor(Color corTexto, Color corFondo) {
        this.corTexto = corTexto;
        this.corFondo = corFondo;
    }

    public Color getCorTexto() {
        return corTexto;
    }

    public void setCorTexto(Color corTexto) {
        this.corTexto = corTexto;
    }

    public Color getCorFondo() {
        return corFondo;
    }

    public void setCorFondo(Color corFondo) {
        this.corFondo = corFondo;
    }

    @Override
    public String toString() {
        return "corTexto ="+corTexto + ", corFondo=" + corFondo;
    }
    
    

    
    
    
}
