package Controlador;

import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Docente_administrador extends Usuario{

    public Docente_administrador(String cedula, String nombre, String apellido, String password, String rol, String telefono, String direccion) {
        super(cedula, nombre, apellido, password, rol, telefono, direccion);
    }
    
    public Docente_administrador() {
    }

    

    
    public void realizar_login() {
        
        
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
             Statement pst = miDbconn.getConnection().createStatement();                                     
             
              pst.executeUpdate("INSERT INTO docente VALUES ('"+MiDocente.getCedula()+"','"+MiDocente.getNombre()+"','"+MiDocente.getApellido()+"','"+MiDocente.getRol()+"','"+MiDocente.getTelefono()
                      +"','"+MiDocente.getDireccion()+"','"+MiDocente.getPassword()+"')");
    
            JOptionPane.showMessageDialog(null, "La matricula re ha registrado exitosamente");
            
            pst.close();
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
    }
    
    public void Consultardocentes(){
         Conexion miconexion=new Conexion();
        
        try{
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM docente where cedula=?");
            ConsultaPreparada.setString(1, "123");
                                    
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
                res.getString("nombre");
                res.getString("nombre");
                res.getString("apellido");
                res.getString("rol");
                res.getString("telefono");
                res.getString("direccion");
                res.getString("password");                
            }
            
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        
    }
    
    public void Eliminardocentes(String cedula){
         Conexion miDbconn=new Conexion();              
        try {                                                      
             Statement pst = miDbconn.getConnection().createStatement();                                     
             
              pst.executeUpdate("DELETE from docente where cedula like '"+cedula+"'");
              
            JOptionPane.showMessageDialog(null, "La matricula re ha registrado exitosamente");
            
            pst.close();
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
    }
    
    public void Actualizardocente(String cedula){
         Conexion miDbconn=new Conexion();              
        try {                                                      
             Statement pst = miDbconn.getConnection().createStatement();                                     
             
              
              
            JOptionPane.showMessageDialog(null, "La matricula re ha registrado exitosamente");
            
            pst.close();
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
