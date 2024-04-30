/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectolista;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author diana
 */
public class AccionsPanel extends JPanel {

    private JButton borrarBtn;
    private JTextField engadirTxt;
    private JButton engadirBtn;
    private AccionListener borrarListener;
    private EngadirListener engadirListener;
    

    public AccionsPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER)); // BoxLayout horizontal

        borrarBtn = new JButton("Borrar");


        //IMPORTANTE
        JSeparator separador = new JSeparator(JSeparator.VERTICAL);
        separador.setPreferredSize(new Dimension(1,25));
        separador.setBackground(Color.BLUE);

        //*************
        engadirTxt = new JTextField(10);
        engadirBtn = new JButton("Engadir");
        engadirBtn.setEnabled(false);
        
        borrarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (borrarListener != null) {
                   borrarListener.inform();
                  
                }
            }
        });
        
        engadirBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (engadirListener != null) {
                    engadirListener.engadir(engadirTxt.getText());
                    

                }
            }
        });
        engadirTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!"".equals(engadirTxt.getText())){
                   engadirBtn.setEnabled(true);
               }
          
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               if ("".equals(engadirTxt.getText())){
                   engadirBtn.setEnabled(false);
               }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        
        engadirTxt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER&&!"".equals(engadirTxt.getText())){
                    if (engadirListener != null) {
                        engadirListener.engadir(engadirTxt.getText());

                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
            
        });


        add(borrarBtn);
        add(separador);
        add(engadirTxt);
        add(engadirBtn);

        
    }
    public void setBorrarListener(AccionListener listener) {
        this.borrarListener = listener;
    }
    public void setEngadirListener(EngadirListener listener){
        this.engadirListener= listener;
    }

    public JButton getBorrarBtn() {
        return borrarBtn;
    }
    
    
}
