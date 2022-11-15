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
public class EsInfo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(-5,8);
        
        System.out.println("Base: " + r1.getBase() + " Altezza: " + r1.getAltezza());
        System.out.println("Perimetro: " + r1.calcolaPerimetro() + " Area: " + r1.calcolaArea());
        System.out.println("Diagonale: " + r1.calcolaDiagonale());
        r1.setAltezza(20);
        r1.setBase(10);
        System.out.println("Base: " + r1.getBase() + " Altezza: " + r1.getAltezza());
        System.out.println("Perimetro: " + r1.calcolaPerimetro() + " Area: " + r1.calcolaArea());
        System.out.println("Diagonale: " + r1.calcolaDiagonale());
    }
    
}