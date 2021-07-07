package mx.com.gm.realrancing.domain;

import java.util.*;

/**
 *
 * @Richard Vellojin <richardvellojin@gmail.com>
 */
public class Conductor {
    
   
    List<String>nombres = new ArrayList<String>();

    public Conductor(){
        
    }

    public void agregarJugador(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Cuantos Jufadores son");
        int cantidad =Integer.parseInt(consola.nextLine());
        int contador=0;
        while(contador<cantidad){
            System.out.println("Ingrese el nombre de los jugadores");
            String nombre=consola.nextLine();
            nombres.add(nombre);
            contador+=1;
        }
        
        }
    
    public void listarJugadores(){
        for (String nombre : nombres) {
            System.out.println("Lista de jugadores");
            System.out.println(nombre);
            
        }
    }
    @Override
    public String toString() {
        return "Conductor{" + "nombres=" + nombres + '}';
    }
   
    
}
        
        
    
    
    
    
    

