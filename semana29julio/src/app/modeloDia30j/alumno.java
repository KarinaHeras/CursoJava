/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modeloDia30j;

/**
 *
 * @author Tarde.A3
 */
public class alumno {
 // Atributo 
  private  String nombre;
  private double parciales[];
  
// Constructor
    public alumno(String nombre, int numeroNota) {
        this.nombre = nombre;
 // instanciamos el array para conocer el numero de nota
     this.parciales = new double[numeroNota];
    }
 //Metodo y  poner en cada celda la nota  
     public void calificaciones (int posicion, int nota){
         parciales[posicion] = nota; //se guarda la nota en el parcial que entra como posicion  

     }
 // sacamos la media 
   public double media (){
     double suma = 0;
        
     for (int i = 0; i < parciales.length; i++) {
             suma += parciales[i];
             
         }
         return suma/parciales.length;         
   }

//Mostramos la nota 

   public String mostrar(){
    
  String resultado = 0;    
    for (int i = 0; i < parciales.length(); i++) {
        resultado+= "Parcial " i+  "-> + parciales"[i] + "\n"; 
        
    }
 
   return resultado; 
}

}
