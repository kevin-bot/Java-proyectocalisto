
package Controlador;

import Modelo.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

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
    
    public void realizar_login(String cedula,String password) throws SQLException{
        
        String rolUsuarioLoggeado="";
        Conexion miconexion=new Conexion();
        
        try{
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM usuario1 where usu=? and contra = ?");
            ConsultaPreparada.setString(1, cedula);
            ConsultaPreparada.setString(2, password);
            
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
                
                
                if(res.getString("rol").equals("docente")){ 
                     String roles[]={"Administrar Estudiante","Administrar notas estudiante"};    
                     String CrudDocenteEstudiante[]={"Consultar estudiante","Consultar rendimiento estudiante"};
                     String CrudDocenteNotasEstudiante[]={"Crear nota","Consultar notas","Eliminar Notas","Actualizar nota"};
                                              
                     String opcionAdministrar=(String)JOptionPane.showInputDialog(null, "¿Que desea hacer?", "Opcion de ingreso", JOptionPane.DEFAULT_OPTION, null, roles, roles[0]);
                     switch (opcionAdministrar){
                         case "Administrar Estudiante":{
                             String opcionAdministrarEstudiante=(String)JOptionPane.showInputDialog(null, "¿Que desea hacer?", "Opcion de ingreso", JOptionPane.DEFAULT_OPTION, null, CrudDocenteEstudiante, CrudDocenteEstudiante[0]);
                             switch (opcionAdministrarEstudiante){
                                 case "Consultar estudiante":{
                                        System.out.println("Abrir consultar estudiante");
                                     break;
                                 }
                                 case "Consultar rendimiento estudiante":{
                                     System.out.println("Abrir consultar notas del estudiante");
                                     break;
                                 }
                                 
                             }
                             break;
                         }
                         case "Administrar notas estudiante":{
                             String opcionAdministrarEstudiante=(String)JOptionPane.showInputDialog(null, "¿Que desea hacer?", "Opcion de ingreso", JOptionPane.DEFAULT_OPTION, null, CrudDocenteNotasEstudiante, CrudDocenteNotasEstudiante[0]);
                            
                                switch (opcionAdministrarEstudiante){
                                 case "Crear nota":{
                                        System.out.println("Abrir crear nota");
                                     break;
                                 }
                                 case "Consultar notas":{
                                     System.out.println("Abrir consultar nota");
                                     break;
                                 }
                                 case "Eliminar Notas":{
                                     System.out.println("Abrir eliminar nota");
                                     break;
                                 }
                                 case "Actualizar nota":{
                                     System.out.println("Abrir cactualizar nota");
                                     break;
                                 }
                                
                                 
                             }
                             
                             break;
                         }
                         
                     }
                        
                     
                }else if(res.getString("rol").equals("docente ad")){
                        String roles[]={"Administrar matricula","Administrar docente","Administrar asignatura","Administrar estudiante"};                   
                    if(JOptionPane.showInputDialog(null, "¿Que desea hacer?", "Opcion de ingreso", JOptionPane.DEFAULT_OPTION, null, roles, roles[0])==""){
                    
                    }   
                    
                    
                } else{
                        JOptionPane.showMessageDialog(null,"Datos no validos");
                }               
                
                
            }
            
            
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        
    }
    
    
    
}

