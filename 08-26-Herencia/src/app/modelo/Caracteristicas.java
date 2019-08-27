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
public class Caracteristicas extends Producto {

//Atributos
protected String color;
protected String  Composicion;

    public Caracteristicas(String color, String Composicion, String nombre, float precio, int cantidad, String tipo) {
        super(nombre, precio, cantidad, tipo);
        this.color = color;
        this.Composicion = Composicion;
    }

//Getter y Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComposicion() {
        return Composicion;
    }

    public void setComposicion(String Composicion) {
        this.Composicion = Composicion;
    }
    
 //To String

    @Override
    public String toString() {
        return super.toString()+ "Caracteristicas{" + "color=" + color + ", Composicion=" + Composicion + '}';
    }
    
    

}
