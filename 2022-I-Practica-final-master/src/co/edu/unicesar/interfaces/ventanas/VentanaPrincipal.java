package co.edu.unicesar.interfaces.ventanas;

import co.edu.unicesar.interfaces.paneles.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Ventana en la cual se conectan el panel agregar y consultar
public class VentanaPrincipal extends JFrame {
    
    private JPanel panelPrincipal,panelOpciones;
    private JLabel agregar,consultar,inicio;
    
    private final String opciones[] = {"Inicio","Añadir","Consultar"};
    private final JLabel listaOpciones[] = {inicio,agregar,consultar};
        
    private final PanelAgregar panelAgregar;
    private final PanelConsultar panelConsultar;
    private final PanelInicio panelInicio;
    
    Font fuente = new Font("Serif",Font.PLAIN,20);
    Font fuenteSecundaria = new Font("Serif",Font.PLAIN,25);
    
    public VentanaPrincipal(PanelInicio panelInicio, PanelAgregar panelAgregar, PanelConsultar panelConsultar){
        
        this.setTitle("Gestion de libros 1.0");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(875,600);
        
        this.panelInicio = panelInicio;
        this.panelAgregar = panelAgregar;
        this.panelConsultar = panelConsultar;
        
        this.iniciarComponentes();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
    }
    
    //Eventos de los objetos como botones y paneles
    MouseAdapter eventoOpciones = new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent evt){
           cambiarPanel(evt);
       }
       @Override
       public void mouseEntered(MouseEvent evt){
           efectoEntrada(evt);
       }
       @Override
       public void mouseExited(MouseEvent evt){
           efectoEntrada(evt);
       }
    };
    
    MouseAdapter eventoPanelOpciones = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent evt){
            efectoEntrada(evt);
        }
        @Override
        public void mouseExited(MouseEvent evt){
            efectoEntrada(evt);
        }
    };
    
    MouseAdapter eventoCancelar = new MouseAdapter() {
        
        @Override
        public void mouseClicked(MouseEvent evt){
            cancelarAccion();
        }
    };
    
    //Inicio de los componentes y paneles para el manejo de la aplicación
    private void iniciarComponentes(){
        
        this.getContentPane().setLayout(new BorderLayout());
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setLayout(new BorderLayout());
        
        this.iniciarOpciones();
        
        this.panelPrincipal.add(this.panelInicio,BorderLayout.EAST);
        this.add(panelPrincipal);
    }
    
    private void iniciarOpciones(){
        
        GridBagConstraints propiedades = new GridBagConstraints();
        
        this.panelOpciones = new JPanel();
        this.panelOpciones.setBackground(Color.black);
        this.panelOpciones.setLayout(new GridBagLayout());
        
        JLabel etiqueta = new JLabel();
        etiqueta.setIcon(new ImageIcon(getClass().getResource("/co/edu/unicesar/interfaces/imagenes/logoOpciones.png")));
        
        propiedades.gridx = 0;
        propiedades.gridy = 0;
        propiedades.gridheight = 1;
        propiedades.gridwidth = 1;
        propiedades.insets = new Insets(-190,50,20,50);
        propiedades.ipady = 10;
        
        this.panelOpciones.add(etiqueta,propiedades);
        
        for (int i = 0;i<opciones.length;i++) {
            
            this.listaOpciones[i] = new JLabel(opciones[i]);
            this.listaOpciones[i].setFont(this.fuente);
            this.listaOpciones[i].setForeground(Color.white);
            this.listaOpciones[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            propiedades.gridy = i+1;
            propiedades.insets = new Insets(0, 0, 0, 0);
            
            this.listaOpciones[i].addMouseListener(eventoOpciones);
            this.panelOpciones.add(listaOpciones[i],propiedades);
        }
        
        this.panelOpciones.addMouseListener(eventoPanelOpciones);
        PanelAgregar.txtCancelar.addMouseListener(eventoCancelar);
        
        this.panelPrincipal.add(this.panelOpciones,BorderLayout.WEST);
    }
    
    //Metodo que permite cambiar de panel segun la opcion dada
    private void cambiarPanel(MouseEvent evt){
        
        if(evt.getSource()==listaOpciones[0]){
            
            if(this.panelAgregar.isVisible()){
                this.panelAgregar.setVisible(false);
                
            }else if(this.panelConsultar.isVisible()){
                this.panelConsultar.setVisible(false);   
            }
                
            this.panelInicio.setVisible(true);
            
            this.panelPrincipal.add(this.panelInicio);  
            this.validate();
            
        }else if(evt.getSource()==listaOpciones[1]){
            
            if(this.panelInicio.isVisible()){
                this.panelInicio.setVisible(false);
                
            }else if(this.panelConsultar.isVisible()){
                this.panelConsultar.setVisible(false);   
            }
                
            this.panelAgregar.setVisible(true);
            
            this.panelPrincipal.add(this.panelAgregar);  
            this.validate();
            
        }else if(evt.getSource()==listaOpciones[2]){
            
            if(this.panelInicio.isVisible()){
                this.panelInicio.setVisible(false);
                
            }else if(this.panelAgregar.isVisible()){
                this.panelAgregar.setVisible(false);   
            }
                
            this.panelConsultar.setVisible(true);
            
            this.panelPrincipal.add(this.panelConsultar);  
            this.validate();
            
        }
    }
    
    //Le da un ejecto a los JLabels del panel Opciones
    private void efectoEntrada(MouseEvent evt){
        if(evt.getSource()==listaOpciones[0]){
            listaOpciones[0].setFont(fuenteSecundaria);
            
        }else if(evt.getSource()!=listaOpciones[0]){
            listaOpciones[0].setFont(fuente);
        }
        
        if(evt.getSource()==listaOpciones[1]){
            listaOpciones[1].setFont(fuenteSecundaria);
            
        }else if(evt.getSource()!=listaOpciones[1]){
            listaOpciones[1].setFont(fuente);
        }
        
        if(evt.getSource()==listaOpciones[2]){
            listaOpciones[2].setFont(fuenteSecundaria);
            
        }else if(evt.getSource()!=listaOpciones[2]){
            listaOpciones[2].setFont(fuente);
        }
    }
    
    private void cancelarAccion(){
        panelAgregar.setVisible(false);
        PanelAgregar.limpiar();
        panelInicio.setVisible(true);
        
        this.panelPrincipal.add(this.panelInicio);
        this.validate();
    }
}
