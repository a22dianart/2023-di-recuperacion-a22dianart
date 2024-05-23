/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio22;

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
        
        int redFondo = cor.getCorTexto().getRed();
        int greenFondo = cor.getCorFondo().getGreen();
        int blueFondo = cor.getCorFondo().getBlue();
       
        return "new com.mycompany.exercicio22.Cor("+redTexto+","+greenTexto+","+blueTexto+","+redFondo+","+greenFondo+","+blueFondo+")" ;
              
    }

    @Override
    public Object getValue() {
        return corPanel.getSelectedValue();
    }

}
