/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocheck;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame2 extends JFrame {

    private List<String> selectedList;
    private JLabel seleccionadosLbl;
    private JCheckBox aceptoBox;
    private JButton continuarBtn;

    public MainFrame2() {
        super("Check");
        setSize(600, 500);
        
       
        setLayout(new GridBagLayout()); //Importante
        JLabel acordoLbl = new JLabel("Está de acordo coas normas de servicio?");
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy=0;
        add(acordoLbl, gbc);
        
        aceptoBox = new JCheckBox("acepto");
        
        aceptoBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (aceptoBox.isSelected()){
                    continuarBtn.setEnabled(true);
                }else{
                    continuarBtn.setEnabled(false);
                }
            }
        });
        
        gbc.gridy=1;
        
        add(aceptoBox,gbc);
        gbc.gridy=2;
        continuarBtn = new JButton("Continuar");
        continuarBtn.setEnabled(false);
        
        add(continuarBtn,gbc);
        
        
   


        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
