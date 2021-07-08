package mx.com.gm.realrancing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Richard Vellojin
 */
public class Autos extends Pista {

    public int cantidad;
    Pista pista = new Pista();
    List<String> ganador = new ArrayList<String>();

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

    public void agregarAutos(int cantidad) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la pista en metros: ");
        int tamañoPista = Integer.parseInt(consola.nextLine());
        pista.setTamañoPista(tamañoPista);
        ganador.clear();
        if (cantidad == 2) {
            int metroAuto1 = 0;
            int metroAuto2 = 0;
            while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista) {
                for (int i = 1; i <= cantidad; i++) {
                    if (i == 1) {
                        if (metroAuto1 < tamañoPista) {
                            System.out.println("Jugador 1 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto1 += valor;
                            System.out.println("");
                        }
                        continue;
                    } else if (i == 2) {
                        if (metroAuto2 < tamañoPista) {
                            System.out.println("Jugador 2 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto2 += valor;
                        }
                        continue;
                    }
                }

                if (metroAuto1 >= tamañoPista) {
                    if (ganador.contains(nombres.get(0))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(0));
                    }
                }

                if (metroAuto2 >= tamañoPista) {
                    if (ganador.contains(nombres.get(1))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(1));
                    }

                }
            }
            System.out.println("Jugador: " + nombres.get(0) + " metros totales: " + metroAuto1);
            System.out.println("Jugador: " + nombres.get(1) + " metros totales: " + metroAuto2);

