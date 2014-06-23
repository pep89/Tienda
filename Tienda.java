
/**
 */
import Pantallas.Principal;
import Clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Tienda
{

    
    public static void main(String[] args) {
        
        Connection miConexion;
        miConexion=ConexionDB.GetConnection();
        ListaProveedores listaP = new ListaProveedores();
        
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        Principal principal = new Principal();
        
        
        listaP.Imprimir();
        
       /* String producto="";
        ListaProveedores listaP = new ListaProveedores();
        
        
        
        
        Proveedores p = new Proveedores(1, "Seyma", "España", "Petra", "07490", 971545303, "seyma@gmail.com");
        Proveedores p1 = new Proveedores(2, "Westa", "Suiza", "Desconocio", "-------", 93558882, 
        "westa@gmail.com");
        
        listaP.Introducir(p);
        listaP.Introducir(p1);
        
        //listaP.Imprimir();
   
        Marcas m = new Marcas(p, "Abaccino", " Marca de bolsos");
        
        //m.Imprimir();
        
        Tipo_producto t = new Tipo_producto(1, "Bolsos");
        
        /**
         * Productos: it_tipoProducto, nombre_tipo, marca, String referencia, float precio coste,
         * float pvp, int stockInicio, int stockCompras, int stockVentas, int stock, int robos
         *
        
       try
        {  
            Productos pro = new Productos(t.getId_tipoproducto(), t.getNombre_tipo(), m, "0001-20",
            15, 30, 2, 0, 0, 0);
            pro.Imprimir();
            producto = pro.getMensaje();
        }
        catch(Exception ex)
        {
            System.out.println(ex + " ");
        }*/

        
        
    }
}
       
