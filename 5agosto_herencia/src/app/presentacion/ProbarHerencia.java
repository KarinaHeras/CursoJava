/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.Gerente;
import app.modelo.Persona;
import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.N;

/**
 *
 * @author Tarde.A3
 */
public class ProbarHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // instanciar la clase persona metodo largo
    
    Persona Pedro = new Persona();
    
    Pedro.setNombre("Pedro Ruiz");
    Pedro.setDni("123456T");
    Pedro.setDireccion("calle real 20");
        System.out.println("Datos de Pedro "+ Pedro.toString());
     
            
    //istanciar otra persona con el metodo corto
            
   Persona Arturo = new Persona("Arturo Perez", "78945644K", "Calle Real 12");
    System.out.println(" Datos de Arturo " + Arturo.toString());
    
 
    
    Gerente g1 = new Gerente();
     g1.setNombre("Raul Rosas");// este es de Persona
     g1.setDni("1245677Y");// Es de Persona
     g1.setDireccion("PLaza España 32");
     g1.setDepartamento("Informatica");//Es de Gerente
     g1.setBono(45_000);//Es de Gerente
     
        System.out.println(g1.toString());
        
        
 // instanciamos un gerente de forma corta usando el constructor completo
 
 Gerente g2 = new Gerente("Sistemas", 41_000, "Daniel Bravo ", "45617894H", "Chopera 45");
        System.out.println(g2.toString());
    }
    
}
   