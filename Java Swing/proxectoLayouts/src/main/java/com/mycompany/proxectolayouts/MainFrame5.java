/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectolayouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
public class MainFrame5 extends JFrame {

    public MainFrame5() {
        super("Engadir usuario");
        setLayout(new BorderLayout());
        
        JPanel centerPanel = new JPanel(new GridLayout(3,2, 0, 15)); //IMPORTANTE
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        centerPanel.setBorder(outerBorder); //IMPORTANTE
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        
        JButton aceptarBtn = new JButton("Aceptar");
        JButton cancelarBtn = new JButton("Cancelar");
        
        southPanel.add(aceptarBtn);
        southPanel.add(cancelarBtn);
        
        add(southPanel, BorderLayout.SOUTH);
        
        JLabel nomeLbl = new JLabel("Nome:");
        JLabel dniLbl = new JLabel("DNI:");
        JLabel dataLbl = new JLabel("Data de nacemento:");
        
        JTextField nomeTxt = new JTextField(10);
        JTextField dniTxt = new JTextField(10);
        JPanel dataPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JTextField diaTxt = new JTextField(2);
        JTextField mesTxt = new JTextField(2);
        JTextField anoTxt= new JTextField(2);
        JLabel separador = new JLabel("/");
        JLabel separador2= new JLabel("/");
        
        dataPanel.add(diaTxt);
        dataPanel.add(separador);
        dataPanel.add(mesTxt);
        dataPanel.add(separador2);
        dataPanel.add(anoTxt);
        
        centerPanel.add(nomeLbl);
        centerPanel.add(nomeTxt);
        centerPanel.add(dniLbl);
        centerPanel.add(dniTxt);
        centerPanel.add(dataLbl);
        centerPanel.add(dataPanel);
        
        add(centerPanel, BorderLayout.CENTER);
        
        
        
        
        
        

        

        setSize(300, 200);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
