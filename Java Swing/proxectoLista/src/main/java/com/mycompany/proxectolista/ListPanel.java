/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectolista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author diana
 */
public class ListPanel extends JPanel {
    private JList<String> listaNomes;
    private DefaultListModel<String> modelo;

    public ListPanel() {
        //IMPORTANTE
         modelo = new DefaultListModel<>();
        modelo.addElement("Ada");
        modelo.addElement("Erea");
        modelo.addElement("Navia");

        listaNomes = new JList<>(modelo);
        //*******
        listaNomes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //IMPORTANTE
        listaNomes.setSelectedIndex(0); //IMPORTANTE
        setLayout(new GridBagLayout()); //IMPORTANTE (para conseguir que ocupe todo)

  
        
        
        GridBagConstraints gbcListaNomes = new GridBagConstraints();
        gbcListaNomes.gridx = 0;
        gbcListaNomes.gridy = 0;
        gbcListaNomes.fill = GridBagConstraints.BOTH;
        gbcListaNomes.weightx = 1.0; 
        gbcListaNomes.weighty = 1.0; 

    
        add(listaNomes, gbcListaNomes);
    }
    public void borrar(){
        int selected =listaNomes.getSelectedIndex();
        int tamanho= modelo.size()-1;
        modelo.remove(selected);
        if(selected==tamanho){
            listaNomes.setSelectedIndex(modelo.size()-1);
        }else{
            listaNomes.setSelectedIndex(selected);
        }
        
        
        
        
    }

    public DefaultListModel<String> getModelo() {
        return modelo;
    }
    
    public void engadirNome(String nome){
        modelo.addElement(nome);
        
    }
    
}
