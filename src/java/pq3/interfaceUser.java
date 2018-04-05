/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.ArrayList;
import pq2.User;

/**
 *
 * @author santiagob20
 */
public interface interfaceUser {
    public void insertar(User us);

    public void editar(User us);

    public void eliminar(User us);

    public boolean Consultar(User us);
}
