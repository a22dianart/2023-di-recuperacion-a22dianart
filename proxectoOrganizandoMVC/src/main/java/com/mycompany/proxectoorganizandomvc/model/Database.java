/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoorganizandomvc.model;

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
}
