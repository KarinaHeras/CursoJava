/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.Bicibleta;
import app.modelo.BicicletaMontaña;
import app.modelo.BicicletaTandem;

/**
 *
 * @author Tarde.A3
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicibleta b1 = new Bicibleta(30, 3, 5);
        b1.CambiarPiñon(1);
        b1.CambiarPlato(2);
        b1.acelerar();
        b1.frenar();
        b1.getPiñonActual();
        b1.getPlatoActual();
        
        Bicibleta b2 = new BicicletaMontaña(3, 40, 2, 1);
         b2.CambiarPiñon(1);
        b2.CambiarPlato(2);
        b2.acelerar();
        b2.frenar();
        ((BicicletaMontaña)b2).cambiarSuspension(3);
        
        Bicibleta b3 = new BicicletaTandem(1, 15, 3, 2);
         b3.CambiarPiñon(1);
        b3.CambiarPlato(1);
        b3.acelerar();
        b3.frenar();
        ((BicicletaTandem)b3).setNumAsiento(2);
        
// Arrays 


Bicibleta bicicletas[] = new Bicibleta[3];

bicicletas[0]=b1;
bicicletas[1]=b2;
bicicletas[2]=b3;


        for (Bicibleta b :bicicletas  ) {
            System.out.println(b.toString());
            
        }
        
        
        
        
        
    }
    
}
