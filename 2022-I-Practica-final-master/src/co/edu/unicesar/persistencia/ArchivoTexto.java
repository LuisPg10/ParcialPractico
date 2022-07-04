package co.edu.unicesar.persistencia;

import co.edu.unicesar.interfaces.excepciones.ExcepcionArchivo;
import co.edu.unicesar.modelo.AudioLibro;
import co.edu.unicesar.modelo.Libro;
import co.edu.unicesar.modelo.Publicacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoTexto{
    
    private File archivo;
    private FileWriter modoEscritura;
    private Scanner modoLectura;
    
    public ArchivoTexto(){
        this("registro.txt");
    }
    public ArchivoTexto(String ruta){
        this.archivo = new File(ruta);
    }
    
    public File getArchivo() {return archivo;}
    public void setArchivo(File archivo) {this.archivo = archivo;}

    public FileWriter getModoEscritura() {return modoEscritura;}
    public void setModoEscritura(FileWriter modoEscritura) {this.modoEscritura = modoEscritura;}

    public void guardarPublicacion(Publicacion p){
        PrintWriter pw = null;
        
        try{
            
            this.modoEscritura = new FileWriter(archivo, true);
            pw = new PrintWriter(this.modoEscritura);
            pw.println(p.getDataStringFormat());
            
        }catch (IOException ae){
            System.err.println("error");
            
        }finally{
            if(pw!=null){
                pw.close();
            }
        }
    }
    
    private Publicacion cargarDatos(String data[]){
        
        String isbn = data[0];
        String titulo = data[1];
        String autor = data[2];
        int year = Integer.parseInt(data[3]);
        double costo = Double.parseDouble(data[4]);
        
        if(data.length==7){
            int edicion = Integer.parseInt(data[5]);
            int paginas = Integer.parseInt(data[6]);
            
            return new Libro(paginas, edicion, isbn, titulo, autor, year, costo);
            
        }else{
            String formato = data[5];
            double peso = Double.parseDouble(data[6]);
            double duracion = Double.parseDouble(data[7]);
            
            return new AudioLibro(duracion, peso, formato, isbn, titulo, autor, year, costo);
        }
    }
    
    public List<String> leerPublicaciones() throws ExcepcionArchivo{
        List<String> lista;
        try {
            this.modoLectura = new Scanner(this.archivo);
            lista = new ArrayList();
            while(this.modoLectura.hasNext()){
                String datos = this.modoLectura.nextLine();
                lista.add(datos);
            }
            return lista;
            
        } catch (FileNotFoundException ioe) {
            throw new ExcepcionArchivo("Error al abrir archivo en modo lectura, no existe");
        }
        finally{
            if(this.modoLectura!=null)
                this.modoLectura.close();
        }
    }
    
    public Publicacion buscar(Publicacion p) throws ExcepcionArchivo{
        Publicacion publicacionBc = null;
        
        try{
            this.modoLectura = new Scanner(this.archivo);
            while(this.modoLectura.hasNext()){
                String datos[] = this.modoLectura.nextLine().split(";");
                Publicacion aux = this.cargarDatos(datos);
                
                if(aux.getIsbn().equals(p.getIsbn())){
                    publicacionBc = aux;
                }
            }
            
            return publicacionBc;
            
        }catch (FileNotFoundException ae){
            throw new ExcepcionArchivo("No se pudo abrir el archivo para buscar el dato");
            
        }finally{
            if(this.modoLectura!=null)
                this.modoLectura.close();
        }
    }
    
    private void renombrarArchivo(File tmp) throws IOException{
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
    
    public Publicacion eliminar(Publicacion p) throws ExcepcionArchivo{
        
        Publicacion eliminada = null;
        ArchivoTexto archivoTmp = new ArchivoTexto("RegistroTmp.txt");
        
        try{
            
            this.modoLectura = new Scanner(this.archivo);
            while(this.modoLectura.hasNext()){
                String datos[] = this.modoLectura.nextLine().split(";");
                Publicacion aux = this.cargarDatos(datos);
                
                if(aux.getIsbn().equalsIgnoreCase(p.getIsbn())){
                    archivoTmp.guardarPublicacion(aux);
                    
                }else{
                    eliminada = aux;
                }
            }
            this.modoLectura.close();
            this.renombrarArchivo(archivoTmp.archivo);
            return eliminada;
            
        }catch (FileNotFoundException ae){
            throw new ExcepcionArchivo("No se pudo abrir el archivo");
            
        }catch (IOException e){
            throw new ExcepcionArchivo(e.getMessage());
            
        }finally{
            if(this.modoLectura!=null)
                this.modoLectura.close();
        }
    }
}
