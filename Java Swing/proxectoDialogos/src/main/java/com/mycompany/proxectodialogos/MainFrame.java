/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectodialogos;

import java.awt.FlowLayout;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame{
    JFrame esteFrame;
    public MainFrame(){
        super("Aplicación");
        setSize(600, 500);
        setLayout(new FlowLayout());
        
        esteFrame= this;
        
        JButton messageBtn = new JButton("Message");
        JButton confirmBtn = new JButton("Confirm");
        JButton inputBtn = new JButton("Input");
        JButton optionBtn = new JButton("Option");
        
        messageBtn.addActionListener(new ActionListener(){ //IMPORTANTE
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(esteFrame, "Mensaxe informativa.", "Título", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(esteFrame, "Mensaxe de aviso.", "Título", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(esteFrame, "Mensaxe de erro.", "Título", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(esteFrame, "Mensaxe sen ningún.", "Título", JOptionPane.PLAIN_MESSAGE);
                
                Icon icona = createIcon("/house.png");
                
                JOptionPane.showMessageDialog(esteFrame, "Mensaxe con icona personalizada.", "Título", JOptionPane.PLAIN_MESSAGE, icona);
                
           
            }   
        
        });
        
        confirmBtn.addActionListener(new ActionListener(){ //IMPORTANTE
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmado = JOptionPane.showConfirmDialog(esteFrame, "Pregunta?", "Título",JOptionPane.YES_NO_CANCEL_OPTION);
                if (JOptionPane.NO_OPTION==confirmado){
                    System.out.println("NO");
                } else if(JOptionPane.YES_OPTION==confirmado) {
                    System.out.println("YES");
                }else if (JOptionPane.CANCEL_OPTION==confirmado){
                    System.out.println("CANCEL");
                }
                //Se se cerra non se imprime nada( habería que facer un else en vez de un else if para que o collera)

            }
            
        });
        inputBtn.addActionListener(new ActionListener(){ //IMPORTANTE
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String input = JOptionPane.showInputDialog(esteFrame, "Ingrese algo:", "Título", JOptionPane.PLAIN_MESSAGE);
                
                if (input != null) {
                    System.out.println(input);
                        
                } else {
                    System.out.println("non se inseriu nada");
                }
            }
            
        });
        optionBtn.addActionListener(new ActionListener(){ //IMPORTANTE
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String[] options = {"Op1", "Op2", "Op3"};

                int selectedOption = JOptionPane.showOptionDialog(
                        esteFrame,
                        "Selecciona unha opción: ",
                        "Título",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[1]);

       
                System.out.println("Opción seleccionada: " + selectedOption);

                
                if (selectedOption >= 0 && selectedOption < options.length) {
                    System.out.println("Texto del botón seleccionado: " + options[selectedOption]);
                } else {
                    System.out.println("CANCEL."); //SE SE CERRA O DIÁLOGO
                }
            }
            
        });
        add(messageBtn);
        add(confirmBtn);
        add(inputBtn);
        add(optionBtn);
        
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private ImageIcon createIcon(String path) { //IMPORTANTE
        URL url = getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable to load image: " + path);
        }
        ImageIcon icon = new ImageIcon(url);
        return icon;
    }

    
}
