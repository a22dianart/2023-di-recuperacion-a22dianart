/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandoeventos;

import java.util.EventObject;

/**
 *
 * @author diana
 */
public class FormEvent extends EventObject { //IMPORTANTE

    private String text;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String nome, String ocupacion) {
        super(source);
        this.text = nome +": "+ocupacion+"\n";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
