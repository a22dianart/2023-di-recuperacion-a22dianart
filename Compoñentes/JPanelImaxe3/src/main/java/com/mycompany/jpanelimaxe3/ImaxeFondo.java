/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpanelimaxe3;

/**
 *
 * @author diana
 */
import java.io.File;
import java.io.Serializable;

public class ImaxeFondo implements Serializable {

    private File ficheiroImaxe;
    private Float opacidade;

    public ImaxeFondo(File ficheiroImaxe, Float opacidade) {
        this.ficheiroImaxe = ficheiroImaxe;
        this.opacidade = opacidade;
    }

    public File getFicheiroImaxe() {
        return ficheiroImaxe;
    }

    public void setFicheiroImaxe(File ficheiroImaxe) {
        this.ficheiroImaxe = ficheiroImaxe;
    }

    public Float getOpacidade() {
        return opacidade;
    }

    public void setOpacidade(Float opacidade) {
        this.opacidade = opacidade;
    }
}
