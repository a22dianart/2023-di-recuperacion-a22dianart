/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandocellrenderer.gui;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author diana
 */
public class PersonFileFilter extends FileFilter {

    @Override
    public boolean accept(File file) {
// Aceptar os directorios para poder navegar pola árbore de directorios.
        if (file.isDirectory()) {
            return true;
        }
// getExtension da clase Utils.java.
        String extension = Utils.getExtension(file);
        if (extension == null) {
            return false;
        }
        if (extension.equals("per")) {
            return true;
        }
        return false;
    }

    @Override
    public String getDescription() {
// Descrición que aparecerá na lista de filtros
        return "Ficheiro de persoas (*.per)";
    }
}
