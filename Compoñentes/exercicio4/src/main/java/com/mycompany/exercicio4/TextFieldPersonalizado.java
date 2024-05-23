/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author diana
 */
public class TextFieldPersonalizado extends JTextField implements Serializable{
    boolean soNumeros=false;

    public TextFieldPersonalizado() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (soNumeros) {
                    if (!Character.isDigit(e.getKeyChar())) {
                        e.consume();
                    }
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
       
        this.addKeyListener(kl);
       
    }

    public boolean isSoNumeros() {
        return soNumeros;
    }

    public void setSoNumeros(boolean soNumeros) {
        this.soNumeros = soNumeros;
        
        
    }
   
  
    

   
}
