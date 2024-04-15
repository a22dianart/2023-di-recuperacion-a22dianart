package com.mycompany.proxectocomponentes;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {
    
    private JTextField num1Txt;
    private JTextField num2Txt;
    private JLabel resultadoLbl;

    public MainFrame() {
        super("Frame componentes");
        setSize(600, 500);
        setLayout(new FlowLayout());
        num1Txt= new JTextField(10);
        num2Txt = new JTextField(10);
       
        JButton sumarBtn = new JButton("Sumar");
        resultadoLbl = new JLabel("");
        
        
        sumarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try{
                float num1 = Float.parseFloat(num1Txt.getText()); //IMPORTANTE
                float num2 = Float.parseFloat(num2Txt.getText());
                float resultado = num1+num2;
                resultadoLbl.setText(String.valueOf(resultado));//IMPORTANTE
                }catch(Exception e){//IMPORTANTE
                    
                }
            }
        });

        add(num1Txt);
        add(num2Txt);
        add(sumarBtn);
        add(resultadoLbl);
        
        
        
        
        setLocationRelativeTo(null);
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
