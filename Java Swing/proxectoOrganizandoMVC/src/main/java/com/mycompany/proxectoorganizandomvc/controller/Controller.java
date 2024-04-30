/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandomvc.controller;

import com.mycompany.proxectoorganizandomvc.gui.FormEvent;
import com.mycompany.proxectoorganizandomvc.model.*;
import java.util.List;

/**
 *
 * @author diana
 */
public class Controller {
// Garda unha referencia á base de datos

    private Database db = new Database();

    public List<Person> getPeople() {//?
        return db.getPeople();
    }

    public void addPerson(FormEvent ev) {
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
    }
}
