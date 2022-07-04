package co.edu.unicesar.interfaces.ventanas;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.interfaces.paneles.PanelAgregar;
import co.edu.unicesar.modelo.Publicacion;
import co.edu.unicesar.persistencia.ArchivoTexto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TipoArchivo extends JFrame implements ActionListener{
    
    private JRadioButton txt,objeto;
    private ButtonGroup grupo;
    private JPanel panelOpciones,panelBotones;
    private JButton cancelar,aceptar;
    private JLabel mensaje;
    public static ArchivoTexto archivo;
    private final List<Publicacion> publicaciones;
    
    Font fuenteOpciones = new Font("Serif",Font.PLAIN,16);
    Font fuente = new Font("Serif",Font.PLAIN,16);
    
    public TipoArchivo(JPanel lugar,List<Publicacion> publicaciones){
        
        this.publicaciones = publicaciones;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(350,250);
        this.setTitle("Guardar");
        
        iniciarComponentes();
        
        this.setLocationRelativeTo(lugar);
        this.setResizable(false);
        this.validate();
    }
    
    private void iniciarComponentes(){
        
        this.iniciarPanelOpciones();
        this.iniciarPanelBotones();
    }
    
    private void iniciarPanelOpciones(){
        
        this.panelOpciones = new JPanel(new GridBagLayout());
        
        GridBagConstraints cts = new GridBagConstraints();
        cts.gridx = 1;
        cts.anchor = GridBagConstraints.WEST;
        cts.gridwidth = 1;
        cts.insets = new Insets(10, 12, 0, 12);
        
        this.txt = new JRadioButton("Guardar como archivo normal",false);
        this.objeto = new JRadioButton("Guardar como archivo de tipo objeto",false);
        this.mensaje = new JLabel("Debe seleccionar un tipo de archivo");
        
        this.txt.setFont(fuenteOpciones);
        this.objeto.setFont(fuenteOpciones);
        this.mensaje.setFont(fuente);
        
        this.mensaje.setForeground(Color.red);
        this.mensaje.setVisible(false);
        
        this.grupo = new ButtonGroup();
        this.grupo.add(txt);
        this.grupo.add(objeto);
        
        cts.gridy = 0;
        this.panelOpciones.add(txt,cts);
        
        cts.insets = new Insets(5, 12, 0, 12);
        cts.gridy = 1;
        this.panelOpciones.add(objeto,cts);
        
        cts.insets = new Insets(45, 12, 0, 12);
        cts.gridy = 2;
        cts.anchor = GridBagConstraints.CENTER;
        this.panelOpciones.add(mensaje,cts);
        
        this.add(this.panelOpciones,BorderLayout.NORTH);
    }
    
    
    private void iniciarPanelBotones(){
        
        this.panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER,8,10));
        
        this.aceptar = new JButton("Aceptar");
        this.cancelar = new JButton("Cancelar");
        
        this.aceptar.setFont(fuente);
        this.cancelar.setFont(fuente);
        
        this.aceptar.addActionListener(this);
        this.cancelar.addActionListener(this);
        
        this.panelBotones.add(aceptar);
        this.panelBotones.add(cancelar);
        
        this.add(this.panelBotones,BorderLayout.SOUTH);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==this.cancelar){
            this.dispose();
            
        }else if(ae.getSource()==this.aceptar){
            
            if(!(this.txt.isSelected() || this.objeto.isSelected())){
                this.mensaje.setVisible(true);
                
            }else if(this.txt.isSelected()){
                this.mensaje.setVisible(false);
                
                TipoArchivo.archivo = new ArchivoTexto();
                
                for(Publicacion publicacion: this.publicaciones){
                    
                    TipoArchivo.archivo.guardarPublicacion(publicacion);
                }
                
                this.dispose();
                
            }else if(this.objeto.isSelected()){
                this.mensaje.setVisible(false);
            }
        }
    }
}
