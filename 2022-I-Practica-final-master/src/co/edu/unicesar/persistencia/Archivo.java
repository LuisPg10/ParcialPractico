package co.edu.unicesar.persistencia;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.Publicacion;
import java.io.File;
import java.util.List;

public abstract class Archivo {
    protected File archivo;
    
    public Archivo(String ruta){
        this.archivo = new File(ruta);
    }
    
    public File getArchivo(){return this.archivo;}
    public void setArchivo(File archivo){this.archivo = archivo;}
    
    public abstract void guardarPublicacion(Publicacion publiaciones);
    public abstract List<Publicacion> leerPublicaciones() throws ExcepcionArchivo;
    public abstract Publicacion buscar(Publicacion p) throws ExcepcionArchivo;
    public abstract void eliminar(Publicacion p) throws ExcepcionArchivo;
}
