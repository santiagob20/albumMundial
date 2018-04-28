/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.ArrayList;
import pq2.Lamina;
import pq2.User;


/**
 *
 * @author santiagob20
 */
public interface interfaceLamina {

    public boolean insertar(User u);

    public boolean editar(Lamina lam);

    public void eliminar(Lamina lam);

    public ArrayList<Lamina> Consultar(User u);
}
