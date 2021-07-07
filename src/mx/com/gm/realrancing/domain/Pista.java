/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.realrancing.domain;

/**
 *
 * @author Richard Vellojin
 */
public class Pista {

    private int tamañoPista;

    public Pista() {
    }

    public Pista(int tamañoPista) {
        this.tamañoPista = tamañoPista;
    }

    public int getTamañoPista() {
        return tamañoPista;
    }

    public void setTamañoPista(int tamañoPista) {
        this.tamañoPista = tamañoPista;
    }

    @Override
    public String toString() {
        return "Pista{" + "Tamaño Pista =" + tamañoPista + '}';
    }
    
    
}
