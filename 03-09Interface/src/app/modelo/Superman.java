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
public class Superman extends Kriptoniano implements IObjetoVolador {

    @Override
    public String despegar() {
        return "Superman esta despegando";
    }

    @Override
    public String volar() {
        return "Superman esta volando";
    }

    @Override
    public String aterrizar() {
        return "Superman esta aterrizando";
    }

    @Override
    public String comer() {
        return "Superman "+super.comer(); //To change body of generated methods, choose Tools | Templates.
    }
  //Metodos
    
   public String saltarEdificio(){
    return "Superman Salta....";
   } 
    public String deterBala(){
        return "Superman esta deteniendo una bala";
    }
    
  //Constructores

    public Superman() {
    }

    public Superman(String rango, String nombre) {
        super(rango, nombre);
    }
    
    
}
