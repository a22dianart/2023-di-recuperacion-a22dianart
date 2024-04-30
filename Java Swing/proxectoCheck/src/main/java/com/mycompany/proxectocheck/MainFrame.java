/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocheck;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame{
    private List<String> selectedList; //IMPORTANTE
    private JLabel seleccionadosLbl;
    public MainFrame(){
        super("Check");
        setSize(600, 500);
        setLayout(new BorderLayout());
        
        JPanel checksPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JCheckBox num1Check = new JCheckBox("num1");
        JCheckBox num2Check = new JCheckBox("num2");
        JCheckBox num3Check = new JCheckBox("num3");
        
        checksPanel.add(num1Check);
        checksPanel.add(num2Check);
        checksPanel.add(num3Check);
        
       selectedList = new ArrayList<>();
       seleccionadosLbl = new JLabel("Elementos seleccionados:");
                
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox check = (JCheckBox) e.getSource();
                if(check.isSelected()){ //IMPORTANTE
                    selectedList.add(e.getActionCommand());
                }else{
                    selectedList.remove(e.getActionCommand());
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Elementos seleccionados: ");
                for(String elemento : selectedList){
                    sb.append(elemento);
                    sb.append(", ");
                }
                seleccionadosLbl.setText(sb.toString());
                
               
            }
        };
        
        num1Check.addActionListener(al);
        num2Check.addActionListener(al);
        num3Check.addActionListener(al);
        
        
        
        add(checksPanel, BorderLayout.SOUTH);
        
       
        
        add(seleccionadosLbl, BorderLayout.CENTER);
        
        
        
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
