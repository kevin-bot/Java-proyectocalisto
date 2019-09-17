package Controlador;

import Modelo.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Docente_administrador extends Usuario{
    Docente Mydocente = new Docente();

    public Docente_administrador(String cedula, String nombre, String apellido, String eps, String estrato, String estado, String password, String telefono, String direccion) {
        super(cedula, nombre, apellido, eps, estrato, estado, password, telefono, direccion);
    }
   
    
    public Docente_administrador() {
    }

  
    // CRUD DOCENTES 
    
     //ESTE ES UN METODO CON LA FUNCIONALIDAD PARA CONSULTAR TODOS LOS DOCENTES Y MOSTRARLOS EN UN JCOMBO
    public  void BuscarDocenteLenarJcombo(JComboBox combo){        
        try {
            Conexion miDbconn=new Conexion();
            PreparedStatement ConsultaPreparada=miDbconn.getConnection().prepareStatement("SELECT * FROM docente where estado = 1 ");            
            ResultSet res=ConsultaPreparada.executeQuery();
            while(res.next()){
                combo.addItem(res.getString("cedula"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Docente_administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
        //METODO QUE SE ENCARGA DE CREAR UN DOCENTE
    public void Creardocente(Docente MiDocente){
         Conexion miDbconn=new Conexion();              
        try {        
//            PreparedStatement ConsultaPreparada=miDbconn.getConnection().prepareStatement("select cedula from docente where (select count(cedula) from docente )<= 5 and estado = 1 ");            
//            ResultSet res=ConsultaPreparada.executeQuery();
//            
//            if(res.next() ){
            
                
                 Statement pst = miDbconn.getConnection().createStatement();                                     
                 pst.executeUpdate("INSERT INTO docente VALUES ('"+MiDocente.getCedula()+"','"+MiDocente.getNombre()+"','"+MiDocente.getApellido()+"','"+MiDocente.getEps()
                         +"','"+MiDocente.getEstrato()+"','"+MiDocente.getGrado()+"','2019-08-08','1','"+MiDocente.getFormacion()+"','"+MiDocente.getPassword()+"','"+MiDocente.getTelefono()+"','"+MiDocente.getDireccion()+"')");
 
                JOptionPane.showMessageDialog(null, "El docente fue creado exitosamente"); pst.close();  
//            }else{
//                JOptionPane.showMessageDialog(null, "Usted ya tiene el cupo de docentes completo, debes de eliminar un docente","Advertencia",2);} 
//            
            miDbconn.getdesconectar();
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
        
    } 
    
        //METODO QUE SE ENCARGA DE CONSULTAR UN DOCENTE PARA MOSTRARLO EN JLIST
    public ArrayList<Docente> Consultardocentes(){
         Conexion miconexion=new Conexion();
         ArrayList<Docente> miListDocente = new ArrayList<>();
         
        
        try{
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM docente where estado = 1 ");
                                    
            ResultSet res=ConsultaPreparada.executeQuery();
            
            
            while(res.next()){
               Docente Mydocente = new Docente();               
               Mydocente.setCedula(res.getString("cedula"));                   
              Mydocente.setNombre(res.getString("nombre"));              
              Mydocente.setApellido(res.getString("apellido"));
             Mydocente.setEps(res.getString("eps"));
              Mydocente.setEstrato(res.getString("estrato"));             
              Mydocente.setGrado(res.getString("grado"));
             Mydocente.setFecha_ingreso(res.getString("fechaingreso"));                
              Mydocente.setEstado(res.getString("estado"));                
              Mydocente.setFormacion(res.getString("formacion"));                
              Mydocente.setPassword(res.getString("password"));                
              Mydocente.setTelefono(res.getString("telefono"));               
              miListDocente.add(Mydocente); 
            }
                    
           
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        return miListDocente;
    }
    
        //METODO QUE SE ENCARGA DE ELIMINAR UN DOCENTE CON LA CEDULA
    public void Eliminardocentes(String cedula){
         Conexion miDbconn=new Conexion();              
        try {  
             PreparedStatement ConsultaPreparada=miDbconn.getConnection().prepareStatement("SELECT * FROM docente where cedula=? and estado like 1");
            ConsultaPreparada.setString(1, cedula);
                                    
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
            
             Statement pst = miDbconn.getConnection().createStatement();                                                  
             pst.executeUpdate("update docente set estado=0  where cedula like '"+cedula+"'");              
             JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
            
            pst.close();
            }else{JOptionPane.showMessageDialog(null, "El Docente no existe");}
            ConsultaPreparada.close();
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Falló", null, 0);
        }
    }
    
          //METODO QUE SE ENCARGA DE LLENAR LOS CAMPOS DEL USUARIO A ACTUALIZAR SEGUN LA CEDULA QUE PASA POR PARAMETRO
    public ArrayList<Docente> BuscarCedulaDocenteAModificar(String cedula){
        Conexion miconexion=new Conexion();
         ArrayList<Docente> miListDocente = new ArrayList<>();
         
        
        try{
            
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM docente where cedula = ? ");
                ConsultaPreparada.setString(1, cedula);
                
            ResultSet res=ConsultaPreparada.executeQuery();

            if(res.next()){
               Docente Mydocente = new Docente();               
               Mydocente.setCedula(res.getString("cedula"));  
                
              Mydocente.setNombre(res.getString("nombre"));              
              Mydocente.setApellido(res.getString("apellido"));
             Mydocente.setEps(res.getString("eps"));
              Mydocente.setEstrato(res.getString("estrato"));  
              Mydocente.setGrado(res.getString("grado"));
              
             //Mydocente.setFecha_ingreso(res.getString("fechaingreso"));                
              //Mydocente.setEstado(res.getString("estado")); 
               Mydocente.setDireccion(res.getString("direccion"));              
              Mydocente.setFormacion(res.getString("formacion"));                  
              Mydocente.setPassword(res.getString("password"));                
             Mydocente.setTelefono(res.getString("telefono"));               
              miListDocente.add(Mydocente); 
            }
                    
           
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        return miListDocente;
    }
    
          // METODO QUE SE ENCARGA DE MODIFICAR EL DOCENTE QUE FUE SELECCIONADO 
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
                                +"',password='"+MiDocente.getPassword()+"', telefono='"+MiDocente.getTelefono()+"',direccion='"+MiDocente.getDireccion()+"' where cedula = '"+MiDocente.getCedula()+"'");              
            JOptionPane.showMessageDialog(null, "El docente fue actualizado exitosamente");   
            
            pst.close();
            }else{
                 JOptionPane.showMessageDialog(null, "No existe");
            }
            
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error, ya existe ", null, 0);
        }
        
    }
    
    
    
    
    //  CRUD ESTUDIANTE
    public  void BuscarEstudianteLenarJcombo(JComboBox combo){        
        try {
            Conexion miDbconn=new Conexion();
            PreparedStatement ConsultaPreparada=miDbconn.getConnection().prepareStatement("SELECT * FROM estudiante where estado = 1 ");            
            ResultSet res=ConsultaPreparada.executeQuery();
            while(res.next()){
                combo.addItem(res.getString("TI"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Docente_administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ArrayList<Estudiante> ConsultarEstudiante(){
        Conexion miconexion=new Conexion();
         ArrayList<Estudiante> miListestudiante = new ArrayList<>();
         
        
        try{
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM estudiante where estado = 1 ");
                                    
            ResultSet res=ConsultaPreparada.executeQuery();
            
            
            while(res.next()){
               Estudiante miEstudiante = new Estudiante();
               miEstudiante.setIt(res.getString("TI"));                   
              miEstudiante.setNombre(res.getString("nombre"));              
              miEstudiante.setApellido(res.getString("apell1"));
              miEstudiante.setEps(res.getString("eps"));
              miEstudiante.setStrato(""+res.getInt("estrato"));             
              miEstudiante.setGrado(""+res.getInt("grado"));
              
              miListestudiante.add(miEstudiante); 
            }
                    
           
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        return miListestudiante;
        
    }
    public void CrearEstudiante(Estudiante myEstudiante){
        Conexion miDbconn=new Conexion();          
        try {              
                 Statement pst = miDbconn.getConnection().createStatement();                                     
                 pst.executeUpdate("INSERT INTO estudiante VALUES ('"+myEstudiante.getIt()+"','"+myEstudiante.getNombre()+"','"+myEstudiante.getApellido()
                         +"','"+myEstudiante.getEps()+"','"+myEstudiante.getStrato()+"','"+myEstudiante.getGrado()+"','2019','1')");

                JOptionPane.showMessageDialog(null, "La matricula re ha registrado exitosamente");

            pst.close(); 
            miDbconn.getdesconectar();
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error ya existe ", null, 0);
        }
    }
    public void EliminarEstudiante(String TI){
                Conexion miDbconn=new Conexion();              
        try {  
             PreparedStatement ConsultaPreparada=miDbconn.getConnection().prepareStatement("SELECT * FROM estudiante where TI=? and estado like 1");
            ConsultaPreparada.setString(1, TI);
                                    
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
            
             Statement pst = miDbconn.getConnection().createStatement();                                                  
             pst.executeUpdate("update estudiante set estado=0  where TI like '"+TI+"'");              
             JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
            
            pst.close();
            }else{JOptionPane.showMessageDialog(null, "El estudiante no existe");}
            ConsultaPreparada.close();
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Falló", null, 0);
        }
    }    
    public ArrayList<Estudiante> BuscarTIEstudianteAModificar(String TI){
        Conexion miconexion=new Conexion();
         ArrayList<Estudiante> miListEstudiante = new ArrayList<>();
         
        
        try{
            
            PreparedStatement ConsultaPreparada=miconexion.getConnection().prepareStatement("SELECT * FROM estudiante where TI = ? ");
                ConsultaPreparada.setString(1, TI);
                
            ResultSet res=ConsultaPreparada.executeQuery();

            if(res.next()){
               Estudiante myEstudiante=  new Estudiante();
               myEstudiante.setIt(res.getString("TI"));  
                myEstudiante.setStrato(res.getString("estrato"));              
              myEstudiante.setNombre(res.getString("nombre"));              
              myEstudiante.setApellido(res.getString("apell1"));
             myEstudiante.setEps(res.getString("eps")); 
              myEstudiante.setEstado(res.getString("estado"));  
              myEstudiante.setGrado(res.getString("grado"));
                                       
              miListEstudiante.add(myEstudiante); 
            }
                    
           
            res.close();
            ConsultaPreparada.close();
            miconexion.getdesconectar();
            
        } catch (Exception e) {
            
        }
        return miListEstudiante;
    }
    public void ActualizarEstudiante(Estudiante myEstudiante){
            Conexion miDbconn=new Conexion();              
        try { 
            PreparedStatement ConsultaPreparada=miDbconn.getConnection().prepareStatement("SELECT * FROM estudiante where TI=?");
            ConsultaPreparada.setString(1, myEstudiante.getIt());            
            ResultSet res=ConsultaPreparada.executeQuery();
            if(res.next()){
                
             Statement pst = miDbconn.getConnection().createStatement();  
             
             pst.executeUpdate("UPDATE estudiante set nombre='"+myEstudiante.getNombre()+"',apell1='"+myEstudiante.getApellido()
                         +"',eps='"+myEstudiante.getEps()+"',estrato="+myEstudiante.getStrato()+" ,grado="+myEstudiante.getGrado()+",año=2019,estado='"+res.getString("estado")+"' where TI=111");              
            JOptionPane.showMessageDialog(null, "El estudiante fue actualizado exitosamente");   
            
            pst.close();
            
            }else{
                 JOptionPane.showMessageDialog(null, "No existe");
            }
            
            miDbconn.getdesconectar();
            
        } catch (SQLException ex) {
            //Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null,"Error, ya existe ", null, 0);
        }
    }
    
    
    
    //   ADMINISTRATIVO
    
    public void CrearAula(Nota myNota){}
    public void EliminarAula(){}
    public void ActualizarAula(){}
    public void ConsultarAula(){}
    
    
}
