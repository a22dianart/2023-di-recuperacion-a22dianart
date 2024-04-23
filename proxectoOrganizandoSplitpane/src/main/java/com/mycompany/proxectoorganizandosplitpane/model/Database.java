/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandosplitpane.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author diana
 */
public class Database {

    private List<Person> people;

    public Database() {
        people = new LinkedList<Person>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() { 
// Para evitar que se modifique a lista devolta
        return Collections.unmodifiableList(people); //IMPORTANTE
    }
    
    public void deletePerson(int index){
       people.remove(index);
    }
    
    
    
    public void saveToFile(File file) throws IOException { //IMPORTANTE
// crear un fluxo de saída a disco pasándolle un obxecto File
        FileOutputStream fos = new FileOutputStream(file);
// Vincular o ObjectOuputStream co fluxo de saída
        ObjectOutputStream oos = new ObjectOutputStream(fos);
// writeObject permite escribir a ficheiro un arrayList porque é un obxecto
        oos.writeObject(people);
//cerrar os fluxos de saída
        oos.close();
        fos.close();
    }

    public void loadFromFile(File file) throws IOException { //IMPORTANTE
// crear un fluxo de entrada de disco pasándolle un obxecto File
        FileInputStream fis = new FileInputStream(file);
// Vincular o ObjectInputStream co fluxo de entrada
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
// para evitar problemas, eliminar elementos da lista e cargalos de ficheiro
            people.clear();
            people.addAll((LinkedList<Person>) ois.readObject());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
// cerrar os fluxos de entrada
        ois.close();
        fis.close();
    }

}
