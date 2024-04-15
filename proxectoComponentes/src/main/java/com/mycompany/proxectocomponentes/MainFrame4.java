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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame4 extends JFrame {

    public MainFrame4() {
        super("compoñentes");

        JTextArea textArea = new JTextArea(5, 20); //IMPORTANTE
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        textArea.setLineWrap(true);  // axustase ao ancho IMPORTANTE
        textArea.setWrapStyleWord(true);  //evita que se rompan as palabras IMPORTANTE

        JPanel panel = new JPanel();
        panel.add(scrollPane);

        add(panel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

   
}

