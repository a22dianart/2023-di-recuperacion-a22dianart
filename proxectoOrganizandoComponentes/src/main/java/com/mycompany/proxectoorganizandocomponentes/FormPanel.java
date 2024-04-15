/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandocomponentes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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

        JTextField nameTxt = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets.right = 0;

        add(nameTxt, gbc);
        JTextField occupationTxt = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 1;

        add(occupationTxt, gbc);

        JButton okBtn = new JButton("OK");

        gbc.gridx = 1;
        gbc.gridy = 2;

        add(okBtn, gbc);
        
        Dimension dimension = new Dimension(250, 300);

        setPreferredSize(dimension); //IMPORTANTE
     
    }
    
}
