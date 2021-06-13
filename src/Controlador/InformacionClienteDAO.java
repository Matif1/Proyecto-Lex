/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Agregar_informacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XPS 9560
 */
public class InformacionClienteDAO {
    public boolean Generar_documento_factibilidad_caso(Agregar_informacion df)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, documentacion_factibilidad_caso) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, df.getFecha_dia());
            ps.setInt(2, df.getFecha_mes());
            ps.setInt(3, df.getFecha_anno());
            ps.setString(4, df.getRut_cliente());
            ps.setString(5, df.getDocumentacion_factibilidad_caso());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public boolean Agregar_diligencia(Agregar_informacion ad)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, diligencias) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, ad.getFecha_dia());
            ps.setInt(2, ad.getFecha_mes());
            ps.setInt(3, ad.getFecha_anno());
            ps.setString(4, ad.getRut_cliente());
            ps.setString(5, ad.getDiligencias());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public boolean Agregar_documentacion_asociada_a_contratos(Agregar_informacion ad)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, documentacion_asociada_contratos) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, ad.getFecha_dia());
            ps.setInt(2, ad.getFecha_mes());
            ps.setInt(3, ad.getFecha_anno());
            ps.setString(4, ad.getRut_cliente());
            ps.setString(5, ad.getDocumentacion_asociada_contratos());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    ////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean Agregar_documentacion_asociada_a_causas(Agregar_informacion ad)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, documentacion_asociado_causas) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, ad.getFecha_dia());
            ps.setInt(2, ad.getFecha_mes());
            ps.setInt(3, ad.getFecha_anno());
            ps.setString(4, ad.getRut_cliente());
            ps.setString(5, ad.getDocumentacion_asociado_causas());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    //////////////////////////////////////////////////////////////////
    public boolean Agregar_presupuestos_cliente(Agregar_informacion ap)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, presupuestos) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, ap.getFecha_dia());
            ps.setInt(2, ap.getFecha_mes());
            ps.setInt(3, ap.getFecha_anno());
            ps.setString(4, ap.getRut_cliente());
            ps.setInt(5, ap.getPresupuestos());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    /////////////////////////////////////////////////////////////////////////////////////
    public boolean Agregar_causas_cliente(Agregar_informacion ac)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, causas_clientes) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, ac.getFecha_dia());
            ps.setInt(2, ac.getFecha_mes());
            ps.setInt(3, ac.getFecha_anno());
            ps.setString(4, ac.getRut_cliente());
            ps.setString(5, ac.getCausas_clientes());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    ////////////////////////////////////////////////////////////////////////////////
    
    public boolean Agregar_pagos_presenciales(Agregar_informacion ap)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, pagos_precenciales) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, ap.getFecha_dia());
            ps.setInt(2, ap.getFecha_mes());
            ps.setInt(3, ap.getFecha_anno());
            ps.setString(4, ap.getRut_cliente());
            ps.setInt(5, ap.getPagos_precenciales());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    //////////////////////////////////////////////////////////////////////////////////
    public boolean Agregar_pagos_por_transferencia(Agregar_informacion ap)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, pagos_por_trasferencia) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, ap.getFecha_dia());
            ps.setInt(2, ap.getFecha_mes());
            ps.setInt(3, ap.getFecha_anno());
            ps.setString(4, ap.getRut_cliente());
            ps.setInt(5, ap.getPagos_por_trasferencia());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    /////////////////////////////////////////////////////////////////////////
    public boolean Agregar_ingresos_mensuales(Agregar_informacion ai)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_mes, ingresos_mensuales) values (?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(2, ai.getFecha_mes());
            ps.setInt(5, ai.getIngresos_mensuales());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    /////////////////////////////////////////////////////////////////////////////
    public boolean Agregar_ingresos_annuales(Agregar_informacion ai)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_anno, ingresos_anuales) values (?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(2, ai.getFecha_anno());
            ps.setInt(5, ai.getIngresos_anuales());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean Generar_instructivo_causa(Agregar_informacion gi)
    {
        boolean resultado=false;
         try {
            Connection con=Conexion.getConexion();
            String query="insert into informacion_clientes (fecha_dia, fecha_mes, fecha_anno, rut_cliente, instrucciones_causas) values (?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, gi.getFecha_dia());
            ps.setInt(2, gi.getFecha_mes());
            ps.setInt(3, gi.getFecha_anno());
            ps.setString(4, gi.getRut_cliente());
            ps.setString(5, gi.getInstrucciones_causas());
            resultado=ps.executeUpdate()==1;
            ps.close();
          } catch (SQLException ex) {
            Logger.getLogger(InformacionClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformacionClienteDAO .class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
    }
   
}   

