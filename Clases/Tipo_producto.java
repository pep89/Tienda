package Clases; 
/**
 * PROYECTO TIENDA 2014.
 * Clase Tipo_Producto
 * Esta clase es la que crea los objetos de tipos de productos como (bolsos, relojes, collares....)
 * Se compone por sus constructores y su getters y setters.
 * Pep Sancho Redondo.
 */
public class Tipo_producto
{
    // Instancias de las variables de la clase
    private int id_tipoproducto;
    private String nombre_tipo;

    /**
     * Constructor predefinido de la clase
     */
    public Tipo_producto()
    {

    }
    
    /*
     *Contructor con parametros 
     */
    public Tipo_producto(int id_tipoproducto, String nombre_tipo)
    {
        this.id_tipoproducto = id_tipoproducto;
        this.nombre_tipo = nombre_tipo;
    }
    
    /*
     * Getters y setters
     */
    public int getId_tipoproducto()
    {
        return id_tipoproducto;
    }
    public void setId_tipoproducto(int id_tipoproducto)
    {
        this.id_tipoproducto = id_tipoproducto;
    }
    
    public String getNombre_tipo()
    {
        return nombre_tipo;
    }
    public void setNombre_tipo(String nombre_tipo)
    {
        this.nombre_tipo = nombre_tipo;
    }

}
