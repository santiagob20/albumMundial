/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq2;

import java.util.ArrayList;

/**
 *
 * @author santiagob20
 */
public class Respuesta {
    
    private int codigo;
    private String descripcion;
    private ArrayList<Lamina> lista;
    private String nombreUser;

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public ArrayList<Lamina> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Lamina> lista) {
        this.lista = lista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
