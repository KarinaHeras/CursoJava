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
public class Circulo {

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @param args the command line arguments
     */
    
    // 1) crea una clase figura encapsulada con las propiedades coordenadaX y cordenadaY
 //2) (ambas tipo entero) y un metodo posicion() que devuelva la posicion de la figura
//3) Crea las clases encapsuladas circulo y Rectangulo heredando de la clase
//4) figura la clase circulo ademas tendra la propiedad radio de tipo double
//5) sobreescribir el metodo posicion() para una de las clases y utiliza el operador
//7)crea la clase TestFiguras donde se crearan obajetivos de las clases, se daran valores 
//8) crea valores de las tres clases, se daran valores y mostramos 
    //la posicion de cada figura. 
 
   public class Circulo extends Figura() {
    
   
        // Atributo
    private double radio;

    public double Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    }

   
   
    
      
    }

   
    }

   