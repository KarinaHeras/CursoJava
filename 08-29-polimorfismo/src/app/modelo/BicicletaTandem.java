/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modelo;

/**
 *
 * @author Tarde.A3
 */
public class BicicletaTandem extends Bicibleta {
    
    private int numAsiento;

    
//Constructores
    
    
    public BicicletaTandem() {
    }

    public BicicletaTandem(int numAsiento, int velocidad, int platoActual, int piñonActual) {
        super(velocidad, platoActual, piñonActual);
        this.numAsiento = numAsiento;
    }

// Getter setter 

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
   //tostring

    @Override
    public String toString() {
        return "BicicletaTandem{" + "numAsiento=" + numAsiento + '}';
    }
    
    
    
    
    
    
}
