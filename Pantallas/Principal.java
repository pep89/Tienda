package Pantallas;


/**
 */

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;


public class Principal extends FunionalidadesPantallas
{
   
    MenuBar menuPrincipal;
  
    static MenuItem ProveedoresItem;
    static MenuItem MarcasItem;
    static MenuItem ProductosItem;
    static MenuItem VentasItem;

    JTable TablaNueva;
     
    public MenuBar MenuPrincipal()
    {
        menuPrincipal = new MenuBar(); Menu Inicio = new Menu("Inicio");
        ProveedoresItem = new MenuItem("Proveedores"); ProveedoresItem.addActionListener(botonPanelProveedores);
        
        MarcasItem = new MenuItem("Marcas");
        ProductosItem = new MenuItem("Productos");
        VentasItem = new MenuItem("Ventas");
        
        Inicio.add(ProveedoresItem); Inicio.add(MarcasItem); Inicio.add(ProductosItem); Inicio.add(VentasItem); menuPrincipal.add(Inicio);
        
        return menuPrincipal;
    }

    public void contruyeVentana(){
        JFrame principal = new JFrame();
        
        principal.getContentPane().setLayout(null); principal.setMenuBar(MenuPrincipal());
        principal.getContentPane().add(PanelProveedores(30,30,400,361, botonProveedores)); principal.getContentPane().add(PanelMarcas(450,30,400,361, botonMarcas));
        principal.getContentPane().add(PanelProductos(870,30,550,361, botonProductos)); principal.getContentPane().add(PanelVentas(30, 420, 500, 361, botonVentas));
        principal.getContentPane().add(PanelVentasDelDia(570, 420, 832, 361, botonVentasDelDia));
        //Configuramos el frame
        principal.setSize(1450,850);
        principal.getContentPane().setBackground(colorFondo);
        //frame.pack();
        principal.setVisible(true);
        principal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    //============================ACTIONS PARA LOS BOTONES.====================================
    
    //Action Para los botones que minimizan los paneles del frame principal.
    ActionListener botonProveedores=new ActionListener() {
    
        public void actionPerformed(ActionEvent e) {
           
            int altura = panelProveedores.getHeight();
            int anchura = panelProveedores.getWidth();
            
            int altura2 = CambiarTamaño(altura);
           

           panelProveedores.setBounds(30,30,anchura, altura2);
        
        }
    };
    
    ActionListener botonMarcas=new ActionListener() {
    
        public void actionPerformed(ActionEvent e) {
           
            int altura = panelMarcas.getHeight();
            int anchura = panelMarcas.getWidth();
            
            int altura2 = CambiarTamaño(altura);
           

           panelMarcas.setBounds(440,30,anchura, altura2);
        
        }
    };
    
    ActionListener botonProductos=new ActionListener() {
    
        public void actionPerformed(ActionEvent e) {
           
            int altura = panelProductos.getHeight();
            int anchura = panelProductos.getWidth();
            
            int altura2 = CambiarTamaño(altura);
           

           panelProductos.setBounds(850,30,anchura, altura2);
        
        }
    };
    
    ActionListener botonVentas=new ActionListener() {
    
        public void actionPerformed(ActionEvent e) {
           
            int altura = panelVentas.getHeight();
            int anchura = panelVentas.getWidth();
            
            int altura2 = CambiarTamaño(altura);
           

           panelVentas.setBounds(30,420,anchura, altura2);
        
        }
    };

    ActionListener botonVentasDelDia=new ActionListener() {
    
        public void actionPerformed(ActionEvent e) {
           
            int altura = panelVentasDelDia.getHeight();
            int anchura = panelVentasDelDia.getWidth();
            
            int altura2 = CambiarTamaño(altura);
           

           panelVentasDelDia.setBounds(570,420,anchura, altura2);
        
        }
    };
    //==============================================================================
    
    //============================Action para los botones del MENUBAR===================
    
    ActionListener botonPanelProveedores = new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
                
                DialogProveedores().setVisible(true);
        }
        
    };
    
    //===========================================================0
    

    
    //=============CONSTRUCTOR===============================
    public Principal(){
        proveedorAct.Importar();
        contruyeVentana();
    }

    
}
