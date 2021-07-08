package mx.com.gm.realrancing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.com.gm.realrancing.excepciones.AccesoDatosEx;
import mx.com.gm.realrancing.excepciones.EscriturDatosEx;
import mx.com.gm.realrancing.excepciones.LecturaDatosEx;

/**
 *
 * @author Richard Vellojin
 */
public class Autos extends Pista {

    //Atributos clase auto
    public int cantidad;
    Pista pista = new Pista();
    List<String> ganador = new ArrayList<String>();

    public Autos() {
    }

    //metodos para ejecucion
    public void canitdadAutos() throws LecturaDatosEx {
        this.cantidad = 0;
        int contadorAutos = 0;
        while (contadorAutos < nombres.size()) {
            contadorAutos += 1;

        }
        cantidad = contadorAutos;
        System.out.println("Cantidad de autos: " + cantidad);

    }

    public void agregarAutos(int cantidad) throws EscriturDatosEx {
        Scanner consola = new Scanner(System.in);
        int tamañoPista = -1;
        while (tamañoPista != 0)
        try {
            System.out.println("Ingrese el tamaño de la pista para comenzar el juego o cero para salir: ");
            tamañoPista = Integer.parseInt(consola.nextLine());

            pista.setTamañoPista(tamañoPista);
            if (tamañoPista >= 600) {
                ganador.clear();

                switch (cantidad) {
                    case 2: {
                        int metroAuto1 = 0;
                        int metroAuto2 = 0;
                        while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista) {
                            for (int i = 1; i <= cantidad; i++) {
                                if (i == 1) {
                                    if (metroAuto1 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(0) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto1 += valor;
                                        System.out.println("Acomuldado en metros: " + metroAuto1);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(1) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto2 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto2);
                                        System.out.println("-------------------------\n");
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
                        for (int x = 0; x < cantidad; x++) {
                            System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                            contador += 1;
                        }
                        System.out.println("Se lleno el podio");
                        break;
                    }
                    case 3: {
                        int metroAuto1 = 0;
                        int metroAuto2 = 0;
                        int metroAuto3 = 0;
                        while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista || metroAuto3 < tamañoPista) {

                            for (int i = 1; i <= cantidad; i++) {
                                if (i == 1) {
                                    if (metroAuto1 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(0) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto1 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto1);
                                        System.out.println("-------------------------\n");

                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(1) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto2 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto2);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 3) {
                                    if (metroAuto3 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(2) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto3 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto3);
                                        System.out.println("-------------------------\n");
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
                        for (int x = 0; x < cantidad; x++) {
                            System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                            contador += 1;
                        }
                        System.out.println("Se lleno el podio");
                        break;
                    }
                    case 4: {
                        int metroAuto1 = 0;
                        int metroAuto2 = 0;
                        int metroAuto3 = 0;
                        int metroAuto4 = 0;
                        while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista || metroAuto3 < tamañoPista || metroAuto4 < tamañoPista) {

                            for (int i = 1; i <= cantidad; i++) {
                                if (i == 1) {
                                    if (metroAuto1 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(0) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto1 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto1);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(1) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto2 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto2);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 3) {
                                    if (metroAuto3 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(2) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto3 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto3);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 4) {
                                    if (metroAuto4 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(3) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto4 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto4);
                                        System.out.println("-------------------------\n");
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
                        for (int x = 0; x < 3; x++) {
                            System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                            contador += 1;
                        }
                        System.out.println("Se lleno el podio");
                        break;
                    }
                    default: {
                        int metroAuto1 = 0;
                        int metroAuto2 = 0;
                        int metroAuto3 = 0;
                        int metroAuto4 = 0;
                        int metroAuto5 = 0;
                        while (metroAuto1 < tamañoPista || metroAuto2 < tamañoPista || metroAuto3 < tamañoPista || metroAuto4 < tamañoPista || metroAuto5 < tamañoPista) {

                            for (int i = 1; i <= cantidad; i++) {
                                if (i == 1) {
                                    if (metroAuto1 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(0) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto1 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto1);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(1) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto2 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto2);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 3) {
                                    if (metroAuto3 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(2) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto3 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto3);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 4) {
                                    if (metroAuto4 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(3) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto4 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto4);
                                        System.out.println("-------------------------\n");
                                    }
                                    continue;
                                } else if (i == 5) {
                                    if (metroAuto5 < tamañoPista) {
                                        System.out.println("turno de " + nombres.get(4) + " para lanza el dado marque 1");
                                        int valor = (pista.dados()) * 100;
                                        System.out.println("Avance en metros: " + valor);
                                        metroAuto5 += valor;
                                        System.out.println("Acomulado en metros: " + metroAuto5);
                                        System.out.println("-------------------------\n");
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
                        for (int x = 0; x < 3; x++) {
                            System.out.println("Puesto " + contador + " Jugador: " + ganador.get(x));
                            contador += 1;
                        }
                        System.out.println("Se lleno el podio");
                        break;
                    }
                }

            }
            else {
                System.out.println("EL Tamaño de la Pista debe ser mayor 0 600");
            }
        } catch (Exception e) {
            System.out.println("Ingrese un numero no una letra o precione cero para salir");
        }
    }

    public void iniciarCarrera() throws LecturaDatosEx, AccesoDatosEx {
        try {
            this.canitdadAutos();
            this.carriles();
            if (cantidad >= 2 || cantidad <= 5) {

                try {
                    this.agregarAutos(cantidad);
                } catch (EscriturDatosEx ex) {
                    ex.printStackTrace();
                    throw new LecturaDatosEx("Excepcion al leer la canitdad de jugadores: " + ex.getMessage());

                }
            } else {
                System.out.println("Cantidad de jugadores no permitidad");
            }
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Error al acceder a los datos: " + ex.getMessage());
        }

    }
}
