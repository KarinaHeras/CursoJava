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
public class Kriptoniano extends Animal {
    
    private String rango;
    
  //Constructores

    public Kriptoniano() {
    }

    public Kriptoniano(String rango, String nombre) {
        super(nombre);
        this.rango = rango;
    }
    
   //Setter y Getter

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
 //ToString

    @Override
    public String toString() {
        return super.toString()+"Kriptoniano{" + "rango=" + rango + '}';
    }
    
    
}
