/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Modelo2;

/**
 *
 * @author Tarde.A3
 */

public class claseEncapsulada {
private int hora;
private int minuto;
        
    /**
     * @param args the command line arguments
     */
    
           
  // metodos para acceder a los atributos 
        // metodos getters son los que leen los valores de los atributos
        // metoco setter son los que escriben los valores en los atributos
        
        
     public void setHora(int hora){
           if(hora>=0 && hora <= 23) {
          this.hora = hora; 
        }else{
               System.out.println("Hora Invalida");
           }
     } 
       public int getHora() {
           return hora;
       }
    public void setMinuto(int minuto){
        if (minuto >=0 && minuto <=59) {
             this.minuto = minuto;

        }else{
            System.out.println(" No es Valido los minutos");
        }
        
        
    
}
    public int getMinuto(){
        return minuto;
    }
}