/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocheck;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame3 extends JFrame {

    private JTextField primeiroTxt;
    private JTextField segundoTxt;
    private JTextField resultadoTxt;

    public MainFrame3() {
        super("Minicalculadora");
        setSize(600, 500);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        JPanel numerosPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        primeiroTxt = new JTextField(10);
        segundoTxt  = new JTextField(10);
        
        numerosPanel.add(primeiroTxt);
        numerosPanel.add(segundoTxt);
        gbc.gridy=0;
        add(numerosPanel, gbc);
        
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JRadioButton sumarBtn = new JRadioButton("sumar");
        JRadioButton restarBtn = new JRadioButton("restar");
        JRadioButton multiplicarBtn = new JRadioButton("multiplicar");
        JRadioButton dividirBtn = new JRadioButton("dividir");
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(sumarBtn);
        grupo.add(restarBtn);
        grupo.add(multiplicarBtn);
        grupo.add(dividirBtn);
        
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float num1= Float.parseFloat(primeiroTxt.getText());
                Float num2 = Float.parseFloat(segundoTxt.getText());
                String resultado;
                if("sumar".equals(e.getActionCommand())){
                    resultado= String.valueOf(num1+num2);
                    
                }else if ("restar".equals(e.getActionCommand())){
                    resultado= String.valueOf(num1-num2);
                         
                }else if ("multiplicar".equals(e.getActionCommand())){
                    resultado= String.valueOf(num1*num2);
                          
                }else{
                    if(num2!=0.0){
                    resultado= String.valueOf(num1/num2);
                    }
                    else{
                        resultado="DIVISION ENTRE 0";
                    }
                }
                resultadoTxt.setText(resultado);
                
            }
        };
        
        sumarBtn.addActionListener(al);
        restarBtn.addActionListener(al);
        multiplicarBtn.addActionListener(al);
        dividirBtn.addActionListener(al);
  
        radioPanel.add(sumarBtn);
        radioPanel.add(restarBtn);
        radioPanel.add(multiplicarBtn);
        radioPanel.add(dividirBtn);
        
        gbc.gridy=1;
        add(radioPanel, gbc);
        
        resultadoTxt= new JTextField(10);
        resultadoTxt.setEditable(false);
        gbc.gridy=2;
        add(resultadoTxt, gbc);
        
        
        
        
        
        
       
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
