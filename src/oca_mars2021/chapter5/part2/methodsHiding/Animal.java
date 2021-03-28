/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter5.part2.methodsHiding;

/**
 *
 * @author amine
 */
public class Animal {
    public void info()
    {
        System.out.println("Animal");
    }
    
    public void doc()
    {
        System.out.println("Animal " + affichage());
    }
    
    //public static String affichage()
    public  String affichage()
    {
        //System.out.println("Animal");
        return "Animaux";
    }
}
