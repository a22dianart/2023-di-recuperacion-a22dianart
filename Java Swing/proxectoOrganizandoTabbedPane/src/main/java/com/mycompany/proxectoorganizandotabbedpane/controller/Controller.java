/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandotabbedpane.controller;

import com.mycompany.proxectoorganizandotabbedpane.model.Person;
import com.mycompany.proxectoorganizandotabbedpane.model.EmploymentCategory;
import com.mycompany.proxectoorganizandotabbedpane.model.Gender;
import com.mycompany.proxectoorganizandotabbedpane.model.Database;
import com.mycompany.proxectoorganizandotabbedpane.model.AgeCategory;
import com.mycompany.proxectoorganizandotabbedpane.gui.FormEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author diana
 */
public class Controller {
// Garda unha referencia á base de datos

    private Database db = new Database();

    public List<Person> getPeople() {
        return db.getPeople();
    }

    public String addPerson(FormEvent ev) {
        String name = ev.getName();
        String occupation = ev.getOccupation();
        int ageCatId = ev.getAgeCategory();
        String empCat = ev.getEmploymentCategory();
        AgeCategory ageCategory = null;
        switch (ageCatId) {
            case 0:
                ageCategory = AgeCategory.CHILD;
                break;
            case 1:
                ageCategory = AgeCategory.ADULT;
                break;
            case 2: 
                ageCategory= AgeCategory.SENIOR;
                break;
        }
        EmploymentCategory empCategory;
        if (empCat.equals("employed")) {
            empCategory = EmploymentCategory.EMPLOYED;
        } else if(empCat.equals("self-employed")){
            empCategory= EmploymentCategory.SELFEMPLOYED;
        }else if(empCat.equals("unemployed")){
            empCategory = EmploymentCategory.UNEMPLOYED;
        }else{
           empCategory= EmploymentCategory.OTHER;
        }
        String taxId = ev.getTaxId();
        boolean isUs= ev.isIsUs();
        Gender gender;
        if(ev.getGenderCat().equals("Female")){
            gender=Gender.FEMALE;
        }else{
            gender=Gender.MALE;
        }

     Person person = new Person(name, occupation, ageCategory, empCategory, taxId, isUs, gender);
       db.addPerson(person);
       return db.toString();
    }
    public String saveToFile(File file) throws IOException {
        db.saveToFile(file);
        return db.toString();
    }

    public String loadFromFile(File file) throws IOException {
        db.loadFromFile(file);
        return db.toString();
    }
    public String removePerson(int index) {
        db.deletePerson(index);
        return db.toString();

    }
    public String getPeopleString(){
        return db.toString();
    }
    


}
