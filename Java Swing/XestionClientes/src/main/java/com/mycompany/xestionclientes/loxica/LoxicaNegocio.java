/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xestionclientes.loxica;

import com.mycompany.xestionclientes.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diana
 */
public class LoxicaNegocio {

    private ArrayList<Cliente> listaClientes;

    public LoxicaNegocio() {
        listaClientes = new ArrayList<>();
    }

    public void engadirCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void eliminarCliente(int numero) {
        listaClientes.remove(numero);
    }

    public void modificarCliente(Cliente cliente, int numero) {
        listaClientes.set(numero, cliente);
    }
}
