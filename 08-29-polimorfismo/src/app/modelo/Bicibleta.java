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
public class Bicibleta {
    private int velocidad;
    private int platoActual;
    private int piñonActual;
    
    
    public String acelerar(){
        return "Acelerando..";
    }
   public String frenar (){
       return "Estoy frenado...";
   } 
   
   public void CambiarPlato(int plato){
       platoActual = plato;
       
   }
   
   public void  CambiarPiñon( int piñon){
       piñonActual = piñon;
       
   }
// constructores
    public Bicibleta() {
    }

    public Bicibleta(int velocidad, int platoActual, int piñonActual) {
        this.velocidad = velocidad;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }

   
    
 // toString

    @Override
    public String toString() {
        return "Bicibleta{" + "velocidad=" + velocidad + ", platoActual=" + platoActual + ", pi\u00f1onActual=" + piñonActual + '}';
    }
//Seter y Getter 
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }
   
}
