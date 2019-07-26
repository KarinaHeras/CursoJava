/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia25Julio;

/**
 *
 * @author Tarde.A3
 */
public class recorrerArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    // DECLARACION VARIABLES 
    
    int numeros[] = {1,2,3,4,5,6,7};
    
    //MOSTRARLOS CON UN BUCLE FOR 
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]+ ", ");
        }
        System.out.println("Recorremos el foreach");
    //MOSTRAR INFORMACION CON UN BUCLE FOR EACH
    
        for (int numero : numeros) {
            System.out.println(numero + ", ");
            
        }
        
    // ARAY DE NOMBRES 
    
    String nombres [] = {"Juan","Miguel","Mario", "Roberto"};
        System.out.println("Mostrar contenido bucle for");
        for (int i = 0; i < nombres.length; i++) {
               System.out.print(nombres[i]+ ", ");   
   
        }
        System.out.println("Mostrar For each"); 
        for (String nombre : nombres) {
            System.out.print(nombres + ", ");
            
        }
      
      char letras[] ={'a','b','c','d'};
        System.out.println("bucle for");
        
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]+ ", ");    
            
        }
        
        System.out.println("----------------------");
        System.out.println("Bucle for each");
        for (char letra : letras) {
            System.out.print(letra + ", ");
            
        }
       
        
        
        
    }
    
    
}
