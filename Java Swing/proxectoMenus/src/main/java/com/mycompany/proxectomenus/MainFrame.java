/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectomenus;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {
    JTextArea descripcionTxt;
    int numVecesHab1;
    int numVecesGaraxe;
    int numVecesTrasteiro;

    public MainFrame() {
        super("Aplicación");
        setLayout(new BorderLayout());
        setSize(600, 500);
        
        descripcionTxt = new JTextArea("");
        descripcionTxt.setEditable(false);
        
        add(descripcionTxt, BorderLayout.CENTER);
        
        numVecesHab1=0;
        numVecesGaraxe=0;
        numVecesTrasteiro=0;
        setJMenuBar(createMenuBar());

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu casaMenu = new JMenu("Casa");
        casaMenu.setIcon(createIcon("/house.png")); //IMPORTANTE
        casaMenu.setMnemonic(KeyEvent.VK_C);

        JMenu habitacionsMenu = new JMenu("Habitacións");
        
        JMenuItem habitacion1 = new JMenuItem("Habitación 1");
        habitacion1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                numVecesHab1++;
                String descripcion= descripcionTxt.getText()+"\n"+"Pulsaches na habitación 1 "+numVecesHab1+" veces.";
                descripcionTxt.setText(descripcion);
                
            }
            
            
        });
        habitacion1.setToolTipText("Selecciona a habitación 1");
        
       
        JMenuItem habitacion2 = new JMenuItem("Habitación 2");
        habitacion2.setEnabled(false);
        
        habitacionsMenu.add(habitacion1);
        habitacionsMenu.add(habitacion2);
        
        casaMenu.add(habitacionsMenu); 
        
        JCheckBoxMenuItem salonChk = new JCheckBoxMenuItem("Salón");
        salonChk.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        salonChk.setSelected(true);
        
        salonChk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBoxMenuItem salonCheck= (JCheckBoxMenuItem) e.getSource();
                 String descripcion;
                if(salonCheck.getState()){ //IMPORTANTE
                     descripcion = descripcionTxt.getText() + "\n" + "Salón. Estado activado.";
                     
                }else{
                    descripcion = descripcionTxt.getText() + "\n" + "Salón. Estado desactivado.";
                }
                descripcionTxt.setText(descripcion);

            }

        });
        casaMenu.add(salonChk);
        JSeparator separador = new JSeparator();
        casaMenu.add(separador);
        
        JRadioButtonMenuItem cocinhaRadio = new JRadioButtonMenuItem("Cociña");
        cocinhaRadio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        cocinhaRadio.setSelected(true);
        cocinhaRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButtonMenuItem cocinhaRa = (JRadioButtonMenuItem) e.getSource();
                String descripcion;
                if (cocinhaRa.isSelected()) {//IMPORTANTE
                    descripcion = descripcionTxt.getText() + "\n" + "Cociña. Estado activado.";

                } else {
                    descripcion = descripcionTxt.getText() + "\n" + "Cociña. Estado desactivado.";
                }
                descripcionTxt.setText(descripcion);

            }

        });
        casaMenu.add(cocinhaRadio);
        
        JRadioButtonMenuItem banhoRadio = new JRadioButtonMenuItem("Baño");
        banhoRadio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        
        banhoRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButtonMenuItem banhoRa = (JRadioButtonMenuItem) e.getSource();
                String descripcion;
                if (banhoRa.isSelected()) {//IMPORTANTE
                    descripcion = descripcionTxt.getText() + "\n" + "Baño. Estado activado.";

                } else {
                    descripcion = descripcionTxt.getText() + "\n" + "Baño. Estado desactivado.";
                }
                descripcionTxt.setText(descripcion);

            }

        });
        casaMenu.add(banhoRadio);
        
        
   
        menuBar.add(casaMenu); 
        
        JMenu extrasMenu = new JMenu("Extras");
        extrasMenu.setMnemonic(KeyEvent.VK_E);
        
        JMenuItem garaxeItem = new JMenuItem("Garaxe");
        garaxeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numVecesGaraxe++;
                String descripcion = descripcionTxt.getText() + "\n" + "Pulsaches no garaxe " + numVecesGaraxe + " veces.";
                descripcionTxt.setText(descripcion);

            }

        });
        garaxeItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        JMenuItem trasteiroItem = new JMenuItem("Trasteiro");
        trasteiroItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numVecesTrasteiro++;
                String descripcion = descripcionTxt.getText() + "\n" + "Pulsaches no trasteiro " + numVecesTrasteiro + " veces.";
                descripcionTxt.setText(descripcion);

            }

        });
        trasteiroItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        
        extrasMenu.add(garaxeItem);
        extrasMenu.add(trasteiroItem);
        
        menuBar.add(extrasMenu);
        
        
  
        return menuBar;
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
