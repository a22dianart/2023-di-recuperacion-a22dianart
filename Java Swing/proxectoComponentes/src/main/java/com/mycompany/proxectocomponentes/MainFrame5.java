/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomponentes;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author diana
 */
public class MainFrame5 extends JFrame {
    private JTextArea textArea; //area de texto 
    private JTextField textField; //campo de texto
    private String texto = "";

    public MainFrame5() {
        super("compoñentes");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);  
        textArea.setWrapStyleWord(true);  
        textArea.setEditable(false);
        textField = new JTextField("");
        
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        
        textField.addFocusListener(new FocusListener() { //IMPORTANTE
            @Override
            public void focusGained(FocusEvent e) {
                
                textField.addKeyListener(keyListener);
            }

            @Override
            public void focusLost(FocusEvent e) {
    
                textField.removeKeyListener(keyListener);
            }
        });

        
        
        
        add(panel);
        add(textField);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
     KeyListener keyListener = new KeyAdapter() { //IMPORTANTE
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER){
                String engadido =textField.getText();
                String antigo = textArea.getText();
                textArea.setText(antigo +" "+ engadido);
                textField.selectAll(); //IMPORTANTE
             

            }
        }
    };

   
}

