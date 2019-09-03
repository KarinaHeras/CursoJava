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
public class Animal {
    //Atributo 
    private String nombre;
   
 //COnstructores 

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }
 //Metodo
    
    public String  comer(){
        return " esta comiendo";
        
    }
    
    //Setter y Getter 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //TOstring 

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + '}';
    }
    
    
}
