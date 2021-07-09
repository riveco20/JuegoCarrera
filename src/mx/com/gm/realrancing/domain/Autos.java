package mx.com.gm.realrancing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.com.gm.realrancing.excepciones.*;

/**
 *
 * @author Richard Vellojin
 */
public class Autos extends Pista {

    //Atributos clase auto
    private int cantidad;
    private Pista pista = new Pista();
    private Podio podio = new Podio();
    private List<String> ganador = new ArrayList<String>();
    private List<Integer> metros = new ArrayList<Integer>();

    //Constructor
    public Autos() {
    }

    //Metodos Get
    public int getCantidad() {
        return cantidad;
    }

    public Pista getPista() {
        return pista;
    }

    public Podio getPodio() {
        return podio;
    }

    public List<String> getGanador() {
        return ganador;
    }

    public List<Integer> getMetros() {
        return metros;
    }

    //metodos para ejecucion
    public void canitdadAutos() {
        this.cantidad = 0;
        int contadorAutos = 0;
        while (contadorAutos < getNombres().size()) {
            contadorAutos += 1;

        }
        cantidad = contadorAutos;
        System.out.println("Cantidad de autos: " + cantidad);

    }

    public void agregarAutos(int cantidad) throws EscriturDatosEx {
        Scanner consola = new Scanner(System.in);
        int tamañoPista = -1;
        int lanzamiento = 1;
        while (tamañoPista != 0)
        try {
            System.out.println("Ingres el tamaño de la pista mayor o igual 600 o precione cero para salir: ");
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
                                        System.out.println("turno de " + getNombres().get(0) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto1 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto1);
                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(1) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto2 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto2);
                                    }
                                    continue;
                                }
                            }

                            if (metroAuto1 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(0))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(0));
                                    metros.add(metroAuto1);
                                }
                            }

                            if (metroAuto2 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(1))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(1));
                                    metros.add(metroAuto2);
                                }

                            }

                            lanzamiento += 1;
                        }
                        podio.mostrarPodio(ganador, metros, cantidad);
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
                                        System.out.println("turno de " + getNombres().get(0) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto1 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto1);
                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(1) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto2 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto2);

                                    }
                                    continue;
                                } else if (i == 3) {
                                    if (metroAuto3 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(2) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto3 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto3);

                                    }
                                    continue;
                                }
                            }
                            if (metroAuto1 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(0))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(0));
                                    metros.add(metroAuto1);
                                }
                            }

                            if (metroAuto2 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(1))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(1));
                                    metros.add(metroAuto2);
                                }
                            }
                            if (metroAuto3 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(2))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(2));
                                    metros.add(metroAuto3);
                                }

                            }

                            lanzamiento += 1;
                        }
                        podio.mostrarPodio(ganador, metros, cantidad);
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
                                        System.out.println("turno de " + getNombres().get(0) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto1 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto1);

                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(1) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto2 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto2);

                                    }
                                    continue;
                                } else if (i == 3) {
                                    if (metroAuto3 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(2) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto3 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto3);

                                    }
                                    continue;
                                } else if (i == 4) {
                                    if (metroAuto4 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(3) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto4 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto4);

                                    }
                                    continue;
                                }
                            }

                            if (metroAuto1 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(0))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(0));
                                    metros.add(metroAuto1);
                                }
                            }
                            if (metroAuto2 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(1))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(1));
                                    metros.add(metroAuto2);
                                }
                            }
                            if (metroAuto3 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(2))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(2));
                                    metros.add(metroAuto3);
                                }
                            }
                            if (metroAuto4 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(3))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(3));
                                    metros.add(metroAuto4);
                                }
                            }

                            lanzamiento += 1;
                        }
                        podio.mostrarPodio(ganador, metros, cantidad);
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
                                        System.out.println("turno de " + getNombres().get(0) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto1 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto1);

                                    }
                                    continue;
                                } else if (i == 2) {
                                    if (metroAuto2 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(1) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto2 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto2);

                                    }
                                    continue;
                                } else if (i == 3) {
                                    if (metroAuto3 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(2) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto3 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto3);

                                    }
                                    continue;
                                } else if (i == 4) {
                                    if (metroAuto4 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(3) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto4 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto4);

                                    }
                                    continue;
                                } else if (i == 5) {
                                    if (metroAuto5 < tamañoPista) {
                                        System.out.println("turno de " + getNombres().get(4) + " para lanza el dado marque 1");
                                        int dado = pista.dados();
                                        int valor = dado * 100;
                                        metroAuto5 += valor;
                                        pista.desplegarInformacion(lanzamiento, dado, valor, metroAuto5);

                                    }
                                    continue;
                                }
                            }

                            if (metroAuto1 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(0))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(0));
                                    metros.add(metroAuto1);
                                }
                            }

                            if (metroAuto2 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(1))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(1));
                                    metros.add(metroAuto2);
                                }
                            }

                            if (metroAuto3 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(2))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(2));
                                    metros.add(metroAuto3);
                                }
                            }
                            if (metroAuto4 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(3))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(3));
                                    metros.add(metroAuto4);
                                }
                            }
                            if (metroAuto5 >= tamañoPista) {
                                if (ganador.contains(getNombres().get(4))) {
                                    System.out.println("");
                                } else {
                                    ganador.add(getNombres().get(4));
                                    metros.add(metroAuto5);
                                }

                            }
//                          

                            lanzamiento += 1;
                        }
                        podio.mostrarPodio(ganador, metros, cantidad);
                        break;
                    }

                }

            } else {
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
