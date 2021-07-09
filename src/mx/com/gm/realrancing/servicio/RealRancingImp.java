package mx.com.gm.realrancing.servicio;

import mx.com.gm.realrancing.datos.AccesoDatosI;
import mx.com.gm.realrancing.datos.AccesoDatosImp;
import mx.com.gm.realrancing.domain.Conductor;
import mx.com.gm.realrancing.excepciones.*;

/**
 *
 * @author Richard Vellojin
 */
public class RealRancingImp implements IRealRancing{
    
    
    private final AccesoDatosI datos;

    public RealRancingImp(){
     this.datos = new AccesoDatosImp();
    }
    
    

    @Override
    public void agregarJugador(String nombreJugador) {
    
        Conductor jugador = new Conductor(nombreJugador);
        boolean anexar = false;
        try {

            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribri(jugador, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de aceso de datos");
            ex.printStackTrace();
            
        }
        
    }


    @Override
    public void iniciarRealRancing() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }
            else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar Juego");
            ex.printStackTrace(System.out);
        }
    }
}
