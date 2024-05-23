/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio22;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author diana
 */
public class BotonPersonalizado extends JButton implements Serializable{
    Cor cor;

    public BotonPersonalizado() {
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
        setBackground(cor.getCorFondo());
        setForeground(cor.getCorTexto());
      
    }

    
    
    
    
    
}
