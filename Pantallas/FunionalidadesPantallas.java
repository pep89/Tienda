package Pantallas;


/**
 */
import javax.swing.JPanel;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;


public abstract class FunionalidadesPantallas extends SubPantallas  implements Funcionalidades
{

    
    public abstract void contruyeVentana();

    
    //funcion para cambiar tamaño.
    public int CambiarTamaño(int altura) {

        if (altura == 361) {
            altura = 18;
        } else if (altura == 18) {
            altura = 361;
        }

        return altura;
    }
    
    public String CalcularDia() {
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance(); DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT); DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG); DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        
        String s = df.format(now); String s1 = df1.format(now); String s2 = df2.format(now); String s3 = df3.format(now); String s4 = df4.format(now);
        /*System.out.println("(Default) Hoy es:" + s); (Default) Hoy es:06/08/2012 System.out.println("(SHORT)   Hoy es:" + s1); (SHORT) Hoy es:06/08/12
         System.out.println("(MEDIUM)  Hoy es:" + s2); (MEDIUM) Hoy es:06/08/2012 System.out.println("(LONG)    Hoy es:" + s3);(LONG) Hoy es:6 de agosto de 2012
         System.out.println("(FULL)    Hoy es:" + s4); (FULL) Hoy es:lunes 6 de agosto de 2012
         */
        
        return s4;

    }
    
    /**
     * ===================================== PANELES PARA EL INTERFAZ PRINCIPAL ==========================================
     */
        //Panel de los proveedores
    protected JPanel PanelProveedores(int x, int y, int ancho, int alto, ActionListener botonProveedores )
    {
        panelProveedores = new JPanel(); panelProveedoresBTN = new JButton(); JLabel tituloProveedores = new JLabel(); JPanel panelTituloProveedores = new JPanel();
        tablaNueva = new JTable();
        panelProveedoresBTN.addActionListener(botonProveedores);

        proveedorAct.RellenarTabla(tablaNueva);
        
        panelProveedores.setLayout(null); panelProveedores.setBounds(x,y,ancho,alto); panelProveedores.setBackground(colorPaneles); panelProveedores.setVisible(true);
        
        
        panelTituloProveedores.setLayout(null); panelTituloProveedores.setBounds(0,0,panelProveedores.getWidth(), 18); panelTituloProveedores.setBackground(colorTitulos);
        
        panelProveedoresBTN.setText("V");  panelProveedoresBTN.setBounds(0,0,22,18);
        
        tituloProveedores.setText("PROVEEDORES"); tituloProveedores.setBounds(140,0,200,16);
        
        tablaNueva.setPreferredScrollableViewportSize(new Dimension(390, 500)); JScrollPane scrollPane = new JScrollPane(tablaNueva); scrollPane.setBounds(5,50,395,150);
        
        panelProveedores.add(panelTituloProveedores); panelProveedores.add(scrollPane); panelTituloProveedores.add(panelProveedoresBTN); 
        panelTituloProveedores.add(tituloProveedores);
        
        return panelProveedores;
    }
    
        //Panel de las marcas
    public JPanel PanelMarcas(int x, int y, int ancho, int alto, ActionListener botonMarcas)
    {
        panelMarcas = new JPanel(); panelMarcasBTN = new JButton();  JLabel tituloMarcas = new JLabel(); JPanel panelTituloMarcas = new JPanel();
        panelMarcasBTN.addActionListener(botonMarcas);
        panelMarcas.setLayout(null); panelMarcas.setBounds(x,y,ancho,alto); panelMarcas.setBackground(colorPaneles); panelMarcas.setVisible(true);
        
        panelTituloMarcas.setLayout(null); panelTituloMarcas.setBounds(0,0,panelMarcas.getWidth(), 18);  panelTituloMarcas.setBackground(colorTitulos);
        
        panelMarcasBTN.setText("V"); panelMarcasBTN.setBounds(0,0,22,18);
        
        tituloMarcas.setText("MARCAS"); tituloMarcas.setBounds(160,0,200,16);
        
        panelMarcas.add(panelTituloMarcas); panelTituloMarcas.add(panelMarcasBTN); panelTituloMarcas.add(tituloMarcas);
        
        return panelMarcas;
    }
    
        //Panel de los produtos
    public JPanel PanelProductos(int x, int y, int ancho, int alto, ActionListener botonProductos)
    {
        panelProductos = new JPanel(); panelProductosBTN = new JButton(); JLabel tituloProductos = new JLabel(); JPanel panelTituloProductos = new JPanel();
        panelProductosBTN.addActionListener(botonProductos);
        
        
        panelProductos.setLayout(null); panelProductos.setBounds(x,y,ancho,alto); panelProductos.setBackground(colorPaneles); panelProductos.setVisible(true);

        panelTituloProductos.setLayout(null); panelTituloProductos.setBounds(0,0,panelProductos.getWidth(), 18);  panelTituloProductos.setBackground(colorTitulos);
        
        panelProductosBTN.setText("V"); panelProductosBTN.setBounds(0,0,20,18);
        
        tituloProductos.setText("PRODUCTOS"); tituloProductos.setBounds(230,0,200,16);
        
        panelProductos.add(panelTituloProductos); panelTituloProductos.add(panelProductosBTN); panelTituloProductos.add(tituloProductos);
        
        return panelProductos;
    }
    
        //Panel de las Ventas
    public JPanel PanelVentas(int x, int y, int ancho, int alto, ActionListener botonVentas)
    {
        panelVentas = new JPanel(); panelVentasBTN = new JButton(); JLabel tituloVentas = new JLabel(); JPanel panelTituloVentas = new JPanel();
        panelVentasBTN.addActionListener(botonVentas);

        panelVentas.setLayout(null); panelVentas.setBounds(x,y,ancho,alto); panelVentas.setBackground(colorPaneles); panelVentas.setVisible(true);

        panelTituloVentas.setLayout(null);  panelTituloVentas.setBounds(0,0,panelVentas.getWidth(), 18);  panelTituloVentas.setBackground(colorTitulos);
        
        panelVentasBTN.setText("V");  panelVentasBTN.setBounds(0,0,20,18);
        
        tituloVentas.setText("VENTAS"); tituloVentas.setBounds(220,0,200,16);
        
        panelVentas.add(panelTituloVentas);  panelTituloVentas.add(panelVentasBTN); panelTituloVentas.add(tituloVentas);
        
        return panelVentas;
    }
    
        //Panel de las Ventas Diarias
    public JPanel PanelVentasDelDia(int x, int y, int ancho, int alto, ActionListener botonVentasDelDia)
    {
        panelVentasDelDia = new JPanel();
        panelVentasDelDiaBTN = new JButton();
        panelVentasDelDiaBTN.addActionListener(botonVentasDelDia);
        JLabel tituloVentasDelDiaLB = new JLabel();
        JPanel panelTituloVentasDelDia = new JPanel();
        
        //Configuracion del Panel de ventas del dia
        panelVentasDelDia.setLayout(null);panelVentasDelDia.setBounds(x,y,ancho,alto);panelVentasDelDia.setBackground(colorPaneles);panelVentasDelDia.setVisible(true);
        
        //Configuracion del panel del titulo de ventas del dia
        panelTituloVentasDelDia.setLayout(null);panelTituloVentasDelDia.setBounds(0,0,panelVentasDelDia.getWidth(), 18);panelTituloVentasDelDia.setBackground(colorTitulos);
        
        //configuracion del boton del titulo de ventas del dia
        panelVentasDelDiaBTN.setText("V"); panelVentasDelDiaBTN.setBounds(0,0,20,18);
        
        //Configuracion del titulo del panel de titulo de ventas del dia
        tituloVentasDelDiaLB.setText("VENTAS DEL: " + CalcularDia()); tituloVentasDelDiaLB.setBounds(240,0,300,16);
        
        //Añadimos todos los paneles, botones y labels al panel de ventas del dia
        panelVentasDelDia.add(panelTituloVentasDelDia); panelTituloVentasDelDia.add(panelVentasDelDiaBTN); panelTituloVentasDelDia.add(tituloVentasDelDiaLB);
        
        return panelVentasDelDia;
    }
    
}
