package Clases;  
/**

 */

import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JTextField;

public class ListaProveedores implements Funcionalidades
{
   
   ConexionDB conexion = new ConexionDB();
   

    
   private ArrayList<Proveedores> listadoProveedores = new ArrayList<Proveedores>();
   //private Conexion conexion = new Conexion();
   DefaultTableModel dtmProveedores;
   
   public ListaProveedores()
   {
       
   }
   
    public ListaProveedores(ArrayList<Proveedores> listadoProveedores)
    {
        this.listadoProveedores = listadoProveedores;
    }
    
    public ArrayList<Proveedores> getListadoProveedores()
    {
        return listadoProveedores;
    }
    
    public void setListadoProveedores(ArrayList<Proveedores>listadoProveedores)
    {
        this.listadoProveedores = listadoProveedores;
    }
    
    public void Introducir(Proveedores P)
    {
        this.listadoProveedores.add(P);
    }
    
    public void Imprimir()
    {
        for(Proveedores listado : listadoProveedores)
        {
            System.out.println("El proveedor con id: " + listado.getId_proveedor() + " y nombre " + 
            listado.getNombre_proveedor() + " se localiza en " + listado.getPais() + " - " + 
            "\n CONTACTO \n" + "-localidad: " +
            listado.getLocalidad() + "\n-cp: " + listado.getCodigo_Postal() + "\n-tel: "+ 
            listado.getNum_Contacto() + " \n-correo_electronico: " + listado.getCorreo_electronico()
            + "\n");
        }
    }
    
    //---------------CONSTRUIR TABLA DE PROVEEDORES----------------------
    
    public String[] getColumnas()
    {
          String columna[]=new String[]{"ID","Nombre", "Pais",
              "Localidad","CP", "Tel","E-Mail"};
              
          return columna;
    }
    
    public void setFilas()
    {
        int identificador=0;
        String identi="";
        String nombre="";
        String pais="";
        String localidad="";
        String postal="";
        int telefono=0;
        String tel="";
        String email="";
        
        String sentencia = "Select * FROM Proveedores";
        Connection con = conexion.GetConnection();
        ResultSet rs = conexion.DevolverResult(sentencia,con); 
        List<String> lista = new ArrayList<String>();
        try{
            while (rs.next())
            {
                identificador = rs.getInt (1);
                identi = Integer.toString(identificador);
                nombre = rs.getString (2);
                pais = rs.getString (3);
                localidad = rs.getString(4);
                postal = rs.getString(5);
                telefono = rs.getInt (6);
                tel = Integer.toString(telefono);
                email = rs.getString(7);
                
                lista.add(identi);
                lista.add(nombre);
                lista.add(pais);
                lista.add(localidad);
                lista.add(postal);
                lista.add(tel);
                lista.add(email);
                
                Object[] datos = new Object[7];
    
                for (int x = 0; x < 7; x++) {
                       datos[x] = lista.get(x);
                }
                
                dtmProveedores.addRow(datos);
                
                    
                lista.removeAll(lista);
            }
            rs.close();
            con.close();
        }catch(Exception e)
        {
               System.out.println(e.getMessage());
        }
        
     }
     
    public void RellenarTabla(JTable nuevaTabla)
    {
        dtmProveedores = new DefaultTableModel(null,getColumnas());
        setFilas();
        nuevaTabla.setModel(dtmProveedores);
        
        int[] anchos = {20, 100, 100, 100, 75, 100, 200};

        for(int i = 0; i < nuevaTabla.getColumnCount(); i++) {
        
        
        nuevaTabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        
        }
    }
   //--------------------------------------------------------------------
   
   public void ListarTabla(JTable tablaNueva, JTextField idTXT, JTextField nombreTXT, JTextField paisTXT, JTextField localidadTXT, JTextField postalTXT, JTextField telefonoTXT, 
   JTextField mailTX)
   {
       for (int i=0; i < tablaNueva.getRowCount(); i++)
        {
            if(i == tablaNueva.getSelectedRow())
            {
                idTXT.setText(tablaNueva.getValueAt(i, 3).toString());
                break;
            }
        }
    }
   public void Importar()
   {
       int identificador=0;
        String identi="";
        String nombre="";
        String pais="";
        String localidad="";
        String postal="";
        int telefono=0;
        String tel="";
        String email="";
        Proveedores aux;
        String sentencia = "Select * FROM Proveedores";
        Connection con = conexion.GetConnection();
        ResultSet rs = conexion.DevolverResult(sentencia,con); 

        try{
            while (rs.next())
            {
                identificador = rs.getInt (1);
                nombre = rs.getString (2);
                pais = rs.getString (3);
                localidad = rs.getString(4);
                postal = rs.getString(5);
                telefono = rs.getInt (6);
                email = rs.getString(7);
               
                aux = new Proveedores(); //Se crea un objeto de tipo Proveedores
                aux.setId_proveedor(identificador);
                aux.setNombre_proveedor(nombre);
                aux.setPais(pais);
                aux.setLocalidad(localidad);
                aux.setCodigo_postal(postal);
                aux.setNum_Contacto(telefono);
                aux.setCorreo_electronico(email);
                
                this.Introducir(aux);
                
            }
            rs.close();
            con.close();
        }catch(Exception e)
        {
               System.out.println(e.getMessage());
        }
        
     }
       
}
