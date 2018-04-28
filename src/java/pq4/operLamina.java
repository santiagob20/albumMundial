/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pq1.Conexion;
import pq2.Lamina;
import pq2.User;
import pq3.interfaceLamina;

/**
 *
 * @author santiagob20
 */
public class operLamina implements interfaceLamina {
private static Logger log =LogManager.getLogger(operLamina.class);
    @Override
    public boolean insertar(User us) {
        Conexion cn = new Conexion();
        boolean auth = false;

        if (cn != null) {

            try {

                log.info("conectadoooO!");
                PreparedStatement st = cn.conectar().prepareStatement("SELECT crear( ? );");
                st.setString(1, us.getUsuario());
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    auth=true;
                    log.info("laminas creadas ok en la bd");
                }
                auth = true;
                

                return auth;
            } catch (SQLException ex) {
                log.error("error al crear las laminas del usuario:"+us.getUsuario());
            }
        }
        auth = true;
        cn.desconectarse();
        return auth;
    }

    @Override
    public boolean editar(Lamina f) {
        Conexion cn = new Conexion();
        boolean auth = false;

        if (cn != null) {

            try {

                log.info("conectado!");
                PreparedStatement st = cn.conectar().prepareStatement("update laminas set encontrado = true where numlamina = ? and propietario = ?");
                st.setInt(1, f.getNumeroLamina());
                st.setString(2, f.getPropietario());
                st.executeUpdate();
                auth = true;
                log.info("lamina actualizada de: " + f.getPropietario());
            } catch (SQLException ex) {
                log.error("error al actualizar el estado de la lamina"+f.getNumeroLamina());
            }
        }
        cn.desconectarse();
         return auth;
    }

    @Override
    public void eliminar(Lamina f) {

    }

    @Override
    public ArrayList<Lamina> Consultar(User us) {
        Conexion cn = new Conexion();
        ArrayList<Lamina> lista = new ArrayList<Lamina>();

        if (cn != null) {

            try {

                log.info("conectado a bd!"+ us.getUsuario());
                
                PreparedStatement st = cn.conectar().prepareStatement("select * from laminas where propietario = ? and encontrado = false;");
                st.setString(1, us.getUsuario());
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    Lamina lm = new Lamina();
                lm.setNumeroLamina(rs.getInt("numlamina"));
                lm.setEncontrada(rs.getBoolean("encontrado"));
                lm.setPropietario(rs.getString("propietario"));
                lista.add(lm);
                
                   log.info("consulta de laminas exitosa ej:"+lista.get(0).getNumeroLamina());
                }
            } catch (SQLException ex) {
                log.error("Error al consultar las laminas de: "+us.getUsuario());
            
            }
        }
        cn.desconectarse();
        System.out.println("listaaaa: "+lista.size());
        return lista;
    }

}
