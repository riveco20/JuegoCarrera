
package mx.com.gm.realrancing.datos;

import java.util.List;
import mx.com.gm.realrancing.domain.Conductor;
import mx.com.gm.realrancing.excepciones.*;

/**
 *
 * @author RichardVellojin <richardvellojin@gmail.com>
 */
public interface AccesoDatosI {
    
    boolean existe(String Archivo) throws AccesoDatosEx; 
    
    List<Conductor> listar(String nombreArhchivo)throws LecturaDatosEx;

    void escribri(Conductor conductor, String nombreArchivo, boolean anexar) throws EscriturDatosEx;
    
    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    void crear(String nombreArchivo) throws AccesoDatosEx; 
    
    void borrar(String nombreArchivo) throws AccesoDatosEx; 
    
}
