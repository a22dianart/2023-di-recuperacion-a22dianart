/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandojavapreferences.model;

/**
 *
 * @author diana
 */
public enum EmploymentCategory {
    EMPLOYED("employed"), SELFEMPLOYED("self employed"), UNEMPLOYED("unemployed"), OTHER("other");

    private final String displayName;

    EmploymentCategory(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
