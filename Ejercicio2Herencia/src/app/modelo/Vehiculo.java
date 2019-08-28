/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modelo;

/**
 *
 * @author ProfesoraTarde
 */
public class Vehiculo {
    private String tipoMotor;
    private String color;
    private short numeroPersonas;
    private short asientos;
    private String equipoSeguridad;
    
    //Constructores

    public Vehiculo() {
    }

    

    public Vehiculo(String tipoMotor, String color, short numeroPersonas, short asientos) {
        this.tipoMotor = tipoMotor;
        this.color = color;
        this.numeroPersonas = numeroPersonas;
        this.asientos = asientos;
    }
    
    //Métodos
    public String mostrarSeguridad(){
        return equipoSeguridad;
    }
    
    public short calcularOcupacion(){
        return (short) (asientos - numeroPersonas);
    }
      
    //Setters y Getters

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

    public short getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(short numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public short getAsientos() {
        return asientos;
    }

    public void setAsientos(short asientos) {
        this.asientos = asientos;
    }

    public String getEquipoSeguridad() {
        return equipoSeguridad;
    }

    public void setEquipoSeguridad(String equipoSeguridad) {
        this.equipoSeguridad = equipoSeguridad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tipoMotor=" + tipoMotor + ", color=" + color + ", numeroPersonas=" + numeroPersonas + ", asientos=" + asientos + ", equipoSeguridad=" + equipoSeguridad + '}';
    }
    
    
    
    
}
