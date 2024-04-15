/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizando;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author diana
 */
public class ToolbarPanel extends JPanel { //SEN FUNCIONALIDADE

    private JButton helloBtn;
    private JButton goodbyeBtn;
    

    public ToolbarPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        helloBtn = new JButton("Hello");
        goodbyeBtn = new JButton("Goodbye");
        
      
        add(helloBtn);
        add(goodbyeBtn);
        
    
       

    }

   
}
