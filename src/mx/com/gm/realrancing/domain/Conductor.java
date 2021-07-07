package mx.com.gm.realrancing.domain;

import java.util.*;

/**
 *
 * @Richard Vellojin <richardvellojin@gmail.com>
 */
public class Conductor {
    
    private String nombre;
    
    public Conductor(){
        
    }
    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public String toString() { 
        return nombre;
    }

    
    
    
    
    
    
}
