/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

import app.modelo.Avion;
import app.modelo.Barco;
import app.modelo.Coche;
import app.modelo.Tren;
import app.modelo.Vehiculo;

/**
 *
 * @author ProfesoraTarde
 */
public class ProbarVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Instanciar Vehiculo
    
        Vehiculo v1 = new Vehiculo("Diesel", "Blanco",(short)1,(short)5);
        System.out.println(v1.toString());
        
        //Instanciar coche
       
        Coche c1 = new Coche(5, true, "Hibrido", "gris", (short) 2,(short) 5);
        System.out.println(c1.aparcar());
        c1.cambiarMarcha(1);
        System.out.println( c1.toString());
        System.out.println("Ocupación --> "+c1.calcularOcupacion());

// Instanciar barco    
    Barco b1 = new Barco(100, 2, "Vapor", ,(short)180,(short)200);
     b1.VelocidadCrucero(4);
     System.out.println(b1.toString());
        System.out.println(b1.atracar());
b1.setEquipoSeguridad("Salvavidas,botes");
        System.out.println(b1.toString());
    // instanciar el avion

    Avion a1 = new Avion("Primera", 1, "Helice", "gris", (short)350, (Short)500);
       a1.setEquipoSeguridad("Chaleco Salvavidas","Mascara de Oxigeno")
    System.out.println(a1);
        System.out.println(a1.aterrizar());
        System.out.println(a1.despegar());
        System.out.println(a1.calcularOcupacion());
        System.out.println(a1.mostrarSeguridad());
   
        
//Instanciar Tren

Tren t1 = new Tren((byte)4, "Eléctrico", "Blanco", (short)340, (short)350);
   t1.setEquipoSeguridad("Extentor, Martillo")
System.out.println("Ocupacion "+t1.calcularOcupacion());
        System.out.println(t1);
    }
    
}
