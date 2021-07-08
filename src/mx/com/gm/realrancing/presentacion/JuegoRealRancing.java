package mx.com.gm.realrancing.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.com.gm.realrancing.domain.*;
import mx.com.gm.realrancing.excepciones.*;

/**
 *
 * @author Richard Vellojin
 */
public class JuegoRealRancing {
    
    public static void main(String[] args) throws EscriturDatosEx {
        Scanner consola = new Scanner(System.in);
        Autos autos= new Autos();
        int opcion = -1;

        while (opcion != 0) {
            try{
                   
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

     
            }catch(Exception e){
               System.out.println("Ingrese una opcion validad");
            }
        }
    }
}
    
    
    

