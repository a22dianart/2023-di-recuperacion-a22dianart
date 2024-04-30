/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandodialogopersonalizado.gui;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import com.mycompany.proxectoorganizandodialogopersonalizado.model.EmploymentCategory;

/**
 *
 * @author diana
 */
public class EmploymentCategoryRenderer extends JComboBox implements TableCellRenderer { //IMPORTANTE

    public EmploymentCategoryRenderer() {
        super(EmploymentCategory.values());
        
}
@Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {
        this.setSelectedItem(value);
        return this;
    }
}
