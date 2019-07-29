/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.cuentaBancaria;
import app.modelo.cuentaBancariaEncapsulada;

/**
 *
 * @author Tarde.A3
 */
public class probar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // asignar valores a los atributos
        cuentaBancaria micuentaBancaria = new cuentaBancaria();
        micuentaBancaria.numero = "12345678912345678931";
        micuentaBancaria.Titular = "Pedro LOpez";
        micuentaBancaria.saldo = 5_000;
       
        System.out.println("Estado de los Objetos");
        System.out.println("Numero: "+ micuentaBancaria.numero);
        System.out.println("Titular: " + micuentaBancaria.Titular);
        System.out.println("Saldo: "+ micuentaBancaria.saldo);
        
cuentaBancariaEncapsulada c1 = new cuentaBancariaEncapsulada() ;      
        c1.setNumero("09786451234455");
        c1.setSaldo(-100);
        c1.setTitular("Karina Heras")
        System.out.println("Estado de encapsulacion");
        System.out.println("Numero: "+ c1.getNumero());
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Titular: "+ c1.getTitular());
        
    }
    
}
