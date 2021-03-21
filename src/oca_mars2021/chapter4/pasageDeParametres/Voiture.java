/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.pasageDeParametres;

/**
 *
 * @author amine
 */
public class Voiture {

    static int val = 10;
    
    public Voiture() {
        System.out.println("Constructeur par défaut...");
    }

    public Voiture(int an) {
        this();
        System.out.println("Constructeur avec 1 paramètre...");
    }

    public Voiture(int an, String prop) {
        this(an);
        System.out.println("Constructeur avec 2 paramètre...");
    }
    
     public static void main(String[] args) {
        System.out.println("TEST");
        
        Voiture v = new Voiture(2020);
    }
     
     static{
        val++; System.out.println("val = "+val);
    }
}
