/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoataeventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        super("Un frame");
        setSize(600, 500);
        
        
        //layout 
        setLayout(new BorderLayout());
        JLabel dianaLbl = new JLabel("diana", SwingConstants.CENTER);//IMPORTANTE
        
        dianaLbl.setFont(new Font("Arial", Font.ITALIC, 24));
        dianaLbl.setOpaque(true); //para o background!!!
        dianaLbl.setBackground(Color.green);
        
    
        add(dianaLbl, BorderLayout.PAGE_START);
        
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//IMPORTANTE
        setResizable(false); //IMPORTANTE
        setVisible(true);
    }
}
