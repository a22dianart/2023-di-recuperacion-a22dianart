/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author diana
 */
public class BotonPersonalizado extends JButton implements Serializable{
    Color corFondo;
    Color corTexto;

    public BotonPersonalizado() {
    }

    public Color getCorFondo() {
        return corFondo;
    }

    public void setCorFondo(Color corFondo) {
        this.corFondo = corFondo;
        this.setBackground(corFondo);
        
    }

    public Color getCorTexto() {
        return corTexto;
    }

    public void setCorTexto(Color corTexto) {
        this.corTexto = corTexto;
        this.setForeground(corTexto);
    }
    
    
    
    
}
