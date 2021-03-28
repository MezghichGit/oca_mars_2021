/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter5.part2;

import java.io.Serializable;

/**
 *
 * @author amine
 */
@FunctionalInterface
public interface Vehicule {
   abstract  void info();
   //abstract  void info2();
   public static final int annee=10;
   
    int age=10;
    
    default public void affichage(){} // méthode concrete
    
    static public void test(){} // méthode concrete*/
}
