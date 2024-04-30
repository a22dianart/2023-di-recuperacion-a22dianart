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
public class StringEvent extends EventObject { //IMPORTANTE

    private String text;

    public StringEvent(Object source) {
        super(source);
    }

    public StringEvent(Object source, String text) {
        super(source);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    

}
