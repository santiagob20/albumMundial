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
    public void insertar(User us) {
        Conexion cn = new Conexion();
        
        Connection c = cn.conectar();
        
        if(c!=null){
            
        try
        {
            cn.conectar();
            System.out.println("conectado!");
            PreparedStatement st = c.prepareStatement("INSERT  INTO usuario VALUES(?,?)");
            st.setString(1,us.getEmail());
            st.setString(2,us.getPassword());
            st.executeUpdate();
            
            System.out.println(us.getEmail());
            System.out.println(us.getPassword());
        }catch (SQLException ex) {
            Logger.getLogger(operUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
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
        Connection c = cn.conectar();      
        if(c!=null){
            
        try
        {
            cn.conectar();
            System.out.println("conectado!");
            PreparedStatement st = c.prepareStatement("SELECT * FROM usuario WHERE correo = ? AND contrasena = ?");
            st.setString(1,us.getEmail());
            st.setString(2,us.getPassword());
            ResultSet rs = st.executeQuery();
            System.out.println(rs.toString());
            while(rs.next())
            {
                auth = true;
            }
            System.out.println(us.getEmail());
            System.out.println(us.getPassword());
            
            auth = true;
        
        } catch (SQLException ex) {
            Logger.getLogger(operUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(auth);
       
        }
        return auth;
    }
    
}
