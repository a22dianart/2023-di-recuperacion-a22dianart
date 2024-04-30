/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoeventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */

public class MainFrame extends JFrame implements ActionListener{

    public MainFrame() {
        super("Un frame");
        setSize(600, 500);
        
        
        //layout 
        setLayout(new BorderLayout());
        JButton sairBtn = new JButton("Saír");
        sairBtn.addActionListener(this); //IMPORTANTE

        add(sairBtn, BorderLayout.PAGE_START);
        

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);//IMPORTANTE
    }
}
