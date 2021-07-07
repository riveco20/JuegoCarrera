/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.realrancing.domain;

import java.util.*;

/**
 *
 * @author Richard Vellojin
 */
public class Pista extends Conductor{

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
    
   
    public void comenzarCarrera(){
        int contador=0;
        
        while(contador<nombres.size()){
            for (int i=0; i<nombres.size();i++) {
               
                
            }
            
            contador+=1;
        }
        
    }
    
}
