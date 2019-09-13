package Controlador;

import Modelo.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Docente_administrador extends Usuario{
    Docente Mydocente = new Docente();

    public Docente_administrador(String cedula, String nombre, String apellido, String eps, String estrato, String estado, String password, String telefono, String direccion) {
        super(cedula, nombre, apellido, eps, estrato, estado, password, telefono, direccion);
    }
   
    
    public Docente_administrador() {
    }

    
    
    
    // CURUD MATRICULA
    
    public void CrearMatricula(Materia Mimatricula){
              Conexion miDbconn=new Conexion();
              String tirar ="";
        try {                                          
            
             Statement pst = miDbconn.getConnection().createStatement();                                     
             
              pst.executeUpdate("INSERT INTO nuevoCliente VALUES ('"+tirar+"','"+tirar+"','"
                    +tirar+"','"+tirar+"','"+tirar+"','"+tirar+"','"+tirar+"')");
    
            JOptionPane.showMessageDialog(null,"La matricula re ha registrado exitosamente");
            
            pst.close();
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
    
    }   
    
    public void ActualizarMatricula(int datosaodificar,String otrodato){
        Conexion conex= new Conexion();      
        
        try {
         
                PreparedStatement consultaInicioSe=conex.getConnection().prepareStatement("update  vehiculo set cantidad = ?  where placa =?  ");         
                consultaInicioSe.setInt(1,  datosaodificar);
                consultaInicioSe.setString(2,otrodato);
                consultaInicioSe.executeUpdate();
                                          
                consultaInicioSe.close();
                conex.getdesconectar();
    
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                Logger.getLogger(Docente_administrador.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public void EliminarMatricula(int codigoEliminar){
        Conexion conex= new Conexion();      
        
        try {
         
                PreparedStatement consultaInicioSe=conex.getConnection().prepareStatement("update  vehiculo set cantidad = ?  where placa =?  ");         
                consultaInicioSe.setInt(1,codigoEliminar);                
                consultaInicioSe.executeUpdate();
                                          
                consultaInicioSe.close();
                conex.getdesconectar();
    
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                Logger.getLogger(Docente_administrador.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
     public void ConsultarMatricula(){
            
    }
    // CRUD DOCENTES 
    
    
    
    public void Creardocente(Docente MiDocente){
         Conexion miDbconn=new Conexion();              
        try {                 
            
            if(Consultardocentes(MiDocente.getCedula())){
                JOptionPane.showMessageDialog(null, "Lo sentimos el doncente ya existe, verifique la cedula de docente");
            }else{            
                 Statement pst = miDbconn.getConnection().createStatement();                                     
                 pst.executeUpdate("INSERT INTO docente VALUES ('"+MiDocente.getCedula()+"','"+MiDocente.getNombre()+"','"+MiDocente.getApellido()+"','"+MiDocente.getEps()
                         +"','"+MiDocente.getEstrato()+"','"+MiDocente.getGrado()+"','2019-04-04','1','"+MiDocente.getFormacion()+"','"+MiDocente.getPassword()+"','"+MiDocente.getTelefono()+"')");
 
                JOptionPane.showMessageDialog(null, "La matricula re ha registrado exitosamente");

               pst.close();
               miDbconn.getdesconectar();
            }    
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
        
    } 
    
    // METODO QUE SE ENCARGA DE COSULTAR EL DOCENTE Y AL MISMO TIEMPO  DEVUELVE UNA VARIABLE PARA SABER SI EXITE YA ESE USUARIO77
    
    public boolean Consultardocentes(String cedula){
         Conexion miconexion=new Conexion();
         
         boolean Existe_docente=false;
        
        try{
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM docente where cedula=?");
            ConsultaPreparada.setString(1, cedula);
                                    
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
              Mydocente.setCedula(res.getString("cedula"));              
              Mydocente.setNombre(res.getString("nombre"));              
              Mydocente.setApellido(res.getString("apellido"));
              Mydocente.setEps(res.getString("eps"));
              Mydocente.setEstrato(res.getString("estrato"));
              Mydocente.setGrado(res.getString("grado"));
              Mydocente.setFecha_ingreso(res.getString("fecha_ingreso"));                
              Mydocente.setEstado(res.getString("estado"));                
              Mydocente.setFormacion(res.getString("formacion"));                
              Mydocente.setPassword(res.getString("password"));                
              Mydocente.setTelefono(res.getString("telefono")); 
              Existe_docente=true;
            }
            
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        return Existe_docente;
    }
    
    public void Eliminardocentes(String cedula){
         Conexion miDbconn=new Conexion();              
        try {                                                      
             Statement pst = miDbconn.getConnection().createStatement();                                     
             
             pst.executeUpdate("update docente set estado=0  where cedula like '"+cedula+"'");
              
            JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
            
            pst.close();
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
    }
    
    public void Actualizardocente(Docente MiDocente){        
         Conexion miDbconn=new Conexion();              
        try { 
            PreparedStatement ConsultaPreparada=miDbconn.getConnection().prepareStatement("SELECT * FROM docente where cedula=?");
            ConsultaPreparada.setString(1, MiDocente.getCedula());
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
                
             Statement pst = miDbconn.getConnection().createStatement();  
             
             pst.executeUpdate("update docente set nombre='"+MiDocente.getNombre()+"',apellido='"+MiDocente.getApellido()
                                +"', eps='"+MiDocente.getEps()+"',estrato='"+MiDocente.getEstrato()+"', grado='"+MiDocente.getGrado()+"', fechaingreso='2019-04-04',estado='"+res.getString("estado")+"',formacion='"+MiDocente.getFormacion()
                                +"',password='"+MiDocente.getPassword()+"', telefono='"+MiDocente.getTelefono()+"' where cedula = '"+MiDocente.getCedula()+"'");              
            JOptionPane.showMessageDialog(null, "El docente se se actualizo");
            
            pst.close();
            }else{
                 JOptionPane.showMessageDialog(null, "No existe");
            }
            
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
        
    }
    
    
    //  CRUD ESTUDIANTE
    
    public void ConsultarEstudiante(){
        
    }
    public void CrearEstudiante(){
        
    }
    public void EliminarEstudiante(){
    
    }
    public void ActualizarEstudiante(){
    
    }
    
    //   ADMINISTRATIVO
    
    public void AsignarAulaDocente(){
                
    }
    public void DelegarAsignaturaDocente(){
        
    }
    
    public void DelegarCursoDocente(){
        
    }
    public void DelegarSalonCurso(){
        
    }
    
    
}
