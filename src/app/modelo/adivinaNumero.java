/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modelo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tarde.A3
 */
public class adivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int numero = Integer.MIN_VALUE;
        int adivinar = 0;
        Scanner s1 = new Scanner (System.in);
  // adivinar = s1.nextInt()
  //adivina = Match.foor(Math.random()*100+1);
  Random r1 = new Random();
  //adivinar = r1.nextInt(100);
     
       while (adivinar != numero) {
            System.out.println("Escriba el numero ");
            numero = s1.nextInt();
        if (numero > adivinar){
            System.out.println("El numero es mayor al que desea adivinar ");
        if(numero < adivinar){
            System.out.println("El numero es menor al que desea adivinar ");
        }
            
        }else{
            //entra aqui cuando es igual
            System.out.println("Ha acertado, en horabuena!!");
            
            break;
        }
            
        }
        
    }
}
