/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter5.part2;

/**
 *
 * @author amine
 */
public abstract class Animal {
    private int age;
    String espece;

    public void manger() {
        System.out.println("Je mange");
    }

    public void dormir() {
        System.out.println("Je dors");
    }

    public abstract void sedeplacer();
    /*public void sedeplacer() {
        System.out.println("saute");
    }*/
    
    
}
