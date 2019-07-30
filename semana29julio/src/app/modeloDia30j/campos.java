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
public class campos {
 // realiza una clase llamada Campos con dos metodos y el otro incrementa .
    //El metodod muestra es una funcion que da como resultado el valor de x 
    //el metodo incrementa   el valor X, el constructor es el valor
    //inicial al campo X, crea ha a instancia en el modula principal 
    //de la apricacion, incrementar y mostrar el resultado
    
    
 // Atributos 
 int x;
 
//constructor
    public campos(int x) {
        this.x = x;
    }
 // Método
 public int muestra(){
     return x;
     

 }  
 
  public void incrementa(){
    x++;
 }

}