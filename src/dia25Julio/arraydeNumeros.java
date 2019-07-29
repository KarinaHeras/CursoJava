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
public class arraydeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir dos array de numeros y de 5 elementos. copiar (fusionar)
      //  los dos array y en una tercera , de forma que  siga ordenados
      
      int a1[]= {1,2,5,10,20};
      int a2[]={2,3,7,8};
      int a3[]= new int [a1.length + a2.length];
     int aux = 0;
        for (int i = 0; i < a3.length-1; i++) {
         
        for (int j = 0; j < a3.length-j-1; j++) {
            if (a3[j+1]< a3[j]) {
                aux = a3[j+1];
                a3[j+1] = a3[j];
                a3[j]=aux;
                System.out.print(a3);
            }}
        }
    }
    
}
