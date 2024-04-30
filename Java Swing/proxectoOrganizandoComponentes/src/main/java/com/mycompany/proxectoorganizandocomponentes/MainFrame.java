/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandocomponentes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private ToolbarPanel toolbarPanel;
    private JButton aceptarButton;
    private FormPanel formPanel;

    public MainFrame() {
        super("Ola Mundo!");
// Establecer o Layout
        setLayout(new BorderLayout());
// Inicializar os compoñentes
        textPanel = new TextPanel();
        toolbarPanel = new ToolbarPanel();
        formPanel = new FormPanel();
        
      
        
        aceptarButton = new JButton("Aceptar");
        aceptarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textPanel.appendText("Hello\n");
            }
        });
        
        toolbarPanel.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

// engadir os compoñentes
        add(toolbarPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.WEST); //IMPORTANTE
        add(textPanel, BorderLayout.CENTER); //IMPORTANTE
        add(aceptarButton, BorderLayout.PAGE_END);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension minDimension= new Dimension(400,350); 
        setMinimumSize(minDimension);//IMPORTANTES
        setVisible(true);
    }
}
