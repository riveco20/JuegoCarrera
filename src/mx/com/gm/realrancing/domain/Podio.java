package mx.com.gm.realrancing.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard Vellojin
 */
public class Podio {
   
    private List<String> nombresPodio = new ArrayList<String>();
    private List<Integer> metrosAutos = new ArrayList<Integer>();

    public Podio() {

    }
    

    public List<String> getNombresPodio() {
        return nombresPodio;
    }

    public List<Integer> getMetrosAutos() {
        return metrosAutos;
    }

    public void mostrarPodio(List nombres, List metros, int cantidad){
        this.nombresPodio = nombres;
        this.metrosAutos = metros;
     
       
        for (int i = 0; i <= nombresPodio.size()-1; i++) {
                System.out.println("Jugador: " + nombresPodio.get(i) + " |" + "Metros Totales: " + metrosAutos.get(i));

        }
        int contador = 1;
        if(cantidad<=3){
        for (int x = 0; x < cantidad; x++) {
            System.out.println("Puesto " + contador + " Jugador: " + nombresPodio.get(x));
            contador += 1;
        }
        }
        else if(cantidad>3 && cantidad<6){
             for (int x = 0; x < 3; x++) {
            System.out.println("Puesto " + contador + " Jugador: " + nombresPodio.get(x));
            contador += 1;
            
        }
        System.out.println("Se lleno el podio");
        
                }
    }

    
    }

