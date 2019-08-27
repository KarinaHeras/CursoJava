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
public class Ropa extends Caracteristicas{
    private String talla;
    
// Constructores

    public Ropa() {
        
    }

    public Ropa(String talla, String color, String Composicion, String nombre, float precio, int cantidad, String tipo) {
        super(color, Composicion, nombre, precio, cantidad, tipo);
        this.talla = talla;
    }
    
  // Setter y Getter

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
 //To String 

    @Override
    public String toString() {
        return super.toString() + "Ropa{" + "talla=" + talla + '}';
    }
    
 
    
}
