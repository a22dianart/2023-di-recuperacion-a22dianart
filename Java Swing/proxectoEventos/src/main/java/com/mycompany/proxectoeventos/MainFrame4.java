/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoeventos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */

public class MainFrame4 extends JFrame{

    public MainFrame4() {
        super("Un frame");
        setSize(600, 500);
        
        
        //layout 
        setLayout(new FlowLayout());
        JButton boton1 = new JButton("boton1");
        JButton boton2 = new JButton("boton2");
        JLabel resultadoLbl = new JLabel("");
        
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JButton fonte = (JButton) e.getSource();
                if (fonte==boton1){
                    resultadoLbl.setText("boton 1");
                }else if (fonte==boton2){
                    resultadoLbl.setText("boton 2");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        
        boton1.addMouseListener(ml);
        boton2.addMouseListener(ml);

        add(boton1);
        add(boton2);
        add(resultadoLbl);
        

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }

   
}
