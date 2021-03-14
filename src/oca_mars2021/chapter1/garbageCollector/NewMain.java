/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter1.garbageCollector;

/**
 *
 * @author amine
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture v0 = new Voiture();
        Voiture v1 = new Voiture();
        //System.out.println("v1 = " + v1);
        //System.out.println("v1 = " + v1.toString());
        v0 = null;
        Voiture v2 = new Voiture();
       // System.out.println("v2 = " + v2);
        v1 = v2;  // suite à cette instrcution == on a perdu l'objet pointé par v1
        System.gc(); 
        for(int i = 0; i<100000;i++)
        {
            System.out.println("i = "+i);
        }
        // appel explicite au garbage collector
        System.out.println("Suite du programme");
        Voiture v3;
        v3 = v2;
       // System.out.println("v3 = " + v3);
        v1 = v2;
    }

}
