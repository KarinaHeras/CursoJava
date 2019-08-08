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
public class Empleado extends Persona {
    //atributos
    private double sueldo;

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(double sueldo, String nombre, String dni, String direccion) {
        super(nombre, dni, direccion);
        this.sueldo = sueldo;
    }
    
    // setters y Getters

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
  
    
}
