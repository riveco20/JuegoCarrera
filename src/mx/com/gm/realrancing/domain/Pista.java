package mx.com.gm.realrancing.domain;

import java.util.*;
import mx.com.gm.realrancing.excepciones.AccesoDatosEx;
import mx.com.gm.realrancing.excepciones.EscriturDatosEx;

/**
 *
 * @author Richard Vellojin
 */
public class Pista extends Conductor {

    //Atirubutos clase Pista
    private int tamañoPista;
    private int carriles;
    private int valorDado;

    public Pista() {
    }

    //metodos Get and Set
    public Pista(int tamañoPista) {
        this.tamañoPista = tamañoPista;
    }

    public int getTamañoPista() {
        return tamañoPista;
    }

    public void setTamañoPista(int tamañoPista) {
        this.tamañoPista = tamañoPista;
    }

    public int getCarriles() {
        return carriles;
    }

    public void setCarriles(int carriles) {
        this.carriles = carriles;
    }

    //Metodos solucion 
  
    public int dados() throws EscriturDatosEx {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;
       
        opcion = Integer.parseInt(consola.nextLine());
        if (opcion == 1) {
            valorDado = (int) (Math.random() * 6 + 1);

        }
        return valorDado;
       }
       
    
    public void desplegarInformacion(int lanzamiento, int dado, int valor, int metroAuto1){
        System.out.println("Lanzamiento N° " + lanzamiento + " - Valor Lanzado :  " + dado +"\n"
                          +"Avance en metros: " + valor+"\n"
                          +"Acomuldado en metros: " + metroAuto1+"\n" 
                          +"-------------------------\n");
                                   
    }

    public void carriles()throws AccesoDatosEx {
        this.carriles = 0;
        int contador = 0;
        while (contador < nombres.size()) {
            carriles += 1;
            contador += 1;
        }
        System.out.println("Cantidad de carriles: " + carriles);
    }

}
