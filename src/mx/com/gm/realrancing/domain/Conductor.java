package mx.com.gm.realrancing.domain;

import java.util.*;

/**
 *
 * @Richard Vellojin <richardvellojin@gmail.com>
 */
public class Conductor {

    List<String> nombres = new ArrayList<String>();

    public Conductor() {

    }

    public void agregarJugador() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Cuantos Jufadores son maximo 10 y minimo 2");
        int cantidad = Integer.parseInt(consola.nextLine());
        int contador = 0;
        int idPersona = 1;
        
            nombres.clear();
        while (contador < cantidad) {

            System.out.println("Jugador: " + idPersona);
            String nombre = consola.nextLine();
            this.nombres.add(nombre);
            contador += 1;
            idPersona += 1;

        }
    }

    public void listarJugadores() {
        System.out.println("Lista de jugadores");
        int carril = 1;
        for (String nombre : this.nombres) {
            System.out.println("Carril: " + carril + " Jugador: " + nombre);
            carril += 1;
        }
    }


    @Override
    public String toString() {
        return "Conductor{" + "nombres=" + nombres + '}';
    }

}
