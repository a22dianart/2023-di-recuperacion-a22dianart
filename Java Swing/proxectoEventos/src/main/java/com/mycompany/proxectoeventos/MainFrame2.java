/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoeventos;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame2 extends JFrame{

    public MainFrame2() {
        super("Un frame");
        setSize(600, 500);
        
        
        //layout 
        setLayout(new FlowLayout());
        JButton button1 = new JButton("1");
        JButton button2= new JButton("2");
        JButton button3 = new JButton("3");
        
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand()=="1"){ //IMPORTANTE
                    
                    setTitle("boton1");
                    
                }else if (e.getActionCommand()=="2"){
                    setTitle("boton2");
                }else{
                    setTitle("boton3");
                }
            }
        };
        
        button1.addActionListener(al);//IMPORTANTE
        button2.addActionListener(al);
        button3.addActionListener(al);


        add(button1);
        add(button2);
        add(button3);
        
        

   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }

  
}