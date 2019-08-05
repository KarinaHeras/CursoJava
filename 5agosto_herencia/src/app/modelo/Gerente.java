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
public class  Gerente extends Persona{
    
  // Declaramos Atributos
    
    private String departamento;
    private double bono;
    
    // Costructores

    public Gerente(String departamento, double bono, String nombre, String dni, String direccion) {
        super(nombre, dni, direccion);
        this.departamento = departamento;
        this.bono = bono;
    }

    public Gerente() {
    }
    
    //Setter Getters

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return super.toString()+ "Gerente{" + "departamento=" + departamento + ", bono=" + bono + '}';
    }
    
   
    
}
