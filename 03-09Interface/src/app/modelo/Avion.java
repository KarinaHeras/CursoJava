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
public class Avion extends Vehiculo implements IObjetoVolador{

    public Avion() {
    }

    public Avion(String tipoMotor, String color) {
        super(tipoMotor, color);
    }

    @Override
    public String despegar() {
        return "El avión está despegando...";
    }

    @Override
    public String volar() {
        return"El avión está volando...";
    }

    @Override
    public String aterrizar() {
        return "El avión está aterrizando...";
    }
    
    
}
