/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter3.api3Collections;

/**
 *
 * @author amine
 */
public class Voiture implements Vehicule{

    @Override
    public void demarrer() {
        System.out.println("Une voiture qui démarre!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void arreter() {
        System.out.println("Une voiture qui sarrete!");//To change body of generated methods, choose Tools | Templates.
    }
    
}
