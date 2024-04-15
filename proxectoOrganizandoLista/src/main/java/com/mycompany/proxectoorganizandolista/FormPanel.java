/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandolista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

/**
 *
 * @author diana
 */
public class FormPanel extends JPanel{
    private FormListener formListener;
    private JTextField nameTxt;
    private JTextField occupationTxt;
    private JList listaAge;
    public FormPanel(){
        setLayout(new GridBagLayout());
        
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        this.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel nameLbl = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END; 
        gbc.insets.right = 5; 

        add(nameLbl, gbc);

        JLabel occupationLbl = new JLabel("Occupation:");
        gbc.gridy = 1;

        add(occupationLbl, gbc);
        
        JLabel ageLbl = new JLabel("Age:");
        
        gbc.gridy=2;
        add(ageLbl, gbc);
        

        JLabel employmentLbl = new JLabel("Employment:");
        
        gbc.gridy=3;
        
        add(employmentLbl, gbc);
         nameTxt = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets.right = 0;

        add(nameTxt, gbc);
        
    
         occupationTxt = new JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 1;

        add(occupationTxt, gbc);
        
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(new AgeCategory(0, "Under 18"));
        modelo.addElement(new AgeCategory(1, "18 to 65"));
        modelo.addElement(new AgeCategory(2, "65 or over"));
        listaAge= new JList();
        listaAge.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaAge.setPreferredSize(new Dimension(90,20));
        listaAge.setModel(modelo);
        
         //IMPORTANTE
        JScrollPane scrollList = new JScrollPane(listaAge, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       //*********
        gbc.gridx=1;
        gbc.gridy=2;
        add(scrollList, gbc);
        
        //IMPORTANTE
        String[] employments = {"employed", "self-employed", "unemployed"};
        JComboBox employmentBox = new JComboBox(employments);
        employmentBox.setEditable(true);
        employmentBox.setSelectedIndex(0);
        
        //*****************************
        gbc.gridy=3;
        add(employmentBox, gbc);
        JButton okBtn = new JButton("OK");

        gbc.gridx = 1;
        gbc.gridy = 4;
        
         add(okBtn, gbc);
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AgeCategory idade = (AgeCategory) listaAge.getSelectedValue();
                String idadeTxt= String.valueOf(idade.getId());
                String employmentText= employmentBox.getSelectedItem().toString(); //IMPORTANTE
                
                if (formListener != null) {
                        FormEvent se = new FormEvent(this, nameTxt.getText(), occupationTxt.getText(), idadeTxt, employmentText) ;
                        formListener.textEmitted(se);
                }
            }
        };
        
        okBtn.addActionListener(al);

      
        
        Dimension dimension = new Dimension(250, 300);

        setPreferredSize(dimension); 
     
    }
    public void setFormListener(FormListener listener) {
        this.formListener = listener;
    }
    
   

    
}

class AgeCategory {

    private int id;
    private String text;

    public AgeCategory(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return text;
    }
}
