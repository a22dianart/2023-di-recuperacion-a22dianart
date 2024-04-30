package com.mycompany.proxectolayouts;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diana
 */
public class MainFrame2 extends JFrame {
    
    //IMPORTANTE
    
    final static String GREENPANEL = "primeira";
    final static String REDPANEL = "segunda";
    final static String BLUEPANEL= "terceira";
    
    //------------

    public MainFrame2() {
        super("Layout");
        setLayout(new BorderLayout());
        
        //IMPORTANTE
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        
        JPanel cards = new JPanel(new CardLayout());
        cards.add(greenPanel, GREENPANEL);
        cards.add(redPanel, REDPANEL);
        cards.add(bluePanel, BLUEPANEL);
        //*********
        
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (cards.getLayout());
                if(e.getActionCommand()!= "anterior" && e.getActionCommand()!="seguinte"){
                cl.show(cards, (String) e.getActionCommand()); //IMPORTANTE
                }else{
                   if (e.getActionCommand()=="anterior"){
                       cl.previous(cards); //IMPORTANTE
                   }else{
                       cl.next(cards); //IMPORTANTE
                   }
                      
                    
                }

            }
        };
        


        JPanel panelEsq = new JPanel();
        panelEsq.setLayout(new GridBagLayout());

        JPanel panelDer = new JPanel();
        panelDer.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; 
        gbc.weighty = 1.0; 
        gbc.gridx = 0;
        gbc.gridy = 0;

        JButton anteriorEsqBtn = new JButton("anterior");
        panelEsq.add(anteriorEsqBtn, gbc);
       
        JButton primeiraEsqBtn = new JButton("primeira");
        gbc.gridy = 1;
        panelEsq.add(primeiraEsqBtn, gbc);
     
        JButton segundaEsqBtn = new JButton("segunda");
        gbc.gridy = 2;
        panelEsq.add(segundaEsqBtn, gbc);
        
      
        JButton terceiraEsqBtn = new JButton("terceira");
          gbc.gridy = 3;
        panelEsq.add(terceiraEsqBtn, gbc);

        JButton seguinteEsqBtn = new JButton("seguinte");
        gbc.gridy = 4;

        panelEsq.add(seguinteEsqBtn, gbc);

        JButton anteriorDerBtn = new JButton("anterior");
        gbc.gridy = 0;
        panelDer.add(anteriorDerBtn, gbc);
        
        JButton primeiraDerBtn = new JButton("primeira");
        gbc.gridy = 1;
        panelDer.add(primeiraDerBtn, gbc);
        
        JButton segundaDerBtn = new JButton("segunda");
        gbc.gridy = 2;
        panelDer.add(segundaDerBtn, gbc);

        JButton terceiraDerBtn = new JButton("terceira");
        gbc.gridy = 3;
        panelDer.add(terceiraDerBtn, gbc);
        JButton seguinteDerBtn = new JButton("seguinte");
        gbc.gridy = 4;
        panelDer.add(seguinteDerBtn, gbc);

        primeiraDerBtn.addActionListener(al);
        primeiraEsqBtn.addActionListener(al);
        segundaDerBtn.addActionListener(al);
        segundaEsqBtn.addActionListener(al);
        terceiraDerBtn.addActionListener(al);
        terceiraEsqBtn.addActionListener(al);
        
        anteriorDerBtn.addActionListener(al);
        anteriorEsqBtn.addActionListener(al);
        seguinteDerBtn.addActionListener(al);
        seguinteEsqBtn.addActionListener(al);
        
        JLabel tituloLbl = new JLabel("título");
        add(tituloLbl, BorderLayout.NORTH);

        JLabel peLbl = new JLabel("pé de páxina");
        JPanel panelSur = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelSur.add(peLbl);
        
        
        

       
        add(cards, BorderLayout.CENTER);

        add(panelSur, BorderLayout.SOUTH);


        add(panelEsq, BorderLayout.WEST);
        add(panelDer, BorderLayout.EAST);

        setSize(600, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
