/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandotoolbar.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author diana
 */
public class Toolbar extends JToolBar { //IMPORTANTE

    private JButton importButton;
    private JButton saveButton;
    
    private ToolbarListener toolbarListener;


    public Toolbar() {
        
        setFloatable(false);//IMPORTANTISIMO (para que non se poida mover)
        importButton = new JButton();
        importButton.setActionCommand("import");
        saveButton = new JButton();
        saveButton.setActionCommand("save");
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toolbarListener != null) {
                    if("import".equals(e.getActionCommand())){
                        toolbarListener.importar();
                    }else{
                        toolbarListener.exportar();
                    }
                   
                }
            }
        };
        importButton.addActionListener(al);
        saveButton.addActionListener(al);
        
        importButton.setToolTipText("Importar datos");
        saveButton.setToolTipText("Exportar datos");
        
        importButton.setIcon(createIcon("/import.png"));
        saveButton.setIcon(createIcon("/export.png"));
        
        add(importButton);
        add(saveButton);
 

        
    }
    public void setOptionListener(ToolbarListener listener) {
        this.toolbarListener = listener;
    }
     private ImageIcon createIcon(String path) {
        URL url = getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable to load image: " + path);
        }
        ImageIcon icon = new ImageIcon(url);
        return icon;
    }



}
