/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandotabla.gui;

import com.mycompany.proxectoorganizandotabla.controller.Controller;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {

 
    private ToolbarPanel toolbarPanel;
    private JButton aceptarButton;
    private FormPanel formPanel;
    private JFrame esteFrame;
   
    
    private Controller controller;
    
    private TablePanel tablePanel;
    
    public MainFrame() {
        super("Aplicación");
         
      
        setLayout(new BorderLayout());
        
        controller = new Controller();//IMPORTANTE
        
        tablePanel = new TablePanel();
        tablePanel.setData(controller.getPeople());


       
        toolbarPanel = new ToolbarPanel();
        formPanel = new FormPanel();
        
      
        
        aceptarButton = new JButton("Aceptar");
       
        
      
        
        formPanel.setFormListener(new FormListener(){
            @Override
            public void textEmitted(FormEvent e) {
                controller.addPerson(e); //IMPORTANTE
                int lastIndex = controller.getPeople().size()-1; //IMPORTANTE

                tablePanel.refresh();

            }
        
        });



        add(toolbarPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.WEST); 
        add(tablePanel, BorderLayout.CENTER); 
        add(aceptarButton, BorderLayout.PAGE_END);
        
        setJMenuBar(createMenuBar()); //IMPORTANTE

        
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension minDimension= new Dimension(600,650);  //IMPORTANTE
        setMinimumSize(minDimension);
        setVisible(true);
    }
    
    
    private JMenuBar createMenuBar() { //IMPORTANTE
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem exportItem = new JMenuItem("Export data...");
        
        exportItem.addActionListener(new ActionListener() { //IMPORTANTE
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.addChoosableFileFilter(new PersonFileFilter()); //IMPORTANTE
                int returnVal = fc.showSaveDialog(esteFrame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println(fc.getSelectedFile());
                } else {
                    System.out.println("Open command cancelled by user.");
                }
            }
        });
        
        exportItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));

        
        
        JMenuItem importItem = new JMenuItem("Import data...");
        
        importItem.addActionListener(new ActionListener(){ //IMPORT
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.addChoosableFileFilter(new PersonFileFilter()); //IMPORTANTE

                int returnVal = fc.showOpenDialog(esteFrame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println(fc.getSelectedFile());
                } else {
                    System.out.println("Open command cancelled by user.");
                }
            }
            }
        

        );
        importItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        JMenuItem exitItem = new JMenuItem("Exit");
         exitItem.setMnemonic(KeyEvent.VK_X);
         exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        
        exitItem.addActionListener(new ActionListener() {//IMPORTANTE
            @Override
            public void actionPerformed(ActionEvent e) {

                int opcion = JOptionPane.showConfirmDialog(esteFrame, "Queres saír?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

            }

        });
        
        
        fileMenu.add(exportItem);
        fileMenu.add(importItem);
        
        fileMenu.addSeparator();
        
        fileMenu.add(exitItem);
        
        
        menuBar.add(fileMenu); 
        
        JMenu windowMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");
        
        JCheckBoxMenuItem formChk = new JCheckBoxMenuItem("Person Form");
        formChk.setSelected(true);
        
        formChk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBoxMenuItem formCheck = (JCheckBoxMenuItem) e.getSource();
                
                if(formCheck.isSelected()){
                    formPanel.setVisible(true); //IMPORTANTE
                }else{
                    formPanel.setVisible(false);  
                }
            }
               
        });
        showMenu.add(formChk);
       
              
        windowMenu.add(showMenu);
        
        menuBar.add(windowMenu);
     
        
      
        return menuBar;
    }

}
