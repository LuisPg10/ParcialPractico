package co.edu.unicesar.persistencia;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.Publicacion;
import java.io.File;
import java.io.IOException;
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
    //public abstract Publicacion eliminar(Publicacion p) throws ExcepcionArchivo;
    
    void renombrarArchivo(File tmp) throws IOException{
        if(!tmp.exists())
            throw new IOException("El archivo temporal no existe");
            
        if(!this.archivo.delete()){
            tmp.delete();
            throw new IOException("No es posible eliminar el archivo original");
        }
        
        if(!tmp.renameTo(this.archivo)){
            throw new IOException("No es posible renombrar el archivo temporal");
        }    
    }
}
