/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectolista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {
    private ListPanel listPanel;
    private AccionsPanel accionsPanel;
    

    public MainFrame() {
        super("Listado");
        setLayout(new BorderLayout());
        
        listPanel = new ListPanel();
        accionsPanel = new AccionsPanel();
        
        add(listPanel, BorderLayout.CENTER);
        add(accionsPanel, BorderLayout.SOUTH);
        
        accionsPanel.setBorrarListener(new AccionListener() {
            @Override
            public void inform() {
                if(listPanel.getModelo().getSize()==1){ //IMPORTANTE
                    accionsPanel.getBorrarBtn().setEnabled(false);
                }
                listPanel.borrar();
                
            }
        });
        accionsPanel.setEngadirListener(new EngadirListener() {
            @Override
            public void engadir(String name) {
                listPanel.engadirNome(name);
            }
           
        });
        
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
 
}
