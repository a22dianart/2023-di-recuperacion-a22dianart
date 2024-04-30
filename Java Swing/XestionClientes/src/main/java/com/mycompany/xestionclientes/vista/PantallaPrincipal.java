/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.xestionclientes.vista;

import com.mycompany.xestionclientes.loxica.LoxicaNegocio;
import com.mycompany.xestionclientes.modelo.Cliente;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diana
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private LoxicaNegocio loxicaNegocio;
    private ListSelectionModel selectionModel;


    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        loxicaNegocio = new LoxicaNegocio();
        initComponents();
        inicializarTaboa();
        selectionModel = tblClientes.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tblClientes.getSelectedRow();
                    int selectedColumn = tblClientes.getSelectedColumn();
                    if (selectedRow != -1 && selectedColumn != -1) { 
                        Cliente clienteSeleccionado =loxicaNegocio.getListaClientes().get(selectedRow);
                        String[] datos = clienteSeleccionado.toArray();
                        txtClientes.setText("");
                        for(String dato : datos){
                            txtClientes.append(dato);
                            txtClientes.append("\n");
                        }
                        
                    }
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtClientes = new javax.swing.JTextArea();
        btnModificar = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        itemAlta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        txtClientes.setEditable(false);
        txtClientes.setColumns(20);
        txtClientes.setRows(5);
        jScrollPane2.setViewportView(txtClientes);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, java.awt.BorderLayout.PAGE_END);

        borrarBtn.setText("Borrar");
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(borrarBtn, java.awt.BorderLayout.PAGE_START);

        menuClientes.setText("Clientes");

        itemAlta.setText("Alta...");
        itemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAltaActionPerformed(evt);
            }
        });
        menuClientes.add(itemAlta);

        jMenuBar1.add(menuClientes);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = tblClientes.getSelectedRow();
        if (fila != -1) {
            Cliente cliente =loxicaNegocio.getListaClientes().get(fila);
            Dialogo dialogo = new Dialogo(this, true, cliente, fila);
            dialogo.setVisible(true);
            


        } else {
            JOptionPane.showMessageDialog(null, "Selecciona cliente a modificar", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void itemAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAltaActionPerformed
        Dialogo dialogoAlta = new Dialogo(this, true);
        dialogoAlta.setVisible(true);
    }//GEN-LAST:event_itemAltaActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        int fila = tblClientes.getSelectedRow();
        if(fila !=-1){
           loxicaNegocio.eliminarCliente(fila);
           dtm.removeRow(fila);
           txtClientes.setText("");
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona a fila a borrar", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_borrarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    private void inicializarTaboa() {
        dtm = new DefaultTableModel();
// Definir o modelo
        dtm.setColumnIdentifiers(new String[]{"Nome", "Apelidos", "Data alta", "Provincia"});
// Asignar o modelo á táboa
        tblClientes.setModel(dtm);
        
        
        
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2018);
//        calendar.set(Calendar.MONTH, Calendar.DECEMBER); 
//        calendar.set(Calendar.DAY_OF_MONTH, 8);
//        engadirCliente(new Cliente("María", "Romero", calendar.getTime(), "A Coruña"));
    }
    public void engadirCliente(Cliente cliente) {
        loxicaNegocio.engadirCliente(cliente);
        dtm.addRow(cliente.toArray());
    }
    public void modificarCliente(Cliente cliente, int numero){
        loxicaNegocio.modificarCliente(cliente, numero);
        dtm.removeRow(numero);
        dtm.insertRow(numero, cliente.toArray());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton btnModificar;
    private javax.swing.JMenuItem itemAlta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextArea txtClientes;
    // End of variables declaration//GEN-END:variables
}