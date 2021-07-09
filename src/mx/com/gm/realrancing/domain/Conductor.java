package mx.com.gm.realrancing.domain;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @Richard Vellojin <richardvellojin@gmail.com>
 */
public class Conductor {

    //Atrubutos Clase conductor
    private String nombreJugador;
    private List<String> nombres = new ArrayList<String>();
    private List<String> todosNombres = new ArrayList<String>();
    
    String formato = "hh: mm: ss: a dd-MM-yyyy";
    SimpleDateFormat formato2 = new SimpleDateFormat(formato);
    private Date fecha = new Date();

    
    
    //contructores clase conductor;
    public Conductor() {

    }
    
   
  
    public Conductor(String nombre) {
        this.nombreJugador = nombre;
    }

   
    //Metodos get and set

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
                this.todosNombres.add(nombre);
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

    public void listarTotales(){
        System.out.println("Lista de todos los jugadores creado ");
        for (int i = 0; i < todosNombres.size(); i++) {
            System.out.println("N° " + i + " Jugador: " + todosNombres.get(i) + " Fecha y hora: " + formato2.format(this.fecha));
            
        }
    }
    @Override
    public String toString() {
        return nombreJugador + " \t Fecha y hora de ingreso " + formato2.format(this.fecha);
    }


  

}
