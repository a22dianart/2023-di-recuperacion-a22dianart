/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandotabbedpane.gui;

import java.util.EventListener;

/**
 *
 * @author diana
 */
public interface PreferencesListener extends EventListener { //IMPORTANTE

    public void setPreferences(String[] newPreferences);
}