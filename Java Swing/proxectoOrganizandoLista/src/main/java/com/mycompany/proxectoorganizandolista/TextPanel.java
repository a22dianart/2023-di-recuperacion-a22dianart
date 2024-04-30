/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandolista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author diana
 */
public class TextPanel extends JPanel {

    private JTextArea textArea;

    public TextPanel() {
        textArea = new JTextArea();
        textArea.setEditable(false);
        // Por defecto, un panel ten FlowLayout
        setLayout(new BorderLayout());
        // JScrollPane engadirá barras de scroll en caso necesario
        // Ao non haber máis compoñentes no panel, a área de texto ocupará todo o espazo
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
    
    public void appendText(String text) {
        textArea.append(text);
    }
}
