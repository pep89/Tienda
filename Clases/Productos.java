package Clases; 
/**
 * Write a description of class producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Productos extends Tipo_producto 
{
    // instance variables - replace the example below with your own
    Marcas marca = new Marcas();
    private String referencia;
    private float precioCoste;
    private float pvp;
    private int stockInicio;
    private int stockCompras;
    private int stockVentas;
    private int stock;
    private int robos;
    
    private String mensaje;
    
    public Productos()
    {

    }
    
    public Productos(int id_tipoProducto, String nombre_tipo, Marcas marca, String referencia,
    float precioCoste, float pvp, int stockInicio, int stockCompras, int stockVentas,
    int robos)throws Exception
    {
        super(id_tipoProducto, nombre_tipo);
        this.marca = marca;
        this.referencia = referencia;
        setPrecioCoste(precioCoste);
        setPvp(pvp);
        setStockInicio(stockInicio);
        setStockCompras(stockCompras);
        setStockVentas(stockVentas);
        setRobos(robos);
        this.stock = stockInicio + stockCompras - stockVentas - robos;
        
    }
    
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public Marcas getMarca()
    {
        return marca;
    }
    public void setMarca(Marcas marca)
    {
        this.marca = marca;
    }
    
    public String getReferencia()
    {
        return referencia;
    }
    public void setReferencia(String referencia)
    {
        this.referencia = referencia;
    }
    
    public float getPrecioCoste()
    {
        return precioCoste;
    }
    public void setPrecioCoste(float precioCoste)
    {
        try{
            this.precioCoste = precioCoste;
        }catch(NumberFormatException ex){
            System.out.println("Error en el formato introducido en precio de coste");
            mensaje = "Error en el formato introducido en precio de coste";
        }
    }
    
    public float getPvp()
    {
        return pvp;
    }
    public void setPvp(float pvp)
    {
        try{
            this.pvp = pvp;
        }catch(NumberFormatException ex){
            System.out.println("Error en el formato introducido en PVP");
            mensaje = "Error en el formato introducido en PVP" ;
        }
    }
    
    public int getStockInicio()
    {
        return stockInicio;
    }
    public void setStockInicio(int stockInicio)
    {
        try{
            this.stockInicio = stockInicio;
        }catch(NumberFormatException ex){
            System.out.println("Error en el formato introducido en el stocage de inicio");
            mensaje = "Error en el formato introducido en el stocage de inicio";
        }
    }
    
    public int getStockVentas()
    {
        return stockVentas;
    }
    public void setStockVentas(int stockVentas)
    {
        try{
            this.stockVentas = stockVentas;
        }catch(NumberFormatException ex){
            System.out.println("Error en el formato introducido en el estocage de ventas");
            mensaje = "Error en el formato introducido en el estocage de ventas";
        }
    }
    
    public int getStockCompras()
    {
        return stockCompras;
    }
    public void setStockCompras(int stockCompras)
    {
        try{
            this.stockCompras = stockCompras;
        }catch(NumberFormatException ex){
            System.out.println("Error en el formato introducido en el estocage de compras");
            mensaje = "Error en el formato introducido en el estocage de compras";
        }
    }
    
    public int getStock()
    {
        return stock;
    }
    public void setStock(int stock)
    {
        try{
            this.stock = stock;
        }catch(NumberFormatException ex){
            System.out.println("Error en el formato introducido en el estocage");
            mensaje = "Error en el formato introducido en el estocage";
        }
    }
    
    public int getRobos()
    {
        return robos;
    }
    public void setRobos(int robos)
    {
        try{
            this.robos = robos;
        }catch(NumberFormatException ex){
            System.out.println("Error en el formato introducido en los robos");
            mensaje = "Error en el formato introducido en los robos";
            
        }
    }
    
    
    
    
    
    
    
    public void Imprimir()
    {
        /*System.out.println("\nProducto con referencia " + referencia + " es un/a " + super.getNombre_tipo() + " pertenece a la marca " + marca.getNombre_marca()      
         + "\n Precio de coste " + precioCoste + "€\n Pvp" + pvp + "€\n ESTOCAGE \n" + "Inicio " + stockInicio + " \n Compras " + stockCompras + "\n Ventas "
         + stockVentas + "\n Robos " + robos + "\n Stock " + stock);*/
         
         mensaje = "\nProducto con referencia " + referencia + " es un/a " + super.getNombre_tipo() + " pertenece a la marca " + marca.getNombre_marca()      
         + "\n Precio de coste " + precioCoste + "€\n Pvp" + pvp + "€\n ESTOCAGE \n" + "Inicio " + stockInicio + " \n Compras " + stockCompras + "\n Ventas "
         + stockVentas + "\n Robos " + robos + "\n Stock " + stock;
         
         //System.out.println(this.getMensaje());
         
    }
    


}
