/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_mars2021.chapter4.lambdaExpression;

/**
 *
 * @author amine
 */
@FunctionalInterface
public interface Vehicule {

    public abstract boolean test(String ch);  // méthode abstraite

    default public void info() {
    }

    static public void affichage() {
    }
}
