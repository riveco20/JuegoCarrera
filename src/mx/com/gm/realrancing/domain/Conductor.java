package mx.com.gm.realrancing.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import mx.com.gm.realrancing.excepciones.AccesoDatosEx;
import mx.com.gm.realrancing.excepciones.EscriturDatosEx;

/**
 *
 * @Richard Vellojin <richardvellojin@gmail.com>
 */
public class Conductor {

    //Atrubutos Clase conductor
    private String nombreJugador;
    private List<String> nombres = new ArrayList<String>();

    //contructores clase conductor;
    public Conductor() {

    }
    //Metodos get and set

    public Conductor(String nombre) {
        this.nombreJugador = nombre;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }
    
      public List<String> getNombres() {
        return nombres;
    }

    //Metodos para Ejecucion del programa
    public List agregarJugador(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Cuantos Jugadores son maximo 5 y minimo 2");
        int cantidad = Integer.parseInt(consola.nextLine());
        int contador = 0;
        int idPersona = 1;

        if (cantidad >= 2 && cantidad < 6) {
            nombres.clear();

            while (contador < cantidad) {
                System.out.println("Jugador: " + idPersona);
                String nombre = consola.nextLine();
                this.nombres.add(nombre);
                contador += 1;
                idPersona += 1;
            }
        } else {
            System.out.println("La cantidad de jugadores esta fuera del rango");

        }

        return nombres;
    }

    public void listarJugadores(){

        if (nombres.isEmpty()) {
            System.out.println("Error: \n"
                    + " Lista vacia agregar primero los jugadores");

        } else {
            System.out.println("Lista de jugadores para el campeonato altual");
            int carril = 1;
            for (String nombre : this.nombres) {
                System.out.println("Carril: " + carril + " Jugador: " + nombre);
                carril += 1;
            }
        }
    }

    @Override
    public String toString() {
        return nombreJugador;
    }

  

}