            var contador = 1;
            for (int x = 0; x <cantidad; x++) {
                System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                contador += 1;
            }
            System.out.println("Se lleno el podio");
            
        }
        else if (cantidad == 3) {
            int metroAuto1 = 0;
            int metroAuto2 = 0;
            int metroAuto3 = 0;
            while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista || metroAuto3 < tamañoPista) {

                for (int i = 1; i <= cantidad; i++) {
                    if (i == 1) {
                        if (metroAuto1 < tamañoPista) {
                            System.out.println("Jugador 1 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto1 += valor;
                            System.out.println("");
                        }
                        continue;
                    } else if (i == 2) {
                        if (metroAuto2 < tamañoPista) {
                            System.out.println("Jugador 2 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto2 += valor;
                        }
                        continue;
                    } else if (i == 3) {
                        if (metroAuto3 < tamañoPista) {
                            System.out.println("Jugador 3 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto3 += valor;
                        }
                        continue;
                    }
                }
                if (metroAuto1 >= tamañoPista) {
                    if (ganador.contains(nombres.get(0))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(0));
                    }
                }

                if (metroAuto2 >= tamañoPista) {
                    if (ganador.contains(nombres.get(1))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(1));
                    }

                    if (metroAuto3 >= tamañoPista) {
                        if (ganador.contains(nombres.get(2))) {
                            System.out.println("");
                        } else {
                            ganador.add(nombres.get(2));
                        }
                    }

                }
//      

            }
            System.out.println("Jugador: " + nombres.get(0) + " metros totales: " + metroAuto1);
            System.out.println("Jugador: " + nombres.get(1) + " metros totales: " + metroAuto2);
            System.out.println("Jugador: " + nombres.get(2) + " metros totales: " + metroAuto3);
            var contador = 1;
            for (int x = 0; x <cantidad; x++) {
                System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                contador += 1;
            }
            System.out.println("Se lleno el podio");

        }

        else if (cantidad == 4) {
            int metroAuto1 = 0;
            int metroAuto2 = 0;
            int metroAuto3 = 0;
            int metroAuto4 = 0;
            while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista || metroAuto3 < tamañoPista || metroAuto4 < tamañoPista) {

                for (int i = 1; i <= cantidad; i++) {
                    if (i == 1) {
                        if (metroAuto1 < tamañoPista) {
                            System.out.println("Jugador 1 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto1 += valor;
                            System.out.println("");
                        }
                        continue;
                    } else if (i == 2) {
                        if (metroAuto2 < tamañoPista) {
                            System.out.println("Jugador 2 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto2 += valor;
                        }
                        continue;
                    } else if (i == 3) {
                        if (metroAuto3 < tamañoPista) {
                            System.out.println("Jugador 3 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto3 += valor;
                        }
                        continue;
                    } else if (i == 4) {
                        if (metroAuto4 < tamañoPista) {
                            System.out.println("Jugador 4 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto4 += valor;
                        }
                        continue;
                    }
                }

                if (metroAuto1 >= tamañoPista) {
                    if (ganador.contains(nombres.get(0))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(0));
                    }
                }
                if (metroAuto2 >= tamañoPista) {
                    if (ganador.contains(nombres.get(1))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(1));
                    }
                }
                if (metroAuto3 >= tamañoPista) {
                    if (ganador.contains(nombres.get(2))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(2));
                    }
                }
                if (metroAuto4 >= tamañoPista) {
                    if (ganador.contains(nombres.get(3))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(3));
                    }
                }
            }
            System.out.println("Jugador: " + nombres.get(0) + " metros totales: " + metroAuto1);
            System.out.println("Jugador: " + nombres.get(1) + " metros totales: " + metroAuto2);
            System.out.println("Jugador: " + nombres.get(2) + " metros totales: " + metroAuto3);
            System.out.println("Jugador: " + nombres.get(3) + " metros totales: " + metroAuto4);

            var contador = 1;
            for (int x = 0; x <3; x++) {
                System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                contador += 1;
            }
            System.out.println("Se lleno el podio");
        } else {
            int metroAuto1 = 0;
            int metroAuto2 = 0;
            int metroAuto3 = 0;
            int metroAuto4 = 0;
            int metroAuto5 = 0;

            while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista || metroAuto3 < tamañoPista || metroAuto4 < tamañoPista || metroAuto5<tamañoPista) {

                for (int i = 1; i <= cantidad; i++) {
                    if (i == 1) {
                        if (metroAuto1 < tamañoPista) {
                            System.out.println("Jugador 1 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto1 += valor;
                            System.out.println("");
                        }
                        continue;
                    } else if (i == 2) {
                        if (metroAuto2 < tamañoPista) {
                            System.out.println("Jugador 2 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto2 += valor;
                        }
                        continue;
                    } else if (i == 3) {
                        if (metroAuto3 < tamañoPista) {
                            System.out.println("Jugador 3 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto3 += valor;
                        }
                        continue;
                    } else if (i == 4) {
                        if (metroAuto4 < tamañoPista) {
                            System.out.println("Jugador 4 para lanza el dado marque 1");
                            int valor = (pista.dados()) * 100;
                            System.out.println("Avance en metros: " + valor);
                            metroAuto4 += valor;
                        }
                        continue;
                    }else if (i == 5) {
                            if (metroAuto5 < tamañoPista) {
                                System.out.println("Jugador 5 para lanza el dado marque 1");
                                int valor = (pista.dados()) * 100;
                                System.out.println("Avance en metros: " + valor);
                                metroAuto5 += valor;
                            }
                            continue;
                     }
                }

                if (metroAuto1 >= tamañoPista) {
                    if (ganador.contains(nombres.get(0))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(0));
                    }
                }

                if (metroAuto2 >= tamañoPista) {
                    if (ganador.contains(nombres.get(1))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(1));
                    }
                }

                if (metroAuto3 >= tamañoPista) {
                    if (ganador.contains(nombres.get(2))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(2));
                    }
                }
                if (metroAuto4 >= tamañoPista) {
                    if (ganador.contains(nombres.get(3))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(3));
                    }
                }
                if (metroAuto5 >= tamañoPista) {
                    if (ganador.contains(nombres.get(4))) {
                        System.out.println("");
                    } else {
                        ganador.add(nombres.get(4));
                    }

                }
//      

            }
            System.out.println("Jugador: " + nombres.get(0) + " metros totales: " + metroAuto1);
            System.out.println("Jugador: " + nombres.get(1) + " metros totales: " + metroAuto2);
            System.out.println("Jugador: " + nombres.get(2) + " metros totales: " + metroAuto3);
            System.out.println("Jugador: " + nombres.get(3) + " metros totales: " + metroAuto4);
            System.out.println("Jugador: " + nombres.get(4) + " metros totales: " + metroAuto5);

            var contador = 1;
            for (int x = 0; x<3; x++) {
                System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                contador += 1;
            }
            System.out.println("Se lleno el podio");

        }

    }

    public void iniciarCarrera() {
        this.canitdadAutos();
        this.carriles();
        if (cantidad >= 2 || cantidad <= 5) {
            System.out.println("hola 1");
            this.agregarAutos(cantidad);
        } else {
            System.out.println("Cantidad de jugadores no permitidad");
        }

    }

    public void impirmirResultadosAnteriores() {

    }
}
