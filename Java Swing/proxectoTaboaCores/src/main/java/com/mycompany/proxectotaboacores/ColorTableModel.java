/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectotaboacores;

import java.awt.Color;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author diana
 */
public class ColorTableModel extends AbstractTableModel {

    private List<Color> colorList;
    private String[] columnNames = {"Color"};

    public ColorTableModel() {
    }

    public void setData(List<Color> colorList) {
        this.colorList = colorList;
    }

    @Override
    public int getRowCount() {
        return colorList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
       
        
        return colorList.get(row);
    }

    @Override
    public String getColumnName(int column) {
        if (column < 0 || column >= getColumnCount()) {
            throw new ArrayIndexOutOfBoundsException(column);
        } else {
            return columnNames[column];
        }
    }
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return Color.class;
    }
    @Override 
    public boolean isCellEditable(int row, int column){
        return true;
    }
    public void setValueAt(Object aValue, int row, int column){
        if (column == 0) {
          
            this.colorList.set(row, (Color) aValue);
         
        } 
    }
}
