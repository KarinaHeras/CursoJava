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
public class Muebles extends Caracteristicas {
    private float ancho;
    private float fondo;
    private float alto;
    
// Constructores

  public Muebles() {
    }

    public Muebles(float ancho, float fondo, float alto, String color, String Composicion, String nombre, float precio, int cantidad, String tipo) {
        super(color, Composicion, nombre, precio, cantidad, tipo);
        this.ancho = ancho;
        this.fondo = fondo;
        this.alto = alto;
    }
   
// Getter y Setter

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getFondo() {
        return fondo;
    }

    public void setFondo(float fondo) {
        this.fondo = fondo;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }   
 
    
//To String

    @Override
    public String toString() {
        return super.toString() +"Muebles{" + "ancho=" + ancho + ", fondo=" + fondo + ", alto=" + alto + '}';
    }
    
}
