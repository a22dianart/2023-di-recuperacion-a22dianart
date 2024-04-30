/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectotaboacores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;

/**
 *
 * @author diana
 */
public class MainFrame extends JFrame {
    private JTable taboa;
    private ColorTableModel colorTableModel;
    private List<Color> cores = new ArrayList<>();
    public MainFrame() {
        super("Táboa cores");
        setLayout(new BorderLayout());
        
        colorTableModel= new ColorTableModel();
        cores.add(Color.red);
        cores.add(Color.ORANGE);
        cores.add(Color.GREEN);
        colorTableModel.setData(cores);
        taboa= new JTable(colorTableModel);
        
        taboa.setDefaultRenderer(Color.class,new ColorRenderer());
        taboa.setDefaultEditor(Color.class, new ColorEditor());

        
        add(taboa,BorderLayout.CENTER);
        
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
