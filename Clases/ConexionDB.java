package Clases; 
/**
 * Write a description of class Connexion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;

public class ConexionDB {
     
    public static Connection GetConnection()
    {
        Connection conexion=null;
     
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/databaseName=tienda;user=root;password=toor;";
            conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root", "toor");
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    }
    
    public void ProducirSentencia(String sql)
    {
 
            try
            {
                    Connection con = this.GetConnection();
                    Statement s = con.createStatement();
                    
                    //s.execute(sql);
                    ResultSet rs = s.executeQuery(sql);
                    
                    while (rs.next())
                    {
                        System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getDate(3));
                    }
                    s.close();
                    con.close();
 
            }
            catch(Exception e)
            {
                   System.out.println(e.getMessage());
            }
    }
    
    public ResultSet DevolverResult(String sql, Connection con)
    {
            try
            {
                    Statement s = con.createStatement();
 
                    ResultSet rs = s.executeQuery(sql);

                    return rs;
                    
 
            }
            catch(Exception e)
            {
                   System.out.println(e.getMessage());
            }
            return null;
    }
    
    public CachedRowSet DevolverSentencia(String sql)
    {
            try
            {
                    Connection con = this.GetConnection();
                    Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY);
 
                    ResultSet rs= s.executeQuery(sql);
 
                    CachedRowSet crs = new CachedRowSetImpl();
                    crs.populate(rs);
 
                    rs.close();
                    s.close();
                    con.close();
 
                    return crs;
 
            }
            catch(Exception e)
            {
                   System.out.println(e.getMessage());
            }
 
            return null;
    }
}
