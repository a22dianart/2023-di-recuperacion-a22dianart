/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandodialogopersonalizado.gui;

import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JDialog;

/**
 *
 * @author diana
 */
public class PreferencesDialog extends JDialog{

    public PreferencesDialog(Frame parent) {
        super(parent, "Preferences", false);
        setSize(500, 500);
        Dimension minDimension = new Dimension(600, 650);  //IMPORTANTE
        setMinimumSize(minDimension);
        
        
        
        this.setLocationRelativeTo(parent);
        
    }
    
    
}
