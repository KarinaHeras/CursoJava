/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.Caracteristicas;
import app.modelo.MaterialEscolar;
import app.modelo.Producto;

/**
 *
 * @author Tarde.A3
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar Producto
        
    Producto p1 = new Producto("Prueba", 2f, 100, "Libros");
        System.out.println(p1.toString());
        System.out.println("Precio Oferta:  " + p1.precioOferta(0.1f));
   // Material Escolar 
        MaterialEscolar me1 = new MaterialEscolar("ESO", "Matematicas 1ESO", "Matematicas",25, 15,"Libros");
        System.out.println(me1);
        System.out.println("Precio oferta: " +me1.precioOferta(0.1f));
   
//Caracteristicas
   
        Caracteristicas c1 = new Caracteristicas("Azul", "Algodon", "Pantalon",20 ,15,"Ropa");
        
        System.out.println(c1);
        System.out.println("Precio oferta: "+ c1.precioOferta(0.1f));
            
            
            
            
            
   
    
}
