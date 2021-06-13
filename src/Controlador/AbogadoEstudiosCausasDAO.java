/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Abogado_administrador;
import Modelo.Abogado_defensor_tribunales;
import Modelo.Abogado_estudio_causas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XPS 9560
 */
public class AbogadoEstudiosCausasDAO {
    public boolean registrar_abogado_estudio_causas(Abogado_estudio_causas ae)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into abogado_administrador (mail, usuario, contrasena) values (?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, ae.getMail());
            ps.setString(2, ae.getUsuario());
            ps.setString(3, ae.getContrasena());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(AbogadoEstudiosCausasDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbogadoEstudiosCausasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    //Buscar Por Codigo

    public void registrar_abogado_estudio_causas(Abogado_administrador adim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Abogado_estudio_causas Validar_conexion_abogado_estudio_causas(String us, String pass)
    {
        Abogado_estudio_causas ad=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from abogado_estudio_causas where usuario=? and contrasena=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, us);
            ps.setString(1, pass);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                ad=new Abogado_estudio_causas(rs.getString(1),rs.getString(2),rs.getString(3));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AbogadoEstudiosCausasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbogadoEstudiosCausasDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
        return ad;
    }
    
}
