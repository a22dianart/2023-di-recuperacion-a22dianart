/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectotaboacores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author diana
 */
public class ColorRenderer extends JPanel implements TableCellRenderer {
    private JLabel nomeCor;
    public ColorRenderer() {
        super(new BorderLayout());
        nomeCor= new JLabel("");
        add(nomeCor,BorderLayout.CENTER);
        
        
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        this.setBackground((Color) value);
        nomeCor.setText(value.toString());
     
        
        return this;
    }
}
