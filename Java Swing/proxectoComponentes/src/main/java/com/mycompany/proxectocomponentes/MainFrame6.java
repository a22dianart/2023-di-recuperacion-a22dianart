/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomponentes;

import java.awt.Container;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author diana
 */


import javax.swing.text.DateFormatter;

import javax.swing.text.NumberFormatter;

public class MainFrame6 extends JFrame {

    public MainFrame6() {
        super("");

       
        
        Container pane = getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        NumberFormatter formatter = new NumberFormatter(decimalFormat);
        formatter.setValueClass(Double.class);
        //formatter.setMinimum(0.0); 
        //formatter.setMaximum(1000.0); 
        formatter.setAllowsInvalid(false); 
        formatter.setCommitsOnValidEdit(true);
       
        
     
        JLabel numerosLbl = new JLabel("números: ");
        JFormattedTextField numeros = new JFormattedTextField(formatter);
        numeros.setText("1");
        numeros.setColumns(10);
        
        
       
        /**
        MaskFormatter formatter2 = null;
        try {
            formatter2 = new MaskFormatter("00/00/"); 
        } catch (ParseException e) {
            e.printStackTrace();
        }
        **/
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormatter formatter2 = new DateFormatter(dateFormat);
        formatter.setValueClass(Date.class);
        //formatter.setMinimum(0.0); 
        //formatter.setMaximum(1000.0); 
        formatter.setAllowsInvalid(false); 
        formatter.setCommitsOnValidEdit(true);

        JLabel dataLbl = new JLabel("data: ");
        JFormattedTextField data = new JFormattedTextField(formatter2);
        data.setValue(new Date());
        data.setColumns(10);
        
       
        
     
        JButton imprimirBtn = new JButton("imprimir");

    
        JPanel panel1 = new JPanel();
        panel1.add(numerosLbl);
        panel1.add(numeros);

        JPanel panel2 = new JPanel();
        panel2.add(dataLbl);
        panel2.add(data);
        
       
        JPanel panel3 = new JPanel();
        panel3.add(imprimirBtn);

      
        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); //IMPORTANTE
     
       
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    
}

