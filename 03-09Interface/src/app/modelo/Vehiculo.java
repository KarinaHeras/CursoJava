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
public class Vehiculo {
    private String tipoMotor;
     private String color;

    public Vehiculo() {
    }

    public Vehiculo(String tipoMotor, String color) {
        this.tipoMotor = tipoMotor;
        this.color = color;
    }

   
    //Getter y Setter 

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
   //Tostring

    @Override
    public String toString() {
        return "Vehiculo{" + "tipoMotor=" + tipoMotor + ", color=" + color + '}';
    }
    
    
}
