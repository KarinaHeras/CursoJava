/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.presentacion;

/**
 *
 * @author Tarde.A3
 */
public class Api {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    // Mostrar cadena de caracteres 
    
    String s1 = "Bienvenidos al curso de Java";
        System.out.println("Mostrar la cadena en mayusculas ----  "+s1.toUpperCase());
        System.out.println("Mostrar la cadena en minusculas ---  "+s1.toLowerCase());
        System.out.println("Mostrar solo la palabra Bienvenidos:  "+s1.substring(s1.indexOf("B"),s1.indexOf("s")+1));
        System.out.println("Mostrar solo la palabra Java ---"+s1.substring(24));
        System.out.println("Mostrar la palabra Curso --- "+s1.substring(s1.indexOf("curso"),s1.indexOf("curso")+"curso".length()));
        System.out.println("Mostrar la posicion de la letra C --- "+s1.indexOf("c"));
        System.out.println("Devolver la longitud se cadena --- "+s1.length());
        System.out.println("Modificar las e minusculas por E mayusculas----"+s1.replace("e", "E"));
        System.out.println("Concadenar la frase anterior "+s1.concat("con fecha 14 de Septiembre "));
        
     
    }
    
}
