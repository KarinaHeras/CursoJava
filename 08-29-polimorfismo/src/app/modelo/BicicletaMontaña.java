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
public class BicicletaMontaña extends Bicibleta {
    
    private int suspension;
    
    public  void cambiarSuspension(int suspension){
        this.suspension = suspension;
    }
// Constructores 

    public BicicletaMontaña() {
    }

    public BicicletaMontaña(int suspension, int velocidad, int platoActual, int piñonActual) {
        super(velocidad, platoActual, piñonActual);
        this.suspension = suspension;
    }
//Getter y setter 
    
    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

 //tostring

    @Override
    public String toString() {
        return "BicicletaMonta\u00f1a{" + "suspension=" + suspension + '}';
    }
    

    
    
}
