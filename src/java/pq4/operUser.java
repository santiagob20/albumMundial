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
import java.util.logging.Level;
import java.util.logging.Logger;
import pq1.Conexion;
import pq2.User;
import pq3.interfaceUser;

/**
 *
 * @author santiagob20
 */
public class operUser implements interfaceUser{

    @Override
    public boolean insertar(User us) {
        Conexion cn = new Conexion();
        boolean auth= false;
        
        
        if(cn!=null){
            
        try
        {
            
            System.out.println("conectado!");
            PreparedStatement st = cn.conectar().prepareStatement("INSERT INTO usuario(nombre,apellido,correo,contrasena,pais) VALUES(?,?,?,?,?);");
            st.setString(1,us.getNombre());
            st.setString(2,us.getApellido());
            st.setString(3,us.getCorreo());
            st.setString(4,us.getPassword());
            st.setString(5,us.getPais());
            st.executeUpdate();
            auth = true;
            System.out.println(us.getCorreo());
            System.out.println(us.getPassword());
            return auth;
        }catch (SQLException ex) {
            Logger.getLogger(operUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
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
            
        if(cn!=null){
            
        try
        {
            cn.conectar();
            System.out.println("conectado!");
            PreparedStatement st = cn.conectar().prepareStatement("SELECT * FROM usuario WHERE correo = ? AND contrasena = ?");
            st.setString(1,us.getCorreo());
            st.setString(2,us.getPassword());
            ResultSet rs = st.executeQuery();
            System.out.println(rs.getString("correo"));
            while(rs.next())
            {
                auth = true;
                System.out.println(us.getCorreo());
                System.out.println(us.getPassword());
            }
            auth=true;
            return auth;
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(operUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("auth: "+auth);
       
        }
        return auth;
    }
    
}
