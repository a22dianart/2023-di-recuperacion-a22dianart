/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomponentes;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame3 extends JFrame {

    private JLabel loginLbl;
    private JPasswordField passField;
    private JButton comprobarBtn;
    private char[] password = { 'o', 'l','a'};
    private Container pane;

    public MainFrame3() {
        super("Frame componentes");
        setSize(600, 500);
        setLayout(new FlowLayout());
        pane=getContentPane();
       
        loginLbl = new JLabel("Login: ");
        passField = new JPasswordField(10);
        comprobarBtn = new JButton("comprobar");
        
        comprobarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                char[] input = passField.getPassword();
                if(Arrays.equals(input,password)){ //IMPORTANTE
                    pane.setBackground(Color.GREEN);
                    
                }else{
                    pane.setBackground(Color.RED);
                }
            }
        });
      

       

        add(loginLbl);
        add(passField);
        add(comprobarBtn);
        

        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
