/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomponentes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame2 extends JFrame {
    
    private JTextField numField;
    private JButton incrementarBtn;
    private JButton reiniciarBtn;
    
    private int numero =0;

    public MainFrame2() {
        super("Frame componentes");
        setSize(600, 500);
        setLayout(new FlowLayout());
        
        numField= new JTextField(5);
        numField.setText(String.valueOf(numero));
        incrementarBtn = new JButton("incrementar");
        reiniciarBtn = new JButton("reiniciar");
        
        incrementarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                numero++;
                numField.setText(String.valueOf(numero));
            }
        });
        
        reiniciarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                numero=0;
                numField.setText(String.valueOf(numero));
            }
        });

        
        add(numField);
        add(incrementarBtn);
        add(reiniciarBtn);
        
        
        
        
        
        
        
        
        setLocationRelativeTo(null);
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
