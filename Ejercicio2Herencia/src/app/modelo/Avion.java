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
public class Avion extends Vehiculo {
  private String clase;
  private int numeroParacaidas;

 //Constructor
    public Avion() {
    }

    public Avion(String clase, int numeroParacaidas, String tipoMotor, String color, short numeroPersonas, short asientos) {
        super(tipoMotor, color, numeroPersonas, asientos);
        this.clase = clase;
        this.numeroParacaidas = numeroParacaidas;
    }
    
 //Metodos
  public String aterrizar(){
      return "Estamos aterrizando...";
      
  }
  
  public String despegar(){
      return "Estamos despegando";
  }
//Getter y Setter

    @Override
    public String mostrarSeguridad() {
        return super.mostrarSeguridad()+ "Numero de Paracaidas " + numeroParacaidas; //To change body of generated methods, choose Tools | Templates.
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    

    public void setNumeroParacaidas(int numeroParacaidas) {
        this.numeroParacaidas = numeroParacaidas;
    }
    
//To String

    @Override
    public String toString() {
        return super.toString() + "Avion{" + "clase=" + clase + ", numeroParacaidas=" + numeroParacaidas + '}';
    }
 

}
