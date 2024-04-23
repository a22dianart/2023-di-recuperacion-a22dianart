/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandosplitpane.gui;

import com.mycompany.proxectoorganizandosplitpane.model.Person;
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

/**
 *
 * @author diana
 */
public class TablePanel extends JPanel {

    private JTable table;
    private PersonTableModel personTableModel;
    
    private PersonTableListener personTableListener;

    public TablePanel() {
        
        personTableModel = new PersonTableModel();
        table = new JTable(personTableModel);
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
   
}
