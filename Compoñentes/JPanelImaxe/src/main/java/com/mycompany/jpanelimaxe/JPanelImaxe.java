/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpanelimaxe;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author diana
 */
public class JPanelImaxe extends JPanel implements Serializable {

    private File ficheiroImaxe;

    public JPanelImaxe() {
    }

    public File getFicheiroImaxe() {
        return ficheiroImaxe;
    }

    public void setFicheiroImaxe(File ficheiroImaxe) {
        this.ficheiroImaxe = ficheiroImaxe;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (ficheiroImaxe != null && ficheiroImaxe.exists()) {
            ImageIcon imageIcon = new ImageIcon(ficheiroImaxe.getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
    }
    

    

}
