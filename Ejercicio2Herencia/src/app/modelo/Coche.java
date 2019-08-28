/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modelo;

/**
 *
 * @author ProfesoraTarde
 */
public class Coche extends Vehiculo{
    //atributos
    private int numeroMarchas;
    private int marchaActual;
    private boolean distintivoEcologico;
    
    //Constructores

    public Coche() {
    }

    public Coche(int numeroMarchas, boolean distintivoEcologico, String tipoMotor, String color, short numeroPersonas, short asientos) {
        super(tipoMotor, color, numeroPersonas, asientos);
        this.numeroMarchas = numeroMarchas;
        this.distintivoEcologico = distintivoEcologico;
    }
    
    //Metodos
    //Aparcar
    public String aparcar(){
        return "Se está aparcando el coche ...";
    }
    //Cambiar marcha;
    public void cambiarMarcha(int marcha) {
        marchaActual = marcha;    
    }
    
    //Getters y Setters

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isDistintivoEcologico() {
        return distintivoEcologico;
    }

    public void setDistintivoEcologico(boolean distintivoEcologico) {
        this.distintivoEcologico = distintivoEcologico;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    @Override
    public String toString() {
        return super.toString() + "Coche{" + "numeroMarchas=" + numeroMarchas + ", marchaActual=" + marchaActual + ", distintivoEcologico=" + distintivoEcologico + '}';
    }

   
    
    
    
    
    
    
    
    
}
