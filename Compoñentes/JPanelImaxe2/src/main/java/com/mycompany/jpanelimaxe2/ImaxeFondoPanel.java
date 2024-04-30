/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.jpanelimaxe2;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author diana
 */
public class ImaxeFondoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImaxeFondoPanel
     */
    public ImaxeFondoPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImaxe = new javax.swing.JLabel();
        lblOpacidade = new javax.swing.JLabel();
        txtImaxe = new javax.swing.JTextField();
        btnImaxe = new javax.swing.JButton();
        sliderOpacidade = new javax.swing.JSlider();

        lblImaxe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImaxe.setText("Imaxe:");

        lblOpacidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpacidade.setText("Opacidade:");
        lblOpacidade.setToolTipText("");

        txtImaxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImaxeActionPerformed(evt);
            }
        });

        btnImaxe.setText("...");
        btnImaxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImaxeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOpacidade)
                    .addComponent(lblImaxe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtImaxe, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(sliderOpacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImaxe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImaxe)
                    .addComponent(txtImaxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImaxe))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOpacidade)
                    .addComponent(sliderOpacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtImaxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImaxeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImaxeActionPerformed

    private void btnImaxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImaxeActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);
// Se se selecciona un arquivo e se pulsa aceptar
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            txtImaxe.setText(file.getAbsolutePath());
        }


    }//GEN-LAST:event_btnImaxeActionPerformed

    public ImaxeFondo getSelectedValue() {
        File file = new File(txtImaxe.getText());
// Engádese o f para converter o enteiro a float
        Float opacidade = sliderOpacidade.getValue() / 100f;
        return new ImaxeFondo(file, opacidade);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImaxe;
    private javax.swing.JLabel lblImaxe;
    private javax.swing.JLabel lblOpacidade;
    private javax.swing.JSlider sliderOpacidade;
    private javax.swing.JTextField txtImaxe;
    // End of variables declaration//GEN-END:variables
}
