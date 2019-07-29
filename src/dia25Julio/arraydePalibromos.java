/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia25Julio;

import java.util.Scanner;

/**
 *
 * @author Tarde.A3
 */
public class arraydePalibromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   // escribe una palabra y decir si es palíndromos
   
   String palabra;
   char letras[];
   
   Scanner s1 = new Scanner(System.in);
  
  System.out.println("Escribe la palabra: ");

   palabra = s1.next();
   letras = palabra.toCharArray();
   boolean nombres = true;
   int contador = 0;
   
        
        for (int i = 0; i < letras.length; i++) {
            if (letras[i]!=letras[contador]) {
                System.out.println("No es palidromo");
                nombres = false;
                break;
                
            };
            contador ++;
        }            
        if (nombres) {
            System.out.println("Es palidromo");
        }
    
       
            
        }
        }
   
   
    
    
