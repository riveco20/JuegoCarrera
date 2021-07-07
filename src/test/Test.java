/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.com.gm.realrancing.domain.Conductor;
import mx.com.gm.realrancing.domain.Pista;

/**
 *
 * @author Richard Vellojin
 */
public class Test {

    public static void main(String[] args) {
        List<String> ganador = new ArrayList<String>();
        Scanner consola = new Scanner(System.in);

        List<String> jugadores = new ArrayList<String>();
        Conductor conductor = new Conductor();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Elige una opncion: \n"
                    + "1. Agregar Jugadores\n"
                    + "2. Mostrar Lista\n"
                    + "3. Comenzar carrera\n"
                    + "0. Salir");
            opcion = Integer.parseInt(consola.nextLine());
            

        }

    }

}
