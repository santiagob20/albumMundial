/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pq1.Conexion;
import pq2.User;
import pq3.interfaceUser;

/**
 *
 * @author santiagob20
 */
public class operUser implements interfaceUser {

    private static Logger log = LogManager.getLogger(operLamina.class);

    @Override
    public boolean insertar(User us) {
        Conexion cn = new Conexion();
        boolean auth = false;

        if (cn != null) {

            try {

                log.info("conectado!");
                PreparedStatement st = cn.conectar().prepareStatement("INSERT INTO usuarios(nombre,apellido,usuario,contrasena,pais) VALUES(?,?,?,?,?);");
                st.setString(1, us.getNombre());
                st.setString(2, us.getApellido());
                st.setString(3, us.getUsuario());
                st.setString(4, us.getPassword());
                st.setString(5, us.getPais());
                st.executeUpdate();
                auth = true;
                log.info("usuario registrado: " + us.getUsuario());
                return auth;
            } catch (SQLException ex) {
                log.error("Error al insertar usuario");

            }
        }
        cn.desconectarse();
        return auth;
    }

    @Override
    public void editar(User us) {

    }

    @Override
    public void eliminar(User us) {

    }

    @Override
    public boolean Consultar(User us) {
        Conexion cn = new Conexion();

        boolean auth = false;

        if (cn != null) {

            try {
                cn.conectar();
                log.info("conectadooo!");
                PreparedStatement st = cn.conectar().prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?");
                st.setString(1, us.getUsuario());
                st.setString(2, us.getPassword());
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    auth = true;
                }
                //auth=true;
                return auth;

            } catch (SQLException ex) {
                log.error("Error al verificar usuario y contraseña");
            }
        }
        cn.desconectarse();
        return auth;
    }

}
