/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinfo1;

/**
 *
 * @author gabriel.ricaldone
 */
public class Rettangolo {
    private int base;
    private int altezza;
    
    Rettangolo(int base, int altezza) { //Costruttore
        
        if (base < 0) {
            base = base*-1;
        }
        this.base = base; //Assegno a base dell'oggetto
        
        if (altezza < 0) {
            altezza = altezza*-1;
        }
        this.altezza = altezza; //Assegno altezza dell'oggetto
    }
    
    public int getBase() { //Ottieni la base
        return base;
    }
    public int getAltezza() {
        return altezza;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
    
    public int calcolaPerimetro() {
        return (base + altezza) * 2;
    }
    public int calcolaArea() {
        return base * altezza;
    }
    public double calcolaDiagonale() {
        return Math.sqrt(base*base + altezza*altezza);
    }
}