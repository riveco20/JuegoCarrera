package mx.com.gm.realrancing.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.com.gm.realrancing.domain.*;

/**
 *
 * @author Richard Vellojin
 */
public class JuegoRealRancing {
    
    public static void main(String[] args) {
        List<String> ganador = new ArrayList<String>();
        Scanner consola = new Scanner(System.in);

        List<String> jugadores = new ArrayList<String>();
        Autos autos= new Autos();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Elige una opncion: \n"
                    + "1. Agregar Jugadores\n"
                    + "2. Mostrar Lista\n"
                    + "3. Comenzar carrera\n"
                    + "4. Ver podio\n"
                    + "0. Salir");
            opcion = Integer.parseInt(consola.nextLine());
            
              switch(opcion){
                    
                  case 1:
                      autos.agregarJugador();
                      break;
                  case 2: 
                     autos.listarJugadores();
                     break;
                  case 3:
                     autos.iniciarCarrera();
                     
                      break;
                  case 4:
                        System.out.println("");
                        break;
                  case 0:
                      System.out.println("Hasta pronto");
                      break;
                  default:
                      System.out.println("Opcion invalidad");
                      break;
              }

            
    }
    }
}
