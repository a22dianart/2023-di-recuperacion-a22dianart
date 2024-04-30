/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandoeditorcelapersonalizado.gui;

import com.mycompany.proxectoorganizandoeditorcelapersonalizado.model.Person;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.mycompany.proxectoorganizandoeditorcelapersonalizado.model.EmploymentCategory;

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
    
    @Override 
    public boolean isCellEditable(int row, int column){ //IMPORTANTE
        if(column==1||column==5||column==4){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column){//IMPORTANTE
        if(column==1){
            List<Person> lista=this.personList;
            Person persona = lista.get(row);
            persona.setName(String.valueOf(aValue));
            this.personList  = lista;
        }else if (column==5){
            List<Person> lista = this.personList;
            Person persona = lista.get(row);
            Boolean boleano = Boolean.valueOf(String.valueOf(aValue));
            persona.setUsCitizen(boleano);
            this.personList = lista; 
        }else if(column==4){
            List<Person> lista = this.personList;
            Person persona = lista.get(row);
            EmploymentCategory employedCat= (EmploymentCategory) aValue;
            persona.setEmpCat(employedCat);
            this.personList = lista;
            
        }
    }
    @Override
    public Class<?> getColumnClass(int columnIndex){ //IMPORTANTE
        
        if(columnIndex==5){
            return Boolean.class;
        }else if (columnIndex==4){
            return EmploymentCategory.class;
        }
        else{
            return String.class;
        }
        
    }
}
 