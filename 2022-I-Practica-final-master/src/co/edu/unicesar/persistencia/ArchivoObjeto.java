package co.edu.unicesar.persistencia;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.Publicacion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ArchivoObjeto extends Archivo{
    
    FileInputStream modoLectura;
    FileOutputStream modoEscritura;
    
    public ArchivoObjeto(){
        this("Registro.bin");
    }
    public ArchivoObjeto(String ruta){
        super(ruta);
    }
    
    @Override
    public void guardarPublicacion(Publicacion publiaciones) {
        try {
            this.modoEscritura = new FileOutputStream(this.archivo);
            ObjectOutputStream oos = new ObjectOutputStream(this.modoEscritura);
            oos.writeObject(publiaciones);
            oos.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar, el archivo ya no existe","Error",JOptionPane.WARNING_MESSAGE);
        } catch (SecurityException e) {
            JOptionPane.showMessageDialog(null, "Acceso al archivo no permitido","Error",JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El manejador del archivo es null","Error",JOptionPane.WARNING_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al tratar de escribir en el archivo","Error",JOptionPane.WARNING_MESSAGE);
        }

    }

    @Override
    public List<Publicacion> leerPublicaciones() throws ExcepcionArchivo {
        List<Publicacion> lista;
        
        try {
            
            this.modoLectura = new FileInputStream(this.archivo);
            ObjectInputStream ois = new ObjectInputStream(this.modoLectura);
            lista = new ArrayList<>();
            
            while(ois.readObject()!=null){
                lista.add((Publicacion)ois.readObject());
            }
            return lista;

        } catch (FileNotFoundException e) {
            throw new ExcepcionArchivo("Erro al abrir archivo de objetos en modo lectura , no existe");
        } catch (SecurityException e) {
            throw new ExcepcionArchivo("No tiene acceso para el archivo en modo lectura");
        } catch (StreamCorruptedException e) {
            throw new ExcepcionArchivo("Error con el flujo de datos de cabecera del objeto");
        } catch (NullPointerException e) {
            throw new ExcepcionArchivo("EL manejador de archivo en lectura en Null");
        } catch (IOException e) {
            throw new ExcepcionArchivo("Error al leer en el archivo");
            
        } catch (ClassNotFoundException e) {
            throw new ExcepcionArchivo("No se haya la clase perteneiente al objeto");
        }
    }

    @Override
    public Publicacion buscar(Publicacion p) throws ExcepcionArchivo {
        List<Publicacion> lista = this.leerPublicaciones();
        for (Publicacion b : lista) {
            if (p.getIsbn().equals(b.getIsbn())) {
                return b;
            }
        }
        return null;
    }
}
