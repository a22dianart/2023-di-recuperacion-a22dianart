/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandospinner.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

/**
 *
 * @author diana
 */
public class CenterDialogPanel extends JPanel{
    private JTextField userTxt;
    private JPasswordField passTxt;
    private JSpinner portSpinner;

    public CenterDialogPanel() {
        super(new GridBagLayout());
        Border innerBorder = BorderFactory.createTitledBorder("Database Preferences");
        Border outerBorder = BorderFactory.createEmptyBorder(25, 25, 25, 25);
        this.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        
        GridBagConstraints gbc = new GridBagConstraints();
        JLabel userLbl= new JLabel("User:");
        JLabel passLbl = new JLabel("Password:");
        JLabel portLbl = new JLabel("Port:");
        userTxt = new JTextField(10);
        passTxt= new JPasswordField(10);
        passTxt.setEchoChar('*');//IMPORTANTE
        
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(3306, 0, 9999, 1); // valor inicial, valor mínimo, valor máximo, incremento
        portSpinner = new JSpinner(spinnerModel);
        
        
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.LINE_END;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        add(userLbl, gbc);
        
        gbc.gridy=1;
        add(passLbl, gbc);
        
        gbc.gridy=2;
        add(portLbl, gbc);
        
        gbc.gridx=1;
        gbc.gridy=0;
        add(userTxt,gbc);
        
        gbc.gridy=1;
        add(passTxt,gbc);
        
        gbc.gridy=2;
        gbc.fill=GridBagConstraints.BOTH;
        add(portSpinner,gbc);
        
        
    }
    public String getTxt(){
        StringBuilder sb = new StringBuilder();
        sb.append(userTxt.getText());
        sb.append("\n");
        sb.append(new String(passTxt.getPassword()));
        sb.append("\n");
        sb.append(String.valueOf(portSpinner.getValue()));
        return sb.toString();
        
    }
    
    
}
