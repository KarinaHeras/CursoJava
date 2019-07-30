/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modeloDia30j;

/**
 *
 * @author Tarde.A3
 */
public class multiplicarConstructor {
// imprimir por pantalla las tablas de multiplicar. Debe contar con un constructor
//que indica la tabla que se va amostrar debe contar con un metodo que de resultado
 //de un estring para mostrar 10 tablas del numero dado
 //-----------------------------------------------------------------------------  

//declaramos Atribuos 
    int numero;
    int tabla;
// metodo
    public multiplicar(int numero, int tabla) {
        this.numero = numero;
        this.tabla = tabla;
    }

// Declarmos Variable metodo   
public String tabla(){
    String resultado = "";
    
    for (int i = 0; i < 10; i++) {
       resultado + = i " * " + numero "= "+ (i *numero)+ "\n";
        
    }
 return resultado;
}
}

