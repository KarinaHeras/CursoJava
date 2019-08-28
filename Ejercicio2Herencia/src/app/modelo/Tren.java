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
public class Tren extends Vehiculo {
    private byte vagones;
    
//Constructores

    public Tren() {
    }

    public Tren(byte vagones, String tipoMotor, String color, short numeroPersonas, short asientos) {
        super(tipoMotor, color, numeroPersonas, asientos);
        this.vagones = vagones;
    }
    
//Metodos 
 
   public String cambiarVias(){
       return "Cambiando de via ...";
       
   }
 public String FrenarEmergencia(){
     return "Frenando de emergencia";
     
 }   
 
//Getter y Setter 

    public byte getVagones() {
        return vagones;
    }

    public void setVagones(byte vagones) {
        this.vagones = vagones;
    }
 
//ToString

    @Override
    public String toString() {
        return super.toString()+"Tren{" + "vagones=" + vagones + '}';
    }
 
    
 
 
}
