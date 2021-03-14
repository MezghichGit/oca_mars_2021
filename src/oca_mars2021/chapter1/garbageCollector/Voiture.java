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
public class Voiture {
   String pays;
   String immat;
//
//    @Override
//    public String toString() {
//        return "Voiture{" + "pays=" + pays + ", immat=" + immat + ", nbr=" + nbr + '}';
//    }
   int nbr;
   
   protected void finalize()
   {
       System.out.println("Destruction de l'objet");
   }
}
