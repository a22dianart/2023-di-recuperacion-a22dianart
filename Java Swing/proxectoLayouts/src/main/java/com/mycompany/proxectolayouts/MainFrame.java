package com.mycompany.proxectolayouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Layout");
        setLayout(new BorderLayout());

        JPanel panelEsq = new JPanel();
        panelEsq.setLayout(new GridBagLayout());
        
        JPanel panelDer = new JPanel();
        panelDer.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill= GridBagConstraints.BOTH; //IMPORTANTE
        gbc.weighty = 1.0; //IMPORTANTE
        gbc.gridx=0;
        gbc.gridy=0;
        
        
        
           
               



        JButton primeiroBtn = new JButton("primeiro");

        panelEsq.add(primeiroBtn,gbc);
        gbc.gridy=1;
        JButton segundoBtn = new JButton("segundo");
        
         panelEsq.add(segundoBtn,gbc);
              gbc.gridy=2;

        JButton terceiroBtn = new JButton("terceiro");
             gbc.gridy=3;
        
         panelEsq.add(terceiroBtn,gbc);
              gbc.gridy=4;

        JButton cuartoBtn = new JButton("cuarto");
        
         panelEsq.add(cuartoBtn,gbc);
         

        JButton quintoBtn = new JButton("quinto");
             gbc.gridy=5;
        
         panelEsq.add(quintoBtn,gbc);
       

        JButton sextoBtn = new JButton("sexto");
        gbc.gridy=0;
        panelDer.add(sextoBtn, gbc);
        JButton setimoBtn = new JButton("setimo");
        gbc.gridy=1;
        panelDer.add(setimoBtn, gbc);
        JButton oitavoBtn = new JButton("oitavo");
        gbc.gridy=2;
        panelDer.add(oitavoBtn, gbc);
        
        JButton novenoBtn = new JButton("noveno");
        gbc.gridy=3;
        panelDer.add(novenoBtn, gbc);
        JButton decimoBtn = new JButton("decimo");
        gbc.gridy=4;
        panelDer.add(decimoBtn, gbc);

        
        JLabel tituloLbl = new JLabel("título");
        add(tituloLbl, BorderLayout.NORTH);
        
        JLabel peLbl = new JLabel("pé de páxina");
        JPanel panelSur = new JPanel(new FlowLayout(FlowLayout.CENTER));//IMPORTANTE
        panelSur.add(peLbl);
        
        add(panelSur, BorderLayout.SOUTH);
        JTextArea areaCentro= new JTextArea();
        add(areaCentro, BorderLayout.CENTER);

   
        add(panelEsq, BorderLayout.WEST);
        add(panelDer, BorderLayout.EAST);
        

        setSize(600, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

 
}
