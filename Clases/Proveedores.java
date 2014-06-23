package Clases; 
/**
 * PROYECTO TIENDA 2014.
 * Clase Proveedores
 * Esta clase es la que crea los objetos "proveedores" como (seyma, westa, Grupo_Festina....)
 * Se compone por sus constructores y su getters y setters.
 * Pep Sancho Redondo.
 */
public class Proveedores 
{
    // instance variables - replace the example below with your own
    private int id_proveedor;
    private String nombre_proveedor;   
    private String pais;
    private String localidad;
    private String codigo_postal;
    private int num_contacto;
    private String correo_electronico;

    /**
     * Constructor predefinido de la class proveedores
     */
    public Proveedores()
    {

    }

    /**
     */ 
    public Proveedores(int id_proveedor, String nombre_proveedor,String pais, String localidad,
    String codigo_postal, int num_contacto, String correo_electronico)
    {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.pais = pais;
        this.localidad = localidad;
        this.codigo_postal = codigo_postal;
        this.num_contacto = num_contacto;
        this.correo_electronico = correo_electronico;
    }
    
    /*
     * Getters y setters
     */
    public int getId_proveedor()
    {
        return id_proveedor;
    }
    public void setId_proveedor(int id_proveedor)
    {
        this.id_proveedor = id_proveedor;
    }
    
    public String getNombre_proveedor()
    {
        return nombre_proveedor;
    }
    public void setNombre_proveedor(String nombre_proveedor)
    {
        this.nombre_proveedor = nombre_proveedor;
    }
    
    public String getCodigo_Postal()
    {
        return codigo_postal;
    }
    public void setCodigo_postal(String codigo_postal)
    {
        this.codigo_postal = codigo_postal;
    }
    
    public String getPais()
    {
        return pais;
    }
    public void setPais(String pais)
    {
        this.pais = pais;
    }
    
    public String getLocalidad()
    {
        return localidad;
    }
    public void setLocalidad(String localidad)
    {
        this.localidad = localidad;
    }
    
    public int getNum_Contacto()
    {
        return num_contacto;
    }
    public void setNum_Contacto(int num_contacto)
    {
        this.num_contacto = num_contacto;
    }
    
    public String getCorreo_electronico()
    {
        return correo_electronico;
    }
    public void setCorreo_electronico(String correo_electronico)
    {
        this.correo_electronico = correo_electronico;
    }
    

        
    
    
    
                            
}
