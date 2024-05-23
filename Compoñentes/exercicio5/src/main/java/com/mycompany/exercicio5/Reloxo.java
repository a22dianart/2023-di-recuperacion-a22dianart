/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author diana
 */
public class Reloxo extends JLabel implements Serializable {
    
    private boolean formato12h;

    public Reloxo() {
        formato12h=false;
        Timer timer = new Timer(1000, new ActionListener() { //cada segundo actualizase
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime locaDate = LocalDateTime.now();
                int hours = locaDate.getHour();
                int minutes = locaDate.getMinute();
                int seconds = locaDate.getSecond();
                
                if(formato12h==true && hours>12){
                    hours=hours-12;
                }
                
                ponherData(hours, minutes, seconds);
                
                
            }
        });
        
        timer.start();
        
    }

    public boolean isFormato12h() {
        return formato12h;
    }

    public void setFormato12h(boolean formato12h) {
        this.formato12h = formato12h;
    }

   
    
    private void ponherData(int hours, int minutes, int seconds){
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(hours));
        sb.append(":");
        sb.append(String.valueOf(minutes));
        sb.append(":");
        sb.append(String.valueOf(seconds));
        
        this.setText(sb.toString());
        
    }
    
    
    
}
