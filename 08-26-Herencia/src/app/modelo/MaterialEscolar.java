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
public class MaterialEscolar extends Producto {
   
 private String curso;
 private String asignatura;

    public MaterialEscolar() {
       
    }

 
    public MaterialEscolar(String curso, String asignatura, String nombre, float precio, int cantidad, String tipo) {
        super(nombre, precio, cantidad, tipo);
        this.curso = curso;
        this.asignatura = asignatura;
    }
 //Getter y Setter

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
 
  // To String

    @Override
    public String toString() {
        return super.toString()+"MaterialEscolar{" + "curso=" + curso + ", asignatura=" + asignatura + '}';
    }

    @Override
    public float precioOferta(float descuento) {
        System.out.println("Usted tiene una tarjeta de puntos");
        return super.precioOferta(descuento); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
