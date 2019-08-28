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
public class Barco extends Vehiculo {
    //atributos
    private int camarotes;
    private int plantas;
    private double velocidad;
    
    //Constructores

    public Barco() {
    }

    public Barco(int camarotes, int plantas, double velocidad, String tipoMotor, String color, short numeroPersonas, short asientos) {
        super(tipoMotor, color, numeroPersonas, asientos);
        this.camarotes = camarotes;
        this.plantas = plantas;
       
    }

    
    
    //Metodos
    public String atracar(){
        return "El barco esta atracando ...";
    }
    
    public void VelocidadCrucero(double velocidad){
        this.velocidad = velocidad;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Barco{" + "camarotes=" + camarotes + ", plantas=" + plantas + ", velocidad=" + velocidad + '}';
    }

    
    
    
    
    
    
}
