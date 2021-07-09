package mx.com.gm.realrancing.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.com.gm.realrancing.domain.*;
import mx.com.gm.realrancing.excepciones.*;
import mx.com.gm.realrancing.servicio.*;

/**
 *
 * @author Richard Vellojin
 */
public class JuegoRealRancing {

    public static void main(String[] args) throws EscriturDatosEx {
        Scanner consola = new Scanner(System.in);
        IRealRancing juego = new RealRancingImp();
        Autos autos = new Autos();
        int opcion = -1;
        int opcion2 = -1;
        while (opcion != 0) {
            try {

                System.out.println("Elige una opncion: \n"
                        + "1. Comenzar juego\n"
                        + "0. Salir");
                opcion = Integer.parseInt(consola.nextLine());

                switch (opcion) {
                    
                    case 1:
                        juego.iniciarRealRancing();
                        while (opcion2 != 0) {
                            try {
                                System.out.println("Menu principal del juego");
                            System.out.println("Elige una opncion: \n"
                                    + "1. Agregar Jugadores\n"
                                    + "2. Mostrar Lista\n"
                                    + "3. Comenzar carrera\n"
                                    + "4. Ver lista de todos los jugadores\n"
                                    + "0. Atras");
                            opcion2 = Integer.parseInt(consola.nextLine());
                            switch (opcion2) {
                                case 1:
                                   List nombres= autos.agregarJugador();
                                   for(int i =0; i<nombres.size();i++){
                                      String nombre2= String.valueOf(nombres.get(i));
                                      juego.agregarJugador(nombre2);
                                   }
                                 
                                   break;
                                case 2:
                                    autos.listarJugadores();
                                    break;
                                case 3:
                                    autos.iniciarCarrera();
                                    break;
                                case 4:
                                    autos.listarTotales();
                                    break;
                                case 0:
                                    System.out.println("Salio del menu");
                                    break;
                                default:
                                    System.out.println("Opcion invalidad");
                                    break;

                            }
                            }catch (Exception e){
                             System.out.println("No ingrese letras solo numeros");   
                            }

                        }
                    case 0:
                        System.out.println("Hasta pronto");
                        break;
                    default:
                        System.out.println("Opcion invalidad");
                        break;
                }

            } catch (Exception e) {
                System.out.println("No ingrese letras solo numeros");
            }
        }
    }
}
