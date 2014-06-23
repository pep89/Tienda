package Clases; 
/**
 * Write a description of class Marcas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marcas 
{
    // instance variables - replace the example below with your own
    private Proveedores proveedor;
    private String nombre_marca;
    private String descripcion;
    
    public Marcas()
    {

    }

    public Marcas(Proveedores proveedor, String nombre_marca, String descripcion)
    {
        this.proveedor = proveedor;
        this.nombre_marca = nombre_marca;
        this.descripcion = descripcion;
    }
    
    public Proveedores getProveedor()
    {
        return proveedor;
    }
    public void setProveedores(Proveedores proveedor)
    {
        this.proveedor = proveedor;
    }
    
    public String getNombre_marca()
    {
        return nombre_marca;
    }
    public void setNombre_marca(String nombre_marca)
    {
        this.nombre_marca = nombre_marca;
    }
    
    public String getDescripcion()
    {
        return descripcion;
    }
    public void setDescripcion(String descripcion)
    {
        this.nombre_marca = descripcion;
    }
    
    public void Imprimir()
    {
        System.out.println("La marca " + nombre_marca + " - " + descripcion + " pertenece al proveedor " +
        proveedor.getNombre_proveedor());
    }
}
