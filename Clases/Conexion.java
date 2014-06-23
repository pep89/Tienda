package Clases;  
/**
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion
{
    Connection conn = null;
    final String url = "jdbc:mysql://localhost:3306/";
    final String dbNombre = "tienda";
    final String driver = "com.mysql.jdbc.Driver";
    final String nombreUsuario = "root";
    final String contraseña = "toor";
    
    Conexion()
    {
        try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbNombre, nombreUsuario, contraseña);
            
            if(!conn.isClosed())
            {
                System.out.println("Conexion cerrada");
            }
                
        }catch (Exception e){
            
            System.err.println("Excepcion: " + e.getMessage());
        
        }finally{
            
            try{
                
                if(conn != null)
                {
                    conn.close();
                }
            }catch(SQLException e){
                
            }
        }
    }   

}
