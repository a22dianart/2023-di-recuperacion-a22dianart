/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpanelimaxe3;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author diana
 */
public class JPanelImaxe3 extends JPanel implements Serializable {

    private ImaxeFondo imaxeFondo;
    
    private boolean ratonPresionado = false;
    private Point puntoPresion;
    private ArrastreListener arrastreListener;

    public JPanelImaxe3() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (ratonPresionado) {
                    Point posicionActual = e.getPoint();
                    if (Math.abs(puntoPresion.x - posicionActual.x) >= 50) {
                        if (arrastreListener != null) {
                            arrastreListener.arrastre();
                        }
                    }
                }
                ratonPresionado = false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ratonPresionado = true;
                puntoPresion = e.getPoint();
            }
        });

    }
    
    public void addArrastreListener(ArrastreListener arrastreListener) {
        this.arrastreListener = arrastreListener;
    }

    public void removeArrastreListener() {
        this.arrastreListener = null;
    }

    
    public ImaxeFondo getImaxeFondo() {
        return imaxeFondo;
    }

    public void setImaxeFondo(ImaxeFondo imaxeFondo) {
        this.imaxeFondo = imaxeFondo;
// Hai que volver a pintar o compoñente cada vez que se cambia a imaxe
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
// Para evitar un NullPointerException antes de iniciar a propiedade
        if (imaxeFondo != null) {
            if (imaxeFondo.getFicheiroImaxe() != null && imaxeFondo.getFicheiroImaxe().exists()) {
                ImageIcon imageIcon = new ImageIcon(imaxeFondo.getFicheiroImaxe().getAbsolutePath());
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                        imaxeFondo.getOpacidade()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
// Unha vez cambiada a opacidade, hai que volver a poñela en 1
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }
    }
}
