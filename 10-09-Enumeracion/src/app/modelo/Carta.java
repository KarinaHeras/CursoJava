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
public class Carta {
 
    //Atributo 
    private Palo p1;
    private Numeros n1;
    boolean dada;
 //Constructores 

    public Carta() {
    }

    public Carta(Palo p1, Numeros n1) {
        this.p1 = p1;
        this.n1 = n1;
    }
  
    //Metodos 
    public type type();
    
//Getter y Setter 

    public Palo getP1() {
        return p1;
    }

    public void setP1(Palo p1) {
        this.p1 = p1;
    }

    public Numeros getN1() {
        return n1;
    }

    public void setN1(Numeros n1) {
        this.n1 = n1;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Carta{" + "p1=" + p1 + ", n1=" + n1 + '}';
    }
//Equals y Hast code 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.p1);
        hash = 71 * hash + Objects.hashCode(this.n1);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.p1 != other.p1) {
            return false;
        }
        if (this.n1 != other.n1) {
            return false;
        }
        return true;
    }

    
   
    
}
