/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author diana
 */
public class CorPropertyEditorSupport extends PropertyEditorSupport{
    private CorPanel corPanel = new CorPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return corPanel;
    }

    @Override
    public String getJavaInitializationString() {
        Cor cor = corPanel.getSelectedValue();
        
        int redTexto =cor.getCorTexto().getRed();
        int greenTexto= cor.getCorTexto().getGreen();
        int blueTexto = cor.getCorTexto().getBlue();
        
        int redFondo = cor.getCorFondo().getRed();
        int greenFondo = cor.getCorFondo().getGreen();
        int blueFondo = cor.getCorFondo().getBlue();
       
        return "new com.mycompany.exercicio2.Cor(" + " new java.awt.Color("+redTexto+","+greenTexto+","+blueTexto+") , new java.awt.Color("+redFondo+","+greenFondo+","+blueFondo+"))";
              
    }

    @Override
    public Object getValue() {
        return corPanel.getSelectedValue();
    }

}
