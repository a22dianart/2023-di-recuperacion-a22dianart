/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandotabbedpane.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author diana
 */
public class PreferencesDialog extends JDialog{

    private JPanel buttonsPanel;
    private CenterDialogPanel centerPanel;
    private PreferencesListener preferencesListener;
    
    public PreferencesDialog(Frame parent, String name, String password, int port) {
        super(parent, "Preferences", false);
        setLayout(new BorderLayout());
        
        FlowLayout buttonsLayout = new FlowLayout(FlowLayout.RIGHT);
        buttonsPanel = new JPanel(buttonsLayout);
        
        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");
        okBtn.setPreferredSize(cancelBtn.getPreferredSize());
        
        
        okBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(preferencesListener!=null){
                    String[] newPreferences = centerPanel.getNewPreferences();
                    preferencesListener.setPreferences(newPreferences);
                    dispose();
                }
                
                
            }
             
            
        });
        
        cancelBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });
        
        
        buttonsPanel.add(okBtn);
        buttonsPanel.add(cancelBtn);
        
        centerPanel = new CenterDialogPanel(name, password,port);
        add(centerPanel, BorderLayout.CENTER);
        
        add(buttonsPanel, BorderLayout.SOUTH);
        
        
        this.setLocationRelativeTo(parent);
        setSize(350, 300);
        setVisible(true);
    }

    public void setPreferencesListener(PreferencesListener preferencesListener) {
        this.preferencesListener = preferencesListener;
    }
    
    
}
