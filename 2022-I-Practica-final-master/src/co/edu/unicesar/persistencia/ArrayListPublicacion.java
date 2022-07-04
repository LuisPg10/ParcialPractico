package co.edu.unicesar.persistencia;

import co.edu.unicesar.modelo.Publicacion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JAIRO
 */
public class ArrayListPublicacion implements IPublicacionDao {
    private List<Publicacion> listaPublicacion;

    public ArrayListPublicacion() {
        this.listaPublicacion = new ArrayList();
    }
    
    
    @Override
    public void insertarPublicacion(Publicacion p) {
        this.listaPublicacion.add(p);
    }

    @Override
    public List<Publicacion> leerPublicaciones() {
       List<Publicacion> lista = new ArrayList(this.listaPublicacion);
       return lista;
    }

    @Override
    public Publicacion buscarPublicacion(Publicacion p) {
        Publicacion buscar=null;
        for(Publicacion i: this.listaPublicacion){
            if(i.getIsbn().equalsIgnoreCase(p.getIsbn())){
                buscar = i;
                break;
            }
        }
        return buscar;
        
    }

    @Override
    public Publicacion eliminarPublicacion(Publicacion p) {
        Iterator<Publicacion> i = this.listaPublicacion.iterator();
        Publicacion eliminado=null;
        while(i.hasNext()){
            Publicacion aux = i.next();
            if(aux.getIsbn().equalsIgnoreCase(p.getIsbn())){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }
}
