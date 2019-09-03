/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.Animal;
import app.modelo.Avion;
import app.modelo.IObjetoVolador;
import app.modelo.Kriptoniano;
import app.modelo.Superman;

/**
 *
 * @author Tarde.A3
 */
public class ProbarInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Instanciamos Avion   
        IObjetoVolador iov1 = new Avion(" Gasolina ", " Gris ");
        System.out.println(iov1.despegar());
        System.out.println(iov1.volar());
        System.out.println(iov1.aterrizar());
        System.out.println(iov1.toString());
        
        
   //Instanciar Animal
   
        Animal a1 = new Animal( "Nikita" );
        System.out.println(a1.comer());
        System.out.println(a1.toString());
        
        
 //Instanciamos Kriptoniano
 
        Animal k1 = new Kriptoniano("General","R23" );
        System.out.println(k1.toString());
        System.out.println(k1.comer());
        
        
   //Instanciamos Superman
   
   IObjetoVolador iov2 = new Superman("Bebe", "Superman");
        System.out.println(iov2.despegar());
        System.out.println(iov2.aterrizar());
        System.out.println(iov2.volar());
        System.out.println(((Superman)iov2).comer());
        System.out.println(((Superman)iov2).deterBala());
        System.out.println(((Superman)iov2).saltarEdificio());
        System.out.println(((Kriptoniano)iov2).toString());
     }
  //Instanciamos Ave
    
    
}
