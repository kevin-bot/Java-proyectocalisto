package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static String bd = "calistobd";
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/"+bd;
   Connection connection = null;
   
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = (Connection) DriverManager.getConnection(url,login,password);
 
         if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
         }
      }
      catch(SQLException | ClassNotFoundException e){
         System.out.println(e);
      }
   }
    public Connection getConnection(){
      return connection;
   }
 
   public void getdesconectar(){
      connection = null;
   }
   
   
}
