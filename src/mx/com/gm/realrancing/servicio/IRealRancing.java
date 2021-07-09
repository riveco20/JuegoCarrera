package mx.com.gm.realrancing.servicio;

import java.util.List;

/**
 *
 * @author Richard Vellojin
 */
public interface IRealRancing {
    
   String NOMBRE_RECURSO = "Juego.txt";
    
    void agregarJugador(String nombreJugador);
    
    void iniciarRealRancing(); 
    
}
