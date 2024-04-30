/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomponentes;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author diana
 */
public class MainFrame7 extends JFrame {



    public MainFrame7() {
        super("Frame componentes");
        setSize(600, 500);
        setLayout(new FlowLayout());
        
        JLabel codPostalLbl = new JLabel();
        
        //IMPORTANTE
        
         MaskFormatter maskFormatter = null;
        try {
            maskFormatter = new MaskFormatter("#####");
            maskFormatter.setPlaceholderCharacter('*'); 
            maskFormatter.setAllowsInvalid(false); 
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //----------
        JFormattedTextField codPostalTxt= new JFormattedTextField(maskFormatter);
        codPostalTxt.setColumns(10);
        add(codPostalLbl);
        add(codPostalTxt);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
