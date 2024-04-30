/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandoeventos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author diana
 */
public class FormPanel extends JPanel{
    private FormListener formListener;
    private JTextField nameTxt;
    private JTextField occupationTxt;
    public FormPanel(){
        setLayout(new GridBagLayout());
        
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        this.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel nameLbl = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END; 
        gbc.insets.right = 5; 

        add(nameLbl, gbc);

        JLabel occupationLbl = new JLabel("Occupation:");
        gbc.gridy = 1;

        add(occupationLbl, gbc);

         nameTxt = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets.right = 0;

        add(nameTxt, gbc);
         occupationTxt = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 1;

        add(occupationTxt, gbc);

        JButton okBtn = new JButton("OK");

        gbc.gridx = 1;
        gbc.gridy = 2;
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (formListener != null) {
                        FormEvent se = new FormEvent(this, nameTxt.getText(), occupationTxt.getText());
                        formListener.textEmitted(se);
                }
            }
        };
        
        okBtn.addActionListener(al);

        add(okBtn, gbc);
        
        Dimension dimension = new Dimension(250, 300);

        setPreferredSize(dimension); //IMPORTANTE
     
    }
    public void setFormListener(FormListener listener) {
        this.formListener = listener;
    }
    
}
