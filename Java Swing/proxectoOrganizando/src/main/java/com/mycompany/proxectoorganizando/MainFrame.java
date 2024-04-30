/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizando;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private ToolbarPanel toolbarPanel;
    private JButton aceptarButton;

    public MainFrame() {
        super("Ola Mundo!");
// Establecer o Layout
        setLayout(new BorderLayout());
// Inicializar os compoñentes
        textPanel = new TextPanel();
        toolbarPanel = new ToolbarPanel();
        
        aceptarButton = new JButton("Aceptar");
        aceptarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textPanel.appendText("Hello\n");
            }
        });
// engadir os compoñentes
        add(toolbarPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(aceptarButton, BorderLayout.PAGE_END);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
