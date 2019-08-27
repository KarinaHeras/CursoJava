/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.Caracteristicas;
import app.modelo.MaterialEscolar;
import app.modelo.Muebles;
import app.modelo.Producto;
import app.modelo.Ropa;

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
            
//Ropa

        Ropa r1 = new Ropa(40, "Azul", "Licra", "blusa", 9.5f, 2, "ropa");
        System.out.println(r1.toString());

//Muebles

     Muebles m1 = new Muebles(100f, 50f, 90f, "blanco","Aglomerado", "escritorio", 45, ¡1, "mueble");
      System.out.println(m1);
   
    
}
