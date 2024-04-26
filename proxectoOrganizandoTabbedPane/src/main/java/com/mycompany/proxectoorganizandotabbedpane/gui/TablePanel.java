/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandotabbedpane.gui;

import com.mycompany.proxectoorganizandotabbedpane.model.EmploymentCategory;
import com.mycompany.proxectoorganizandotabbedpane.model.Person;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author diana
 */
public class TablePanel extends JPanel {

    private JTable table;
    private PersonTableModel personTableModel;
    
    private PersonTableListener personTableListener;
    private TableRowSorter sorter;

    public TablePanel() {
        
        personTableModel = new PersonTableModel();
        
        

        table = new JTable(personTableModel);
        
        table.setRowHeight(70); //IMPORTANTE
        setLayout(new BorderLayout());
        
        
        JPopupMenu popup = new JPopupMenu();
        JMenuItem removeItem = new JMenuItem("eliminar"); //???
        popup.add(removeItem);
        
        removeItem.addActionListener(new ActionListener() { //IMPORTANTE
            public void actionPerformed(ActionEvent ae) {
                int row = table.getSelectedRow();
                 if (personTableListener != null) {
                    personTableListener.rowDeleted(row);
                    personTableModel.fireTableRowsDeleted(row, row);
                }
            }
        });


        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                maybeShowPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                maybeShowPopup(e);
            }

            private void maybeShowPopup(MouseEvent e) { //IMPORTANTISIIIMO
                if (e.isPopupTrigger()) {
               
                    int row = table.rowAtPoint(e.getPoint());
                    int col = table.columnAtPoint(e.getPoint());

               
                    table.changeSelection(row, col, false, false);

      
                    popup.show(e.getComponent(), e.getX(), e.getY());
                    
                }
            }
        });
        table.setDefaultRenderer(EmploymentCategory.class, new EmploymentCategoryRenderer()); //IMPORTANTE
        table.setDefaultEditor(EmploymentCategory.class, new EmploymentCategoryEditor());
        
        
        
         add(new JScrollPane(table), BorderLayout.CENTER);
}
    public void setData(List<Person> personList) {
        personTableModel.setData(personList);
    }


    public void refresh() {
        personTableModel.fireTableDataChanged();
        
    }

   

    void setPersonTableListener(PersonTableListener personTableListener) {
        this.personTableListener = personTableListener;
    }
    public void setFilaFilter(RowFilter rf){
        sorter = new TableRowSorter(personTableModel);
        sorter.setRowFilter(rf);
        table.setRowSorter(sorter);
    }
   
}
