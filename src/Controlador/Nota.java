
package Controlador;

import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Nota {
    Estudiante estudiante;
    double nota;
    Materia materia;
    String actividad;

    public Nota(Estudiante estudiante, double nota, Materia materia, String actividad) {
        this.estudiante = estudiante;
        this.nota = nota;
        this.materia = materia;
        this.actividad = actividad;
    }

    public Nota() {
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    
   public void llenarprimero (JComboBox jcbprimero, int grado) {
        try {
            Conexion conex= new Conexion();
            PreparedStatement consulta= conex.getConnection().prepareStatement("select * from  asignaciona_cademicagrado where id="+grado);
            ResultSet res= consulta.executeQuery();
           
            while( res.next())
            {
                
                jcbprimero.addItem(res.getString(2));
               jcbprimero.addItem(res.getString(3));
                jcbprimero.addItem(res.getString(4));
                jcbprimero.addItem(res.getString(5));
                jcbprimero.addItem(res.getString(6));
                jcbprimero.addItem(res.getString(7));
                jcbprimero.addItem(res.getString(8));
                jcbprimero.addItem(res.getString(9));
                jcbprimero.addItem(res.getString(10));
                jcbprimero.addItem(res.getString(11));
            }
            res.close();
            consulta.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
             
   }
            
   
   public ArrayList<Materia> llenartablamateria (Object materia) {
       
       System.out.println(""+materia);
       ArrayList<Materia>mimateria= new ArrayList<>();
        try {
            Conexion conex= new Conexion();
            PreparedStatement consulta= conex.getConnection().prepareStatement("select estudiante.TI, concat_ws(\" \",estudiante.apell1,estudiante.nombre),"+materia+".nota1, "+materia+".nota2, "+materia+".nota3, "+materia+".nota4, "+materia+".nota5, "+materia+".nota6, "+materia+".nota7,  "+materia+".nota8, "+materia+".nota9,  "+materia+".nota10 from estudiante,"+materia+" where "+materia+".estudiante=estudiante.TI and estudiante.grado=1 and estudiante.estado=1 order by estudiante.apell1 ASC");
            ResultSet res= consulta.executeQuery();
           
            while( res.next())
            {
                Materia asignatura= new Materia();
                asignatura.setTI(res.getString(1));
                asignatura.setNombre(res.getString(2));
                asignatura.setNota1(res.getString(3));
                asignatura.setNota2(res.getString(4));
                asignatura.setNota3(res.getString(5));
                asignatura.setNota4(res.getString(6));
                asignatura.setNota5(res.getString(7));
                asignatura.setNota6(res.getString(8));
                asignatura.setNota7(res.getString(9));
                asignatura.setNota8(res.getString(10));
                 asignatura.setNota9(res.getString(11));
                  asignatura.setNota10(res.getString(12));
                mimateria.add(asignatura);
            }
            res.close();
            consulta.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
             return mimateria;
   }
   public ArrayList<Materia> llenartablamateria2 (Object materia) {
       ArrayList<Materia>mimateria= new ArrayList<>();
        try {
            Conexion conex= new Conexion();
            PreparedStatement consulta= conex.getConnection().prepareStatement("select estudiante.TI, concat_ws(\" \",estudiante.apell1,estudiante.nombre),"+materia+".nota1, "+materia+".nota2, "+materia+".nota3, "+materia+".nota4, "+materia+".nota5, "+materia+".nota6, "+materia+".nota7,  "+materia+".nota8, "+materia+".nota9,  "+materia+".nota10 from estudiante,"+materia+" where "+materia+".estudiante=estudiante.TI and estudiante.grado=2 and estudiante.estado=1 order by estudiante.apell1 ASC;");
            ResultSet res= consulta.executeQuery();
           
            while( res.next())
            {
                Materia asignatura= new Materia();
                asignatura.setTI(res.getString(1));
                asignatura.setNombre(res.getString(2));
                asignatura.setNota1(res.getString(3));
                asignatura.setNota2(res.getString(4));
                asignatura.setNota3(res.getString(5));
                asignatura.setNota4(res.getString(6));
                asignatura.setNota5(res.getString(7));
                asignatura.setNota6(res.getString(8));
                asignatura.setNota7(res.getString(9));
                asignatura.setNota8(res.getString(10));
                 asignatura.setNota9(res.getString(11));
                  asignatura.setNota10(res.getString(12));
                mimateria.add(asignatura);
            }
            res.close();
            consulta.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
             return mimateria;
   }
   public ArrayList<Materia> llenartablamateria3 (Object materia) {
       ArrayList<Materia>mimateria= new ArrayList<>();
        try {
            Conexion conex= new Conexion();
            PreparedStatement consulta= conex.getConnection().prepareStatement("select estudiante.TI, concat_ws(\" \",estudiante.apell1,estudiante.nombre),"+materia+".nota1, "+materia+".nota2, "+materia+".nota3, "+materia+".nota4, "+materia+".nota5, "+materia+".nota6, "+materia+".nota7,  "+materia+".nota8, "+materia+".nota9,  "+materia+".nota10 from estudiante,"+materia+" where "+materia+".estudiante=estudiante.TI and estudiante.grado=3 and estudiante.estado=1 order by estudiante.apell1 ASC;");
            ResultSet res= consulta.executeQuery();
           
            while( res.next())
            {
                Materia asignatura= new Materia();
                asignatura.setTI(res.getString(1));
                asignatura.setNombre(res.getString(2));
                asignatura.setNota1(res.getString(3));
                asignatura.setNota2(res.getString(4));
                asignatura.setNota3(res.getString(5));
                asignatura.setNota4(res.getString(6));
                asignatura.setNota5(res.getString(7));
                asignatura.setNota6(res.getString(8));
                asignatura.setNota7(res.getString(9));
                asignatura.setNota8(res.getString(10));
                 asignatura.setNota9(res.getString(11));
                  asignatura.setNota10(res.getString(12));
                mimateria.add(asignatura);
            }
            res.close();
            consulta.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
             return mimateria;
   }
   public ArrayList<Materia> llenartablamateria4 (Object materia) {
       ArrayList<Materia>mimateria= new ArrayList<>();
        try {
            Conexion conex= new Conexion();
            PreparedStatement consulta= conex.getConnection().prepareStatement("select estudiante.TI, concat_ws(\" \",estudiante.apell1,estudiante.nombre),"+materia+".nota1, "+materia+".nota2, "+materia+".nota3, "+materia+".nota4, "+materia+".nota5, "+materia+".nota6, "+materia+".nota7,  "+materia+".nota8, "+materia+".nota9,  "+materia+".nota10 from estudiante,"+materia+" where "+materia+".estudiante=estudiante.TI and estudiante.grado=4 and estudiante.estado=1 order by estudiante.apell1 ASC;");
            ResultSet res= consulta.executeQuery();
           
            while( res.next())
            {
                Materia asignatura= new Materia();
                asignatura.setTI(res.getString(1));
                asignatura.setNombre(res.getString(2));
                asignatura.setNota1(res.getString(3));
                asignatura.setNota2(res.getString(4));
                asignatura.setNota3(res.getString(5));
                asignatura.setNota4(res.getString(6));
                asignatura.setNota5(res.getString(7));
                asignatura.setNota6(res.getString(8));
                asignatura.setNota7(res.getString(9));
                asignatura.setNota8(res.getString(10));
                 asignatura.setNota9(res.getString(11));
                  asignatura.setNota10(res.getString(12));
                mimateria.add(asignatura);
            }
            res.close();
            consulta.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
             return mimateria;
   }
   public ArrayList<Materia> llenartablamateria5 (Object materia) {
       ArrayList<Materia>mimateria= new ArrayList<>();
        try {
            Conexion conex= new Conexion();
            PreparedStatement consulta= conex.getConnection().prepareStatement("select estudiante.TI, concat_ws(\" \",estudiante.apell1,estudiante.nombre),"+materia+".nota1, "+materia+".nota2, "+materia+".nota3, "+materia+".nota4, "+materia+".nota5, "+materia+".nota6, "+materia+".nota7,  "+materia+".nota8, "+materia+".nota9,  "+materia+".nota10 from estudiante,"+materia+" where "+materia+".estudiante=estudiante.TI and estudiante.grado=5 and estudiante.estado=1 order by estudiante.apell1 ASC;");
            ResultSet res= consulta.executeQuery();
           
            while( res.next())
            {
                Materia asignatura= new Materia();
                asignatura.setTI(res.getString(1));
                asignatura.setNombre(res.getString(2));
                asignatura.setNota1(res.getString(3));
                asignatura.setNota2(res.getString(4));
                asignatura.setNota3(res.getString(5));
                asignatura.setNota4(res.getString(6));
                asignatura.setNota5(res.getString(7));
                asignatura.setNota6(res.getString(8));
                asignatura.setNota7(res.getString(9));
                asignatura.setNota8(res.getString(10));
                 asignatura.setNota9(res.getString(11));
                  asignatura.setNota10(res.getString(12));
                mimateria.add(asignatura);
            }
            res.close();
            consulta.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
             return mimateria;
   }
    
    public ArrayList<Estudiante>listaNombre () {
       ArrayList<Estudiante>mimateria= new ArrayList<>();
        try {
            Conexion conex= new Conexion();
            PreparedStatement consulta= conex.getConnection().prepareStatement("  select concat_ws(\" \",apell1,nombre)as nombre from estudiante where grado=1");
            ResultSet res= consulta.executeQuery();
           
            while( res.next())
            {
              
                Estudiante nombre= new Estudiante();
                nombre.setNombre(res.getString(1));
                mimateria.add(nombre);
            }
            res.close();
            consulta.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
             return mimateria;
   }
//    public void registrarPersona(String ti, int nota, String actividad) 
// {
//  Conexion conex= new Conexion();
//  try {
//   Statement estatuto = conex.getConnection().createStatement();
//   estatuto.executeUpdate("INSERT INTO español VALUES ('"+persona.getIdPersona()+"', '"
//     +persona.getNombrePersona()+"', '"+persona.getEdadPersona()+"', '"
//     +persona.getProfesionPersona()+"', '"+persona.getTelefonoPersona()+"')");
//   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
//   estatuto.close();
//   conex.desconectar();
//    
//  } catch (SQLException e) {
//            System.out.println(e.getMessage());
//   JOptionPane.showMessageDialog(null, "No se Registro la persona");
//  }
// }  
    
    
    
    public void insertarnota(Object nota, String TI, Object actividad, Object materia){
        try {
            Conexion conex= new Conexion();
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("update "+materia+" set "+actividad+" = "+nota+" where estudiante= "+TI);
            JOptionPane.showMessageDialog(null, "Se ha registrado la nta existosamente Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
//   conex.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void actualizarnota(Object nota, String TI, Object actividad, Object materia){
        try {
            Conexion conex= new Conexion();
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("update "+materia+" set "+actividad+" = "+nota+" where estudiante= "+TI);
            JOptionPane.showMessageDialog(null, "Se ha registrado la nta existosamente Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
//   conex.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarnota (Object actividad, String TI, Object materia){
         try {
            Conexion conex= new Conexion();
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("update "+materia+" set "+actividad+"=null where estudiante= "+TI);
            JOptionPane.showMessageDialog(null, "Se ha registrado la  Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
            estatuto.close();
//   conex.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
