/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandocheck;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author diana
 */
public class ToolbarPanel extends JPanel {


private StringListener stringListener;
private JButton helloButton;
private JButton goodbyeButton;
   
public ToolbarPanel() {
    setLayout(new FlowLayout(FlowLayout.LEFT));

    helloButton= new JButton("Hello");
    goodbyeButton= new JButton("Goodbye");
      
ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                if (clickedButton == helloButton) {
                    if(stringListener != null) {
                        StringEvent se = new StringEvent(this, "Hello\n");
                        stringListener.textEmitted(se);
                    }

                } else if (clickedButton == goodbyeButton) {
                    if (stringListener != null) {
                        StringEvent se = new StringEvent(this, "Goodbye\n");
                        stringListener.textEmitted(se);
                    }
                }
            }
        };
    helloButton.addActionListener(al);
    goodbyeButton.addActionListener(al);
    
    add(helloButton);
    add(goodbyeButton);
    }
   

    public void setStringListener(StringListener listener) {
        this.stringListener = listener;
    }
}
