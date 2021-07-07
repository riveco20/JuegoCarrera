package mx.com.gm.realrancing.domain;

import java.util.Scanner;

/**
 *
 * @author Richard Vellojin
 */
public class Autos extends Pista {

    public int cantidad;
    Pista pista = new Pista();

    public Autos() {
    }

    public void canitdadAutos() {
        this.cantidad = 0;
        int contadorAutos = 0;
        while (contadorAutos < nombres.size()) {
            contadorAutos += 1;

        }
        cantidad = contadorAutos;
        System.out.println("Cantidad de autos1: " + cantidad);

    }

    public void dosContrados(int cantidad) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la pista en metros: ");
        int tamañoPista = Integer.parseInt(consola.nextLine());
        pista.setTamañoPista(tamañoPista);
        int metroAuto1 = 0;
        int metroAuto2 = 0;
        while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista) {
            Scanner consola2 = new Scanner(System.in);
            for (int i = 1; i < cantidad; i++) {
                if (i == 1) {
                    if (metroAuto1 < tamañoPista) {
                        int valor = (pista.dados()) * 100;
                        metroAuto1 += valor;

                    }
                } else if (i == 2) {
                    if (metroAuto2 < tamañoPista) {
                        pista.dados();

                        int valor = (pista.dados()) * 100;
                        metroAuto1 += valor;

                    }

                    continue;

                }

            }
        }
//            else if (i == 2) {
//                    if (metroAuto2 < largoPista) {
//                        System.out.println("Jugador 2 para lanza el dado marque 1");
//                        opcion = Integer.parseInt(consola2.nextLine());
//                        if (opcion == 1) {
//                            double valorDado = Math.floor(Math.random() * 6 + 1);
//                            System.out.println("jugador " + i + " Dado: " + valorDado);
//                            double valor =((100 * valorDado)*(1/1000d));
//                            metroAuto2 += valor;
//                            System.out.println("valor = " + valor);
//                        }
//                    }
//
//                    continue;
//
//                }
    }

    public void iniciarCarrera() {
        this.canitdadAutos();
        this.carriles();
        if (cantidad == 2) {
            System.out.println("hola 1");
        } else if (cantidad > 2 && cantidad <= 5) {

        } else if (cantidad > 5 && cantidad <= 10) {
            System.out.println("hola 3");

        } else {
            System.out.println("Cantidad de jugadores no permitidad");
        }

    }

}
