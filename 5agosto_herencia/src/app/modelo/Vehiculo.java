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
 
// atributos 
    
   String color;
   double NumeroAsiento;
   String tipoMotor;

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", NumeroAsiento=" + NumeroAsiento + ", tipoMotor=" + tipoMotor + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getNumeroAsiento() {
        return NumeroAsiento;
    }

    public void setNumeroAsiento(double NumeroAsiento) {
        this.NumeroAsiento = NumeroAsiento;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Vehiculo(String color, double NumeroAsiento, String tipoMotor) {
        this.color = color;
        this.NumeroAsiento = NumeroAsiento;
        this.tipoMotor = tipoMotor;
    }
   
}
public double calcularOcupacion(seguridad,numerodePersonas){

}