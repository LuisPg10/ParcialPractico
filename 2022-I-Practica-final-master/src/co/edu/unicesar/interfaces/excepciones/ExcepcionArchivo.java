package co.edu.unicesar.interfaces.excepciones;

import java.io.IOException;

public class ExcepcionArchivo extends IOException{
    
    public ExcepcionArchivo(String string){
        super(string);
    }
}