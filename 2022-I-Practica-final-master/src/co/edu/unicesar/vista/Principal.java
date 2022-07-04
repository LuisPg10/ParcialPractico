package co.edu.unicesar.vista;

import co.edu.unicesar.interfaces.paneles.PanelAgregar;
import co.edu.unicesar.interfaces.paneles.PanelConsultar;
import co.edu.unicesar.interfaces.paneles.PanelInicio;
import co.edu.unicesar.interfaces.ventanas.VentanaPrincipal;
import com.formdev.flatlaf.FlatDarkLaf;

public class Principal {
    
    public static void main(String[] args) {
        
        FlatDarkLaf.setup();
        
        VentanaPrincipal ventana;
        ventana = new VentanaPrincipal(new PanelInicio(), new PanelAgregar(), new PanelConsultar());
        
        if(!ventana.isVisible()){
            ventana.setVisible(true);   
        }
    }
}
