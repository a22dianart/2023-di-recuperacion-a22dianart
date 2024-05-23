/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author diana
 */
public class AlarmaPropertyEditorSupport extends PropertyEditorSupport {

    private AlarmaPanel alarmaPanel = new AlarmaPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return alarmaPanel;
    }

    @Override
    public String getJavaInitializationString() {
        Alarma alarma = alarmaPanel.getSelectedValue();

        boolean alarmaProgramada = alarma.isProgramada();
        int hora =alarma.getHora();
        int minuto = alarma.getMinuto();
        int segundo = alarma.getSegundo();
       

        return "new com.mycompany.exercicio6.Alarma(" +alarmaProgramada +", "+hora+", "+minuto+", "+segundo+")";

    }

    @Override
    public Object getValue() {
        return alarmaPanel.getSelectedValue();
    }

}
