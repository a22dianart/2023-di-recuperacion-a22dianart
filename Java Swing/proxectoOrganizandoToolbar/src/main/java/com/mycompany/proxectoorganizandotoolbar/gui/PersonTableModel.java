/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandotoolbar.gui;

import com.mycompany.proxectoorganizandotoolbar.model.Person;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author diana
 */
public class PersonTableModel extends AbstractTableModel {

    private List<Person> personList;
    private String[] columnNames = {"ID", "Name", "Occupation", "Age Category",
        "Employment Category", "US Citizen", "Tax ID", "Gender"};

    public PersonTableModel() {
    }

    public void setData(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public int getRowCount() {
        return personList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Person persoa= personList.get(row);
        Object valor;
        if (column==0){
        valor = persoa.getId();
        }else if (column==1){
            valor = persoa.getName();
        }else if (column==2){
            valor = persoa.getOccupation();
        }else if (column==3){
            valor = persoa.getAgeCategory();
        }else if (column==4){
            valor = persoa.getEmpCat();
            
        }else if (column==5){
            valor = persoa.isUsCitizen();
        }else if (column==6){
            valor = persoa.getTaxId();
        }else if (column==7){
            valor = persoa.getGender();
        }
        else{
            valor =null;
        }
        return valor;
    }

    @Override
    public String getColumnName(int column) {
        if (column < 0 || column >= getColumnCount()) {
            throw new ArrayIndexOutOfBoundsException(column);
        } else {
            return columnNames[column];
        }
    }
}
