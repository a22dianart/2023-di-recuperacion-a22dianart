/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandoeditorcelapersonalizado.gui;

import java.util.EventObject;

/**
 *
 * @author diana
 */
public class FormEvent extends EventObject { //IMPORTANTE

    private String name;
    private String occupation;
    private int ageCategory;
    private String employmentCategory;
    private String taxId;
    private boolean isUs;
    private String genderCat; 

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String nome, String ocupacion, int age, String employment, String taxId, boolean isUs, String gender) {
        super(source);
        this.name = nome;
        this.occupation=ocupacion;
        this.ageCategory=age;
        this.employmentCategory=employment;
        this.taxId=taxId;
        this.isUs= isUs;
        this.genderCat=gender;
        

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

    public int getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(int ageCategory) {
        this.ageCategory = ageCategory;
    }

    public String getEmploymentCategory() {
        return employmentCategory;
    }

    public void setEmploymentCategory(String employmentCategory) {
        this.employmentCategory = employmentCategory;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public boolean isIsUs() {
        return isUs;
    }

    public void setIsUs(boolean isUs) {
        this.isUs = isUs;
    }

    public String getGenderCat() {
        return genderCat;
    }

    public void setGenderCat(String genderCat) {
        this.genderCat = genderCat;
    }

   

}
