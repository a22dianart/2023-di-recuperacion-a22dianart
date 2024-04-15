/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectolayouts;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

/**
 *
 * @author diana
 */
public class MainFrame4 extends JFrame {


    public MainFrame4() {
        super("Formulario");
        setLayout(new BorderLayout());
        
        //IMPORTANTE
        JPanel mainPane = new JPanel(new BorderLayout()); 
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        mainPane.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        
        //****
        JPanel pane = new JPanel(new GridBagLayout());//IMPORTANTE
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        
        JLabel nameLbl = new JLabel("Name:");
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.LINE_END; //IMPORTANTE
        gbc.insets.right=5; //IMPORTANTE
        
        pane.add(nameLbl, gbc);
        
        JLabel occupationLbl = new JLabel("Occupation:");
        gbc.gridy=1;
       
        
        pane.add(occupationLbl, gbc);
        
        JTextField nameTxt = new JTextField(10);
        
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.LINE_START;
        gbc.insets.right=0;
        
         pane.add(nameTxt, gbc);
        JTextField occupationTxt= new JTextField(10);
        
        
        gbc.gridx=1;
        gbc.gridy=1;
        
        pane.add(occupationTxt, gbc);
        
        JButton okBtn = new JButton("OK");
        
        gbc.gridx=1;
        gbc.gridy=2;
        
        pane.add(okBtn, gbc);
        
        mainPane.add(pane, BorderLayout.NORTH); //IMPORTANTE
        getContentPane().add(mainPane); //IMPORTANTE

        setSize(400, 300);
     
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
