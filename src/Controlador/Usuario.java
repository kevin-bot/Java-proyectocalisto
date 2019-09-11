
package Controlador;

import Modelo.Conexion;
import java.sql.*;

public  class Usuario {
    
    protected String cedula,nombre,apellido,password,rol,telefono,direccion;

    public Usuario(String cedula, String nombre, String apellido, String password, String rol,String telefono,  String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.rol = rol;        
        this.telefono=telefono;
        this.direccion = direccion;
    }

    public Usuario() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
   
    
    //metodo loggeo de usuarios 
    
    public boolean realizar_login(String cedula,String password){
        boolean UsuarioValido=false;
        
        Conexion miconexion=new Conexion();
        
        try{
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM usuario where cedula=? and password = ?");
            ConsultaPreparada.setString(1, cedula);
            ConsultaPreparada.setString(2, password);
            
            
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
                    UsuarioValido=true;
            }
            
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        
        
        return UsuarioValido;
    }
    
    
    
}

