
package Controlador;

import Modelo.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

import vista.AdministrarDocente;
import vista.inicioAdmibnistradorDocente;


public  class Usuario {
    
    protected String cedula,nombre,apellido,eps,estrato,estado,password,telefono,direccion;

    //CONTRUCTOR TOTAL PARA ALMACENAR TODA LA INFROMACION DEL DOCENTE

    public Usuario(String cedula, String nombre, String apellido, String eps, String estrato, String estado, String password, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.eps = eps;
        this.estrato = estrato;
        this.estado = estado;
        this.password = password;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
    //CONSTRUCTOR  SOLO PARA INSERRCON YA QUE LA HORA Y LA FECHA SE HACE DIRECTAMENTE AL MOMENTO DE LA INSERRCION CON UN ESTADO 1 Y UNA FECHA CURRENTDATE

    public Usuario(String cedula, String nombre, String apellido, String eps, String estrato, String password, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.eps = eps;
        this.estrato = estrato;
        this.password = password;
        this.telefono = telefono;
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

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                     
                              Docente mydocente= new Docente();
                              mydocente.Administrar_notas();
                     
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

