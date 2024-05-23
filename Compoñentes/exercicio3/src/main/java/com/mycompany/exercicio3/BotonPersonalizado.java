/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author diana
 */
public class BotonPersonalizado extends JButton implements Serializable{
    Cor cor;
    Cor corHover;

    public BotonPersonalizado() {
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cambiarCor();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                voltarCorOrixinal();
            }
        };
        this.addMouseListener(ml);
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
        setBackground(cor.getCorFondo());
        setForeground(cor.getCorTexto());
      
    }

    public Cor getCorHover() {
        return corHover;
    }

    public void setCorHover(Cor corHover) {
        this.corHover = corHover;
    }
    
    private void cambiarCor(){
        this.setForeground(corHover.getCorTexto());
        this.setBackground(corHover.getCorFondo());
    }
    private void voltarCorOrixinal(){
        this.setForeground(cor.getCorTexto());
        this.setBackground(cor.getCorFondo());
    }
   

    
    
    
    
    
}
