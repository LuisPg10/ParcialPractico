package co.edu.unicesar.utilidades;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Selector extends JFileChooser{
    
    private final File nombreArchivo = new File("Registro");
    private final FileNameExtensionFilter extensiones;
    private String ruta;
    
    public Selector(String nombre,String extensiones){
        
        this.extensiones = new FileNameExtensionFilter(nombre,extensiones);
        this.setSelectedFile(nombreArchivo);
        this.setFileFilter(this.extensiones);
    }
}
