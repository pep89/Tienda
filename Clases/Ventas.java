package Clases; 
/**
 */
public class Ventas
{
    private int numVenta;
   private Productos producto;
   private char tipoVenta;
   private float precioVenta;
   private float descuento;
   private String fechaVenta;
   private String horaVenta;
   
   Ventas(int numVenta, Productos producto, char tipoVenta, float precioVenta, float descuento,
            String fechaVenta, String horaVenta)
            {
                this.numVenta = numVenta;
                this.producto = producto;
                this.tipoVenta = tipoVenta;
                this.precioVenta = precioVenta;
                this.descuento = descuento;
                this.fechaVenta = fechaVenta;
                this.horaVenta = horaVenta;
            }
    
    public int getNumVenta()
    {
        return numVenta;
    }
    public void setNumVent(int numVenta)
    {
        this.numVenta = numVenta;
    }
    
    public char getTipoVenta()
    {
        return tipoVenta;
    }
    public void setTipoVenta(char tipoVenta)
    {
        this.tipoVenta = tipoVenta;
    }
    
    public float getPrecioVenta()
    {
        return precioVenta;
    }
    public void setPrecioVenta(float precioVenta)
    {
        this.precioVenta = precioVenta;
    }
    
    public float getDescuento()
    {
        return descuento;
    }
    public void setDescuento(float descuento)
    {
        this.descuento = descuento;
    }
    
    public String getFechaVenta()
    {
        return fechaVenta;
    }
    public void setFechaVenta(String fechaVenta)
    {
        this.fechaVenta = fechaVenta;
    }
    
    public String getHoraVenta()
    {
        return horaVenta;
    }
    public void setHoraVenta(String horaVenta)
    {
        this.horaVenta = horaVenta;
    }
}
