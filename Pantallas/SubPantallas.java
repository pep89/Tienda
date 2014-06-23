package Pantallas;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import Clases.ListaProveedores;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 */
public class SubPantallas  implements Funcionalidades
{
    JDialog dialogoProveedores;
    ListaProveedores proveedorAct = new ListaProveedores();
    JPanel panelProveedores, panelMarcas, panelProductos, panelVentas, panelVentasDelDia;
  
    JButton panelProveedoresBTN, panelMarcasBTN, panelProductosBTN, panelVentasBTN, panelVentasDelDiaBTN;

    JTable tablaNueva;
    

    
    protected JDialog DialogProveedores() {
  
        JPanel panelPrincipal = new JPanel(); JPanel panelDeDatos = new JPanel();
                //========================LABELS Y TEXTFIELDS ==========================
        JLabel idLB = new JLabel("ID"); JLabel nombreLB = new JLabel("Nombre"); JLabel paisLB = new JLabel("Pais"); JLabel localidadLB = new JLabel("Localidad");
        JLabel codigoPostalLB = new JLabel("CP"); JLabel telefonoLB = new JLabel("Tel"); JLabel mailLB = new JLabel("Mail");
        JTextField idTXT = new JTextField(); JTextField nombreTXT = new JTextField(); JTextField paisTXT = new JTextField(); JTextField localidadTXT = new JTextField();
        JTextField postalTXT = new JTextField(); JTextField telefonoTXT = new JTextField(); JTextField mailTXT = new JTextField();
        
        idLB.setBounds(10, 10, 100,20); nombreLB.setBounds(10, 40, 100,20);  paisLB.setBounds(10, 70, 100,20); localidadLB.setBounds(10, 100, 100,20); 
        codigoPostalLB.setBounds(10, 130, 100,20); telefonoLB.setBounds(10, 160, 100,20); mailLB.setBounds(10, 190, 100,20);
        
        idTXT.setBounds(120,10,100,20); nombreTXT.setBounds(120,40,100,20); paisTXT.setBounds(120,70,100,20); localidadTXT.setBounds(120,100,100,20);
        postalTXT.setBounds(120,130,100,20); telefonoTXT.setBounds(120,160,100,20); mailTXT.setBounds(120,190,100,20);
        
        //======================== DIALOG (PUPUP) DE LA PANTALLA PROVEEDORES ===================
        dialogoProveedores = new JDialog(); dialogoProveedores.setTitle("Ventana de Proveedores"); dialogoProveedores.setResizable(false); 
        dialogoProveedores.setBounds(100, 100, 900, 700);dialogoProveedores.setLayout(null);
        
        //====================== PANEL PRINCIPAL DEL DIALOG PROVEEDORES ==================================
        panelPrincipal.setBounds(1,1,899, 699); panelPrincipal.setBackground(colorFondo); panelPrincipal.setLayout(null); dialogoProveedores.add(panelPrincipal);
        panelDeDatos.setBounds( 10, 178, 400, 230);panelDeDatos.setBackground(colorPaneles); panelDeDatos.setLayout(null);panelPrincipal.add(panelDeDatos);
        
        //=========================PANEL DE DATOS (SUBPANEL DEL PANEL PRINCIPAL) ====================
        panelDeDatos.add(idLB); panelDeDatos.add(nombreLB); panelDeDatos.add(paisLB); panelDeDatos.add(localidadLB); panelDeDatos.add(telefonoLB); panelDeDatos.add(codigoPostalLB);
        panelDeDatos.add(mailLB); panelDeDatos.add(idTXT); panelDeDatos.add(nombreTXT); panelDeDatos.add(paisTXT); panelDeDatos.add(localidadTXT); panelDeDatos.add(postalTXT); 
        panelDeDatos.add(telefonoTXT); panelDeDatos.add(mailTXT);
        
        //=====================TABLA================
        tablaNueva = tablaProveedores(idTXT, nombreTXT, paisTXT, localidadTXT, postalTXT, telefonoTXT, mailTXT);
        JScrollPane scrollPane = new JScrollPane(tablaNueva); scrollPane.setBounds(10,10,600,150); panelPrincipal.add(scrollPane);

        

        
        return dialogoProveedores;
    }
    
   private JTable tablaProveedores(JTextField idTXT, JTextField nombreTXT, JTextField paisTXT, JTextField localidadTXT, JTextField postalTXT, JTextField telefonoTXT, JTextField mailTXT)
    {
        tablaNueva = new JTable(); proveedorAct.RellenarTabla(tablaNueva); tablaNueva.setPreferredScrollableViewportSize(new Dimension(600, 500));

        tablaNueva.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        ListSelectionModel rowSM = tablaNueva.getSelectionModel();
        
        rowSM.addListSelectionListener(new ListSelectionListener() 
        {
            public void valueChanged(ListSelectionEvent e) 
            {
                proveedorAct.ListarTabla(tablaNueva, idTXT, nombreTXT, paisTXT, localidadTXT, postalTXT, telefonoTXT, mailTXT);
            }
        });

        return tablaNueva;
    }
     
}
