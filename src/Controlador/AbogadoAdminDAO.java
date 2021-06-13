/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Abogado_administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;


/**
 *
 * @author XPS 9560
 */
public class AbogadoAdminDAO {

  
    public boolean ingresar_admin (Abogado_administrador ca)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into abogado_administrador (mail, usuario, contrasena) values (?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, ca.getMail());
            ps.setString(2, ca.getUsuario());
            ps.setString(3, ca.getContrasena());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(AbogadoAdminDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbogadoAdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    //Buscar Por Codigo
    //////////////////////////////////////////////////////////////////////////////////////////////
        public Abogado_administrador Validar_conexion_abogado_admin(String us, String pass)
    {
        Abogado_administrador ad=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from abogado_administrador where usuario=? and contrasena=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, us);
            ps.setString(1, pass);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                ad=new Abogado_administrador(rs.getString(1),rs.getString(2),rs.getString(3));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AbogadoAdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbogadoAdminDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
        return ad;
    }



    
    
}
