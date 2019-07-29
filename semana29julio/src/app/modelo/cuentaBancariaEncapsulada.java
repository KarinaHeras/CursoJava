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
public class cuentaBancariaEncapsulada {
    
   //atrivibutos
    private String numero;
     private String Titular;
     private double saldo;
     
     // los setter son para dar vslor a los atributos
     public void setNumero(String numero){
         if (numero.length()==10) {
                      this.numero = numero;

         } else {
             System.out.println("Numero de cuenta incorrecto");
         }
     }
         
      // los getter son para mostrar los valores    
     public String getNumero(){
         return numero;
     }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
        this.saldo = saldo;

        } else {
            System.out.println("Cliente no deseado");
        }
    }
     }

