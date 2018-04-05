/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.ArrayList;
import pq2.Ficha;


/**
 *
 * @author santiagob20
 */
public interface interfaceFicha {

    public void insertar(Ficha f);

    public void editar(Ficha f);

    public void eliminar(Ficha f);

    public ArrayList<Ficha> Consultar();
}
