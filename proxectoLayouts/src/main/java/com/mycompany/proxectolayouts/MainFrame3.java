/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectolayouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame3 extends JFrame {
    private JTextField calculoTxt;

    public MainFrame3() {
        super("Calculadora");
        setLayout(new BorderLayout());
        
        calculoTxt= new JTextField();
        calculoTxt.setEditable(false);
        
        add(calculoTxt, BorderLayout.NORTH);
        JPanel buttonPanel= new JPanel(new GridLayout(4, 4)); //IMPORTANTE
        
        //IMPORTANTE
        String[] botons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
            
        };
        
        ActionListener al = new ActionListener() { //esto está de máis
            @Override
            public void actionPerformed(ActionEvent e) {
                String engadir = e.getActionCommand();
                String texto = calculoTxt.getText();
                String novoTexto = texto +engadir;
                calculoTxt.setText(novoTexto);
            }
        };
        
        for (String boton: botons){
            JButton button = new JButton(boton);
            button.addActionListener(al);
            buttonPanel.add(button);
           
        }
        add(buttonPanel, BorderLayout.CENTER);
        
        
        
        
        setSize(400, 300);
        setMinimumSize(new Dimension(300,300)); //IMPORTANTE
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
