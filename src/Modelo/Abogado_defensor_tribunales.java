/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author XPS 9560
 */
public class Abogado_defensor_tribunales extends Abogado
{
    String mail;

    public Abogado_defensor_tribunales(String mail, String usuario, String contrasena) {
        super(usuario, contrasena);
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Abogado_defensor_tribunales{" + "mail=" + mail + '}';
    }
    public String iniciar_sesion(String us, String contras)
    {
        if(us.compareToIgnoreCase(usuario)==0 && contras.compareToIgnoreCase(contrasena)==0)
        {
            return "Credenciales correctas, acceso autorizado";
        }
        else
        {
            return "Contraseña o usuario incorrectos, acceso denegado";
        }
    }

    
}
