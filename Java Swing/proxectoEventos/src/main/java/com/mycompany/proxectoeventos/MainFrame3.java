/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoeventos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame3 extends JFrame{
    public Color defecto;

    public MainFrame3() {
        super("Un frame");
        setSize(600, 500);
        
        
        
        
        //layout 
        setLayout(new FlowLayout());
        JButton button1 = new JButton("1");
        JButton button2= new JButton("2");
        JButton button3 = new JButton("3");
        
        defecto =button1.getBackground();
        
        
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JButton fonte = (JButton) e.getSource();

                 if(fonte==button1){ //IMPORTANTE
                    
                    setTitle("boton1");
                    
                }else if (fonte==button2){
                    setTitle("boton2");
                }else{
                    setTitle("boton3");
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
                JButton fonte = (JButton) e.getSource();

                 if(fonte==button1){ //IMPORTANTE
                    
                    button1.setBackground(Color.red);
                    
                }else if (fonte==button2){
                    button2.setBackground(Color.green);
                }else{
                    button3.setBackground(Color.blue);
                }
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                JButton fonte = (JButton) e.getSource();

                 if(fonte==button1){ //IMPORTANTE
                    
                    button1.setBackground(defecto);
                    
                }else if (fonte==button2){
                    button2.setBackground(defecto);
                }else{
                    button3.setBackground(defecto);
                }
                
               
            }
        };

        button1.addMouseListener(ml);
        button2.addMouseListener(ml);
        button3.addMouseListener(ml);


        add(button1);
        add(button2);
        add(button3);
        
        

   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }

  
}
