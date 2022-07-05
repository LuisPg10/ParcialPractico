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
import javax.swing.JOptionPane;

public class ArchivoTexto extends Archivo{
    
    private FileWriter modoEscritura;
    private Scanner modoLectura;
    
    public ArchivoTexto(){
        this("registro.txt");
    }
    public ArchivoTexto(String ruta){
        super(ruta);
    }
    
    public FileWriter getModoEscritura() {return modoEscritura;}
    public void setModoEscritura(FileWriter modoEscritura) {this.modoEscritura = modoEscritura;}

    @Override
    public void guardarPublicacion(Publicacion p){
        PrintWriter pw = null;
        
        try{
            
            this.modoEscritura = new FileWriter(archivo, true);
            pw = new PrintWriter(this.modoEscritura);
            pw.println(p.getDataStringFormat());
            
        }catch (IOException ae){
            JOptionPane.showMessageDialog(null,"Error al guardar el archivo","Erro",JOptionPane.WARNING_MESSAGE);
        }finally{
            if(pw!=null){
                pw.close();
            }
        }
    }
    
    private Publicacion cargarDatos(String data[]){
        
        String isbn = data[1];
        String titulo = data[2];
        String autor = data[3];
        int year = Integer.parseInt(data[4]);
        double costo = Double.parseDouble(data[5]);
        
        if(data.length==8){
            int edicion = Integer.parseInt(data[6]);
            int paginas = Integer.parseInt(data[7]);
            
            return new Libro(paginas, edicion, isbn, titulo, autor, year, costo);
            
        }else {
            String formato = data[6];
            double peso = Double.parseDouble(data[7]);
            double duracion = Double.parseDouble(data[8]);
            
            return new AudioLibro(duracion, peso, formato, isbn, titulo, autor, year, costo);
        }
    }
    
    @Override
    public List<Publicacion> leerPublicaciones() throws ExcepcionArchivo{
        List<Publicacion> lista;
        try {
            this.modoLectura = new Scanner(this.archivo);
            lista = new ArrayList();
            while(this.modoLectura.hasNext()){
                
                String datos[] = this.modoLectura.nextLine().split(";");
                Publicacion p = this.cargarDatos(datos);
                lista.add(p);
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
    
    @Override
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
    
    @Override
    public void eliminar(Publicacion p) throws ExcepcionArchivo{
        
        ArchivoTexto archivoTmp = new ArchivoTexto("Registro.tpm");
        
        try{
            
            this.modoLectura = new Scanner(this.archivo);
            while(this.modoLectura.hasNext()){
                String datos[] = this.modoLectura.nextLine().split(";");
                Publicacion aux = this.cargarDatos(datos);
                
                if(!aux.getIsbn().equalsIgnoreCase(p.getIsbn())){
                    archivoTmp.guardarPublicacion(aux);   
                }
            }
            this.modoLectura.close();
            this.renombrarArchivo(archivoTmp.archivo);
            
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
