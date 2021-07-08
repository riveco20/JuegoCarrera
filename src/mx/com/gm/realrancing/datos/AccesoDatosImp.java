package mx.com.gm.realrancing.datos;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import mx.com.gm.realrancing.domain.Conductor;
import mx.com.gm.realrancing.excepciones.*;

/**
 *
 * @author Richard Vellojin
 */
public class AccesoDatosImp implements AccesoDatosI {

    Date fecha = new Date();

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Conductor> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        List<Conductor> conductores = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                var conductor = new Conductor(linea);
                conductores.add(conductor);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar jugadores: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar jugadores: " + ex.getMessage());
        }

        return conductores;
    }

    @Override
    public void escribri(Conductor conductor, String nombreArchivo, boolean anexar) throws EscriturDatosEx {
        var archivo = new File(nombreArchivo);
        String formato = "hh: mm: ss: a dd-MM-yyyy";
        SimpleDateFormat formato2 = new SimpleDateFormat(formato);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));

            salida.println(conductor.toString() + "\t" + "Fecha y hora de ingreso: " + formato2.format(this.fecha));
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + conductor);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscriturDatosEx("Excepcion al escribir Jugador: " + ex.getMessage());

        }
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo para el juego");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo: " + ex.getMessage());
        }

    }

    @Override
    public void borrar(String nombreRecurso) {
        var archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo existente");

    }

}
