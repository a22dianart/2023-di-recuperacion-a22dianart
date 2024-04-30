/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectotaboacores;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author diana
 */
public class ColorEditor extends AbstractCellEditor implements TableCellEditor {

    private JButton btn;
    private JColorChooser colorChooser;
    private Color colorSeleccionado;

    public ColorEditor() { //IMPORTANTEE
        btn = new JButton("cambiar cor");
        btn.addActionListener(new ActionListener() {
        Color corSeleccion;

            @Override
            public void actionPerformed(ActionEvent ae) {
                colorChooser = new JColorChooser();
                corSeleccion = JColorChooser.showDialog(null, "Seleccione unha cor", Color.WHITE);
                setColorSeleccionado(corSeleccion);
                fireEditingStopped();

            }
        });
}
    @Override
    public Object getCellEditorValue() {
        return colorSeleccionado;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
       
        
        return btn;
    }
    public void setColorSeleccionado(Color color){
        this.colorSeleccionado=color;
    }
}
