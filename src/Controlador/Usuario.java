
package Controlador;

import Modelo.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

import vista.AgregarDocente;
import vista.inicioAdmibnistradorDocente;
import vista.iniciodocente;

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
    
    public void realizar_login(String cedula,String password,String database) throws SQLException{
                                
        Conexion miconexion=new Conexion();
        
        try{
                
            
            System.out.println(""+database);
            
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM "+database+" where cedula=? and password = ?");
            ConsultaPreparada.setString(1, cedula);
            ConsultaPreparada.setString(2, password);
            
            ResultSet res=ConsultaPreparada.executeQuery();
            
            
            
            if(res.next()){
                
                
                if(database.equals("docente")){                    
                     
                              java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                    iniciodocente dialog = new iniciodocente(new javax.swing.JFrame(), true);
                                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                        @Override
                                        public void windowClosing(java.awt.event.WindowEvent e) {
                                            //System.exit(0);
                                        }
                                    });
                                    dialog.setVisible(true);
                                }
                            });    
                     
                }else if(database.equals("administrador_docente")){
                    
                    System.out.println("si entro a aca");
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            inicioAdmibnistradorDocente dialog = new inicioAdmibnistradorDocente(new javax.swing.JFrame(), true);
                            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                @Override
                                public void windowClosing(java.awt.event.WindowEvent e) {
                                    //System.exit(0);
                                }
                            });
                            dialog.setVisible(true);
                        }
                    });
                    
                }
                
                
            }else{
                        JOptionPane.showMessageDialog(null,"Datos no validos");
                } 
            
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        
    }
    
    
    
}

