/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandoserializacion.model;

import java.io.Serializable;

/**
 *
 * @author diana
 */
public class Person implements Serializable{


    private static final long serialVersionUID = 1234L; //IMPORTANTE
  
    static int count = 0;
    int id;
    String name;
    String occupation;
    AgeCategory ageCategory;
    EmploymentCategory empCat;
    String taxId;
    boolean usCitizen;
    Gender gender;

    public Person(String name, String occupation, AgeCategory ageCategory, EmploymentCategory empCat, String taxId, boolean usCitizen, Gender gender) {
        count++;
        this.id=count;
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.empCat = empCat;
        this.taxId = taxId;
        this.usCitizen = usCitizen;
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public EmploymentCategory getEmpCat() {
        return empCat;
    }

    public void setEmpCat(EmploymentCategory empCat) {
        this.empCat = empCat;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public boolean isUsCitizen() {
        return usCitizen;
    }

    public void setUsCitizen(boolean usCitizen) {
        this.usCitizen = usCitizen;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", occupation=" + occupation + ", ageCategory=" + ageCategory + ", empCat=" + empCat + ", taxId=" + taxId + ", usCitizen=" + usCitizen + ", gender=" + gender + '}';
    }
    
}
