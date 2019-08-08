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
public class Vendedor extends Persona{
double ventas;
float comision;

// constructores

    public Vendedor() {
    }

    public Vendedor(double ventas, float comision, String nombre, String dni, String direccion) {
        super(nombre, dni, direccion);
        this.ventas = ventas;
        this.comision = comision;
    }


    
}
