/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Modelo2;

import newApp.noEncapsulada;

/**
 *
 * @author Tarde.A3
 */
public class encapsulacionyModoAccesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        noEncapsulada n1 = new noEncapsulada();
        n1.hora = 26;
        System.out.println("Valor hora no encapsulado "+ n1.hora);
        n1.minutos = 75;
        
        // instanciar una claseEncapsulada
        
claseEncapsulada n2 = new claseEncapsulada();      
n2.setHora(23);
        System.out.println(" Valor de hora: "+n2.getHora());
    n2.setMinuto(78);

    }
    
}
