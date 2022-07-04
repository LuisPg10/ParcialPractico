package co.edu.unicesar.persistencia;

import co.edu.unicesar.modelo.Publicacion;
import java.util.List;

/**
 *
 * @author JAIRO
 */
public interface IPublicacionDao {
    
    void insertarPublicacion(Publicacion p);
    List<Publicacion> leerPublicaciones();
    Publicacion buscarPublicacion(Publicacion p);
    Publicacion eliminarPublicacion(Publicacion p);
}
