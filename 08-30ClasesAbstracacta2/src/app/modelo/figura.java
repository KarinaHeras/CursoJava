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
public abstract class figura {
    
    private int X;
    private int y;
 
    
    // COnstructores 

    public figura() {
    }

    public figura(int X, int y) {
        this.X = X;
        this.y = y;
    }
    
 //Metodos
    
    public abstract double calcularArea();

   //Getter Setter 
    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
//Tostring

    @Override
    public String toString() {
        return "figura{" + "X=" + X + ", y=" + y + '}';
    }
    
    
 
    
}
