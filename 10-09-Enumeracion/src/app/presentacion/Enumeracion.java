/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.Carta;
import app.modelo.Numeros;
import app.modelo.Palo;

/**
 *
 * @author Tarde.A3
 */
public class Enumeracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 //Vamos a instanciar una Carta 
 
 Carta c1 = new Carta();
 c1.setP1(Palo.DIAMANTES);
 c1.setN1(Numeros.REY);
        System.out.println(c1.toString());
    }
    
}
