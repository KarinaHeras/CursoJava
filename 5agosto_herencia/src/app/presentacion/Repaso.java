/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import java.util.Arrays;

/**
 *
 * @author Tarde.A3
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   // SE NECESITA  GUARDAR EL NOMBRE DEL PRODUCTO Y EL PRECIO DE VENTA 
   //QUE VARIBLES HAY QUE UTILIZAR? DECLARAR Y ASIGNARLES UN VALOR
   
   String nombreProducto ;
float precioProducto;
nombreProducto = "Teclado Blanco";
precioProducto = 12.5f;
        
        System.out.println("El nombre del producto es "+ nombreProducto);
        System.out.println("El precio es : "+ precioProducto);
     
        
   // 1)declarar un Array de 10 posiciones para guardar 10 numeros enteros
   // 2)a cada posicion asignar un valor aleatorio
   // 3)Buscar el numero mas grande del array
   
   int numero [] = new int[10]; // Asi declaramos una array
 
   // Realizamos un bucle
   
        for (int i = 0; i < numero.length; i++) {
           numero[i] = (int)(Math.random())*101;
     // con esta forma accedemos al elemento del Array / NombreArray [posicion]
        }
        System.out.println("Contenido del array "+ Arrays.toString(numero));
        int mayor = Integer.MIN_VALUE;
        // variable para guardar el numero mayor
         for (int i = 0; i < numero.length; i++) {
             if (numero[i]>mayor) {
                 mayor = numero[i];
             }
 
        }
      
        System.out.println("EL numero mayor es   "+ mayor);
}
  }